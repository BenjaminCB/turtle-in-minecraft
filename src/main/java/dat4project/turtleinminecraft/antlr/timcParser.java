package dat4project.turtleinminecraft.antlr;

// Generated from timc.g4 by ANTLR 4.9.2
 
	import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class timcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		NUMBER=32, BOOL=33, STRING=34, NOTHING=35, BLOCK=36, RELDIR=37, ABSDIR=38, 
		NOT=39, SUB=40, POWER=41, MULT=42, DIV=43, MOD=44, ADD=45, CONCAT=46, 
		LT=47, LTEQ=48, GT=49, GTEQ=50, EQ=51, NEQ=52, AND=53, OR=54, ASSIGN=55, 
		ADDASSIGN=56, SUBASSIGN=57, MULTASSIGN=58, DIVASSIGN=59, MODASSIGN=60, 
		POWERASSIGN=61, ID=62, WS=63, COMMENT=64, INVALID=65;
	public static final int
		RULE_array = 0, RULE_statements = 1, RULE_statement = 2, RULE_control_structure = 3, 
		RULE_assignment = 4, RULE_identifier = 5, RULE_identifier_list = 6, RULE_expression_list = 7, 
		RULE_expression = 8, RULE_constant = 9, RULE_function = 10, RULE_anonymous_function = 11, 
		RULE_function_application = 12, RULE_build_in_func = 13, RULE_parameters = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"array", "statements", "statement", "control_structure", "assignment", 
			"identifier", "identifier_list", "expression_list", "expression", "constant", 
			"function", "anonymous_function", "function_application", "build_in_func", 
			"parameters"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'return'", "'break'", "'if'", "'do'", "'else'", 
			"'end'", "'while'", "'repeat'", "'foreach'", "'in'", "'switch'", "'case'", 
			"'default'", "'('", "')'", "'function'", "'fn'", "'->'", "'forward'", 
			"'backward'", "'up'", "'down'", "'look'", "'turn'", "'print'", "'facing'", 
			"'position'", "'length'", null, null, null, "'nothing'", null, null, 
			null, "'not'", "'-'", "'^'", "'*'", "'/'", "'%'", "'+'", "'++'", "'<'", 
			"'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'^='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NUMBER", "BOOL", "STRING", 
			"NOTHING", "BLOCK", "RELDIR", "ABSDIR", "NOT", "SUB", "POWER", "MULT", 
			"DIV", "MOD", "ADD", "CONCAT", "LT", "LTEQ", "GT", "GTEQ", "EQ", "NEQ", 
			"AND", "OR", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULTASSIGN", "DIVASSIGN", 
			"MODASSIGN", "POWERASSIGN", "ID", "WS", "COMMENT", "INVALID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "timc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public timcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB) | (1L << ID))) != 0)) {
				{
				{
				setState(31);
				expression(0);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(32);
					match(T__1);
					setState(33);
					expression(0);
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CtrlStmtContext extends StatementContext {
		public Control_structureContext control_structure() {
			return getRuleContext(Control_structureContext.class,0);
		}
		public CtrlStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitCtrlStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStmtContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStmtContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtContext extends StatementContext {
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncStmtContext extends StatementContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FuncStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitFuncStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RetStmtContext extends StatementContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public RetStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitRetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				assignment();
				}
				break;
			case 2:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				expression(0);
				}
				break;
			case 3:
				_localctx = new FuncStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				function();
				}
				break;
			case 4:
				_localctx = new CtrlStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				control_structure();
				}
				break;
			case 5:
				_localctx = new RetStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(T__3);
				setState(56);
				expression_list();
				}
				break;
			case 6:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Control_structureContext extends ParserRuleContext {
		public Control_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_structure; }
	 
		public Control_structureContext() { }
		public void copyFrom(Control_structureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RepeatCtrlContext extends Control_structureContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public RepeatCtrlContext(Control_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitRepeatCtrl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForeachCtrlContext extends Control_structureContext {
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ForeachCtrlContext(Control_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitForeachCtrl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfCtrlContext extends Control_structureContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfCtrlContext(Control_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitIfCtrl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchCtrlContext extends Control_structureContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public SwitchCtrlContext(Control_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitSwitchCtrl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileCtrlContext extends Control_structureContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public WhileCtrlContext(Control_structureContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitWhileCtrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_structureContext control_structure() throws RecognitionException {
		Control_structureContext _localctx = new Control_structureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_control_structure);
		int _la;
		try {
			int _alt;
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new IfCtrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__5);
				setState(61);
				expression(0);
				setState(62);
				match(T__6);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB) | (1L << ID))) != 0)) {
					{
					setState(63);
					statements();
					}
				}

				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(66);
						match(T__7);
						setState(67);
						match(T__5);
						setState(68);
						expression(0);
						setState(69);
						match(T__6);
						setState(70);
						statements();
						}
						} 
					}
					setState(76);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(77);
					match(T__7);
					setState(78);
					match(T__6);
					setState(79);
					statements();
					}
				}

				setState(82);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new WhileCtrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__9);
				setState(85);
				expression(0);
				setState(86);
				match(T__6);
				setState(87);
				statements();
				setState(88);
				match(T__8);
				}
				break;
			case T__10:
				_localctx = new RepeatCtrlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(T__10);
				setState(91);
				expression(0);
				setState(92);
				match(T__6);
				setState(93);
				statements();
				setState(94);
				match(T__8);
				}
				break;
			case T__11:
				_localctx = new ForeachCtrlContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(T__11);
				setState(97);
				match(ID);
				setState(98);
				match(T__12);
				setState(99);
				expression(0);
				setState(100);
				match(T__6);
				setState(101);
				statements();
				setState(102);
				match(T__8);
				}
				break;
			case T__13:
				_localctx = new SwitchCtrlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				match(T__13);
				setState(105);
				expression(0);
				setState(106);
				match(T__6);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(107);
					match(T__14);
					setState(108);
					expression(0);
					setState(109);
					match(T__6);
					setState(110);
					statements();
					setState(111);
					match(T__8);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(118);
					match(T__15);
					setState(119);
					match(T__6);
					setState(120);
					statements();
					setState(121);
					match(T__8);
					}
				}

				setState(125);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleAssignContext extends AssignmentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(timcParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitSingleAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompoundAssignContext extends AssignmentContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADDASSIGN() { return getToken(timcParser.ADDASSIGN, 0); }
		public TerminalNode SUBASSIGN() { return getToken(timcParser.SUBASSIGN, 0); }
		public TerminalNode MULTASSIGN() { return getToken(timcParser.MULTASSIGN, 0); }
		public TerminalNode DIVASSIGN() { return getToken(timcParser.DIVASSIGN, 0); }
		public TerminalNode MODASSIGN() { return getToken(timcParser.MODASSIGN, 0); }
		public TerminalNode POWERASSIGN() { return getToken(timcParser.POWERASSIGN, 0); }
		public CompoundAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitCompoundAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiAssignContext extends AssignmentContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(timcParser.ASSIGN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public MultiAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitMultiAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SingleAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				identifier();
				setState(130);
				match(ASSIGN);
				setState(131);
				expression(0);
				}
				break;
			case 2:
				_localctx = new CompoundAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				identifier();
				setState(134);
				((CompoundAssignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDASSIGN) | (1L << SUBASSIGN) | (1L << MULTASSIGN) | (1L << DIVASSIGN) | (1L << MODASSIGN) | (1L << POWERASSIGN))) != 0)) ) {
					((CompoundAssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				expression(0);
				}
				break;
			case 3:
				_localctx = new MultiAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				identifier_list();
				setState(138);
				match(ASSIGN);
				setState(139);
				expression_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ID);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(144);
				match(T__0);
				setState(145);
				expression(0);
				setState(146);
				match(T__2);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			identifier();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(154);
				match(T__1);
				setState(155);
				identifier();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expression(0);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(162);
				match(T__1);
				setState(163);
				expression(0);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(timcParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(timcParser.SUB, 0); }
		public TerminalNode CONCAT() { return getToken(timcParser.CONCAT, 0); }
		public TermExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitTermExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(timcParser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstExprContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncAppExprContext extends ExpressionContext {
		public Function_applicationContext function_application() {
			return getRuleContext(Function_applicationContext.class,0);
		}
		public FuncAppExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitFuncAppExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(timcParser.LT, 0); }
		public TerminalNode LTEQ() { return getToken(timcParser.LTEQ, 0); }
		public TerminalNode GT() { return getToken(timcParser.GT, 0); }
		public TerminalNode GTEQ() { return getToken(timcParser.GTEQ, 0); }
		public CompExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(timcParser.NOT, 0); }
		public TerminalNode SUB() { return getToken(timcParser.SUB, 0); }
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(timcParser.OR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IndexExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitIndexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POWER() { return getToken(timcParser.POWER, 0); }
		public PowerExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitPowerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(timcParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(timcParser.NEQ, 0); }
		public EqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(timcParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(timcParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(timcParser.MOD, 0); }
		public FactorExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitFactorExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(170);
				match(T__16);
				setState(171);
				expression(0);
				setState(172);
				match(T__17);
				}
				break;
			case 2:
				{
				_localctx = new FuncAppExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				function_application();
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==SUB) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				expression(10);
				}
				break;
			case 4:
				{
				_localctx = new ConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				constant();
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(182);
						match(POWER);
						setState(183);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new FactorExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(185);
						((FactorExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((FactorExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new TermExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(188);
						((TermExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << ADD) | (1L << CONCAT))) != 0)) ) {
							((TermExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new CompExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(191);
						((CompExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LTEQ) | (1L << GT) | (1L << GTEQ))) != 0)) ) {
							((CompExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(194);
						((EqExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(197);
						match(AND);
						setState(198);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(200);
						match(OR);
						setState(201);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new IndexExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(203);
						match(T__0);
						setState(204);
						expression(0);
						setState(205);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnonFuncConstContext extends ConstantContext {
		public Anonymous_functionContext anonymous_function() {
			return getRuleContext(Anonymous_functionContext.class,0);
		}
		public AnonFuncConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitAnonFuncConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockConstContext extends ConstantContext {
		public TerminalNode BLOCK() { return getToken(timcParser.BLOCK, 0); }
		public BlockConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitBlockConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolConstContext extends ConstantContext {
		public TerminalNode BOOL() { return getToken(timcParser.BOOL, 0); }
		public BoolConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitBoolConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringConstContext extends ConstantContext {
		public TerminalNode STRING() { return getToken(timcParser.STRING, 0); }
		public StringConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitStringConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NothingConstContext extends ConstantContext {
		public TerminalNode NOTHING() { return getToken(timcParser.NOTHING, 0); }
		public NothingConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitNothingConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstContext extends ConstantContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitArrayConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelDirConstContext extends ConstantContext {
		public TerminalNode RELDIR() { return getToken(timcParser.RELDIR, 0); }
		public RelDirConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitRelDirConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberConstContext extends ConstantContext {
		public TerminalNode NUMBER() { return getToken(timcParser.NUMBER, 0); }
		public NumberConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitNumberConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsDirConstContext extends ConstantContext {
		public TerminalNode ABSDIR() { return getToken(timcParser.ABSDIR, 0); }
		public AbsDirConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitAbsDirConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(NUMBER);
				}
				break;
			case BOOL:
				_localctx = new BoolConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new StringConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(STRING);
				}
				break;
			case BLOCK:
				_localctx = new BlockConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(BLOCK);
				}
				break;
			case RELDIR:
				_localctx = new RelDirConstContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				match(RELDIR);
				}
				break;
			case ABSDIR:
				_localctx = new AbsDirConstContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(ABSDIR);
				}
				break;
			case NOTHING:
				_localctx = new NothingConstContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				match(NOTHING);
				}
				break;
			case T__0:
				_localctx = new ArrayConstContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(219);
				array();
				}
				break;
			case T__18:
			case T__19:
				_localctx = new AnonFuncConstContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(220);
				anonymous_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AnonFuncContext extends FunctionContext {
		public Anonymous_functionContext anonymous_function() {
			return getRuleContext(Anonymous_functionContext.class,0);
		}
		public AnonFuncContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitAnonFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DclFuncContext extends FunctionContext {
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public DclFuncContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitDclFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new DclFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__18);
				setState(224);
				match(ID);
				setState(225);
				match(T__16);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(226);
					parameters();
					}
				}

				setState(229);
				match(T__17);
				setState(230);
				match(T__6);
				setState(231);
				statements();
				setState(232);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new AnonFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				anonymous_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_functionContext extends ParserRuleContext {
		public Anonymous_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function; }
	 
		public Anonymous_functionContext() { }
		public void copyFrom(Anonymous_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LambdaAnonFuncContext extends Anonymous_functionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(timcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(timcParser.ID, i);
		}
		public LambdaAnonFuncContext(Anonymous_functionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitLambdaAnonFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAnonFuncContext extends Anonymous_functionContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public StmtAnonFuncContext(Anonymous_functionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitStmtAnonFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anonymous_functionContext anonymous_function() throws RecognitionException {
		Anonymous_functionContext _localctx = new Anonymous_functionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_anonymous_function);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new StmtAnonFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(T__18);
				setState(238);
				match(T__16);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(239);
					parameters();
					}
				}

				setState(242);
				match(T__17);
				setState(243);
				match(T__6);
				setState(244);
				statements();
				setState(245);
				match(T__8);
				}
				break;
			case T__19:
				_localctx = new LambdaAnonFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(T__19);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(248);
					match(ID);
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				match(T__20);
				setState(255);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_applicationContext extends ParserRuleContext {
		public Function_applicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_application; }
	 
		public Function_applicationContext() { }
		public void copyFrom(Function_applicationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BuildInFuncContext extends Function_applicationContext {
		public Build_in_funcContext build_in_func() {
			return getRuleContext(Build_in_funcContext.class,0);
		}
		public BuildInFuncContext(Function_applicationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitBuildInFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdFuncAppContext extends Function_applicationContext {
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public IdFuncAppContext(Function_applicationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitIdFuncApp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstFuncAppContext extends Function_applicationContext {
		public Anonymous_functionContext anonymous_function() {
			return getRuleContext(Anonymous_functionContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ConstFuncAppContext(Function_applicationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitConstFuncApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_applicationContext function_application() throws RecognitionException {
		Function_applicationContext _localctx = new Function_applicationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_application);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdFuncAppContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(ID);
				setState(259);
				match(T__16);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB) | (1L << ID))) != 0)) {
					{
					setState(260);
					expression_list();
					}
				}

				setState(263);
				match(T__17);
				}
				break;
			case T__16:
				_localctx = new ConstFuncAppContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__16);
				setState(265);
				anonymous_function();
				setState(266);
				match(T__17);
				setState(267);
				match(T__16);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB) | (1L << ID))) != 0)) {
					{
					setState(268);
					expression_list();
					}
				}

				setState(271);
				match(T__17);
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
				_localctx = new BuildInFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				build_in_func();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_in_funcContext extends ParserRuleContext {
		public Build_in_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_in_func; }
	 
		public Build_in_funcContext() { }
		public void copyFrom(Build_in_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintFuncContext extends Build_in_funcContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitPrintFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionFuncContext extends Build_in_funcContext {
		public PositionFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitPositionFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TurnFuncContext extends Build_in_funcContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TurnFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitTurnFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForwardFuncContext extends Build_in_funcContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForwardFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitForwardFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DownFuncContext extends Build_in_funcContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DownFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitDownFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LengthFuncContext extends Build_in_funcContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LengthFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitLengthFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpFuncContext extends Build_in_funcContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitUpFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FacingFuncContext extends Build_in_funcContext {
		public FacingFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitFacingFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BackwardFuncContext extends Build_in_funcContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BackwardFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitBackwardFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LookFuncContext extends Build_in_funcContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LookFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitLookFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_in_funcContext build_in_func() throws RecognitionException {
		Build_in_funcContext _localctx = new Build_in_funcContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_build_in_func);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new ForwardFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(T__21);
				setState(277);
				match(T__16);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB) | (1L << ID))) != 0)) {
					{
					setState(278);
					expression(0);
					}
				}

				setState(281);
				match(T__17);
				}
				break;
			case T__22:
				_localctx = new BackwardFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(T__22);
				setState(283);
				match(T__16);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB) | (1L << ID))) != 0)) {
					{
					setState(284);
					expression(0);
					}
				}

				setState(287);
				match(T__17);
				}
				break;
			case T__23:
				_localctx = new UpFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(T__23);
				setState(289);
				match(T__16);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB) | (1L << ID))) != 0)) {
					{
					setState(290);
					expression(0);
					}
				}

				setState(293);
				match(T__17);
				}
				break;
			case T__24:
				_localctx = new DownFuncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(T__24);
				setState(295);
				match(T__16);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB) | (1L << ID))) != 0)) {
					{
					setState(296);
					expression(0);
					}
				}

				setState(299);
				match(T__17);
				}
				break;
			case T__25:
				_localctx = new LookFuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				match(T__25);
				setState(301);
				match(T__16);
				setState(302);
				expression(0);
				setState(303);
				match(T__17);
				}
				break;
			case T__26:
				_localctx = new TurnFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				match(T__26);
				setState(306);
				match(T__16);
				setState(307);
				expression(0);
				setState(308);
				match(T__17);
				}
				break;
			case T__27:
				_localctx = new PrintFuncContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				match(T__27);
				setState(311);
				match(T__16);
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB) | (1L << ID))) != 0)) {
					{
					setState(312);
					expression(0);
					}
				}

				setState(315);
				match(T__17);
				}
				break;
			case T__28:
				_localctx = new FacingFuncContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(316);
				match(T__28);
				setState(317);
				match(T__16);
				setState(318);
				match(T__17);
				}
				break;
			case T__29:
				_localctx = new PositionFuncContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(319);
				match(T__29);
				setState(320);
				match(T__16);
				setState(321);
				match(T__17);
				}
				break;
			case T__30:
				_localctx = new LengthFuncContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(322);
				match(T__30);
				setState(323);
				match(T__16);
				setState(324);
				expression(0);
				setState(325);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(timcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(timcParser.ID, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(ID);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(330);
				match(T__1);
				setState(331);
				match(ID);
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u0154\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\7\2"+
		"%\n\2\f\2\16\2(\13\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\6\3\62\n\3\r"+
		"\3\16\3\63\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\5\5C\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3\5\5\5S\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5t\n\5\f\5"+
		"\16\5w\13\5\3\5\3\5\3\5\3\5\3\5\5\5~\n\5\3\5\3\5\5\5\u0082\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0090\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\3\b\3\b\3\b\7\b\u009f\n\b\f\b\16"+
		"\b\u00a2\13\b\3\t\3\t\3\t\7\t\u00a7\n\t\f\t\16\t\u00aa\13\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b6\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00e0\n\13\3\f\3\f\3\f\3\f\5\f\u00e6\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00ee\n\f\3\r\3\r\3\r\5\r\u00f3\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u00fc\n\r\f\r\16\r\u00ff\13\r\3\r\3\r\5\r\u0103\n"+
		"\r\3\16\3\16\3\16\5\16\u0108\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0110"+
		"\n\16\3\16\3\16\3\16\5\16\u0115\n\16\3\17\3\17\3\17\5\17\u011a\n\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0120\n\17\3\17\3\17\3\17\3\17\5\17\u0126\n\17"+
		"\3\17\3\17\3\17\3\17\5\17\u012c\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u013c\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u014a\n\17\3\20\3\20\3\20"+
		"\7\20\u014f\n\20\f\20\16\20\u0152\13\20\3\20\2\3\22\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\b\3\2:?\3\2)*\3\2,.\4\2**/\60\3\2\61\64\3\2"+
		"\65\66\2\u0186\2 \3\2\2\2\4\61\3\2\2\2\6<\3\2\2\2\b\u0081\3\2\2\2\n\u008f"+
		"\3\2\2\2\f\u0091\3\2\2\2\16\u009b\3\2\2\2\20\u00a3\3\2\2\2\22\u00b5\3"+
		"\2\2\2\24\u00df\3\2\2\2\26\u00ed\3\2\2\2\30\u0102\3\2\2\2\32\u0114\3\2"+
		"\2\2\34\u0149\3\2\2\2\36\u014b\3\2\2\2 +\7\3\2\2!&\5\22\n\2\"#\7\4\2\2"+
		"#%\5\22\n\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3\2"+
		"\2\2)!\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\5"+
		"\2\2/\3\3\2\2\2\60\62\5\6\4\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2"+
		"\2\63\64\3\2\2\2\64\5\3\2\2\2\65=\5\n\6\2\66=\5\22\n\2\67=\5\26\f\28="+
		"\5\b\5\29:\7\6\2\2:=\5\20\t\2;=\7\7\2\2<\65\3\2\2\2<\66\3\2\2\2<\67\3"+
		"\2\2\2<8\3\2\2\2<9\3\2\2\2<;\3\2\2\2=\7\3\2\2\2>?\7\b\2\2?@\5\22\n\2@"+
		"B\7\t\2\2AC\5\4\3\2BA\3\2\2\2BC\3\2\2\2CL\3\2\2\2DE\7\n\2\2EF\7\b\2\2"+
		"FG\5\22\n\2GH\7\t\2\2HI\5\4\3\2IK\3\2\2\2JD\3\2\2\2KN\3\2\2\2LJ\3\2\2"+
		"\2LM\3\2\2\2MR\3\2\2\2NL\3\2\2\2OP\7\n\2\2PQ\7\t\2\2QS\5\4\3\2RO\3\2\2"+
		"\2RS\3\2\2\2ST\3\2\2\2TU\7\13\2\2U\u0082\3\2\2\2VW\7\f\2\2WX\5\22\n\2"+
		"XY\7\t\2\2YZ\5\4\3\2Z[\7\13\2\2[\u0082\3\2\2\2\\]\7\r\2\2]^\5\22\n\2^"+
		"_\7\t\2\2_`\5\4\3\2`a\7\13\2\2a\u0082\3\2\2\2bc\7\16\2\2cd\7@\2\2de\7"+
		"\17\2\2ef\5\22\n\2fg\7\t\2\2gh\5\4\3\2hi\7\13\2\2i\u0082\3\2\2\2jk\7\20"+
		"\2\2kl\5\22\n\2lu\7\t\2\2mn\7\21\2\2no\5\22\n\2op\7\t\2\2pq\5\4\3\2qr"+
		"\7\13\2\2rt\3\2\2\2sm\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v}\3\2\2\2"+
		"wu\3\2\2\2xy\7\22\2\2yz\7\t\2\2z{\5\4\3\2{|\7\13\2\2|~\3\2\2\2}x\3\2\2"+
		"\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\13\2\2\u0080\u0082\3\2\2\2\u0081"+
		">\3\2\2\2\u0081V\3\2\2\2\u0081\\\3\2\2\2\u0081b\3\2\2\2\u0081j\3\2\2\2"+
		"\u0082\t\3\2\2\2\u0083\u0084\5\f\7\2\u0084\u0085\79\2\2\u0085\u0086\5"+
		"\22\n\2\u0086\u0090\3\2\2\2\u0087\u0088\5\f\7\2\u0088\u0089\t\2\2\2\u0089"+
		"\u008a\5\22\n\2\u008a\u0090\3\2\2\2\u008b\u008c\5\16\b\2\u008c\u008d\7"+
		"9\2\2\u008d\u008e\5\20\t\2\u008e\u0090\3\2\2\2\u008f\u0083\3\2\2\2\u008f"+
		"\u0087\3\2\2\2\u008f\u008b\3\2\2\2\u0090\13\3\2\2\2\u0091\u0098\7@\2\2"+
		"\u0092\u0093\7\3\2\2\u0093\u0094\5\22\n\2\u0094\u0095\7\5\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0092\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\r\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u00a0\5\f\7\2"+
		"\u009c\u009d\7\4\2\2\u009d\u009f\5\f\7\2\u009e\u009c\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\17\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a8\5\22\n\2\u00a4\u00a5\7\4\2\2\u00a5\u00a7\5"+
		"\22\n\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\21\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\b\n\1"+
		"\2\u00ac\u00ad\7\23\2\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\7\24\2\2\u00af"+
		"\u00b6\3\2\2\2\u00b0\u00b6\5\32\16\2\u00b1\u00b2\t\3\2\2\u00b2\u00b6\5"+
		"\22\n\f\u00b3\u00b6\5\24\13\2\u00b4\u00b6\7@\2\2\u00b5\u00ab\3\2\2\2\u00b5"+
		"\u00b0\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\u00d3\3\2\2\2\u00b7\u00b8\f\13\2\2\u00b8\u00b9\7+\2\2\u00b9"+
		"\u00d2\5\22\n\13\u00ba\u00bb\f\n\2\2\u00bb\u00bc\t\4\2\2\u00bc\u00d2\5"+
		"\22\n\13\u00bd\u00be\f\t\2\2\u00be\u00bf\t\5\2\2\u00bf\u00d2\5\22\n\n"+
		"\u00c0\u00c1\f\b\2\2\u00c1\u00c2\t\6\2\2\u00c2\u00d2\5\22\n\t\u00c3\u00c4"+
		"\f\7\2\2\u00c4\u00c5\t\7\2\2\u00c5\u00d2\5\22\n\b\u00c6\u00c7\f\6\2\2"+
		"\u00c7\u00c8\7\67\2\2\u00c8\u00d2\5\22\n\7\u00c9\u00ca\f\5\2\2\u00ca\u00cb"+
		"\78\2\2\u00cb\u00d2\5\22\n\6\u00cc\u00cd\f\16\2\2\u00cd\u00ce\7\3\2\2"+
		"\u00ce\u00cf\5\22\n\2\u00cf\u00d0\7\5\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00b7"+
		"\3\2\2\2\u00d1\u00ba\3\2\2\2\u00d1\u00bd\3\2\2\2\u00d1\u00c0\3\2\2\2\u00d1"+
		"\u00c3\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00cc\3\2"+
		"\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\23\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00e0\7\"\2\2\u00d7\u00e0\7#\2\2"+
		"\u00d8\u00e0\7$\2\2\u00d9\u00e0\7&\2\2\u00da\u00e0\7\'\2\2\u00db\u00e0"+
		"\7(\2\2\u00dc\u00e0\7%\2\2\u00dd\u00e0\5\2\2\2\u00de\u00e0\5\30\r\2\u00df"+
		"\u00d6\3\2\2\2\u00df\u00d7\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00d9\3\2"+
		"\2\2\u00df\u00da\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\25\3\2\2\2\u00e1\u00e2\7\25\2"+
		"\2\u00e2\u00e3\7@\2\2\u00e3\u00e5\7\23\2\2\u00e4\u00e6\5\36\20\2\u00e5"+
		"\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\24"+
		"\2\2\u00e8\u00e9\7\t\2\2\u00e9\u00ea\5\4\3\2\u00ea\u00eb\7\13\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ee\5\30\r\2\u00ed\u00e1\3\2\2\2\u00ed\u00ec\3"+
		"\2\2\2\u00ee\27\3\2\2\2\u00ef\u00f0\7\25\2\2\u00f0\u00f2\7\23\2\2\u00f1"+
		"\u00f3\5\36\20\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3"+
		"\2\2\2\u00f4\u00f5\7\24\2\2\u00f5\u00f6\7\t\2\2\u00f6\u00f7\5\4\3\2\u00f7"+
		"\u00f8\7\13\2\2\u00f8\u0103\3\2\2\2\u00f9\u00fd\7\26\2\2\u00fa\u00fc\7"+
		"@\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\27"+
		"\2\2\u0101\u0103\5\22\n\2\u0102\u00ef\3\2\2\2\u0102\u00f9\3\2\2\2\u0103"+
		"\31\3\2\2\2\u0104\u0105\7@\2\2\u0105\u0107\7\23\2\2\u0106\u0108\5\20\t"+
		"\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0115"+
		"\7\24\2\2\u010a\u010b\7\23\2\2\u010b\u010c\5\30\r\2\u010c\u010d\7\24\2"+
		"\2\u010d\u010f\7\23\2\2\u010e\u0110\5\20\t\2\u010f\u010e\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\24\2\2\u0112\u0115\3"+
		"\2\2\2\u0113\u0115\5\34\17\2\u0114\u0104\3\2\2\2\u0114\u010a\3\2\2\2\u0114"+
		"\u0113\3\2\2\2\u0115\33\3\2\2\2\u0116\u0117\7\30\2\2\u0117\u0119\7\23"+
		"\2\2\u0118\u011a\5\22\n\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u014a\7\24\2\2\u011c\u011d\7\31\2\2\u011d\u011f\7"+
		"\23\2\2\u011e\u0120\5\22\n\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u014a\7\24\2\2\u0122\u0123\7\32\2\2\u0123\u0125\7"+
		"\23\2\2\u0124\u0126\5\22\n\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u014a\7\24\2\2\u0128\u0129\7\33\2\2\u0129\u012b\7"+
		"\23\2\2\u012a\u012c\5\22\n\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u014a\7\24\2\2\u012e\u012f\7\34\2\2\u012f\u0130\7"+
		"\23\2\2\u0130\u0131\5\22\n\2\u0131\u0132\7\24\2\2\u0132\u014a\3\2\2\2"+
		"\u0133\u0134\7\35\2\2\u0134\u0135\7\23\2\2\u0135\u0136\5\22\n\2\u0136"+
		"\u0137\7\24\2\2\u0137\u014a\3\2\2\2\u0138\u0139\7\36\2\2\u0139\u013b\7"+
		"\23\2\2\u013a\u013c\5\22\n\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u014a\7\24\2\2\u013e\u013f\7\37\2\2\u013f\u0140\7"+
		"\23\2\2\u0140\u014a\7\24\2\2\u0141\u0142\7 \2\2\u0142\u0143\7\23\2\2\u0143"+
		"\u014a\7\24\2\2\u0144\u0145\7!\2\2\u0145\u0146\7\23\2\2\u0146\u0147\5"+
		"\22\n\2\u0147\u0148\7\24\2\2\u0148\u014a\3\2\2\2\u0149\u0116\3\2\2\2\u0149"+
		"\u011c\3\2\2\2\u0149\u0122\3\2\2\2\u0149\u0128\3\2\2\2\u0149\u012e\3\2"+
		"\2\2\u0149\u0133\3\2\2\2\u0149\u0138\3\2\2\2\u0149\u013e\3\2\2\2\u0149"+
		"\u0141\3\2\2\2\u0149\u0144\3\2\2\2\u014a\35\3\2\2\2\u014b\u0150\7@\2\2"+
		"\u014c\u014d\7\4\2\2\u014d\u014f\7@\2\2\u014e\u014c\3\2\2\2\u014f\u0152"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\37\3\2\2\2\u0152"+
		"\u0150\3\2\2\2#&+\63<BLRu}\u0081\u008f\u0098\u00a0\u00a8\u00b5\u00d1\u00d3"+
		"\u00df\u00e5\u00ed\u00f2\u00fd\u0102\u0107\u010f\u0114\u0119\u011f\u0125"+
		"\u012b\u013b\u0149\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}