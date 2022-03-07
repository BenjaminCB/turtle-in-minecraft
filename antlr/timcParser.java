// Generated from timc.g4 by ANTLR 4.9.3
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
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

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
		RULE_expression = 4, RULE_and_expression = 5, RULE_equality = 6, RULE_comparison = 7, 
		RULE_term = 8, RULE_factor = 9, RULE_power = 10, RULE_unary = 11, RULE_primary = 12, 
		RULE_constant = 13, RULE_assignment = 14, RULE_function = 15, RULE_anonymous_function = 16, 
		RULE_function_application = 17, RULE_parameters = 18, RULE_arguments = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"list", "statements", "statement", "control_structure", "expression", 
			"and_expression", "equality", "comparison", "term", "factor", "power", 
			"unary", "primary", "constant", "assignment", "function", "anonymous_function", 
			"function_application", "parameters", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'return'", "'if'", "'do'", "'else'", "'end'", 
			"'while'", "'repeat'", "'foreach'", "'in'", "'switch'", "'case'", "'default'", 
			"'or'", "'and'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", 
			"'-'", "'++'", "'*'", "'/'", "'%'", "'^'", "'not'", "'('", "')'", "'='", 
			"'+='", "'-='", "'*='", "'^='", "'%='", "'function'", "'fn'", "'->'"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__39) | (1L << T__40) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK))) != 0)) {
				{
				{
				setState(41);
				constant();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(42);
					match(T__1);
					setState(43);
					constant();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			statement();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__24) | (1L << T__30) | (1L << T__31) | (1L << T__39) | (1L << T__40) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK) | (1L << ID))) != 0)) {
				{
				setState(57);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				function_application();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				control_structure();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				match(T__3);
				setState(65);
				expression();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterControl_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitControl_structure(this);
		}
	}

	public final Control_structureContext control_structure() throws RecognitionException {
		Control_structureContext _localctx = new Control_structureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_control_structure);
		int _la;
		try {
			int _alt;
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__4);
				setState(69);
				expression();
				setState(70);
				match(T__5);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__24) | (1L << T__30) | (1L << T__31) | (1L << T__39) | (1L << T__40) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK) | (1L << ID))) != 0)) {
					{
					setState(71);
					statements();
					}
				}

				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(74);
						match(T__6);
						setState(75);
						match(T__4);
						setState(76);
						expression();
						setState(77);
						match(T__5);
						setState(78);
						statements();
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(85);
					match(T__6);
					setState(86);
					match(T__5);
					setState(87);
					statements();
					}
				}

				setState(90);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__8);
				setState(93);
				expression();
				setState(94);
				match(T__5);
				setState(95);
				statements();
				setState(96);
				match(T__7);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(T__9);
				setState(99);
				expression();
				setState(100);
				match(T__5);
				setState(101);
				statements();
				setState(102);
				match(T__7);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(T__10);
				setState(105);
				match(ID);
				setState(106);
				match(T__11);
				setState(107);
				expression();
				setState(108);
				match(T__5);
				setState(109);
				statements();
				setState(110);
				match(T__7);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(T__12);
				setState(113);
				expression();
				setState(114);
				match(T__5);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(115);
					match(T__13);
					setState(116);
					expression();
					setState(117);
					match(T__5);
					setState(118);
					statements();
					setState(119);
					match(T__7);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(126);
					match(T__14);
					setState(127);
					match(T__5);
					setState(128);
					statements();
					setState(129);
					match(T__7);
					}
				}

				setState(133);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			and_expression();
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					match(T__15);
					setState(139);
					and_expression();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class And_expressionContext extends ParserRuleContext {
		public List<EqualityContext> equality() {
			return getRuleContexts(EqualityContext.class);
		}
		public EqualityContext equality(int i) {
			return getRuleContext(EqualityContext.class,i);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitAnd_expression(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			equality();
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					match(T__16);
					setState(147);
					equality();
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class EqualityContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitEquality(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_equality);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			comparison();
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(155);
					comparison();
					}
					} 
				}
				setState(160);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparison);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			term();
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(163);
					term();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			factor();
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(171);
					factor();
					}
					} 
				}
				setState(176);
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
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			power();
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(179);
					power();
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class PowerContext extends ParserRuleContext {
		public List<UnaryContext> unary() {
			return getRuleContexts(UnaryContext.class);
		}
		public UnaryContext unary(int i) {
			return getRuleContext(UnaryContext.class,i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_power);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(185);
					unary();
					setState(186);
					match(T__29);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(193);
			unary();
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

	public static class UnaryContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==T__30) {
				{
				{
				setState(195);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			primary();
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public Function_applicationContext function_application() {
			return getRuleContext(Function_applicationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primary);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				function_application();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(T__31);
				setState(206);
				expression();
				setState(207);
				match(T__32);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				constant();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constant);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(NUMBER);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(STRING);
				}
				break;
			case BLOCK:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(BLOCK);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(216);
				list();
				}
				break;
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(timcParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(ID);
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
			expression();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(T__39);
				setState(225);
				match(ID);
				setState(226);
				match(T__31);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(227);
					parameters();
					}
				}

				setState(230);
				match(T__32);
				setState(231);
				match(T__5);
				setState(232);
				statements();
				setState(233);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterAnonymous_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitAnonymous_function(this);
		}
	}

	public final Anonymous_functionContext anonymous_function() throws RecognitionException {
		Anonymous_functionContext _localctx = new Anonymous_functionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_anonymous_function);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(T__39);
				setState(239);
				match(T__31);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(240);
					parameters();
					}
				}

				setState(243);
				match(T__32);
				setState(244);
				match(T__5);
				setState(245);
				statements();
				setState(246);
				match(T__7);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__40);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(249);
					match(ID);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(T__41);
				setState(256);
				expression();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterFunction_application(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitFunction_application(this);
		}
	}

	public final Function_applicationContext function_application() throws RecognitionException {
		Function_applicationContext _localctx = new Function_applicationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_application);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(ID);
				setState(260);
				match(T__31);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__24) | (1L << T__30) | (1L << T__31) | (1L << T__39) | (1L << T__40) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK) | (1L << ID))) != 0)) {
					{
					setState(261);
					arguments();
					}
				}

				setState(264);
				match(T__32);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(T__31);
				setState(266);
				anonymous_function();
				setState(267);
				match(T__32);
				setState(268);
				match(T__31);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__24) | (1L << T__30) | (1L << T__31) | (1L << T__39) | (1L << T__40) | (1L << NUMBER) | (1L << BOOL) | (1L << STRING) | (1L << BLOCK) | (1L << ID))) != 0)) {
					{
					setState(269);
					arguments();
					}
				}

				setState(272);
				match(T__32);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(277);
				match(T__1);
				setState(278);
				match(ID);
				}
				}
				setState(283);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof timcListener ) ((timcListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			expression();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(285);
				match(T__1);
				setState(286);
				expression();
				}
				}
				setState(291);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0127\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5S\n\5\f\5\16\5V\13\5\3\5\3\5\3\5\5\5[\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5|\n\5\f\5\16\5\177\13\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u0086\n\5\3\5\3\5\5\5\u008a\n\5\3\6\3\6\3\6\7\6\u008f\n\6\f"+
		"\6\16\6\u0092\13\6\3\7\3\7\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\3\b\3"+
		"\b\3\b\7\b\u009f\n\b\f\b\16\b\u00a2\13\b\3\t\3\t\3\t\7\t\u00a7\n\t\f\t"+
		"\16\t\u00aa\13\t\3\n\3\n\3\n\7\n\u00af\n\n\f\n\16\n\u00b2\13\n\3\13\3"+
		"\13\3\13\7\13\u00b7\n\13\f\13\16\13\u00ba\13\13\3\f\3\f\3\f\7\f\u00bf"+
		"\n\f\f\f\16\f\u00c2\13\f\3\f\3\f\3\r\7\r\u00c7\n\r\f\r\16\r\u00ca\13\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d5\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00dd\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\5\21\u00e7\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ef\n\21\3"+
		"\22\3\22\3\22\5\22\u00f4\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u00fd\n\22\f\22\16\22\u0100\13\22\3\22\3\22\5\22\u0104\n\22\3\23\3\23"+
		"\3\23\5\23\u0109\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0111\n\23\3"+
		"\23\3\23\5\23\u0115\n\23\3\24\3\24\3\24\7\24\u011a\n\24\f\24\16\24\u011d"+
		"\13\24\3\25\3\25\3\25\7\25\u0122\n\25\f\25\16\25\u0125\13\25\3\25\2\2"+
		"\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\b\3\2\24\25\3\2\26"+
		"\31\3\2\32\34\3\2\35\37\4\2\33\33!!\3\2$)\2\u013c\2*\3\2\2\2\4:\3\2\2"+
		"\2\6D\3\2\2\2\b\u0089\3\2\2\2\n\u008b\3\2\2\2\f\u0093\3\2\2\2\16\u009b"+
		"\3\2\2\2\20\u00a3\3\2\2\2\22\u00ab\3\2\2\2\24\u00b3\3\2\2\2\26\u00c0\3"+
		"\2\2\2\30\u00c8\3\2\2\2\32\u00d4\3\2\2\2\34\u00dc\3\2\2\2\36\u00de\3\2"+
		"\2\2 \u00ee\3\2\2\2\"\u0103\3\2\2\2$\u0114\3\2\2\2&\u0116\3\2\2\2(\u011e"+
		"\3\2\2\2*\65\7\3\2\2+\60\5\34\17\2,-\7\4\2\2-/\5\34\17\2.,\3\2\2\2/\62"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\63+\3\2"+
		"\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2"+
		"\289\7\5\2\29\3\3\2\2\2:<\5\6\4\2;=\5\4\3\2<;\3\2\2\2<=\3\2\2\2=\5\3\2"+
		"\2\2>E\5\36\20\2?E\5\n\6\2@E\5$\23\2AE\5\b\5\2BC\7\6\2\2CE\5\n\6\2D>\3"+
		"\2\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2E\7\3\2\2\2FG\7\7\2\2GH"+
		"\5\n\6\2HJ\7\b\2\2IK\5\4\3\2JI\3\2\2\2JK\3\2\2\2KT\3\2\2\2LM\7\t\2\2M"+
		"N\7\7\2\2NO\5\n\6\2OP\7\b\2\2PQ\5\4\3\2QS\3\2\2\2RL\3\2\2\2SV\3\2\2\2"+
		"TR\3\2\2\2TU\3\2\2\2UZ\3\2\2\2VT\3\2\2\2WX\7\t\2\2XY\7\b\2\2Y[\5\4\3\2"+
		"ZW\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\n\2\2]\u008a\3\2\2\2^_\7\13\2\2_"+
		"`\5\n\6\2`a\7\b\2\2ab\5\4\3\2bc\7\n\2\2c\u008a\3\2\2\2de\7\f\2\2ef\5\n"+
		"\6\2fg\7\b\2\2gh\5\4\3\2hi\7\n\2\2i\u008a\3\2\2\2jk\7\r\2\2kl\7\62\2\2"+
		"lm\7\16\2\2mn\5\n\6\2no\7\b\2\2op\5\4\3\2pq\7\n\2\2q\u008a\3\2\2\2rs\7"+
		"\17\2\2st\5\n\6\2t}\7\b\2\2uv\7\20\2\2vw\5\n\6\2wx\7\b\2\2xy\5\4\3\2y"+
		"z\7\n\2\2z|\3\2\2\2{u\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0085"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\21\2\2\u0081\u0082\7\b\2\2\u0082\u0083"+
		"\5\4\3\2\u0083\u0084\7\n\2\2\u0084\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\n\2\2\u0088\u008a\3\2"+
		"\2\2\u0089F\3\2\2\2\u0089^\3\2\2\2\u0089d\3\2\2\2\u0089j\3\2\2\2\u0089"+
		"r\3\2\2\2\u008a\t\3\2\2\2\u008b\u0090\5\f\7\2\u008c\u008d\7\22\2\2\u008d"+
		"\u008f\5\f\7\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\13\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0098"+
		"\5\16\b\2\u0094\u0095\7\23\2\2\u0095\u0097\5\16\b\2\u0096\u0094\3\2\2"+
		"\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\r"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u00a0\5\20\t\2\u009c\u009d\t\2\2\2"+
		"\u009d\u009f\5\20\t\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\17\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a8\5\22\n\2\u00a4\u00a5\t\3\2\2\u00a5\u00a7\5\22\n\2\u00a6\u00a4\3"+
		"\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\21\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00b0\5\24\13\2\u00ac\u00ad\t\4"+
		"\2\2\u00ad\u00af\5\24\13\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\23\3\2\2\2\u00b2\u00b0\3\2\2"+
		"\2\u00b3\u00b8\5\26\f\2\u00b4\u00b5\t\5\2\2\u00b5\u00b7\5\26\f\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\25\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\5\30\r\2\u00bc\u00bd"+
		"\7 \2\2\u00bd\u00bf\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c4\5\30\r\2\u00c4\27\3\2\2\2\u00c5\u00c7\t\6\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\32\16\2\u00cc\31\3\2"+
		"\2\2\u00cd\u00d5\7\62\2\2\u00ce\u00d5\5$\23\2\u00cf\u00d0\7\"\2\2\u00d0"+
		"\u00d1\5\n\6\2\u00d1\u00d2\7#\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\5\34"+
		"\17\2\u00d4\u00cd\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00dd\7.\2\2\u00d7\u00dd\7/\2\2"+
		"\u00d8\u00dd\7\60\2\2\u00d9\u00dd\7\61\2\2\u00da\u00dd\5\2\2\2\u00db\u00dd"+
		"\5\"\22\2\u00dc\u00d6\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2"+
		"\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\35"+
		"\3\2\2\2\u00de\u00df\7\62\2\2\u00df\u00e0\t\7\2\2\u00e0\u00e1\5\n\6\2"+
		"\u00e1\37\3\2\2\2\u00e2\u00e3\7*\2\2\u00e3\u00e4\7\62\2\2\u00e4\u00e6"+
		"\7\"\2\2\u00e5\u00e7\5&\24\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\7\b\2\2\u00ea\u00eb\5\4"+
		"\3\2\u00eb\u00ec\7\n\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00ef\5\"\22\2\u00ee"+
		"\u00e2\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef!\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1"+
		"\u00f3\7\"\2\2\u00f2\u00f4\5&\24\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7\7\b\2\2\u00f7"+
		"\u00f8\5\4\3\2\u00f8\u00f9\7\n\2\2\u00f9\u0104\3\2\2\2\u00fa\u00fe\7+"+
		"\2\2\u00fb\u00fd\7\62\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0102\7,\2\2\u0102\u0104\5\n\6\2\u0103\u00f0\3\2\2\2\u0103"+
		"\u00fa\3\2\2\2\u0104#\3\2\2\2\u0105\u0106\7\62\2\2\u0106\u0108\7\"\2\2"+
		"\u0107\u0109\5(\25\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u0115\7#\2\2\u010b\u010c\7\"\2\2\u010c\u010d\5\"\22\2\u010d"+
		"\u010e\7#\2\2\u010e\u0110\7\"\2\2\u010f\u0111\5(\25\2\u0110\u010f\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7#\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0105\3\2\2\2\u0114\u010b\3\2\2\2\u0115%\3\2\2\2"+
		"\u0116\u011b\7\62\2\2\u0117\u0118\7\4\2\2\u0118\u011a\7\62\2\2\u0119\u0117"+
		"\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\'\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0123\5\n\6\2\u011f\u0120\7\4\2\2"+
		"\u0120\u0122\5\n\6\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124)\3\2\2\2\u0125\u0123\3\2\2\2 \60\65"+
		"<DJTZ}\u0085\u0089\u0090\u0098\u00a0\u00a8\u00b0\u00b8\u00c0\u00c8\u00d4"+
		"\u00dc\u00e6\u00ee\u00f3\u00fe\u0103\u0108\u0110\u0114\u011b\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}