// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, RESET=7, OP=8, NOT=9, 
		PIL=10, ASSIGN=11, OR_OP=12, AND_OP=13, NUMBER=14, STRING=15, ALPHA=16, 
		ID=17, HVIDRUM=18, KOMMENTAR=19, MULTILINECOMMENTS=20;
	public static final int
		RULE_start = 0, RULE_latchdec = 1, RULE_updateDecl = 2, RULE_simInp = 3, 
		RULE_expr = 4, RULE_condition = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "latchdec", "updateDecl", "simInp", "expr", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'Reset'", null, "'!'", 
			"'->'", "'='", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "RESET", "OP", "NOT", "PIL", 
			"ASSIGN", "OR_OP", "AND_OP", "NUMBER", "STRING", "ALPHA", "ID", "HVIDRUM", 
			"KOMMENTAR", "MULTILINECOMMENTS"
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

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public implParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {

		public List<StartContext> as = new ArrayList<StartContext>();

		public TerminalNode EOF() { return getToken(implParser.EOF, 0); }
		public List<TerminalNode> ALPHA() { return getTokens(implParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(implParser.ALPHA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(implParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(implParser.STRING, i);
		}
		public List<TerminalNode> RESET() { return getTokens(implParser.RESET); }
		public TerminalNode RESET(int i) {
			return getToken(implParser.RESET, i);
		}
		public List<LatchdecContext> latchdec() {
			return getRuleContexts(LatchdecContext.class);
		}
		public LatchdecContext latchdec(int i) {
			return getRuleContext(LatchdecContext.class,i);
		}
		public List<UpdateDeclContext> updateDecl() {
			return getRuleContexts(UpdateDeclContext.class);
		}
		public UpdateDeclContext updateDecl(int i) {
			return getRuleContext(UpdateDeclContext.class,i);
		}
		public List<SimInpContext> simInp() {
			return getRuleContexts(SimInpContext.class);
		}
		public SimInpContext simInp(int i) {
			return getRuleContext(SimInpContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESET) | (1L << OP) | (1L << OR_OP) | (1L << AND_OP) | (1L << NUMBER) | (1L << STRING) | (1L << ALPHA))) != 0)) {
				{
				setState(18);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(12);
					match(ALPHA);
					}
					break;
				case 2:
					{
					setState(13);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(14);
					match(RESET);
					}
					break;
				case 4:
					{
					setState(15);
					latchdec();
					}
					break;
				case 5:
					{
					setState(16);
					updateDecl();
					}
					break;
				case 6:
					{
					setState(17);
					simInp();
					}
					break;
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(EOF);
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

	public static class LatchdecContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(implParser.STRING, 0); }
		public List<TerminalNode> ALPHA() { return getTokens(implParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(implParser.ALPHA, i);
		}
		public TerminalNode PIL() { return getToken(implParser.PIL, 0); }
		public LatchdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latchdec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLatchdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLatchdec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLatchdec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchdecContext latchdec() throws RecognitionException {
		LatchdecContext _localctx = new LatchdecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_latchdec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(25);
			match(STRING);
			setState(26);
			match(ALPHA);
			setState(27);
			match(PIL);
			setState(28);
			match(ALPHA);
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

	public static class UpdateDeclContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(implParser.ALPHA, 0); }
		public TerminalNode ASSIGN() { return getToken(implParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UpdateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterUpdateDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitUpdateDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitUpdateDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateDeclContext updateDecl() throws RecognitionException {
		UpdateDeclContext _localctx = new UpdateDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_updateDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(30);
			match(ALPHA);
			setState(31);
			match(ASSIGN);
			setState(32);
			expr(0);
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

	public static class SimInpContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(implParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(implParser.NUMBER, 0); }
		public SimInpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simInp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSimInp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSimInp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSimInp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimInpContext simInp() throws RecognitionException {
		SimInpContext _localctx = new SimInpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simInp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(34);
			condition();
			setState(35);
			match(ASSIGN);
			setState(36);
			match(NUMBER);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ALPHA3Context extends ExprContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ALPHA3Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterALPHA3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitALPHA3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitALPHA3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ALPHA2Context extends ExprContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND_OP() { return getToken(implParser.AND_OP, 0); }
		public ALPHA2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterALPHA2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitALPHA2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitALPHA2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ALPHA1Context extends ExprContext {
		public TerminalNode ALPHA() { return getToken(implParser.ALPHA, 0); }
		public ALPHA1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterALPHA1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitALPHA1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitALPHA1(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ALPHA1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				match(ALPHA);
				}
				break;
			case 2:
				{
				_localctx = new ALPHA2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				condition();
				setState(41);
				match(AND_OP);
				setState(42);
				condition();
				}
				break;
			case 3:
				{
				_localctx = new ALPHA3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				condition();
				}
				break;
			case 4:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(T__0);
				setState(46);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(47);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(57);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						((MulDivContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(52);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(53);
						((MulDivContext)_localctx).e2 = expr(3);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(55);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(56);
						((AddSubContext)_localctx).e2 = expr(2);
						}
						break;
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ORContext extends ConditionContext {
		public ExprContext e2;
		public ConditionContext c1;
		public Token or;
		public ConditionContext c2;
		public TerminalNode OR_OP() { return getToken(implParser.OR_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ConditionContext> cond() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext cond(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ORContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPR5Context extends ConditionContext {
		public TerminalNode NUMBER() { return getToken(implParser.NUMBER, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public EXPR5Context(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterEXPR5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitEXPR5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitEXPR5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ANDContext extends ConditionContext {
		public ExprContext e2;
		public ConditionContext c1;
		public Token an;
		public ConditionContext c2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND_OP() { return getToken(implParser.AND_OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ANDContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPR1Context extends ConditionContext {
		public TerminalNode OP() { return getToken(implParser.OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public EXPR1Context(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterEXPR1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitEXPR1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitEXPR1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPR4Context extends ConditionContext {
		public TerminalNode RESET() { return getToken(implParser.RESET, 0); }
		public EXPR4Context(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterEXPR4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitEXPR4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitEXPR4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EXPR3Context extends ConditionContext {
		public TerminalNode ALPHA() { return getToken(implParser.ALPHA, 0); }
		public EXPR3Context(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterEXPR3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitEXPR3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitEXPR3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP:
				_localctx = new EXPR1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(OP);
				setState(63);
				condition();
				}
				break;
			case AND_OP:
				_localctx = new ANDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(AND_OP);
				setState(65);
				((ANDContext)_localctx).e2 = expr(0);
				}
				break;
			case OR_OP:
				_localctx = new ORContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(OR_OP);
				setState(67);
				((ORContext)_localctx).e2 = expr(0);
				}
				break;
			case ALPHA:
				_localctx = new EXPR3Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(ALPHA);
				}
				break;
			case RESET:
				_localctx = new EXPR4Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(RESET);
				}
				break;
			case NUMBER:
				_localctx = new EXPR5Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				match(NUMBER);
				setState(71);
				condition();
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
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014K\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000\u0016\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u00042\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004:\b\u0004"+
		"\n\u0004\f\u0004=\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005I\b\u0005\u0001\u0005\u0000\u0001\b\u0006\u0000\u0002\u0004"+
		"\u0006\b\n\u0000\u0002\u0001\u0000\u0003\u0004\u0001\u0000\u0005\u0006"+
		"T\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000"+
		"\u0004\u001e\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000\b"+
		"1\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\f\u0013\u0005\u0010"+
		"\u0000\u0000\r\u0013\u0005\u000f\u0000\u0000\u000e\u0013\u0005\u0007\u0000"+
		"\u0000\u000f\u0013\u0003\u0002\u0001\u0000\u0010\u0013\u0003\u0004\u0002"+
		"\u0000\u0011\u0013\u0003\u0006\u0003\u0000\u0012\f\u0001\u0000\u0000\u0000"+
		"\u0012\r\u0001\u0000\u0000\u0000\u0012\u000e\u0001\u0000\u0000\u0000\u0012"+
		"\u000f\u0001\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012"+
		"\u0011\u0001\u0000\u0000\u0000\u0013\u0016\u0001\u0000\u0000\u0000\u0014"+
		"\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015"+
		"\u0017\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0005\u000f\u0000\u0000\u001a\u001b\u0005\u0010\u0000\u0000\u001b"+
		"\u001c\u0005\n\u0000\u0000\u001c\u001d\u0005\u0010\u0000\u0000\u001d\u0003"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0010\u0000\u0000\u001f \u0005"+
		"\u000b\u0000\u0000 !\u0003\b\u0004\u0000!\u0005\u0001\u0000\u0000\u0000"+
		"\"#\u0003\n\u0005\u0000#$\u0005\u000b\u0000\u0000$%\u0005\u000e\u0000"+
		"\u0000%\u0007\u0001\u0000\u0000\u0000&\'\u0006\u0004\uffff\uffff\u0000"+
		"\'2\u0005\u0010\u0000\u0000()\u0003\n\u0005\u0000)*\u0005\r\u0000\u0000"+
		"*+\u0003\n\u0005\u0000+2\u0001\u0000\u0000\u0000,2\u0003\n\u0005\u0000"+
		"-.\u0005\u0001\u0000\u0000./\u0003\b\u0004\u0000/0\u0005\u0002\u0000\u0000"+
		"02\u0001\u0000\u0000\u00001&\u0001\u0000\u0000\u00001(\u0001\u0000\u0000"+
		"\u00001,\u0001\u0000\u0000\u00001-\u0001\u0000\u0000\u00002;\u0001\u0000"+
		"\u0000\u000034\n\u0002\u0000\u000045\u0007\u0000\u0000\u00005:\u0003\b"+
		"\u0004\u000367\n\u0001\u0000\u000078\u0007\u0001\u0000\u00008:\u0003\b"+
		"\u0004\u000293\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u0000:=\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<\t\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>?\u0005\b\u0000"+
		"\u0000?I\u0003\n\u0005\u0000@A\u0005\r\u0000\u0000AI\u0003\b\u0004\u0000"+
		"BC\u0005\f\u0000\u0000CI\u0003\b\u0004\u0000DI\u0005\u0010\u0000\u0000"+
		"EI\u0005\u0007\u0000\u0000FG\u0005\u000e\u0000\u0000GI\u0003\n\u0005\u0000"+
		"H>\u0001\u0000\u0000\u0000H@\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000"+
		"\u0000HD\u0001\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000I\u000b\u0001\u0000\u0000\u0000\u0006\u0012\u001419;H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}