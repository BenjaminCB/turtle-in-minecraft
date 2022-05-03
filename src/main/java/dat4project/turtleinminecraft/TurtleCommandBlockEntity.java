package dat4project.turtleinminecraft;

import dat4project.turtleinminecraft.TurtleInterpreter.RelDirVal.RelDir;
import dat4project.turtleinminecraft.TurtleInterpreter.TimcInterpreter;
import dat4project.turtleinminecraft.TurtleInterpreter.AbsDirVal.AbsDir;
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
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class TurtleCommandBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);

    private BlockState activeBlockState;
    private BlockState savedBlockState;
    private BlockState turtleState;
    private Direction turtleDirection;
    private BlockPos turtlePos;
    private boolean rsLatch;
    public boolean placing;
    public boolean breaking;

    public TurtleCommandBlockEntity(BlockPos pos, BlockState state) {
        super(Timc.TurtleCommandBlockEntity, pos, state);
    }

    public void setActiveBlock(Block block) { activeBlockState = block.getDefaultState(); }

    public Block getActiveBlock() { return activeBlockState.getBlock(); }

    @Override
    public void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        super.writeNbt(nbt);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
    }

    @Override
    public Text getDisplayName() {
        return new LiteralText("Graphics Turtle");
    }

    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

	@Override
	public ScreenHandler createMenu(int syncId, PlayerInventory inventory, PlayerEntity player) {
		return new TurtleCommandBlockGUI(syncId, inventory, ScreenHandlerContext.create(world, pos));
	}

    public static void tick(World world, BlockPos pos, BlockState state, TurtleCommandBlockEntity entity) {
        if(!world.isClient) {
            if(world.isReceivingRedstonePower(pos) && !entity.rsLatch) {
                entity.world = world;
                entity.initializeTurtle(pos, state);
                entity.startTurtle();
            }
            else if(!world.isReceivingRedstonePower(pos) && entity.rsLatch) {
                world.setBlockState(entity.turtlePos, entity.savedBlockState);
                entity.rsLatch = false;
            }
        }
    }

    private void initializeTurtle(BlockPos pos, BlockState state) {
        turtleDirection = state.get(TurtleCommandBlock.FACING);
        turtlePos = pos.add(turtleDirection.getVector());
        turtleState = Timc.GraphicsTurtleBlock.getDefaultState().with(TurtleCommandBlock.FACING, turtleDirection);
        setActiveBlock(Blocks.AIR);
        placing = false;
        breaking = false;
    }

    private void startTurtle() {
        rsLatch = true;
        savedBlockState = world.getBlockState(turtlePos);
        world.setBlockState(turtlePos, turtleState);
        
        ItemStack item = getStack(0);
        if(item.isOf(Items.WRITTEN_BOOK) || item.isOf(Items.WRITABLE_BOOK)) {
            // Read contents of book
            String prog = new String();
            NbtList nbtList = item.getNbt().getList("pages", 8);
            for (int i = 0; i < nbtList.size(); ++i) {
                prog = prog.concat(nbtList.getString(i));
            }
            
            // Run interpreter/executionvisitor
            TimcInterpreter timcInterpreter = new TimcInterpreter(prog, this);
            timcInterpreter.execute();
        }
        else {
            print("Insert a book with TIMC code to execute");
        }
    }

    /**
     * Moves the Turtle 1 block distance in the relative direction
     * @param relDir Relative direction to move the turtle
     */
    public void move(RelDir relDir) {
        BlockPos newPos = turtlePos.add(TimcUtil.relDirToMcDir(turtleDirection, relDir).getVector());
        if (placing) {
            world.setBlockState(turtlePos, activeBlockState);
        }
        else {
            if (breaking) {
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
        LiteralText message = new LiteralText("timc: " + s);
        mc.inGameHud.addChatMessage(MessageType.SYSTEM, message, mc.player.getUuid());
    }

    /**
     * Returns the current position of the Turtle
     * @return Turtles position
     */
    public BlockPos position() {
        return turtlePos;
    }

}
