package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleInterpreter.Exception.TimcException;
import dat4project.turtleinminecraft.antlr.timcParser;
import org.antlr.v4.runtime.RuleContext;

import java.util.List;

public class FunctionVal extends TimcVal {
    // function parameter names
    private final List<String> params;

    // function body
    private final RuleContext ctx;

    // symbolTable at the time of declaration including a reference to the function itself
    private final SymbolTable declarationTable;

    private final boolean isLambda;

    public FunctionVal(List<String> params, timcParser.StatementsContext ctx, SymbolTable declarationTable) {
        super(TimcType.FUNCTION);
        this.params = params;
        this.ctx = ctx;
        this.declarationTable = declarationTable;
        isLambda = false;
    }

    public FunctionVal(List<String> params, timcParser.ExpressionContext ctx, SymbolTable declarationTable) {
        super(TimcType.FUNCTION);
        this.params = params;
        this.ctx = ctx;
        this.declarationTable = declarationTable;
        isLambda = true;
    }

    public List<String> getParams() { return params; }
    public RuleContext getCtx() { return ctx; }
    public SymbolTable getDeclarationTable() { return declarationTable; }

    public TimcVal execute(List<TimcVal> args) {
        if (params.size() != args.size()) throw new TimcException("too many or too few arguments applied");

        declarationTable.enterScope();
        for (int i = 0; i < params.size(); i++) {
            declarationTable.put(params.get(i), args.get(i));
        }
        ExecutionVisitor visitor = new ExecutionVisitor(declarationTable);
        TimcVal ret = visitor.visit(ctx);
        declarationTable.exitScope();

        return isLambda ? ret : declarationTable.ret;
    }

    @Override
    protected boolean timcValEquals(TimcVal o) {
        return o == this;
    }

    @Override
    protected String timcToString() {
        return "this is a function, for more information come back in a later version of TIMC";
    }
}
