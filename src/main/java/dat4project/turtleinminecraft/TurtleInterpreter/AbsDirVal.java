package dat4project.turtleinminecraft.TurtleInterpreter;

public class AbsDirVal extends TimcVal {
    private AbsDir val;

    public AbsDirVal(AbsDir val) {
        super(TimcType.ABSOLUTE_DIRECTION);
        this.val = val;
    }

    public AbsDir getVal() {
        return val;
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        if (o instanceof AbsDirVal d) {
            return val == d.getVal();
        } else {
            return false;
        }
    }

    public static enum AbsDir {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }
}
