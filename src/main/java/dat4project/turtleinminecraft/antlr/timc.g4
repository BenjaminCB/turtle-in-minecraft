grammar timc;

WS: [ \t\r\n]* -> skip;
COMMENT: '/*' .*? '*/' -> skip;

//Tokens
NUMBER: [0-9]+;
BOOL: 'true' | 'false';
STRING: '"' ('\\' ["\\n] | ~["\\\r\n])* '"';
NOTHING: 'nothing';
BLOCK: 'BLOCK:' + [A-Z_]*;
RELDIR: 'UP' | 'DOWN' | 'FRONT' | 'BACK' | 'LEFT' | 'RIGHT';
ABSDIR: 'NORTH' | 'SOUTH' | 'EAST' | 'WEST';

//Expression tokens
NOT: 'not';
SUB: '-';
POWER: '^';
MULT: '*';
DIV: '/';
MOD: '%';
ADD: '+';
CONCAT: '++';
LT: '<';
LTEQ: '<=';
GT: '>';
GTEQ: '>=';
EQ: '==';
NEQ: '!=';
AND: 'and';
OR: 'or';

//Assignment tokens
ASSIGN: '=' ;
ADDASSIGN: '+=' ;
SUBASSIGN: '-=' ;
MULTASSIGN: '*=' ;
DIVASSIGN: '/=' ;
MODASSIGN: '%=' ;
POWERASSIGN: '^=' ;

//ID token defined last, to prevent conflict with other tokens
ID: [a-zA-Z_][0-9a-zA-Z_]*;


array: '[' (expression (',' expression)*)* ']';

statements: statement+;
statement:
	assignment										# AssignStmt
	| expression									# ExprStmt
	| function										# FuncStmt
	| control_structure								# CtrlStmt
	| 'return' expression_list              		# RetStmt
	| 'break'                                       # BreakStmt
	;

control_structure:
	'if' expression 'do' statements? (
		'else' 'if' expression 'do' statements
	)* ('else' 'do' statements)? 'end'						# IfCtrl
	| 'while' expression 'do' statements 'end'				# WhileCtrl
	| 'repeat' expression 'do' statements 'end'				# RepeatCtrl
	| 'foreach' ID 'in' expression 'do' statements 'end'	# ForeachCtrl
	| 'switch' expression 'do' (
		'case' expression 'do' statements 'end'
	)* ('default' 'do' statements 'end')? 'end'             # SwitchCtrl;

assignment:
	identifier ASSIGN expression # SingleAssign
	| identifier op = (ADDASSIGN | SUBASSIGN | MULTASSIGN | DIVASSIGN | MODASSIGN | POWERASSIGN) expression # CompoundAssign
	| identifier_list ASSIGN expression_list # MultiAssign
	;

identifier: ID('[' expression ']')* ;
identifier_list: identifier (',' identifier)* ;
expression_list: expression (',' expression)* ;

expression:
	'(' expression ')'										# ParenExpr
	| expression '[' expression ']'                         # IndexExpr
	| function_application									# FuncAppExpr
	| <assoc = right> op = (NOT | SUB) expression			# UnaryExpr
	| <assoc = right> expression POWER expression			# PowerExpr
	| expression op = (MULT | DIV | MOD) expression			# FactorExpr
	| expression op = (ADD | SUB | CONCAT) expression		# TermExpr
	| expression op = (LT | LTEQ | GT | GTEQ) expression	# CompExpr
	| expression op = ( EQ | NEQ) expression				# EqExpr
	| expression AND expression								# AndExpr
	| expression OR expression								# OrExpr
	| constant												# ConstExpr
	| ID						        					# IdExpr;

constant:
	NUMBER					        # NumberConst
	| BOOL					        # BoolConst
	| STRING				        # StringConst
	| BLOCK					        # BlockConst
	| RELDIR				        # RelDirConst
	| ABSDIR				        # AbsDirConst
	| NOTHING                       # NothingConst
	| array				        	# ArrayConst
	| anonymous_function	        # AnonFuncConst;

function:
	'function' ID '(' parameters? ')' 'do' statements 'end' # DclFunc
	| anonymous_function				        			# AnonFunc;

anonymous_function:
	'function' '(' parameters? ')' 'do' statements 'end'	# StmtAnonFunc
	| 'fn' ID* '->' expression								# LambdaAnonFunc;

function_application:
	ID '(' expression_list? ')'										# IdFuncApp
	| '(' anonymous_function ')' '(' expression_list? ')'	        # ConstFuncApp
	| build_in_func 												# BuildInFunc;

build_in_func:
	'forward' '(' expression? ')'			# ForwardFunc
	| 'backward' '(' expression? ')'		# BackwardFunc
	| 'up' '(' expression? ')'				# UpFunc
	| 'down' '(' expression? ')'			# DownFunc
	| 'look' '(' expression ')' 			# LookFunc
	| 'turn' '(' expression ')'				# TurnFunc
	| 'print' '(' expression? ')'			# PrintFunc
	| 'facing' '(' ')'						# FacingFunc
	| 'position' '(' ')'					# PositionFunc
	| 'length' '(' expression ')'           # LengthFunc;

parameters: ID (',' ID)*;