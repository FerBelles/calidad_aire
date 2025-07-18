// Generated from calidad_aire.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class calidad_aireLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SEP=8, END=9, 
		NEWLINE=10, INT=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "SEP", "END", 
			"NEWLINE", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PM10'", "':'", "'PM2.5'", "'O3'", "'SO2'", "'NO2'", "'CO'", null, 
			"'$\\r\\n'", "'\\r\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SEP", "END", "NEWLINE", 
			"INT", "WS"
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


	public calidad_aireLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calidad_aire.g4"; }

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
		"\u0004\u0000\fM\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0004\nC\b\n\u000b\n\f\nD\u0001"+
		"\u000b\u0004\u000bH\b\u000b\u000b\u000b\f\u000bI\u0001\u000b\u0001\u000b"+
		"\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0001"+
		"\u0000\u0002\u0001\u000009\u0002\u0000\t\t  N\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000"+
		"\u0003\u001e\u0001\u0000\u0000\u0000\u0005 \u0001\u0000\u0000\u0000\u0007"+
		"&\u0001\u0000\u0000\u0000\t)\u0001\u0000\u0000\u0000\u000b-\u0001\u0000"+
		"\u0000\u0000\r1\u0001\u0000\u0000\u0000\u000f4\u0001\u0000\u0000\u0000"+
		"\u0011:\u0001\u0000\u0000\u0000\u0013>\u0001\u0000\u0000\u0000\u0015B"+
		"\u0001\u0000\u0000\u0000\u0017G\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"P\u0000\u0000\u001a\u001b\u0005M\u0000\u0000\u001b\u001c\u00051\u0000"+
		"\u0000\u001c\u001d\u00050\u0000\u0000\u001d\u0002\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0005:\u0000\u0000\u001f\u0004\u0001\u0000\u0000\u0000 !"+
		"\u0005P\u0000\u0000!\"\u0005M\u0000\u0000\"#\u00052\u0000\u0000#$\u0005"+
		".\u0000\u0000$%\u00055\u0000\u0000%\u0006\u0001\u0000\u0000\u0000&\'\u0005"+
		"O\u0000\u0000\'(\u00053\u0000\u0000(\b\u0001\u0000\u0000\u0000)*\u0005"+
		"S\u0000\u0000*+\u0005O\u0000\u0000+,\u00052\u0000\u0000,\n\u0001\u0000"+
		"\u0000\u0000-.\u0005N\u0000\u0000./\u0005O\u0000\u0000/0\u00052\u0000"+
		"\u00000\f\u0001\u0000\u0000\u000012\u0005C\u0000\u000023\u0005O\u0000"+
		"\u00003\u000e\u0001\u0000\u0000\u000045\u0005-\u0000\u000056\u0005-\u0000"+
		"\u000067\u0005-\u0000\u000078\u0001\u0000\u0000\u000089\u0003\u0013\t"+
		"\u00009\u0010\u0001\u0000\u0000\u0000:;\u0005$\u0000\u0000;<\u0005\r\u0000"+
		"\u0000<=\u0005\n\u0000\u0000=\u0012\u0001\u0000\u0000\u0000>?\u0005\r"+
		"\u0000\u0000?@\u0005\n\u0000\u0000@\u0014\u0001\u0000\u0000\u0000AC\u0007"+
		"\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0016\u0001\u0000"+
		"\u0000\u0000FH\u0007\u0001\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0001\u0000\u0000\u0000KL\u0006\u000b\u0000\u0000L\u0018\u0001\u0000"+
		"\u0000\u0000\u0003\u0000DI\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}