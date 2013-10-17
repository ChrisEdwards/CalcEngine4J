grammar test_predicate_recursion;

options {
  // We're going to output an AST.
  output = AST;
  backtrack = true;
}

tokens {
	PREDICATE;
}

simple
	:	ID ( '.'^ rule )*
	;

rule 
	:	ID^ predicate?
	;



predicate
	:	'[' ID ']' -> ^( PREDICATE ID )
	;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;