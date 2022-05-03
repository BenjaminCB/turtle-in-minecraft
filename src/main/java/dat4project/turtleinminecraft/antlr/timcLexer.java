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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		WS=32, LINE_COMMENT=33, COMMENT=34, NUMBER=35, BOOL=36, STRING=37, NOTHING=38, 
		ID=39, BLOCK=40, RELDIR=41, ABSDIR=42, ASSIGN=43, ADDASSIGN=44, SUBASSIGN=45, 
		MULTASSIGN=46, DIVASSIGN=47, MODASSIGN=48, POWERASSIGN=49, NOT=50, SUB=51, 
		POWER=52, MULT=53, DIV=54, MOD=55, ADD=56, CONCAT=57, LT=58, LTEQ=59, 
		GT=60, GTEQ=61, EQ=62, NEQ=63, AND=64, OR=65;
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
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "WS", "LINE_COMMENT", 
			"COMMENT", "NUMBER", "BOOL", "STRING", "NOTHING", "ID", "BLOCK", "RELDIR", 
			"ABSDIR", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULTASSIGN", "DIVASSIGN", 
			"MODASSIGN", "POWERASSIGN", "NOT", "SUB", "POWER", "MULT", "DIV", "MOD", 
			"ADD", "CONCAT", "LT", "LTEQ", "GT", "GTEQ", "EQ", "NEQ", "AND", "OR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u01f0\b\1\4\2\t"+
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
		" \3!\7!\u0128\n!\f!\16!\u012b\13!\3!\3!\3\"\3\"\3\"\3\"\7\"\u0133\n\""+
		"\f\"\16\"\u0136\13\"\3\"\5\"\u0139\n\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\7#"+
		"\u0143\n#\f#\16#\u0146\13#\3#\3#\3#\3#\3#\3$\6$\u014e\n$\r$\16$\u014f"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u015b\n%\3&\3&\7&\u015f\n&\f&\16&\u0162"+
		"\13&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\7(\u0170\n(\f(\16(\u0173"+
		"\13(\3)\3)\3)\3)\3)\3)\6)\u017b\n)\r)\16)\u017c\3)\7)\u0180\n)\f)\16)"+
		"\u0183\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\5*\u019d\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\5+\u01b1\n+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3<\3<\3<\3=\3=\3>\3>\3"+
		">\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\4\u0134\u0144\2C\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\3\2\b\5\2\13\f\17\17\"\"\3\2\62;\4\2$$``\5\2C\\"+
		"aac|\6\2\62;C\\aac|\4\2C\\aa\2\u0201\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u0087\3\2\2\2\7\u0089"+
		"\3\2\2\2\t\u008b\3\2\2\2\13\u0092\3\2\2\2\r\u0098\3\2\2\2\17\u009b\3\2"+
		"\2\2\21\u009e\3\2\2\2\23\u00a3\3\2\2\2\25\u00a7\3\2\2\2\27\u00ad\3\2\2"+
		"\2\31\u00b4\3\2\2\2\33\u00bc\3\2\2\2\35\u00bf\3\2\2\2\37\u00c6\3\2\2\2"+
		"!\u00cb\3\2\2\2#\u00d3\3\2\2\2%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00e0\3"+
		"\2\2\2+\u00e3\3\2\2\2-\u00e6\3\2\2\2/\u00ee\3\2\2\2\61\u00f7\3\2\2\2\63"+
		"\u00fa\3\2\2\2\65\u00ff\3\2\2\2\67\u0104\3\2\2\29\u0109\3\2\2\2;\u010f"+
		"\3\2\2\2=\u0116\3\2\2\2?\u011f\3\2\2\2A\u0129\3\2\2\2C\u012e\3\2\2\2E"+
		"\u013e\3\2\2\2G\u014d\3\2\2\2I\u015a\3\2\2\2K\u015c\3\2\2\2M\u0165\3\2"+
		"\2\2O\u016d\3\2\2\2Q\u017a\3\2\2\2S\u019c\3\2\2\2U\u01b0\3\2\2\2W\u01b2"+
		"\3\2\2\2Y\u01b4\3\2\2\2[\u01b7\3\2\2\2]\u01ba\3\2\2\2_\u01bd\3\2\2\2a"+
		"\u01c0\3\2\2\2c\u01c3\3\2\2\2e\u01c6\3\2\2\2g\u01ca\3\2\2\2i\u01cc\3\2"+
		"\2\2k\u01ce\3\2\2\2m\u01d0\3\2\2\2o\u01d2\3\2\2\2q\u01d4\3\2\2\2s\u01d6"+
		"\3\2\2\2u\u01d9\3\2\2\2w\u01db\3\2\2\2y\u01de\3\2\2\2{\u01e0\3\2\2\2}"+
		"\u01e3\3\2\2\2\177\u01e6\3\2\2\2\u0081\u01e9\3\2\2\2\u0083\u01ed\3\2\2"+
		"\2\u0085\u0086\7]\2\2\u0086\4\3\2\2\2\u0087\u0088\7.\2\2\u0088\6\3\2\2"+
		"\2\u0089\u008a\7_\2\2\u008a\b\3\2\2\2\u008b\u008c\7t\2\2\u008c\u008d\7"+
		"g\2\2\u008d\u008e\7v\2\2\u008e\u008f\7w\2\2\u008f\u0090\7t\2\2\u0090\u0091"+
		"\7p\2\2\u0091\n\3\2\2\2\u0092\u0093\7d\2\2\u0093\u0094\7t\2\2\u0094\u0095"+
		"\7g\2\2\u0095\u0096\7c\2\2\u0096\u0097\7m\2\2\u0097\f\3\2\2\2\u0098\u0099"+
		"\7k\2\2\u0099\u009a\7h\2\2\u009a\16\3\2\2\2\u009b\u009c\7f\2\2\u009c\u009d"+
		"\7q\2\2\u009d\20\3\2\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1"+
		"\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5"+
		"\7p\2\2\u00a5\u00a6\7f\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9"+
		"\7j\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\26\3\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7r\2\2\u00b0"+
		"\u00b1\7g\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7v\2\2\u00b3\30\3\2\2\2\u00b4"+
		"\u00b5\7h\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8\u00b9\7c\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7j\2\2\u00bb\32\3\2"+
		"\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be\34\3\2\2\2\u00bf\u00c0"+
		"\7u\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"\u00c4\7e\2\2\u00c4\u00c5\7j\2\2\u00c5\36\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7"+
		"\u00c8\7c\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca \3\2\2\2\u00cb"+
		"\u00cc\7f\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7c\2\2"+
		"\u00cf\u00d0\7w\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7v\2\2\u00d2\"\3\2"+
		"\2\2\u00d3\u00d4\7*\2\2\u00d4$\3\2\2\2\u00d5\u00d6\7+\2\2\u00d6&\3\2\2"+
		"\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7p\2\2\u00da\u00db"+
		"\7e\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7q\2\2\u00de"+
		"\u00df\7p\2\2\u00df(\3\2\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7p\2\2\u00e2"+
		"*\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\7@\2\2\u00e5,\3\2\2\2\u00e6\u00e7"+
		"\7h\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7y\2\2\u00ea"+
		"\u00eb\7c\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7f\2\2\u00ed.\3\2\2\2\u00ee"+
		"\u00ef\7d\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7m\2\2"+
		"\u00f2\u00f3\7y\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6"+
		"\7f\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7r\2\2\u00f9\62"+
		"\3\2\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7y\2\2\u00fd"+
		"\u00fe\7p\2\2\u00fe\64\3\2\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7q\2\2\u0101"+
		"\u0102\7q\2\2\u0102\u0103\7m\2\2\u0103\66\3\2\2\2\u0104\u0105\7v\2\2\u0105"+
		"\u0106\7w\2\2\u0106\u0107\7t\2\2\u0107\u0108\7p\2\2\u01088\3\2\2\2\u0109"+
		"\u010a\7r\2\2\u010a\u010b\7t\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2\2"+
		"\u010d\u010e\7v\2\2\u010e:\3\2\2\2\u010f\u0110\7h\2\2\u0110\u0111\7c\2"+
		"\2\u0111\u0112\7e\2\2\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114\u0115"+
		"\7i\2\2\u0115<\3\2\2\2\u0116\u0117\7r\2\2\u0117\u0118\7q\2\2\u0118\u0119"+
		"\7u\2\2\u0119\u011a\7k\2\2\u011a\u011b\7v\2\2\u011b\u011c\7k\2\2\u011c"+
		"\u011d\7q\2\2\u011d\u011e\7p\2\2\u011e>\3\2\2\2\u011f\u0120\7n\2\2\u0120"+
		"\u0121\7g\2\2\u0121\u0122\7p\2\2\u0122\u0123\7i\2\2\u0123\u0124\7v\2\2"+
		"\u0124\u0125\7j\2\2\u0125@\3\2\2\2\u0126\u0128\t\2\2\2\u0127\u0126\3\2"+
		"\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\b!\2\2\u012dB\3\2\2\2\u012e"+
		"\u012f\7\61\2\2\u012f\u0130\7\61\2\2\u0130\u0134\3\2\2\2\u0131\u0133\13"+
		"\2\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0135\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139\7\17"+
		"\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\7\f\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b\"\2\2\u013dD\3\2\2\2"+
		"\u013e\u013f\7\61\2\2\u013f\u0140\7,\2\2\u0140\u0144\3\2\2\2\u0141\u0143"+
		"\13\2\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0145\3\2\2\2"+
		"\u0144\u0142\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148"+
		"\7,\2\2\u0148\u0149\7\61\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b#\2\2\u014b"+
		"F\3\2\2\2\u014c\u014e\t\3\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2"+
		"\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150H\3\2\2\2\u0151\u0152\7"+
		"v\2\2\u0152\u0153\7t\2\2\u0153\u0154\7w\2\2\u0154\u015b\7g\2\2\u0155\u0156"+
		"\7h\2\2\u0156\u0157\7c\2\2\u0157\u0158\7n\2\2\u0158\u0159\7u\2\2\u0159"+
		"\u015b\7g\2\2\u015a\u0151\3\2\2\2\u015a\u0155\3\2\2\2\u015bJ\3\2\2\2\u015c"+
		"\u0160\7$\2\2\u015d\u015f\t\4\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0164\7$\2\2\u0164L\3\2\2\2\u0165\u0166\7p\2\2\u0166"+
		"\u0167\7q\2\2\u0167\u0168\7v\2\2\u0168\u0169\7j\2\2\u0169\u016a\7k\2\2"+
		"\u016a\u016b\7p\2\2\u016b\u016c\7i\2\2\u016cN\3\2\2\2\u016d\u0171\t\5"+
		"\2\2\u016e\u0170\t\6\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172P\3\2\2\2\u0173\u0171\3\2\2\2"+
		"\u0174\u0175\7D\2\2\u0175\u0176\7N\2\2\u0176\u0177\7Q\2\2\u0177\u0178"+
		"\7E\2\2\u0178\u0179\7M\2\2\u0179\u017b\7<\2\2\u017a\u0174\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0181\3\2"+
		"\2\2\u017e\u0180\t\7\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182R\3\2\2\2\u0183\u0181\3\2\2\2"+
		"\u0184\u0185\7W\2\2\u0185\u019d\7R\2\2\u0186\u0187\7F\2\2\u0187\u0188"+
		"\7Q\2\2\u0188\u0189\7Y\2\2\u0189\u019d\7P\2\2\u018a\u018b\7H\2\2\u018b"+
		"\u018c\7T\2\2\u018c\u018d\7Q\2\2\u018d\u018e\7P\2\2\u018e\u019d\7V\2\2"+
		"\u018f\u0190\7D\2\2\u0190\u0191\7C\2\2\u0191\u0192\7E\2\2\u0192\u019d"+
		"\7M\2\2\u0193\u0194\7N\2\2\u0194\u0195\7G\2\2\u0195\u0196\7H\2\2\u0196"+
		"\u019d\7V\2\2\u0197\u0198\7T\2\2\u0198\u0199\7K\2\2\u0199\u019a\7I\2\2"+
		"\u019a\u019b\7J\2\2\u019b\u019d\7V\2\2\u019c\u0184\3\2\2\2\u019c\u0186"+
		"\3\2\2\2\u019c\u018a\3\2\2\2\u019c\u018f\3\2\2\2\u019c\u0193\3\2\2\2\u019c"+
		"\u0197\3\2\2\2\u019dT\3\2\2\2\u019e\u019f\7P\2\2\u019f\u01a0\7Q\2\2\u01a0"+
		"\u01a1\7T\2\2\u01a1\u01a2\7V\2\2\u01a2\u01b1\7J\2\2\u01a3\u01a4\7U\2\2"+
		"\u01a4\u01a5\7Q\2\2\u01a5\u01a6\7W\2\2\u01a6\u01a7\7V\2\2\u01a7\u01b1"+
		"\7J\2\2\u01a8\u01a9\7G\2\2\u01a9\u01aa\7C\2\2\u01aa\u01ab\7U\2\2\u01ab"+
		"\u01b1\7V\2\2\u01ac\u01ad\7Y\2\2\u01ad\u01ae\7G\2\2\u01ae\u01af\7U\2\2"+
		"\u01af\u01b1\7V\2\2\u01b0\u019e\3\2\2\2\u01b0\u01a3\3\2\2\2\u01b0\u01a8"+
		"\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b1V\3\2\2\2\u01b2\u01b3\7?\2\2\u01b3X"+
		"\3\2\2\2\u01b4\u01b5\7-\2\2\u01b5\u01b6\7?\2\2\u01b6Z\3\2\2\2\u01b7\u01b8"+
		"\7/\2\2\u01b8\u01b9\7?\2\2\u01b9\\\3\2\2\2\u01ba\u01bb\7,\2\2\u01bb\u01bc"+
		"\7?\2\2\u01bc^\3\2\2\2\u01bd\u01be\7\61\2\2\u01be\u01bf\7?\2\2\u01bf`"+
		"\3\2\2\2\u01c0\u01c1\7\'\2\2\u01c1\u01c2\7?\2\2\u01c2b\3\2\2\2\u01c3\u01c4"+
		"\7`\2\2\u01c4\u01c5\7?\2\2\u01c5d\3\2\2\2\u01c6\u01c7\7p\2\2\u01c7\u01c8"+
		"\7q\2\2\u01c8\u01c9\7v\2\2\u01c9f\3\2\2\2\u01ca\u01cb\7/\2\2\u01cbh\3"+
		"\2\2\2\u01cc\u01cd\7`\2\2\u01cdj\3\2\2\2\u01ce\u01cf\7,\2\2\u01cfl\3\2"+
		"\2\2\u01d0\u01d1\7\61\2\2\u01d1n\3\2\2\2\u01d2\u01d3\7\'\2\2\u01d3p\3"+
		"\2\2\2\u01d4\u01d5\7-\2\2\u01d5r\3\2\2\2\u01d6\u01d7\7-\2\2\u01d7\u01d8"+
		"\7-\2\2\u01d8t\3\2\2\2\u01d9\u01da\7>\2\2\u01dav\3\2\2\2\u01db\u01dc\7"+
		">\2\2\u01dc\u01dd\7?\2\2\u01ddx\3\2\2\2\u01de\u01df\7@\2\2\u01dfz\3\2"+
		"\2\2\u01e0\u01e1\7@\2\2\u01e1\u01e2\7?\2\2\u01e2|\3\2\2\2\u01e3\u01e4"+
		"\7?\2\2\u01e4\u01e5\7?\2\2\u01e5~\3\2\2\2\u01e6\u01e7\7#\2\2\u01e7\u01e8"+
		"\7?\2\2\u01e8\u0080\3\2\2\2\u01e9\u01ea\7c\2\2\u01ea\u01eb\7p\2\2\u01eb"+
		"\u01ec\7f\2\2\u01ec\u0082\3\2\2\2\u01ed\u01ee\7q\2\2\u01ee\u01ef\7t\2"+
		"\2\u01ef\u0084\3\2\2\2\17\2\u0129\u0134\u0138\u0144\u014f\u015a\u0160"+
		"\u0171\u017c\u0181\u019c\u01b0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}