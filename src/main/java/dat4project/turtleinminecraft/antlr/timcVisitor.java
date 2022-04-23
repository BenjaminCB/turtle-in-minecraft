package dat4project.turtleinminecraft.antlr;

// Generated from timc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link timcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface timcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link timcParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(timcParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link timcParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(timcParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(timcParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(timcParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncStmt(timcParser.FuncStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CtrlStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrlStmt(timcParser.CtrlStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RetStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStmt(timcParser.RetStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCtrl(timcParser.IfCtrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCtrl(timcParser.WhileCtrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatCtrl(timcParser.RepeatCtrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForeachCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachCtrl(timcParser.ForeachCtrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCtrl(timcParser.SwitchCtrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link timcParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(timcParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpr(timcParser.TermExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(timcParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(timcParser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpr(timcParser.ConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(timcParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncAppExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncAppExpr(timcParser.FuncAppExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(timcParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(timcParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(timcParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(timcParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(timcParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorExpr(timcParser.FactorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberConst(timcParser.NumberConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(timcParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConst(timcParser.StringConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockConst(timcParser.BlockConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelDirConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelDirConst(timcParser.RelDirConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AbsDirConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsDirConst(timcParser.AbsDirConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListConst(timcParser.ListConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnonFuncConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonFuncConst(timcParser.AnonFuncConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DclFunc}
	 * labeled alternative in {@link timcParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclFunc(timcParser.DclFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnonFunc}
	 * labeled alternative in {@link timcParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonFunc(timcParser.AnonFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtAnonFunc}
	 * labeled alternative in {@link timcParser#anonymous_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAnonFunc(timcParser.StmtAnonFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaAnanFunc}
	 * labeled alternative in {@link timcParser#anonymous_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaAnanFunc(timcParser.LambdaAnanFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdFuncApp}
	 * labeled alternative in {@link timcParser#function_application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdFuncApp(timcParser.IdFuncAppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstFuncApp}
	 * labeled alternative in {@link timcParser#function_application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFuncApp(timcParser.ConstFuncAppContext ctx);
	/**
	 * Visit a parse tree produced by {@link timcParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(timcParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link timcParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(timcParser.ArgumentsContext ctx);
}