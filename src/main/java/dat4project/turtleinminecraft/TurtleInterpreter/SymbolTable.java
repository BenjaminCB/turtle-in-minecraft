package dat4project.turtleinminecraft.TurtleInterpreter;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable<T> {
    private SymbolTable parent;
    private Map<String, SymbolTable<T>> children;
    private Map<String, T> symbols;

    private SymbolTable(SymbolTable parent) {
        this.parent = parent;
        children = new HashMap<String, SymbolTable<T>>();
        symbols = new HashMap<String, T>();
    }

    public SymbolTable() {
        this(null);
    }

    public void put(String name, T val, Deque<String> scope) {
        if (scope.isEmpty()) {
            // traversed to the correct scope
            symbols.put(name, val);
        } else {
            // continue traversing
            String nextScope = scope.pollLast();
            if (children.containsKey(nextScope)) {
                // already have a symbol table for this scope
                children.get(nextScope).put(name, val, scope);
            } else {
                // create table for new scope
                SymbolTable t = new SymbolTable<T>(this);
                children.put(nextScope, t);
                t.put(name, val, scope);
            }
        }
    }

    public T get(String name, Deque<String> scope) {
        T res = null;

        // first check deeper symbol tables
        String nextScope = scope.pollLast();
        if (children.containsKey(nextScope)) {
            res = children.get(nextScope).get(name, scope);
        }

        // if nothing was found check current table
        res = res == null ? symbols.get(name) : res;

        return res;
    }
}

