// Generated from timc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link timcParser}.
 */
public interface timcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link timcParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(timcParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(timcParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(timcParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(timcParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(timcParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(timcParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(timcParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(timcParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncStmt(timcParser.FuncStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncStmt(timcParser.FuncStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncAppStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncAppStmt(timcParser.FuncAppStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncAppStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncAppStmt(timcParser.FuncAppStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CtrlStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCtrlStmt(timcParser.CtrlStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CtrlStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCtrlStmt(timcParser.CtrlStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RetStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRetStmt(timcParser.RetStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RetStmt}
	 * labeled alternative in {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRetStmt(timcParser.RetStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterIfCtrl(timcParser.IfCtrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitIfCtrl(timcParser.IfCtrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterWhileCtrl(timcParser.WhileCtrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitWhileCtrl(timcParser.WhileCtrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterRepeatCtrl(timcParser.RepeatCtrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitRepeatCtrl(timcParser.RepeatCtrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForeachCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterForeachCtrl(timcParser.ForeachCtrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForeachCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitForeachCtrl(timcParser.ForeachCtrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCtrl(timcParser.SwitchCtrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchCtrl}
	 * labeled alternative in {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCtrl(timcParser.SwitchCtrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(timcParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(timcParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTermExpr(timcParser.TermExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTermExpr(timcParser.TermExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(timcParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(timcParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(timcParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(timcParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(timcParser.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(timcParser.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(timcParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(timcParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncAppExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncAppExpr(timcParser.FuncAppExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncAppExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncAppExpr(timcParser.FuncAppExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(timcParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(timcParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(timcParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(timcParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(timcParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(timcParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(timcParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(timcParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(timcParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(timcParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFactorExpr(timcParser.FactorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorExpr}
	 * labeled alternative in {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFactorExpr(timcParser.FactorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumberConst(timcParser.NumberConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumberConst(timcParser.NumberConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(timcParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(timcParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringConst(timcParser.StringConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringConst(timcParser.StringConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBlockConst(timcParser.BlockConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBlockConst(timcParser.BlockConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelDirConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterRelDirConst(timcParser.RelDirConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelDirConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitRelDirConst(timcParser.RelDirConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbsDirConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterAbsDirConst(timcParser.AbsDirConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbsDirConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitAbsDirConst(timcParser.AbsDirConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterListConst(timcParser.ListConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitListConst(timcParser.ListConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnonFuncConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterAnonFuncConst(timcParser.AnonFuncConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnonFuncConst}
	 * labeled alternative in {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitAnonFuncConst(timcParser.AnonFuncConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DclFunc}
	 * labeled alternative in {@link timcParser#function}.
	 * @param ctx the parse tree
	 */
	void enterDclFunc(timcParser.DclFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DclFunc}
	 * labeled alternative in {@link timcParser#function}.
	 * @param ctx the parse tree
	 */
	void exitDclFunc(timcParser.DclFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnonFunc}
	 * labeled alternative in {@link timcParser#function}.
	 * @param ctx the parse tree
	 */
	void enterAnonFunc(timcParser.AnonFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnonFunc}
	 * labeled alternative in {@link timcParser#function}.
	 * @param ctx the parse tree
	 */
	void exitAnonFunc(timcParser.AnonFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtAnonFunc}
	 * labeled alternative in {@link timcParser#anonymous_function}.
	 * @param ctx the parse tree
	 */
	void enterStmtAnonFunc(timcParser.StmtAnonFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtAnonFunc}
	 * labeled alternative in {@link timcParser#anonymous_function}.
	 * @param ctx the parse tree
	 */
	void exitStmtAnonFunc(timcParser.StmtAnonFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaAnanFunc}
	 * labeled alternative in {@link timcParser#anonymous_function}.
	 * @param ctx the parse tree
	 */
	void enterLambdaAnanFunc(timcParser.LambdaAnanFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaAnanFunc}
	 * labeled alternative in {@link timcParser#anonymous_function}.
	 * @param ctx the parse tree
	 */
	void exitLambdaAnanFunc(timcParser.LambdaAnanFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdFuncApp}
	 * labeled alternative in {@link timcParser#function_application}.
	 * @param ctx the parse tree
	 */
	void enterIdFuncApp(timcParser.IdFuncAppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdFuncApp}
	 * labeled alternative in {@link timcParser#function_application}.
	 * @param ctx the parse tree
	 */
	void exitIdFuncApp(timcParser.IdFuncAppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFuncApp}
	 * labeled alternative in {@link timcParser#function_application}.
	 * @param ctx the parse tree
	 */
	void enterConstFuncApp(timcParser.ConstFuncAppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFuncApp}
	 * labeled alternative in {@link timcParser#function_application}.
	 * @param ctx the parse tree
	 */
	void exitConstFuncApp(timcParser.ConstFuncAppContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(timcParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(timcParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(timcParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(timcParser.ArgumentsContext ctx);
}