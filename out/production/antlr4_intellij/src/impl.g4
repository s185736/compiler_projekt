grammar impl;
/*https://stackoverflow.com/questions/15610183/if-else-statements-in-antlr-using-listeners*/
/* A small imperative language */

start   :  cs+=command* EOF ;

/*Command..*/
command : x=CHARACTERS '=' e=expr ';'                               # Assignment
   | BINARY e=expr ';'                                    # Output
   | NOT e=expr ';'                                       # WhileLoop
   | OR_OP e=expr ';'                                     # IfStat
   | AND_OP e=expr ';'                                    # IfStatement
   ;

//command : x=CHARACTERS '=' e=expr ';'
/*Type..*/
id : TYPE
    | CHARACTERS
    ;

/*Expressions*/
expr: e1=expr op=MULTI e2=expr      # MUL
   | e1=expr op=OPERATOR e2=expr    # OP
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
CHARACTERS : [a-zA-Z_] [a-zA-Z]*;
ALL_OPERATORS : ('==' | '!=' | '<' | '>');
OBRACE : '{';
CBRACE : '}';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
NOT : '!';
TYPE: '.' CHARACTERS;
OR_OP : ('||');
AND_OP : ('&&');
BINARY : ('||' | '&&');
MULTI : (MULT | DIV);
OPERATOR : (PLUS | MINUS);
FALSE   : [0] ;
TRUE    : [1];
WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;