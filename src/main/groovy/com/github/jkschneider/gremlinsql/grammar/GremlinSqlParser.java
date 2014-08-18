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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, K_SELECT=8, K_FROM=9, 
		K_NULL=10, K_CURRENT_DATE=11, K_CURRENT_TIME=12, K_CURRENT_TIMESTAMP=13, 
		K_WHERE=14, K_EQ=15, K_NEQ=16, K_GT=17, K_GTE=18, K_LT=19, K_LTE=20, K_IN=21, 
		K_AND=22, K_OR=23, K_OUTER=24, K_INNER=25, K_JOIN=26, K_ON=27, UNQUOTED_IDENTIFIER=28, 
		IDENTIFIER=29, STRING_LITERAL=30, NUMERIC_LITERAL=31, WS=32;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "'''", "')'", "'*'", "','", "'-'", "'.'", "K_SELECT", 
		"K_FROM", "K_NULL", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
		"K_WHERE", "K_EQ", "K_NEQ", "'>'", "'>='", "'<'", "'<='", "K_IN", "K_AND", 
		"K_OR", "K_OUTER", "K_INNER", "K_JOIN", "K_ON", "UNQUOTED_IDENTIFIER", 
		"IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL", "WS"
	};
	public static final int
		RULE_result_column = 0, RULE_select = 1, RULE_join_clause = 2, RULE_join_on = 3, 
		RULE_where_clause = 4, RULE_literal_value = 5, RULE_edge_label_name = 6, 
		RULE_join_table_from_name = 7, RULE_table_name = 8, RULE_column_name = 9, 
		RULE_any_name = 10;
	public static final String[] ruleNames = {
		"result_column", "select", "join_clause", "join_on", "where_clause", "literal_value", 
		"edge_label_name", "join_table_from_name", "table_name", "column_name", 
		"any_name"
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
			setState(22); match(4);
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
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
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
			setState(24); match(K_SELECT);
			setState(25); result_column();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(26); match(5);
				setState(27); result_column();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33); match(K_FROM);
			setState(34); table_name();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_OUTER || _la==K_INNER) {
				{
				{
				setState(35); join_clause();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(41); match(K_WHERE);
				setState(42); where_clause(0);
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

	public static class Join_clauseContext extends ParserRuleContext {
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
	 
		public Join_clauseContext() { }
		public void copyFrom(Join_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InnerJoinContext extends Join_clauseContext {
		public TerminalNode K_ON() { return getToken(GremlinSqlParser.K_ON, 0); }
		public Join_onContext join_on() {
			return getRuleContext(Join_onContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INNER() { return getToken(GremlinSqlParser.K_INNER, 0); }
		public TerminalNode K_JOIN() { return getToken(GremlinSqlParser.K_JOIN, 0); }
		public InnerJoinContext(Join_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterInnerJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitInnerJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitInnerJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OuterJoinContext extends Join_clauseContext {
		public TerminalNode K_ON() { return getToken(GremlinSqlParser.K_ON, 0); }
		public Join_onContext join_on() {
			return getRuleContext(Join_onContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_OUTER() { return getToken(GremlinSqlParser.K_OUTER, 0); }
		public TerminalNode K_JOIN() { return getToken(GremlinSqlParser.K_JOIN, 0); }
		public OuterJoinContext(Join_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterOuterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitOuterJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitOuterJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_join_clause);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case K_INNER:
				_localctx = new InnerJoinContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45); match(K_INNER);
				setState(46); match(K_JOIN);
				setState(47); table_name();
				setState(48); match(K_ON);
				setState(49); join_on();
				}
				break;
			case K_OUTER:
				_localctx = new OuterJoinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51); match(K_OUTER);
				setState(52); match(K_JOIN);
				setState(53); table_name();
				setState(54); match(K_ON);
				setState(55); join_on();
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

	public static class Join_onContext extends ParserRuleContext {
		public Edge_label_nameContext edge_label_name() {
			return getRuleContext(Edge_label_nameContext.class,0);
		}
		public Join_table_from_nameContext join_table_from_name() {
			return getRuleContext(Join_table_from_nameContext.class,0);
		}
		public Join_onContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_on; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterJoin_on(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitJoin_on(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitJoin_on(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_onContext join_on() throws RecognitionException {
		Join_onContext _localctx = new Join_onContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_join_on);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(2);
			setState(60); match(1);
			setState(61); join_table_from_name();
			setState(62); match(3);
			setState(63); match(6);
			setState(64); edge_label_name();
			setState(65); match(6);
			setState(66); match(K_GT);
			setState(67); match(1);
			setState(68); match(4);
			setState(69); match(3);
			setState(70); match(2);
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
	public static class WhereAndContext extends Where_clauseContext {
		public TerminalNode K_AND() { return getToken(GremlinSqlParser.K_AND, 0); }
		public List<Where_clauseContext> where_clause() {
			return getRuleContexts(Where_clauseContext.class);
		}
		public Where_clauseContext where_clause(int i) {
			return getRuleContext(Where_clauseContext.class,i);
		}
		public WhereAndContext(Where_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterWhereAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitWhereAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitWhereAnd(this);
			else return visitor.visitChildren(this);
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
	public static class WhereInContext extends Where_clauseContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(GremlinSqlParser.K_IN, 0); }
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public WhereInContext(Where_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterWhereIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitWhereIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitWhereIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		return where_clause(0);
	}

	private Where_clauseContext where_clause(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, _parentState);
		Where_clauseContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_where_clause, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new WhereCompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(73); table_name();
				setState(74); match(7);
				setState(75); column_name();
				setState(76);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_EQ) | (1L << K_NEQ) | (1L << K_GT) | (1L << K_GTE) | (1L << K_LT) | (1L << K_LTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(77); literal_value();
				}
				break;

			case 2:
				{
				_localctx = new WhereInContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79); table_name();
				setState(80); match(7);
				setState(81); column_name();
				setState(82); match(K_IN);
				setState(83); match(1);
				setState(84); literal_value();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==5) {
					{
					{
					setState(85); match(5);
					setState(86); literal_value();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92); match(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new WhereAndContext(new Where_clauseContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_where_clause);
					setState(96);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(97); match(K_AND);
					setState(98); where_clause(2);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 10, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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

	public static class Edge_label_nameContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_IDENTIFIER() { return getToken(GremlinSqlParser.UNQUOTED_IDENTIFIER, 0); }
		public Edge_label_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_label_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterEdge_label_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitEdge_label_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitEdge_label_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_label_nameContext edge_label_name() throws RecognitionException {
		Edge_label_nameContext _localctx = new Edge_label_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_edge_label_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(UNQUOTED_IDENTIFIER);
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

	public static class Join_table_from_nameContext extends ParserRuleContext {
		public TerminalNode UNQUOTED_IDENTIFIER() { return getToken(GremlinSqlParser.UNQUOTED_IDENTIFIER, 0); }
		public Join_table_from_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_table_from_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterJoin_table_from_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitJoin_table_from_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitJoin_table_from_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_table_from_nameContext join_table_from_name() throws RecognitionException {
		Join_table_from_nameContext _localctx = new Join_table_from_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_join_table_from_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(UNQUOTED_IDENTIFIER);
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
		enterRule(_localctx, 16, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); any_name();
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
		enterRule(_localctx, 18, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); any_name();
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
		enterRule(_localctx, 20, RULE_any_name);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); match(STRING_LITERAL);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); match(1);
				setState(117); any_name();
				setState(118); match(3);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return where_clause_sempred((Where_clauseContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean where_clause_sempred(Where_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\3\3\3\3"+
		"\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\5\6a\n\6\3\6\3\6\3\6\7\6f\n\6\f\6\16"+
		"\6i\13\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f{\n\f\3\f\2\3\n\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\21\26\4\2"+
		"\f\17 !z\2\30\3\2\2\2\4\32\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\n`\3\2\2\2\f"+
		"j\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2\22p\3\2\2\2\24r\3\2\2\2\26z\3\2\2\2"+
		"\30\31\7\6\2\2\31\3\3\2\2\2\32\33\7\n\2\2\33 \5\2\2\2\34\35\7\7\2\2\35"+
		"\37\5\2\2\2\36\34\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2"+
		"\" \3\2\2\2#$\7\13\2\2$(\5\22\n\2%\'\5\6\4\2&%\3\2\2\2\'*\3\2\2\2(&\3"+
		"\2\2\2()\3\2\2\2)-\3\2\2\2*(\3\2\2\2+,\7\20\2\2,.\5\n\6\2-+\3\2\2\2-."+
		"\3\2\2\2.\5\3\2\2\2/\60\7\33\2\2\60\61\7\34\2\2\61\62\5\22\n\2\62\63\7"+
		"\35\2\2\63\64\5\b\5\2\64<\3\2\2\2\65\66\7\32\2\2\66\67\7\34\2\2\678\5"+
		"\22\n\289\7\35\2\29:\5\b\5\2:<\3\2\2\2;/\3\2\2\2;\65\3\2\2\2<\7\3\2\2"+
		"\2=>\7\4\2\2>?\7\3\2\2?@\5\20\t\2@A\7\5\2\2AB\7\b\2\2BC\5\16\b\2CD\7\b"+
		"\2\2DE\7\23\2\2EF\7\3\2\2FG\7\6\2\2GH\7\5\2\2HI\7\4\2\2I\t\3\2\2\2JK\b"+
		"\6\1\2KL\5\22\n\2LM\7\t\2\2MN\5\24\13\2NO\t\2\2\2OP\5\f\7\2Pa\3\2\2\2"+
		"QR\5\22\n\2RS\7\t\2\2ST\5\24\13\2TU\7\27\2\2UV\7\3\2\2V[\5\f\7\2WX\7\7"+
		"\2\2XZ\5\f\7\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3"+
		"\2\2\2^_\7\5\2\2_a\3\2\2\2`J\3\2\2\2`Q\3\2\2\2ag\3\2\2\2bc\f\3\2\2cd\7"+
		"\30\2\2df\5\n\6\4eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\13\3\2\2\2"+
		"ig\3\2\2\2jk\t\3\2\2k\r\3\2\2\2lm\7\36\2\2m\17\3\2\2\2no\7\36\2\2o\21"+
		"\3\2\2\2pq\5\26\f\2q\23\3\2\2\2rs\5\26\f\2s\25\3\2\2\2t{\7\37\2\2u{\7"+
		" \2\2vw\7\3\2\2wx\5\26\f\2xy\7\5\2\2y{\3\2\2\2zt\3\2\2\2zu\3\2\2\2zv\3"+
		"\2\2\2{\27\3\2\2\2\n (-;[`gz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}