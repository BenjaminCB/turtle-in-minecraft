package dat4project.turtleinminecraft.TurtleInterpreter;

public abstract class TimcVal {
    private TimcType type;

    public TimcVal(TimcType type) {
        this.type = type;
    }

    public TimcType getType() { return type; }

    @Override
    public boolean equals(Object o) {
        if (o instanceof TimcVal v) {
            return timcValEquals(v);
        } else {
            return false;
        }
    }

    protected abstract boolean timcValEquals(TimcVal o);
}
