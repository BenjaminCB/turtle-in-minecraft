package dat4project.turtleinminecraft.TurtleInterpreter;

public class RelDirVal extends TimcVal {
    private RelDir val;

    public RelDirVal(RelDir val) {
        super(TimcType.RELATIVE_DIRECTION);
        this.val = val;
    }

    public RelDir getVal() {
        return val;
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        return false;
    }

    public static enum RelDir {
        RIGHT,
        LEFT,
        UP,
        DOWN,
        FRONT,
        BACK
    }
}
