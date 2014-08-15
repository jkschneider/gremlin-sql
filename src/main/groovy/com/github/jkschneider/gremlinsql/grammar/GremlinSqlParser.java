// Generated from /home/jon/git/gremlin-sql/src/main/antlr4/GremlinSql.g4 by ANTLR 4.2.2
package com.github.jkschneider.gremlinsql.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GremlinSqlParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, K_SELECT=6, K_FROM=7, K_NULL=8, 
		K_CURRENT_DATE=9, K_CURRENT_TIME=10, K_CURRENT_TIMESTAMP=11, K_WHERE=12, 
		K_EQ=13, K_NEQ=14, K_GT=15, K_GTE=16, K_LT=17, K_LTE=18, IDENTIFIER=19, 
		STRING_LITERAL=20, NUMERIC_LITERAL=21, WS=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'*'", "','", "'.'", "K_SELECT", "K_FROM", 
		"K_NULL", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_WHERE", 
		"'='", "K_NEQ", "'>'", "'>='", "'<'", "'<='", "IDENTIFIER", "STRING_LITERAL", 
		"NUMERIC_LITERAL", "WS"
	};
	public static final int
		RULE_result_column = 0, RULE_select = 1, RULE_where_clause = 2, RULE_literal_value = 3, 
		RULE_table_name = 4, RULE_column_name = 5, RULE_any_name = 6;
	public static final String[] ruleNames = {
		"result_column", "select", "where_clause", "literal_value", "table_name", 
		"column_name", "any_name"
	};

	@Override
	public String getGrammarFileName() { return "GremlinSql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GremlinSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Result_columnContext extends ParserRuleContext {
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_result_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); match(3);
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

	public static class SelectContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(GremlinSqlParser.K_WHERE, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_SELECT() { return getToken(GremlinSqlParser.K_SELECT, 0); }
		public TerminalNode K_FROM() { return getToken(GremlinSqlParser.K_FROM, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); match(K_SELECT);
			setState(17); result_column();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(18); match(4);
				setState(19); result_column();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25); match(K_FROM);
			setState(26); table_name();
			setState(29);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(27); match(K_WHERE);
				setState(28); where_clause();
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

	public static class Where_clauseContext extends ParserRuleContext {
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	 
		public Where_clauseContext() { }
		public void copyFrom(Where_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhereCompareContext extends Where_clauseContext {
		public TerminalNode K_LTE() { return getToken(GremlinSqlParser.K_LTE, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_NEQ() { return getToken(GremlinSqlParser.K_NEQ, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_EQ() { return getToken(GremlinSqlParser.K_EQ, 0); }
		public TerminalNode K_LT() { return getToken(GremlinSqlParser.K_LT, 0); }
		public TerminalNode K_GTE() { return getToken(GremlinSqlParser.K_GTE, 0); }
		public TerminalNode K_GT() { return getToken(GremlinSqlParser.K_GT, 0); }
		public WhereCompareContext(Where_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterWhereCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitWhereCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitWhereCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_where_clause);
		int _la;
		try {
			_localctx = new WhereCompareContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(31); table_name();
			setState(32); match(5);
			setState(33); column_name();
			setState(34);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_EQ) | (1L << K_NEQ) | (1L << K_GT) | (1L << K_GTE) | (1L << K_LT) | (1L << K_LTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(35); literal_value();
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode K_CURRENT_DATE() { return getToken(GremlinSqlParser.K_CURRENT_DATE, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(GremlinSqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(GremlinSqlParser.K_NULL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GremlinSqlParser.STRING_LITERAL, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(GremlinSqlParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(GremlinSqlParser.K_CURRENT_TIME, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_NULL) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << STRING_LITERAL) | (1L << NUMERIC_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(GremlinSqlParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GremlinSqlParser.IDENTIFIER, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_any_name);
		try {
			setState(49);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); match(STRING_LITERAL);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); match(1);
				setState(46); any_name();
				setState(47); match(2);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3\7"+
		"\3\27\n\3\f\3\16\3\32\13\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\64\n\b\3\b"+
		"\2\2\t\2\4\6\b\n\f\16\2\4\3\2\17\24\4\2\n\r\26\27\62\2\20\3\2\2\2\4\22"+
		"\3\2\2\2\6!\3\2\2\2\b\'\3\2\2\2\n)\3\2\2\2\f+\3\2\2\2\16\63\3\2\2\2\20"+
		"\21\7\5\2\2\21\3\3\2\2\2\22\23\7\b\2\2\23\30\5\2\2\2\24\25\7\6\2\2\25"+
		"\27\5\2\2\2\26\24\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31"+
		"\33\3\2\2\2\32\30\3\2\2\2\33\34\7\t\2\2\34\37\5\n\6\2\35\36\7\16\2\2\36"+
		" \5\6\4\2\37\35\3\2\2\2\37 \3\2\2\2 \5\3\2\2\2!\"\5\n\6\2\"#\7\7\2\2#"+
		"$\5\f\7\2$%\t\2\2\2%&\5\b\5\2&\7\3\2\2\2\'(\t\3\2\2(\t\3\2\2\2)*\5\16"+
		"\b\2*\13\3\2\2\2+,\5\16\b\2,\r\3\2\2\2-\64\7\25\2\2.\64\7\26\2\2/\60\7"+
		"\3\2\2\60\61\5\16\b\2\61\62\7\4\2\2\62\64\3\2\2\2\63-\3\2\2\2\63.\3\2"+
		"\2\2\63/\3\2\2\2\64\17\3\2\2\2\5\30\37\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}