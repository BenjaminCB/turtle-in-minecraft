// Generated from timc.g4 by ANTLR 4.9.2
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
		T__24=25, T__25=26, WS=27, LINE_COMMENT=28, COMMENT=29, NUMBER=30, BOOL=31, 
		STRING=32, ID=33, BLOCK=34, RELDIR=35, ABSDIR=36, NOT=37, SUB=38, POWER=39, 
		MULT=40, DIV=41, MOD=42, ADD=43, CONCAT=44, LT=45, LTEQ=46, GT=47, GTEQ=48, 
		EQ=49, NEQ=50, AND=51, OR=52;
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
			"T__25", "WS", "LINE_COMMENT", "COMMENT", "NUMBER", "BOOL", "STRING", 
			"ID", "BLOCK", "RELDIR", "ABSDIR", "NOT", "SUB", "POWER", "MULT", "DIV", 
			"MOD", "ADD", "CONCAT", "LT", "LTEQ", "GT", "GTEQ", "EQ", "NEQ", "AND", 
			"OR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "','", "']'", "'return'", "'if'", "'do'", "'else'", "'end'", 
			"'while'", "'repeat'", "'foreach'", "'in'", "'switch'", "'case'", "'default'", 
			"'='", "'+='", "'-='", "'*='", "'^='", "'%='", "'('", "')'", "'function'", 
			"'fn'", "'->'", null, null, null, null, null, null, null, null, null, 
			null, "'not'", "'-'", "'^'", "'*'", "'/'", "'%'", "'+'", "'++'", "'<'", 
			"'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "WS", "LINE_COMMENT", "COMMENT", "NUMBER", "BOOL", 
			"STRING", "ID", "BLOCK", "RELDIR", "ABSDIR", "NOT", "SUB", "POWER", "MULT", 
			"DIV", "MOD", "ADD", "CONCAT", "LT", "LTEQ", "GT", "GTEQ", "EQ", "NEQ", 
			"AND", "OR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0197\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\7\34\u00d9\n\34\f\34\16\34\u00dc\13\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\7\35\u00e4\n\35\f\35\16\35\u00e7\13\35\3"+
		"\35\5\35\u00ea\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00f4"+
		"\n\36\f\36\16\36\u00f7\13\36\3\36\3\36\3\36\3\36\3\36\3\37\6\37\u00ff"+
		"\n\37\r\37\16\37\u0100\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u010c\n \3!\3!\7"+
		"!\u0110\n!\f!\16!\u0113\13!\3!\3!\3\"\3\"\7\"\u0119\n\"\f\"\16\"\u011c"+
		"\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u013e\n#\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0158\n$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u016c\n%\3&\3&\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\4\u00e5\u00f5\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63e\64g\65i\66\3\2\7\5\2\13\f\17\17\"\"\3\2\62;\4\2$$``\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\2\u01ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13x\3\2\2\2\r{\3\2\2"+
		"\2\17~\3\2\2\2\21\u0083\3\2\2\2\23\u0087\3\2\2\2\25\u008d\3\2\2\2\27\u0094"+
		"\3\2\2\2\31\u009c\3\2\2\2\33\u009f\3\2\2\2\35\u00a6\3\2\2\2\37\u00ab\3"+
		"\2\2\2!\u00b3\3\2\2\2#\u00b5\3\2\2\2%\u00b8\3\2\2\2\'\u00bb\3\2\2\2)\u00be"+
		"\3\2\2\2+\u00c1\3\2\2\2-\u00c4\3\2\2\2/\u00c6\3\2\2\2\61\u00c8\3\2\2\2"+
		"\63\u00d1\3\2\2\2\65\u00d4\3\2\2\2\67\u00da\3\2\2\29\u00df\3\2\2\2;\u00ef"+
		"\3\2\2\2=\u00fe\3\2\2\2?\u010b\3\2\2\2A\u010d\3\2\2\2C\u0116\3\2\2\2E"+
		"\u013d\3\2\2\2G\u0157\3\2\2\2I\u016b\3\2\2\2K\u016d\3\2\2\2M\u0171\3\2"+
		"\2\2O\u0173\3\2\2\2Q\u0175\3\2\2\2S\u0177\3\2\2\2U\u0179\3\2\2\2W\u017b"+
		"\3\2\2\2Y\u017d\3\2\2\2[\u0180\3\2\2\2]\u0182\3\2\2\2_\u0185\3\2\2\2a"+
		"\u0187\3\2\2\2c\u018a\3\2\2\2e\u018d\3\2\2\2g\u0190\3\2\2\2i\u0194\3\2"+
		"\2\2kl\7]\2\2l\4\3\2\2\2mn\7.\2\2n\6\3\2\2\2op\7_\2\2p\b\3\2\2\2qr\7t"+
		"\2\2rs\7g\2\2st\7v\2\2tu\7w\2\2uv\7t\2\2vw\7p\2\2w\n\3\2\2\2xy\7k\2\2"+
		"yz\7h\2\2z\f\3\2\2\2{|\7f\2\2|}\7q\2\2}\16\3\2\2\2~\177\7g\2\2\177\u0080"+
		"\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\20\3\2\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086\7f\2\2\u0086\22\3\2\2\2\u0087\u0088"+
		"\7y\2\2\u0088\u0089\7j\2\2\u0089\u008a\7k\2\2\u008a\u008b\7n\2\2\u008b"+
		"\u008c\7g\2\2\u008c\24\3\2\2\2\u008d\u008e\7t\2\2\u008e\u008f\7g\2\2\u008f"+
		"\u0090\7r\2\2\u0090\u0091\7g\2\2\u0091\u0092\7c\2\2\u0092\u0093\7v\2\2"+
		"\u0093\26\3\2\2\2\u0094\u0095\7h\2\2\u0095\u0096\7q\2\2\u0096\u0097\7"+
		"t\2\2\u0097\u0098\7g\2\2\u0098\u0099\7c\2\2\u0099\u009a\7e\2\2\u009a\u009b"+
		"\7j\2\2\u009b\30\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\32"+
		"\3\2\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7y\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7v\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7j\2\2\u00a5\34\3\2\2\2\u00a6"+
		"\u00a7\7e\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7g\2\2"+
		"\u00aa\36\3\2\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7"+
		"h\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2"+
		"\7v\2\2\u00b2 \3\2\2\2\u00b3\u00b4\7?\2\2\u00b4\"\3\2\2\2\u00b5\u00b6"+
		"\7-\2\2\u00b6\u00b7\7?\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba"+
		"\7?\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7,\2\2\u00bc\u00bd\7?\2\2\u00bd(\3"+
		"\2\2\2\u00be\u00bf\7`\2\2\u00bf\u00c0\7?\2\2\u00c0*\3\2\2\2\u00c1\u00c2"+
		"\7\'\2\2\u00c2\u00c3\7?\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7*\2\2\u00c5.\3"+
		"\2\2\2\u00c6\u00c7\7+\2\2\u00c7\60\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca"+
		"\7w\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7p\2\2\u00d0\62\3\2\2\2\u00d1"+
		"\u00d2\7h\2\2\u00d2\u00d3\7p\2\2\u00d3\64\3\2\2\2\u00d4\u00d5\7/\2\2\u00d5"+
		"\u00d6\7@\2\2\u00d6\66\3\2\2\2\u00d7\u00d9\t\2\2\2\u00d8\u00d7\3\2\2\2"+
		"\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\b\34\2\2\u00de8\3\2\2\2\u00df"+
		"\u00e0\7\61\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e4\13"+
		"\2\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\7\17"+
		"\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\7\f\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\35\2\2\u00ee:\3\2\2\2"+
		"\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f4"+
		"\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9"+
		"\7,\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\b\36\2\2"+
		"\u00fc<\3\2\2\2\u00fd\u00ff\t\3\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101>\3\2\2\2\u0102\u0103"+
		"\7v\2\2\u0103\u0104\7t\2\2\u0104\u0105\7w\2\2\u0105\u010c\7g\2\2\u0106"+
		"\u0107\7h\2\2\u0107\u0108\7c\2\2\u0108\u0109\7n\2\2\u0109\u010a\7u\2\2"+
		"\u010a\u010c\7g\2\2\u010b\u0102\3\2\2\2\u010b\u0106\3\2\2\2\u010c@\3\2"+
		"\2\2\u010d\u0111\7$\2\2\u010e\u0110\t\4\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7$\2\2\u0115B\3\2\2\2\u0116\u011a"+
		"\t\5\2\2\u0117\u0119\t\6\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011bD\3\2\2\2\u011c\u011a\3\2\2\2"+
		"\u011d\u011e\7F\2\2\u011e\u011f\7K\2\2\u011f\u0120\7T\2\2\u0120\u013e"+
		"\7V\2\2\u0121\u0122\7U\2\2\u0122\u0123\7C\2\2\u0123\u0124\7P\2\2\u0124"+
		"\u013e\7F\2\2\u0125\u0126\7U\2\2\u0126\u0127\7V\2\2\u0127\u0128\7Q\2\2"+
		"\u0128\u0129\7P\2\2\u0129\u013e\7G\2\2\u012a\u012b\7D\2\2\u012b\u012c"+
		"\7T\2\2\u012c\u012d\7K\2\2\u012d\u012e\7E\2\2\u012e\u013e\7M\2\2\u012f"+
		"\u0130\7I\2\2\u0130\u0131\7N\2\2\u0131\u0132\7C\2\2\u0132\u0133\7U\2\2"+
		"\u0133\u013e\7U\2\2\u0134\u0135\7Y\2\2\u0135\u0136\7Q\2\2\u0136\u0137"+
		"\7Q\2\2\u0137\u013e\7F\2\2\u0138\u0139\7R\2\2\u0139\u013a\7N\2\2\u013a"+
		"\u013b\7C\2\2\u013b\u013c\7P\2\2\u013c\u013e\7M\2\2\u013d\u011d\3\2\2"+
		"\2\u013d\u0121\3\2\2\2\u013d\u0125\3\2\2\2\u013d\u012a\3\2\2\2\u013d\u012f"+
		"\3\2\2\2\u013d\u0134\3\2\2\2\u013d\u0138\3\2\2\2\u013eF\3\2\2\2\u013f"+
		"\u0140\7W\2\2\u0140\u0158\7R\2\2\u0141\u0142\7F\2\2\u0142\u0143\7Q\2\2"+
		"\u0143\u0144\7Y\2\2\u0144\u0158\7P\2\2\u0145\u0146\7H\2\2\u0146\u0147"+
		"\7T\2\2\u0147\u0148\7Q\2\2\u0148\u0149\7P\2\2\u0149\u0158\7V\2\2\u014a"+
		"\u014b\7D\2\2\u014b\u014c\7C\2\2\u014c\u014d\7E\2\2\u014d\u0158\7M\2\2"+
		"\u014e\u014f\7N\2\2\u014f\u0150\7G\2\2\u0150\u0151\7H\2\2\u0151\u0158"+
		"\7V\2\2\u0152\u0153\7T\2\2\u0153\u0154\7K\2\2\u0154\u0155\7I\2\2\u0155"+
		"\u0156\7J\2\2\u0156\u0158\7V\2\2\u0157\u013f\3\2\2\2\u0157\u0141\3\2\2"+
		"\2\u0157\u0145\3\2\2\2\u0157\u014a\3\2\2\2\u0157\u014e\3\2\2\2\u0157\u0152"+
		"\3\2\2\2\u0158H\3\2\2\2\u0159\u015a\7P\2\2\u015a\u015b\7Q\2\2\u015b\u015c"+
		"\7T\2\2\u015c\u015d\7V\2\2\u015d\u016c\7J\2\2\u015e\u015f\7U\2\2\u015f"+
		"\u0160\7Q\2\2\u0160\u0161\7W\2\2\u0161\u0162\7V\2\2\u0162\u016c\7J\2\2"+
		"\u0163\u0164\7G\2\2\u0164\u0165\7C\2\2\u0165\u0166\7U\2\2\u0166\u016c"+
		"\7V\2\2\u0167\u0168\7Y\2\2\u0168\u0169\7G\2\2\u0169\u016a\7U\2\2\u016a"+
		"\u016c\7V\2\2\u016b\u0159\3\2\2\2\u016b\u015e\3\2\2\2\u016b\u0163\3\2"+
		"\2\2\u016b\u0167\3\2\2\2\u016cJ\3\2\2\2\u016d\u016e\7p\2\2\u016e\u016f"+
		"\7q\2\2\u016f\u0170\7v\2\2\u0170L\3\2\2\2\u0171\u0172\7/\2\2\u0172N\3"+
		"\2\2\2\u0173\u0174\7`\2\2\u0174P\3\2\2\2\u0175\u0176\7,\2\2\u0176R\3\2"+
		"\2\2\u0177\u0178\7\61\2\2\u0178T\3\2\2\2\u0179\u017a\7\'\2\2\u017aV\3"+
		"\2\2\2\u017b\u017c\7-\2\2\u017cX\3\2\2\2\u017d\u017e\7-\2\2\u017e\u017f"+
		"\7-\2\2\u017fZ\3\2\2\2\u0180\u0181\7>\2\2\u0181\\\3\2\2\2\u0182\u0183"+
		"\7>\2\2\u0183\u0184\7?\2\2\u0184^\3\2\2\2\u0185\u0186\7@\2\2\u0186`\3"+
		"\2\2\2\u0187\u0188\7@\2\2\u0188\u0189\7?\2\2\u0189b\3\2\2\2\u018a\u018b"+
		"\7?\2\2\u018b\u018c\7?\2\2\u018cd\3\2\2\2\u018d\u018e\7#\2\2\u018e\u018f"+
		"\7?\2\2\u018ff\3\2\2\2\u0190\u0191\7c\2\2\u0191\u0192\7p\2\2\u0192\u0193"+
		"\7f\2\2\u0193h\3\2\2\2\u0194\u0195\7q\2\2\u0195\u0196\7t\2\2\u0196j\3"+
		"\2\2\2\16\2\u00da\u00e5\u00e9\u00f5\u0100\u010b\u0111\u011a\u013d\u0157"+
		"\u016b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}