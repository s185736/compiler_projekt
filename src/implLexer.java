// Generated from impl.g4 by ANTLR 4.10.1
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
		"\u0004\u0000\u0014\u0087\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007A\b\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0005\rQ\b\r\n\r\f\rT\t\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0005\u000fZ\b\u000f\n\u000f"+
		"\f\u000f]\t\u000f\u0001\u0010\u0001\u0010\u0005\u0010a\b\u0010\n\u0010"+
		"\f\u0010d\t\u0010\u0001\u0011\u0004\u0011g\b\u0011\u000b\u0011\f\u0011"+
		"h\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012q\b\u0012\n\u0012\f\u0012t\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013~\b\u0013\n\u0013\f\u0013\u0081\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\t\u0003\u0000!!"+
		"<<>>\u0001\u000009\u0007\u0000AZ__az\u00c5\u00c6\u00d8\u00d8\u00e5\u00e6"+
		"\u00f8\u00f8\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000\t\n  \u0001"+
		"\u0000\n\n\u0001\u0000//\u0001\u0000**\u008f\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000"+
		"\u0005-\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t1\u0001"+
		"\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r5\u0001\u0000\u0000"+
		"\u0000\u000f@\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013"+
		"D\u0001\u0000\u0000\u0000\u0015G\u0001\u0000\u0000\u0000\u0017I\u0001"+
		"\u0000\u0000\u0000\u0019L\u0001\u0000\u0000\u0000\u001bR\u0001\u0000\u0000"+
		"\u0000\u001dU\u0001\u0000\u0000\u0000\u001f[\u0001\u0000\u0000\u0000!"+
		"^\u0001\u0000\u0000\u0000#f\u0001\u0000\u0000\u0000%l\u0001\u0000\u0000"+
		"\u0000\'w\u0001\u0000\u0000\u0000)*\u0005(\u0000\u0000*\u0002\u0001\u0000"+
		"\u0000\u0000+,\u0005)\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005"+
		"*\u0000\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005/\u0000\u00000\b\u0001"+
		"\u0000\u0000\u000012\u0005+\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005"+
		"-\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005R\u0000\u000067\u0005"+
		"e\u0000\u000078\u0005s\u0000\u000089\u0005e\u0000\u00009:\u0005t\u0000"+
		"\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005=\u0000\u0000<A\u0005=\u0000"+
		"\u0000=>\u0005!\u0000\u0000>A\u0005=\u0000\u0000?A\u0007\u0000\u0000\u0000"+
		"@;\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000@?\u0001\u0000\u0000"+
		"\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005!\u0000\u0000C\u0012\u0001"+
		"\u0000\u0000\u0000DE\u0005-\u0000\u0000EF\u0005>\u0000\u0000F\u0014\u0001"+
		"\u0000\u0000\u0000GH\u0005=\u0000\u0000H\u0016\u0001\u0000\u0000\u0000"+
		"IJ\u0005|\u0000\u0000JK\u0005|\u0000\u0000K\u0018\u0001\u0000\u0000\u0000"+
		"LM\u0005&\u0000\u0000MN\u0005&\u0000\u0000N\u001a\u0001\u0000\u0000\u0000"+
		"OQ\u0007\u0001\u0000\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u001c\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0005.\u0000\u0000VW\u0003"+
		"\u001f\u000f\u0000W\u001e\u0001\u0000\u0000\u0000XZ\u0007\u0002\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\ \u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000^b\u0007\u0003\u0000\u0000_a\u0007\u0004\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\"\u0001\u0000\u0000\u0000db\u0001\u0000"+
		"\u0000\u0000eg\u0007\u0005\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jk\u0006\u0011\u0000\u0000k$\u0001\u0000\u0000"+
		"\u0000lm\u0005/\u0000\u0000mn\u0005/\u0000\u0000nr\u0001\u0000\u0000\u0000"+
		"oq\b\u0006\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000uv\u0006\u0012\u0000\u0000v&\u0001\u0000"+
		"\u0000\u0000wx\u0005/\u0000\u0000xy\u0005*\u0000\u0000y\u007f\u0001\u0000"+
		"\u0000\u0000z{\u0005*\u0000\u0000{~\b\u0007\u0000\u0000|~\b\b\u0000\u0000"+
		"}z\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005*\u0000\u0000\u0083\u0084\u0005/\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0006\u0013\u0000\u0000\u0086"+
		"(\u0001\u0000\u0000\u0000\t\u0000@R[bhr}\u007f\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}