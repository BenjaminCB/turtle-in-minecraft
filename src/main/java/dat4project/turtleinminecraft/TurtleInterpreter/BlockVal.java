package dat4project.turtleinminecraft.TurtleInterpreter;

public class BlockVal extends TimcVal {
    private BlockType val;

    public BlockVal(BlockType val) {
        super(TimcType.BLOCK);
        this.val = val;
    }

    public BlockType getVal() {
        return val;
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        return false;
    }

    public static enum BlockType {
        DIRT,
        SAND,
        STONE,
        BRICK,
        GLASS,
        WOOD,
        PLANK
    }
}
