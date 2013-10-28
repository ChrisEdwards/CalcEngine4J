grammar AntlrExpression;

root
	:	(   formulaDeclaration 
        |	classDeclaration
        )*
	;

// BEGIN CLASS DECLARATIONS

classDeclaration
	:	'class' name=Identifier baseClass=baseClassDeclaration? body=classBody
	;
baseClassDeclaration
	:	':' name=Identifier 'where' qualifier=expression
	;
classBody
	:	'{' 
        (   propertyDeclaration
        |   relationshipDeclaration
        )* 
        '}'
	;
	
// Properties.
propertyDeclaration
	:	'property' name=Identifier modifiers=propertyModifiers? ';'
	;
propertyModifiers
	:	'primarykey'                    #PrimaryKeyProperty
	|	('calculated' | 'abstract')+    #CalculatedAndOrAbstractProperty
	;
	
// Relationships.
relationshipDeclaration
	:	'relationship' name=Identifier '=' target=Identifier 'where' joinCriteria=expression ';'
	;

// END CLASS DECLARATIONS

formulaDeclaration
	:	property=qualifiedPropertyName '=' calculation=expression ';'
	;

expression
    :   '(' expression ')'
    |   entityExpression
    |   literal
    |   name=Identifier '(' args=expressionList ')' //#FunctionCall
    |   op=OP_NOT operand=expression //#UnaryExpression
    |   op=OP_SUB operand=expression //#UnaryExpression
    |   left=expression op=(OP_MUL|OP_DIV|OP_MOD) right=expression //#BinaryExpression
    |   left=expression op=(OP_ADD|OP_SUB) right=expression //#BinaryExpression     
    |   left=expression op=(OP_LT|OP_GT|OP_LTE|OP_GTE) right=expression //#BinaryExpression  
    |   left=expression op=(OP_EQ|OP_NEQ) right=expression //#BinaryExpression 
    |   left=expression op=OP_AND right=expression //#BinaryExpression
    |   left=expression op=OP_OR right=expression //#BinaryExpression
    ;
	
expressionList
    :   expression (',' expression)*
    ;

// BEGIN ENTITY 

entityExpression
	:	'this' '.' entityExpression
    |   filteredEntityExpression
    |   entity
    |   entityExpression '.' entityExpression
	;
filteredEntityExpression
	:	entityToFilter=entity '[' filter=expression ']'
	;
chainedEntityExpression
    :   left=entityExpression '.' right=entityExpression
    ;
entity
    :   name=Identifier
    ;

// END ENTITY

qualifiedPropertyName
    :   className=Identifier '.' propertyName=Identifier
    ;

literal
    :   BooleanLiteral
    |   IntegerLiteral
    |   FloatingPointLiteral
    |   StringLiteral
    ;
		
/*----------------------------------------------------------
 * LEXER RULES
 *----------------------------------------------------------*/

// Keywords
CLASS           : 'class';
WHERE           : 'where';
PROPERTY        : 'property';
PRIMARYKEY      : 'primarykey';
CALCULATED      : 'calculated';
ABSTRACT        : 'abstract';
RELATIONSHIP    : 'relationship';
THIS            : 'this';

// Separators
LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';
COLON           : ':';
SQUOT           : '\'';
DQUOT           : '"';

// Operators
OP_ASSIGN       : '=';
OP_NOT          : '!'|'not';
OP_MUL          : '*';
OP_DIV          : '/';
OP_MOD          : '%';
OP_ADD          : '+';
OP_SUB          : '-';
OP_EQ           : '==';
OP_NEQ          : '!=';
OP_GT           : '>';
OP_GTE          : '>=';
OP_LT           : '<';
OP_LTE          : '<=';
OP_AND          : 'and'|'&&';
OP_OR           : 'or'|'||';

BooleanLiteral
    :   'true'
    |   'false'
    ;

IntegerLiteral
    :	'0'..'9'+ 
    ;

FloatingPointLiteral
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

StringLiteral
    : '"' ( ESC_SEQ | ~('\\'|'"') )* '"' 
    ;

Identifier  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;