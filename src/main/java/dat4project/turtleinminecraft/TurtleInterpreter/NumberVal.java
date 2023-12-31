package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleInterpreter.Exception.TimcException;
import dat4project.turtleinminecraft.antlr.timcParser;

public class NumberVal extends TimcVal {
    private Integer val;

    public NumberVal(Integer val) {
        super(TimcType.NUMBER);
        this.val = val;
    }

    public Integer getVal() {
        return val;
    }

    public static NumberVal operation(NumberVal n, NumberVal m, int oper) throws ArithmeticException {
        switch (oper) {
            case timcParser.ADD -> {
                return new NumberVal(n.getVal() + m.getVal());
            }
            case timcParser.SUB -> {
                return new NumberVal(n.getVal() - m.getVal());
            }
            case timcParser.MULT -> {
                return new NumberVal(n.getVal() * m.getVal());
            }
            case timcParser.DIV -> {
                if (m.getVal() == 0) throw new TimcException("division by zero");
                return new NumberVal(n.getVal() / m.getVal());
            }
            case timcParser.MOD -> {
                if (m.getVal() == 0) throw new TimcException("division by zero");
                return new NumberVal(n.getVal() % m.getVal());
            }
            case timcParser.ADDASSIGN -> {return new NumberVal(n.getVal() + m.getVal());}
            case timcParser.SUBASSIGN -> {return new NumberVal(n.getVal() - m.getVal());}
            case timcParser.MULTASSIGN -> {return new NumberVal(n.getVal() * m.getVal());}
            case timcParser.DIVASSIGN -> {if (m.getVal() == 0) throw new TimcException("division by zero");
            return new NumberVal(n.getVal() / m.getVal());}
            case timcParser.MODASSIGN -> {if (m.getVal() == 0) throw new TimcException("division by zero");
            return new NumberVal(n.getVal() % m.getVal());}
            case timcParser.POWERASSIGN -> {return new NumberVal((int) Math.pow(n.getVal(), m.getVal())); }
            default -> {
                return new NumberVal((int) Math.pow(n.getVal(), m.getVal()));
            }
        }
    }

    public static NumberVal operation(NumberVal n, int oper) {
        switch (oper) {
            default -> {
                return new NumberVal(-n.getVal());
            }
        }
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        return (o instanceof NumberVal n) && (val == n.val);
    }

    @Override
    protected String timcToString() {
        return val.toString();
    }
}
