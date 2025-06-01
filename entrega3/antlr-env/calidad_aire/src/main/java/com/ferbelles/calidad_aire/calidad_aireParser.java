package com.ferbelles.calidad_aire;

// Generated from calidad_aire.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class calidad_aireParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SEP=8, END=9, 
		NEWLINE=10, INT=11, WS=12;
	public static final int
		RULE_file = 0, RULE_conjunto = 1, RULE_datos = 2, RULE_pm10 = 3, RULE_pm25 = 4, 
		RULE_o3 = 5, RULE_so2 = 6, RULE_no2 = 7, RULE_co = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "conjunto", "datos", "pm10", "pm25", "o3", "so2", "no2", "co"
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

	@Override
	public String getGrammarFileName() { return "calidad_aire.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calidad_aireParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public TerminalNode END() { return getToken(calidad_aireParser.END, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			conjunto();
			setState(19);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConjuntoContext extends ParserRuleContext {
		public ConjuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunto; }
	 
		public ConjuntoContext() { }
		public void copyFrom(ConjuntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ConjuntoContext {
		public DatosContext datos() {
			return getRuleContext(DatosContext.class,0);
		}
		public DataContext(ConjuntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).exitData(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConjuntosContext extends ConjuntoContext {
		public DatosContext datos() {
			return getRuleContext(DatosContext.class,0);
		}
		public TerminalNode SEP() { return getToken(calidad_aireParser.SEP, 0); }
		public ConjuntoContext conjunto() {
			return getRuleContext(ConjuntoContext.class,0);
		}
		public ConjuntosContext(ConjuntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).enterConjuntos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).exitConjuntos(this);
		}
	}

	public final ConjuntoContext conjunto() throws RecognitionException {
		ConjuntoContext _localctx = new ConjuntoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_conjunto);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new ConjuntosContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				datos();
				setState(22);
				match(SEP);
				setState(23);
				conjunto();
				}
				break;
			case 2:
				_localctx = new DataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				datos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DatosContext extends ParserRuleContext {
		public Pm10Context pm10() {
			return getRuleContext(Pm10Context.class,0);
		}
		public Pm25Context pm25() {
			return getRuleContext(Pm25Context.class,0);
		}
		public O3Context o3() {
			return getRuleContext(O3Context.class,0);
		}
		public So2Context so2() {
			return getRuleContext(So2Context.class,0);
		}
		public No2Context no2() {
			return getRuleContext(No2Context.class,0);
		}
		public CoContext co() {
			return getRuleContext(CoContext.class,0);
		}
		public DatosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).enterDatos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).exitDatos(this);
		}
	}

	public final DatosContext datos() throws RecognitionException {
		DatosContext _localctx = new DatosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_datos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			pm10();
			setState(29);
			pm25();
			setState(30);
			o3();
			setState(31);
			so2();
			setState(32);
			no2();
			setState(33);
			co();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pm10Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(calidad_aireParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(calidad_aireParser.NEWLINE, 0); }
		public Pm10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pm10; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).enterPm10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).exitPm10(this);
		}
	}

	public final Pm10Context pm10() throws RecognitionException {
		Pm10Context _localctx = new Pm10Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_pm10);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			match(T__1);
			setState(37);
			match(INT);
			setState(38);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pm25Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(calidad_aireParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(calidad_aireParser.NEWLINE, 0); }
		public Pm25Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pm25; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).enterPm25(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).exitPm25(this);
		}
	}

	public final Pm25Context pm25() throws RecognitionException {
		Pm25Context _localctx = new Pm25Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_pm25);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__2);
			setState(41);
			match(T__1);
			setState(42);
			match(INT);
			setState(43);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class O3Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(calidad_aireParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(calidad_aireParser.NEWLINE, 0); }
		public O3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).enterO3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).exitO3(this);
		}
	}

	public final O3Context o3() throws RecognitionException {
		O3Context _localctx = new O3Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_o3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__3);
			setState(46);
			match(T__1);
			setState(47);
			match(INT);
			setState(48);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class So2Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(calidad_aireParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(calidad_aireParser.NEWLINE, 0); }
		public So2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_so2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).enterSo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).exitSo2(this);
		}
	}

	public final So2Context so2() throws RecognitionException {
		So2Context _localctx = new So2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_so2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__4);
			setState(51);
			match(T__1);
			setState(52);
			match(INT);
			setState(53);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class No2Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(calidad_aireParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(calidad_aireParser.NEWLINE, 0); }
		public No2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_no2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).enterNo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).exitNo2(this);
		}
	}

	public final No2Context no2() throws RecognitionException {
		No2Context _localctx = new No2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_no2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__5);
			setState(56);
			match(T__1);
			setState(57);
			match(INT);
			setState(58);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(calidad_aireParser.INT, 0); }
		public TerminalNode NEWLINE() { return getToken(calidad_aireParser.NEWLINE, 0); }
		public CoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_co; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).enterCo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calidad_aireListener ) ((calidad_aireListener)listener).exitCo(this);
		}
	}

	public final CoContext co() throws RecognitionException {
		CoContext _localctx = new CoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_co);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__6);
			setState(61);
			match(T__1);
			setState(62);
			match(INT);
			setState(63);
			match(NEWLINE);
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
		"\u0004\u0001\fB\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0000\u0000"+
		"\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u00009\u0000\u0012"+
		"\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000\u0004\u001c"+
		"\u0001\u0000\u0000\u0000\u0006#\u0001\u0000\u0000\u0000\b(\u0001\u0000"+
		"\u0000\u0000\n-\u0001\u0000\u0000\u0000\f2\u0001\u0000\u0000\u0000\u000e"+
		"7\u0001\u0000\u0000\u0000\u0010<\u0001\u0000\u0000\u0000\u0012\u0013\u0003"+
		"\u0002\u0001\u0000\u0013\u0014\u0005\t\u0000\u0000\u0014\u0001\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0003\u0004\u0002\u0000\u0016\u0017\u0005\b\u0000"+
		"\u0000\u0017\u0018\u0003\u0002\u0001\u0000\u0018\u001b\u0001\u0000\u0000"+
		"\u0000\u0019\u001b\u0003\u0004\u0002\u0000\u001a\u0015\u0001\u0000\u0000"+
		"\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0003\u0006\u0003\u0000\u001d\u001e\u0003\b\u0004\u0000"+
		"\u001e\u001f\u0003\n\u0005\u0000\u001f \u0003\f\u0006\u0000 !\u0003\u000e"+
		"\u0007\u0000!\"\u0003\u0010\b\u0000\"\u0005\u0001\u0000\u0000\u0000#$"+
		"\u0005\u0001\u0000\u0000$%\u0005\u0002\u0000\u0000%&\u0005\u000b\u0000"+
		"\u0000&\'\u0005\n\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000()\u0005"+
		"\u0003\u0000\u0000)*\u0005\u0002\u0000\u0000*+\u0005\u000b\u0000\u0000"+
		"+,\u0005\n\u0000\u0000,\t\u0001\u0000\u0000\u0000-.\u0005\u0004\u0000"+
		"\u0000./\u0005\u0002\u0000\u0000/0\u0005\u000b\u0000\u000001\u0005\n\u0000"+
		"\u00001\u000b\u0001\u0000\u0000\u000023\u0005\u0005\u0000\u000034\u0005"+
		"\u0002\u0000\u000045\u0005\u000b\u0000\u000056\u0005\n\u0000\u00006\r"+
		"\u0001\u0000\u0000\u000078\u0005\u0006\u0000\u000089\u0005\u0002\u0000"+
		"\u00009:\u0005\u000b\u0000\u0000:;\u0005\n\u0000\u0000;\u000f\u0001\u0000"+
		"\u0000\u0000<=\u0005\u0007\u0000\u0000=>\u0005\u0002\u0000\u0000>?\u0005"+
		"\u000b\u0000\u0000?@\u0005\n\u0000\u0000@\u0011\u0001\u0000\u0000\u0000"+
		"\u0001\u001a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}