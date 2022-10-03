// Generated from C:/Users/azmi_/Documents/GitHub/02332_compiler/compiler_projekt/src\impl.g4 by ANTLR 4.10.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		FLOAT=10, ALL_OPERATORS=11, OBRACE=12, CBRACE=13, PLUS=14, MINUS=15, MULT=16, 
		DIV=17, MOD=18, NOT=19, OR_OP=20, AND_OP=21, MULTI=22, OPERATOR=23, FALSE=24, 
		TRUE=25, WHITESPACE=26, COMMENT=27, COMMENT2=28, NUM=29;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_command = 2, RULE_expr = 3, RULE_condition = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "command", "expr", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'output'", "'while'", "'('", "')'", "'if'", "'else'", 
			null, null, null, "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ID", "FLOAT", 
			"ALL_OPERATORS", "OBRACE", "CBRACE", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "NOT", "OR_OP", "AND_OP", "MULTI", "OPERATOR", "FALSE", "TRUE", 
			"WHITESPACE", "COMMENT", "COMMENT2", "NUM"
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
		public CommandContext command;
		public List<CommandContext> cs = new ArrayList<CommandContext>();
		public TerminalNode EOF() { return getToken(implParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
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
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << ID))) != 0)) {
				{
				{
				setState(10);
				((StartContext)_localctx).command = command();
				((StartContext)_localctx).cs.add(((StartContext)_localctx).command);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
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

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleCommandsContext extends ProgramContext {
		public CommandContext command;
		public List<CommandContext> cs = new ArrayList<CommandContext>();
		public TerminalNode OBRACE() { return getToken(implParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(implParser.CBRACE, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public MultipleCommandsContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterMultipleCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitMultipleCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitMultipleCommands(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleCommandContext extends ProgramContext {
		public CommandContext c;
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public SingleCommandContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSingleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSingleCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__6:
			case ID:
				_localctx = new SingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				((SingleCommandContext)_localctx).c = command();
				}
				break;
			case OBRACE:
				_localctx = new MultipleCommandsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(OBRACE);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << ID))) != 0)) {
					{
					{
					setState(20);
					((MultipleCommandsContext)_localctx).command = command();
					((MultipleCommandsContext)_localctx).cs.add(((MultipleCommandsContext)_localctx).command);
					}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(26);
				match(CBRACE);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends CommandContext {
		public Token x;
		public ExprContext e;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends CommandContext {
		public ConditionContext c1;
		public ProgramContext p1;
		public ProgramContext p2;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public IfStatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputContext extends CommandContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatContext extends CommandContext {
		public ConditionContext c;
		public ProgramContext p;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public IfStatContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends CommandContext {
		public ConditionContext c;
		public ProgramContext p;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public WhileLoopContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				((AssignmentContext)_localctx).x = match(ID);
				setState(30);
				match(T__0);
				setState(31);
				((AssignmentContext)_localctx).e = expr(0);
				setState(32);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__2);
				setState(35);
				((OutputContext)_localctx).e = expr(0);
				setState(36);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(T__3);
				setState(39);
				match(T__4);
				setState(40);
				((WhileLoopContext)_localctx).c = condition();
				setState(41);
				match(T__5);
				setState(42);
				((WhileLoopContext)_localctx).p = program();
				}
				break;
			case 4:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(T__6);
				setState(45);
				match(T__4);
				setState(46);
				((IfStatContext)_localctx).c = condition();
				setState(47);
				match(T__5);
				setState(48);
				((IfStatContext)_localctx).p = program();
				}
				break;
			case 5:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(T__6);
				setState(51);
				match(T__4);
				setState(52);
				((IfStatementContext)_localctx).c1 = condition();
				setState(53);
				match(T__5);
				setState(54);
				((IfStatementContext)_localctx).p1 = program();
				setState(55);
				match(T__7);
				setState(56);
				((IfStatementContext)_localctx).p2 = program();
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
	public static class OPContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(implParser.OPERATOR, 0); }
		public OPContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOP(this);
			else return visitor.visitChildren(this);
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
	public static class VariableContext extends ExprContext {
		public Token x;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends ExprContext {
		public Token op;
		public TerminalNode TRUE() { return getToken(implParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(implParser.FALSE, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTI() { return getToken(implParser.MULTI, 0); }
		public MULContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterMUL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitMUL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitMUL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends ExprContext {
		public Token c;
		public TerminalNode FLOAT() { return getToken(implParser.FLOAT, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(implParser.NUM, 0); }
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitNum(this);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61);
				match(NUM);
				}
				break;
			case FLOAT:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				((ConstantContext)_localctx).c = match(FLOAT);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case T__4:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(T__4);
				setState(65);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(66);
				match(T__5);
				}
				break;
			case FALSE:
			case TRUE:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				((BooleanContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
					((BooleanContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MULContext(new ExprContext(_parentctx, _parentState));
						((MULContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(71);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(72);
						((MULContext)_localctx).op = match(MULTI);
						setState(73);
						((MULContext)_localctx).e2 = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new OPContext(new ExprContext(_parentctx, _parentState));
						((OPContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(75);
						((OPContext)_localctx).op = match(OPERATOR);
						setState(76);
						((OPContext)_localctx).e2 = expr(7);
						}
						break;
					}
					} 
				}
				setState(81);
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
		public ExprContext e1;
		public ExprContext e2;
		public TerminalNode OR_OP() { return getToken(implParser.OR_OP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
	public static class ANDContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public TerminalNode AND_OP() { return getToken(implParser.AND_OP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
	public static class ALLOPERATORSContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public TerminalNode ALL_OPERATORS() { return getToken(implParser.ALL_OPERATORS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ALLOPERATORSContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterALLOPERATORS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitALLOPERATORS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitALLOPERATORS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ALLOPERATORSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				((ALLOPERATORSContext)_localctx).e1 = expr(0);
				setState(83);
				match(ALL_OPERATORS);
				setState(84);
				((ALLOPERATORSContext)_localctx).e2 = expr(0);
				}
				break;
			case 2:
				_localctx = new ANDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((ANDContext)_localctx).e1 = expr(0);
				setState(87);
				match(AND_OP);
				setState(88);
				((ANDContext)_localctx).e2 = expr(0);
				}
				break;
			case 3:
				_localctx = new ORContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				((ORContext)_localctx).e1 = expr(0);
				setState(91);
				match(OR_OP);
				setState(92);
				((ORContext)_localctx).e2 = expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0016\b\u0001"+
		"\n\u0001\f\u0001\u0019\t\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002;\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003F\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004_\b\u0004\u0001"+
		"\u0004\u0000\u0001\u0006\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001"+
		"\u0000\u0018\u0019j\u0000\r\u0001\u0000\u0000\u0000\u0002\u001b\u0001"+
		"\u0000\u0000\u0000\u0004:\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000"+
		"\u0000\b^\u0001\u0000\u0000\u0000\n\f\u0003\u0004\u0002\u0000\u000b\n"+
		"\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001"+
		"\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000"+
		"\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0000\u0000"+
		"\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u001c\u0003\u0004\u0002"+
		"\u0000\u0013\u0017\u0005\f\u0000\u0000\u0014\u0016\u0003\u0004\u0002\u0000"+
		"\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000"+
		"\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u001a\u001c\u0005\r\u0000\u0000\u001b\u0012\u0001\u0000\u0000\u0000\u001b"+
		"\u0013\u0001\u0000\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0005\t\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f "+
		"\u0003\u0006\u0003\u0000 !\u0005\u0002\u0000\u0000!;\u0001\u0000\u0000"+
		"\u0000\"#\u0005\u0003\u0000\u0000#$\u0003\u0006\u0003\u0000$%\u0005\u0002"+
		"\u0000\u0000%;\u0001\u0000\u0000\u0000&\'\u0005\u0004\u0000\u0000\'(\u0005"+
		"\u0005\u0000\u0000()\u0003\b\u0004\u0000)*\u0005\u0006\u0000\u0000*+\u0003"+
		"\u0002\u0001\u0000+;\u0001\u0000\u0000\u0000,-\u0005\u0007\u0000\u0000"+
		"-.\u0005\u0005\u0000\u0000./\u0003\b\u0004\u0000/0\u0005\u0006\u0000\u0000"+
		"01\u0003\u0002\u0001\u00001;\u0001\u0000\u0000\u000023\u0005\u0007\u0000"+
		"\u000034\u0005\u0005\u0000\u000045\u0003\b\u0004\u000056\u0005\u0006\u0000"+
		"\u000067\u0003\u0002\u0001\u000078\u0005\b\u0000\u000089\u0003\u0002\u0001"+
		"\u00009;\u0001\u0000\u0000\u0000:\u001d\u0001\u0000\u0000\u0000:\"\u0001"+
		"\u0000\u0000\u0000:&\u0001\u0000\u0000\u0000:,\u0001\u0000\u0000\u0000"+
		":2\u0001\u0000\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0006\u0003"+
		"\uffff\uffff\u0000=F\u0005\u001d\u0000\u0000>F\u0005\n\u0000\u0000?F\u0005"+
		"\t\u0000\u0000@A\u0005\u0005\u0000\u0000AB\u0003\u0006\u0003\u0000BC\u0005"+
		"\u0006\u0000\u0000CF\u0001\u0000\u0000\u0000DF\u0007\u0000\u0000\u0000"+
		"E<\u0001\u0000\u0000\u0000E>\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000"+
		"\u0000E@\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FO\u0001\u0000"+
		"\u0000\u0000GH\n\u0007\u0000\u0000HI\u0005\u0016\u0000\u0000IN\u0003\u0006"+
		"\u0003\bJK\n\u0006\u0000\u0000KL\u0005\u0017\u0000\u0000LN\u0003\u0006"+
		"\u0003\u0007MG\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"P\u0007\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0003\u0006"+
		"\u0003\u0000ST\u0005\u000b\u0000\u0000TU\u0003\u0006\u0003\u0000U_\u0001"+
		"\u0000\u0000\u0000VW\u0003\u0006\u0003\u0000WX\u0005\u0015\u0000\u0000"+
		"XY\u0003\u0006\u0003\u0000Y_\u0001\u0000\u0000\u0000Z[\u0003\u0006\u0003"+
		"\u0000[\\\u0005\u0014\u0000\u0000\\]\u0003\u0006\u0003\u0000]_\u0001\u0000"+
		"\u0000\u0000^R\u0001\u0000\u0000\u0000^V\u0001\u0000\u0000\u0000^Z\u0001"+
		"\u0000\u0000\u0000_\t\u0001\u0000\u0000\u0000\b\r\u0017\u001b:EMO^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}