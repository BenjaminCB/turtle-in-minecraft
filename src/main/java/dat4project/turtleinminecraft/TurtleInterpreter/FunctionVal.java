package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.antlr.timcParser;

public class FunctionVal extends TimcVal {
    private String[] params;
    private timcParser.StatementsContext ctx;
    private SymbolTable<TimcVal> declarationTable;

    public FunctionVal(String[] params, timcParser.StatementsContext ctx, SymbolTable<TimcVal> declarationTable) {
        super(TimcType.FUNCTION);
        this.params = params;
        this.ctx = ctx;
        this.declarationTable = declarationTable;
    }

    public String[] getParams() { return params; }
    public timcParser.StatementsContext getCtx() { return ctx; }
    public SymbolTable<TimcVal> getDeclarationTable() { return declarationTable; }
}
