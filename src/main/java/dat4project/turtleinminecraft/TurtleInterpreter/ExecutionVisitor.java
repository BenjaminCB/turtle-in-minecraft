package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleInterpreter.Excepton.TypeErrorException;
import dat4project.turtleinminecraft.TurtleInterpreter.Excepton.UndefinedReferenceException;
import dat4project.turtleinminecraft.antlr.timcBaseVisitor;
import dat4project.turtleinminecraft.antlr.timcParser;
import dat4project.turtleinminecraft.antlr.timcLexer;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ExecutionVisitor extends timcBaseVisitor<TimcVal> {
    private SymbolTable<TimcVal> symbolTable;

    public ExecutionVisitor() {
        symbolTable = new SymbolTable<>();
    }

    @Override public TimcVal visitList(timcParser.ListContext ctx) { return null; }

    @Override public TimcVal visitStatements(timcParser.StatementsContext ctx) {
        for (timcParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return null;
    }

    @Override public TimcVal visitAssignStmt(timcParser.AssignStmtContext ctx) { return null; }
    @Override public TimcVal visitExprStmt(timcParser.ExprStmtContext ctx) { return null; }
    @Override public TimcVal visitFuncStmt(timcParser.FuncStmtContext ctx) { return null; }
    @Override public TimcVal visitCtrlStmt(timcParser.CtrlStmtContext ctx) { return null; }
    @Override public TimcVal visitRetStmt(timcParser.RetStmtContext ctx) { return null; }
    @Override public TimcVal visitIfCtrl(timcParser.IfCtrlContext ctx) { return null; }
    @Override public TimcVal visitWhileCtrl(timcParser.WhileCtrlContext ctx) { return null; }
    @Override public TimcVal visitRepeatCtrl(timcParser.RepeatCtrlContext ctx) { return null; }
    @Override public TimcVal visitForeachCtrl(timcParser.ForeachCtrlContext ctx) { return null; }
    @Override public TimcVal visitSwitchCtrl(timcParser.SwitchCtrlContext ctx) { return null; }
    @Override public TimcVal visitAssignment(timcParser.AssignmentContext ctx) { return null; }

    @Override public TimcVal visitTermExpr(timcParser.TermExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        // TODO error handling
        TimcVal res = null;
        if (left instanceof NumberVal n1 && right instanceof NumberVal n2) {
            if (ctx.op.getType() == timcParser.ADD) {
                res = new NumberVal(n1.getVal() + n2.getVal());
            } else if (ctx.op.getType() == timcParser.SUB) {
                res = new NumberVal(n1.getVal() - n2.getVal());
            }
        } else if (left instanceof StringVal s1 && right instanceof StringVal s2 && ctx.op.getType() == timcParser.CONCAT) {
            res = new StringVal(s1.getVal() + s2.getVal());
        }

        return res;
    }

    @Override public TimcVal visitAndExpr(timcParser.AndExprContext ctx) { return null; }
    @Override public TimcVal visitPowerExpr(timcParser.PowerExprContext ctx) { return null; }
    @Override public TimcVal visitConstExpr(timcParser.ConstExprContext ctx) { return null; }
    @Override public TimcVal visitIdExpr(timcParser.IdExprContext ctx) { return null; }
    @Override public TimcVal visitFuncAppExpr(timcParser.FuncAppExprContext ctx) { return null; }
    @Override public TimcVal visitEqExpr(timcParser.EqExprContext ctx) { return null; }
    @Override public TimcVal visitCompExpr(timcParser.CompExprContext ctx) { return null; }
    @Override public TimcVal visitParenExpr(timcParser.ParenExprContext ctx) { return null; }
    @Override public TimcVal visitUnaryExpr(timcParser.UnaryExprContext ctx) { return null; }
    @Override public TimcVal visitOrExpr(timcParser.OrExprContext ctx) { return null; }
    @Override public TimcVal visitFactorExpr(timcParser.FactorExprContext ctx) { return null; }
    @Override public TimcVal visitNumberConst(timcParser.NumberConstContext ctx) { return null; }
    @Override public TimcVal visitBoolConst(timcParser.BoolConstContext ctx) { return null; }
    @Override public TimcVal visitStringConst(timcParser.StringConstContext ctx) { return null; }
    @Override public TimcVal visitBlockConst(timcParser.BlockConstContext ctx) { return null; }
    @Override public TimcVal visitRelDirConst(timcParser.RelDirConstContext ctx) { return null; }
    @Override public TimcVal visitAbsDirConst(timcParser.AbsDirConstContext ctx) { return null; }
    @Override public TimcVal visitListConst(timcParser.ListConstContext ctx) { return null; }
    @Override public TimcVal visitAnonFuncConst(timcParser.AnonFuncConstContext ctx) { return null; }
    @Override public TimcVal visitDclFunc(timcParser.DclFuncContext ctx) { return null; }
    @Override public TimcVal visitAnonFunc(timcParser.AnonFuncContext ctx) { return null; }
    @Override public TimcVal visitStmtAnonFunc(timcParser.StmtAnonFuncContext ctx) { return null; }
    @Override public TimcVal visitLambdaAnanFunc(timcParser.LambdaAnanFuncContext ctx) { return null; }

    @Override public TimcVal visitIdFuncApp(timcParser.IdFuncAppContext ctx) {
        String id = ctx.ID().getText();
        TimcVal val = symbolTable.get(id);

        // probably needs exceptions
        if (val == null) System.exit(0);
        if (val.getType() != TimcType.FUNCTION) System.exit(0);

        List<TimcVal> args = getArguments(ctx.arguments());

        // save current table and retrieve function value
        SymbolTable<TimcVal> savedTable = symbolTable;
        FunctionVal func = (FunctionVal) val;
        symbolTable = func.getDeclarationTable();

        if (args.size() != func.getParams().length) System.exit(0);

        // execute function body
        symbolTable.enterScope();
        for (int i = 0; i < args.size(); i++) {
            symbolTable.put(func.getParams()[i], args.get(i));
        }
        visitStatements(func.getCtx());
        symbolTable.exitScope();

        // return to normal with new return value
        savedTable.ret = symbolTable.ret;
        symbolTable = savedTable;

        return symbolTable.ret;
    }

    @Override public TimcVal visitConstFuncApp(timcParser.ConstFuncAppContext ctx) { return null; }
    @Override public TimcVal visitParameters(timcParser.ParametersContext ctx) { return null; }
    @Override public TimcVal visitArguments(timcParser.ArgumentsContext ctx) { return null; }
    public List<TimcVal> getArguments(timcParser.ArgumentsContext ctx) {
        List<TimcVal> res = new ArrayList<>();
        for (timcParser.ExpressionContext expr : ctx.expression()) {
            res.add(visit(expr));
        }
        return res;
    }
}
