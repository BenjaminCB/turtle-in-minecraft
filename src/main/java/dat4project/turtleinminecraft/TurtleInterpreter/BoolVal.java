package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.antlr.timcParser;

public class BoolVal extends TimcVal {
    private boolean val;

    public BoolVal(boolean val) {
        super(TimcType.BOOL);
        this.val = val;
    }

    public boolean getVal() {
        return val;
    }

    public static BoolVal operation(NumberVal l, NumberVal r, int oper) {
        switch (oper) {
            case timcParser.GT -> {
                return new BoolVal( l.getVal() > r.getVal() );
            }
            case timcParser.GTEQ -> {
                return new BoolVal( l.getVal() >= r.getVal() );
            }
            case timcParser.LT -> {
                return new BoolVal( l.getVal() < r.getVal() );
            }
            default -> {
                return new BoolVal(l.getVal() <= r.getVal());
            }
        }
    }

    public static BoolVal operation(BoolVal l, BoolVal r, int oper) {
        if (oper == timcParser.AND) {
            return new BoolVal(l.getVal() && r.getVal());
        } else {
            return new BoolVal(l.getVal() || r.getVal());
        }
    }

    public static BoolVal operation(BoolVal b, int oper) {
        return new BoolVal(!b.getVal());
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        return (o instanceof BoolVal b) && (val == b.val);
    }
}
