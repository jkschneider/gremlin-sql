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
		T__3=1, T__2=2, T__1=3, T__0=4, K_SELECT=5, K_FROM=6, IDENTIFIER=7, STRING_LITERAL=8, 
		WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "'*'", "','", "K_SELECT", "K_FROM", "IDENTIFIER", "STRING_LITERAL", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "K_SELECT", "K_FROM", "IDENTIFIER", "STRING_LITERAL", 
		"DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
		"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13\u00cc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bd\n\b"+
		"\f\b\16\bg\13\b\3\b\3\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\3\b\3"+
		"\b\7\bv\n\b\f\b\16\by\13\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\5"+
		"\b\u0083\n\b\3\t\3\t\3\t\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\6%\u00c7\n%\r%\16%\u00c8\3%\3"+
		"%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\2\27\2\31\2\33\2\35"+
		"\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2"+
		"E\2G\2I\13\3\2$\3\2$$\3\2bb\3\2__\5\2C\\aac|\6\2\62;C\\aac|\3\2))\3\2"+
		"\62;\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4"+
		"\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSs"+
		"s\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2"+
		"\\\\||\5\2\13\f\16\17\"\"\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2I\3\2\2"+
		"\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rZ\3\2\2\2"+
		"\17\u0082\3\2\2\2\21\u0084\3\2\2\2\23\u008f\3\2\2\2\25\u0091\3\2\2\2\27"+
		"\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2\2\37\u009b"+
		"\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2"+
		")\u00a5\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61\u00ad"+
		"\3\2\2\2\63\u00af\3\2\2\2\65\u00b1\3\2\2\2\67\u00b3\3\2\2\29\u00b5\3\2"+
		"\2\2;\u00b7\3\2\2\2=\u00b9\3\2\2\2?\u00bb\3\2\2\2A\u00bd\3\2\2\2C\u00bf"+
		"\3\2\2\2E\u00c1\3\2\2\2G\u00c3\3\2\2\2I\u00c6\3\2\2\2KL\7*\2\2L\4\3\2"+
		"\2\2MN\7+\2\2N\6\3\2\2\2OP\7,\2\2P\b\3\2\2\2QR\7.\2\2R\n\3\2\2\2ST\59"+
		"\35\2TU\5\35\17\2UV\5+\26\2VW\5\35\17\2WX\5\31\r\2XY\5;\36\2Y\f\3\2\2"+
		"\2Z[\5\37\20\2[\\\5\67\34\2\\]\5\61\31\2]^\5-\27\2^\16\3\2\2\2_e\7$\2"+
		"\2`d\n\2\2\2ab\7$\2\2bd\7$\2\2c`\3\2\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2h\u0083\7$\2\2io\7b\2\2jn\n\3\2\2kl\7b\2"+
		"\2ln\7b\2\2mj\3\2\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2"+
		"\2qo\3\2\2\2r\u0083\7b\2\2sw\7]\2\2tv\n\4\2\2ut\3\2\2\2vy\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z\u0083\7_\2\2{\177\t\5\2\2|~\t\6"+
		"\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082_\3\2\2\2\u0082i\3\2\2\2\u0082s\3\2\2"+
		"\2\u0082{\3\2\2\2\u0083\20\3\2\2\2\u0084\u008a\7)\2\2\u0085\u0089\n\7"+
		"\2\2\u0086\u0087\7)\2\2\u0087\u0089\7)\2\2\u0088\u0085\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7)\2\2\u008e\22\3\2\2\2"+
		"\u008f\u0090\t\b\2\2\u0090\24\3\2\2\2\u0091\u0092\t\t\2\2\u0092\26\3\2"+
		"\2\2\u0093\u0094\t\n\2\2\u0094\30\3\2\2\2\u0095\u0096\t\13\2\2\u0096\32"+
		"\3\2\2\2\u0097\u0098\t\f\2\2\u0098\34\3\2\2\2\u0099\u009a\t\r\2\2\u009a"+
		"\36\3\2\2\2\u009b\u009c\t\16\2\2\u009c \3\2\2\2\u009d\u009e\t\17\2\2\u009e"+
		"\"\3\2\2\2\u009f\u00a0\t\20\2\2\u00a0$\3\2\2\2\u00a1\u00a2\t\21\2\2\u00a2"+
		"&\3\2\2\2\u00a3\u00a4\t\22\2\2\u00a4(\3\2\2\2\u00a5\u00a6\t\23\2\2\u00a6"+
		"*\3\2\2\2\u00a7\u00a8\t\24\2\2\u00a8,\3\2\2\2\u00a9\u00aa\t\25\2\2\u00aa"+
		".\3\2\2\2\u00ab\u00ac\t\26\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\t\27\2\2\u00ae"+
		"\62\3\2\2\2\u00af\u00b0\t\30\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\t\31\2\2"+
		"\u00b2\66\3\2\2\2\u00b3\u00b4\t\32\2\2\u00b48\3\2\2\2\u00b5\u00b6\t\33"+
		"\2\2\u00b6:\3\2\2\2\u00b7\u00b8\t\34\2\2\u00b8<\3\2\2\2\u00b9\u00ba\t"+
		"\35\2\2\u00ba>\3\2\2\2\u00bb\u00bc\t\36\2\2\u00bc@\3\2\2\2\u00bd\u00be"+
		"\t\37\2\2\u00beB\3\2\2\2\u00bf\u00c0\t \2\2\u00c0D\3\2\2\2\u00c1\u00c2"+
		"\t!\2\2\u00c2F\3\2\2\2\u00c3\u00c4\t\"\2\2\u00c4H\3\2\2\2\u00c5\u00c7"+
		"\t#\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b%\2\2\u00cbJ\3\2\2\2\r"+
		"\2cemow\177\u0082\u0088\u008a\u00c8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}