tree grammar test_predicate_recursion_tree;

options {
	ASTLabelType = CommonTree;
	tokenVocab = test_predicate_recursion;
}

bob
	:	( a=. ( b='.' c=. )* -> ^( $b $a $c )
	;