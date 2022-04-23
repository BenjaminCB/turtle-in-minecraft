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
		T__17=18, T__18=19, T__19=20, WS=21, LINE_COMMENT=22, COMMENT=23, NUMBER=24, 
		BOOL=25, STRING=26, ID=27, BLOCK=28, RELDIR=29, ABSDIR=30, ASSIGN=31, 
		ADDASSIGN=32, SUBASSIGN=33, MULTASSIGN=34, DIVASSIGN=35, MODASSIGN=36, 
		POWERASSIGN=37, NOT=38, SUB=39, POWER=40, MULT=41, DIV=42, MOD=43, ADD=44, 
		CONCAT=45, LT=46, LTEQ=47, GT=48, GTEQ=49, EQ=50, NEQ=51, AND=52, OR=53;
	public static final int
		RULE_list = 0, RULE_statements = 1, RULE_statement = 2, RULE_control_structure = 3, 
		RULE_assignment = 4, RULE_expression = 5, RULE_constant = 6, RULE_function = 7, 
		RULE_anonymous_function = 8, RULE_function_application = 9, RULE_parameters = 10, 
		RULE_arguments = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"list", "statements", "statement", "control_structure", "assignment", 
			"expression", "constant", "function", "anonymous_function", "function_application", 
			"parameters", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'return'", "'if'", "'do'", "'else'", "'end'", 
			"'while'", "'repeat'", "'foreach'", "'in'", "'switch'", "'case'", "'default'", 
			"'('", "')'", "'function'", "'fn'", "'->'", null, null, null, null, null, 
			null, null, null, null, null, "'='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'^='", "'not'", "'-'", "'^'", "'*'", "'/'", "'%'", "'+'", "'++'", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "WS", "LINE_COMMENT", 
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

	public static class ListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__0);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__17) | (1L << T__18) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR))) != 0)) {
				{
				{
				setState(25);
				constant();
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(26);
					match(T__1);
					setState(27);
					constant();
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0) );
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				assignment();
				}
				break;
			case 2:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				expression(0);
				}
				break;
			case 3:
				_localctx = new FuncStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				function();
				}
				break;
			case 4:
				_localctx = new CtrlStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				control_structure();
				}
				break;
			case 5:
				_localctx = new RetStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(T__3);
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(50);
					expression(0);
					}
					break;
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(53);
					match(T__1);
					setState(54);
					expression(0);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			case T__4:
				_localctx = new IfCtrlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(T__4);
				setState(63);
				expression(0);
				setState(64);
				match(T__5);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(65);
					statements();
					}
				}

				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(68);
						match(T__6);
						setState(69);
						match(T__4);
						setState(70);
						expression(0);
						setState(71);
						match(T__5);
						setState(72);
						statements();
						}
						} 
					}
					setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(79);
					match(T__6);
					setState(80);
					match(T__5);
					setState(81);
					statements();
					}
				}

				setState(84);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new WhileCtrlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__8);
				setState(87);
				expression(0);
				setState(88);
				match(T__5);
				setState(89);
				statements();
				setState(90);
				match(T__7);
				}
				break;
			case T__9:
				_localctx = new RepeatCtrlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(T__9);
				setState(93);
				expression(0);
				setState(94);
				match(T__5);
				setState(95);
				statements();
				setState(96);
				match(T__7);
				}
				break;
			case T__10:
				_localctx = new ForeachCtrlContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(T__10);
				setState(99);
				match(ID);
				setState(100);
				match(T__11);
				setState(101);
				expression(0);
				setState(102);
				match(T__5);
				setState(103);
				statements();
				setState(104);
				match(T__7);
				}
				break;
			case T__12:
				_localctx = new SwitchCtrlContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(T__12);
				setState(107);
				expression(0);
				setState(108);
				match(T__5);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(109);
					match(T__13);
					setState(110);
					expression(0);
					setState(111);
					match(T__5);
					setState(112);
					statements();
					setState(113);
					match(T__7);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(120);
					match(T__14);
					setState(121);
					match(T__5);
					setState(122);
					statements();
					setState(123);
					match(T__7);
					}
				}

				setState(127);
				match(T__7);
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
			setState(131);
			match(ID);
			setState(132);
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
			setState(133);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(136);
				match(T__15);
				setState(137);
				expression(0);
				setState(138);
				match(T__16);
				}
				break;
			case 2:
				{
				_localctx = new FuncAppExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				function_application();
				}
				break;
			case 3:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
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
				setState(142);
				expression(10);
				}
				break;
			case 4:
				{
				_localctx = new ConstExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				constant();
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(148);
						match(POWER);
						setState(149);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new FactorExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(151);
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
						setState(152);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new TermExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(154);
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
						setState(155);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new CompExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(157);
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
						setState(158);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
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
						setState(161);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(163);
						match(AND);
						setState(164);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(166);
						match(OR);
						setState(167);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(172);
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
	public static class ListConstContext extends ConstantContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitListConst(this);
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
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(NUMBER);
				}
				break;
			case BOOL:
				_localctx = new BoolConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new StringConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(STRING);
				}
				break;
			case BLOCK:
				_localctx = new BlockConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(BLOCK);
				}
				break;
			case RELDIR:
				_localctx = new RelDirConstContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(RELDIR);
				}
				break;
			case ABSDIR:
				_localctx = new AbsDirConstContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				match(ABSDIR);
				}
				break;
			case T__0:
				_localctx = new ListConstContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				list();
				}
				break;
			case T__17:
			case T__18:
				_localctx = new AnonFuncConstContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
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
		enterRule(_localctx, 14, RULE_function);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new DclFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(T__17);
				setState(184);
				match(ID);
				setState(185);
				match(T__15);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(186);
					parameters();
					}
				}

				setState(189);
				match(T__16);
				setState(190);
				match(T__5);
				setState(191);
				statements();
				setState(192);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new AnonFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
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
	public static class LambdaAnanFuncContext extends Anonymous_functionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(timcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(timcParser.ID, i);
		}
		public LambdaAnanFuncContext(Anonymous_functionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof timcVisitor ) return ((timcVisitor<? extends T>)visitor).visitLambdaAnanFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anonymous_functionContext anonymous_function() throws RecognitionException {
		Anonymous_functionContext _localctx = new Anonymous_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_anonymous_function);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				_localctx = new StmtAnonFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__17);
				setState(198);
				match(T__15);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(199);
					parameters();
					}
				}

				setState(202);
				match(T__16);
				setState(203);
				match(T__5);
				setState(204);
				statements();
				setState(205);
				match(T__7);
				}
				break;
			case T__18:
				_localctx = new LambdaAnanFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(T__18);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(208);
					match(ID);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
				match(T__19);
				setState(215);
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
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdFuncAppContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(ID);
				setState(219);
				match(T__15);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(220);
					arguments();
					}
				}

				setState(223);
				match(T__16);
				}
				break;
			case T__15:
				_localctx = new ConstFuncAppContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(T__15);
				setState(225);
				anonymous_function();
				setState(226);
				match(T__16);
				setState(227);
				match(T__15);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << ID) | (1L << BLOCK) | (1L << RELDIR) | (1L << ABSDIR) | (1L << NOT) | (1L << SUB))) != 0)) {
					{
					setState(228);
					arguments();
					}
				}

				setState(231);
				match(T__16);
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
		enterRule(_localctx, 20, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(ID);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(236);
				match(T__1);
				setState(237);
				match(ID);
				}
				}
				setState(242);
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
		enterRule(_localctx, 22, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			expression(0);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(244);
				match(T__1);
				setState(245);
				expression(0);
				}
				}
				setState(250);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u00fe\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\7\2$"+
		"\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\6\3,\n\3\r\3\16\3-\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\66\n\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\5\4?\n\4\3\5\3\5\3\5"+
		"\3\5\5\5E\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5\3\5"+
		"\3\5\5\5U\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5v\n\5\f\5\16\5y\13\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\5\3\5\5\5\u0084"+
		"\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0094"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u00ab\n\7\f\7\16\7\u00ae\13\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00b8\n\b\3\t\3\t\3\t\3\t\5\t\u00be\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00c6\n\t\3\n\3\n\3\n\5\n\u00cb\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u00d4\n\n\f\n\16\n\u00d7\13\n\3\n\3\n\5\n\u00db\n\n\3\13"+
		"\3\13\3\13\5\13\u00e0\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e8\n"+
		"\13\3\13\3\13\5\13\u00ec\n\13\3\f\3\f\3\f\7\f\u00f1\n\f\f\f\16\f\u00f4"+
		"\13\f\3\r\3\r\3\r\7\r\u00f9\n\r\f\r\16\r\u00fc\13\r\3\r\2\3\f\16\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\2\b\3\2!\'\3\2()\3\2+-\4\2))./\3\2\60\63\3\2"+
		"\64\65\2\u011f\2\32\3\2\2\2\4+\3\2\2\2\6>\3\2\2\2\b\u0083\3\2\2\2\n\u0085"+
		"\3\2\2\2\f\u0093\3\2\2\2\16\u00b7\3\2\2\2\20\u00c5\3\2\2\2\22\u00da\3"+
		"\2\2\2\24\u00eb\3\2\2\2\26\u00ed\3\2\2\2\30\u00f5\3\2\2\2\32%\7\3\2\2"+
		"\33 \5\16\b\2\34\35\7\4\2\2\35\37\5\16\b\2\36\34\3\2\2\2\37\"\3\2\2\2"+
		" \36\3\2\2\2 !\3\2\2\2!$\3\2\2\2\" \3\2\2\2#\33\3\2\2\2$\'\3\2\2\2%#\3"+
		"\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\5\2\2)\3\3\2\2\2*,\5\6\4\2+"+
		"*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/?\5\n\6\2\60?\5\f\7"+
		"\2\61?\5\20\t\2\62?\5\b\5\2\63\65\7\6\2\2\64\66\5\f\7\2\65\64\3\2\2\2"+
		"\65\66\3\2\2\2\66;\3\2\2\2\678\7\4\2\28:\5\f\7\29\67\3\2\2\2:=\3\2\2\2"+
		";9\3\2\2\2;<\3\2\2\2<?\3\2\2\2=;\3\2\2\2>/\3\2\2\2>\60\3\2\2\2>\61\3\2"+
		"\2\2>\62\3\2\2\2>\63\3\2\2\2?\7\3\2\2\2@A\7\7\2\2AB\5\f\7\2BD\7\b\2\2"+
		"CE\5\4\3\2DC\3\2\2\2DE\3\2\2\2EN\3\2\2\2FG\7\t\2\2GH\7\7\2\2HI\5\f\7\2"+
		"IJ\7\b\2\2JK\5\4\3\2KM\3\2\2\2LF\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2"+
		"OT\3\2\2\2PN\3\2\2\2QR\7\t\2\2RS\7\b\2\2SU\5\4\3\2TQ\3\2\2\2TU\3\2\2\2"+
		"UV\3\2\2\2VW\7\n\2\2W\u0084\3\2\2\2XY\7\13\2\2YZ\5\f\7\2Z[\7\b\2\2[\\"+
		"\5\4\3\2\\]\7\n\2\2]\u0084\3\2\2\2^_\7\f\2\2_`\5\f\7\2`a\7\b\2\2ab\5\4"+
		"\3\2bc\7\n\2\2c\u0084\3\2\2\2de\7\r\2\2ef\7\35\2\2fg\7\16\2\2gh\5\f\7"+
		"\2hi\7\b\2\2ij\5\4\3\2jk\7\n\2\2k\u0084\3\2\2\2lm\7\17\2\2mn\5\f\7\2n"+
		"w\7\b\2\2op\7\20\2\2pq\5\f\7\2qr\7\b\2\2rs\5\4\3\2st\7\n\2\2tv\3\2\2\2"+
		"uo\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\177\3\2\2\2yw\3\2\2\2z{\7\21"+
		"\2\2{|\7\b\2\2|}\5\4\3\2}~\7\n\2\2~\u0080\3\2\2\2\177z\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\n\2\2\u0082\u0084\3\2\2\2\u0083"+
		"@\3\2\2\2\u0083X\3\2\2\2\u0083^\3\2\2\2\u0083d\3\2\2\2\u0083l\3\2\2\2"+
		"\u0084\t\3\2\2\2\u0085\u0086\7\35\2\2\u0086\u0087\t\2\2\2\u0087\u0088"+
		"\5\f\7\2\u0088\13\3\2\2\2\u0089\u008a\b\7\1\2\u008a\u008b\7\22\2\2\u008b"+
		"\u008c\5\f\7\2\u008c\u008d\7\23\2\2\u008d\u0094\3\2\2\2\u008e\u0094\5"+
		"\24\13\2\u008f\u0090\t\3\2\2\u0090\u0094\5\f\7\f\u0091\u0094\5\16\b\2"+
		"\u0092\u0094\7\35\2\2\u0093\u0089\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u00ac\3\2\2\2\u0095"+
		"\u0096\f\13\2\2\u0096\u0097\7*\2\2\u0097\u00ab\5\f\7\13\u0098\u0099\f"+
		"\n\2\2\u0099\u009a\t\4\2\2\u009a\u00ab\5\f\7\13\u009b\u009c\f\t\2\2\u009c"+
		"\u009d\t\5\2\2\u009d\u00ab\5\f\7\n\u009e\u009f\f\b\2\2\u009f\u00a0\t\6"+
		"\2\2\u00a0\u00ab\5\f\7\t\u00a1\u00a2\f\7\2\2\u00a2\u00a3\t\7\2\2\u00a3"+
		"\u00ab\5\f\7\b\u00a4\u00a5\f\6\2\2\u00a5\u00a6\7\66\2\2\u00a6\u00ab\5"+
		"\f\7\7\u00a7\u00a8\f\5\2\2\u00a8\u00a9\7\67\2\2\u00a9\u00ab\5\f\7\6\u00aa"+
		"\u0095\3\2\2\2\u00aa\u0098\3\2\2\2\u00aa\u009b\3\2\2\2\u00aa\u009e\3\2"+
		"\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\r\3\2\2\2"+
		"\u00ae\u00ac\3\2\2\2\u00af\u00b8\7\32\2\2\u00b0\u00b8\7\33\2\2\u00b1\u00b8"+
		"\7\34\2\2\u00b2\u00b8\7\36\2\2\u00b3\u00b8\7\37\2\2\u00b4\u00b8\7 \2\2"+
		"\u00b5\u00b8\5\2\2\2\u00b6\u00b8\5\22\n\2\u00b7\u00af\3\2\2\2\u00b7\u00b0"+
		"\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\17\3\2\2"+
		"\2\u00b9\u00ba\7\24\2\2\u00ba\u00bb\7\35\2\2\u00bb\u00bd\7\22\2\2\u00bc"+
		"\u00be\5\26\f\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3"+
		"\2\2\2\u00bf\u00c0\7\23\2\2\u00c0\u00c1\7\b\2\2\u00c1\u00c2\5\4\3\2\u00c2"+
		"\u00c3\7\n\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c6\5\22\n\2\u00c5\u00b9\3"+
		"\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\21\3\2\2\2\u00c7\u00c8\7\24\2\2\u00c8"+
		"\u00ca\7\22\2\2\u00c9\u00cb\5\26\f\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\23\2\2\u00cd\u00ce\7\b\2\2\u00ce"+
		"\u00cf\5\4\3\2\u00cf\u00d0\7\n\2\2\u00d0\u00db\3\2\2\2\u00d1\u00d5\7\25"+
		"\2\2\u00d2\u00d4\7\35\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00d9\7\26\2\2\u00d9\u00db\5\f\7\2\u00da\u00c7\3\2\2\2\u00da"+
		"\u00d1\3\2\2\2\u00db\23\3\2\2\2\u00dc\u00dd\7\35\2\2\u00dd\u00df\7\22"+
		"\2\2\u00de\u00e0\5\30\r\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00ec\7\23\2\2\u00e2\u00e3\7\22\2\2\u00e3\u00e4\5"+
		"\22\n\2\u00e4\u00e5\7\23\2\2\u00e5\u00e7\7\22\2\2\u00e6\u00e8\5\30\r\2"+
		"\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\7\23\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00dc\3\2\2\2\u00eb\u00e2\3\2\2\2"+
		"\u00ec\25\3\2\2\2\u00ed\u00f2\7\35\2\2\u00ee\u00ef\7\4\2\2\u00ef\u00f1"+
		"\7\35\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\27\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00fa"+
		"\5\f\7\2\u00f6\u00f7\7\4\2\2\u00f7\u00f9\5\f\7\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\31\3\2\2"+
		"\2\u00fc\u00fa\3\2\2\2\34 %-\65;>DNTw\177\u0083\u0093\u00aa\u00ac\u00b7"+
		"\u00bd\u00c5\u00ca\u00d5\u00da\u00df\u00e7\u00eb\u00f2\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}