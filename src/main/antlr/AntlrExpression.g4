grammar AntlrExpression;

formula
    :   expression
    ;

expression
    :   OPENPAREN expression CLOSEPAREN #ParenthesizedExpression
    |   op=NOT operand=expression #UnaryExpression
    |   op=SUB operand=expression #UnaryExpression
    |   left=expression op=(MUL|DIV|MOD) right=expression #BinaryExpression
    |   left=expression op=(ADD|SUB) right=expression #BinaryExpression     
    |   left=expression op=(LT|GT|LTE|GTE) right=expression #BinaryExpression  
    |   left=expression op=(EQ|NEQ) right=expression #BinaryExpression 
    |   left=expression op=OP_AND right=expression #BinaryExpression
    |   left=expression op=OP_OR right=expression #BinaryExpression
    |   ID      #Id
    |   INT #Literal
    ;


ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;


OPENPAREN : '(';
CLOSEPAREN : ')';
NOT : '!'|'not';
MUL : '*' ;
DIV : '/' ;
MOD : '%' ;
ADD : '+' ;
SUB : '-' ;
EQ  : '==' ;
NEQ : '!=' ;
GT  : '>' ;
GTE : '>=' ;
LT  : '<' ;
LTE : '<=' ;
OP_AND : 'and'|'&&' ;
OP_OR  : '||'|'or';

WS  :   [ \t]+ -> skip ; // toss out whitespace


fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
