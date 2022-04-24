package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleInterpreter.Excepton.TypeErrorException;
import dat4project.turtleinminecraft.TurtleInterpreter.Excepton.UndefinedReferenceException;
import dat4project.turtleinminecraft.antlr.timcBaseVisitor;
import dat4project.turtleinminecraft.antlr.timcParser;
import dat4project.turtleinminecraft.antlr.timcLexer;
import org.checkerframework.checker.units.qual.A;
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

    @Override public TimcVal visitAssignStmt(timcParser.AssignStmtContext ctx) {
        visit(ctx.assignment());
        return null;
    }

    @Override public TimcVal visitExprStmt(timcParser.ExprStmtContext ctx) {
        visit(ctx.expression());
        return null;
    }

    @Override public TimcVal visitFuncStmt(timcParser.FuncStmtContext ctx) {
        visit(ctx.function());
        return null;
    }

    @Override public TimcVal visitCtrlStmt(timcParser.CtrlStmtContext ctx) {
        visit(ctx.control_structure());
        return null;
    }

    @Override public TimcVal visitRetStmt(timcParser.RetStmtContext ctx) { return null; }

    @Override public TimcVal visitIfCtrl(timcParser.IfCtrlContext ctx) {
        List<timcParser.ExpressionContext> conds = ctx.expression();
        List<timcParser.StatementsContext> clauses = ctx.statements();

        int i;
        boolean executeElse = true;
        // run through the conditionals and execute first to evaluate to true
        for (i = 0; i < conds.size(); i++) {
            TimcVal val = visit(conds.get(i));
            if (val instanceof BoolVal b) {
                if (b.getVal()) {
                    executeElse = false;
                    visit(clauses.get(i));
                    break;
                }
            } else {
                System.exit(0);
            }
        }

        // check for existence of else clause and if we should visit
        if (executeElse && conds.size() < clauses.size()) {
            visit(clauses.get(i));
        }
        return null;
    }

    @Override public TimcVal visitWhileCtrl(timcParser.WhileCtrlContext ctx) {
        while(true) {
            TimcVal cond = visit(ctx.expression());
            if (cond instanceof BoolVal b) {
                if (b.getVal()) {
                    visit(ctx.statements());
                } else {
                    break;
                }
            } else {
                System.exit(0);
            }
        }
        return null;
    }

    @Override public TimcVal visitRepeatCtrl(timcParser.RepeatCtrlContext ctx) { return null; }
    @Override public TimcVal visitForeachCtrl(timcParser.ForeachCtrlContext ctx) { return null; }
    @Override public TimcVal visitSwitchCtrl(timcParser.SwitchCtrlContext ctx) { return null; }

    // currently always returns null, but could return value of the assignment
    // also probably needs some refactoring
    @Override public TimcVal visitAssignment(timcParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        TimcVal val = visit(ctx.expression());


        int oper = ctx.op.getType();
        if (oper == timcParser.ASSIGN) {
            symbolTable.put(id, val);
        } else if (symbolTable.get(id) instanceof NumberVal n && val instanceof NumberVal m) {
            switch (oper) {
                case timcParser.ADDASSIGN -> symbolTable.put(id, new NumberVal(n.getVal() + m.getVal()));
                case timcParser.SUBASSIGN -> symbolTable.put(id, new NumberVal(n.getVal() - m.getVal()));
                case timcParser.MULTASSIGN -> symbolTable.put(id, new NumberVal(n.getVal() * m.getVal()));
                case timcParser.DIVASSIGN -> {
                    if (m.getVal() == 0) System.exit(0);
                    symbolTable.put(id, new NumberVal(n.getVal() / m.getVal()));
                }
                case timcParser.MODASSIGN -> {
                    if (m.getVal() == 0) System.exit(0);
                    symbolTable.put(id, new NumberVal(n.getVal() % m.getVal()));
                }
                case timcParser.POWERASSIGN -> symbolTable.put(id, new NumberVal((int) Math.pow(n.getVal(), m.getVal())));
                default -> symbolTable.put(id, val);
            }
        } else {
            System.exit(0);
        }

        return null;
    }

    // TODO error handling
    @Override public TimcVal visitTermExpr(timcParser.TermExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

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

    // short circuiting not implemented
    @Override public TimcVal visitAndExpr(timcParser.AndExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        TimcVal res = null;
        if (left instanceof BoolVal b1 && right instanceof BoolVal b2) {
            res = new BoolVal(b1.getVal() && b2.getVal());
        } else {
            System.exit(0);
        }

        return res;
    }

    @Override public TimcVal visitPowerExpr(timcParser.PowerExprContext ctx) { return null; }
    @Override public TimcVal visitConstExpr(timcParser.ConstExprContext ctx) { return null; }
    @Override public TimcVal visitIdExpr(timcParser.IdExprContext ctx) { return null; }
    @Override public TimcVal visitFuncAppExpr(timcParser.FuncAppExprContext ctx) { return null; }
    @Override public TimcVal visitEqExpr(timcParser.EqExprContext ctx) { return null; }
    @Override public TimcVal visitCompExpr(timcParser.CompExprContext ctx) { return null; }
    @Override public TimcVal visitParenExpr(timcParser.ParenExprContext ctx) { return null; }
    @Override public TimcVal visitUnaryExpr(timcParser.UnaryExprContext ctx) { return null; }

    // short circuiting not implemented
    @Override public TimcVal visitOrExpr(timcParser.OrExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        TimcVal res = null;
        if (left instanceof BoolVal b1 && right instanceof BoolVal b2) {
            res = new BoolVal(b1.getVal() || b2.getVal());
        } else {
            System.exit(0);
        }

        return res;
    }

    @Override public TimcVal visitFactorExpr(timcParser.FactorExprContext ctx) { return null; }

    @Override public TimcVal visitNumberConst(timcParser.NumberConstContext ctx) {
        return new NumberVal(Integer.parseInt(ctx.NUMBER().getText()));
    }

    @Override public TimcVal visitBoolConst(timcParser.BoolConstContext ctx) {
        if (ctx.BOOL().getText().equals("true")) {
            return new BoolVal(true);
        } else {
            return new BoolVal(false);
        }
    }

    // might also be capturing the "" within the value
    @Override public TimcVal visitStringConst(timcParser.StringConstContext ctx) {
        return new StringVal(ctx.STRING().getText());
    }

    @Override public TimcVal visitBlockConst(timcParser.BlockConstContext ctx) {
        TimcVal res = null;
        switch(ctx.BLOCK().getText()) {
            case "DIRT"  -> res = new BlockVal(BlockVal.BlockType.DIRT);
            case "SAND"  -> res = new BlockVal(BlockVal.BlockType.SAND);
            case "STONE" -> res = new BlockVal(BlockVal.BlockType.STONE);
            case "BRICK" -> res = new BlockVal(BlockVal.BlockType.BRICK);
            case "GLASS" -> res = new BlockVal(BlockVal.BlockType.GLASS);
            case "WOOD"  -> res = new BlockVal(BlockVal.BlockType.WOOD);
            default      -> res = new BlockVal(BlockVal.BlockType.PLANK);
        }
        return res;
    }

    @Override public TimcVal visitRelDirConst(timcParser.RelDirConstContext ctx) {
        TimcVal res = null;
        switch(ctx.RELDIR().getText()) {
            case "UP"    -> res = new RelDirVal(RelDirVal.RelDir.UP);
            case "DOWN"  -> res = new RelDirVal(RelDirVal.RelDir.DOWN);
            case "LEFT"  -> res = new RelDirVal(RelDirVal.RelDir.LEFT);
            case "RIGHT" -> res = new RelDirVal(RelDirVal.RelDir.RIGHT);
            case "FRONT" -> res = new RelDirVal(RelDirVal.RelDir.FRONT);
            default      -> res = new RelDirVal(RelDirVal.RelDir.BACK);
        }
        return res;
    }

    @Override public TimcVal visitAbsDirConst(timcParser.AbsDirConstContext ctx) {
        TimcVal res = null;
        switch(ctx.ABSDIR().getText()) {
            case "NORTH" -> res = new AbsDirVal(AbsDirVal.AbsDir.NORTH);
            case "SOUTH" -> res = new AbsDirVal(AbsDirVal.AbsDir.SOUTH);
            case "EAST"  -> res = new AbsDirVal(AbsDirVal.AbsDir.EAST);
            default      -> res = new AbsDirVal(AbsDirVal.AbsDir.WEST);
        }
        return res;
    }

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
