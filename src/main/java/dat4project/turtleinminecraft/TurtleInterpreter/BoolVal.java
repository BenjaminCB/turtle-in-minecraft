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
        BoolVal res = null;
        if (oper == timcParser.GT) {
            res = new BoolVal( l.getVal() > r.getVal() );
        } else if(oper == timcParser.GTEQ) {
            res = new BoolVal( l.getVal() >= r.getVal() );
        } else if (oper == timcParser.LT) {
            res = new BoolVal( l.getVal() < r.getVal() );
        } else if (oper == timcParser.LTEQ) {
            res = new BoolVal(l.getVal() <= r.getVal());
        } else {
            System.exit(0);
        }
        return res;
    }

    public static BoolVal operation(BoolVal l, BoolVal r, int oper) {
        BoolVal res = null;

        switch (oper) {
            case timcParser.AND -> res = new BoolVal(l.getVal() && r.getVal());
            case timcParser.OR -> res = new BoolVal(l.getVal() || r.getVal());
            default -> System.exit(0);
        }

        return res;
    }

    public static BoolVal operation(BoolVal b, int oper) {
        BoolVal res = null;

        switch (oper) {
            case timcParser.NOT -> res = new BoolVal(!b.getVal());
            default -> System.exit(0);
        }

        return res;
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
