// Generated from C:\Projects\calcengine\src\main\antlr\AntlrExpression.g4 by ANTLR 4.1
package com.shiloh.calcengine.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrExpressionLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, INT=2, MUL=3, DIV=4, ADD=5, SUB=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "INT", "'*'", "'/'", "'+'", "'-'"
	};
	public static final String[] ruleNames = {
		"ID", "INT", "MUL", "DIV", "ADD", "SUB"
	};


	public AntlrExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AntlrExpression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\b#\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\6\3\30\n\3\r\3\16\3\31\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\2\b\3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\3\2\4\5\2C\\aac|\6\2\62;C\\aac|$\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\3\17\3\2\2\2\5\27\3\2\2\2\7\33\3\2\2\2\t\35\3\2\2\2\13\37\3\2\2\2\r"+
		"!\3\2\2\2\17\23\t\2\2\2\20\22\t\3\2\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21"+
		"\3\2\2\2\23\24\3\2\2\2\24\4\3\2\2\2\25\23\3\2\2\2\26\30\4\62;\2\27\26"+
		"\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\6\3\2\2\2\33\34"+
		"\7,\2\2\34\b\3\2\2\2\35\36\7\61\2\2\36\n\3\2\2\2\37 \7-\2\2 \f\3\2\2\2"+
		"!\"\7/\2\2\"\16\3\2\2\2\5\2\23\31";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}