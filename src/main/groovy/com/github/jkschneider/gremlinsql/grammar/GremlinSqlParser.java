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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, STRING_LITERAL=8, 
		NUMERIC_LITERAL=9, IDENTIFIER=10, K_ALL=11, K_DISTINCT=12, K_AS=13, K_FROM=14, 
		K_SELECT=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "'!='", "')'", "'*'", "','", "'='", "'.'", "STRING_LITERAL", 
		"NUMERIC_LITERAL", "IDENTIFIER", "K_ALL", "K_DISTINCT", "K_AS", "K_FROM", 
		"K_SELECT"
	};
	public static final int
		RULE_table = 0, RULE_result_column = 1, RULE_select_core = 2, RULE_expr = 3, 
		RULE_table_alias = 4, RULE_table_name = 5, RULE_column_name = 6, RULE_column_alias = 7, 
		RULE_any_name = 8, RULE_literal_value = 9, RULE_keyword = 10;
	public static final String[] ruleNames = {
		"table", "result_column", "select_core", "expr", "table_alias", "table_name", 
		"column_name", "column_alias", "any_name", "literal_value", "keyword"
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
	public static class TableContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(GremlinSqlParser.K_AS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); table_name();
			setState(27);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << STRING_LITERAL) | (1L << IDENTIFIER) | (1L << K_ALL) | (1L << K_DISTINCT) | (1L << K_AS) | (1L << K_FROM) | (1L << K_SELECT))) != 0)) {
				{
				setState(24);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(23); match(K_AS);
					}
					break;
				}
				setState(26); table_alias();
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

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(GremlinSqlParser.K_AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
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
		enterRule(_localctx, 2, RULE_result_column);
		int _la;
		try {
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29); match(4);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30); table_name();
				setState(31); match(7);
				setState(32); match(4);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34); expr(0);
				setState(39);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_LITERAL) | (1L << IDENTIFIER) | (1L << K_AS))) != 0)) {
					{
					setState(36);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(35); match(K_AS);
						}
					}

					setState(38); column_alias();
					}
				}

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

	public static class Select_coreContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_SELECT() { return getToken(GremlinSqlParser.K_SELECT, 0); }
		public TerminalNode K_FROM() { return getToken(GremlinSqlParser.K_FROM, 0); }
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_core);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(K_SELECT);
			setState(44); result_column();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(45); match(5);
				setState(46); result_column();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52); match(K_FROM);
			setState(53); table();
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(56); literal_value();
				}
				break;

			case 2:
				{
				setState(60);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(57); table_name();
					setState(58); match(7);
					}
					break;
				}
				setState(62); column_name();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(65);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(66);
					_la = _input.LA(1);
					if ( !(_la==2 || _la==6) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(67); expr(2);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); any_name();
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
		enterRule(_localctx, 10, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); any_name();
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
		enterRule(_localctx, 12, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); any_name();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(GremlinSqlParser.STRING_LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GremlinSqlParser.IDENTIFIER, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==IDENTIFIER) ) {
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

	public static class Any_nameContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_any_name);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(IDENTIFIER);
				}
				break;
			case K_ALL:
			case K_DISTINCT:
			case K_AS:
			case K_FROM:
			case K_SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(82); keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(83); match(STRING_LITERAL);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 4);
				{
				setState(84); match(1);
				setState(85); any_name();
				setState(86); match(3);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(GremlinSqlParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(GremlinSqlParser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 18, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==NUMERIC_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(GremlinSqlParser.K_AS, 0); }
		public TerminalNode K_ALL() { return getToken(GremlinSqlParser.K_ALL, 0); }
		public TerminalNode K_DISTINCT() { return getToken(GremlinSqlParser.K_DISTINCT, 0); }
		public TerminalNode K_SELECT() { return getToken(GremlinSqlParser.K_SELECT, 0); }
		public TerminalNode K_FROM() { return getToken(GremlinSqlParser.K_FROM, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GremlinSqlListener ) ((GremlinSqlListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GremlinSqlVisitor ) return ((GremlinSqlVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ALL) | (1L << K_DISTINCT) | (1L << K_AS) | (1L << K_FROM) | (1L << K_SELECT))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\5\2\33\n\2\3\2\5\2\36\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\'\n\3\3\3\5\3*\n\3\5\3,\n\3\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4\65"+
		"\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\5\5\5B\n\5\3\5\3\5\3"+
		"\5\7\5G\n\5\f\5\16\5J\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n[\n\n\3\13\3\13\3\f\3\f\3\f\2\3\b\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\6\4\2\4\4\b\b\4\2\n\n\f\f\3\2\n\13\3\2\r\21b\2\30\3\2\2"+
		"\2\4+\3\2\2\2\6-\3\2\2\2\bA\3\2\2\2\nK\3\2\2\2\fM\3\2\2\2\16O\3\2\2\2"+
		"\20Q\3\2\2\2\22Z\3\2\2\2\24\\\3\2\2\2\26^\3\2\2\2\30\35\5\f\7\2\31\33"+
		"\7\17\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\36\5\n\6\2\35\32"+
		"\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37,\7\6\2\2 !\5\f\7\2!\"\7\t\2\2\""+
		"#\7\6\2\2#,\3\2\2\2$)\5\b\5\2%\'\7\17\2\2&%\3\2\2\2&\'\3\2\2\2\'(\3\2"+
		"\2\2(*\5\20\t\2)&\3\2\2\2)*\3\2\2\2*,\3\2\2\2+\37\3\2\2\2+ \3\2\2\2+$"+
		"\3\2\2\2,\5\3\2\2\2-.\7\21\2\2.\63\5\4\3\2/\60\7\7\2\2\60\62\5\4\3\2\61"+
		"/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63"+
		"\3\2\2\2\66\67\7\20\2\2\678\5\2\2\28\7\3\2\2\29:\b\5\1\2:B\5\24\13\2;"+
		"<\5\f\7\2<=\7\t\2\2=?\3\2\2\2>;\3\2\2\2>?\3\2\2\2?@\3\2\2\2@B\5\16\b\2"+
		"A9\3\2\2\2A>\3\2\2\2BH\3\2\2\2CD\f\3\2\2DE\t\2\2\2EG\5\b\5\4FC\3\2\2\2"+
		"GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JH\3\2\2\2KL\5\22\n\2L\13\3\2"+
		"\2\2MN\5\22\n\2N\r\3\2\2\2OP\5\22\n\2P\17\3\2\2\2QR\t\3\2\2R\21\3\2\2"+
		"\2S[\7\f\2\2T[\5\26\f\2U[\7\n\2\2VW\7\3\2\2WX\5\22\n\2XY\7\5\2\2Y[\3\2"+
		"\2\2ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2[\23\3\2\2\2\\]\t\4\2\2]\25"+
		"\3\2\2\2^_\t\5\2\2_\27\3\2\2\2\f\32\35&)+\63>AHZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}