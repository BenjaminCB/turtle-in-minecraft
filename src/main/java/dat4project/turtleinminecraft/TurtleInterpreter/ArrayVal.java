package dat4project.turtleinminecraft.TurtleInterpreter;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayVal extends TimcVal {
    private List<TimcVal> val;
    private TimcType elementType = null;

    public ArrayVal() {
        super(TimcType.ARRAY);
        val = new ArrayList<>();
    }

    public ArrayVal(List<TimcVal> val) {
        this();
        for (TimcVal v : val) add(v);
    }

    public List<TimcVal> getVal() {
        return val;
    }

    public TimcVal getNested(List<TimcVal> is) {
        if (is.isEmpty()) System.exit(0);
        TimcVal i = is.remove(0);
        TimcVal res = null;
        if (i instanceof NumberVal n) {
            if (is.isEmpty()) {
                res = val.get(n.getVal());
            } else if (val.get(n.getVal()) instanceof ArrayVal a) {
                res = a.getNested(is);
            } else {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }

        return res;
    }

    public void add(TimcVal val) {
        if (this.val.isEmpty()) elementType = val.getType();
        if (elementType != val.getType()) System.exit(0);
        this.val.add(val);
    }

    public void addAll(List<TimcVal> val) {
        for(TimcVal v : val) add(v);
    }

    public void setNested(List<TimcVal> is, TimcVal val) {
        if (is.isEmpty()) System.exit(0);
        if (is.remove(0) instanceof NumberVal n) {
            if (is.size() == 1) {
                if (val.getType() != elementType) System.exit(0);
                if (n.getVal() > this.val.size()) System.exit(0);
                this.val.set(n.getVal(), val);
            } else {
                if (this.val.get(n.getVal()) instanceof ArrayVal a) {
                    is.remove(0);
                    a.setNested(is, val);
                } else {
                    System.exit(0);
                }
            }
        } else {
            System.exit(0);
        }
    }

    public static ArrayVal operation(ArrayVal a, ArrayVal b, int oper) {
        // currently only has one operation
        List<TimcVal> temp = new ArrayList<>(a.getVal().size() + b.getVal().size());
        temp.addAll(a.getVal());
        temp.addAll(b.getVal());
        return new ArrayVal(temp);
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        if(o instanceof ArrayVal arr){
            int a = arr.val.size();
            if(a == this.val.size()){
                for (int i = 0; i < a; i++) {
                    if(!arr.val.get(i).equals(this.val.get(i))) return false;
                }
            } else {
                System.exit(0);
                return false;
            }
        } else {
            System.exit(0);
            return false;
        }
        return true;
    }
}
