package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.antlr.timcParser;
import org.jetbrains.annotations.NotNull;

public class FunctionVal extends TimcVal {
    // function parameter names
    private final String[] params;

    // function body
    private final timcParser.StatementsContext ctx;

    // symbolTable at the time of declaration including a reference to the function itself
    private final SymbolTable<TimcVal> declarationTable;

    public FunctionVal(String[] params, timcParser.StatementsContext ctx, SymbolTable<TimcVal> declarationTable) {
        super(TimcType.FUNCTION);
        this.params = params;
        this.ctx = ctx;
        this.declarationTable = declarationTable;
    }

    public String[] getParams() { return params; }
    public timcParser.StatementsContext getCtx() { return ctx; }
    public SymbolTable<TimcVal> getDeclarationTable() { return declarationTable; }

    // compare the reference
    @Override
    protected boolean timcValEquals(TimcVal o) {
        return o == this;
    }
}
