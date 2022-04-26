package dat4project.turtleinminecraft.TurtleInterpreter;

import java.util.ArrayList;
import java.util.List;

public class ArrayVal extends TimcVal {
    List<TimcVal> val;
    private TimcType elementType = null;

    public ArrayVal() {
        super(TimcType.ARRAY);
        val = new ArrayList<>();
    }

    public ArrayVal(List<TimcVal> val) {
        this();
        for (TimcVal v : val) add(v);
    }

    public void add(TimcVal val) {
        if (this.val.isEmpty()) elementType = val.getType();
        if (elementType != val.getType()) System.exit(0);
        this.val.add(val);
    }

    public void addAll(List<TimcVal> val) {
        for(TimcVal v : val) add(v);
    }

    public void set(int index, TimcVal val) {
        this.val.set(index, val);
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        if(o instanceof ArrayVal arr){
            int a = arr.val.size();
            if(a == this.val.size()){

                for (int i = 0; i < a; i++) {
                    if(arr.val.get(i) != this.val.get(i)) return false;
                }

            } else {   
                System.exit(0);
                return false;
            }

            
        }else {   
            System.exit(0);
            return false;
        }
        return true;
    }
}
