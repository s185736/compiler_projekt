grammar impl;

//parser rules
start       : ( ALPHA | STRING | RESET | latchdec | updateDecl | simInp ) * EOF;

latchdec    :   (STRING ALPHA PIL ALPHA) ;
updateDecl  :   (ALPHA ASSIGN expr)      ;
simInp      :   (condition ASSIGN NUMBER);

expr: ALPHA	     	                            # ALPHA1
     | condition AND_OP condition               # ALPHA2
     | condition                                # ALPHA3
     | '(' e=expr')'                            # Parenthesis
     | e1=expr op=('*'|'/') e2=expr             # MulDiv
     | e1=expr op=('+'|'-') e2=expr             # AddSub
     ;

condition: OP condition                             # EXPR1
    | AND_OP e2=expr # AND
    | OR_OP e2=expr # OR
    | ALPHA                                         # EXPR3
    | RESET                                         # EXPR4
    | NUMBER condition                              # EXPR5
    ;

//lexer rules (tokens).
RESET: 'Reset';
OP : ( '==' | '!=' | '<' | '>' | '!' );
NOT : '!';
PIL : '->';
ASSIGN : '=';
OR_OP : '||';
AND_OP : '&&';
NUMBER : [0-9]* ;
STRING : '.' ALPHA ;
ALPHA : [a-zA-Z_ÆØÅæøå]*;
ID: [a-zA-Z_] [a-zA-Z0-9_]*;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;