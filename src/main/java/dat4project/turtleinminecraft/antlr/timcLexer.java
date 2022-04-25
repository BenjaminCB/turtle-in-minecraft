package dat4project.turtleinminecraft.antlr;
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
		T__17=18, T__18=19, T__19=20, WS=21, LINE_COMMENT=22, COMMENT=23, NUMBER=24, 
		BOOL=25, STRING=26, ID=27, BLOCK=28, RELDIR=29, ABSDIR=30, ASSIGN=31, 
		ADDASSIGN=32, SUBASSIGN=33, MULTASSIGN=34, DIVASSIGN=35, MODASSIGN=36, 
		POWERASSIGN=37, NOT=38, SUB=39, POWER=40, MULT=41, DIV=42, MOD=43, ADD=44, 
		CONCAT=45, LT=46, LTEQ=47, GT=48, GTEQ=49, EQ=50, NEQ=51, AND=52, OR=53;
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
			"T__17", "T__18", "T__19", "WS", "LINE_COMMENT", "COMMENT", "NUMBER", 
			"BOOL", "STRING", "ID", "BLOCK", "RELDIR", "ABSDIR", "ASSIGN", "ADDASSIGN", 
			"SUBASSIGN", "MULTASSIGN", "DIVASSIGN", "MODASSIGN", "POWERASSIGN", "NOT", 
			"SUB", "POWER", "MULT", "DIV", "MOD", "ADD", "CONCAT", "LT", "LTEQ", 
			"GT", "GTEQ", "EQ", "NEQ", "AND", "OR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u019c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\7\26\u00ca\n\26\f\26\16\26\u00cd\13\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\7\27\u00d5\n\27\f\27\16\27\u00d8\13\27\3\27\5"+
		"\27\u00db\n\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00e5\n\30"+
		"\f\30\16\30\u00e8\13\30\3\30\3\30\3\30\3\30\3\30\3\31\6\31\u00f0\n\31"+
		"\r\31\16\31\u00f1\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00fd"+
		"\n\32\3\33\3\33\7\33\u0101\n\33\f\33\16\33\u0104\13\33\3\33\3\33\3\34"+
		"\3\34\7\34\u010a\n\34\f\34\16\34\u010d\13\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u012f\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0149"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u015d\n\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\4\u00d6"+
		"\u00e6\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67\3\2\7\5\2\13\f\17\17\"\"\3\2\62;\4\2$$``\5\2C\\aac|\6\2\62;C"+
		"\\aac|\2\u01b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\ts\3\2\2\2\13z\3\2\2\2\r}\3\2"+
		"\2\2\17\u0080\3\2\2\2\21\u0085\3\2\2\2\23\u0089\3\2\2\2\25\u008f\3\2\2"+
		"\2\27\u0096\3\2\2\2\31\u009e\3\2\2\2\33\u00a1\3\2\2\2\35\u00a8\3\2\2\2"+
		"\37\u00ad\3\2\2\2!\u00b5\3\2\2\2#\u00b7\3\2\2\2%\u00b9\3\2\2\2\'\u00c2"+
		"\3\2\2\2)\u00c5\3\2\2\2+\u00cb\3\2\2\2-\u00d0\3\2\2\2/\u00e0\3\2\2\2\61"+
		"\u00ef\3\2\2\2\63\u00fc\3\2\2\2\65\u00fe\3\2\2\2\67\u0107\3\2\2\29\u012e"+
		"\3\2\2\2;\u0148\3\2\2\2=\u015c\3\2\2\2?\u015e\3\2\2\2A\u0160\3\2\2\2C"+
		"\u0163\3\2\2\2E\u0166\3\2\2\2G\u0169\3\2\2\2I\u016c\3\2\2\2K\u016f\3\2"+
		"\2\2M\u0172\3\2\2\2O\u0176\3\2\2\2Q\u0178\3\2\2\2S\u017a\3\2\2\2U\u017c"+
		"\3\2\2\2W\u017e\3\2\2\2Y\u0180\3\2\2\2[\u0182\3\2\2\2]\u0185\3\2\2\2_"+
		"\u0187\3\2\2\2a\u018a\3\2\2\2c\u018c\3\2\2\2e\u018f\3\2\2\2g\u0192\3\2"+
		"\2\2i\u0195\3\2\2\2k\u0199\3\2\2\2mn\7]\2\2n\4\3\2\2\2op\7.\2\2p\6\3\2"+
		"\2\2qr\7_\2\2r\b\3\2\2\2st\7t\2\2tu\7g\2\2uv\7v\2\2vw\7w\2\2wx\7t\2\2"+
		"xy\7p\2\2y\n\3\2\2\2z{\7k\2\2{|\7h\2\2|\f\3\2\2\2}~\7f\2\2~\177\7q\2\2"+
		"\177\16\3\2\2\2\u0080\u0081\7g\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2"+
		"\2\u0083\u0084\7g\2\2\u0084\20\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u0088\7f\2\2\u0088\22\3\2\2\2\u0089\u008a\7y\2\2\u008a\u008b"+
		"\7j\2\2\u008b\u008c\7k\2\2\u008c\u008d\7n\2\2\u008d\u008e\7g\2\2\u008e"+
		"\24\3\2\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091\u0092\7r\2\2\u0092"+
		"\u0093\7g\2\2\u0093\u0094\7c\2\2\u0094\u0095\7v\2\2\u0095\26\3\2\2\2\u0096"+
		"\u0097\7h\2\2\u0097\u0098\7q\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2"+
		"\u009a\u009b\7c\2\2\u009b\u009c\7e\2\2\u009c\u009d\7j\2\2\u009d\30\3\2"+
		"\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\32\3\2\2\2\u00a1\u00a2"+
		"\7u\2\2\u00a2\u00a3\7y\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\u00a6\7e\2\2\u00a6\u00a7\7j\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7e\2\2\u00a9"+
		"\u00aa\7c\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7g\2\2\u00ac\36\3\2\2\2\u00ad"+
		"\u00ae\7f\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7c\2\2"+
		"\u00b1\u00b2\7w\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7v\2\2\u00b4 \3\2\2"+
		"\2\u00b5\u00b6\7*\2\2\u00b6\"\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8$\3\2\2"+
		"\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd"+
		"\7e\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7q\2\2\u00c0"+
		"\u00c1\7p\2\2\u00c1&\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"(\3\2\2\2\u00c5\u00c6\7/\2\2\u00c6\u00c7\7@\2\2\u00c7*\3\2\2\2\u00c8\u00ca"+
		"\t\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\b\26"+
		"\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d6"+
		"\3\2\2\2\u00d3\u00d5\13\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d9\u00db\7\17\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00dc\3\2\2\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\b\27\2\2\u00df.\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1\u00e2\7,\2\2\u00e2"+
		"\u00e6\3\2\2\2\u00e3\u00e5\13\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\b\30\2\2\u00ed\60\3\2\2\2\u00ee\u00f0\t\3\2\2\u00ef\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\62\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7w\2\2\u00f6"+
		"\u00fd\7g\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7n\2\2"+
		"\u00fa\u00fb\7u\2\2\u00fb\u00fd\7g\2\2\u00fc\u00f3\3\2\2\2\u00fc\u00f7"+
		"\3\2\2\2\u00fd\64\3\2\2\2\u00fe\u0102\7$\2\2\u00ff\u0101\t\4\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7$\2\2\u0106"+
		"\66\3\2\2\2\u0107\u010b\t\5\2\2\u0108\u010a\t\6\2\2\u0109\u0108\3\2\2"+
		"\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c8"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7F\2\2\u010f\u0110\7K\2\2\u0110"+
		"\u0111\7T\2\2\u0111\u012f\7V\2\2\u0112\u0113\7U\2\2\u0113\u0114\7C\2\2"+
		"\u0114\u0115\7P\2\2\u0115\u012f\7F\2\2\u0116\u0117\7U\2\2\u0117\u0118"+
		"\7V\2\2\u0118\u0119\7Q\2\2\u0119\u011a\7P\2\2\u011a\u012f\7G\2\2\u011b"+
		"\u011c\7D\2\2\u011c\u011d\7T\2\2\u011d\u011e\7K\2\2\u011e\u011f\7E\2\2"+
		"\u011f\u012f\7M\2\2\u0120\u0121\7I\2\2\u0121\u0122\7N\2\2\u0122\u0123"+
		"\7C\2\2\u0123\u0124\7U\2\2\u0124\u012f\7U\2\2\u0125\u0126\7Y\2\2\u0126"+
		"\u0127\7Q\2\2\u0127\u0128\7Q\2\2\u0128\u012f\7F\2\2\u0129\u012a\7R\2\2"+
		"\u012a\u012b\7N\2\2\u012b\u012c\7C\2\2\u012c\u012d\7P\2\2\u012d\u012f"+
		"\7M\2\2\u012e\u010e\3\2\2\2\u012e\u0112\3\2\2\2\u012e\u0116\3\2\2\2\u012e"+
		"\u011b\3\2\2\2\u012e\u0120\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u0129\3\2"+
		"\2\2\u012f:\3\2\2\2\u0130\u0131\7W\2\2\u0131\u0149\7R\2\2\u0132\u0133"+
		"\7F\2\2\u0133\u0134\7Q\2\2\u0134\u0135\7Y\2\2\u0135\u0149\7P\2\2\u0136"+
		"\u0137\7H\2\2\u0137\u0138\7T\2\2\u0138\u0139\7Q\2\2\u0139\u013a\7P\2\2"+
		"\u013a\u0149\7V\2\2\u013b\u013c\7D\2\2\u013c\u013d\7C\2\2\u013d\u013e"+
		"\7E\2\2\u013e\u0149\7M\2\2\u013f\u0140\7N\2\2\u0140\u0141\7G\2\2\u0141"+
		"\u0142\7H\2\2\u0142\u0149\7V\2\2\u0143\u0144\7T\2\2\u0144\u0145\7K\2\2"+
		"\u0145\u0146\7I\2\2\u0146\u0147\7J\2\2\u0147\u0149\7V\2\2\u0148\u0130"+
		"\3\2\2\2\u0148\u0132\3\2\2\2\u0148\u0136\3\2\2\2\u0148\u013b\3\2\2\2\u0148"+
		"\u013f\3\2\2\2\u0148\u0143\3\2\2\2\u0149<\3\2\2\2\u014a\u014b\7P\2\2\u014b"+
		"\u014c\7Q\2\2\u014c\u014d\7T\2\2\u014d\u014e\7V\2\2\u014e\u015d\7J\2\2"+
		"\u014f\u0150\7U\2\2\u0150\u0151\7Q\2\2\u0151\u0152\7W\2\2\u0152\u0153"+
		"\7V\2\2\u0153\u015d\7J\2\2\u0154\u0155\7G\2\2\u0155\u0156\7C\2\2\u0156"+
		"\u0157\7U\2\2\u0157\u015d\7V\2\2\u0158\u0159\7Y\2\2\u0159\u015a\7G\2\2"+
		"\u015a\u015b\7U\2\2\u015b\u015d\7V\2\2\u015c\u014a\3\2\2\2\u015c\u014f"+
		"\3\2\2\2\u015c\u0154\3\2\2\2\u015c\u0158\3\2\2\2\u015d>\3\2\2\2\u015e"+
		"\u015f\7?\2\2\u015f@\3\2\2\2\u0160\u0161\7-\2\2\u0161\u0162\7?\2\2\u0162"+
		"B\3\2\2\2\u0163\u0164\7/\2\2\u0164\u0165\7?\2\2\u0165D\3\2\2\2\u0166\u0167"+
		"\7,\2\2\u0167\u0168\7?\2\2\u0168F\3\2\2\2\u0169\u016a\7\61\2\2\u016a\u016b"+
		"\7?\2\2\u016bH\3\2\2\2\u016c\u016d\7\'\2\2\u016d\u016e\7?\2\2\u016eJ\3"+
		"\2\2\2\u016f\u0170\7`\2\2\u0170\u0171\7?\2\2\u0171L\3\2\2\2\u0172\u0173"+
		"\7p\2\2\u0173\u0174\7q\2\2\u0174\u0175\7v\2\2\u0175N\3\2\2\2\u0176\u0177"+
		"\7/\2\2\u0177P\3\2\2\2\u0178\u0179\7`\2\2\u0179R\3\2\2\2\u017a\u017b\7"+
		",\2\2\u017bT\3\2\2\2\u017c\u017d\7\61\2\2\u017dV\3\2\2\2\u017e\u017f\7"+
		"\'\2\2\u017fX\3\2\2\2\u0180\u0181\7-\2\2\u0181Z\3\2\2\2\u0182\u0183\7"+
		"-\2\2\u0183\u0184\7-\2\2\u0184\\\3\2\2\2\u0185\u0186\7>\2\2\u0186^\3\2"+
		"\2\2\u0187\u0188\7>\2\2\u0188\u0189\7?\2\2\u0189`\3\2\2\2\u018a\u018b"+
		"\7@\2\2\u018bb\3\2\2\2\u018c\u018d\7@\2\2\u018d\u018e\7?\2\2\u018ed\3"+
		"\2\2\2\u018f\u0190\7?\2\2\u0190\u0191\7?\2\2\u0191f\3\2\2\2\u0192\u0193"+
		"\7#\2\2\u0193\u0194\7?\2\2\u0194h\3\2\2\2\u0195\u0196\7c\2\2\u0196\u0197"+
		"\7p\2\2\u0197\u0198\7f\2\2\u0198j\3\2\2\2\u0199\u019a\7q\2\2\u019a\u019b"+
		"\7t\2\2\u019bl\3\2\2\2\16\2\u00cb\u00d6\u00da\u00e6\u00f1\u00fc\u0102"+
		"\u010b\u012e\u0148\u015c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}