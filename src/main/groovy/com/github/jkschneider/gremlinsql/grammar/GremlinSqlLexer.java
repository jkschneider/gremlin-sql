// Generated from /home/jon/git/gremlin-sql/src/main/antlr4/GremlinSql.g4 by ANTLR 4.2.2
package com.github.jkschneider.gremlinsql.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GremlinSqlLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, STRING_LITERAL=8, 
		NUMERIC_LITERAL=9, IDENTIFIER=10, K_ALL=11, K_DISTINCT=12, K_AS=13, K_FROM=14, 
		K_SELECT=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "'!='", "')'", "'*'", "','", "'='", "'.'", "STRING_LITERAL", "NUMERIC_LITERAL", 
		"IDENTIFIER", "K_ALL", "K_DISTINCT", "K_AS", "K_FROM", "K_SELECT"
	};
	public static final String[] ruleNames = {
		"T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "STRING_LITERAL", 
		"NUMERIC_LITERAL", "IDENTIFIER", "K_ALL", "K_DISTINCT", "K_AS", "K_FROM", 
		"K_SELECT", "DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
		"Y", "Z"
	};


	public GremlinSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GremlinSql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u0114\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\3\n\6\ns\n\n\r\n\16\nt\3\n\3"+
		"\n\7\ny\n\n\f\n\16\n|\13\n\5\n~\n\n\3\n\3\n\5\n\u0082\n\n\3\n\6\n\u0085"+
		"\n\n\r\n\16\n\u0086\5\n\u0089\n\n\3\n\3\n\6\n\u008d\n\n\r\n\16\n\u008e"+
		"\3\n\3\n\5\n\u0093\n\n\3\n\6\n\u0096\n\n\r\n\16\n\u0097\5\n\u009a\n\n"+
		"\5\n\u009c\n\n\3\13\3\13\3\13\3\13\7\13\u00a2\n\13\f\13\16\13\u00a5\13"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ac\n\13\f\13\16\13\u00af\13\13\3"+
		"\13\3\13\3\13\7\13\u00b4\n\13\f\13\16\13\u00b7\13\13\3\13\3\13\3\13\7"+
		"\13\u00bc\n\13\f\13\16\13\u00bf\13\13\5\13\u00c1\n\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\2\2,\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2"+
		"#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2"+
		"K\2M\2O\2Q\2S\2U\2\3\2$\3\2))\4\2--//\3\2$$\3\2bb\3\2__\5\2C\\aac|\6\2"+
		"\62;C\\aac|\3\2\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4"+
		"\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQq"+
		"q\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2"+
		"ZZzz\4\2[[{{\4\2\\\\||\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7\\\3\2\2\2\t^\3\2\2\2\13`\3\2\2\2\rb\3"+
		"\2\2\2\17d\3\2\2\2\21f\3\2\2\2\23\u009b\3\2\2\2\25\u00c0\3\2\2\2\27\u00c2"+
		"\3\2\2\2\31\u00c6\3\2\2\2\33\u00cf\3\2\2\2\35\u00d2\3\2\2\2\37\u00d7\3"+
		"\2\2\2!\u00de\3\2\2\2#\u00e0\3\2\2\2%\u00e2\3\2\2\2\'\u00e4\3\2\2\2)\u00e6"+
		"\3\2\2\2+\u00e8\3\2\2\2-\u00ea\3\2\2\2/\u00ec\3\2\2\2\61\u00ee\3\2\2\2"+
		"\63\u00f0\3\2\2\2\65\u00f2\3\2\2\2\67\u00f4\3\2\2\29\u00f6\3\2\2\2;\u00f8"+
		"\3\2\2\2=\u00fa\3\2\2\2?\u00fc\3\2\2\2A\u00fe\3\2\2\2C\u0100\3\2\2\2E"+
		"\u0102\3\2\2\2G\u0104\3\2\2\2I\u0106\3\2\2\2K\u0108\3\2\2\2M\u010a\3\2"+
		"\2\2O\u010c\3\2\2\2Q\u010e\3\2\2\2S\u0110\3\2\2\2U\u0112\3\2\2\2WX\7*"+
		"\2\2X\4\3\2\2\2YZ\7#\2\2Z[\7?\2\2[\6\3\2\2\2\\]\7+\2\2]\b\3\2\2\2^_\7"+
		",\2\2_\n\3\2\2\2`a\7.\2\2a\f\3\2\2\2bc\7?\2\2c\16\3\2\2\2de\7\60\2\2e"+
		"\20\3\2\2\2fl\7)\2\2gk\n\2\2\2hi\7)\2\2ik\7)\2\2jg\3\2\2\2jh\3\2\2\2k"+
		"n\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7)\2\2p\22\3\2\2\2"+
		"qs\5!\21\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u}\3\2\2\2vz\7\60\2"+
		"\2wy\5!\21\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2"+
		"\2}v\3\2\2\2}~\3\2\2\2~\u0088\3\2\2\2\177\u0081\5+\26\2\u0080\u0082\t"+
		"\3\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0085\5!\21\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\177\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u009c\3\2\2\2\u008a\u008c\7\60\2\2\u008b\u008d\5!\21\2"+
		"\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0099\3\2\2\2\u0090\u0092\5+\26\2\u0091\u0093\t\3\2\2\u0092"+
		"\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\5!"+
		"\21\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0090\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009br\3\2\2\2\u009b\u008a\3\2\2\2\u009c\24\3"+
		"\2\2\2\u009d\u00a3\7$\2\2\u009e\u00a2\n\4\2\2\u009f\u00a0\7$\2\2\u00a0"+
		"\u00a2\7$\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00c1\7$\2\2\u00a7\u00ad\7b\2\2\u00a8\u00ac\n\5\2"+
		"\2\u00a9\u00aa\7b\2\2\u00aa\u00ac\7b\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00c1\7b\2\2\u00b1\u00b5\7]\2"+
		"\2\u00b2\u00b4\n\6\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00c1\7_\2\2\u00b9\u00bd\t\7\2\2\u00ba\u00bc\t\b\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u009d\3\2\2\2\u00c0\u00a7\3\2"+
		"\2\2\u00c0\u00b1\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c1\26\3\2\2\2\u00c2\u00c3"+
		"\5#\22\2\u00c3\u00c4\59\35\2\u00c4\u00c5\59\35\2\u00c5\30\3\2\2\2\u00c6"+
		"\u00c7\5)\25\2\u00c7\u00c8\5\63\32\2\u00c8\u00c9\5G$\2\u00c9\u00ca\5I"+
		"%\2\u00ca\u00cb\5\63\32\2\u00cb\u00cc\5=\37\2\u00cc\u00cd\5\'\24\2\u00cd"+
		"\u00ce\5I%\2\u00ce\32\3\2\2\2\u00cf\u00d0\5#\22\2\u00d0\u00d1\5G$\2\u00d1"+
		"\34\3\2\2\2\u00d2\u00d3\5-\27\2\u00d3\u00d4\5E#\2\u00d4\u00d5\5? \2\u00d5"+
		"\u00d6\5;\36\2\u00d6\36\3\2\2\2\u00d7\u00d8\5G$\2\u00d8\u00d9\5+\26\2"+
		"\u00d9\u00da\59\35\2\u00da\u00db\5+\26\2\u00db\u00dc\5\'\24\2\u00dc\u00dd"+
		"\5I%\2\u00dd \3\2\2\2\u00de\u00df\t\t\2\2\u00df\"\3\2\2\2\u00e0\u00e1"+
		"\t\n\2\2\u00e1$\3\2\2\2\u00e2\u00e3\t\13\2\2\u00e3&\3\2\2\2\u00e4\u00e5"+
		"\t\f\2\2\u00e5(\3\2\2\2\u00e6\u00e7\t\r\2\2\u00e7*\3\2\2\2\u00e8\u00e9"+
		"\t\16\2\2\u00e9,\3\2\2\2\u00ea\u00eb\t\17\2\2\u00eb.\3\2\2\2\u00ec\u00ed"+
		"\t\20\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\t\21\2\2\u00ef\62\3\2\2\2\u00f0"+
		"\u00f1\t\22\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\t\23\2\2\u00f3\66\3\2\2\2"+
		"\u00f4\u00f5\t\24\2\2\u00f58\3\2\2\2\u00f6\u00f7\t\25\2\2\u00f7:\3\2\2"+
		"\2\u00f8\u00f9\t\26\2\2\u00f9<\3\2\2\2\u00fa\u00fb\t\27\2\2\u00fb>\3\2"+
		"\2\2\u00fc\u00fd\t\30\2\2\u00fd@\3\2\2\2\u00fe\u00ff\t\31\2\2\u00ffB\3"+
		"\2\2\2\u0100\u0101\t\32\2\2\u0101D\3\2\2\2\u0102\u0103\t\33\2\2\u0103"+
		"F\3\2\2\2\u0104\u0105\t\34\2\2\u0105H\3\2\2\2\u0106\u0107\t\35\2\2\u0107"+
		"J\3\2\2\2\u0108\u0109\t\36\2\2\u0109L\3\2\2\2\u010a\u010b\t\37\2\2\u010b"+
		"N\3\2\2\2\u010c\u010d\t \2\2\u010dP\3\2\2\2\u010e\u010f\t!\2\2\u010fR"+
		"\3\2\2\2\u0110\u0111\t\"\2\2\u0111T\3\2\2\2\u0112\u0113\t#\2\2\u0113V"+
		"\3\2\2\2\27\2jltz}\u0081\u0086\u0088\u008e\u0092\u0097\u0099\u009b\u00a1"+
		"\u00a3\u00ab\u00ad\u00b5\u00bd\u00c0\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}