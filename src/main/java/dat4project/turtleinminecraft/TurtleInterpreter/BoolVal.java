package dat4project.turtleinminecraft.TurtleInterpreter;

public class BoolVal extends TimcVal {
    private boolean val;

    public BoolVal(boolean val) {
        super(TimcType.BOOL);
        this.val = val;
    }

    public boolean getVal() {
        return val;
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        if (o instanceof BoolVal b) {
            return val == b.getVal();
        } else {
            return false;
        }
    }
}
