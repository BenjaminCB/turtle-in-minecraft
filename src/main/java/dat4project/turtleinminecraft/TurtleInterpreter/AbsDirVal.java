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
        return (o instanceof AbsDirVal a) && val.equals(a.val);
    }

    public static enum AbsDir {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }
}
