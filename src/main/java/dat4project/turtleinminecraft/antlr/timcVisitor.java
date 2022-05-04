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
	 * Visit a parse tree produced by {@link timcParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(timcParser.ArrayContext ctx);
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
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(timcParser.BreakStmtContext ctx);
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
	 * Visit a parse tree produced by the {@code SingleAssign}
	 * labeled alternative in {@link timcParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleAssign(timcParser.SingleAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundAssign}
	 * labeled alternative in {@link timcParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundAssign(timcParser.CompoundAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiAssign}
	 * labeled alternative in {@link timcParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiAssign(timcParser.MultiAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link timcParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(timcParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link timcParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(timcParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link timcParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(timcParser.Expression_listContext ctx);
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
	 * Visit a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(timcParser.CompExprContext ctx);
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
	 * Visit a parse tree produced by the {@code IndexExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpr(timcParser.IndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpr(timcParser.PowerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(timcParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(timcParser.ParenExprContext ctx);
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
	 * Visit a parse tree produced by the {@code NothingConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothingConst(timcParser.NothingConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayConst(timcParser.ArrayConstContext ctx);
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
	 * Visit a parse tree produced by the {@code LambdaAnonFunc}
	 * labeled alternative in {@link timcParser#anonymous_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaAnonFunc(timcParser.LambdaAnonFuncContext ctx);
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
	 * Visit a parse tree produced by the {@code BuildInFunc}
	 * labeled alternative in {@link timcParser#function_application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildInFunc(timcParser.BuildInFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForwardFunc}
	 * labeled alternative in {@link timcParser#build_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForwardFunc(timcParser.ForwardFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BackwardFunc}
	 * labeled alternative in {@link timcParser#build_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackwardFunc(timcParser.BackwardFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UpFunc}
	 * labeled alternative in {@link timcParser#build_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpFunc(timcParser.UpFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DownFunc}
	 * labeled alternative in {@link timcParser#build_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDownFunc(timcParser.DownFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LookFunc}
	 * labeled alternative in {@link timcParser#build_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLookFunc(timcParser.LookFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TurnFunc}
	 * labeled alternative in {@link timcParser#build_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTurnFunc(timcParser.TurnFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintFunc}
	 * labeled alternative in {@link timcParser#build_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunc(timcParser.PrintFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FacingFunc}
	 * labeled alternative in {@link timcParser#build_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacingFunc(timcParser.FacingFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionFunc}
	 * labeled alternative in {@link timcParser#build_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunc(timcParser.PositionFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LengthFunc}
	 * labeled alternative in {@link timcParser#build_in_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthFunc(timcParser.LengthFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link timcParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(timcParser.ParametersContext ctx);
}