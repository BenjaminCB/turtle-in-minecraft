// Generated from timc.g4 by ANTLR 4.9.3
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
	 * Enter a parse tree produced by {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(timcParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(timcParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void enterControl_structure(timcParser.Control_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#control_structure}.
	 * @param ctx the parse tree
	 */
	void exitControl_structure(timcParser.Control_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(timcParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(timcParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(timcParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(timcParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(timcParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(timcParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(timcParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(timcParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(timcParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(timcParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(timcParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(timcParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(timcParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(timcParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(timcParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(timcParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(timcParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(timcParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(timcParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(timcParser.ConstantContext ctx);
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
	 * Enter a parse tree produced by {@link timcParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(timcParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(timcParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#anonymous_function}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function(timcParser.Anonymous_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#anonymous_function}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function(timcParser.Anonymous_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link timcParser#function_application}.
	 * @param ctx the parse tree
	 */
	void enterFunction_application(timcParser.Function_applicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link timcParser#function_application}.
	 * @param ctx the parse tree
	 */
	void exitFunction_application(timcParser.Function_applicationContext ctx);
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