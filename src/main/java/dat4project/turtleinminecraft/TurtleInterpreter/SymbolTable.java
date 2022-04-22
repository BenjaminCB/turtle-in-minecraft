package dat4project.turtleinminecraft.TurtleInterpreter;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable<T> {
    private Deque<Map<String, T>> tables;

    public SymbolTable() {
        tables = new ArrayDeque<>();
        tables.push(new HashMap<>());
    }

    public void enterScope() {
        tables.push(new HashMap<>());
    }

    public void exitScope() {
        tables.pop();
    }

    public void put(String name, T val) {
        tables.peek().put(name, val);
    }

    public T get(String name) {
        T res = null;

        for (Map<String, T> table : tables) {
            if (table.containsKey(name)) {
                res = table.get(name);
                break;
            }
        }

        return res;
    }
}

