grammar impl;
/*https://stackoverflow.com/questions/15610183/if-else-statements-in-antlr-using-listeners*/
/* A small imperative language */

start   :  cs+=command* EOF ;

/*Command..*/
command : 'true'
    | 'false'
    | CMD3
    ;

/*Type..*/
type : TYPE
    | STRING
    ;

/*Expressions*/
expr: e1=expr op=MULTI e2=expr      # MUL
   | e1=expr op=OPERATOR e2=expr    # OP
   | NUM                            # Num
   | c=FLOAT                        # Constant
   | x=ID                           # Variable
   | '(' e=expr')'                  # Parenthesis
   | op=(TRUE|FALSE)                # boolean
   ;

/*Operators & Binary numbers..*/
condition : e1=expr ALL_OPERATORS e2=expr # ALLOPERATORS
    | e1=expr AND_OP e2=expr        # AND
    | e1=expr OR_OP e2=expr         # OR
     // ... extend me
     ;

/*Definations..*/
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