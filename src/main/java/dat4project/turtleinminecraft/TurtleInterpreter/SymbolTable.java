package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleCommandBlockEntity;
import dat4project.turtleinminecraft.TurtleInterpreter.Exception.TimcException;

import java.util.*;

public class SymbolTable {
    // not using a stack as the iterator is in the wrong order
    private Deque<Map<String, TimcVal>> tables;
    private final List<String> restrictedWords = Arrays.asList(
            "if",
            "do",
            "end",
            "while",
            "foreach",
            "repeat",
            "break",
            "return",
            "function",
            "fn",
            "length",
            "switch",
            "case",
            "forward",
            "backward",
            "up",
            "down",
            "look",
            "print",
            "facing",
            "position",
            "turn"
    );

    private final List<String> builtVariables = Arrays.asList(
            "PLACING",
            "EATING",
            "ACTIVE_BLOCK"
    );

    public TimcVal ret;
    private final TurtleCommandBlockEntity tcbEntity;

    public SymbolTable(TurtleCommandBlockEntity tcbEntity) {
        this.tcbEntity = tcbEntity;
        tables = new ArrayDeque<>();
        tables.push(new HashMap<>());
        ret = new NothingVal();
    }

    public void enterScope() {
        tables.push(new HashMap<>());
    }

    public void exitScope() {
        tables.pop();
    }

    public void put(String name, TimcVal val) {
        if (restrictedWords.contains(name)) {
            throw new TimcException(name + ": is a restricted word");
        } else if (builtVariables.contains(name)) {
            // TODO insert into command block
        } else {
            tables.peek().put(name, val);
        }
    }

    // go through the call stack looking for the symbol
    // if the symbol is not found returns null
    public TimcVal get(String name) {
        TimcVal res = null;

        if (builtVariables.contains(name)) {
            // TODO get from command block
        } else {
            for (Map<String, TimcVal> table : tables) {
                if (table.containsKey(name)) {
                    res = table.get(name);
                    break;
                }
            }

            if (res == null) throw new TimcException(name + ": is undefined");
        }

        return res;
    }
}

