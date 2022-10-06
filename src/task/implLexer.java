package task;// Generated from C:/Users/azmi_/Documents/GitHub/02332_compiler/compiler_projekt/src\impl.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RESET=1, OP=2, NOT=3, PUNKTUM=4, PIL=5, ASSIGN=6, OR_OP=7, AND_OP=8, NUMBER=9, 
		STRING=10, ALPHA=11, ID=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RESET", "OP", "NOT", "PUNKTUM", "PIL", "ASSIGN", "OR_OP", "AND_OP", 
			"NUMBER", "STRING", "ALPHA", "ID", "WS"
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
		"\u0004\u0000\rS\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0004\b9\b\b\u000b\b\f\b:\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0005\nA\b\n\n\n\f\nD\t\n\u0001\u000b\u0001\u000b\u0005\u000bH\b\u000b"+
		"\n\u000b\f\u000bK\t\u000b\u0001\f\u0004\fN\b\f\u000b\f\f\fO\u0001\f\u0001"+
		"\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u0001\u0000\u0006\u0003\u0000!!<<>>\u0001\u000009\t\u0000AZ__az\u00a5"+
		"\u00a6\u00b8\u00b8\u00c3\u00c3\u02dc\u02dc\u2020\u2020\u2026\u2026\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  X\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000"+
		"\u0005(\u0001\u0000\u0000\u0000\u0007*\u0001\u0000\u0000\u0000\t,\u0001"+
		"\u0000\u0000\u0000\u000b/\u0001\u0000\u0000\u0000\r1\u0001\u0000\u0000"+
		"\u0000\u000f4\u0001\u0000\u0000\u0000\u00118\u0001\u0000\u0000\u0000\u0013"+
		"<\u0001\u0000\u0000\u0000\u0015B\u0001\u0000\u0000\u0000\u0017E\u0001"+
		"\u0000\u0000\u0000\u0019M\u0001\u0000\u0000\u0000\u001b\u001c\u0005R\u0000"+
		"\u0000\u001c\u001d\u0005e\u0000\u0000\u001d\u001e\u0005s\u0000\u0000\u001e"+
		"\u001f\u0005e\u0000\u0000\u001f \u0005t\u0000\u0000 \u0002\u0001\u0000"+
		"\u0000\u0000!\"\u0005=\u0000\u0000\"\'\u0005=\u0000\u0000#$\u0005!\u0000"+
		"\u0000$\'\u0005=\u0000\u0000%\'\u0007\u0000\u0000\u0000&!\u0001\u0000"+
		"\u0000\u0000&#\u0001\u0000\u0000\u0000&%\u0001\u0000\u0000\u0000\'\u0004"+
		"\u0001\u0000\u0000\u0000()\u0005!\u0000\u0000)\u0006\u0001\u0000\u0000"+
		"\u0000*+\u0005.\u0000\u0000+\b\u0001\u0000\u0000\u0000,-\u0005-\u0000"+
		"\u0000-.\u0005>\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005=\u0000"+
		"\u00000\f\u0001\u0000\u0000\u000012\u0005|\u0000\u000023\u0005|\u0000"+
		"\u00003\u000e\u0001\u0000\u0000\u000045\u0005&\u0000\u000056\u0005&\u0000"+
		"\u00006\u0010\u0001\u0000\u0000\u000079\u0007\u0001\u0000\u000087\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;\u0012\u0001\u0000\u0000\u0000<=\u0005.\u0000"+
		"\u0000=>\u0003\u0015\n\u0000>\u0014\u0001\u0000\u0000\u0000?A\u0007\u0002"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0016\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EI\u0007\u0003\u0000\u0000FH\u0007\u0004"+
		"\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0018\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LN\u0007\u0005\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0006\f\u0000\u0000R\u001a"+
		"\u0001\u0000\u0000\u0000\u0006\u0000&:BIO\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}