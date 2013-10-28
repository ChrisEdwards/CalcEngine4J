// Generated from C:\Projects\calcengine\src\main\antlr\AntlrExpression.g4 by ANTLR 4.1
package com.shiloh.calcengine.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrExpressionParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, WHERE=2, PROPERTY=3, PRIMARYKEY=4, CALCULATED=5, ABSTRACT=6, 
		RELATIONSHIP=7, THIS=8, LPAREN=9, RPAREN=10, LBRACE=11, RBRACE=12, LBRACK=13, 
		RBRACK=14, SEMI=15, COMMA=16, DOT=17, COLON=18, SQUOT=19, DQUOT=20, OP_ASSIGN=21, 
		OP_NOT=22, OP_MUL=23, OP_DIV=24, OP_MOD=25, OP_ADD=26, OP_SUB=27, OP_EQ=28, 
		OP_NEQ=29, OP_GT=30, OP_GTE=31, OP_LT=32, OP_LTE=33, OP_AND=34, OP_OR=35, 
		BooleanLiteral=36, IntegerLiteral=37, FloatingPointLiteral=38, StringLiteral=39, 
		Identifier=40, WS=41, COMMENT=42, LINE_COMMENT=43;
	public static final String[] tokenNames = {
		"<INVALID>", "'class'", "'where'", "'property'", "'primarykey'", "'calculated'", 
		"'abstract'", "'relationship'", "'this'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "';'", "','", "'.'", "':'", "'''", "'\"'", "'='", "OP_NOT", 
		"'*'", "'/'", "'%'", "'+'", "'-'", "'=='", "'!='", "'>'", "'>='", "'<'", 
		"'<='", "OP_AND", "OP_OR", "BooleanLiteral", "IntegerLiteral", "FloatingPointLiteral", 
		"StringLiteral", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_root = 0, RULE_classDeclaration = 1, RULE_baseClassDeclaration = 2, 
		RULE_classBody = 3, RULE_propertyDeclaration = 4, RULE_propertyModifiers = 5, 
		RULE_relationshipDeclaration = 6, RULE_formulaDeclaration = 7, RULE_expression = 8, 
		RULE_expressionList = 9, RULE_entityExpression = 10, RULE_filteredEntityExpression = 11, 
		RULE_chainedEntityExpression = 12, RULE_entity = 13, RULE_qualifiedPropertyName = 14, 
		RULE_literal = 15;
	public static final String[] ruleNames = {
		"root", "classDeclaration", "baseClassDeclaration", "classBody", "propertyDeclaration", 
		"propertyModifiers", "relationshipDeclaration", "formulaDeclaration", 
		"expression", "expressionList", "entityExpression", "filteredEntityExpression", 
		"chainedEntityExpression", "entity", "qualifiedPropertyName", "literal"
	};

	@Override
	public String getGrammarFileName() { return "AntlrExpression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public AntlrExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<FormulaDeclarationContext> formulaDeclaration() {
			return getRuleContexts(FormulaDeclarationContext.class);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public FormulaDeclarationContext formulaDeclaration(int i) {
			return getRuleContext(FormulaDeclarationContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==Identifier) {
				{
				setState(34);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(32); formulaDeclaration();
					}
					break;
				case CLASS:
					{
					setState(33); classDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token name;
		public BaseClassDeclarationContext baseClass;
		public ClassBodyContext body;
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AntlrExpressionParser.Identifier, 0); }
		public BaseClassDeclarationContext baseClassDeclaration() {
			return getRuleContext(BaseClassDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(CLASS);
			setState(40); ((ClassDeclarationContext)_localctx).name = match(Identifier);
			setState(42);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(41); ((ClassDeclarationContext)_localctx).baseClass = baseClassDeclaration();
				}
			}

			setState(44); ((ClassDeclarationContext)_localctx).body = classBody();
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

	public static class BaseClassDeclarationContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext qualifier;
		public TerminalNode Identifier() { return getToken(AntlrExpressionParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BaseClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterBaseClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitBaseClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitBaseClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseClassDeclarationContext baseClassDeclaration() throws RecognitionException {
		BaseClassDeclarationContext _localctx = new BaseClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_baseClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(COLON);
			setState(47); ((BaseClassDeclarationContext)_localctx).name = match(Identifier);
			setState(48); match(WHERE);
			setState(49); ((BaseClassDeclarationContext)_localctx).qualifier = expression(0);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public RelationshipDeclarationContext relationshipDeclaration(int i) {
			return getRuleContext(RelationshipDeclarationContext.class,i);
		}
		public List<RelationshipDeclarationContext> relationshipDeclaration() {
			return getRuleContexts(RelationshipDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(LBRACE);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROPERTY || _la==RELATIONSHIP) {
				{
				setState(54);
				switch (_input.LA(1)) {
				case PROPERTY:
					{
					setState(52); propertyDeclaration();
					}
					break;
				case RELATIONSHIP:
					{
					setState(53); relationshipDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59); match(RBRACE);
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

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public Token name;
		public PropertyModifiersContext modifiers;
		public TerminalNode Identifier() { return getToken(AntlrExpressionParser.Identifier, 0); }
		public PropertyModifiersContext propertyModifiers() {
			return getRuleContext(PropertyModifiersContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(PROPERTY);
			setState(62); ((PropertyDeclarationContext)_localctx).name = match(Identifier);
			setState(64);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIMARYKEY) | (1L << CALCULATED) | (1L << ABSTRACT))) != 0)) {
				{
				setState(63); ((PropertyDeclarationContext)_localctx).modifiers = propertyModifiers();
				}
			}

			setState(66); match(SEMI);
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

	public static class PropertyModifiersContext extends ParserRuleContext {
		public PropertyModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifiers; }
	 
		public PropertyModifiersContext() { }
		public void copyFrom(PropertyModifiersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalculatedAndOrAbstractPropertyContext extends PropertyModifiersContext {
		public CalculatedAndOrAbstractPropertyContext(PropertyModifiersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterCalculatedAndOrAbstractProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitCalculatedAndOrAbstractProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitCalculatedAndOrAbstractProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryKeyPropertyContext extends PropertyModifiersContext {
		public PrimaryKeyPropertyContext(PropertyModifiersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterPrimaryKeyProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitPrimaryKeyProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitPrimaryKeyProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyModifiersContext propertyModifiers() throws RecognitionException {
		PropertyModifiersContext _localctx = new PropertyModifiersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_propertyModifiers);
		int _la;
		try {
			setState(74);
			switch (_input.LA(1)) {
			case PRIMARYKEY:
				_localctx = new PrimaryKeyPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(PRIMARYKEY);
				}
				break;
			case CALCULATED:
			case ABSTRACT:
				_localctx = new CalculatedAndOrAbstractPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					_la = _input.LA(1);
					if ( !(_la==CALCULATED || _la==ABSTRACT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CALCULATED || _la==ABSTRACT );
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

	public static class RelationshipDeclarationContext extends ParserRuleContext {
		public Token name;
		public Token target;
		public ExpressionContext joinCriteria;
		public TerminalNode Identifier(int i) {
			return getToken(AntlrExpressionParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(AntlrExpressionParser.Identifier); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RelationshipDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterRelationshipDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitRelationshipDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitRelationshipDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipDeclarationContext relationshipDeclaration() throws RecognitionException {
		RelationshipDeclarationContext _localctx = new RelationshipDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relationshipDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(RELATIONSHIP);
			setState(77); ((RelationshipDeclarationContext)_localctx).name = match(Identifier);
			setState(78); match(OP_ASSIGN);
			setState(79); ((RelationshipDeclarationContext)_localctx).target = match(Identifier);
			setState(80); match(WHERE);
			setState(81); ((RelationshipDeclarationContext)_localctx).joinCriteria = expression(0);
			setState(82); match(SEMI);
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

	public static class FormulaDeclarationContext extends ParserRuleContext {
		public QualifiedPropertyNameContext property;
		public ExpressionContext calculation;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QualifiedPropertyNameContext qualifiedPropertyName() {
			return getRuleContext(QualifiedPropertyNameContext.class,0);
		}
		public FormulaDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterFormulaDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitFormulaDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitFormulaDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaDeclarationContext formulaDeclaration() throws RecognitionException {
		FormulaDeclarationContext _localctx = new FormulaDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formulaDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); ((FormulaDeclarationContext)_localctx).property = qualifiedPropertyName();
			setState(85); match(OP_ASSIGN);
			setState(86); ((FormulaDeclarationContext)_localctx).calculation = expression(0);
			setState(87); match(SEMI);
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext left;
		public Token op;
		public ExpressionContext operand;
		public Token name;
		public ExpressionListContext args;
		public ExpressionContext right;
		public EntityExpressionContext entityExpression() {
			return getRuleContext(EntityExpressionContext.class,0);
		}
		public TerminalNode OP_MOD() { return getToken(AntlrExpressionParser.OP_MOD, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode OP_ADD() { return getToken(AntlrExpressionParser.OP_ADD, 0); }
		public TerminalNode OP_AND() { return getToken(AntlrExpressionParser.OP_AND, 0); }
		public TerminalNode OP_LTE() { return getToken(AntlrExpressionParser.OP_LTE, 0); }
		public TerminalNode Identifier() { return getToken(AntlrExpressionParser.Identifier, 0); }
		public TerminalNode OP_NOT() { return getToken(AntlrExpressionParser.OP_NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode OP_SUB() { return getToken(AntlrExpressionParser.OP_SUB, 0); }
		public TerminalNode OP_NEQ() { return getToken(AntlrExpressionParser.OP_NEQ, 0); }
		public TerminalNode OP_MUL() { return getToken(AntlrExpressionParser.OP_MUL, 0); }
		public TerminalNode OP_LT() { return getToken(AntlrExpressionParser.OP_LT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_EQ() { return getToken(AntlrExpressionParser.OP_EQ, 0); }
		public TerminalNode OP_GT() { return getToken(AntlrExpressionParser.OP_GT, 0); }
		public TerminalNode OP_GTE() { return getToken(AntlrExpressionParser.OP_GTE, 0); }
		public TerminalNode OP_DIV() { return getToken(AntlrExpressionParser.OP_DIV, 0); }
		public TerminalNode OP_OR() { return getToken(AntlrExpressionParser.OP_OR, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(90); ((ExpressionContext)_localctx).op = match(OP_NOT);
				setState(91); ((ExpressionContext)_localctx).operand = expression(8);
				}
				break;

			case 2:
				{
				setState(92); ((ExpressionContext)_localctx).op = match(OP_SUB);
				setState(93); ((ExpressionContext)_localctx).operand = expression(7);
				}
				break;

			case 3:
				{
				setState(94); match(LPAREN);
				setState(95); expression(0);
				setState(96); match(RPAREN);
				}
				break;

			case 4:
				{
				setState(98); entityExpression(0);
				}
				break;

			case 5:
				{
				setState(99); literal();
				}
				break;

			case 6:
				{
				setState(100); ((ExpressionContext)_localctx).name = match(Identifier);
				setState(101); match(LPAREN);
				setState(102); ((ExpressionContext)_localctx).args = expressionList();
				setState(103); match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(108);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MUL) | (1L << OP_DIV) | (1L << OP_MOD))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(109); ((ExpressionContext)_localctx).right = expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(111);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_ADD || _la==OP_SUB) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(112); ((ExpressionContext)_localctx).right = expression(6);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(114);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_GT) | (1L << OP_GTE) | (1L << OP_LT) | (1L << OP_LTE))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(115); ((ExpressionContext)_localctx).right = expression(5);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(117);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_EQ || _la==OP_NEQ) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(118); ((ExpressionContext)_localctx).right = expression(4);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(120); ((ExpressionContext)_localctx).op = match(OP_AND);
						setState(121); ((ExpressionContext)_localctx).right = expression(3);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(123); ((ExpressionContext)_localctx).op = match(OP_OR);
						setState(124); ((ExpressionContext)_localctx).right = expression(2);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); expression(0);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131); match(COMMA);
				setState(132); expression(0);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EntityExpressionContext extends ParserRuleContext {
		public int _p;
		public List<EntityExpressionContext> entityExpression() {
			return getRuleContexts(EntityExpressionContext.class);
		}
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public EntityExpressionContext entityExpression(int i) {
			return getRuleContext(EntityExpressionContext.class,i);
		}
		public FilteredEntityExpressionContext filteredEntityExpression() {
			return getRuleContext(FilteredEntityExpressionContext.class,0);
		}
		public EntityExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EntityExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_entityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterEntityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitEntityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitEntityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityExpressionContext entityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EntityExpressionContext _localctx = new EntityExpressionContext(_ctx, _parentState, _p);
		EntityExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_entityExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(139); match(THIS);
				setState(140); match(DOT);
				setState(141); entityExpression(4);
				}
				break;

			case 2:
				{
				setState(142); filteredEntityExpression();
				}
				break;

			case 3:
				{
				setState(143); entity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EntityExpressionContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_entityExpression);
					setState(146);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(147); match(DOT);
					setState(148); entityExpression(2);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class FilteredEntityExpressionContext extends ParserRuleContext {
		public EntityContext entityToFilter;
		public ExpressionContext filter;
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilteredEntityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filteredEntityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterFilteredEntityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitFilteredEntityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitFilteredEntityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilteredEntityExpressionContext filteredEntityExpression() throws RecognitionException {
		FilteredEntityExpressionContext _localctx = new FilteredEntityExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_filteredEntityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); ((FilteredEntityExpressionContext)_localctx).entityToFilter = entity();
			setState(155); match(LBRACK);
			setState(156); ((FilteredEntityExpressionContext)_localctx).filter = expression(0);
			setState(157); match(RBRACK);
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

	public static class ChainedEntityExpressionContext extends ParserRuleContext {
		public EntityExpressionContext left;
		public EntityExpressionContext right;
		public List<EntityExpressionContext> entityExpression() {
			return getRuleContexts(EntityExpressionContext.class);
		}
		public EntityExpressionContext entityExpression(int i) {
			return getRuleContext(EntityExpressionContext.class,i);
		}
		public ChainedEntityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chainedEntityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterChainedEntityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitChainedEntityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitChainedEntityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChainedEntityExpressionContext chainedEntityExpression() throws RecognitionException {
		ChainedEntityExpressionContext _localctx = new ChainedEntityExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chainedEntityExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); ((ChainedEntityExpressionContext)_localctx).left = entityExpression(0);
			setState(160); match(DOT);
			setState(161); ((ChainedEntityExpressionContext)_localctx).right = entityExpression(0);
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

	public static class EntityContext extends ParserRuleContext {
		public Token name;
		public TerminalNode Identifier() { return getToken(AntlrExpressionParser.Identifier, 0); }
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_entity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); ((EntityContext)_localctx).name = match(Identifier);
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

	public static class QualifiedPropertyNameContext extends ParserRuleContext {
		public Token className;
		public Token propertyName;
		public TerminalNode Identifier(int i) {
			return getToken(AntlrExpressionParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(AntlrExpressionParser.Identifier); }
		public QualifiedPropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedPropertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterQualifiedPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitQualifiedPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitQualifiedPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedPropertyNameContext qualifiedPropertyName() throws RecognitionException {
		QualifiedPropertyNameContext _localctx = new QualifiedPropertyNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_qualifiedPropertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); ((QualifiedPropertyNameContext)_localctx).className = match(Identifier);
			setState(166); match(DOT);
			setState(167); ((QualifiedPropertyNameContext)_localctx).propertyName = match(Identifier);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(AntlrExpressionParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AntlrExpressionParser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(AntlrExpressionParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AntlrExpressionParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrExpressionListener ) ((AntlrExpressionListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrExpressionVisitor ) return ((AntlrExpressionVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) ) {
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
		case 8: return expression_sempred((ExpressionContext)_localctx, predIndex);

		case 10: return entityExpression_sempred((EntityExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;

		case 2: return 4 >= _localctx._p;

		case 3: return 3 >= _localctx._p;

		case 4: return 2 >= _localctx._p;

		case 5: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean entityExpression_sempred(EntityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3-\u00ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\7"+
		"\2%\n\2\f\2\16\2(\13\2\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\5\3\5\3\6\3\6\3\6\5\6C\n\6\3"+
		"\6\3\6\3\7\3\7\6\7I\n\7\r\7\16\7J\5\7M\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\nl\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n\u0083\13\n\3\13"+
		"\3\13\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0093\n\f\3\f\3\f\3\f\7\f\u0098\n\f\f\f\16\f\u009b\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\b\3\2\7\b\3"+
		"\2\31\33\3\2\34\35\3\2 #\3\2\36\37\3\2&)\u00b4\2&\3\2\2\2\4)\3\2\2\2\6"+
		"\60\3\2\2\2\b\65\3\2\2\2\n?\3\2\2\2\fL\3\2\2\2\16N\3\2\2\2\20V\3\2\2\2"+
		"\22k\3\2\2\2\24\u0084\3\2\2\2\26\u0092\3\2\2\2\30\u009c\3\2\2\2\32\u00a1"+
		"\3\2\2\2\34\u00a5\3\2\2\2\36\u00a7\3\2\2\2 \u00ab\3\2\2\2\"%\5\20\t\2"+
		"#%\5\4\3\2$\"\3\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2"+
		"\2\2(&\3\2\2\2)*\7\3\2\2*,\7*\2\2+-\5\6\4\2,+\3\2\2\2,-\3\2\2\2-.\3\2"+
		"\2\2./\5\b\5\2/\5\3\2\2\2\60\61\7\24\2\2\61\62\7*\2\2\62\63\7\4\2\2\63"+
		"\64\5\22\n\2\64\7\3\2\2\2\65:\7\r\2\2\669\5\n\6\2\679\5\16\b\28\66\3\2"+
		"\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7"+
		"\16\2\2>\t\3\2\2\2?@\7\5\2\2@B\7*\2\2AC\5\f\7\2BA\3\2\2\2BC\3\2\2\2CD"+
		"\3\2\2\2DE\7\21\2\2E\13\3\2\2\2FM\7\6\2\2GI\t\2\2\2HG\3\2\2\2IJ\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LF\3\2\2\2LH\3\2\2\2M\r\3\2\2\2NO\7\t"+
		"\2\2OP\7*\2\2PQ\7\27\2\2QR\7*\2\2RS\7\4\2\2ST\5\22\n\2TU\7\21\2\2U\17"+
		"\3\2\2\2VW\5\36\20\2WX\7\27\2\2XY\5\22\n\2YZ\7\21\2\2Z\21\3\2\2\2[\\\b"+
		"\n\1\2\\]\7\30\2\2]l\5\22\n\2^_\7\35\2\2_l\5\22\n\2`a\7\13\2\2ab\5\22"+
		"\n\2bc\7\f\2\2cl\3\2\2\2dl\5\26\f\2el\5 \21\2fg\7*\2\2gh\7\13\2\2hi\5"+
		"\24\13\2ij\7\f\2\2jl\3\2\2\2k[\3\2\2\2k^\3\2\2\2k`\3\2\2\2kd\3\2\2\2k"+
		"e\3\2\2\2kf\3\2\2\2l\u0081\3\2\2\2mn\6\n\2\3no\t\3\2\2o\u0080\5\22\n\2"+
		"pq\6\n\3\3qr\t\4\2\2r\u0080\5\22\n\2st\6\n\4\3tu\t\5\2\2u\u0080\5\22\n"+
		"\2vw\6\n\5\3wx\t\6\2\2x\u0080\5\22\n\2yz\6\n\6\3z{\7$\2\2{\u0080\5\22"+
		"\n\2|}\6\n\7\3}~\7%\2\2~\u0080\5\22\n\2\177m\3\2\2\2\177p\3\2\2\2\177"+
		"s\3\2\2\2\177v\3\2\2\2\177y\3\2\2\2\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0084\u0089\5\22\n\2\u0085\u0086\7\22\2\2\u0086\u0088\5\22\n\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\25\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\b\f\1\2\u008d\u008e"+
		"\7\n\2\2\u008e\u008f\7\23\2\2\u008f\u0093\5\26\f\2\u0090\u0093\5\30\r"+
		"\2\u0091\u0093\5\34\17\2\u0092\u008c\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0099\3\2\2\2\u0094\u0095\6\f\b\3\u0095\u0096\7\23"+
		"\2\2\u0096\u0098\5\26\f\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\27\3\2\2\2\u009b\u0099\3\2\2"+
		"\2\u009c\u009d\5\34\17\2\u009d\u009e\7\17\2\2\u009e\u009f\5\22\n\2\u009f"+
		"\u00a0\7\20\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7\23"+
		"\2\2\u00a3\u00a4\5\26\f\2\u00a4\33\3\2\2\2\u00a5\u00a6\7*\2\2\u00a6\35"+
		"\3\2\2\2\u00a7\u00a8\7*\2\2\u00a8\u00a9\7\23\2\2\u00a9\u00aa\7*\2\2\u00aa"+
		"\37\3\2\2\2\u00ab\u00ac\t\7\2\2\u00ac!\3\2\2\2\20$&,8:BJLk\177\u0081\u0089"+
		"\u0092\u0099";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}