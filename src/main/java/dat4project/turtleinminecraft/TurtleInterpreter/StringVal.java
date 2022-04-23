package dat4project.turtleinminecraft.TurtleInterpreter;

public class StringVal extends TimcVal {
    private String val;

    public StringVal(String val) {
        super(TimcType.STRING);
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
