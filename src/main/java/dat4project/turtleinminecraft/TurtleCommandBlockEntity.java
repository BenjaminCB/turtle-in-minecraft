package dat4project.turtleinminecraft;

import dat4project.turtleinminecraft.TurtleInterpreter.TimcInterpreter;
import dat4project.turtleinminecraft.TurtleInterpreter.RelDirVal.RelDir;
import dat4project.turtleinminecraft.TurtleInterpreter.AbsDirVal.AbsDir;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents.ServerStopping;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.network.MessageType;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.server.MinecraftServer;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class TurtleCommandBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory, ServerStopping {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);
    
    private static int interpretThreadCounter = 1;
    private Thread interpretThread;
    private boolean rsLock;

    private BlockState activeBlockState;
    private BlockState savedBlockState;
    private BlockState turtleState;
    private Direction turtleDirection;
    private BlockPos turtlePos;
    public boolean turtleBreaking;
    public boolean turtlePlacing;
    public int turtleTimeout;

    public TurtleCommandBlockEntity(BlockPos pos, BlockState state) {
        super(Timc.TurtleCommandBlockEntity, pos, state);
        ServerLifecycleEvents.SERVER_STOPPING.register(this);
    }

    @Override public void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);

        // position to nbt
        nbt.putLong("turtlePosition", turtlePos.asLong());

        // direction to nbt
        nbt.putInt("turtleDirection", turtleDirection.getId());

        // timeout to nbt
        nbt.putInt("turtleTimeout", turtleTimeout);

        // blockstates to nbt
        nbt.putInt("turtleState", Block.getRawIdFromState(turtleState));
        nbt.putInt("savedBlockState", Block.getRawIdFromState(savedBlockState));
        nbt.putInt("activeBlockState", Block.getRawIdFromState(activeBlockState));

        // booleans to nbt
        nbt.putBoolean("placing", turtlePlacing);
        nbt.putBoolean("breaking", turtleBreaking);
        nbt.putBoolean("rslock", rsLock);
        
        super.writeNbt(nbt);
    }

    @Override public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);

        // position from nbt
        turtlePos = BlockPos.fromLong(nbt.getLong("turtlePosition"));

        // direction from nbt
        turtleDirection = Direction.byId(nbt.getInt("turtleDirection"));

        // timeout from nbt
        turtleTimeout = nbt.getInt("turtleTimeout");

        // blockstates from nbt
        turtleState = Block.getStateFromRawId(nbt.getInt("turtleState"));
        savedBlockState = Block.getStateFromRawId(nbt.getInt("savedBlockState"));
        activeBlockState = Block.getStateFromRawId(nbt.getInt("activeBlockState"));

        // booleans from nbt
        turtlePlacing = nbt.getBoolean("placing");
        turtleBreaking = nbt.getBoolean("breaking");
        rsLock = nbt.getBoolean("rslock");

        Inventories.readNbt(nbt, inventory);
    }

    @Override public Text getDisplayName() {
        return new LiteralText("Graphics Turtle");
    }

	@Override public ScreenHandler createMenu(int syncId, PlayerInventory inventory, PlayerEntity player) {
		return new TurtleCommandBlockGUI(syncId, inventory, ScreenHandlerContext.create(world, pos));
	}

    @Override public void onServerStopping(MinecraftServer server) {
        stopInterpretThread();
    }

    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    public static void tick(World world, BlockPos pos, BlockState state, TurtleCommandBlockEntity entity) {
        if(!world.isClient) {
            if(world.isReceivingRedstonePower(pos) && !entity.rsLock) {
                entity.world = world;
                entity.initializeTurtle(pos, state);
                entity.startTurtle();
            }
            else if(!world.isReceivingRedstonePower(pos) && entity.rsLock) {
                entity.stopInterpretThread();
                world.setBlockState(entity.turtlePos, entity.savedBlockState);
                entity.rsLock = false;
            }
        }
    }

    private void initializeTurtle(BlockPos pos, BlockState state) {
        turtleDirection = state.get(TurtleCommandBlock.FACING);
        turtlePos = pos.add(turtleDirection.getVector());
        turtleState = Timc.GraphicsTurtleBlock.getDefaultState().with(TurtleCommandBlock.FACING, turtleDirection);
        setActiveBlock(Blocks.AIR);
        turtlePlacing = false;
        turtleBreaking = false;
        turtleTimeout = 500;
    }

    private void startTurtle() {
        rsLock = true;
        savedBlockState = world.getBlockState(turtlePos);
        world.setBlockState(turtlePos, turtleState);

        ItemStack item = getStack(0);
        if(item.isOf(Items.WRITTEN_BOOK) || item.isOf(Items.WRITABLE_BOOK)) {
            String prog = new String();
            NbtList nbtList = item.getNbt().getList("pages", 8);
            for (int i = 0; i < nbtList.size(); ++i) {
                prog = prog.concat(nbtList.getString(i));
            }

            startInterpretThread(new TimcInterpreter(prog, this));
        }
        else {
            print("Insert a book with TIMC code to execute");
        }
    }

    /**
     * Creates, assigns and starts a new Thread with the Runnable {@link TimcInterpreter} task to {@link #interpretThread}
     * @param timcInterpreter Interpreter instance to execute on separate thread
     */
    private void startInterpretThread(TimcInterpreter timcInterpreter) {
        interpretThread = new Thread(timcInterpreter, "TIMC_INTERPRETER_" + interpretThreadCounter++);
        interpretThread.start();
    }

    /**
     * Stops the current {@link #interpretThread} if it exists and is running
     */
    private void stopInterpretThread() {
        try {
            if(interpretThread != null && interpretThread.isAlive()) {
                interpretThread.stop();
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    /**
     * Sets the active block which will be placed by the Turtle if {@link TurtleCommandBlockEntity#turtlePlacing} is {@value true}
     * @param block New active block
     */
    public void setActiveBlock(Block block) { activeBlockState = block.getDefaultState(); }

    /**
     * Gets the active block which will be placed by the Turtle if {@link TurtleCommandBlockEntity#turtlePlacing} is {@value true}
     * @return Current active block
     */
    public Block getActiveBlock() { return activeBlockState.getBlock(); }

    /**
     * Moves the Turtle 1 block distance in the relative direction
     * @param relDir Relative direction to move the turtle
     */
    public void move(RelDir relDir) {
        timeout();

        BlockPos newPos = turtlePos.add(TimcUtil.relDirToMcDir(turtleDirection, relDir).getVector());
        if (turtlePlacing) {
            world.setBlockState(turtlePos, activeBlockState);
        }
        else {
            if (turtleBreaking) {
                world.breakBlock(newPos, true);
            }
            world.setBlockState(turtlePos, savedBlockState);
        }
        savedBlockState = world.getBlockState(newPos);
        turtlePos = newPos;
        world.setBlockState(newPos, turtleState);
    }

    /**
     * Turns the Turtle to the given relative direction. Implementation does nothing for up or down directions
     * @param relDir Relative direction to turn the Turtle to
     */
    public void turn(RelDir relDir) {
        if(relDir != RelDir.UP && relDir != RelDir.DOWN) {
            timeout();
            turtleDirection = TimcUtil.relDirToMcDir(turtleDirection, relDir);
            turtleState = turtleState.with(TurtleCommandBlock.FACING, turtleDirection);
            world.setBlockState(turtlePos, turtleState);
        }
    }

    /**
     * Turns the Turtle to the given absolute direction
     * @param absDir Absolute direction to turn the Turtle to
     */
    public void turn(AbsDir absDir) {
        timeout();
        turtleDirection = TimcUtil.absDirToMcDir(absDir);
        turtleState = turtleState.with(TurtleCommandBlock.FACING, turtleDirection);
        world.setBlockState(turtlePos, turtleState);
    }

    /**
     * Looks at the block in the relative direction of the turtle and returns its type
     * @param relDir Relative direction to look in
     * @return The type of the looked at block
     */
    public Block look(RelDir relDir) {
        Direction dir = TimcUtil.relDirToMcDir(turtleDirection, relDir);
        return world.getBlockState(turtlePos.add(dir.getVector())).getBlock();
    }

    /**
     * Gets the current direction the Turtle is facing
     * @return AbsDir value of the Turtles direction
     */
    public AbsDir facing() {
        return switch(turtleDirection) {
            case EAST   -> AbsDir.EAST;
            case WEST   -> AbsDir.WEST;
            case NORTH  -> AbsDir.NORTH;
            case SOUTH  -> AbsDir.SOUTH;
            default     -> null;
        };
    }

    /**
     * Prints a message in the in-game chat
     * @param s Message to print
     */
    public void print(String s) {
        MinecraftClient mc = MinecraftClient.getInstance();
        LiteralText message = new LiteralText("TIMC -> " + s);
        mc.inGameHud.addChatMessage(MessageType.SYSTEM, message, Util.NIL_UUID);
    }

    /**
     * Returns the current position of the Turtle
     * @return Turtles position
     */
    public BlockPos position() {
        return turtlePos;
    }

    /**
     * Sleeps the {@link #interpretThread} for {@link #turtleTimeout} milliseconds
     */
    private void timeout() {
        if(Thread.currentThread() == interpretThread && turtleTimeout > 0) {
            try {
                while(MinecraftClient.getInstance().isPaused()) {
                    Thread.sleep(50);
                }
                Thread.sleep(turtleTimeout);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }

}
