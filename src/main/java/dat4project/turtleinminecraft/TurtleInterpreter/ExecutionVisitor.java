package dat4project.turtleinminecraft.TurtleInterpreter;

import dat4project.turtleinminecraft.TurtleInterpreter.Exception.TimcException;
import dat4project.turtleinminecraft.antlr.timcBaseVisitor;
import dat4project.turtleinminecraft.antlr.timcParser;
import dat4project.turtleinminecraft.antlr.timcLexer;
import net.minecraft.util.Identifier;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.checkerframework.checker.units.qual.A;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ExecutionVisitor extends timcBaseVisitor<TimcVal> {
    private SymbolTable symbolTable;
    private boolean hasBreaked;
    private boolean hasReturned;

    public ExecutionVisitor() {
        symbolTable = new SymbolTable();
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
            if (hasBreaked || hasReturned) break;
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

    @Override public TimcVal visitRetStmt(timcParser.RetStmtContext ctx) {
        ListVal values = new ListVal(getExpression_list(ctx.expression_list()));
        symbolTable.ret = values;
        hasReturned = true;
        return null;
    }

    @Override public TimcVal visitBreakStmt(timcParser.BreakStmtContext ctx) {
        hasBreaked = true;
        return null;
    }

    @Override public TimcVal visitIfCtrl(timcParser.IfCtrlContext ctx) {
        List<timcParser.ExpressionContext> conds = ctx.expression();
        List<timcParser.StatementsContext> clauses = ctx.statements();

        int i;
        boolean executeElse = true;
        // run through the conditionals and execute first to evaluate to true
        for (i = 0; i < conds.size(); i++) {
            timcParser.ExpressionContext cond = conds.get(i);
            TimcVal val = visit(cond);
            if (val instanceof BoolVal b) {
                if (b.getVal()) {
                    executeElse = false;
                    visit(clauses.get(i));
                    break;
                }
            } else {
                throw new TimcException(cond.getText() + ": does not evaluate to a bool");
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
                    if (hasBreaked) {
                        hasBreaked = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                throw new TimcException(ctx.expression().getText() + ": does not evaluate to a bool");
            }
        }
        return null;
    }

    @Override public TimcVal visitRepeatCtrl(timcParser.RepeatCtrlContext ctx) 
    { 
       TimcVal amount = visit(ctx.expression());
       if (amount instanceof NumberVal a) {
           int c = a.getVal();
           for (int i = 0; i < c; i++) {
               visit(ctx.statements());
               if (hasBreaked) {
                    hasBreaked = false;    
                    break;
               }
           }
       } else {
           throw new TimcException(ctx.expression().getText() + ": does not evaluate to a number");
       }
       return null;
    }
    @Override public TimcVal visitForeachCtrl(timcParser.ForeachCtrlContext ctx) { 
        String identifier = ctx.ID().getText();
        TimcVal o = visit(ctx.expression());
        if(o instanceof ArrayVal arr){
            for (TimcVal a : arr.getVal()) {
                symbolTable.put(identifier, a);
                visit(ctx.statements());
                if(hasBreaked){
                    hasBreaked = false;
                    break;
                }
            }
        } else {
            throw new TimcException(ctx.expression().getText() + ": does not evaluate to an array");
        }

        return null; 
    }

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
            if (match.getType() != _case.getType())
                throw new TimcException(cases.get(i).getText() + "type mismatch");

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

    // TODO decide whether array index should be allowed in declaration, currently is not
    @Override public TimcVal visitSingleAssign(timcParser.SingleAssignContext ctx) {
        TimcVal assignee = visit(ctx.expression());
        if (assignee instanceof ListVal)
            throw new TimcException(ctx.expression().getText() + "evaluates to a list");

        String id = ctx.identifier().ID().getText();
        List<timcParser.ExpressionContext> indexExprs = ctx.identifier().expression();

        if (indexExprs.isEmpty()) {
            symbolTable.put(id, assignee);
        } else if (symbolTable.get(id) instanceof ArrayVal a) {
            List<TimcVal> indexes = getExpression(indexExprs);
            a.setNested(indexes, assignee);
        } else {
            throw new TimcException(id + ": is not an array");
        }
        return null;
    }

    @Override public TimcVal visitCompoundAssign(timcParser.CompoundAssignContext ctx) {
        String id = ctx.identifier().ID().getText();
        TimcVal v = symbolTable.get(id);

        List<timcParser.ExpressionContext> indexExprs = ctx.identifier().expression();
        boolean isArray = !indexExprs.isEmpty();

        // if the right hand side is not a number we cannot do compound assignment
        if (visit(ctx.expression()) instanceof NumberVal n) {
            if (!isArray && v instanceof NumberVal m) {
                symbolTable.put(id, NumberVal.operation(m, n, ctx.op.getType()));
            } else if (isArray && v instanceof ArrayVal a) {
                List<TimcVal> is = getExpression(indexExprs);
                if (a.getNested(is) instanceof NumberVal m) {
                    a.setNested(is, NumberVal.operation(m, n, ctx.op.getType()));
                } else {
                    throw new TimcException("index not a number");
                }
            } else {
                throw new TimcException(id + ": was used as array, but is not");
            }
        } else {
            throw new TimcException(ctx.expression().getText() + ": is not a number");
        }
        return null;
    }

    @Override public TimcVal visitMultiAssign(timcParser.MultiAssignContext ctx) {
        ListVal vals = new ListVal(getExpression_list(ctx.expression_list()));
        List<timcParser.IdentifierContext> idents = ctx.identifier_list().identifier();

        if (vals.getVal().size() != idents.size()) {
            int start = ctx.start.getLine();
            int end = ctx.stop.getLine();
            throw new TimcException(ctx.getText() + "; not an equal number");
        }

        for (int i = 0; i < vals.getVal().size(); i++) {
            TimcVal val = vals.getVal().get(i);
            timcParser.IdentifierContext ident = idents.get(i);
            String id = ident.ID().getText();
            if (ident.expression().isEmpty()) {
                symbolTable.put(id, val);
            } else if (symbolTable.get(id) instanceof ArrayVal a) {
                    List<TimcVal> is = getExpression(ident.expression());
                    a.setNested(is, val);
            } else {
                throw new TimcException(id + ": is not an array");
            }
        }
        return null;
    }

    @Override public TimcVal visitIdentifier(timcParser.IdentifierContext ctx) { return visitChildren(ctx); }
    @Override public TimcVal visitIdentifier_list(timcParser.Identifier_listContext ctx) { return visitChildren(ctx); }

    @Override public TimcVal visitExpression_list(timcParser.Expression_listContext ctx) { return null; }
    private List<TimcVal> getExpression_list(timcParser.Expression_listContext ctx) {
        return getExpression(ctx.expression());
    }

    // TODO error handling
    @Override public TimcVal visitTermExpr(timcParser.TermExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        int oper = ctx.op.getType();
        boolean isConcat = oper == timcParser.CONCAT;
        TimcVal res = null;
        if (!isConcat && left instanceof NumberVal n1 && right instanceof NumberVal n2) {
            res = NumberVal.operation(n1, n2, oper);
        } else if (isConcat && left instanceof StringVal s1 && right instanceof StringVal s2) {
            res = StringVal.operation(s1, s2, oper);
        } else if (isConcat && left instanceof ArrayVal a1 && right instanceof ArrayVal a2) {
            res = ArrayVal.operation(a1, a2, oper);
        } else {
            throw new TimcException(ctx.getText() + ": type mismatch");
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
            throw new TimcException(ctx.getText() + ": type mismatch");
        }

        return res;
    }

    @Override public TimcVal visitPowerExpr(timcParser.PowerExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        if (left.getType() != TimcType.NUMBER || right.getType() != TimcType.NUMBER)
            throw new TimcException(ctx.getText() + ": type mismatch");

        NumberVal n = (NumberVal) left;
        NumberVal m = (NumberVal) right;

        return new NumberVal((int) Math.pow(n.getVal(), m.getVal()));
    }

    @Override public TimcVal visitConstExpr(timcParser.ConstExprContext ctx) {
        return visit(ctx.constant());
    }

    @Override public TimcVal visitIdExpr(timcParser.IdExprContext ctx) {
        TimcVal val = symbolTable.get(ctx.ID().getText());
        return val;
    }

    @Override public TimcVal visitFuncAppExpr(timcParser.FuncAppExprContext ctx) {
        return visit(ctx.function_application());
    }

    @Override public TimcVal visitEqExpr(timcParser.EqExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        // List cannot be compared
        if (left instanceof ListVal && right instanceof ListVal)
            throw new TimcException(ctx.getText() + ": tried to check equality between lists");

        // we cannot compare types that are not the same
        if (!left.getClass().equals(right.getClass()))
            throw new TimcException(ctx.getText() + ": type mismatch");

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

        if (left instanceof NumberVal l && right instanceof NumberVal r) {
            res = BoolVal.operation(l, r, ctx.op.getType());
        } else {
            throw new TimcException(ctx.getText() + ": type mismatch");
        }

        return res;
    }

    @Override public TimcVal visitParenExpr(timcParser.ParenExprContext ctx) {
        return visit(ctx.expression());
    }

    @Override public TimcVal visitUnaryExpr(timcParser.UnaryExprContext ctx) {
        TimcVal val = visit(ctx.expression());

        TimcVal res = null;

        int oper = ctx.op.getType();
        if (oper == timcParser.NOT && val instanceof BoolVal b) {
            res = BoolVal.operation(b, timcParser.NOT);
        } else if (oper == timcParser.SUB && val instanceof NumberVal n) {
            res = NumberVal.operation(n, timcParser.SUB);
        } else {
            throw new TimcException(ctx.expression().getText() + ": type mismatch");
        }

        return res;
    }

    @Override public TimcVal visitIndexExpr(timcParser.IndexExprContext ctx) { 
        TimcVal value = null;
        
        if (visit(ctx.expression(0)) instanceof ArrayVal arr) {
            if (visit(ctx.expression(1)) instanceof NumberVal n) {
                value = arr.getVal().get(n.getVal());
            } else {
                throw new TimcException(ctx.expression(1).getText() + ": is not a number");
            }
        } else {
            throw new TimcException(ctx.expression(0).getText() + ": is not aa array");
        }
        
        return value;
    }

    @Override public TimcVal visitOrExpr(timcParser.OrExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        TimcVal res = null;
        if (left instanceof BoolVal b1 && right instanceof BoolVal b2) {
            res = BoolVal.operation(b1, b2, timcParser.OR);
        } else {
            throw new TimcException(ctx.getText() + ": type mismatch");
        }

        return res;
    }

    @Override public TimcVal visitFactorExpr(timcParser.FactorExprContext ctx) {
        TimcVal left = visit(ctx.expression(0));
        TimcVal right = visit(ctx.expression(1));

        TimcVal res = null;
        if (left instanceof NumberVal n && right instanceof NumberVal m) {
            res = NumberVal.operation(n, m, ctx.op.getType());
        } else {
            throw new TimcException(ctx.getText() + ": type mismatch");
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
        TimcVal res;
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
        TimcVal res;
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
        TimcVal res;
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

    @Override public TimcVal visitAnonFuncConst(timcParser.AnonFuncConstContext ctx) {
        return visit(ctx.anonymous_function());
    }

    // TODO add return nothing to end
    @Override public TimcVal visitDclFunc(timcParser.DclFuncContext ctx) {
        FunctionVal func = new FunctionVal(getParameters(ctx.parameters()), ctx.statements(), symbolTable);

        // TODO don't think this solves the recursion problem
        func.getDeclarationTable().put(ctx.ID().getText(), func);
        return null;
    }

    @Override public TimcVal visitAnonFunc(timcParser.AnonFuncContext ctx) {
        return visit(ctx.anonymous_function());
    }
    @Override public TimcVal visitBuildInFunc(timcParser.BuildInFuncContext ctx) {
        return visit(ctx.build_in_func());
    }
    @Override public TimcVal visitStmtAnonFunc(timcParser.StmtAnonFuncContext ctx) {
        // Copy pasta from visitDclFunc, as they do the same
        FunctionVal func = new FunctionVal(getParameters(ctx.parameters()), ctx.statements(), symbolTable);
        return null;
    }
    @Override public TimcVal visitLambdaAnonFunc(timcParser.LambdaAnonFuncContext ctx) { return visitChildren(ctx); }

    @Override public TimcVal visitIdFuncApp(timcParser.IdFuncAppContext ctx) {
        String id = ctx.ID().getText();
        TimcVal val = symbolTable.get(id);

        // check for undefined reference and type error
        if (val.getType() != TimcType.FUNCTION)
            throw new TimcException(id + ": is not a function");

        List<TimcVal> args = getExpression_list(ctx.expression_list());

        // save current table and retrieve function value
        SymbolTable savedTable = symbolTable;
        FunctionVal func = (FunctionVal) val;
        symbolTable = func.getDeclarationTable();

        // has the correct amount arguments been applied to the function
        if (args.size() != func.getParams().size())
            throw new TimcException(id + ": too many or few arguments applied");

        // execute function body
        symbolTable.enterScope();
        for (int i = 0; i < args.size(); i++) {
            symbolTable.put(func.getParams().get(i), args.get(i));
        }
        symbolTable.ret = new NothingVal();
        visitStatements(func.getCtx());
        symbolTable.exitScope();
        hasReturned = false;
    
        // return to normal with new return value
        savedTable.ret = symbolTable.ret;
        symbolTable = savedTable;

        return symbolTable.ret;
    }

    @Override public TimcVal visitConstFuncApp(timcParser.ConstFuncAppContext ctx) {
        if (visit(ctx.anonymous_function()) instanceof FunctionVal f) {
            List<String> params = f.getParams();
            List<TimcVal> args = getExpression_list(ctx.expression_list());
            if (params.size() != args.size())
                throw new TimcException(ctx.getText() + ": too many or too few arguments applied");

            // TODO check for recursion error
            symbolTable.enterScope();
            for (int i = 0; i < params.size(); i++) {
                symbolTable.put(params.get(i), args.get(i));
            }
            visit(f.getCtx());
            symbolTable.exitScope();
            hasReturned = false;
        } else {
            throw new TimcException(ctx.getText() + ": anon function is not a function");
        }

        return symbolTable.ret;
    }

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
        if (o instanceof ArrayVal arr) {
            n = new NumberVal(arr.getVal().size());
        } else {
            throw new TimcException(ctx.getText() + ": tried to take length of non array");
        }

        return n;
    }

    @Override public TimcVal visitParameters(timcParser.ParametersContext ctx) { return null; }
    private List<String> getParameters(timcParser.ParametersContext ctx) {
        List<String> res = new ArrayList<>();
        for (TerminalNode node : ctx.ID()) {
            res.add(node.getText());
        }
        return res;
    }

    private List<TimcVal> getExpression(List<timcParser.ExpressionContext> exprs) {
        List<TimcVal> res = new ArrayList<>();
        for (timcParser.ExpressionContext expr : exprs) {
            res.add(visit(expr));
        }
        return res;
    }
}