grammar impl;
/*https://stackoverflow.com/questions/15610183/if-else-statements-in-antlr-using-listeners*/
/* A small imperative language */

start   :  cs+=command* EOF ;

command : CMD1
    | CMD2
    | CMD3
    ;

type : TYPE
    | STRING
    ;

expr: e1=expr op=MULTI e2=expr      # MUL
   | e1=expr op=OPERATOR e2=expr    # OP
   | NUM                            # Num
   | c=FLOAT                        # Constant
   | x=ID                           # Variable
   | '(' e=expr')'                  # Parenthesis
   | op=(TRUE|FALSE)                # boolean
   ;

condition : e1=expr ALL_OPERATORS e2=expr # ALLOPERATORS
    | e1=expr AND_OP e2=expr        # AND
    | e1=expr OR_OP e2=expr         # OR
     // ... extend me
     ;

STRING : [a-zA-Z_] [a-zA-Z]*;
ALL_OPERATORS : ('==' | '!=' | '<' | '>');
OBRACE : '{';
CBRACE : '}';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
NOT : '!';
TYPE: '.' STRING;
OR_OP : ('||');
AND_OP : ('&&');
MULTI : (MULT | DIV);
OPERATOR : (PLUS | MINUS);
FALSE   : [0] ;
TRUE    : [1];
WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;