grammar impl1;

WS  :   (' ' | '\t' | '\n' | '\r' | '\f')+ -> skip;

program
    :
    input EOF;

input
    :   inputText ('%' statement inputText)*
    ;

inputText
    :   ~('%')*
    ;

statement
    :   Identifier '=' DecimalConstant ';'
    ;

DecimalConstant
    :   [0-9]+
    ;

Identifier
        :   Letter LetterOrDigit*
        ;

fragment
Letter
        :   [a-zA-Z$#@_.]
        ;

fragment
LetterOrDigit
        :   [a-zA-Z0-9$#@_.]
        ;