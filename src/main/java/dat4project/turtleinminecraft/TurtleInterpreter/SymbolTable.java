package dat4project.turtleinminecraft.TurtleInterpreter;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable<T> {
    // not using a stack as the iterator is in the wrong order
    private Deque<Map<String, T>> tables;
    public T ret;

    public SymbolTable() {
        tables = new ArrayDeque<>();
        tables.push(new HashMap<>());
        ret = null;
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

    // go through the call stack looking for the symbol
    // if the symbol is not found returns null
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

    public Boolean contains(String name) {
        return get(name) != null;
    }
}

