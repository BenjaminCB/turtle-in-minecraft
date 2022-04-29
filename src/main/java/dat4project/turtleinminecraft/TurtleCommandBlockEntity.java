package dat4project.turtleinminecraft;

import dat4project.turtleinminecraft.TurtleInterpreter.AbsDirVal;
import dat4project.turtleinminecraft.TurtleInterpreter.BlockVal;
import dat4project.turtleinminecraft.TurtleInterpreter.RelDirVal;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.block.Block;
import org.jetbrains.annotations.Nullable;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.Objects;

public class TurtleCommandBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);

    private BlockPos turtlePos;
    private BlockState turtleState;
    private Direction turtleDirection;
    private boolean latched = false;

    public TurtleCommandBlockEntity(BlockPos pos, BlockState state) {
        super(Timc.TurtleCommandBlockEntity, pos, state);
        turtleDirection = state.get(TurtleCommandBlock.FACING);
        turtlePos = pos.add(turtleDirection.getVector());
        turtleState = Timc.GraphicsTurtleBlock.getDefaultState().with(TurtleCommandBlock.FACING, turtleDirection);
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
		return new ExampleGUI(syncId, inventory, ScreenHandlerContext.create(world, pos));
	}
    public static void move(World world,TurtleCommandBlockEntity entity){
        if(world.getBlockState(entity.turtlePos) == entity.turtleState) {

            world.removeBlock(entity.turtlePos, true);
            entity.turtlePos = entity.turtlePos.add(entity.turtleDirection.getVector());
        }
        world.setBlockState(entity.turtlePos, entity.turtleState);
    }
    public static void rotate(World world, TurtleCommandBlockEntity entity, AbsDirVal.AbsDir absDir){
        if(world.getBlockState(entity.turtlePos) == entity.turtleState){
            world.removeBlock(entity.turtlePos, true);
            entity.turtleState = Timc.GraphicsTurtleBlock.getDefaultState().with(TurtleCommandBlock.FACING,absDirToMcDir(absDir));
        }
        world.setBlockState(entity.turtlePos, entity.turtleState);
    }
    public static void rotate(World world, TurtleCommandBlockEntity entity, RelDirVal.RelDir relDir){
        if(world.getBlockState(entity.turtlePos) == entity.turtleState){
            world.removeBlock(entity.turtlePos, true);
            entity.turtleState = Timc.GraphicsTurtleBlock.getDefaultState().with(TurtleCommandBlock.FACING,relDirToMcDir(entity,relDir));
        }
        world.setBlockState(entity.turtlePos, entity.turtleState);
    }
    public static Direction absDirToMcDir(AbsDirVal.AbsDir absDir){
        return switch (absDir){
            case EAST -> Direction.EAST;
            case WEST -> Direction.WEST;
            case NORTH -> Direction.NORTH;
            case SOUTH -> Direction.SOUTH;
        };
    }
    public static Direction relDirToMcDir(TurtleCommandBlockEntity entity,RelDirVal.RelDir relDir){
        return switch (relDir) {
            case UP -> Direction.UP;
            case DOWN -> Direction.DOWN;
            case LEFT -> entity.turtleDirection.rotateYCounterclockwise();
            case RIGHT -> entity.turtleDirection.rotateYClockwise();
            case FRONT -> entity.turtleDirection;
            case BACK -> entity.turtleDirection.getOpposite();
        };
    }

    public static Block look(World world, TurtleCommandBlockEntity entity, AbsDirVal.AbsDir absDir){
        entity.turtleDirection = absDirToMcDir(absDir);
        return world.getBlockState(entity.turtlePos.add(entity.turtleDirection.getVector())).getBlock();
    }
    public static Block look(World world, TurtleCommandBlockEntity entity, RelDirVal.RelDir relDir){
        return world.getBlockState(entity.turtlePos.add(relDirToMcDir(entity,relDir).getVector())).getBlock();
    }

    public static void tick(World world, BlockPos pos, BlockState state, TurtleCommandBlockEntity entity) {
        if(!world.isClient){
        if (world.isReceivingRedstonePower(pos)) {
            if(!entity.latched) {
                move(world,entity);
            }
            entity.latched = true;

        }
        else {
            entity.latched = false;
        }
        }
    }
}