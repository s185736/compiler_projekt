package task;// Generated from C:/Users/azmi_/Documents/GitHub/02332_compiler/compiler_projekt/src\impl.g4 by ANTLR 4.10.1
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
		RESET=1, OP=2, NOT=3, PUNKTUM=4, PIL=5, ASSIGN=6, OR_OP=7, AND_OP=8, NUMBER=9, 
		STRING=10, ALPHA=11, ID=12, WS=13;
	public static final int
		RULE_start = 0, RULE_latchdec = 1, RULE_updateDecl = 2, RULE_simInp = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "latchdec", "updateDecl", "simInp", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Reset'", null, "'!'", "'.'", "'->'", "'='", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RESET", "OP", "NOT", "PUNKTUM", "PIL", "ASSIGN", "OR_OP", "AND_OP", 
			"NUMBER", "STRING", "ALPHA", "ID", "WS"
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
			if ( listener instanceof implListener) ((implListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener) ((implListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor) return ((implVisitor<? extends T>)visitor).visitStart(this);
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
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESET) | (1L << STRING) | (1L << ALPHA))) != 0)) {
				{
				setState(16);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(10);
					match(ALPHA);
					}
					break;
				case 2:
					{
					setState(11);
					match(STRING);
					}
					break;
				case 3:
					{
					setState(12);
					match(RESET);
					}
					break;
				case 4:
					{
					setState(13);
					latchdec();
					}
					break;
				case 5:
					{
					setState(14);
					updateDecl();
					}
					break;
				case 6:
					{
					setState(15);
					simInp();
					}
					break;
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
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
			if ( listener instanceof implListener) ((implListener)listener).enterLatchdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener) ((implListener)listener).exitLatchdec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor) return ((implVisitor<? extends T>)visitor).visitLatchdec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchdecContext latchdec() throws RecognitionException {
		LatchdecContext _localctx = new LatchdecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_latchdec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(STRING);
			setState(24);
			match(ALPHA);
			setState(25);
			match(PIL);
			setState(26);
			match(ALPHA);
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
			if ( listener instanceof implListener) ((implListener)listener).enterUpdateDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener) ((implListener)listener).exitUpdateDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor) return ((implVisitor<? extends T>)visitor).visitUpdateDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateDeclContext updateDecl() throws RecognitionException {
		UpdateDeclContext _localctx = new UpdateDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_updateDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(ALPHA);
			setState(29);
			match(ASSIGN);
			{
			setState(30);
			expr();
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
		public TerminalNode RESET() { return getToken(implParser.RESET, 0); }
		public TerminalNode ASSIGN() { return getToken(implParser.ASSIGN, 0); }
		public TerminalNode NUMBER() { return getToken(implParser.NUMBER, 0); }
		public SimInpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simInp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener) ((implListener)listener).enterSimInp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener) ((implListener)listener).exitSimInp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor) return ((implVisitor<? extends T>)visitor).visitSimInp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimInpContext simInp() throws RecognitionException {
		SimInpContext _localctx = new SimInpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simInp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(RESET);
			setState(33);
			match(ASSIGN);
			setState(34);
			match(NUMBER);
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
	public static class ALPHA1Context extends ExprContext {
		public TerminalNode ALPHA() { return getToken(implParser.ALPHA, 0); }
		public TerminalNode ASSIGN() { return getToken(implParser.ASSIGN, 0); }
		public ALPHA1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener) ((implListener)listener).enterALPHA1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener) ((implListener)listener).exitALPHA1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor) return ((implVisitor<? extends T>)visitor).visitALPHA1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			_localctx = new ALPHA1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ALPHA);
			setState(37);
			match(ASSIGN);
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
		"\u0004\u0001\r(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u0011\b\u0000\n\u0000\f\u0000\u0014\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000(\u0000\u0012\u0001\u0000"+
		"\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u001c\u0001\u0000"+
		"\u0000\u0000\u0006 \u0001\u0000\u0000\u0000\b$\u0001\u0000\u0000\u0000"+
		"\n\u0011\u0005\u000b\u0000\u0000\u000b\u0011\u0005\n\u0000\u0000\f\u0011"+
		"\u0005\u0001\u0000\u0000\r\u0011\u0003\u0002\u0001\u0000\u000e\u0011\u0003"+
		"\u0004\u0002\u0000\u000f\u0011\u0003\u0006\u0003\u0000\u0010\n\u0001\u0000"+
		"\u0000\u0000\u0010\u000b\u0001\u0000\u0000\u0000\u0010\f\u0001\u0000\u0000"+
		"\u0000\u0010\r\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000"+
		"\u0010\u000f\u0001\u0000\u0000\u0000\u0011\u0014\u0001\u0000\u0000\u0000"+
		"\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000"+
		"\u0013\u0015\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0005\u0000\u0000\u0001\u0016\u0001\u0001\u0000\u0000\u0000"+
		"\u0017\u0018\u0005\n\u0000\u0000\u0018\u0019\u0005\u000b\u0000\u0000\u0019"+
		"\u001a\u0005\u0005\u0000\u0000\u001a\u001b\u0005\u000b\u0000\u0000\u001b"+
		"\u0003\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u000b\u0000\u0000\u001d"+
		"\u001e\u0005\u0006\u0000\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f\u0005"+
		"\u0001\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000!\"\u0005\u0006\u0000"+
		"\u0000\"#\u0005\t\u0000\u0000#\u0007\u0001\u0000\u0000\u0000$%\u0005\u000b"+
		"\u0000\u0000%&\u0005\u0006\u0000\u0000&\t\u0001\u0000\u0000\u0000\u0002"+
		"\u0010\u0012";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}