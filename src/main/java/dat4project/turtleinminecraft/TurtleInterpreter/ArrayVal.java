package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleInterpreter.Exception.TimcException;

import java.util.ArrayList;
import java.util.List;

public class ArrayVal extends TimcVal {
    private List<TimcVal> val;
    private TimcType elementType = null;
    private int nesting = 0;

    public ArrayVal() {
        super(TimcType.ARRAY);
        val = new ArrayList<>();
    }

    public ArrayVal(List<TimcVal> val) {
        this();
        addAll(val);
    }

    public List<TimcVal> getVal() {
        return val;
    }

    public TimcVal getNested(List<TimcVal> is) {
        if (is.isEmpty()) throw new TimcException("not index to get value");
        TimcVal i = is.remove(0);
        TimcVal res = null;
        if (i instanceof NumberVal n) {
            if (n.getVal() < 0) throw new TimcException("tried to get array value with negative index");
            if (is.isEmpty()) {
                res = val.get(n.getVal());
            } else if (val.get(n.getVal()) instanceof ArrayVal a) {
                res = a.getNested(is);
            } else {
                throw new TimcException("too many indexes applied");
            }
        } else {
            throw new TimcException("index is not a number");
        }

        return res;
    }

    public void add(TimcVal val) {
        if (this.val.isEmpty()) {
            if (val instanceof ArrayVal a) {
                nesting = a.getNesting() + 1;
                elementType = a.getInnerType();
            } else {
                nesting = 0;
                elementType = val.getType();
            }
        }
        else if (val instanceof ArrayVal a){
            if (a.getNesting() != nesting - 1) {throw new TimcException("Nesting does not match");}
            if (elementType == null) { elementType = a.getInnerType(); }
            else if (elementType != a.getInnerType()) throw new TimcException("Inner types does not matchs");
        }else if (elementType != val.getType()) {
            throw new TimcException("type mismatch in array add");
        }
        this.val.add(val);
    }

    public void addAll(List<TimcVal> val) {
        for(TimcVal v : val) add(v);
    }

    public void setNested(List<TimcVal> is, TimcVal val) {
        if (is.isEmpty()) throw new TimcException("not index to set value");
        if (is.remove(0) instanceof NumberVal n) {
            if (n.getVal() < 0) throw new TimcException("negative index in when setting array val");
            if (is.size() == 0) {
                if (val.getType() != elementType)
                    throw new TimcException("tried to set value with incorrect type");
                if (n.getVal() > this.val.size())
                    throw new TimcException("tried to set index that is to large");

                this.val.set(n.getVal(), val);
            } else {
                if (this.val.get(n.getVal()) instanceof ArrayVal a) {
                    is.remove(0);
                    a.setNested(is, val);
                } else {
                    throw new TimcException("tried to set value in non array");
                }
            }
        } else {
            throw new TimcException("index is not a number");
        }
    }

    public static ArrayVal operation(ArrayVal a, TimcVal b, int oper) {
        // currently only has one operation
        if (b instanceof ArrayVal c) {
            int leftNesting = 0;
            if (c.getVal().size() != 0 ? c.getVal().get(0) instanceof ArrayVal f : false) {
                ArrayVal e = c;
                while (true) {
                    if (e.getVal().size() == 0) break;

                    if (e.getVal().get(0) instanceof ArrayVal k) {
                        e = k;
                        leftNesting++;
                    }
                    else {

                        break;
                    }

                }
            }
            int RightNesting = 0;
            if (a.getVal().size() != 0 ? a.getVal().get(0) instanceof ArrayVal f : false) {
                ArrayVal e = a;
                while (true) {
                    if (e.getVal().size() == 0) break;

                    if (e.getVal().get(0) instanceof ArrayVal k) {
                        e = k;
                        RightNesting++;
                    }
                    else break;
                }
            }

            if (leftNesting == RightNesting) {
                List<TimcVal> temp = new ArrayList<>(a.getVal().size() + c.getVal().size());
                temp.addAll(a.getVal());
                temp.addAll(c.getVal());
                return new ArrayVal(temp);
            } else if (leftNesting == (RightNesting - 1)) {
                List<TimcVal> temp = new ArrayList<>(a.getVal().size() + 1);
                temp.addAll(a.getVal());
                temp.add(c);
                return new ArrayVal(temp);
            } else{
                throw new TimcException("Not matching nesting in two arrays");
            }



        } else {
            List<TimcVal> temp = new ArrayList<>(a.getVal().size() + 1);
            temp.addAll(a.getVal());
            temp.add(b);
            return new ArrayVal(temp);
        }
    }


    public TimcType getInnerType(){
        return elementType;
    }

    public int getNesting(){
        return nesting;
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        if(o instanceof ArrayVal arr){
            int a = arr.val.size();
            if(a == this.val.size()){
                for (int i = 0; i < a; i++) {
                    if(!arr.val.get(i).equals(this.val.get(i))) return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected String timcToString(){
        return "Array: " + val.toString();
    }


}
