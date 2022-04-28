package dat4project.turtleinminecraft;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class TurtleCommandBlock extends BlockWithEntity{
    public static final DirectionProperty FACING = Properties.FACING;
    public static final Identifier ID = new Identifier("timc", "command_turtle_block");

    private BlockPos turtlePos;
    private BlockState turtleBlockState;
    private Direction turtleDirection;

    public TurtleCommandBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH)));
        this.turtleBlockState = Timc.GraphicsTurtleBlock.getDefaultState();
    }
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TurtleCommandBlockEntity(pos, state);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, Timc.TurtleCommandBlockEntity, TurtleCommandBlockEntity::tick);
    }

    // cotton GUI
    @Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		// You need a Block.createScreenHandlerFactory implementation that delegates to the block entity,
		// such as the one from BlockWithEntity
        if(!world.isClient) {
            BlockState currentBlockState = world.getBlockState(turtlePos);
            if(!currentBlockState.equals(state)) {
                world.removeBlock(turtlePos, true);
            }
            updateTurtlePos();
            world.setBlockState(turtlePos, turtleBlockState);
        }
		//player.openHandledScreen(state.createScreenHandlerFactory(world, pos));
		return ActionResult.SUCCESS;
	}

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(!world.isClient) {
            turtleDirection = turtleDirection.rotateYClockwise();
            turtleBlockState = turtleBlockState.with(FACING, turtleDirection);
            if(!world.getBlockState(turtlePos).equals(state)) {
                world.setBlockState(turtlePos, turtleBlockState);
            }
            Timc.LOGGER.info(turtleDirection.asString());
        }
    }
    
    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if(!world.isClient) {
            turtleDirection = state.get(FACING);
            turtleBlockState = turtleBlockState.with(FACING, turtleDirection);
            turtlePos = pos;
        }
    }

    private void updateTurtlePos() {
        switch(turtleDirection) {
            case DOWN:
                turtlePos = turtlePos.down();
                break;
            case EAST:
                turtlePos = turtlePos.east();
                break;
            case NORTH:
                turtlePos = turtlePos.north();
                break;
            case SOUTH:
                turtlePos = turtlePos.south();
                break;
            case UP:
                turtlePos = turtlePos.up();
                break;
            case WEST:
                turtlePos = turtlePos.west();
                break;
            default:
                break;
        }
    }
}
