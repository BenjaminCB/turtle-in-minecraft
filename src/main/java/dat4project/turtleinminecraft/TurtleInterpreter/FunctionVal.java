package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.antlr.timcParser;

import java.util.List;

public class FunctionVal extends TimcVal {
    // function parameter names
    private final List<String> params;

    // function body
    private final timcParser.StatementsContext ctx;

    // symbolTable at the time of declaration including a reference to the function itself
    private final SymbolTable declarationTable;

    public FunctionVal(List<String> params, timcParser.StatementsContext ctx, SymbolTable declarationTable) {
        super(TimcType.FUNCTION);
        this.params = params;
        this.ctx = ctx;
        this.declarationTable = declarationTable;
    }

    public List<String> getParams() { return params; }
    public timcParser.StatementsContext getCtx() { return ctx; }
    public SymbolTable getDeclarationTable() { return declarationTable; }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        return o == this;
    }

    @Override
    protected String timcToString() {
        return "this is a function, for more information come back in a later version of TIMC";
    }
}
