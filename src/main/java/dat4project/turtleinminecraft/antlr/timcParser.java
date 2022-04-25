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
		WS=32, LINE_COMMENT=33, COMMENT=34, NUMBER=35, BOOL=36, STRING=37, ID=38, 
		BLOCK=39, RELDIR=40, ABSDIR=41, ASSIGN=42, ADDASSIGN=43, SUBASSIGN=44, 
		MULTASSIGN=45, DIVASSIGN=46, MODASSIGN=47, POWERASSIGN=48, NOT=49, SUB=50, 
		POWER=51, MULT=52, DIV=53, MOD=54, ADD=55, CONCAT=56, LT=57, LTEQ=58, 
		GT=59, GTEQ=60, EQ=61, NEQ=62, AND=63, OR=64;
	public static final int
		RULE_array = 0, RULE_statements = 1, RULE_statement = 2, RULE_control_structure = 3, 
		RULE_assignment = 4, RULE_expression = 5, RULE_constant = 6, RULE_function = 7, 
		RULE_anonymous_function = 8, RULE_function_application = 9, RULE_build_in_func = 10, 
		RULE_parameters = 11, RULE_arguments = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"array", "statements", "statement", "control_structure", "assignment", 
			"expression", "constant", "function", "anonymous_function", "function_application", 
			"build_in_func", "parameters", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'return'", "'break'", "'if'", "'do'", "'else'", 
			"'end'", "'while'", "'repeat'", "'foreach'", "'in'", "'switch'", "'case'", 
			"'default'", "'('", "')'", "'function'", "'fn'", "'->'", "'forward'", 
			"'backward'", "'up'", "'down'", "'look'", "'turn'", "'print'", "'facing'", 
			"'position'", "' '", null, null, null, null, null, null, null, null, 
			null, null, "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'not'", 
			"'-'", "'^'", "'*'", "'/'", "'%'", "'+'", "'++'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "LINE_COMMENT", 
			"COMMENT", "NUMBER", "BOOL", "STRING", "ID", "BLOCK", "RELDIR", "ABSDIR", 
			"ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULTASSIGN", "DIVASSIGN", "MODASSIGN", 
			"POWERASSIGN", "NOT", "SUB", "POWER", "MULT", "DIV", "MOD", "ADD", "CONCAT", 
			"LT", "LTEQ", "GT", "GTEQ", "EQ", "NEQ", "AND", "OR"
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
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
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
			setState(26);
			match(T__0);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR))) != 0)) {
				{
				{
				setState(27);
				constant();
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(28);
					match(T__1);
					setState(29);
					constant();
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				statement();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0) );
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				assignment();
				}
				break;
			case 2:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				expression(0);
				}
				break;
			case 3:
				_localctx = new FuncStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				function();
				}
				break;
			case 4:
				_localctx = new CtrlStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				control_structure();
				}
				break;
			case 5:
				_localctx = new RetStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				match(T__3);
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(52);
					expression(0);
					}
					break;
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(55);
					match(T__1);
					setState(56);
					expression(0);
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new IfCtrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__5);
				setState(66);
				expression(0);
				setState(67);
				match(T__6);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(68);
					statements();
					}
				}

				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(71);
						match(T__7);
						setState(72);
						match(T__5);
						setState(73);
						expression(0);
						setState(74);
						match(T__6);
						setState(75);
						statements();
						}
						} 
					}
					setState(81);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(82);
					match(T__7);
					setState(83);
					match(T__6);
					setState(84);
					statements();
					}
				}

				setState(87);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new WhileCtrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__9);
				setState(90);
				expression(0);
				setState(91);
				match(T__6);
				setState(92);
				statements();
				setState(93);
				match(T__8);
				}
				break;
			case T__10:
				_localctx = new RepeatCtrlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(T__10);
				setState(96);
				expression(0);
				setState(97);
				match(T__6);
				setState(98);
				statements();
				setState(99);
				match(T__8);
				}
				break;
			case T__11:
				_localctx = new ForeachCtrlContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(T__11);
				setState(102);
				match(ID);
				setState(103);
				match(T__12);
				setState(104);
				expression(0);
				setState(105);
				match(T__6);
				setState(106);
				statements();
				setState(107);
				match(T__8);
				}
				break;
			case T__13:
				_localctx = new SwitchCtrlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(T__13);
				setState(110);
				expression(0);
				setState(111);
				match(T__6);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(112);
					match(T__14);
					setState(113);
					expression(0);
					setState(114);
					match(T__6);
					setState(115);
					statements();
					setState(116);
					match(T__8);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(123);
					match(T__15);
					setState(124);
					match(T__6);
					setState(125);
					statements();
					setState(126);
					match(T__8);
					}
				}

				setState(130);
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
		public Token op;
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(ID);
			setState(135);
			((AssignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ADDASSIGN) | (1L << SUBASSIGN) | (1L << MULTASSIGN) | (1L << DIVASSIGN) | (1L << MODASSIGN) | (1L << POWERASSIGN))) != 0)) ) {
				((AssignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(136);
			expression(0);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(139);
				match(T__16);
				setState(140);
				expression(0);
				setState(141);
				match(T__17);
				}
				break;
			case 2:
				{
				_localctx = new FuncAppExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				function_application();
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
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
				setState(145);
				expression(10);
				}
				break;
			case 4:
				{
				_localctx = new ConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				constant();
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(171);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(151);
						match(POWER);
						setState(152);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new FactorExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(154);
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
						setState(155);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new TermExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(157);
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
						setState(158);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new CompExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(160);
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
						setState(161);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(163);
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
						setState(164);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
						match(AND);
						setState(167);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(169);
						match(OR);
						setState(170);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 12, RULE_constant);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(NUMBER);
				}
				break;
			case BOOL:
				_localctx = new BoolConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new StringConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(STRING);
				}
				break;
			case BLOCK:
				_localctx = new BlockConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(BLOCK);
				}
				break;
			case RELDIR:
				_localctx = new RelDirConstContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				match(RELDIR);
				}
				break;
			case ABSDIR:
				_localctx = new AbsDirConstContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				match(ABSDIR);
				}
				break;
			case T__0:
				_localctx = new ArrayConstContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				array();
				}
				break;
			case T__18:
			case T__19:
				_localctx = new AnonFuncConstContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
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
		enterRule(_localctx, 14, RULE_function);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new DclFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__18);
				setState(187);
				match(ID);
				setState(188);
				match(T__16);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(189);
					parameters();
					}
				}

				setState(192);
				match(T__17);
				setState(193);
				match(T__6);
				setState(194);
				statements();
				setState(195);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new AnonFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				anonymous_function();
				}
				break;
			case 3:
				_localctx = new BuildInFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
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
		enterRule(_localctx, 16, RULE_anonymous_function);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				_localctx = new StmtAnonFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__18);
				setState(202);
				match(T__16);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(203);
					parameters();
					}
				}

				setState(206);
				match(T__17);
				setState(207);
				match(T__6);
				setState(208);
				statements();
				setState(209);
				match(T__8);
				}
				break;
			case T__19:
				_localctx = new LambdaAnonFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__19);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(212);
					match(ID);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
				match(T__20);
				setState(219);
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
		enterRule(_localctx, 18, RULE_function_application);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdFuncAppContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(ID);
				setState(223);
				match(T__16);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(224);
					arguments();
					}
				}

				setState(227);
				match(T__17);
				}
				break;
			case T__16:
				_localctx = new ConstFuncAppContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__16);
				setState(229);
				anonymous_function();
				setState(230);
				match(T__17);
				setState(231);
				match(T__16);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(232);
					arguments();
					}
				}

				setState(235);
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
		public List<TerminalNode> NUMBER() { return getTokens(timcParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(timcParser.NUMBER, i);
		}
		public PositionFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitPositionFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TurnFuncContext extends Build_in_funcContext {
		public TerminalNode RELDIR() { return getToken(timcParser.RELDIR, 0); }
		public TerminalNode ABSDIR() { return getToken(timcParser.ABSDIR, 0); }
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
		public TerminalNode RELDIR() { return getToken(timcParser.RELDIR, 0); }
		public LookFuncContext(Build_in_funcContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitLookFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_in_funcContext build_in_func() throws RecognitionException {
		Build_in_funcContext _localctx = new Build_in_funcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_build_in_func);
		int _la;
		try {
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new ForwardFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(T__21);
				setState(240);
				match(T__16);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(241);
					expression(0);
					}
				}

				setState(244);
				match(T__17);
				}
				break;
			case T__22:
				_localctx = new BackwardFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(T__22);
				setState(246);
				match(T__16);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(247);
					expression(0);
					}
				}

				setState(250);
				match(T__17);
				}
				break;
			case T__23:
				_localctx = new UpFuncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(T__23);
				setState(252);
				match(T__16);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(253);
					expression(0);
					}
				}

				setState(256);
				match(T__17);
				}
				break;
			case T__24:
				_localctx = new DownFuncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(T__24);
				setState(258);
				match(T__16);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(259);
					expression(0);
					}
				}

				setState(262);
				match(T__17);
				}
				break;
			case T__25:
				_localctx = new LookFuncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				match(T__25);
				setState(264);
				match(T__16);
				setState(265);
				match(RELDIR);
				setState(266);
				match(T__17);
				}
				break;
			case T__26:
				_localctx = new TurnFuncContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				match(T__26);
				setState(268);
				match(T__16);
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==RELDIR || _la==ABSDIR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				match(T__17);
				}
				break;
			case T__27:
				_localctx = new PrintFuncContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(271);
				match(T__27);
				setState(272);
				match(T__16);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(273);
					expression(0);
					}
				}

				setState(276);
				match(T__17);
				}
				break;
			case T__28:
				_localctx = new FacingFuncContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
				match(T__28);
				setState(278);
				match(T__16);
				setState(279);
				match(T__17);
				}
				break;
			case T__29:
				_localctx = new PositionFuncContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(280);
				match(T__29);
				setState(281);
				match(T__16);
				setState(288);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__30:
					{
					setState(282);
					match(T__30);
					}
					break;
				case NUMBER:
					{
					setState(283);
					match(NUMBER);
					setState(284);
					match(T__1);
					setState(285);
					match(NUMBER);
					setState(286);
					match(T__1);
					setState(287);
					match(NUMBER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(290);
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
		enterRule(_localctx, 22, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ID);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(294);
				match(T__1);
				setState(295);
				match(ID);
				}
				}
				setState(300);
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
		enterRule(_localctx, 24, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			expression(0);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(302);
				match(T__1);
				setState(303);
				expression(0);
				}
				}
				setState(308);
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
		case 5:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2"+
		"\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\6\3.\n\3\r\3\16\3/\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\48\n\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\5\4B\n\4\3\5\3"+
		"\5\3\5\3\5\5\5H\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13\5\3"+
		"\5\3\5\3\5\5\5X\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u0083\n\5\3\5\3\5"+
		"\5\5\u0087\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0097\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bb\n\b\3\t\3\t\3\t\3\t\5\t\u00c1\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ca\n\t\3\n\3\n\3\n\5\n\u00cf\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d8\n\n\f\n\16\n\u00db\13\n\3\n\3\n\5\n"+
		"\u00df\n\n\3\13\3\13\3\13\5\13\u00e4\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00ec\n\13\3\13\3\13\5\13\u00f0\n\13\3\f\3\f\3\f\5\f\u00f5\n\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00fb\n\f\3\f\3\f\3\f\3\f\5\f\u0101\n\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0107\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0115\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0123\n"+
		"\f\3\f\5\f\u0126\n\f\3\r\3\r\3\r\7\r\u012b\n\r\f\r\16\r\u012e\13\r\3\16"+
		"\3\16\3\16\7\16\u0133\n\16\f\16\16\16\u0136\13\16\3\16\2\3\f\17\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\2\t\3\2,\62\3\2\63\64\3\2\668\4\2\64\649:"+
		"\3\2;>\3\2?@\3\2*+\2\u0168\2\34\3\2\2\2\4-\3\2\2\2\6A\3\2\2\2\b\u0086"+
		"\3\2\2\2\n\u0088\3\2\2\2\f\u0096\3\2\2\2\16\u00ba\3\2\2\2\20\u00c9\3\2"+
		"\2\2\22\u00de\3\2\2\2\24\u00ef\3\2\2\2\26\u0125\3\2\2\2\30\u0127\3\2\2"+
		"\2\32\u012f\3\2\2\2\34\'\7\3\2\2\35\"\5\16\b\2\36\37\7\4\2\2\37!\5\16"+
		"\b\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#&\3\2\2\2$\"\3\2\2\2"+
		"%\35\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7"+
		"\5\2\2+\3\3\2\2\2,.\5\6\4\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2"+
		"\60\5\3\2\2\2\61B\5\n\6\2\62B\5\f\7\2\63B\5\20\t\2\64B\5\b\5\2\65\67\7"+
		"\6\2\2\668\5\f\7\2\67\66\3\2\2\2\678\3\2\2\28=\3\2\2\29:\7\4\2\2:<\5\f"+
		"\7\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>B\3\2\2\2?=\3\2\2\2@B\7\7"+
		"\2\2A\61\3\2\2\2A\62\3\2\2\2A\63\3\2\2\2A\64\3\2\2\2A\65\3\2\2\2A@\3\2"+
		"\2\2B\7\3\2\2\2CD\7\b\2\2DE\5\f\7\2EG\7\t\2\2FH\5\4\3\2GF\3\2\2\2GH\3"+
		"\2\2\2HQ\3\2\2\2IJ\7\n\2\2JK\7\b\2\2KL\5\f\7\2LM\7\t\2\2MN\5\4\3\2NP\3"+
		"\2\2\2OI\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RW\3\2\2\2SQ\3\2\2\2TU\7"+
		"\n\2\2UV\7\t\2\2VX\5\4\3\2WT\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\13\2\2Z\u0087"+
		"\3\2\2\2[\\\7\f\2\2\\]\5\f\7\2]^\7\t\2\2^_\5\4\3\2_`\7\13\2\2`\u0087\3"+
		"\2\2\2ab\7\r\2\2bc\5\f\7\2cd\7\t\2\2de\5\4\3\2ef\7\13\2\2f\u0087\3\2\2"+
		"\2gh\7\16\2\2hi\7(\2\2ij\7\17\2\2jk\5\f\7\2kl\7\t\2\2lm\5\4\3\2mn\7\13"+
		"\2\2n\u0087\3\2\2\2op\7\20\2\2pq\5\f\7\2qz\7\t\2\2rs\7\21\2\2st\5\f\7"+
		"\2tu\7\t\2\2uv\5\4\3\2vw\7\13\2\2wy\3\2\2\2xr\3\2\2\2y|\3\2\2\2zx\3\2"+
		"\2\2z{\3\2\2\2{\u0082\3\2\2\2|z\3\2\2\2}~\7\22\2\2~\177\7\t\2\2\177\u0080"+
		"\5\4\3\2\u0080\u0081\7\13\2\2\u0081\u0083\3\2\2\2\u0082}\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\13\2\2\u0085\u0087\3"+
		"\2\2\2\u0086C\3\2\2\2\u0086[\3\2\2\2\u0086a\3\2\2\2\u0086g\3\2\2\2\u0086"+
		"o\3\2\2\2\u0087\t\3\2\2\2\u0088\u0089\7(\2\2\u0089\u008a\t\2\2\2\u008a"+
		"\u008b\5\f\7\2\u008b\13\3\2\2\2\u008c\u008d\b\7\1\2\u008d\u008e\7\23\2"+
		"\2\u008e\u008f\5\f\7\2\u008f\u0090\7\24\2\2\u0090\u0097\3\2\2\2\u0091"+
		"\u0097\5\24\13\2\u0092\u0093\t\3\2\2\u0093\u0097\5\f\7\f\u0094\u0097\5"+
		"\16\b\2\u0095\u0097\7(\2\2\u0096\u008c\3\2\2\2\u0096\u0091\3\2\2\2\u0096"+
		"\u0092\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u00af\3\2"+
		"\2\2\u0098\u0099\f\13\2\2\u0099\u009a\7\65\2\2\u009a\u00ae\5\f\7\13\u009b"+
		"\u009c\f\n\2\2\u009c\u009d\t\4\2\2\u009d\u00ae\5\f\7\13\u009e\u009f\f"+
		"\t\2\2\u009f\u00a0\t\5\2\2\u00a0\u00ae\5\f\7\n\u00a1\u00a2\f\b\2\2\u00a2"+
		"\u00a3\t\6\2\2\u00a3\u00ae\5\f\7\t\u00a4\u00a5\f\7\2\2\u00a5\u00a6\t\7"+
		"\2\2\u00a6\u00ae\5\f\7\b\u00a7\u00a8\f\6\2\2\u00a8\u00a9\7A\2\2\u00a9"+
		"\u00ae\5\f\7\7\u00aa\u00ab\f\5\2\2\u00ab\u00ac\7B\2\2\u00ac\u00ae\5\f"+
		"\7\6\u00ad\u0098\3\2\2\2\u00ad\u009b\3\2\2\2\u00ad\u009e\3\2\2\2\u00ad"+
		"\u00a1\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00aa\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\r\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00bb\7%\2\2\u00b3\u00bb\7&\2\2\u00b4"+
		"\u00bb\7\'\2\2\u00b5\u00bb\7)\2\2\u00b6\u00bb\7*\2\2\u00b7\u00bb\7+\2"+
		"\2\u00b8\u00bb\5\2\2\2\u00b9\u00bb\5\22\n\2\u00ba\u00b2\3\2\2\2\u00ba"+
		"\u00b3\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2"+
		"\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\17\3\2\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00be\7(\2\2\u00be\u00c0\7\23\2"+
		"\2\u00bf\u00c1\5\30\r\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\7\24\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\5"+
		"\4\3\2\u00c5\u00c6\7\13\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00ca\5\22\n\2\u00c8"+
		"\u00ca\5\26\f\2\u00c9\u00bc\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3"+
		"\2\2\2\u00ca\21\3\2\2\2\u00cb\u00cc\7\25\2\2\u00cc\u00ce\7\23\2\2\u00cd"+
		"\u00cf\5\30\r\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\7\24\2\2\u00d1\u00d2\7\t\2\2\u00d2\u00d3\5\4\3\2\u00d3"+
		"\u00d4\7\13\2\2\u00d4\u00df\3\2\2\2\u00d5\u00d9\7\26\2\2\u00d6\u00d8\7"+
		"(\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\27"+
		"\2\2\u00dd\u00df\5\f\7\2\u00de\u00cb\3\2\2\2\u00de\u00d5\3\2\2\2\u00df"+
		"\23\3\2\2\2\u00e0\u00e1\7(\2\2\u00e1\u00e3\7\23\2\2\u00e2\u00e4\5\32\16"+
		"\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00f0"+
		"\7\24\2\2\u00e6\u00e7\7\23\2\2\u00e7\u00e8\5\22\n\2\u00e8\u00e9\7\24\2"+
		"\2\u00e9\u00eb\7\23\2\2\u00ea\u00ec\5\32\16\2\u00eb\u00ea\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\24\2\2\u00ee\u00f0\3"+
		"\2\2\2\u00ef\u00e0\3\2\2\2\u00ef\u00e6\3\2\2\2\u00f0\25\3\2\2\2\u00f1"+
		"\u00f2\7\30\2\2\u00f2\u00f4\7\23\2\2\u00f3\u00f5\5\f\7\2\u00f4\u00f3\3"+
		"\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u0126\7\24\2\2\u00f7"+
		"\u00f8\7\31\2\2\u00f8\u00fa\7\23\2\2\u00f9\u00fb\5\f\7\2\u00fa\u00f9\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0126\7\24\2\2\u00fd"+
		"\u00fe\7\32\2\2\u00fe\u0100\7\23\2\2\u00ff\u0101\5\f\7\2\u0100\u00ff\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0126\7\24\2\2\u0103"+
		"\u0104\7\33\2\2\u0104\u0106\7\23\2\2\u0105\u0107\5\f\7\2\u0106\u0105\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0126\7\24\2\2\u0109"+
		"\u010a\7\34\2\2\u010a\u010b\7\23\2\2\u010b\u010c\7*\2\2\u010c\u0126\7"+
		"\24\2\2\u010d\u010e\7\35\2\2\u010e\u010f\7\23\2\2\u010f\u0110\t\b\2\2"+
		"\u0110\u0126\7\24\2\2\u0111\u0112\7\36\2\2\u0112\u0114\7\23\2\2\u0113"+
		"\u0115\5\f\7\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0126\7\24\2\2\u0117\u0118\7\37\2\2\u0118\u0119\7\23\2\2\u0119"+
		"\u0126\7\24\2\2\u011a\u011b\7 \2\2\u011b\u0122\7\23\2\2\u011c\u0123\7"+
		"!\2\2\u011d\u011e\7%\2\2\u011e\u011f\7\4\2\2\u011f\u0120\7%\2\2\u0120"+
		"\u0121\7\4\2\2\u0121\u0123\7%\2\2\u0122\u011c\3\2\2\2\u0122\u011d\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0126\7\24\2\2\u0125\u00f1\3\2\2\2\u0125"+
		"\u00f7\3\2\2\2\u0125\u00fd\3\2\2\2\u0125\u0103\3\2\2\2\u0125\u0109\3\2"+
		"\2\2\u0125\u010d\3\2\2\2\u0125\u0111\3\2\2\2\u0125\u0117\3\2\2\2\u0125"+
		"\u011a\3\2\2\2\u0126\27\3\2\2\2\u0127\u012c\7(\2\2\u0128\u0129\7\4\2\2"+
		"\u0129\u012b\7(\2\2\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\31\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0134\5\f\7\2\u0130\u0131\7\4\2\2\u0131\u0133\5\f\7\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\33\3\2\2\2\u0136\u0134\3\2\2\2#\"\'/\67=AGQWz\u0082\u0086\u0096\u00ad"+
		"\u00af\u00ba\u00c0\u00c9\u00ce\u00d9\u00de\u00e3\u00eb\u00ef\u00f4\u00fa"+
		"\u0100\u0106\u0114\u0122\u0125\u012c\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}