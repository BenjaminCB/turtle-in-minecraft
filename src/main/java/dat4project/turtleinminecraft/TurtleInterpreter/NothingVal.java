package dat4project.turtleinminecraft.TurtleInterpreter;

public class NothingVal extends TimcVal {
    public NothingVal() {
        super(TimcType.NOTHING);
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        return o instanceof NothingVal;
    }
}
