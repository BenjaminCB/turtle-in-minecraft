// Generated from /Users/tor/Git/comsci/turtle-in-minecraft/antlr/timc.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, WS=43, NUMBER=44, BOOL=45, STRING=46, 
		BLOCK=47, ID=48;
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
			"'='", "'+='", "'-='", "'*='", "'^='", "'%='", "'('", "')'", "'not'", 
			"'-'", "'^'", "'*'", "'/'", "'%'", "'+'", "'++'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'and'", "'or'", "'function'", "'fn'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "WS", "NUMBER", "BOOL", "STRING", 
			"BLOCK", "ID"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__39) | (1L << T__40) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK))) != 0)) {
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			statement();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__39) | (1L << T__40) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK) | (1L << ID))) != 0)) {
				{
				setState(41);
				statements();
				}
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_applicationContext function_application() {
			return getRuleContext(Function_applicationContext.class,0);
		}
		public Control_structureContext control_structure() {
			return getRuleContext(Control_structureContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				function_application();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				control_structure();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				match(T__3);
				setState(50);
				expression(0);
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
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public Control_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_structure; }
	}

	public final Control_structureContext control_structure() throws RecognitionException {
		Control_structureContext _localctx = new Control_structureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_control_structure);
		int _la;
		try {
			int _alt;
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(T__4);
				setState(54);
				expression(0);
				setState(55);
				match(T__5);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__39) | (1L << T__40) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK) | (1L << ID))) != 0)) {
					{
					setState(56);
					statements();
					}
				}

				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(59);
						match(T__6);
						setState(60);
						match(T__4);
						setState(61);
						expression(0);
						setState(62);
						match(T__5);
						setState(63);
						statements();
						}
						} 
					}
					setState(69);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(70);
					match(T__6);
					setState(71);
					match(T__5);
					setState(72);
					statements();
					}
				}

				setState(75);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__8);
				setState(78);
				expression(0);
				setState(79);
				match(T__5);
				setState(80);
				statements();
				setState(81);
				match(T__7);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(T__9);
				setState(84);
				expression(0);
				setState(85);
				match(T__5);
				setState(86);
				statements();
				setState(87);
				match(T__7);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(T__10);
				setState(90);
				match(ID);
				setState(91);
				match(T__11);
				setState(92);
				expression(0);
				setState(93);
				match(T__5);
				setState(94);
				statements();
				setState(95);
				match(T__7);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(T__12);
				setState(98);
				expression(0);
				setState(99);
				match(T__5);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(100);
					match(T__13);
					setState(101);
					expression(0);
					setState(102);
					match(T__5);
					setState(103);
					statements();
					setState(104);
					match(T__7);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(111);
					match(T__14);
					setState(112);
					match(T__5);
					setState(113);
					statements();
					setState(114);
					match(T__7);
					}
				}

				setState(118);
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
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(ID);
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_applicationContext function_application() {
			return getRuleContext(Function_applicationContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(127);
				match(T__21);
				setState(128);
				expression(0);
				setState(129);
				match(T__22);
				}
				break;
			case 2:
				{
				setState(131);
				function_application();
				}
				break;
			case 3:
				{
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				expression(10);
				}
				break;
			case 4:
				{
				setState(134);
				constant();
				}
				break;
			case 5:
				{
				setState(135);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(139);
						match(T__25);
						setState(140);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(142);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(145);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__29) | (1L << T__30))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(148);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(151);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(154);
						match(T__37);
						setState(155);
						expression(5);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(157);
						match(T__38);
						setState(158);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public TerminalNode NUMBER() { return getToken(timcParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(timcParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(timcParser.STRING, 0); }
		public TerminalNode BLOCK() { return getToken(timcParser.BLOCK, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Anonymous_functionContext anonymous_function() {
			return getRuleContext(Anonymous_functionContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constant);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(NUMBER);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(STRING);
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(BLOCK);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				list();
				}
				break;
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
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
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Anonymous_functionContext anonymous_function() {
			return getRuleContext(Anonymous_functionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__39);
				setState(173);
				match(ID);
				setState(174);
				match(T__21);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(175);
					parameters();
					}
				}

				setState(178);
				match(T__22);
				setState(179);
				match(T__5);
				setState(180);
				statements();
				setState(181);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(timcParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(timcParser.ID, i);
		}
		public Anonymous_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function; }
	}

	public final Anonymous_functionContext anonymous_function() throws RecognitionException {
		Anonymous_functionContext _localctx = new Anonymous_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_anonymous_function);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__39);
				setState(187);
				match(T__21);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(188);
					parameters();
					}
				}

				setState(191);
				match(T__22);
				setState(192);
				match(T__5);
				setState(193);
				statements();
				setState(194);
				match(T__7);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(T__40);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(197);
					match(ID);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(T__41);
				setState(204);
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
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Anonymous_functionContext anonymous_function() {
			return getRuleContext(Anonymous_functionContext.class,0);
		}
		public Function_applicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_application; }
	}

	public final Function_applicationContext function_application() throws RecognitionException {
		Function_applicationContext _localctx = new Function_applicationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_application);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(ID);
				setState(208);
				match(T__21);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__39) | (1L << T__40) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK) | (1L << ID))) != 0)) {
					{
					setState(209);
					arguments();
					}
				}

				setState(212);
				match(T__22);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__21);
				setState(214);
				anonymous_function();
				setState(215);
				match(T__22);
				setState(216);
				match(T__21);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__39) | (1L << T__40) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK) | (1L << ID))) != 0)) {
					{
					setState(217);
					arguments();
					}
				}

				setState(220);
				match(T__22);
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
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(ID);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(225);
				match(T__1);
				setState(226);
				match(ID);
				}
				}
				setState(231);
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
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expression(0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(233);
				match(T__1);
				setState(234);
				expression(0);
				}
				}
				setState(239);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u00f3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\7\2$"+
		"\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\66\n\4\3\5\3\5\3\5\3\5\5\5<\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5D"+
		"\n\5\f\5\16\5G\13\5\3\5\3\5\3\5\5\5L\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5w\n\5\3\5\3\5\5\5{\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u008b\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a2\n\7\f\7\16\7\u00a5\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ad\n\b\3\t\3\t\3\t\3\t\5\t\u00b3\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bb\n\t\3\n\3\n\3\n\5\n\u00c0\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c9\n\n\f\n\16\n\u00cc\13\n\3\n\3\n\5\n\u00d0"+
		"\n\n\3\13\3\13\3\13\5\13\u00d5\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00dd\n\13\3\13\3\13\5\13\u00e1\n\13\3\f\3\f\3\f\7\f\u00e6\n\f\f\f\16"+
		"\f\u00e9\13\f\3\r\3\r\3\r\7\r\u00ee\n\r\f\r\16\r\u00f1\13\r\3\r\2\3\f"+
		"\16\2\4\6\b\n\f\16\20\22\24\26\30\2\b\3\2\22\27\3\2\32\33\3\2\35\37\4"+
		"\2\33\33 !\3\2\"%\3\2&\'\2\u0111\2\32\3\2\2\2\4*\3\2\2\2\6\65\3\2\2\2"+
		"\bz\3\2\2\2\n|\3\2\2\2\f\u008a\3\2\2\2\16\u00ac\3\2\2\2\20\u00ba\3\2\2"+
		"\2\22\u00cf\3\2\2\2\24\u00e0\3\2\2\2\26\u00e2\3\2\2\2\30\u00ea\3\2\2\2"+
		"\32%\7\3\2\2\33 \5\16\b\2\34\35\7\4\2\2\35\37\5\16\b\2\36\34\3\2\2\2\37"+
		"\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!$\3\2\2\2\" \3\2\2\2#\33\3\2\2\2$\'\3"+
		"\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\5\2\2)\3\3\2\2\2*"+
		",\5\6\4\2+-\5\4\3\2,+\3\2\2\2,-\3\2\2\2-\5\3\2\2\2.\66\5\n\6\2/\66\5\f"+
		"\7\2\60\66\5\20\t\2\61\66\5\24\13\2\62\66\5\b\5\2\63\64\7\6\2\2\64\66"+
		"\5\f\7\2\65.\3\2\2\2\65/\3\2\2\2\65\60\3\2\2\2\65\61\3\2\2\2\65\62\3\2"+
		"\2\2\65\63\3\2\2\2\66\7\3\2\2\2\678\7\7\2\289\5\f\7\29;\7\b\2\2:<\5\4"+
		"\3\2;:\3\2\2\2;<\3\2\2\2<E\3\2\2\2=>\7\t\2\2>?\7\7\2\2?@\5\f\7\2@A\7\b"+
		"\2\2AB\5\4\3\2BD\3\2\2\2C=\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3\2"+
		"\2\2GE\3\2\2\2HI\7\t\2\2IJ\7\b\2\2JL\5\4\3\2KH\3\2\2\2KL\3\2\2\2LM\3\2"+
		"\2\2MN\7\n\2\2N{\3\2\2\2OP\7\13\2\2PQ\5\f\7\2QR\7\b\2\2RS\5\4\3\2ST\7"+
		"\n\2\2T{\3\2\2\2UV\7\f\2\2VW\5\f\7\2WX\7\b\2\2XY\5\4\3\2YZ\7\n\2\2Z{\3"+
		"\2\2\2[\\\7\r\2\2\\]\7\62\2\2]^\7\16\2\2^_\5\f\7\2_`\7\b\2\2`a\5\4\3\2"+
		"ab\7\n\2\2b{\3\2\2\2cd\7\17\2\2de\5\f\7\2en\7\b\2\2fg\7\20\2\2gh\5\f\7"+
		"\2hi\7\b\2\2ij\5\4\3\2jk\7\n\2\2km\3\2\2\2lf\3\2\2\2mp\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2ov\3\2\2\2pn\3\2\2\2qr\7\21\2\2rs\7\b\2\2st\5\4\3\2tu\7\n"+
		"\2\2uw\3\2\2\2vq\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\n\2\2y{\3\2\2\2z\67\3"+
		"\2\2\2zO\3\2\2\2zU\3\2\2\2z[\3\2\2\2zc\3\2\2\2{\t\3\2\2\2|}\7\62\2\2}"+
		"~\t\2\2\2~\177\5\f\7\2\177\13\3\2\2\2\u0080\u0081\b\7\1\2\u0081\u0082"+
		"\7\30\2\2\u0082\u0083\5\f\7\2\u0083\u0084\7\31\2\2\u0084\u008b\3\2\2\2"+
		"\u0085\u008b\5\24\13\2\u0086\u0087\t\3\2\2\u0087\u008b\5\f\7\f\u0088\u008b"+
		"\5\16\b\2\u0089\u008b\7\62\2\2\u008a\u0080\3\2\2\2\u008a\u0085\3\2\2\2"+
		"\u008a\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u00a3"+
		"\3\2\2\2\u008c\u008d\f\13\2\2\u008d\u008e\7\34\2\2\u008e\u00a2\5\f\7\13"+
		"\u008f\u0090\f\n\2\2\u0090\u0091\t\4\2\2\u0091\u00a2\5\f\7\13\u0092\u0093"+
		"\f\t\2\2\u0093\u0094\t\5\2\2\u0094\u00a2\5\f\7\n\u0095\u0096\f\b\2\2\u0096"+
		"\u0097\t\6\2\2\u0097\u00a2\5\f\7\t\u0098\u0099\f\7\2\2\u0099\u009a\t\7"+
		"\2\2\u009a\u00a2\5\f\7\b\u009b\u009c\f\6\2\2\u009c\u009d\7(\2\2\u009d"+
		"\u00a2\5\f\7\7\u009e\u009f\f\5\2\2\u009f\u00a0\7)\2\2\u00a0\u00a2\5\f"+
		"\7\6\u00a1\u008c\3\2\2\2\u00a1\u008f\3\2\2\2\u00a1\u0092\3\2\2\2\u00a1"+
		"\u0095\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009e\3\2"+
		"\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\r\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ad\7.\2\2\u00a7\u00ad\7/\2\2\u00a8"+
		"\u00ad\7\60\2\2\u00a9\u00ad\7\61\2\2\u00aa\u00ad\5\2\2\2\u00ab\u00ad\5"+
		"\22\n\2\u00ac\u00a6\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\17\3\2\2"+
		"\2\u00ae\u00af\7*\2\2\u00af\u00b0\7\62\2\2\u00b0\u00b2\7\30\2\2\u00b1"+
		"\u00b3\5\26\f\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b5\7\31\2\2\u00b5\u00b6\7\b\2\2\u00b6\u00b7\5\4\3\2\u00b7"+
		"\u00b8\7\n\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00bb\5\22\n\2\u00ba\u00ae\3"+
		"\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\21\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd\u00bf"+
		"\7\30\2\2\u00be\u00c0\5\26\f\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\31\2\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4"+
		"\5\4\3\2\u00c4\u00c5\7\n\2\2\u00c5\u00d0\3\2\2\2\u00c6\u00ca\7+\2\2\u00c7"+
		"\u00c9\7\62\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\7,\2\2\u00ce\u00d0\5\f\7\2\u00cf\u00bc\3\2\2\2\u00cf\u00c6\3\2"+
		"\2\2\u00d0\23\3\2\2\2\u00d1\u00d2\7\62\2\2\u00d2\u00d4\7\30\2\2\u00d3"+
		"\u00d5\5\30\r\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d6\u00e1\7\31\2\2\u00d7\u00d8\7\30\2\2\u00d8\u00d9\5\22\n\2"+
		"\u00d9\u00da\7\31\2\2\u00da\u00dc\7\30\2\2\u00db\u00dd\5\30\r\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\31"+
		"\2\2\u00df\u00e1\3\2\2\2\u00e0\u00d1\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e1"+
		"\25\3\2\2\2\u00e2\u00e7\7\62\2\2\u00e3\u00e4\7\4\2\2\u00e4\u00e6\7\62"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\27\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ef\5\f\7"+
		"\2\u00eb\u00ec\7\4\2\2\u00ec\u00ee\5\f\7\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\31\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\32 %,\65;EKnvz\u008a\u00a1\u00a3\u00ac\u00b2\u00ba\u00bf"+
		"\u00ca\u00cf\u00d4\u00dc\u00e0\u00e7\u00ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}