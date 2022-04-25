grammar timc;

WS: [ \t\r\n]* -> skip;
LINE_COMMENT: '//' .*? '\r'? '\n' -> skip;
COMMENT: '/*' .*? '*/' -> skip;

NUMBER: [0-9]+;
BOOL: 'true' | 'false';
STRING: '"' [^"]* '"';
ID: [a-zA-Z_][0-9a-zA-Z_]*;

BLOCK:
	'DIRT'
	| 'SAND'
	| 'STONE'
	| 'BRICK'
	| 'GLASS'
	| 'WOOD'
	| 'PLANK';
RELDIR: 'UP' | 'DOWN' | 'FRONT' | 'BACK' | 'LEFT' | 'RIGHT';
ABSDIR: 'NORTH' | 'SOUTH' | 'EAST' | 'WEST';

array: '[' (constant (',' constant)*)* ']';

statements: statement+;
statement:
	assignment										# AssignStmt
	| expression									# ExprStmt
	| function										# FuncStmt
	| control_structure								# CtrlStmt
	| 'return' expression? (',' expression)*		# RetStmt
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
	ID op = (ASSIGN | ADDASSIGN | SUBASSIGN | MULTASSIGN | DIVASSIGN | MODASSIGN | POWERASSIGN) expression;

ASSIGN: '=' ;
ADDASSIGN: '+=' ;
SUBASSIGN: '-=' ;
MULTASSIGN: '*=' ;
DIVASSIGN: '/=' ;
MODASSIGN: '%=' ;
POWERASSIGN: '^=' ;

expression:
	'(' expression ')'										# ParenExpr
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

constant:
	NUMBER					        # NumberConst
	| BOOL					        # BoolConst
	| STRING				        # StringConst
	| BLOCK					        # BlockConst
	| RELDIR				        # RelDirConst
	| ABSDIR				        # AbsDirConst
	| array				        	# arrayConst
	| anonymous_function	                        # AnonFuncConst;

function:
	'function' ID '(' parameters? ')' 'do' statements 'end' # DclFunc
	| anonymous_function				        # AnonFunc
	| build_in_func 							# BuildInFunc;

anonymous_function:
	'function' '(' parameters? ')' 'do' statements 'end'	# StmtAnonFunc
	| 'fn' ID* '->' expression				# LambdaAnonFunc;

function_application:
	ID '(' arguments? ')'					# IdFuncApp
	| '(' anonymous_function ')' '(' arguments? ')'	        # ConstFuncApp;

build_in_func:
	'forward' '(' expression? ')'			# ForwardFunc
	| 'backward' '(' expression? ')'		# BackwardFunc
	| 'up' '(' expression? ')'				# UpFunc
	| 'down' '(' expression? ')'			# DownFunc
	| 'look' '(' RELDIR ')' 				# LookFunc
	| 'turn' '(' (RELDIR | ABSDIR) ')'		# TurnFunc
	| 'print' '(' expression? ')'			# PrintFunc
	| 'facing' '(' ')'						# FacingFunc
	| 'position' '('( ' ' | NUMBER',' NUMBER',' NUMBER)')'	# PositionFunc;

parameters: ID (',' ID)*;

arguments: expression (',' expression)*;
