grammar impl;

//parser rules
start       : ( ALPHA | STRING | RESET | latchdec | updateDecl | simInp ) * EOF;

latchdec    :   STRING ALPHA PIL ALPHA  ;
updateDecl  :   ALPHA ASSIGN (expr)       ;
simInp      :   RESET ASSIGN NUMBER     ;

/*Saved for later..*/
/*condition : OP              # ALLOPERATORS
        | AND_OP            # AND
        | OR_OP             # OR
        | NOT               # NOT
        | PUNKTUM           # PUNKTUM
        | PIL               #PIL
        | ASSIGN            #ASSIGN
        ;*/

//expressions
expr: ALPHA ASSIGN                # ALPHA1
   ;

//lexer rules (tokens) - will be cleanup later.
RESET: 'Reset';
OP : ( '==' | '!=' | '<' | '>' | '!' );
NOT : '!';
PUNKTUM : '.';
PIL : '->';
ASSIGN : '=';
OR_OP : '||';
AND_OP : '&&';
NUMBER : [0-9]+ ;
STRING : '.' ALPHA ;
ALPHA : [a-zA-Z_ÆØÅæøå]*;
ID: [a-zA-Z_] [a-zA-Z_0-9]*;
WS: [ \t\n\r]+ -> skip ;