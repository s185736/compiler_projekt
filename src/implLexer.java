// Generated from impl.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, RESET=7, OP=8, NOT=9, 
		PIL=10, ASSIGN=11, OR_OP=12, AND_OP=13, NUMBER=14, STRING=15, ALPHA=16, 
		ID=17, HVIDRUM=18, KOMMENTAR=19, MULTILINECOMMENTS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "RESET", "OP", "NOT", 
			"PIL", "ASSIGN", "OR_OP", "AND_OP", "NUMBER", "STRING", "ALPHA", "ID", 
			"HVIDRUM", "KOMMENTAR", "MULTILINECOMMENTS"
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tC\n\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\7\17S\n"+
		"\17\f\17\16\17V\13\17\3\20\3\20\3\20\3\21\7\21\\\n\21\f\21\16\21_\13\21"+
		"\3\22\3\22\7\22c\n\22\f\22\16\22f\13\22\3\23\6\23i\n\23\r\23\16\23j\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\7\24s\n\24\f\24\16\24v\13\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\7\25\u0080\n\25\f\25\16\25\u0083\13\25\3"+
		"\25\3\25\3\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\13\5\2##>"+
		">@@\3\2\62;\13\2C\\aac|\u00a7\u00a8\u00ba\u00ba\u00c5\u00c5\u02de\u02de"+
		"\u2022\u2022\u2028\u2028\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\f\"\"\3\2\f"+
		"\f\3\2\61\61\3\2,,\2\u0091\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2"+
		"\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17"+
		"\67\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27I\3\2\2\2\31K\3\2\2"+
		"\2\33N\3\2\2\2\35T\3\2\2\2\37W\3\2\2\2!]\3\2\2\2#`\3\2\2\2%h\3\2\2\2\'"+
		"n\3\2\2\2)y\3\2\2\2+,\7*\2\2,\4\3\2\2\2-.\7+\2\2.\6\3\2\2\2/\60\7,\2\2"+
		"\60\b\3\2\2\2\61\62\7\61\2\2\62\n\3\2\2\2\63\64\7-\2\2\64\f\3\2\2\2\65"+
		"\66\7/\2\2\66\16\3\2\2\2\678\7T\2\289\7g\2\29:\7u\2\2:;\7g\2\2;<\7v\2"+
		"\2<\20\3\2\2\2=>\7?\2\2>C\7?\2\2?@\7#\2\2@C\7?\2\2AC\t\2\2\2B=\3\2\2\2"+
		"B?\3\2\2\2BA\3\2\2\2C\22\3\2\2\2DE\7#\2\2E\24\3\2\2\2FG\7/\2\2GH\7@\2"+
		"\2H\26\3\2\2\2IJ\7?\2\2J\30\3\2\2\2KL\7~\2\2LM\7~\2\2M\32\3\2\2\2NO\7"+
		"(\2\2OP\7(\2\2P\34\3\2\2\2QS\t\3\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2U\36\3\2\2\2VT\3\2\2\2WX\7\60\2\2XY\5!\21\2Y \3\2\2\2Z\\\t\4\2\2"+
		"[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\"\3\2\2\2_]\3\2\2\2`d\t\5\2"+
		"\2ac\t\6\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e$\3\2\2\2fd\3\2\2"+
		"\2gi\t\7\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\23"+
		"\2\2m&\3\2\2\2no\7\61\2\2op\7\61\2\2pt\3\2\2\2qs\n\b\2\2rq\3\2\2\2sv\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\b\24\2\2x(\3\2\2\2yz"+
		"\7\61\2\2z{\7,\2\2{\u0081\3\2\2\2|}\7,\2\2}\u0080\n\t\2\2~\u0080\n\n\2"+
		"\2\177|\3\2\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7,"+
		"\2\2\u0085\u0086\7\61\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\25\2\2\u0088"+
		"*\3\2\2\2\13\2BT]djt\177\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}