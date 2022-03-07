grammar timc;

WS : [ \t\r\n]* -> skip ;

NUMBER  : '-'?[1-9][0-9]* ;
BOOL    : 'true' | 'false' ;
STRING  : '"'[^"]*'"' ;
BLOCK   : 'DIRT'
        | 'SAND'
        | 'STONE'
        | 'BRICK'
        | 'GLASS'
        | 'WOOD'
        | 'PLANK'
        ;
ID      : [a-zA-Z_][0-9a-zA-Z_]* ;
list   : '[' (constant (',' constant)*)* ']' ;

statements  : statement statements? ;
statement   : assignment
            | expression
            | function_application
            | control_structure
            | 'return' expression
            ;

control_structure : 'if' expression 'do' statements? ('else' 'if' expression 'do'  statements)* ('else' 'do' statements)?  'end'
     | 'while' expression 'do' statements 'end'
     | 'repeat' expression 'do' statements 'end'
     | 'foreach' ID 'in' expression 'do' statements 'end'
     | 'switch' expression 'do' ('case' expression 'do' statements
       'end')* ('default' 'do' statements 'end')? 'end'
     ;

expression      : and_expression ('or' and_expression)* ;
and_expression  : equality ('and' equality)* ;
equality        : comparison ( ( '==' | '!=' ) comparison )* ;
comparison      : term ( ( '<' | '<=' | '>' | '>=' ) term )* ;
term            : factor ( ( '+' | '-' | '++' ) factor )* ;
factor          : power ( ( '*' | '/' | '%' ) power )* ;
power           : (unary '^')* unary ;
unary           : ( ( 'not' | '-' ) )* primary ;
primary         : ID | function_application | '(' expression ')' | constant ;
constant        : NUMBER | BOOL | STRING | BLOCK | list | anonymous_function ;
assignment      : ID ( '=' | '+=' | '-=' | '*=' | '^=' | '%=' ) expression ;
function        : 'function' ID '(' parameters? ')' 'do'  statements 'end'
                | anonymous_function
                ;
anonymous_function  : 'function' '(' parameters? ')' 'do' statements 'end'
                    | 'fn' ID* '->' expression
                    ;
function_application : ID '(' arguments? ')'
                     | '(' anonymous_function ')' '(' arguments? ')'
                     ;
parameters  : ID (',' ID)* ;
arguments   : expression (',' expression)* ;