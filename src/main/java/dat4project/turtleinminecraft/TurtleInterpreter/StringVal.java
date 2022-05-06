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

    public static StringVal operation(StringVal a, StringVal b, int oper) {
        switch (oper) {
            default -> {
                return new StringVal(a.getVal().concat(b.getVal()));
            }
        }
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        return (o instanceof StringVal s) && val.equals(s.val);
    }

    @Override
    protected String timcToString() {
        return val;
    }
}
