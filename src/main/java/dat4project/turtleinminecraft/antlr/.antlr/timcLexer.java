// Generated from /Users/tor/Git/comsci/turtle-in-minecraft/src/main/java/dat4project/turtleinminecraft/antlr/timc.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		WS=32, COMMENT=33, NUMBER=34, BOOL=35, STRING=36, NOTHING=37, BLOCK=38, 
		RELDIR=39, ABSDIR=40, NOT=41, SUB=42, POWER=43, MULT=44, DIV=45, MOD=46, 
		ADD=47, CONCAT=48, LT=49, LTEQ=50, GT=51, GTEQ=52, EQ=53, NEQ=54, AND=55, 
		OR=56, ASSIGN=57, ADDASSIGN=58, SUBASSIGN=59, MULTASSIGN=60, DIVASSIGN=61, 
		MODASSIGN=62, POWERASSIGN=63, ID=64;
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
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "WS", "COMMENT", 
			"NUMBER", "BOOL", "STRING", "NOTHING", "BLOCK", "RELDIR", "ABSDIR", "NOT", 
			"SUB", "POWER", "MULT", "DIV", "MOD", "ADD", "CONCAT", "LT", "LTEQ", 
			"GT", "GTEQ", "EQ", "NEQ", "AND", "OR", "ASSIGN", "ADDASSIGN", "SUBASSIGN", 
			"MULTASSIGN", "DIVASSIGN", "MODASSIGN", "POWERASSIGN", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'return'", "'break'", "'if'", "'do'", "'else'", 
			"'end'", "'while'", "'repeat'", "'foreach'", "'in'", "'switch'", "'case'", 
			"'default'", "'('", "')'", "'function'", "'fn'", "'->'", "'forward'", 
			"'backward'", "'up'", "'down'", "'look'", "'turn'", "'print'", "'facing'", 
			"'position'", "'length'", null, null, null, null, null, "'nothing'", 
			null, null, null, "'not'", "'-'", "'^'", "'*'", "'/'", "'%'", "'+'", 
			"'++'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "COMMENT", "NUMBER", 
			"BOOL", "STRING", "NOTHING", "BLOCK", "RELDIR", "ABSDIR", "NOT", "SUB", 
			"POWER", "MULT", "DIV", "MOD", "ADD", "CONCAT", "LT", "LTEQ", "GT", "GTEQ", 
			"EQ", "NEQ", "AND", "OR", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULTASSIGN", 
			"DIVASSIGN", "MODASSIGN", "POWERASSIGN", "ID"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u01e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!"+
		"\7!\u0126\n!\f!\16!\u0129\13!\3!\3!\3\"\3\"\3\"\3\"\7\"\u0131\n\"\f\""+
		"\16\"\u0134\13\"\3\"\3\"\3\"\3\"\3\"\3#\6#\u013c\n#\r#\16#\u013d\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u0149\n$\3%\3%\3%\3%\7%\u014f\n%\f%\16%\u0152"+
		"\13%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\6\'\u0164\n"+
		"\'\r\'\16\'\u0165\3\'\7\'\u0169\n\'\f\'\16\'\u016c\13\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0186\n"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u019a\n)\3"+
		"*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\38\39\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3"+
		"?\3?\3?\3@\3@\3@\3A\3A\7A\u01dc\nA\fA\16A\u01df\13A\3\u0132\2B\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\3\2\t\5\2\13\f\17\17\"\"\3\2\62;\5\2$$^^pp\6\2\f\f"+
		"\17\17$$^^\4\2C\\aa\5\2C\\aac|\6\2\62;C\\aac|\2\u01f0\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0085\3\2\2\2\7\u0087"+
		"\3\2\2\2\t\u0089\3\2\2\2\13\u0090\3\2\2\2\r\u0096\3\2\2\2\17\u0099\3\2"+
		"\2\2\21\u009c\3\2\2\2\23\u00a1\3\2\2\2\25\u00a5\3\2\2\2\27\u00ab\3\2\2"+
		"\2\31\u00b2\3\2\2\2\33\u00ba\3\2\2\2\35\u00bd\3\2\2\2\37\u00c4\3\2\2\2"+
		"!\u00c9\3\2\2\2#\u00d1\3\2\2\2%\u00d3\3\2\2\2\'\u00d5\3\2\2\2)\u00de\3"+
		"\2\2\2+\u00e1\3\2\2\2-\u00e4\3\2\2\2/\u00ec\3\2\2\2\61\u00f5\3\2\2\2\63"+
		"\u00f8\3\2\2\2\65\u00fd\3\2\2\2\67\u0102\3\2\2\29\u0107\3\2\2\2;\u010d"+
		"\3\2\2\2=\u0114\3\2\2\2?\u011d\3\2\2\2A\u0127\3\2\2\2C\u012c\3\2\2\2E"+
		"\u013b\3\2\2\2G\u0148\3\2\2\2I\u014a\3\2\2\2K\u0155\3\2\2\2M\u0163\3\2"+
		"\2\2O\u0185\3\2\2\2Q\u0199\3\2\2\2S\u019b\3\2\2\2U\u019f\3\2\2\2W\u01a1"+
		"\3\2\2\2Y\u01a3\3\2\2\2[\u01a5\3\2\2\2]\u01a7\3\2\2\2_\u01a9\3\2\2\2a"+
		"\u01ab\3\2\2\2c\u01ae\3\2\2\2e\u01b0\3\2\2\2g\u01b3\3\2\2\2i\u01b5\3\2"+
		"\2\2k\u01b8\3\2\2\2m\u01bb\3\2\2\2o\u01be\3\2\2\2q\u01c2\3\2\2\2s\u01c5"+
		"\3\2\2\2u\u01c7\3\2\2\2w\u01ca\3\2\2\2y\u01cd\3\2\2\2{\u01d0\3\2\2\2}"+
		"\u01d3\3\2\2\2\177\u01d6\3\2\2\2\u0081\u01d9\3\2\2\2\u0083\u0084\7]\2"+
		"\2\u0084\4\3\2\2\2\u0085\u0086\7.\2\2\u0086\6\3\2\2\2\u0087\u0088\7_\2"+
		"\2\u0088\b\3\2\2\2\u0089\u008a\7t\2\2\u008a\u008b\7g\2\2\u008b\u008c\7"+
		"v\2\2\u008c\u008d\7w\2\2\u008d\u008e\7t\2\2\u008e\u008f\7p\2\2\u008f\n"+
		"\3\2\2\2\u0090\u0091\7d\2\2\u0091\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7m\2\2\u0095\f\3\2\2\2\u0096\u0097\7k\2\2\u0097"+
		"\u0098\7h\2\2\u0098\16\3\2\2\2\u0099\u009a\7f\2\2\u009a\u009b\7q\2\2\u009b"+
		"\20\3\2\2\2\u009c\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\22\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\u00a4\7f\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7y\2\2\u00a6\u00a7\7j\2\2\u00a7"+
		"\u00a8\7k\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa\26\3\2\2\2\u00ab"+
		"\u00ac\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1\30\3\2\2\2\u00b2\u00b3\7"+
		"h\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7c\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7j\2\2\u00b9\32\3\2\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\34\3\2\2\2\u00bd\u00be\7u\2\2\u00be\u00bf"+
		"\7y\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7e\2\2\u00c2"+
		"\u00c3\7j\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7c\2\2\u00c6"+
		"\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7f\2\2\u00ca"+
		"\u00cb\7g\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7w\2\2"+
		"\u00ce\u00cf\7n\2\2\u00cf\u00d0\7v\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7*"+
		"\2\2\u00d2$\3\2\2\2\u00d3\u00d4\7+\2\2\u00d4&\3\2\2\2\u00d5\u00d6\7h\2"+
		"\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da"+
		"\7v\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7p\2\2\u00dd"+
		"(\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7p\2\2\u00e0*\3\2\2\2\u00e1\u00e2"+
		"\7/\2\2\u00e2\u00e3\7@\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6"+
		"\7q\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7y\2\2\u00e8\u00e9\7c\2\2\u00e9"+
		"\u00ea\7t\2\2\u00ea\u00eb\7f\2\2\u00eb.\3\2\2\2\u00ec\u00ed\7d\2\2\u00ed"+
		"\u00ee\7c\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7m\2\2\u00f0\u00f1\7y\2\2"+
		"\u00f1\u00f2\7c\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7f\2\2\u00f4\60\3\2"+
		"\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7r\2\2\u00f7\62\3\2\2\2\u00f8\u00f9"+
		"\7f\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7y\2\2\u00fb\u00fc\7p\2\2\u00fc"+
		"\64\3\2\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7q\2\2\u0100"+
		"\u0101\7m\2\2\u0101\66\3\2\2\2\u0102\u0103\7v\2\2\u0103\u0104\7w\2\2\u0104"+
		"\u0105\7t\2\2\u0105\u0106\7p\2\2\u01068\3\2\2\2\u0107\u0108\7r\2\2\u0108"+
		"\u0109\7t\2\2\u0109\u010a\7k\2\2\u010a\u010b\7p\2\2\u010b\u010c\7v\2\2"+
		"\u010c:\3\2\2\2\u010d\u010e\7h\2\2\u010e\u010f\7c\2\2\u010f\u0110\7e\2"+
		"\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7i\2\2\u0113<\3\2"+
		"\2\2\u0114\u0115\7r\2\2\u0115\u0116\7q\2\2\u0116\u0117\7u\2\2\u0117\u0118"+
		"\7k\2\2\u0118\u0119\7v\2\2\u0119\u011a\7k\2\2\u011a\u011b\7q\2\2\u011b"+
		"\u011c\7p\2\2\u011c>\3\2\2\2\u011d\u011e\7n\2\2\u011e\u011f\7g\2\2\u011f"+
		"\u0120\7p\2\2\u0120\u0121\7i\2\2\u0121\u0122\7v\2\2\u0122\u0123\7j\2\2"+
		"\u0123@\3\2\2\2\u0124\u0126\t\2\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3"+
		"\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012b\b!\2\2\u012bB\3\2\2\2\u012c\u012d\7\61\2\2"+
		"\u012d\u012e\7,\2\2\u012e\u0132\3\2\2\2\u012f\u0131\13\2\2\2\u0130\u012f"+
		"\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7,\2\2\u0136\u0137\7\61"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b\"\2\2\u0139D\3\2\2\2\u013a\u013c"+
		"\t\3\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013eF\3\2\2\2\u013f\u0140\7v\2\2\u0140\u0141\7t\2\2\u0141"+
		"\u0142\7w\2\2\u0142\u0149\7g\2\2\u0143\u0144\7h\2\2\u0144\u0145\7c\2\2"+
		"\u0145\u0146\7n\2\2\u0146\u0147\7u\2\2\u0147\u0149\7g\2\2\u0148\u013f"+
		"\3\2\2\2\u0148\u0143\3\2\2\2\u0149H\3\2\2\2\u014a\u0150\7$\2\2\u014b\u014c"+
		"\7^\2\2\u014c\u014f\t\4\2\2\u014d\u014f\n\5\2\2\u014e\u014b\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7$\2\2\u0154"+
		"J\3\2\2\2\u0155\u0156\7p\2\2\u0156\u0157\7q\2\2\u0157\u0158\7v\2\2\u0158"+
		"\u0159\7j\2\2\u0159\u015a\7k\2\2\u015a\u015b\7p\2\2\u015b\u015c\7i\2\2"+
		"\u015cL\3\2\2\2\u015d\u015e\7D\2\2\u015e\u015f\7N\2\2\u015f\u0160\7Q\2"+
		"\2\u0160\u0161\7E\2\2\u0161\u0162\7M\2\2\u0162\u0164\7<\2\2\u0163\u015d"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u016a\3\2\2\2\u0167\u0169\t\6\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016bN\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016d\u016e\7W\2\2\u016e\u0186\7R\2\2\u016f\u0170\7F\2\2\u0170"+
		"\u0171\7Q\2\2\u0171\u0172\7Y\2\2\u0172\u0186\7P\2\2\u0173\u0174\7H\2\2"+
		"\u0174\u0175\7T\2\2\u0175\u0176\7Q\2\2\u0176\u0177\7P\2\2\u0177\u0186"+
		"\7V\2\2\u0178\u0179\7D\2\2\u0179\u017a\7C\2\2\u017a\u017b\7E\2\2\u017b"+
		"\u0186\7M\2\2\u017c\u017d\7N\2\2\u017d\u017e\7G\2\2\u017e\u017f\7H\2\2"+
		"\u017f\u0186\7V\2\2\u0180\u0181\7T\2\2\u0181\u0182\7K\2\2\u0182\u0183"+
		"\7I\2\2\u0183\u0184\7J\2\2\u0184\u0186\7V\2\2\u0185\u016d\3\2\2\2\u0185"+
		"\u016f\3\2\2\2\u0185\u0173\3\2\2\2\u0185\u0178\3\2\2\2\u0185\u017c\3\2"+
		"\2\2\u0185\u0180\3\2\2\2\u0186P\3\2\2\2\u0187\u0188\7P\2\2\u0188\u0189"+
		"\7Q\2\2\u0189\u018a\7T\2\2\u018a\u018b\7V\2\2\u018b\u019a\7J\2\2\u018c"+
		"\u018d\7U\2\2\u018d\u018e\7Q\2\2\u018e\u018f\7W\2\2\u018f\u0190\7V\2\2"+
		"\u0190\u019a\7J\2\2\u0191\u0192\7G\2\2\u0192\u0193\7C\2\2\u0193\u0194"+
		"\7U\2\2\u0194\u019a\7V\2\2\u0195\u0196\7Y\2\2\u0196\u0197\7G\2\2\u0197"+
		"\u0198\7U\2\2\u0198\u019a\7V\2\2\u0199\u0187\3\2\2\2\u0199\u018c\3\2\2"+
		"\2\u0199\u0191\3\2\2\2\u0199\u0195\3\2\2\2\u019aR\3\2\2\2\u019b\u019c"+
		"\7p\2\2\u019c\u019d\7q\2\2\u019d\u019e\7v\2\2\u019eT\3\2\2\2\u019f\u01a0"+
		"\7/\2\2\u01a0V\3\2\2\2\u01a1\u01a2\7`\2\2\u01a2X\3\2\2\2\u01a3\u01a4\7"+
		",\2\2\u01a4Z\3\2\2\2\u01a5\u01a6\7\61\2\2\u01a6\\\3\2\2\2\u01a7\u01a8"+
		"\7\'\2\2\u01a8^\3\2\2\2\u01a9\u01aa\7-\2\2\u01aa`\3\2\2\2\u01ab\u01ac"+
		"\7-\2\2\u01ac\u01ad\7-\2\2\u01adb\3\2\2\2\u01ae\u01af\7>\2\2\u01afd\3"+
		"\2\2\2\u01b0\u01b1\7>\2\2\u01b1\u01b2\7?\2\2\u01b2f\3\2\2\2\u01b3\u01b4"+
		"\7@\2\2\u01b4h\3\2\2\2\u01b5\u01b6\7@\2\2\u01b6\u01b7\7?\2\2\u01b7j\3"+
		"\2\2\2\u01b8\u01b9\7?\2\2\u01b9\u01ba\7?\2\2\u01bal\3\2\2\2\u01bb\u01bc"+
		"\7#\2\2\u01bc\u01bd\7?\2\2\u01bdn\3\2\2\2\u01be\u01bf\7c\2\2\u01bf\u01c0"+
		"\7p\2\2\u01c0\u01c1\7f\2\2\u01c1p\3\2\2\2\u01c2\u01c3\7q\2\2\u01c3\u01c4"+
		"\7t\2\2\u01c4r\3\2\2\2\u01c5\u01c6\7?\2\2\u01c6t\3\2\2\2\u01c7\u01c8\7"+
		"-\2\2\u01c8\u01c9\7?\2\2\u01c9v\3\2\2\2\u01ca\u01cb\7/\2\2\u01cb\u01cc"+
		"\7?\2\2\u01ccx\3\2\2\2\u01cd\u01ce\7,\2\2\u01ce\u01cf\7?\2\2\u01cfz\3"+
		"\2\2\2\u01d0\u01d1\7\61\2\2\u01d1\u01d2\7?\2\2\u01d2|\3\2\2\2\u01d3\u01d4"+
		"\7\'\2\2\u01d4\u01d5\7?\2\2\u01d5~\3\2\2\2\u01d6\u01d7\7`\2\2\u01d7\u01d8"+
		"\7?\2\2\u01d8\u0080\3\2\2\2\u01d9\u01dd\t\7\2\2\u01da\u01dc\t\b\2\2\u01db"+
		"\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2"+
		"\2\2\u01de\u0082\3\2\2\2\u01df\u01dd\3\2\2\2\16\2\u0127\u0132\u013d\u0148"+
		"\u014e\u0150\u0165\u016a\u0185\u0199\u01dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}