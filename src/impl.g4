grammar impl;
/*https://stackoverflow.com/questions/15610183/if-else-statements-in-antlr-using-listeners*/
/* A small imperative language */

start   :  cs+=command* EOF ;

program : c=command                      # SingleCommand
   | OBRACE cs+=command* CBRACE          # MultipleCommands
   ;

command : x=ID '=' e=expr ';'                               # Assignment
   | 'output' e=expr ';'                                    # Output
   | 'while' '('c=condition')' p=program                    # WhileLoop
   | 'if' '(' c=condition')' p=program                      # IfStat
   | 'if' '('c1=condition')' p1=program 'else' p2=program   # IfStatement
   ;

expr: e1=expr op=MULTI e2=expr      # MUL
   | e1=expr op=OPERATOR e2=expr    # OP
   | NUM                            # Num
   | c=FLOAT                        # Constant
   | x=ID                           # Variable
   | '(' e=expr')'                  # Parenthesis
   ;

condition : e1=expr ALL_OPERATORS e2=expr # ALLOPERATORS
    | e1=expr AND_OP e2=expr # AND
    | e1=expr OR_OP e2=expr # OR
     // ... extend me
     ;
ID : [a-zA-Z_] [a-zA-Z_0-9]*;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

ALL_OPERATORS : ('==' | '!=' | '<' | '>');
OBRACE : '{';
CBRACE : '}';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
OR_OP : ('||');
AND_OP : ('&&');
MULTI : (MULT | DIV);
OPERATOR : (PLUS | MINUS);

ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT    : '//'~[\n]*  -> skip;
COMMENT2   : '/*' (~[*] | '*'~[/]  )*   '*/'  -> skip;