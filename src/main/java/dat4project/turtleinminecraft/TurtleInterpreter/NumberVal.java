package dat4project.turtleinminecraft.TurtleInterpreter;

public class NumberVal extends TimcVal {
    private int val;

    public NumberVal(int val) {
        super(TimcType.NUMBER);
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        if (o instanceof NumberVal n) {
            return val == n.getVal();
        } else {
            return false;
        }
    }
}
