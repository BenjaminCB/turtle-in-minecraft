package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.antlr.timcParser;
import org.jetbrains.annotations.NotNull;

public class FunctionVal extends TimcVal {
    private final String[] params;
    private final timcParser.StatementsContext ctx;
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
