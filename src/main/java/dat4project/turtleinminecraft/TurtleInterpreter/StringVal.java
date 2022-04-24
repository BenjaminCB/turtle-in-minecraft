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

    @Override
    protected boolean timcValEquals(TimcVal o) {
        if (o instanceof StringVal s) {
            return val.equals(s.getVal());
        } else {
            return false;
        }
    }
}
