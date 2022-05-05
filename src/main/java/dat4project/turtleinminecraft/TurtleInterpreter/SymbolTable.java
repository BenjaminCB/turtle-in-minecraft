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

    private final List<String> builtInVariables = Arrays.asList(
            "PLACING",
            "BREAKING",
            "SPAWN",
            "TIMEOUT"
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
        } else if (builtInVariables.contains(name)) {
            switch (name) {
                case "PLACING" -> {
                    if (val instanceof BoolVal b) {
                        tcbEntity.turtlePlacing = b.getVal();
                    } else {
                        throw new TimcException("Cannot assing PLACING to non-boolean value");
                    }
                }
                case "BREAKING" -> {
                    if (val instanceof BoolVal b) {
                        tcbEntity.turtleBreaking = b.getVal();
                    } else {
                        throw new TimcException("Cannot assign BREAKING to non-boolean value");
                    }
                }
                case "TIMEOUT" -> {
                    if (val instanceof NumberVal n) {
                        tcbEntity.turtleTimeout = n.getVal();
                    }
                    else {
                        throw new TimcException("Cannot assign TIMEOUT to non-number value");
                    }
                }
                default -> {
                    if (val instanceof BlockVal b) {
                        tcbEntity.setActiveBlock(b.getVal());;
                    } else {
                        throw new TimcException("Cannot assign SPAWN to non-block value");
                    }
                }
            }
        } else {
            tables.peek().put(name, val);
        }
    }

    // go through the call stack looking for the symbol
    // if the symbol is not found returns null
    public TimcVal get(String name) {
        TimcVal res = null;

        if (builtInVariables.contains(name)) {
            switch (name) {
                case "PLACING" -> {
                    res = new BoolVal(tcbEntity.turtlePlacing);
                }
                case "BREAKING" -> {
                    res = new BoolVal(tcbEntity.turtleBreaking);
                }
                case "TIMEOUT" -> {
                    res = new NumberVal(tcbEntity.turtleTimeout);
                }
                default -> {
                    res = new BlockVal(tcbEntity.getActiveBlock());
                }
            }
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

