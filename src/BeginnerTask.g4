/*SIMPLE TASK*/

grammar BeginnerTask;

//Parser
start : BEGIN EOF ;

//Lexer
m   : 'hello' CHAR ;
BEGINTOKEN : '<' TEXT '>' ;
ENDTOKEN : '</' TEXT '>' ;
TEXT : [a-zA-Z0-9]+ ;
CHAR: 'a'..'z'| ' ' | 'A'..'Z' | 'å' ;
WHITESPACE  : [ \t\r\n]+ -> skip ;
//UNDERVISNING WHITESPACE : [\t\n] -> skip;