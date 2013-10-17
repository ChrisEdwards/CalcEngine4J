parser grammar ExpressionParser;

options {
	// Output an Abstract Syntax Tree.
	output = AST;
	
	// Use the tokens defined in ExpressionParser.
	tokenVocab = ExpressionLexer;
}

// This is the "start rule".
// EOF is a predefined token that represents the end of input.
// The "start rule" should end with this.
// Note the use of the ! AST operator
// to avoid adding the EOF token to the AST.
script: ID* EOF!;
