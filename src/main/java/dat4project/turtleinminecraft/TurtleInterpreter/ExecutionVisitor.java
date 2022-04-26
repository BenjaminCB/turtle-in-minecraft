package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleInterpreter.Excepton.TypeErrorException;
import dat4project.turtleinminecraft.TurtleInterpreter.Excepton.UndefinedReferenceException;
import dat4project.turtleinminecraft.antlr.timcBaseVisitor;
import dat4project.turtleinminecraft.antlr.timcParser;
import dat4project.turtleinminecraft.antlr.timcLexer;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.checkerframework.checker.units.qual.A;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ExecutionVisitor extends timcBaseVisitor<TimcVal> {
    private SymbolTable<TimcVal> symbolTable;
    private boolean hasBreaked;
    private boolean hasReturned;

    public ExecutionVisitor() {
        symbolTable = new SymbolTable<>();
    }

    @Override public TimcVal visitArray(timcParser.ArrayContext ctx) {
        ArrayVal res = new ArrayVal();

        for (timcParser.ExpressionContext expr : ctx.expression()) {
            TimcVal val = visit(expr);
            res.add(val);
        }

        return res;
    }

    @Override public TimcVal visitStatements(timcParser.StatementsContext ctx) {
        for (timcParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
            if(hasBreaked == true) break;
            if(hasReturned == true) break;
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
    @Override public TimcVal visitBreakStmt(timcParser.BreakStmtContext ctx) { return visitChildren(ctx); }

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
        // continue to visit the while body until the condition evaluates to false
        while(true) {
            TimcVal cond = visit(ctx.expression());
            if (cond instanceof BoolVal b) {
                if (b.getVal()) {
                    visit(ctx.statements());
                    if(hasBreaked == true){
                        hasBreaked = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                System.exit(0);
            }
        }
        return null;
    }

    @Override public TimcVal visitRepeatCtrl(timcParser.RepeatCtrlContext ctx) 
    { 
       TimcVal amount = visit(ctx.expression());
       if(amount instanceof NumberVal a){
           int c = a.getVal();
           for(int i=0;i<c; i++){
               visit(ctx.statements());
               if(hasBreaked == true){
                    hasBreaked = false;    
                    break;
               }
           }
       } else{
           System.exit(0);
       }
        return null; 
    }
    @Override public TimcVal visitForeachCtrl(timcParser.ForeachCtrlContext ctx) 
    { return null; }

    // maybe refactor into a version that does not copy arrays
    @Override public TimcVal visitSwitchCtrl(timcParser.SwitchCtrlContext ctx) {
        TimcVal match = visit(ctx.expression(0));

        // get everything but head of expression list
        List<timcParser.ExpressionContext> cases = new ArrayList<>(ctx.expression());
        cases.remove(0);

        // get clauses and assign default case if nedded
        List<timcParser.StatementsContext> clauses = new ArrayList<>(ctx.statements());
        timcParser.StatementsContext defaultClause =
                clauses.size() > cases.size() ? clauses.remove(clauses.size() - 1) : null;

        // go through the cases
        boolean visitedClause = false;
        for (int i = 0; i < cases.size(); i++) {
            TimcVal _case = visit(cases.get(i));
            if (match.getType() != _case.getType()) System.exit(0);

            if (_case.equals(match)) {
                visitedClause = true;
                visit(clauses.get(i));
                break;
            }
        }

        // visit default case if needed
        if (!visitedClause && defaultClause != null) visit(defaultClause);

        return null;
    }

    // currently always returns null, but could return value of the assignment
    // also probably needs some refactoring
    @Override public TimcVal visitAssignment(timcParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        TimcVal val = visit(ctx.expression());


        int oper = ctx.op.getType();
        if (oper == timcParser.ASSIGN) {
            // for a regular assignment we do not care what the type of val is
            symbolTable.put(id, val);
        } else if (symbolTable.get(id) instanceof NumberVal n && val instanceof NumberVal m) {
            // in a compound assignment id has to be defined and id and val should both be numbers
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
        } else if (ctx.op.getType() == timcParser.CONCAT) {
            // could probably make this more scaleable with an interface
            if (left instanceof StringVal s1 && right instanceof StringVal s2) {
                res = new StringVal(s1.getVal() + s2.getVal());
            } else if (left instanceof ArrayVal a1 && right instanceof ArrayVal a2) {
                ArrayVal temp = new ArrayVal(a1.getVal());
                temp.addAll(a2.getVal());
                res = temp;
            }
        }
        return res;
    }

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

    @Override public TimcVal visitPowerExpr(timcParser.PowerExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        if (left.getType() != TimcType.NUMBER || right.getType() != TimcType.NUMBER) System.exit(0);

        NumberVal n = (NumberVal) left;
        NumberVal m = (NumberVal) right;

        return new NumberVal((int) Math.pow(n.getVal(), m.getVal()));
    }

    @Override public TimcVal visitConstExpr(timcParser.ConstExprContext ctx) {
        return visit(ctx.constant());
    }

    @Override public TimcVal visitIdExpr(timcParser.IdExprContext ctx) {
        TimcVal val = symbolTable.get(ctx.ID().getText());
        if (val == null) System.exit(0);
        return val;
    }

    @Override public TimcVal visitFuncAppExpr(timcParser.FuncAppExprContext ctx) {
        return visit(ctx.function_application());
    }

    @Override public TimcVal visitEqExpr(timcParser.EqExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        // we cannot compare types that are not the same
        if (!left.getClass().equals(right.getClass())) System.exit(0);

        if (ctx.op.getType() == timcParser.EQ) {
            return new BoolVal(left.equals(right));
        } else {
            return new BoolVal(!left.equals(right));
        }
    }

    @Override public TimcVal visitCompExpr(timcParser.CompExprContext ctx) { 
        TimcVal res = null;
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        if(left instanceof NumberVal l && right instanceof NumberVal r){
            if(ctx.op.getType() == timcParser.GT){
                res = new BoolVal( l.getVal() > r.getVal() );
            }
            else if(ctx.op.getType() == timcParser.GTEQ){
                res = new BoolVal( l.getVal() >= r.getVal() );
                
            }
            else if(ctx.op.getType() == timcParser.LT){
                res = new BoolVal( l.getVal() < r.getVal() );
            }
            else if(ctx.op.getType() == timcParser.LTEQ){
                res = new BoolVal( l.getVal() <= r.getVal() );
            }
            else System.exit(0);
        } else System.exit(0);

        return res; }

    @Override public TimcVal visitParenExpr(timcParser.ParenExprContext ctx) {
        return visit(ctx.expression());
    }

    @Override public TimcVal visitUnaryExpr(timcParser.UnaryExprContext ctx) {
        TimcVal val = visit(ctx.expression());

        TimcVal res = null;

        if (ctx.op.getType() == timcParser.NOT && val instanceof BoolVal b) {
            res = new BoolVal(!b.getVal());
        } else if (ctx.op.getType() == timcParser.SUB && val instanceof NumberVal n) {
            res = new NumberVal(-n.getVal());
        } else {
            System.exit(0);
        }

        return res;
    }

    @Override public TimcVal visitIndexExpr(timcParser.IndexExprContext ctx) { return visitChildren(ctx); }

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

    @Override public TimcVal visitFactorExpr(timcParser.FactorExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        TimcVal res = null;
        if (left instanceof NumberVal n && right instanceof NumberVal m) {
            switch (ctx.op.getType()) {
                case timcParser.DIV -> {
                    if (m.getVal() == 0) System.exit(0);
                    res = new NumberVal(n.getVal() / m.getVal());
                }
                case timcParser.MOD -> {
                    if (m.getVal() == 0) System.exit(0);
                    res = new NumberVal(n.getVal() % m.getVal());
                }
                default -> res = new NumberVal(n.getVal() * m.getVal());
            }
        } else {
            System.exit(0);
        }

        return res;
    }

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

    @Override public TimcVal visitArrayConst(timcParser.ArrayConstContext ctx) {
        return visit(ctx.array());
    }

    @Override public TimcVal visitNothingConst(timcParser.NothingConstContext ctx) {
        return new NothingVal();
    }

    @Override public TimcVal visitAnonFuncConst(timcParser.AnonFuncConstContext ctx) { return null; }

    @Override public TimcVal visitDclFunc(timcParser.DclFuncContext ctx) {
        FunctionVal func = new FunctionVal(getParameters(ctx.parameters()), ctx.statements(), symbolTable);

        // don't think this solves the recursion problem
        func.getDeclarationTable().put(ctx.ID().getText(), func);
        return null;
    }

    @Override public TimcVal visitAnonFunc(timcParser.AnonFuncContext ctx) { return null; }
    @Override public TimcVal visitBuildInFunc(timcParser.BuildInFuncContext ctx) { return visitChildren(ctx); }
    @Override public TimcVal visitStmtAnonFunc(timcParser.StmtAnonFuncContext ctx) { return null; }
    @Override public TimcVal visitLambdaAnonFunc(timcParser.LambdaAnonFuncContext ctx) { return visitChildren(ctx); }

    @Override public TimcVal visitIdFuncApp(timcParser.IdFuncAppContext ctx) {
        String id = ctx.ID().getText();
        TimcVal val = symbolTable.get(id);

        // check for undefined reference and type error
        if (val == null) System.exit(0);
        if (val.getType() != TimcType.FUNCTION) System.exit(0);

        List<TimcVal> args = getArguments(ctx.arguments());

        // save current table and retrieve function value
        SymbolTable<TimcVal> savedTable = symbolTable;
        FunctionVal func = (FunctionVal) val;
        symbolTable = func.getDeclarationTable();

        // has the correct amount arguments been applied to the function
        if (args.size() != func.getParams().size()) System.exit(0);

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

    @Override public TimcVal visitForwardFunc(timcParser.ForwardFuncContext ctx) { return visitChildren(ctx); }
    @Override public TimcVal visitBackwardFunc(timcParser.BackwardFuncContext ctx) { return visitChildren(ctx); }
    @Override public TimcVal visitUpFunc(timcParser.UpFuncContext ctx) { return visitChildren(ctx); }
    @Override public TimcVal visitDownFunc(timcParser.DownFuncContext ctx) { return visitChildren(ctx); }
    @Override public TimcVal visitLookFunc(timcParser.LookFuncContext ctx) { return visitChildren(ctx); }
    @Override public TimcVal visitTurnFunc(timcParser.TurnFuncContext ctx) { return visitChildren(ctx); }
    @Override public TimcVal visitPrintFunc(timcParser.PrintFuncContext ctx) { return visitChildren(ctx); }
    @Override public TimcVal visitFacingFunc(timcParser.FacingFuncContext ctx) { return visitChildren(ctx); }
    @Override public TimcVal visitPositionFunc(timcParser.PositionFuncContext ctx) { return visitChildren(ctx); }

    
    @Override public TimcVal visitLengthFunc(timcParser.LengthFuncContext ctx) { 
        TimcVal o = visit(ctx.expression());
        NumberVal n = null;
        if(o instanceof ArrayVal arr){
            n = new NumberVal(arr.val.size());
        }
        else System.exit(0);

        return n;
    }



    @Override public TimcVal visitParameters(timcParser.ParametersContext ctx) { return null; }
    public List<String> getParameters(timcParser.ParametersContext ctx) {
        List<String> res = new ArrayList<>();
        for (TerminalNode node : ctx.ID()) {
            res.add(node.getText());
        }
        return res;
    }

    @Override public TimcVal visitArguments(timcParser.ArgumentsContext ctx) { return null; }
    public List<TimcVal> getArguments(timcParser.ArgumentsContext ctx) {
        List<TimcVal> res = new ArrayList<>();
        for (timcParser.ExpressionContext expr : ctx.expression()) {
            res.add(visit(expr));
        }
        return res;
    }
}
