grammar timc;

WS: [ \t\r\n]* -> skip;
LINE_COMMENT: '//' .*? '\r'? '\n' -> skip;
COMMENT: '/*' .*? '*/' -> skip;

NUMBER: [0-9]+;
BOOL: 'true' | 'false';
STRING: '"' [^"]* '"';
ID: [a-zA-Z_][0-9a-zA-Z_]*;

BLOCK: 'DIRT'
	 | 'SAND'
	 | 'STONE'
	 | 'BRICK'
	 | 'GLASS'
	 | 'WOOD'
	 | 'PLANK'
	 ;
RELDIR: 'UP' | 'DOWN' | 'FRONT' | 'BACK' | 'LEFT' | 'RIGHT';
ABSDIR: 'NORTH' | 'SOUTH' | 'EAST' | 'WEST';

list: '[' (constant (',' constant)*)* ']';

statements: statement+;
statement: assignment									# AssignStmt
		 | expression									# ExprStmt
		 | function										# FuncStmt
		 | function_application							# FuncAppStmt
		 | control_structure							# CtrlStmt
		 | 'return' expression? (',' expression)*		# RetStmt
		 ;

control_structure: 'if' expression 'do' statements? (
				   'else' 'if' expression 'do' statements
				   )* ('else' 'do' statements)? 'end'					# IfCtrl
				 | 'while' expression 'do' statements 'end'				# WhileCtrl
				 | 'repeat' expression 'do' statements 'end'			# RepeatCtrl
				 | 'foreach' ID 'in' expression 'do' statements 'end'	# ForeachCtrl
				 | 'switch' expression 'do' (
				   'case' expression 'do' statements 'end'
				   )* ('default' 'do' statements 'end')? 'end'			# SwitchCtrl
				 ;

assignment: ID ('=' | '+=' | '-=' | '*=' | '^=' | '%=') expression;

expression: '(' expression ')'										# ParenExpr
		  | function_application									# FuncAppExpr
		  | <assoc = right> op=('not' | '-') expression				# UnaryExpr
		  | <assoc = right> expression '^' expression				# PowerExpr
		  | expression op=( '*' | '/' | '%') expression				# FactorExpr
		  | expression op=( '+' | '-' | '++') expression			# TermExpr
		  | expression op=( '<' | '<=' | '>' | '>=') expression		# CompExpr
		  | expression op=('==' | '!=') expression					# EqExpr
		  | expression 'and' expression								# AndExpr
		  | expression 'or' expression								# OrExpr
		  | constant												# ConstExpr
		  | ID														# IdExpr
		  ;

NOT    : 'not' ;
SUB    : '-'   ;
POWER  : '^'   ;
MULT   : '*'   ;
DIV    : '/'   ;
MOD    : '%'   ;
ADD    : '+'   ;
CONCAT : '++'  ;
LT     : '<'   ;
LTEQ   : '<='  ;
GT     : '>'   ;
GTEQ   : '>='  ;
EQ     : '=='  ;
NEQ    : '!='  ;
AND    : 'and' ;
OR     : 'or'  ;

constant: NUMBER				# NumberConst
		| BOOL					# BoolConst
		| STRING				# StringConst
		| BLOCK					# BlockConst
		| RELDIR				# RelDirConst
		| ABSDIR				# AbsDirConst
		| list					# ListConst
		| anonymous_function	# AnonFuncConst
		;

function: 'function' ID '(' parameters? ')' 'do' statements 'end'	# DclFunc
		| anonymous_function										# AnonFunc
		;

anonymous_function: 'function' '(' parameters? ')' 'do' statements 'end' # StmtAnonFunc
				  | 'fn' ID* '->' expression							 # LambdaAnanFunc
				  ;

function_application: ID '(' arguments? ')'								 # IdFuncApp
					| '(' anonymous_function ')' '(' arguments? ')'		 # ConstFuncApp
					;

parameters: ID (',' ID)*;

arguments: expression (',' expression)*;
