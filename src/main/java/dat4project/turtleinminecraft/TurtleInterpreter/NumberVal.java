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
}
