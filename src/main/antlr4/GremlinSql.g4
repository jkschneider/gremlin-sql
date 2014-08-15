grammar GremlinSql;

result_column
 : '*'
 ;

select
 : K_SELECT result_column ( ',' result_column )* K_FROM table_name
   ( K_WHERE where_clause )?
 ;

where_clause
 : table_name '.' column_name
    (K_EQ | K_NEQ | K_GT | K_GTE | K_LTE | K_LT)
    literal_value                                                                   # whereCompare
 | table_name '.' column_name K_IN '(' literal_value (',' literal_value)* ')'       # whereIn
 | where_clause AND where_clause                                                    # whereAnd

// | expr ( '=' | '==' | '!=' | '<>' | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP ) expr

// | unary_operator expr
// | expr '||' expr
// | expr ( '*' | '/' | '%' ) expr
// | expr ( '+' | '-' ) expr
// | expr ( '<<' | '>>' | '&' | '|' ) expr
// | expr ( '<' | '<=' | '>' | '>=' ) expr
// | expr K_AND expr
// | expr K_OR expr
// | function_name '(' ( K_DISTINCT? expr ( ',' expr )* | '*' )? ')'
// | K_CAST '(' expr K_AS type_name ')'
// | expr K_COLLATE collation_name
// | expr K_NOT? ( K_LIKE | K_GLOB | K_REGEXP | K_MATCH ) expr ( K_ESCAPE expr )?
// | expr ( K_ISNULL | K_NOTNULL | K_NOT K_NULL )
// | expr K_IS K_NOT? expr
// | expr K_NOT? K_BETWEEN expr K_AND expr
// | expr K_NOT? K_IN ( '(' ( select_stmt
//                          | expr ( ',' expr )*
//                          )?
//                      ')'
//                    | ( database_name '.' )? table_name )
// | ( ( K_NOT )? K_EXISTS )? '(' select_stmt ')'
// | K_CASE expr? ( K_WHEN expr K_THEN expr )+ ( K_ELSE expr )? K_END
// | raise_function
 ;

literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 | K_NULL
 | K_CURRENT_TIME
 | K_CURRENT_DATE
 | K_CURRENT_TIMESTAMP
 ;

table_name
 : any_name
 ;

column_name
 : any_name
 ;

any_name
 : IDENTIFIER
 | STRING_LITERAL
 | '(' any_name ')'
 ;

K_SELECT : S E L E C T;
K_FROM: F R O M;
K_NULL: N U L L;
K_CURRENT_DATE : C U R R E N T '_' D A T E;
K_CURRENT_TIME : C U R R E N T '_' T I M E;
K_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P;
K_WHERE: W H E R E;
K_EQ: '=';
K_NEQ: ('!=' | '<>');
K_GT: '>';
K_GTE: '>=';
K_LT: '<';
K_LTE: '<=';
K_IN: I N;
K_AND: A N D;

IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 | '[' ~']'* ']'
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

WS :  [ \t\r\n\u000C]+ -> skip;