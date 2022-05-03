package dat4project.turtleinminecraft;

import dat4project.turtleinminecraft.TurtleInterpreter.RelDirVal.RelDir;
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
import net.minecraft.nbt.NbtCompound;
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

    private BlockPos turtlePos;
    private BlockState turtleState;
    private BlockState placingBlockState;
    private BlockState savedBlockState;
    private Direction turtleDirection;
    private boolean placing;
    private boolean breaking;

    public TurtleCommandBlockEntity(BlockPos pos, BlockState state) {
        super(Timc.TurtleCommandBlockEntity, pos, state);
        
        turtleDirection = state.get(TurtleCommandBlock.FACING);
        turtlePos = pos.add(turtleDirection.getVector());
        turtleState = Timc.GraphicsTurtleBlock.getDefaultState().with(TurtleCommandBlock.FACING, turtleDirection);
        
        placing = false;
        breaking = false;
        placingBlockState = Blocks.AIR.getDefaultState();
        savedBlockState = world.getBlockState(pos);

        world.setBlockState(turtlePos, turtleState);
    }

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
        // Entity code executed each tick
    }

    /**
     * Moves the Turtle 1 block distance in the relative direction
     * @param relDir Relative direction to move the turtle
     */
    public void move(RelDir relDir) {
        BlockPos newPos = turtlePos.add(TimcUtil.relDirToMcDir(turtleDirection, relDir).getVector());

        if (placing) {
            world.setBlockState(turtlePos, placingBlockState);
        }
        else {
            if (breaking) {
                world.breakBlock(newPos, true);
            }
            world.setBlockState(turtlePos, savedBlockState);
        }
        savedBlockState = world.getBlockState(newPos);
        world.setBlockState(newPos, turtleState);
    }

    /**
     * Turns the Turtle to the given relative direction. Implementation does nothing for up or down directions
     * @param relDir Relative direction to turn the Turtle to
     */
    public void turn(RelDir relDir) {
        if(relDir != RelDir.UP && relDir != RelDir.DOWN) {
            turtleDirection = TimcUtil.relDirToMcDir(turtleDirection, relDir);
            BlockState newTurtleState = turtleState.with(TurtleCommandBlock.FACING, turtleDirection);
            world.setBlockState(turtlePos, newTurtleState);
        }
    }

    /**
     * Turns the Turtle to the given absolute direction
     * @param absDir Absolute direction to turn the Turtle to
     */
    public void turn(AbsDir absDir) {
        turtleDirection = TimcUtil.absDirToMcDir(absDir);
        BlockState newTurtleState = turtleState.with(TurtleCommandBlock.FACING, turtleDirection);
        world.setBlockState(turtlePos, newTurtleState);
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
