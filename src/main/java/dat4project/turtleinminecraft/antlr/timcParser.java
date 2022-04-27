package dat4project.turtleinminecraft.antlr;

// Generated from timc.g4 by ANTLR 4.9.2
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
		WS=32, LINE_COMMENT=33, COMMENT=34, NUMBER=35, BOOL=36, STRING=37, NOTHING=38, 
		ID=39, BLOCK=40, RELDIR=41, ABSDIR=42, ASSIGN=43, ADDASSIGN=44, SUBASSIGN=45, 
		MULTASSIGN=46, DIVASSIGN=47, MODASSIGN=48, POWERASSIGN=49, NOT=50, SUB=51, 
		POWER=52, MULT=53, DIV=54, MOD=55, ADD=56, CONCAT=57, LT=58, LTEQ=59, 
		GT=60, GTEQ=61, EQ=62, NEQ=63, AND=64, OR=65;
	public static final int
		RULE_array = 0, RULE_statements = 1, RULE_statement = 2, RULE_control_structure = 3, 
		RULE_assignment = 4, RULE_identifier = 5, RULE_identifier_list = 6, RULE_expression_list = 7, 
		RULE_expression = 8, RULE_constant = 9, RULE_function = 10, RULE_anonymous_function = 11, 
		RULE_function_application = 12, RULE_build_in_func = 13, RULE_parameters = 14, 
		RULE_arguments = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"array", "statements", "statement", "control_structure", "assignment", 
			"identifier", "identifier_list", "expression_list", "expression", "constant", 
			"function", "anonymous_function", "function_application", "build_in_func", 
			"parameters", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'return'", "'break'", "'if'", "'do'", "'else'", 
			"'end'", "'while'", "'repeat'", "'foreach'", "'in'", "'switch'", "'case'", 
			"'default'", "'('", "')'", "'function'", "'fn'", "'->'", "'forward'", 
			"'backward'", "'up'", "'down'", "'look'", "'turn'", "'print'", "'facing'", 
			"'position'", "'length'", null, null, null, null, null, null, "'nothing'", 
			null, null, null, null, "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'^='", "'not'", "'-'", "'^'", "'*'", "'/'", "'%'", "'+'", "'++'", "'<'", 
			"'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "LINE_COMMENT", 
			"COMMENT", "NUMBER", "BOOL", "STRING", "NOTHING", "ID", "BLOCK", "RELDIR", 
			"ABSDIR", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULTASSIGN", "DIVASSIGN", 
			"MODASSIGN", "POWERASSIGN", "NOT", "SUB", "POWER", "MULT", "DIV", "MOD", 
			"ADD", "CONCAT", "LT", "LTEQ", "GT", "GTEQ", "EQ", "NEQ", "AND", "OR"
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
			setState(32);
			match(T__0);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
				{
				{
				setState(33);
				expression(0);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(34);
					match(T__1);
					setState(35);
					expression(0);
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0) );
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				assignment();
				}
				break;
			case 2:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				expression(0);
				}
				break;
			case 3:
				_localctx = new FuncStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				function();
				}
				break;
			case 4:
				_localctx = new CtrlStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				control_structure();
				}
				break;
			case 5:
				_localctx = new RetStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(T__3);
				setState(58);
				expression_list();
				}
				break;
			case 6:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
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
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new IfCtrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(T__5);
				setState(63);
				expression(0);
				setState(64);
				match(T__6);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(65);
					statements();
					}
				}

				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(68);
						match(T__7);
						setState(69);
						match(T__5);
						setState(70);
						expression(0);
						setState(71);
						match(T__6);
						setState(72);
						statements();
						}
						} 
					}
					setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(79);
					match(T__7);
					setState(80);
					match(T__6);
					setState(81);
					statements();
					}
				}

				setState(84);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new WhileCtrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__9);
				setState(87);
				expression(0);
				setState(88);
				match(T__6);
				setState(89);
				statements();
				setState(90);
				match(T__8);
				}
				break;
			case T__10:
				_localctx = new RepeatCtrlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(T__10);
				setState(93);
				expression(0);
				setState(94);
				match(T__6);
				setState(95);
				statements();
				setState(96);
				match(T__8);
				}
				break;
			case T__11:
				_localctx = new ForeachCtrlContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(T__11);
				setState(99);
				match(ID);
				setState(100);
				match(T__12);
				setState(101);
				expression(0);
				setState(102);
				match(T__6);
				setState(103);
				statements();
				setState(104);
				match(T__8);
				}
				break;
			case T__13:
				_localctx = new SwitchCtrlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(T__13);
				setState(107);
				expression(0);
				setState(108);
				match(T__6);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(109);
					match(T__14);
					setState(110);
					expression(0);
					setState(111);
					match(T__6);
					setState(112);
					statements();
					setState(113);
					match(T__8);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(120);
					match(T__15);
					setState(121);
					match(T__6);
					setState(122);
					statements();
					setState(123);
					match(T__8);
					}
				}

				setState(127);
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
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(timcParser.ASSIGN, 0); }
		public TerminalNode ADDASSIGN() { return getToken(timcParser.ADDASSIGN, 0); }
		public TerminalNode SUBASSIGN() { return getToken(timcParser.SUBASSIGN, 0); }
		public TerminalNode MULTASSIGN() { return getToken(timcParser.MULTASSIGN, 0); }
		public TerminalNode DIVASSIGN() { return getToken(timcParser.DIVASSIGN, 0); }
		public TerminalNode MODASSIGN() { return getToken(timcParser.MODASSIGN, 0); }
		public TerminalNode POWERASSIGN() { return getToken(timcParser.POWERASSIGN, 0); }
		public SingleAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitSingleAssign(this);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new SingleAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				identifier();
				setState(132);
				((SingleAssignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ADDASSIGN) | (1L << SUBASSIGN) | (1L << MULTASSIGN) | (1L << DIVASSIGN) | (1L << MODASSIGN) | (1L << POWERASSIGN))) != 0)) ) {
					((SingleAssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				expression(0);
				}
				break;
			case 2:
				_localctx = new MultiAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				identifier_list();
				setState(136);
				match(ASSIGN);
				setState(137);
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
			setState(141);
			match(ID);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(142);
				match(T__0);
				setState(143);
				expression(0);
				setState(144);
				match(T__2);
				}
				}
				setState(150);
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
			setState(151);
			identifier();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(152);
				match(T__1);
				setState(153);
				identifier();
				}
				}
				setState(158);
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
			setState(159);
			expression(0);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(160);
				match(T__1);
				setState(161);
				expression(0);
				}
				}
				setState(166);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				match(T__16);
				setState(169);
				expression(0);
				setState(170);
				match(T__17);
				}
				break;
			case 2:
				{
				_localctx = new FuncAppExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				function_application();
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
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
				setState(174);
				expression(10);
				}
				break;
			case 4:
				{
				_localctx = new ConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				constant();
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(180);
						match(POWER);
						setState(181);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new FactorExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(183);
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
						setState(184);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new TermExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(186);
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
						setState(187);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new CompExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(189);
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
						setState(190);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(192);
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
						setState(193);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						match(AND);
						setState(196);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
						match(OR);
						setState(199);
						expression(4);
						}
						break;
					case 8:
						{
						_localctx = new IndexExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(201);
						match(T__0);
						setState(202);
						expression(0);
						setState(203);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(209);
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
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(NUMBER);
				}
				break;
			case BOOL:
				_localctx = new BoolConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new StringConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(STRING);
				}
				break;
			case BLOCK:
				_localctx = new BlockConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(BLOCK);
				}
				break;
			case RELDIR:
				_localctx = new RelDirConstContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(RELDIR);
				}
				break;
			case ABSDIR:
				_localctx = new AbsDirConstContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(ABSDIR);
				}
				break;
			case T__0:
				_localctx = new ArrayConstContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(216);
				array();
				}
				break;
			case NOTHING:
				_localctx = new NothingConstContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				match(NOTHING);
				}
				break;
			case T__18:
			case T__19:
				_localctx = new AnonFuncConstContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(218);
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
	public static class BuildInFuncContext extends FunctionContext {
		public Build_in_funcContext build_in_func() {
			return getRuleContext(Build_in_funcContext.class,0);
		}
		public BuildInFuncContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitBuildInFunc(this);
			else return visitor.visitChildren(this);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new DclFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(T__18);
				setState(222);
				match(ID);
				setState(223);
				match(T__16);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(224);
					parameters();
					}
				}

				setState(227);
				match(T__17);
				setState(228);
				match(T__6);
				setState(229);
				statements();
				setState(230);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new AnonFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				anonymous_function();
				}
				break;
			case 3:
				_localctx = new BuildInFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				build_in_func();
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
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new StmtAnonFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T__18);
				setState(237);
				match(T__16);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(238);
					parameters();
					}
				}

				setState(241);
				match(T__17);
				setState(242);
				match(T__6);
				setState(243);
				statements();
				setState(244);
				match(T__8);
				}
				break;
			case T__19:
				_localctx = new LambdaAnonFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(T__19);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(247);
					match(ID);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(T__20);
				setState(254);
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
	public static class IdFuncAppContext extends Function_applicationContext {
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdFuncAppContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(ID);
				setState(258);
				match(T__16);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(259);
					arguments();
					}
				}

				setState(262);
				match(T__17);
				}
				break;
			case T__16:
				_localctx = new ConstFuncAppContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(T__16);
				setState(264);
				anonymous_function();
				setState(265);
				match(T__17);
				setState(266);
				match(T__16);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(267);
					arguments();
					}
				}

				setState(270);
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
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new ForwardFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(T__21);
				setState(275);
				match(T__16);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(276);
					expression(0);
					}
				}

				setState(279);
				match(T__17);
				}
				break;
			case T__22:
				_localctx = new BackwardFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(T__22);
				setState(281);
				match(T__16);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(282);
					expression(0);
					}
				}

				setState(285);
				match(T__17);
				}
				break;
			case T__23:
				_localctx = new UpFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(T__23);
				setState(287);
				match(T__16);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(288);
					expression(0);
					}
				}

				setState(291);
				match(T__17);
				}
				break;
			case T__24:
				_localctx = new DownFuncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(T__24);
				setState(293);
				match(T__16);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(294);
					expression(0);
					}
				}

				setState(297);
				match(T__17);
				}
				break;
			case T__25:
				_localctx = new LookFuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				match(T__25);
				setState(299);
				match(T__16);
				setState(300);
				expression(0);
				setState(301);
				match(T__17);
				}
				break;
			case T__26:
				_localctx = new TurnFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				match(T__26);
				setState(304);
				match(T__16);
				setState(305);
				expression(0);
				setState(306);
				match(T__17);
				}
				break;
			case T__27:
				_localctx = new PrintFuncContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
				match(T__27);
				setState(309);
				match(T__16);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << NOTHING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(310);
					expression(0);
					}
				}

				setState(313);
				match(T__17);
				}
				break;
			case T__28:
				_localctx = new FacingFuncContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(314);
				match(T__28);
				setState(315);
				match(T__16);
				setState(316);
				match(T__17);
				}
				break;
			case T__29:
				_localctx = new PositionFuncContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(317);
				match(T__29);
				setState(318);
				match(T__16);
				setState(319);
				match(T__17);
				}
				break;
			case T__30:
				_localctx = new LengthFuncContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(320);
				match(T__30);
				setState(321);
				match(T__16);
				setState(322);
				expression(0);
				setState(323);
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
			setState(327);
			match(ID);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(328);
				match(T__1);
				setState(329);
				match(ID);
				}
				}
				setState(334);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			expression(0);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(336);
				match(T__1);
				setState(337);
				expression(0);
				}
				}
				setState(342);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3\6"+
		"\3\64\n\3\r\3\16\3\65\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5"+
		"\3\5\5\5E\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5\3\5"+
		"\3\5\5\5U\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5v\n\5\f\5\16\5y\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\5\3\5\5\5\u0084"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008e\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\u0095\n\7\f\7\16\7\u0098\13\7\3\b\3\b\3\b\7\b\u009d\n\b\f\b\16\b"+
		"\u00a0\13\b\3\t\3\t\3\t\7\t\u00a5\n\t\f\t\16\t\u00a8\13\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00de\n\13\3\f\3\f\3\f\3\f\5\f\u00e4\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00ed\n\f\3\r\3\r\3\r\5\r\u00f2\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00fb\n\r\f\r\16\r\u00fe\13\r\3\r\3\r\5\r\u0102"+
		"\n\r\3\16\3\16\3\16\5\16\u0107\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u010f\n\16\3\16\3\16\5\16\u0113\n\16\3\17\3\17\3\17\5\17\u0118\n\17\3"+
		"\17\3\17\3\17\3\17\5\17\u011e\n\17\3\17\3\17\3\17\3\17\5\17\u0124\n\17"+
		"\3\17\3\17\3\17\3\17\5\17\u012a\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u013a\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0148\n\17\3\20\3\20\3\20"+
		"\7\20\u014d\n\20\f\20\16\20\u0150\13\20\3\21\3\21\3\21\7\21\u0155\n\21"+
		"\f\21\16\21\u0158\13\21\3\21\2\3\22\22\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \2\b\3\2-\63\3\2\64\65\3\2\679\4\2\65\65:;\3\2<?\3\2@A\2\u018b"+
		"\2\"\3\2\2\2\4\63\3\2\2\2\6>\3\2\2\2\b\u0083\3\2\2\2\n\u008d\3\2\2\2\f"+
		"\u008f\3\2\2\2\16\u0099\3\2\2\2\20\u00a1\3\2\2\2\22\u00b3\3\2\2\2\24\u00dd"+
		"\3\2\2\2\26\u00ec\3\2\2\2\30\u0101\3\2\2\2\32\u0112\3\2\2\2\34\u0147\3"+
		"\2\2\2\36\u0149\3\2\2\2 \u0151\3\2\2\2\"-\7\3\2\2#(\5\22\n\2$%\7\4\2\2"+
		"%\'\5\22\n\2&$\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3\2"+
		"\2\2+#\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60"+
		"\61\7\5\2\2\61\3\3\2\2\2\62\64\5\6\4\2\63\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67?\5\n\6\28?\5\22\n\29?\5\26\f"+
		"\2:?\5\b\5\2;<\7\6\2\2<?\5\20\t\2=?\7\7\2\2>\67\3\2\2\2>8\3\2\2\2>9\3"+
		"\2\2\2>:\3\2\2\2>;\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\7\b\2\2AB\5\22\n\2B"+
		"D\7\t\2\2CE\5\4\3\2DC\3\2\2\2DE\3\2\2\2EN\3\2\2\2FG\7\n\2\2GH\7\b\2\2"+
		"HI\5\22\n\2IJ\7\t\2\2JK\5\4\3\2KM\3\2\2\2LF\3\2\2\2MP\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2OT\3\2\2\2PN\3\2\2\2QR\7\n\2\2RS\7\t\2\2SU\5\4\3\2TQ\3\2\2"+
		"\2TU\3\2\2\2UV\3\2\2\2VW\7\13\2\2W\u0084\3\2\2\2XY\7\f\2\2YZ\5\22\n\2"+
		"Z[\7\t\2\2[\\\5\4\3\2\\]\7\13\2\2]\u0084\3\2\2\2^_\7\r\2\2_`\5\22\n\2"+
		"`a\7\t\2\2ab\5\4\3\2bc\7\13\2\2c\u0084\3\2\2\2de\7\16\2\2ef\7)\2\2fg\7"+
		"\17\2\2gh\5\22\n\2hi\7\t\2\2ij\5\4\3\2jk\7\13\2\2k\u0084\3\2\2\2lm\7\20"+
		"\2\2mn\5\22\n\2nw\7\t\2\2op\7\21\2\2pq\5\22\n\2qr\7\t\2\2rs\5\4\3\2st"+
		"\7\13\2\2tv\3\2\2\2uo\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\177\3\2\2"+
		"\2yw\3\2\2\2z{\7\22\2\2{|\7\t\2\2|}\5\4\3\2}~\7\13\2\2~\u0080\3\2\2\2"+
		"\177z\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\13\2"+
		"\2\u0082\u0084\3\2\2\2\u0083@\3\2\2\2\u0083X\3\2\2\2\u0083^\3\2\2\2\u0083"+
		"d\3\2\2\2\u0083l\3\2\2\2\u0084\t\3\2\2\2\u0085\u0086\5\f\7\2\u0086\u0087"+
		"\t\2\2\2\u0087\u0088\5\22\n\2\u0088\u008e\3\2\2\2\u0089\u008a\5\16\b\2"+
		"\u008a\u008b\7-\2\2\u008b\u008c\5\20\t\2\u008c\u008e\3\2\2\2\u008d\u0085"+
		"\3\2\2\2\u008d\u0089\3\2\2\2\u008e\13\3\2\2\2\u008f\u0096\7)\2\2\u0090"+
		"\u0091\7\3\2\2\u0091\u0092\5\22\n\2\u0092\u0093\7\5\2\2\u0093\u0095\3"+
		"\2\2\2\u0094\u0090\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\r\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009e\5\f\7\2"+
		"\u009a\u009b\7\4\2\2\u009b\u009d\5\f\7\2\u009c\u009a\3\2\2\2\u009d\u00a0"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\17\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a6\5\22\n\2\u00a2\u00a3\7\4\2\2\u00a3\u00a5\5"+
		"\22\n\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\21\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\b\n\1"+
		"\2\u00aa\u00ab\7\23\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad\7\24\2\2\u00ad"+
		"\u00b4\3\2\2\2\u00ae\u00b4\5\32\16\2\u00af\u00b0\t\3\2\2\u00b0\u00b4\5"+
		"\22\n\f\u00b1\u00b4\5\24\13\2\u00b2\u00b4\7)\2\2\u00b3\u00a9\3\2\2\2\u00b3"+
		"\u00ae\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2"+
		"\2\2\u00b4\u00d1\3\2\2\2\u00b5\u00b6\f\13\2\2\u00b6\u00b7\7\66\2\2\u00b7"+
		"\u00d0\5\22\n\13\u00b8\u00b9\f\n\2\2\u00b9\u00ba\t\4\2\2\u00ba\u00d0\5"+
		"\22\n\13\u00bb\u00bc\f\t\2\2\u00bc\u00bd\t\5\2\2\u00bd\u00d0\5\22\n\n"+
		"\u00be\u00bf\f\b\2\2\u00bf\u00c0\t\6\2\2\u00c0\u00d0\5\22\n\t\u00c1\u00c2"+
		"\f\7\2\2\u00c2\u00c3\t\7\2\2\u00c3\u00d0\5\22\n\b\u00c4\u00c5\f\6\2\2"+
		"\u00c5\u00c6\7B\2\2\u00c6\u00d0\5\22\n\7\u00c7\u00c8\f\5\2\2\u00c8\u00c9"+
		"\7C\2\2\u00c9\u00d0\5\22\n\6\u00ca\u00cb\f\16\2\2\u00cb\u00cc\7\3\2\2"+
		"\u00cc\u00cd\5\22\n\2\u00cd\u00ce\7\5\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00b5"+
		"\3\2\2\2\u00cf\u00b8\3\2\2\2\u00cf\u00bb\3\2\2\2\u00cf\u00be\3\2\2\2\u00cf"+
		"\u00c1\3\2\2\2\u00cf\u00c4\3\2\2\2\u00cf\u00c7\3\2\2\2\u00cf\u00ca\3\2"+
		"\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\23\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00de\7%\2\2\u00d5\u00de\7&\2\2"+
		"\u00d6\u00de\7\'\2\2\u00d7\u00de\7*\2\2\u00d8\u00de\7+\2\2\u00d9\u00de"+
		"\7,\2\2\u00da\u00de\5\2\2\2\u00db\u00de\7(\2\2\u00dc\u00de\5\30\r\2\u00dd"+
		"\u00d4\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00d7\3\2"+
		"\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\25\3\2\2\2\u00df\u00e0\7\25\2"+
		"\2\u00e0\u00e1\7)\2\2\u00e1\u00e3\7\23\2\2\u00e2\u00e4\5\36\20\2\u00e3"+
		"\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7\24"+
		"\2\2\u00e6\u00e7\7\t\2\2\u00e7\u00e8\5\4\3\2\u00e8\u00e9\7\13\2\2\u00e9"+
		"\u00ed\3\2\2\2\u00ea\u00ed\5\30\r\2\u00eb\u00ed\5\34\17\2\u00ec\u00df"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\27\3\2\2\2\u00ee"+
		"\u00ef\7\25\2\2\u00ef\u00f1\7\23\2\2\u00f0\u00f2\5\36\20\2\u00f1\u00f0"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\24\2\2"+
		"\u00f4\u00f5\7\t\2\2\u00f5\u00f6\5\4\3\2\u00f6\u00f7\7\13\2\2\u00f7\u0102"+
		"\3\2\2\2\u00f8\u00fc\7\26\2\2\u00f9\u00fb\7)\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\27\2\2\u0100\u0102\5\22\n\2\u0101"+
		"\u00ee\3\2\2\2\u0101\u00f8\3\2\2\2\u0102\31\3\2\2\2\u0103\u0104\7)\2\2"+
		"\u0104\u0106\7\23\2\2\u0105\u0107\5 \21\2\u0106\u0105\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0113\7\24\2\2\u0109\u010a\7\23\2\2"+
		"\u010a\u010b\5\30\r\2\u010b\u010c\7\24\2\2\u010c\u010e\7\23\2\2\u010d"+
		"\u010f\5 \21\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\7\24\2\2\u0111\u0113\3\2\2\2\u0112\u0103\3\2\2\2\u0112"+
		"\u0109\3\2\2\2\u0113\33\3\2\2\2\u0114\u0115\7\30\2\2\u0115\u0117\7\23"+
		"\2\2\u0116\u0118\5\22\n\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u0148\7\24\2\2\u011a\u011b\7\31\2\2\u011b\u011d\7"+
		"\23\2\2\u011c\u011e\5\22\n\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0148\7\24\2\2\u0120\u0121\7\32\2\2\u0121\u0123\7"+
		"\23\2\2\u0122\u0124\5\22\n\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0148\7\24\2\2\u0126\u0127\7\33\2\2\u0127\u0129\7"+
		"\23\2\2\u0128\u012a\5\22\n\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u0148\7\24\2\2\u012c\u012d\7\34\2\2\u012d\u012e\7"+
		"\23\2\2\u012e\u012f\5\22\n\2\u012f\u0130\7\24\2\2\u0130\u0148\3\2\2\2"+
		"\u0131\u0132\7\35\2\2\u0132\u0133\7\23\2\2\u0133\u0134\5\22\n\2\u0134"+
		"\u0135\7\24\2\2\u0135\u0148\3\2\2\2\u0136\u0137\7\36\2\2\u0137\u0139\7"+
		"\23\2\2\u0138\u013a\5\22\n\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u0148\7\24\2\2\u013c\u013d\7\37\2\2\u013d\u013e\7"+
		"\23\2\2\u013e\u0148\7\24\2\2\u013f\u0140\7 \2\2\u0140\u0141\7\23\2\2\u0141"+
		"\u0148\7\24\2\2\u0142\u0143\7!\2\2\u0143\u0144\7\23\2\2\u0144\u0145\5"+
		"\22\n\2\u0145\u0146\7\24\2\2\u0146\u0148\3\2\2\2\u0147\u0114\3\2\2\2\u0147"+
		"\u011a\3\2\2\2\u0147\u0120\3\2\2\2\u0147\u0126\3\2\2\2\u0147\u012c\3\2"+
		"\2\2\u0147\u0131\3\2\2\2\u0147\u0136\3\2\2\2\u0147\u013c\3\2\2\2\u0147"+
		"\u013f\3\2\2\2\u0147\u0142\3\2\2\2\u0148\35\3\2\2\2\u0149\u014e\7)\2\2"+
		"\u014a\u014b\7\4\2\2\u014b\u014d\7)\2\2\u014c\u014a\3\2\2\2\u014d\u0150"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\37\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0156\5\22\n\2\u0152\u0153\7\4\2\2\u0153\u0155\5"+
		"\22\n\2\u0154\u0152\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157!\3\2\2\2\u0158\u0156\3\2\2\2$(-\65>DNTw\177\u0083"+
		"\u008d\u0096\u009e\u00a6\u00b3\u00cf\u00d1\u00dd\u00e3\u00ec\u00f1\u00fc"+
		"\u0101\u0106\u010e\u0112\u0117\u011d\u0123\u0129\u0139\u0147\u014e\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}