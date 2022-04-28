package dat4project.turtleinminecraft.TurtleInterpreter;

import java.util.ArrayList;
import java.util.List;

public class ListVal extends TimcVal {
    List<TimcVal> val;
    private TimcType elementType = null;
    public ListVal() {
        super(TimcType.ARRAY);
        val = new ArrayList<>();
    }

    public ListVal(List<TimcVal> val) {
        this();
        for (TimcVal v : val) add(v);
    }

    public List<TimcVal> getVal() {
        return val;
    }

    public void add(TimcVal val) {
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
        if(o instanceof ListVal arr){
            int a = arr.val.size();
            if(a == this.val.size()){

                for (int i = 0; i < a; i++) {
                    if(!arr.val.get(i).equals(this.val.get(i))) return false;
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
