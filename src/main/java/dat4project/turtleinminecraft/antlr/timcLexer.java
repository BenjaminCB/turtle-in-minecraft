package dat4project.turtleinminecraft.antlr;

// Generated from timc.g4 by ANTLR 4.9.2
 
	import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class timcLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "NUMBER", "BOOL", 
			"STRING", "NOTHING", "BLOCK", "RELDIR", "ABSDIR", "NOT", "SUB", "POWER", 
			"MULT", "DIV", "MOD", "ADD", "CONCAT", "LT", "LTEQ", "GT", "GTEQ", "EQ", 
			"NEQ", "AND", "OR", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULTASSIGN", 
			"DIVASSIGN", "MODASSIGN", "POWERASSIGN", "ID", "WS", "COMMENT", "INVALID"
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

	 
		public List<String> errors = new ArrayList<String>();


	public timcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "timc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 64:
			INVALID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void INVALID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			errors.add("Invalid character: '" + getText() + "' on line: " + 
						getLine() + ", index: " + getCharPositionInLine());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u01e5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		" \3!\6!\u0128\n!\r!\16!\u0129\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u0135\n\"\3#\3#\3#\3#\7#\u013b\n#\f#\16#\u013e\13#\3#\3#\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\6%\u0150\n%\r%\16%\u0151\3%\7%\u0155\n"+
		"%\f%\16%\u0158\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u0172\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0186\n\'\3(\3(\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3"+
		">\3>\3?\3?\7?\u01c8\n?\f?\16?\u01cb\13?\3@\7@\u01ce\n@\f@\16@\u01d1\13"+
		"@\3@\3@\3A\3A\3A\3A\7A\u01d9\nA\fA\16A\u01dc\13A\3A\3A\3A\3A\3A\3B\3B"+
		"\3B\3\u01da\2C\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\3\2\t\3\2\62;\5\2$$^"+
		"^pp\6\2\f\f\17\17$$^^\4\2C\\aa\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2\u01f5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\3\u0085\3\2\2\2\5\u0087\3\2\2\2\7\u0089\3\2\2\2\t\u008b\3\2\2"+
		"\2\13\u0092\3\2\2\2\r\u0098\3\2\2\2\17\u009b\3\2\2\2\21\u009e\3\2\2\2"+
		"\23\u00a3\3\2\2\2\25\u00a7\3\2\2\2\27\u00ad\3\2\2\2\31\u00b4\3\2\2\2\33"+
		"\u00bc\3\2\2\2\35\u00bf\3\2\2\2\37\u00c6\3\2\2\2!\u00cb\3\2\2\2#\u00d3"+
		"\3\2\2\2%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00e0\3\2\2\2+\u00e3\3\2\2\2"+
		"-\u00e6\3\2\2\2/\u00ee\3\2\2\2\61\u00f7\3\2\2\2\63\u00fa\3\2\2\2\65\u00ff"+
		"\3\2\2\2\67\u0104\3\2\2\29\u0109\3\2\2\2;\u010f\3\2\2\2=\u0116\3\2\2\2"+
		"?\u011f\3\2\2\2A\u0127\3\2\2\2C\u0134\3\2\2\2E\u0136\3\2\2\2G\u0141\3"+
		"\2\2\2I\u014f\3\2\2\2K\u0171\3\2\2\2M\u0185\3\2\2\2O\u0187\3\2\2\2Q\u018b"+
		"\3\2\2\2S\u018d\3\2\2\2U\u018f\3\2\2\2W\u0191\3\2\2\2Y\u0193\3\2\2\2["+
		"\u0195\3\2\2\2]\u0197\3\2\2\2_\u019a\3\2\2\2a\u019c\3\2\2\2c\u019f\3\2"+
		"\2\2e\u01a1\3\2\2\2g\u01a4\3\2\2\2i\u01a7\3\2\2\2k\u01aa\3\2\2\2m\u01ae"+
		"\3\2\2\2o\u01b1\3\2\2\2q\u01b3\3\2\2\2s\u01b6\3\2\2\2u\u01b9\3\2\2\2w"+
		"\u01bc\3\2\2\2y\u01bf\3\2\2\2{\u01c2\3\2\2\2}\u01c5\3\2\2\2\177\u01cf"+
		"\3\2\2\2\u0081\u01d4\3\2\2\2\u0083\u01e2\3\2\2\2\u0085\u0086\7]\2\2\u0086"+
		"\4\3\2\2\2\u0087\u0088\7.\2\2\u0088\6\3\2\2\2\u0089\u008a\7_\2\2\u008a"+
		"\b\3\2\2\2\u008b\u008c\7t\2\2\u008c\u008d\7g\2\2\u008d\u008e\7v\2\2\u008e"+
		"\u008f\7w\2\2\u008f\u0090\7t\2\2\u0090\u0091\7p\2\2\u0091\n\3\2\2\2\u0092"+
		"\u0093\7d\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095\u0096\7c\2\2"+
		"\u0096\u0097\7m\2\2\u0097\f\3\2\2\2\u0098\u0099\7k\2\2\u0099\u009a\7h"+
		"\2\2\u009a\16\3\2\2\2\u009b\u009c\7f\2\2\u009c\u009d\7q\2\2\u009d\20\3"+
		"\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5"+
		"\u00a6\7f\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7j\2\2\u00a9"+
		"\u00aa\7k\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7g\2\2\u00ac\26\3\2\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1\7g\2\2"+
		"\u00b1\u00b2\7c\2\2\u00b2\u00b3\7v\2\2\u00b3\30\3\2\2\2\u00b4\u00b5\7"+
		"h\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7c\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7j\2\2\u00bb\32\3\2\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7p\2\2\u00be\34\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1"+
		"\7y\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7e\2\2\u00c4"+
		"\u00c5\7j\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7c\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca \3\2\2\2\u00cb\u00cc\7f\2\2\u00cc"+
		"\u00cd\7g\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7w\2\2"+
		"\u00d0\u00d1\7n\2\2\u00d1\u00d2\7v\2\2\u00d2\"\3\2\2\2\u00d3\u00d4\7*"+
		"\2\2\u00d4$\3\2\2\2\u00d5\u00d6\7+\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7h\2"+
		"\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7e\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7p\2\2\u00df"+
		"(\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7p\2\2\u00e2*\3\2\2\2\u00e3\u00e4"+
		"\7/\2\2\u00e4\u00e5\7@\2\2\u00e5,\3\2\2\2\u00e6\u00e7\7h\2\2\u00e7\u00e8"+
		"\7q\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7y\2\2\u00ea\u00eb\7c\2\2\u00eb"+
		"\u00ec\7t\2\2\u00ec\u00ed\7f\2\2\u00ed.\3\2\2\2\u00ee\u00ef\7d\2\2\u00ef"+
		"\u00f0\7c\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7m\2\2\u00f2\u00f3\7y\2\2"+
		"\u00f3\u00f4\7c\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7f\2\2\u00f6\60\3\2"+
		"\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7r\2\2\u00f9\62\3\2\2\2\u00fa\u00fb"+
		"\7f\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7y\2\2\u00fd\u00fe\7p\2\2\u00fe"+
		"\64\3\2\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7q\2\2\u0101\u0102\7q\2\2\u0102"+
		"\u0103\7m\2\2\u0103\66\3\2\2\2\u0104\u0105\7v\2\2\u0105\u0106\7w\2\2\u0106"+
		"\u0107\7t\2\2\u0107\u0108\7p\2\2\u01088\3\2\2\2\u0109\u010a\7r\2\2\u010a"+
		"\u010b\7t\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2\2\u010d\u010e\7v\2\2"+
		"\u010e:\3\2\2\2\u010f\u0110\7h\2\2\u0110\u0111\7c\2\2\u0111\u0112\7e\2"+
		"\2\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114\u0115\7i\2\2\u0115<\3\2"+
		"\2\2\u0116\u0117\7r\2\2\u0117\u0118\7q\2\2\u0118\u0119\7u\2\2\u0119\u011a"+
		"\7k\2\2\u011a\u011b\7v\2\2\u011b\u011c\7k\2\2\u011c\u011d\7q\2\2\u011d"+
		"\u011e\7p\2\2\u011e>\3\2\2\2\u011f\u0120\7n\2\2\u0120\u0121\7g\2\2\u0121"+
		"\u0122\7p\2\2\u0122\u0123\7i\2\2\u0123\u0124\7v\2\2\u0124\u0125\7j\2\2"+
		"\u0125@\3\2\2\2\u0126\u0128\t\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3"+
		"\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aB\3\2\2\2\u012b\u012c"+
		"\7v\2\2\u012c\u012d\7t\2\2\u012d\u012e\7w\2\2\u012e\u0135\7g\2\2\u012f"+
		"\u0130\7h\2\2\u0130\u0131\7c\2\2\u0131\u0132\7n\2\2\u0132\u0133\7u\2\2"+
		"\u0133\u0135\7g\2\2\u0134\u012b\3\2\2\2\u0134\u012f\3\2\2\2\u0135D\3\2"+
		"\2\2\u0136\u013c\7$\2\2\u0137\u0138\7^\2\2\u0138\u013b\t\3\2\2\u0139\u013b"+
		"\n\4\2\2\u013a\u0137\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013f\u0140\7$\2\2\u0140F\3\2\2\2\u0141\u0142\7p\2\2\u0142\u0143"+
		"\7q\2\2\u0143\u0144\7v\2\2\u0144\u0145\7j\2\2\u0145\u0146\7k\2\2\u0146"+
		"\u0147\7p\2\2\u0147\u0148\7i\2\2\u0148H\3\2\2\2\u0149\u014a\7D\2\2\u014a"+
		"\u014b\7N\2\2\u014b\u014c\7Q\2\2\u014c\u014d\7E\2\2\u014d\u014e\7M\2\2"+
		"\u014e\u0150\7<\2\2\u014f\u0149\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0156\3\2\2\2\u0153\u0155\t\5\2\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157J\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7W\2\2\u015a\u0172"+
		"\7R\2\2\u015b\u015c\7F\2\2\u015c\u015d\7Q\2\2\u015d\u015e\7Y\2\2\u015e"+
		"\u0172\7P\2\2\u015f\u0160\7H\2\2\u0160\u0161\7T\2\2\u0161\u0162\7Q\2\2"+
		"\u0162\u0163\7P\2\2\u0163\u0172\7V\2\2\u0164\u0165\7D\2\2\u0165\u0166"+
		"\7C\2\2\u0166\u0167\7E\2\2\u0167\u0172\7M\2\2\u0168\u0169\7N\2\2\u0169"+
		"\u016a\7G\2\2\u016a\u016b\7H\2\2\u016b\u0172\7V\2\2\u016c\u016d\7T\2\2"+
		"\u016d\u016e\7K\2\2\u016e\u016f\7I\2\2\u016f\u0170\7J\2\2\u0170\u0172"+
		"\7V\2\2\u0171\u0159\3\2\2\2\u0171\u015b\3\2\2\2\u0171\u015f\3\2\2\2\u0171"+
		"\u0164\3\2\2\2\u0171\u0168\3\2\2\2\u0171\u016c\3\2\2\2\u0172L\3\2\2\2"+
		"\u0173\u0174\7P\2\2\u0174\u0175\7Q\2\2\u0175\u0176\7T\2\2\u0176\u0177"+
		"\7V\2\2\u0177\u0186\7J\2\2\u0178\u0179\7U\2\2\u0179\u017a\7Q\2\2\u017a"+
		"\u017b\7W\2\2\u017b\u017c\7V\2\2\u017c\u0186\7J\2\2\u017d\u017e\7G\2\2"+
		"\u017e\u017f\7C\2\2\u017f\u0180\7U\2\2\u0180\u0186\7V\2\2\u0181\u0182"+
		"\7Y\2\2\u0182\u0183\7G\2\2\u0183\u0184\7U\2\2\u0184\u0186\7V\2\2\u0185"+
		"\u0173\3\2\2\2\u0185\u0178\3\2\2\2\u0185\u017d\3\2\2\2\u0185\u0181\3\2"+
		"\2\2\u0186N\3\2\2\2\u0187\u0188\7p\2\2\u0188\u0189\7q\2\2\u0189\u018a"+
		"\7v\2\2\u018aP\3\2\2\2\u018b\u018c\7/\2\2\u018cR\3\2\2\2\u018d\u018e\7"+
		"`\2\2\u018eT\3\2\2\2\u018f\u0190\7,\2\2\u0190V\3\2\2\2\u0191\u0192\7\61"+
		"\2\2\u0192X\3\2\2\2\u0193\u0194\7\'\2\2\u0194Z\3\2\2\2\u0195\u0196\7-"+
		"\2\2\u0196\\\3\2\2\2\u0197\u0198\7-\2\2\u0198\u0199\7-\2\2\u0199^\3\2"+
		"\2\2\u019a\u019b\7>\2\2\u019b`\3\2\2\2\u019c\u019d\7>\2\2\u019d\u019e"+
		"\7?\2\2\u019eb\3\2\2\2\u019f\u01a0\7@\2\2\u01a0d\3\2\2\2\u01a1\u01a2\7"+
		"@\2\2\u01a2\u01a3\7?\2\2\u01a3f\3\2\2\2\u01a4\u01a5\7?\2\2\u01a5\u01a6"+
		"\7?\2\2\u01a6h\3\2\2\2\u01a7\u01a8\7#\2\2\u01a8\u01a9\7?\2\2\u01a9j\3"+
		"\2\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac\7p\2\2\u01ac\u01ad\7f\2\2\u01ad"+
		"l\3\2\2\2\u01ae\u01af\7q\2\2\u01af\u01b0\7t\2\2\u01b0n\3\2\2\2\u01b1\u01b2"+
		"\7?\2\2\u01b2p\3\2\2\2\u01b3\u01b4\7-\2\2\u01b4\u01b5\7?\2\2\u01b5r\3"+
		"\2\2\2\u01b6\u01b7\7/\2\2\u01b7\u01b8\7?\2\2\u01b8t\3\2\2\2\u01b9\u01ba"+
		"\7,\2\2\u01ba\u01bb\7?\2\2\u01bbv\3\2\2\2\u01bc\u01bd\7\61\2\2\u01bd\u01be"+
		"\7?\2\2\u01bex\3\2\2\2\u01bf\u01c0\7\'\2\2\u01c0\u01c1\7?\2\2\u01c1z\3"+
		"\2\2\2\u01c2\u01c3\7`\2\2\u01c3\u01c4\7?\2\2\u01c4|\3\2\2\2\u01c5\u01c9"+
		"\t\6\2\2\u01c6\u01c8\t\7\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca~\3\2\2\2\u01cb\u01c9\3\2\2\2"+
		"\u01cc\u01ce\t\b\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2"+
		"\u01d3\b@\2\2\u01d3\u0080\3\2\2\2\u01d4\u01d5\7\61\2\2\u01d5\u01d6\7,"+
		"\2\2\u01d6\u01da\3\2\2\2\u01d7\u01d9\13\2\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01dc\3\2\2\2\u01da\u01db\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dd\3\2"+
		"\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\7,\2\2\u01de\u01df\7\61\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\bA\2\2\u01e1\u0082\3\2\2\2\u01e2\u01e3\13\2"+
		"\2\2\u01e3\u01e4\bB\3\2\u01e4\u0084\3\2\2\2\16\2\u0129\u0134\u013a\u013c"+
		"\u0151\u0156\u0171\u0185\u01c9\u01cf\u01da\4\b\2\2\3B\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}