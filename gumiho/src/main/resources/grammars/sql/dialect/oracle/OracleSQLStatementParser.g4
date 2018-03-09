parser grammar OracleSQLStatementParser;

options {tokenVocab=OracleSQLStatementLexer;}
@members {boolean version12=true;}

parse
    : ((sqlStatement | sql_plus_command) SEMI?)* EOF
    ;

swallow_to_semi
    : ~SEMI+
    ;

emptyStatement
    : SEMI
    ;

sqlStatement
   : ddlStatement | dmlStatement
//    | anonymous_block
    ;

ddlStatement
    : createTableStatement | alterTableStatement | dropTableStatement
    | createViewStatement | dropViewStatement
    | createMaterializedViewStatement //TODO
    | createSynonymStatement
    //| create_index //TODO
    | createTypeStatement | alterTypeStatement | dropTypeStatement
    | createTypeBodyStatement

    | createFunctionBody | alterFunctionStatement | dropFunctionStatement

    | createSequenceStatement | alterSequenceStatement | dropSequenceStatement
    | createTriggerStatement | alterTriggerStatement | dropTriggerStatement

    | createProcedureStatement | alterProcedureStatement | dropProcedureStatement
//  | create_directory //TODO
    | create_package | alter_package | drop_package
    | create_package_body

    | comment_on_column
    | comment_on_table
    ;

dmlStatement
    : merge_statement
    | lock_table_statement
    | select_statement
    | update_statement
    | delete_statement
    | insert_statement
    | explain_statement
    ;

// DDL
// DML

// $<Function DDLs

dropFunctionStatement
    : DROP FUNCTION function_name SEMI
    ;

alterFunctionStatement
    : ALTER FUNCTION function_name COMPILE DEBUG? compiler_parameters_clause* (REUSE SETTINGS)? SEMI
    ;

createFunctionBody
    : CREATE (OR REPLACE)? FUNCTION function_name (LEFT_PAREN parameter (COMMA parameter)* RIGHT_PAREN)?
      RETURN type_spec (invoker_rights_clause|parallel_enable_clause|result_cache_clause|DETERMINISTIC)*
      ((PIPELINED? (IS | AS) (DECLARE? declare_spec* body | call_spec)) | (PIPELINED | AGGREGATE) USING implementation_type_name) SEMI
    ;

// $<Creation Function - Specific Clauses

parallel_enable_clause
    : PARALLEL_ENABLE partition_by_clause?
    ;

partition_by_clause
    : LEFT_PAREN PARTITION expression BY (ANY | (HASH | RANGE) LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN)streaming_clause? RIGHT_PAREN
    ;

result_cache_clause
    : RESULT_CACHE relies_on_part?
    ;

relies_on_part
    : RELIES_ON LEFT_PAREN tableview_name (COMMA tableview_name)* RIGHT_PAREN
    ;

streaming_clause
    : (ORDER | CLUSTER) expression BY LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN
    ;

// $<Package DDLs

drop_package
    : DROP PACKAGE BODY? (schema_object_name '.')? package_name SEMI
    ;

alter_package
    : ALTER PACKAGE package_name COMPILE DEBUG? (PACKAGE | BODY | SPECIFICATION)? compiler_parameters_clause* (REUSE SETTINGS)? SEMI
    ;

create_package
    : CREATE (OR REPLACE)? PACKAGE (schema_object_name '.')? package_name invoker_rights_clause? (IS | AS) package_obj_spec* END package_name? SEMI
    ;

create_package_body
    //: CREATE (OR REPLACE)? PACKAGE BODY (schema_object_name '.')? package_name (IS | AS) package_obj_body* (BEGIN seq_of_statements | END package_name?) SEMI
	: CREATE (OR REPLACE)? PACKAGE BODY (schema_object_name '.')? package_name (IS | AS) package_obj_body* (BEGIN seq_of_statements)? END package_name? SEMI
    ;

// $<Create Package - Specific Clauses

package_obj_spec
    : exception_declaration
    | pragma_declaration
    | procedure_spec
    | function_spec
    | variable_declaration
    | subtype_declaration
    | cursor_declaration
    | type_declaration
    ;

procedure_spec
    : PROCEDURE identifier (LEFT_PAREN parameter ( COMMA parameter )* RIGHT_PAREN)? SEMI 
    ;

function_spec
    : FUNCTION identifier (LEFT_PAREN parameter ( COMMA parameter)* RIGHT_PAREN)? RETURN type_spec parallel_enable_clause? (DETERMINISTIC)? (PIPELINED)? (RESULT_CACHE)? SEMI
    ;

package_obj_body
    : exception_declaration
    | pragma_declaration
    | procedure_spec
    | function_spec
    | variable_declaration
    | subtype_declaration 
    | cursor_declaration 
    | type_declaration
    | procedure_body
    | function_body
    ;

// $<Procedure DDLs

dropProcedureStatement
    : DROP PROCEDURE procedure_name SEMI
    ;

alterProcedureStatement
    : ALTER PROCEDURE procedure_name COMPILE DEBUG? compiler_parameters_clause* (REUSE SETTINGS)? SEMI
    ;

function_body
    : FUNCTION identifier (LEFT_PAREN parameter (COMMA parameter)* RIGHT_PAREN)?
      RETURN type_spec (invoker_rights_clause|parallel_enable_clause|result_cache_clause|DETERMINISTIC)*
      ((PIPELINED? (IS | AS) (DECLARE? declare_spec* body | call_spec)) | (PIPELINED | AGGREGATE) USING implementation_type_name) SEMI
    ;

procedure_body
    : PROCEDURE identifier (LEFT_PAREN parameter (COMMA parameter)* RIGHT_PAREN)? 
      (IS | AS)
      (DECLARE? declare_spec* body | call_spec | EXTERNAL) SEMI
    ;

createProcedureStatement
    : CREATE (OR REPLACE)? PROCEDURE procedure_name (LEFT_PAREN parameter (COMMA parameter)* RIGHT_PAREN)?
      invoker_rights_clause? (IS | AS)
      (DECLARE? declare_spec* body | call_spec | EXTERNAL) SEMI
    ;

// $>

// $<Trigger DDLs

dropTriggerStatement
    : DROP TRIGGER trigger_name SEMI
    ;

alterTriggerStatement
    : ALTER TRIGGER tn1=trigger_name
      ((ENABLE | DISABLE) | RENAME TO tn2=trigger_name | COMPILE DEBUG? compiler_parameters_clause* (REUSE SETTINGS)?) SEMI
    ;

createTriggerStatement
    : CREATE ( OR REPLACE )? TRIGGER trigger_name
    (simple_dml_trigger | compound_dml_trigger | non_dml_trigger)
    trigger_follows_clause? (ENABLE | DISABLE)? trigger_when_clause? trigger_body SEMI
    ;

trigger_follows_clause
    : FOLLOWS trigger_name (COMMA trigger_name)*
    ;

trigger_when_clause
    : WHEN LEFT_PAREN condition RIGHT_PAREN
    ;

// $<Create Trigger- Specific Clauses
simple_dml_trigger
    : (BEFORE | AFTER | INSTEAD OF) dml_event_clause referencing_clause? for_each_row?
    ;

for_each_row
    : FOR EACH ROW
    ;

compound_dml_trigger
    : FOR dml_event_clause referencing_clause?
    ;

non_dml_trigger
    : (BEFORE | AFTER) non_dml_event (OR non_dml_event)* ON (DATABASE | (schema_name '.')? SCHEMA)
    ;

trigger_body
    : COMPOUND TRIGGER
    | CALL identifier
    | trigger_block
    ;

compound_trigger_block
    : COMPOUND TRIGGER declare_spec* timing_point_section+ END trigger_name
    ;

timing_point_section
    : bk=BEFORE STATEMENT IS trigger_block BEFORE STATEMENT SEMI
    | bk=BEFORE EACH ROW IS trigger_block BEFORE EACH ROW SEMI
    | ak=AFTER STATEMENT IS trigger_block AFTER STATEMENT SEMI
    | ak=AFTER EACH ROW IS trigger_block AFTER EACH ROW SEMI
    ;

non_dml_event
    : ALTER
    | ANALYZE
    | ASSOCIATE STATISTICS
    | AUDIT
    | COMMENT
    | CREATE
    | DISASSOCIATE STATISTICS
    | DROP
    | GRANT
    | NOAUDIT
    | RENAME
    | REVOKE
    | TRUNCATE
    | DDL
    | STARTUP
    | SHUTDOWN
    | DB_ROLE_CHANGE
    | LOGON
    | LOGOFF
    | SERVERERROR
    | SUSPEND
    | DATABASE
    | SCHEMA
    | FOLLOWS
    ;

dml_event_clause
    : dml_event_element (OR dml_event_element)* ON dml_event_nested_clause? tableview_name
    ;

dml_event_element
    : (DELETE|INSERT|UPDATE) (OF column_name (COMMA column_name)*)?
    ;

dml_event_nested_clause
    : NESTED TABLE tableview_name OF
    ;

referencing_clause
    : REFERENCING referencing_element+
    ;

referencing_element
    : (NEW | OLD | PARENT) column_alias
    ;

// $>
// $>

// $<Type DDLs

dropTypeStatement
    : DROP TYPE BODY? type_name (FORCE | VALIDATE)? SEMI
    ;

alterTypeStatement
    : ALTER TYPE type_name
    (compile_type_clause
    | replace_type_clause
    //TODO | {input.LT(2).getText().equalsIgnoreCase("attribute")}? alter_attribute_definition
    | alter_method_spec
    | alter_collection_clauses
    | modifier_clause
    ) dependent_handling_clause? SEMI
    ;

// $<Alter Type - Specific Clauses
compile_type_clause
    : COMPILE DEBUG? (SPECIFICATION | BODY)? compiler_parameters_clause* (REUSE SETTINGS)?
    ;

replace_type_clause
    : REPLACE invoker_rights_clause? AS OBJECT LEFT_PAREN object_member_spec (COMMA object_member_spec)* RIGHT_PAREN
    ;

alter_method_spec
    : alter_method_element (COMMA alter_method_element)*
    ;

alter_method_element
    : (ADD|DROP) (map_order_function_spec | subprogram_spec)
    ;

alter_attribute_definition
    : (ADD | MODIFY | DROP) ATTRIBUTE (attribute_definition | LEFT_PAREN attribute_definition (COMMA attribute_definition)* RIGHT_PAREN)
    ;

attribute_definition
    : attribute_name type_spec?
    ;

alter_collection_clauses
    : MODIFY (LIMIT expression | ELEMENT TYPE type_spec)
    ;

dependent_handling_clause
    : INVALIDATE
    | CASCADE (CONVERT TO SUBSTITUTABLE | NOT? INCLUDING TABLE DATA)? dependent_exceptions_part?
    ;

dependent_exceptions_part
    : FORCE? EXCEPTIONS INTO tableview_name
    ;

createTypeStatement
    : CREATE (OR REPLACE)? TYPE type_definition SEMI? // some of type from yintai has no semi in the end.
    ;

createTypeBodyStatement
    : CREATE (OR REPLACE)? TYPE type_body SEMI? // some of type from yintai has no semi in the end.
    ;

// $<Create Type - Specific Clauses
type_definition
    : type_name (OID CHAR_STRING)? object_type_def?
    ;

object_type_def
    : invoker_rights_clause? (object_as_part | object_under_part) sqlj_object_type? 
      (LEFT_PAREN object_member_spec (COMMA object_member_spec)* RIGHT_PAREN)? modifier_clause*
    ;

object_as_part
    : (IS | AS) (OBJECT | varray_type_def | nested_table_type_def)
    ;

object_under_part
    : UNDER type_spec
    ;

nested_table_type_def
    : TABLE OF type_spec (NOT NULL)?
    ;

sqlj_object_type
    : EXTERNAL NAME expression LANGUAGE JAVA USING (SQLDATA|CUSTOMDATUM|ORADATA)
    ;

type_body
    : BODY type_name (IS | AS) (type_body_elements)+ END
    ;

type_body_elements
    : map_order_func_declaration
    | subprog_decl_in_type
    ;

map_order_func_declaration
    : (MAP | ORDER) MEMBER func_decl_in_type
    ;

subprog_decl_in_type
    : (MEMBER | STATIC)? (proc_decl_in_type | func_decl_in_type | constructor_declaration)
    ;

proc_decl_in_type
    : PROCEDURE procedure_name LEFT_PAREN parameter (COMMA parameter)* RIGHT_PAREN
      (IS | AS) (call_spec | DECLARE? declare_spec* body SEMI)
    ;

func_decl_in_type
    : FUNCTION function_name (LEFT_PAREN parameter (COMMA parameter)* RIGHT_PAREN)?
      RETURN type_spec (IS | AS) (call_spec | DECLARE? declare_spec* body SEMI)
    ;

constructor_declaration
    : FINAL? INSTANTIABLE? CONSTRUCTOR FUNCTION constructor_name
      (LEFT_PAREN (SELF IN OUT type_spec COMMA)? parameter (COMMA parameter)*  RIGHT_PAREN)?
      RETURN SELF AS RESULT (IS | AS) (call_spec | DECLARE? declare_spec* body SEMI)
    ;

// $>

// $<Common Type Clauses

modifier_clause
    : NOT? (INSTANTIABLE | FINAL | OVERRIDING)
    ;

object_member_spec
    : identifier type_spec sqlj_object_type_attr?
    | element_spec
    ;

sqlj_object_type_attr
    : EXTERNAL NAME expression
    ;

element_spec
    : modifier_clause? element_spec_options+ (COMMA pragma_clause)?
    ;

element_spec_options
    : subprogram_spec
    | constructor_spec
    | map_order_function_spec
    ;

subprogram_spec
    : (MEMBER|STATIC) (type_procedure_spec|type_function_spec)
    ;

type_procedure_spec // liufang
    : PROCEDURE procedure_name LEFT_PAREN (SELF IN OUT NOCOPY type_spec (COMMA)? )? (parameter (COMMA parameter)*)? RIGHT_PAREN ((IS | AS) call_spec)?
    ;

return_type_spec // liufang
    : datatype
    | REF? type_name (PERCENT_ROWTYPE | PERCENT_TYPE)?
    ;

type_function_spec // liufang
    : FUNCTION function_name (LEFT_PAREN (SELF IN OUT NOCOPY type_spec (COMMA)? )? (parameter (COMMA parameter)*)? RIGHT_PAREN)?
      RETURN (return_type_spec | SELF AS RESULT) (parallel_enable_clause | DETERMINISTIC)* ((IS | AS) call_spec | EXTERNAL VARIABLE? NAME expression)?
    ;

constructor_spec // liufang
    : FINAL? INSTANTIABLE? CONSTRUCTOR FUNCTION constructor_name (LEFT_PAREN (SELF IN OUT NOCOPY type_spec (COMMA)? )? (parameter (COMMA parameter)*)?  RIGHT_PAREN)?  RETURN SELF AS RESULT (parallel_enable_clause | DETERMINISTIC)* ((IS | AS) call_spec)?
    ;

map_order_function_spec
    : (MAP | ORDER) MEMBER type_function_spec
    ;

pragma_clause
    : PRAGMA RESTRICT_REFERENCES LEFT_PAREN pragma_elements (COMMA pragma_elements)* RIGHT_PAREN
    ;

pragma_elements
    : identifier
    | DEFAULT
    ;
//liufang
//type_elements_parameter
//    : parameter_name (IN | OUT | INOUT | NOCOPY)* type_spec default_value_part?
//    ;

// $<Sequence DDLs

dropSequenceStatement
    : DROP SEQUENCE sequence_name SEMI
    ;

alterSequenceStatement
    : ALTER SEQUENCE sequence_name sequence_spec+ SEMI
    ;

createSequenceStatement
    : CREATE SEQUENCE sequence_name (sequence_start_clause | sequence_spec)* SEMI
    ;

// $<Common Sequence

sequence_spec
    : INCREMENT BY UNSIGNED_INTEGER
    | MAXVALUE UNSIGNED_INTEGER
    | NOMAXVALUE
    | MINVALUE UNSIGNED_INTEGER
    | NOMINVALUE
    | CYCLE
    | NOCYCLE
    | CACHE_NUMBER
    | NOCACHE
    | ORDER
    | NOORDER
    ;

sequence_start_clause
    : START WITH UNSIGNED_INTEGER
    ;

// DDL Clauses

// Table
createTableStatement
    : CREATE TABLE tableview_name LEFT_PAREN column_name datatype (COMMA column_name datatype)* RIGHT_PAREN
    ;

alterTableStatement
    : ALTER TABLE tableview_name add_constraint
    // TODO | drop_constraint
    ;

dropTableStatement
    : DROP TABLE tableview_name
    ;


// view

createViewStatement
    : CREATE VIEW tableview_name select_statement
    ;

dropViewStatement
    :
    ;

// Materialized View
createMaterializedViewStatement
    :;

comment_on_column
    : COMMENT_ON_COLUMN tableview_name PERIOD column_name IS quoted_string
    ;

// $<Synonym DDL Clauses

createSynonymStatement
    // Synonym's schema cannot be specified for public synonyms
    : CREATE (OR REPLACE)? PUBLIC SYNONYM synonym_name FOR (schema_name PERIOD)? schema_object_name (AT_SIGN link_name)?
    | CREATE (OR REPLACE)? SYNONYM (schema_name PERIOD)? synonym_name FOR (schema_name PERIOD)? schema_object_name (AT_SIGN link_name)?
    ;

comment_on_table
    : COMMENT ON TABLE tableview_name IS quoted_string
    ;


add_constraint
    : ADD (CONSTRAINT constraint_name)? (primary_key_clause | foreign_key_clause | unique_key_clause)
    // TODO | implement check_constraint_clause, but need separate rule boolean_expression
    ;

foreign_key_clause
    : FOREIGN KEY LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN references_clause on_delete_clause?
    ;

references_clause
    : REFERENCES tableview_name LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN
    ;

on_delete_clause
    : ON DELETE (CASCADE | SET NULL)
    ;

unique_key_clause
    : UNIQUE LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN
      // TODO implement  USING INDEX clause
    ;

primary_key_clause
    : PRIMARY KEY LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN
      // TODO implement  USING INDEX clause
    ;

// $<Anonymous PL/SQL code block

anonymous_block
    : BEGIN seq_of_statements END SEMI
    ;

// $<Common DDL Clauses

invoker_rights_clause
    : AUTHID (CURRENT_USER|DEFINER)
    ;

compiler_parameters_clause
    : identifier '=' expression
    ;

call_spec
    : LANGUAGE (java_spec | c_spec)
    ;

// $<Call Spec - Specific Clauses

java_spec
    : JAVA NAME CHAR_STRING
    ;

c_spec
    : C_LETTER (NAME CHAR_STRING)? LIBRARY identifier c_agent_in_clause? (WITH CONTEXT)? c_parameters_clause?
    ;

c_agent_in_clause
    : AGENT IN LEFT_PAREN expression (COMMA expression)* RIGHT_PAREN
    ;

c_parameters_clause
    : PARAMETERS LEFT_PAREN (expression (COMMA expression)* | '.' '.' '.') RIGHT_PAREN
    ;

// $>

parameter
    : parameter_name (IN | OUT | INOUT | NOCOPY)* type_spec? default_value_part?
    ;

default_value_part
    : (ASSIGN_OP | DEFAULT) expression
    ;

// $<PL/SQL Elements Declarations

declare_spec
    : exception_declaration
    | pragma_declaration
    | procedure_spec
    | function_spec
    | variable_declaration
    | subtype_declaration
    | cursor_declaration
    | type_declaration
    | procedure_body
    | function_body
    ;

//incorporates constant_declaration
variable_declaration
    : identifier CONSTANT? type_spec (NOT NULL)? default_value_part? SEMI
    ;

subtype_declaration
    : SUBTYPE identifier IS type_spec (RANGE expression '..' expression)? (NOT NULL)? SEMI
    ;

//cursor_declaration incorportates curscursor_body and cursor_spec
cursor_declaration
    : CURSOR identifier parameter_specs (RETURN type_spec)? (IS select_statement)? SEMI
    ;

parameter_specs
	: (LEFT_PAREN parameter_spec (COMMA parameter_spec)* RIGHT_PAREN )?
	;

parameter_spec
    : parameter_name (IN? type_spec)? default_value_part?
    ;

exception_declaration 
    : identifier EXCEPTION SEMI
    ;

pragma_declaration
    : PRAGMA (SERIALLY_REUSABLE 
    | AUTONOMOUS_TRANSACTION
    | EXCEPTION_INIT LEFT_PAREN exception_name COMMA numeric_negative RIGHT_PAREN
    | INLINE LEFT_PAREN id1=identifier COMMA expression RIGHT_PAREN
    | RESTRICT_REFERENCES LEFT_PAREN (identifier | DEFAULT) (COMMA identifier)+ RIGHT_PAREN
    | TIMESTAMP LEFT_PAREN expression RIGHT_PAREN
    | INTERFACE LEFT_PAREN (identifier | DEFAULT) (COMMA identifier)+ RIGHT_PAREN
    | SUPPLEMENTAL_LOG_DATA LEFT_PAREN id2=identifier COMMA expression RIGHT_PAREN) SEMI
    ;

// $<Record Declaration - Specific Clauses

//incorporates ref_cursor_type_definition
record_type_def
    : RECORD LEFT_PAREN field_spec (COMMA field_spec)* RIGHT_PAREN 
    ;

field_spec
    : column_name type_spec? (NOT NULL)? default_value_part?
    ;

ref_cursor_type_def
    : REF CURSOR (RETURN type_spec)?
    ;

// $>

type_declaration
    :  TYPE identifier IS (table_type_def | varray_type_def | record_type_def | ref_cursor_type_def) SEMI
    ;

table_type_def
    : TABLE OF type_spec table_indexed_by_part? (NOT NULL)?
    ;

table_indexed_by_part
    : (idx1=INDEXED | idx2=INDEX) BY type_spec
    ;

varray_type_def
    : (VARRAY | VARYING ARRAY) LEFT_PAREN expression RIGHT_PAREN OF type_spec (NOT NULL)?
    ;

// $>

// $<PL/SQL Statements

seq_of_statements
    : (statement (SEMI | EOF) | label_declaration)+
    ;

label_declaration
    : ltp1= '<' '<' label_name '>' '>'
    ;

statement
    : CREATE swallow_to_semi
    | ALTER swallow_to_semi
    | GRANT ALL? swallow_to_semi
    | TRUNCATE swallow_to_semi
    | body
    | block
    | assignment_statement
    | continue_statement
    | exit_statement
    | goto_statement
    | if_statement
    | loop_statement
    | forall_statement
    | null_statement
    | raise_statement
    | return_statement
    | case_statement/*[true]*/
    | sql_statement
    | function_call
    | pipe_row_statement
    ;

assignment_statement
    : (general_element | bind_variable) ASSIGN_OP expression
    ;

continue_statement
    : CONTINUE label_name? (WHEN condition)?
    ;

exit_statement
    : EXIT label_name? (WHEN condition)?
    ;

goto_statement
    : GOTO label_name
    ;

if_statement
    : IF condition THEN seq_of_statements elsif_part* else_part? END IF
    ;

elsif_part
    : ELSIF condition THEN seq_of_statements
    ;

else_part
    : ELSE seq_of_statements
    ;

loop_statement
    : label_name? (WHILE condition | FOR cursor_loop_param)? LOOP seq_of_statements END LOOP label_name?
    ;

// $<Loop - Specific Clause

cursor_loop_param
    : index_name IN REVERSE? lower_bound range='..' upper_bound
    | record_name IN (cursor_name expression_list? | LEFT_PAREN select_statement RIGHT_PAREN)
    ;
// $>

forall_statement
    : FORALL index_name IN bounds_clause sql_statement (SAVE EXCEPTIONS)?
    ;

bounds_clause
    : lower_bound '..' upper_bound
    | INDICES OF collection_name between_bound?
    | VALUES OF index_name
    ;

between_bound
    : BETWEEN lower_bound AND upper_bound
    ;

lower_bound
    : concatenation
    ;

upper_bound
    : concatenation
    ;

null_statement
    : NULL
    ;

raise_statement
    : RAISE exception_name?
    ;

return_statement
    : RETURN expression?
    ;

function_call
    : CALL? general_element
    ;

pipe_row_statement
    : PIPE ROW LEFT_PAREN expression RIGHT_PAREN;

body
    : BEGIN seq_of_statements (EXCEPTION exception_handler+)? END label_name?
    ;

// $<Body - Specific Clause

exception_handler
    : WHEN exception_name (OR exception_name)* THEN seq_of_statements
    ;

// $>

trigger_block
    : (DECLARE? declare_spec+)? body
    ;

block
    : DECLARE? declare_spec+ body
    ;

// $>

// $<SQL PL/SQL Statements

sql_statement
    : execute_immediate
    | dmlStatement
    | cursor_manipulation_statements
    | transaction_control_statements
    ;

execute_immediate
    : EXECUTE IMMEDIATE expression (into_clause using_clause? | using_clause dynamic_returning_clause? | dynamic_returning_clause)?
    ;

// $<Execute Immediate - Specific Clause
dynamic_returning_clause
    : (RETURNING | RETURN) into_clause
    ;
// $>


// $<DML SQL PL/SQL Statements


// $>

// $<Cursor Manipulation SQL PL/SQL Statements

cursor_manipulation_statements
    : close_statement
    | open_statement
    | fetch_statement
    | open_for_statement
    ;

close_statement
    : CLOSE cursor_name
    ;

open_statement
    : OPEN cursor_name expression_list?
    ;

fetch_statement
    : FETCH cursor_name (it1=INTO variable_name (COMMA variable_name )* | BULK COLLECT INTO variable_name (COMMA variable_name )*)
    ;

open_for_statement
    : OPEN variable_name FOR (select_statement | expression) using_clause?
    ;

// $>

// $<Transaction Control SQL PL/SQL Statements

transaction_control_statements
    : set_transaction_command
    | set_constraint_command
    | commit_statement
    | rollback_statement
    | savepoint_statement
    ;

set_transaction_command
    : SET TRANSACTION 
      (READ (ONLY | WRITE) | ISOLATION LEVEL (SERIALIZABLE | READ COMMITTED) | USE ROLLBACK SEGMENT rollback_segment_name)?
      (NAME quoted_string)?
    ;

set_constraint_command
    : SET (CONSTRAINT | CONSTRAINTS) (ALL | constraint_name (COMMA constraint_name)*) (IMMEDIATE | DEFERRED)
    ;

commit_statement
    : COMMIT WORK? 
      //(COMMENT expression | FORCE (CORRUPT_XID expression| CORRUPT_XID_ALL | expression (COMMA expression)?))?
      (FORCE quoted_string)?
      //write_clause?
      (WRITE (WAIT|NOWAIT)? (IMMEDIATE|BATCH)? )?
    ;

//write_clause
//    : WRITE (WAIT|NOWAIT)? (IMMEDIATE|BATCH)?
//    ;

rollback_statement
    : ROLLBACK WORK? (TO SAVEPOINT? savepoint_name | FORCE quoted_string)?
    ;

savepoint_statement
    : SAVEPOINT savepoint_name 
    ;

// Dml

/* TODO
//SHOULD BE OVERRIDEN!
compilation_unit
    :  seq_of_statements* EOF
    ;

//SHOULD BE OVERRIDEN!
seq_of_statements 
    : select_statement
    | update_statement
    | delete_statement
    | insert_statement
    | lock_table_statement
    | merge_statement
    | explain_statement
//    | case_statement[true]
    ;
*/

explain_statement
    : EXPLAIN PLAN (SET STATEMENT_ID '=' quoted_string)? (INTO tableview_name)?
      FOR (select_statement | update_statement | delete_statement | insert_statement | merge_statement)
    ;

select_statement
    : subquery_factoring_clause? subquery (for_update_clause | order_by_clause)*
    ;

// $<Select - Specific Clauses
subquery_factoring_clause
    : WITH factoring_element (COMMA factoring_element)*
    ;

factoring_element
    : query_name (LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN)? AS LEFT_PAREN subquery order_by_clause? RIGHT_PAREN
      search_clause? cycle_clause?
    ;

search_clause
    : SEARCH (DEPTH | BREADTH) FIRST BY column_name ASC? DESC? (NULLS FIRST)? (NULLS LAST)?
      (COMMA column_name ASC? DESC? (NULLS FIRST)? (NULLS LAST)?)* SET column_name
    ;

cycle_clause
    : CYCLE column_name (COMMA column_name)* SET column_name TO expression DEFAULT expression
    ;

subquery
    : subquery_basic_elements subquery_operation_part*
    ;

subquery_operation_part
    : (UNION ALL? | INTERSECT | MINUS) subquery_basic_elements
    ;

subquery_basic_elements
    : query_block
    | LEFT_PAREN subquery RIGHT_PAREN
    ;

query_block
    : SELECT (DISTINCT | UNIQUE | ALL)? (ASTERISK | selected_element (COMMA selected_element)* )
      into_clause? from_clause where_clause? hierarchical_query_clause? group_by_clause? model_clause?
    ;

selected_element
    : select_list_elements column_alias?
    ;

from_clause
    : FROM table_ref_list
    ;

select_list_elements
    : tableview_name '.' '*'
    //| (regular_id '.')? expression     ps: regular_id is not always tableAlias, it thoeratically can be anything, owner, package, sequence, etc. No need to separate it with others.
    | expression
    ;

table_ref_list
    : table_ref (COMMA table_ref)*
    ;

// NOTE to PIVOT clause
// according the SQL reference this should not be possible
// according to he reality it is. Here we probably apply pivot/unpivot onto whole join clause
// eventhough it is not enclosed in parenthesis. See pivot examples 09,10,11
table_ref
    : table_ref_aux join_clause* (pivot_clause | unpivot_clause)?
    ;

table_ref_aux
    : table_ref_aux_internal flashback_query_clause* (/*{isTableAlias()}?*/ table_alias)?
    ;

table_ref_aux_internal
    :  dml_table_expression_clause (pivot_clause | unpivot_clause)?                # table_ref_aux_internal_one
    | LEFT_PAREN table_ref subquery_operation_part* RIGHT_PAREN (pivot_clause | unpivot_clause)?  # table_ref_aux_internal_two
    | ONLY LEFT_PAREN dml_table_expression_clause RIGHT_PAREN                                     # table_ref_aux_internal_three
    ;

join_clause
    : query_partition_clause? (CROSS | NATURAL)? (INNER | outer_join_type)? 
      JOIN table_ref_aux query_partition_clause? (join_on_part | join_using_part)*
    ;

join_on_part
    : ON condition
    ;

join_using_part
    : USING LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN
    ;

outer_join_type
    : (FULL | LEFT | RIGHT) OUTER?
    ;

query_partition_clause
    : PARTITION BY (LEFT_PAREN subquery RIGHT_PAREN | expression_list | expression (COMMA expression)*)
    ;

flashback_query_clause
    : VERSIONS BETWEEN (SCN | TIMESTAMP) expression
    | AS OF (SCN | TIMESTAMP | SNAPSHOT) expression
    ;

pivot_clause
    : PIVOT XML? LEFT_PAREN pivot_element (COMMA pivot_element)* pivot_for_clause pivot_in_clause RIGHT_PAREN
    ;

pivot_element
    : aggregate_function_name LEFT_PAREN expression RIGHT_PAREN column_alias?
    ;

pivot_for_clause
    : FOR (column_name | LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN)
    ;

pivot_in_clause
    : IN LEFT_PAREN (subquery | ANY (COMMA ANY)* | pivot_in_clause_element (COMMA pivot_in_clause_element)*) RIGHT_PAREN
    ;

pivot_in_clause_element
    : pivot_in_clause_elements column_alias?
    ;

pivot_in_clause_elements
    : expression
    | expression_list
    ;

unpivot_clause
    : UNPIVOT ((INCLUDE | EXCLUDE) NULLS)?
    LEFT_PAREN (column_name | LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN) pivot_for_clause unpivot_in_clause RIGHT_PAREN
    ;

unpivot_in_clause
    : IN LEFT_PAREN unpivot_in_elements (COMMA unpivot_in_elements)* RIGHT_PAREN
    ;

unpivot_in_elements
    : (column_name | LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN)
      (AS (constant | LEFT_PAREN constant (COMMA constant)* RIGHT_PAREN))?
    ;

hierarchical_query_clause
    : CONNECT BY NOCYCLE? condition start_part?
    | start_part CONNECT BY NOCYCLE? condition
    ;

start_part
    : START WITH condition
    ;

group_by_clause
    : GROUP BY group_by_elements (COMMA group_by_elements)* having_clause?
    | having_clause (GROUP BY group_by_elements (COMMA group_by_elements)*)?
    ;

group_by_elements
    : grouping_sets_clause
    | rollup_cube_clause 
    | expression
    ;

rollup_cube_clause
    : (ROLLUP|CUBE) LEFT_PAREN grouping_sets_elements (COMMA grouping_sets_elements)* RIGHT_PAREN
    ;

grouping_sets_clause
    : GROUPING SETS LEFT_PAREN grouping_sets_elements (COMMA grouping_sets_elements)* RIGHT_PAREN
    ;

grouping_sets_elements
    : rollup_cube_clause
    | expression_list
    | expression
    ;

having_clause
    : HAVING condition
    ;

model_clause
    : MODEL cell_reference_options* return_rows_clause? reference_model* main_model
    ;

cell_reference_options
    : (IGNORE | KEEP) NAV
    | UNIQUE (DIMENSION | SINGLE REFERENCE) 
    ;

return_rows_clause
    : RETURN (UPDATED | ALL) ROWS
    ;

reference_model
    : REFERENCE reference_model_name ON LEFT_PAREN subquery RIGHT_PAREN model_column_clauses cell_reference_options*
    ;

main_model
    : (MAIN main_model_name)? model_column_clauses cell_reference_options* model_rules_clause
    ;

model_column_clauses
    : model_column_partition_part? DIMENSION BY model_column_list MEASURES model_column_list
    ;

model_column_partition_part
    : PARTITION BY model_column_list
    ;

model_column_list
    : LEFT_PAREN model_column (COMMA model_column)*  RIGHT_PAREN
    ;

model_column
    : (expression | query_block) column_alias?
    ;

model_rules_clause
    : model_rules_part? LEFT_PAREN (model_rules_element (COMMA model_rules_element)*)? RIGHT_PAREN
    ;

model_rules_part
    : RULES (UPDATE | UPSERT ALL?)? ((AUTOMATIC | SEQUENTIAL) ORDER)? model_iterate_clause?
    ;

model_rules_element
    : (UPDATE | UPSERT ALL?)? cell_assignment order_by_clause? '=' expression
    ;

cell_assignment
    : model_expression
    ;

model_iterate_clause
    : ITERATE LEFT_PAREN expression RIGHT_PAREN until_part?
    ;

until_part
    : UNTIL LEFT_PAREN condition RIGHT_PAREN
    ;

order_by_clause
    : ORDER SIBLINGS? BY order_by_elements (COMMA order_by_elements)*
    ;

order_by_elements
    : expression (ASC | DESC)? (NULLS (FIRST | LAST))?
    ;

for_update_clause
    : FOR UPDATE for_update_of_part? for_update_options?
    ;

for_update_of_part
    : OF column_name (COMMA column_name)*
    ;

for_update_options
    : SKIP_ LOCKED
    | NOWAIT
    | WAIT expression
    ;

// $>

update_statement
    : UPDATE general_table_ref update_set_clause where_clause? static_returning_clause? error_logging_clause?
    ;

// $<Update - Specific Clauses
update_set_clause
    : SET
      (column_based_update_set_clause (COMMA column_based_update_set_clause)* | VALUE LEFT_PAREN identifier RIGHT_PAREN '=' expression)
    ;

column_based_update_set_clause
    : column_name '=' expression
    | LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN '=' subquery
    ;

// $>

delete_statement
    : DELETE FROM? general_table_ref where_clause? static_returning_clause? error_logging_clause?
    ;

insert_statement
    : INSERT (single_table_insert | multi_table_insert)
    ;

// $<Insert - Specific Clauses

single_table_insert
    : insert_into_clause (values_clause static_returning_clause? | select_statement) error_logging_clause?
    ;

multi_table_insert
    : (ALL multi_table_element+ | conditional_insert_clause) select_statement
    ;

multi_table_element
    : insert_into_clause values_clause? error_logging_clause?
    ;

conditional_insert_clause
    : (ALL | FIRST)? conditional_insert_when_part+ conditional_insert_else_part?
    ;

conditional_insert_when_part
    : WHEN condition THEN multi_table_element+
    ;

conditional_insert_else_part
    : ELSE multi_table_element+
    ;

insert_into_clause
    : INTO general_table_ref (LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN)?
    ;

//liufang
values_clause
    : VALUES (expression_list | identifier)
    ;

// $>
merge_statement
    : MERGE INTO tableview_name table_alias? USING selected_tableview ON LEFT_PAREN condition RIGHT_PAREN
      (merge_update_clause merge_insert_clause? | merge_insert_clause merge_update_clause?)?
      error_logging_clause?
    ;

// $<Merge - Specific Clauses

merge_update_clause
    : WHEN MATCHED THEN UPDATE SET merge_element (COMMA merge_element)* where_clause? merge_update_delete_part?
    ;

merge_element
    : column_name '=' expression
    ;

merge_update_delete_part
    : DELETE where_clause
    ;

merge_insert_clause
    : WHEN NOT MATCHED THEN INSERT (LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN)? VALUES expression_list where_clause?
    ;

selected_tableview
    : (tableview_name | LEFT_PAREN select_statement RIGHT_PAREN) table_alias?
    ;

// $>

lock_table_statement
    : LOCK TABLE lock_table_element (COMMA lock_table_element)* IN lock_mode MODE wait_nowait_part?
    ;

wait_nowait_part
    : WAIT expression
    | NOWAIT
    ;

// $<Lock - Specific Clauses

lock_table_element
    : tableview_name partition_extension_clause?
    ;

lock_mode
    : ROW SHARE
    | ROW EXCLUSIVE
    | SHARE UPDATE?
    | SHARE ROW EXCLUSIVE
    | EXCLUSIVE
    ;

// $<Common DDL Clauses

general_table_ref
    : (dml_table_expression_clause | ONLY LEFT_PAREN dml_table_expression_clause RIGHT_PAREN) table_alias?
    ;

static_returning_clause
    : (RETURNING | RETURN) expression (COMMA expression)* into_clause
    ;

error_logging_clause
    : LOG ERRORS error_logging_into_part? expression? error_logging_reject_part?
    ;

error_logging_into_part
    : INTO tableview_name
    ;

error_logging_reject_part
    : REJECT LIMIT (UNLIMITED | expression)
    ;

dml_table_expression_clause
    : table_collection_expression
    | LEFT_PAREN select_statement subquery_restriction_clause? RIGHT_PAREN
    | tableview_name sample_clause?
    ;

table_collection_expression
    : (TABLE | THE) (LEFT_PAREN subquery RIGHT_PAREN | LEFT_PAREN expression RIGHT_PAREN (LEFT_PAREN '+' RIGHT_PAREN)?)
    ;

subquery_restriction_clause
    : WITH (READ ONLY | CHECK OPTION (CONSTRAINT constraint_name)?)
    ;

sample_clause
    : SAMPLE BLOCK? LEFT_PAREN expression (COMMA expression)? RIGHT_PAREN seed_part?
    ;

seed_part
    : SEED LEFT_PAREN expression RIGHT_PAREN
    ;

// $>

// $<Expression & Condition
cursor_expression
    : CURSOR LEFT_PAREN subquery RIGHT_PAREN
    ;

expression_list
    : LEFT_PAREN expression? (COMMA expression)* RIGHT_PAREN
    ;

condition
    : expression
    ;

expression
    : cursor_expression
    | logical_or_expression
    ;

logical_or_expression
    : logical_and_expression
    | logical_or_expression OR logical_and_expression
    ;

logical_and_expression
    : negated_expression
    | logical_and_expression AND negated_expression
    ;

negated_expression
    : NOT negated_expression
    | equality_expression
    ;

equality_expression
    : multiset_expression (IS NOT?
      (NULL | NAN | PRESENT | INFINITE | A_LETTER SET | EMPTY | OF TYPE? LEFT_PAREN ONLY? type_spec (COMMA type_spec)* RIGHT_PAREN))*
    ;

multiset_expression
    : relational_expression (multiset_type OF? concatenation)?
    ;

multiset_type
    : MEMBER
    | SUBMULTISET
    ;

relational_expression
    : relational_expression relational_operator relational_expression
    | compound_expression
    ;
relational_operator
    : '=' | not_equal_op | '<' | '>' | less_than_or_equals_op | greater_than_or_equals_op
    ;

compound_expression
    : concatenation
      (NOT? (IN in_elements | BETWEEN between_elements | like_type like_concatenation like_escape_part?))?
    ;
like_concatenation
    : concatenation
    ;
like_type
    : LIKE
    | LIKEC
    | LIKE2
    | LIKE4
    ;
like_escape_part
    : ESCAPE concatenation
    ;

in_elements
    : LEFT_PAREN subquery RIGHT_PAREN
    | LEFT_PAREN concatenation (COMMA concatenation)* RIGHT_PAREN
    | constant
    | bind_variable
    | general_element
    ;

between_elements
    : concatenation AND concatenation
    ;

concatenation
    : additive_expression (concatenation_op additive_expression)*
    ;

additive_expression
    : multiply_expression (op+=(PLUS_SIGN | MINUS_SIGN) multiply_expression)*
    ;

multiply_expression
    : datetime_expression (op+=(ASTERISK | SOLIDUS | MOD) datetime_expression)*
    ;

datetime_expression
    : model_expression
      (AT (LOCAL | TIME ZONE concatenation) | interval_expression)?
    ;

interval_expression
    : DAY (LEFT_PAREN concatenation RIGHT_PAREN)? TO SECOND (LEFT_PAREN concatenation RIGHT_PAREN)?
    | YEAR (LEFT_PAREN concatenation RIGHT_PAREN)? TO MONTH
    ;

model_expression
    : unary_expression ('[' model_expression_element ']')?
    ;

model_expression_element
    : (ANY | expression) (COMMA (ANY | expression))*
    | single_column_for_loop (COMMA single_column_for_loop)*
    | multi_column_for_loop
    ;

single_column_for_loop
    : FOR column_name
      (IN expression_list | for_like_part? FROM ex1=expression TO ex2=expression for_increment_decrement_type ex3=expression)
    ;

for_like_part
    : LIKE expression
    ;

for_increment_decrement_type
    : INCREMENT
    | DECREMENT
    ;

multi_column_for_loop
    : FOR 
      LEFT_PAREN column_name (COMMA column_name)* RIGHT_PAREN IN LEFT_PAREN (subquery | LEFT_PAREN expression_list (COMMA expression_list)* RIGHT_PAREN) RIGHT_PAREN
    ;

/* liufang */
unary_expression
    : (MINUS_SIGN | PLUS_SIGN) unary_expression
    | PRIOR unary_expression
    | CONNECT_BY_ROOT unary_expression
    | /*TODO {input.LT(1).getText().equalsIgnoreCase("new") && !input.LT(2).getText().equals(".")}?*/ NEW unary_expression
    |  DISTINCT unary_expression
    |  ALL unary_expression
    |  /*TODO{(input.LA(1) == CASE || input.LA(2) == CASE)}?*/ case_statement/*[false]*/
    |  quantified_expression
    /*|  standard_function*/
    |  atom
    ;

case_statement /*TODO [boolean isStatementParameter]
TODO scope    {
    boolean isStatement;
}
@init    {$case_statement::isStatement = $isStatementParameter;}*/
    : searched_case_statement
    | simple_case_statement
    ;

// $<CASE - Specific Clauses

simple_case_statement //liufang
//    : label_name? ck1=CASE expression simple_case_when_part+  case_else_part? END CASE? label_name?
    : CASE expression simple_case_when_part+  case_else_part? END CASE?
    ;

simple_case_when_part
    : WHEN expression THEN (/*TODO{$case_statement::isStatement}?*/ seq_of_statements | expression)
    ;

searched_case_statement
//    : label_name? ck1=CASE searched_case_when_part+ case_else_part? END CASE? label_name?
    : CASE searched_case_when_part+ case_else_part? END CASE?
    ;

searched_case_when_part
    : WHEN expression THEN (/*TODO{$case_statement::isStatement}?*/ seq_of_statements | expression)
    ;

case_else_part
    : ELSE (/*{$case_statement::isStatement}?*/ seq_of_statements | expression)
    ;
// $>

atom
    : table_element outer_join_sign
    | bind_variable
    | constant
    | general_element
    | LEFT_PAREN (subquery RIGHT_PAREN subquery_operation_part* | expression_or_vector RIGHT_PAREN)
    ;

expression_or_vector
    : expression (vector_expr)?
    ;

vector_expr
    : COMMA expression (COMMA expression)*
    ;

quantified_expression
    : (SOME | EXISTS | ALL | ANY) (LEFT_PAREN subquery RIGHT_PAREN | LEFT_PAREN expression RIGHT_PAREN)
    ;

string_function
    : SUBSTR LEFT_PAREN expression COMMA expression (COMMA expression)? RIGHT_PAREN
    | TO_CHAR LEFT_PAREN expression (COMMA quoted_string)? (COMMA quoted_string)? RIGHT_PAREN
    | DECODE LEFT_PAREN expression (COMMA expression)*  RIGHT_PAREN
    | CHR LEFT_PAREN concatenation USING NCHAR_CS RIGHT_PAREN
    | NVL LEFT_PAREN expression COMMA expression RIGHT_PAREN
    | TRIM LEFT_PAREN ((LEADING | TRAILING | BOTH)? quoted_string? FROM)? concatenation RIGHT_PAREN
    | TO_DATE LEFT_PAREN expression (COMMA expression)? RIGHT_PAREN //liufang
    | WM_CONCAT LEFT_PAREN (expression) RIGHT_PAREN //liufang
    ;

standard_function
    : /*string_function
    | numeric_function_wrapper
    | date_time_function
    | */other_function
    ;

numeric_function_wrapper
    : numeric_function (single_column_for_loop | multi_column_for_loop)?
    ;

numeric_function
   : SUM LEFT_PAREN (DISTINCT|ALL)? expression RIGHT_PAREN
   | COUNT LEFT_PAREN ( '*' | ((DISTINCT | UNIQUE | ALL)? concatenation)? ) RIGHT_PAREN over_clause?
   | ROUND LEFT_PAREN expression (COMMA expression)?  RIGHT_PAREN //liufang
   | AVG LEFT_PAREN (DISTINCT | ALL)? expression RIGHT_PAREN
   | MIN LEFT_PAREN (DISTINCT | ALL)? expression RIGHT_PAREN
   | MAX LEFT_PAREN (DISTINCT | ALL)? expression RIGHT_PAREN
   | LEAST LEFT_PAREN expression (COMMA expression)* RIGHT_PAREN
   | GREATEST LEFT_PAREN expression (COMMA expression)* RIGHT_PAREN
   | TO_NUMBER LEFT_PAREN expression (COMMA quoted_string)? (COMMA quoted_string)? RIGHT_PAREN
   | MOD LEFT_PAREN expression COMMA expression RIGHT_PAREN
   ;

date_time_function
    : SYSDATE
    ;

other_function
    : over_clause_keyword function_argument_analytic over_clause
    | /*TODO stantard_function_enabling_using*/ regular_id function_argument_modeling using_clause?
    //| COUNT LEFT_PAREN ( ASTERISK | (DISTINCT | UNIQUE | ALL)? concatenation) RIGHT_PAREN over_clause?
    //| (CAST | XMLCAST) LEFT_PAREN (MULTISET LEFT_PAREN subquery RIGHT_PAREN | concatenation) AS type_spec RIGHT_PAREN
    //| COALESCE LEFT_PAREN table_element (COMMA (numeric|quoted_string))? RIGHT_PAREN
    | COLLECT LEFT_PAREN (DISTINCT | UNIQUE)? concatenation collect_order_by_part? RIGHT_PAREN
    | within_or_over_clause_keyword function_argument within_or_over_part+
    | cursor_name ( PERCENT_ISOPEN | PERCENT_FOUND | PERCENT_NOTFOUND | PERCENT_ROWCOUNT )
    //| DECOMPOSE LEFT_PAREN concatenation (CANONICAL | COMPATIBILITY)? RIGHT_PAREN
    | EXTRACT LEFT_PAREN regular_id FROM concatenation RIGHT_PAREN
    | (FIRST_VALUE | LAST_VALUE) function_argument_analytic respect_or_ignore_nulls? over_clause
    | standard_prediction_function_keyword 
      LEFT_PAREN expression (COMMA expression)* cost_matrix_clause? using_clause? RIGHT_PAREN
    //| TRANSLATE LEFT_PAREN expression (USING (CHAR_CS | NCHAR_CS))? (COMMA expression)* RIGHT_PAREN
    | TREAT LEFT_PAREN expression AS REF? type_spec RIGHT_PAREN
    | TRIM LEFT_PAREN ((LEADING | TRAILING | BOTH)? quoted_string? FROM)? concatenation RIGHT_PAREN
    | XMLAGG LEFT_PAREN expression order_by_clause? RIGHT_PAREN ('.' general_element_part)?
    | (XMLCOLATTVAL|XMLFOREST)
      LEFT_PAREN xml_multiuse_expression_element (COMMA xml_multiuse_expression_element)* RIGHT_PAREN ('.' general_element_part)?
    | XMLELEMENT 
      LEFT_PAREN (ENTITYESCAPING | NOENTITYESCAPING)? (NAME | EVALNAME)? expression
       (/*TODO{input.LT(2).getText().equalsIgnoreCase("xmlattributes")}?*/ COMMA xml_attributes_clause)?
       (COMMA expression column_alias?)* RIGHT_PAREN ('.' general_element_part)?
    | XMLEXISTS LEFT_PAREN expression xml_passing_clause? RIGHT_PAREN
    | XMLPARSE LEFT_PAREN (DOCUMENT | CONTENT) concatenation WELLFORMED? RIGHT_PAREN ('.' general_element_part)?
    | XMLPI
      LEFT_PAREN (NAME identifier | EVALNAME concatenation) (COMMA concatenation)? RIGHT_PAREN ('.' general_element_part)?
    | XMLQUERY
      LEFT_PAREN concatenation xml_passing_clause? RETURNING CONTENT (NULL ON EMPTY)? RIGHT_PAREN ('.' general_element_part)?
    | XMLROOT
      LEFT_PAREN concatenation (COMMA xmlroot_param_version_part)? (COMMA xmlroot_param_standalone_part)? RIGHT_PAREN ('.' general_element_part)?
    | XMLSERIALIZE
      LEFT_PAREN (DOCUMENT | CONTENT) concatenation (AS type_spec)?
      xmlserialize_param_enconding_part? xmlserialize_param_version_part? xmlserialize_param_ident_part? ((HIDE | SHOW) DEFAULTS)? RIGHT_PAREN
      ('.' general_element_part)?
    | XMLTABLE
      LEFT_PAREN xml_namespaces_clause? concatenation xml_passing_clause? (COLUMNS xml_table_column (COMMA xml_table_column))? RIGHT_PAREN ('.' general_element_part)?
    ;

over_clause_keyword
    : AVG
    | CORR
    | LAG
    | LEAD
    | MAX
    | MEDIAN
    | MIN
    | NTILE
    | RATIO_TO_REPORT
    | ROW_NUMBER
    | SUM
    | VARIANCE
    | REGR_
    | STDDEV
    | VAR_
    | COVAR_
    | WM_CONCAT
    ;

within_or_over_clause_keyword
    : CUME_DIST
    | DENSE_RANK
    | LISTAGG
    | PERCENT_RANK
    | PERCENTILE_CONT
    | PERCENTILE_DISC
    | RANK
    ;
    
standard_prediction_function_keyword
    : PREDICTION
    | PREDICTION_BOUNDS
    | PREDICTION_COST
    | PREDICTION_DETAILS
    | PREDICTION_PROBABILITY
    | PREDICTION_SET
    ;
    
over_clause
    : OVER LEFT_PAREN query_partition_clause? (order_by_clause windowing_clause?)? RIGHT_PAREN
    ;

windowing_clause
    : windowing_type
      (BETWEEN windowing_elements AND windowing_elements | windowing_elements)
    ;

windowing_type
    : ROWS
    | RANGE
    ;

windowing_elements
    : UNBOUNDED PRECEDING
    | CURRENT ROW
    | concatenation (PRECEDING|FOLLOWING)
    ;

using_clause
    : USING ('*' | using_element (COMMA using_element)*)
    ;

using_element
    : (IN OUT? | OUT)? select_list_elements column_alias?
    ;

collect_order_by_part
    : ORDER BY concatenation
    ;

within_or_over_part
    : WITHIN GROUP LEFT_PAREN order_by_clause RIGHT_PAREN
    | over_clause
    ;

cost_matrix_clause
    : COST (MODEL AUTO? | LEFT_PAREN cost_class_name (COMMA cost_class_name)* RIGHT_PAREN VALUES expression_list)
    ;

xml_passing_clause
    : PASSING (BY VALUE)? expression column_alias? (COMMA expression column_alias?)
    ;

xml_attributes_clause
    : XMLATTRIBUTES
     LEFT_PAREN (ENTITYESCAPING | NOENTITYESCAPING)? (SCHEMACHECK | NOSCHEMACHECK)?
     xml_multiuse_expression_element (COMMA xml_multiuse_expression_element)* RIGHT_PAREN
    ;

xml_namespaces_clause
    : XMLNAMESPACES
      LEFT_PAREN (concatenation column_alias)? (COMMA concatenation column_alias)*
      xml_general_default_part? RIGHT_PAREN
    ;

xml_table_column
    : xml_column_name
      (FOR ORDINALITY | type_spec (PATH concatenation)? xml_general_default_part?)
    ;

xml_general_default_part
    : DEFAULT concatenation
    ;

xml_multiuse_expression_element
    : expression (AS (id_expression | EVALNAME concatenation))?
    ;

xmlroot_param_version_part
    : VERSION (NO VALUE | expression)
    ;

xmlroot_param_standalone_part
    : STANDALONE (YES | NO VALUE?)
    ;

xmlserialize_param_enconding_part
    : ENCODING concatenation
    ;

xmlserialize_param_version_part
    : VERSION concatenation
    ;

xmlserialize_param_ident_part
    : NO INDENT
    | INDENT (SIZE '=' concatenation)?
    ;
    
// SqlPlus

sql_plus_command 
    : ('/' | whenever_command | exit_command | prompt_command | set_command | show_errors_command | start_command) SEMI?
    ;

whenever_command
    : WHENEVER (SQLERROR | OSERROR)
      (EXIT (SUCCESS | FAILURE | WARNING) (COMMIT | ROLLBACK) | CONTINUE (COMMIT|ROLLBACK|NONE))
    ;

set_command
    : SET regular_id (CHAR_STRING | ON | OFF | /*EXACT_NUM_LIT*/numeric | regular_id) // TODO
    ;

exit_command
    : EXIT 
    ;

prompt_command
    : PROMPT
    ;

show_errors_command
    : SHOW ERR
    | SHOW ERRORS
    ;

start_command
    : START_CMD
    ;

// Common

partition_extension_clause
    : (SUBPARTITION | PARTITION) FOR? expression_list
    ;

column_alias
    : AS? (identifier | alias_quoted_string)
    | AS
    ;

table_alias
    : (identifier | alias_quoted_string)
    ;

alias_quoted_string
    : quoted_string
    ;

where_clause
    : WHERE (current_of_clause | expression)
    ;

current_of_clause
    : CURRENT OF cursor_name
    ;

into_clause
    : INTO variable_name (COMMA variable_name)* 
    | BULK COLLECT INTO variable_name (COMMA variable_name)* 
    ;

// $>

// $<Common PL/SQL Named Elements

xml_column_name
    : identifier
    | quoted_string
    ;

cost_class_name
    : identifier
    ;

attribute_name
    : identifier
    ;

savepoint_name
    : identifier
    ;

rollback_segment_name
    : identifier
    ;

table_var_name
    : identifier
    ;

schema_name
    : identifier
    ;

routine_name
    : identifier ('.' id_expression)* ('@' link_name)?
    ;

package_name
    : identifier
    ;

implementation_type_name
    : identifier ('.' id_expression)?
    ;

parameter_name
    : identifier
    ;

reference_model_name
    : identifier
    ;

main_model_name
    : identifier
    ;

aggregate_function_name
    : identifier ('.' id_expression)*
    ;

query_name
    : identifier
    ;

constraint_name
    : identifier ('.' id_expression)* ('@' link_name)?
    ;

label_name
    : id_expression
    ;

type_name
    : id_expression ('.' id_expression)*
    ;

sequence_name
    : id_expression ('.' id_expression)*
    ;

exception_name
    : identifier ('.' id_expression)* 
    ;

function_name
    : identifier ('.' id_expression)?
    ;

procedure_name
    : identifier ('.' id_expression)?
    ;

constructor_name
    : identifier ('.' id_expression)?
    ;

trigger_name
    : identifier ('.' id_expression)?
    ;

variable_name
    // liufang : (INTRODUCER char_set_name)? id_expression ('.' id_expression)?
    : (INTRODUCER char_set_name)? general_element
    | bind_variable
    ;

index_name
    : identifier
    ;

cursor_name
    : identifier
    | bind_variable
    ;

record_name
    : identifier
    | bind_variable
    ;

collection_name
    : identifier ('.' id_expression)?
    ;

link_name
    : identifier
    ;

column_name
    : identifier ('.' id_expression)*
    ;

tableview_name
    : identifier ('.' id_expression)? 
      ('@' link_name | /*TODO{!(input.LA(2) == BY)}?*/ partition_extension_clause)?
    ;

char_set_name
    : id_expression ('.' id_expression)*
    | id_expression PERCENT_CHARSET
    ;

synonym_name
    : identifier
    ;

// Represents a valid DB object name in DDL commands which are valid for several DB (or schema) objects.
// For instance, create synonym ... for <DB object name>, or rename <old DB object name> to <new DB object name>.
// Both are valid for seuqences, tables, views etc.
schema_object_name
    : id_expression
    ;

// $>

// $<Common PL/SQL Specs

// NOTE: In reality this applies to aggregate OracleFunction only
keep_clause
    : KEEP LEFT_PAREN DENSE_RANK (FIRST | LAST) order_by_clause RIGHT_PAREN over_clause?
    ;

comma // liufang
    : COMMA
    ;

function_argument
    : LEFT_PAREN argument? (comma argument )* RIGHT_PAREN keep_clause?
    ;

function_argument_analytic
    : LEFT_PAREN (argument respect_or_ignore_nulls?)? (COMMA argument respect_or_ignore_nulls?)* RIGHT_PAREN keep_clause?
    ;

function_argument_modeling
    : LEFT_PAREN column_name (COMMA (numeric | NULL) (COMMA (numeric | NULL))?)?
      USING (tableview_name '.' '*' | '*' | expression column_alias? (COMMA expression column_alias?)*)
      RIGHT_PAREN keep_clause?
    ;

respect_or_ignore_nulls
    : (RESPECT | IGNORE) NULLS
    ;

argument
    : (identifier '=' '>')? expression
    ;

type_spec
    : datatype
    | REF? type_name (PERCENT_ROWTYPE | PERCENT_TYPE)?
    ;

datatype
    : native_datatype_element precision_part? (WITH LOCAL? TIME ZONE | CHARACTER SET char_set_name)?
    | INTERVAL (YEAR | DAY) (LEFT_PAREN expression RIGHT_PAREN)? TO (MONTH | SECOND) (LEFT_PAREN expression RIGHT_PAREN)?
    ;

precision_part
    : LEFT_PAREN numeric (COMMA numeric)? (CHAR | BYTE)? RIGHT_PAREN
    ;

native_datatype_element
    : BINARY_INTEGER
    | PLS_INTEGER
    | NATURAL
    | BINARY_FLOAT
    | BINARY_DOUBLE
    | NATURALN
    | POSITIVE
    | POSITIVEN
    | SIGNTYPE
    | SIMPLE_INTEGER
    | NVARCHAR2
    | DEC
    | INTEGER
    | INT
    | NUMERIC
    | SMALLINT
    | NUMBER
    | DECIMAL 
    | DOUBLE PRECISION?
    | FLOAT
    | REAL
    | NCHAR
    | LONG RAW?
    | CHAR  
    | CHARACTER 
    | VARCHAR2
    | VARCHAR
    | STRING
    | RAW
    | BOOLEAN
    | DATE
    | ROWID
    | UROWID
    | YEAR
    | MONTH
    | DAY
    | HOUR
    | MINUTE
    | SECOND
    | TIMEZONE_HOUR
    | TIMEZONE_MINUTE
    | TIMEZONE_REGION
    | TIMEZONE_ABBR
    | TIMESTAMP
    | TIMESTAMP_UNCONSTRAINED
    | TIMESTAMP_TZ_UNCONSTRAINED
    | TIMESTAMP_LTZ_UNCONSTRAINED
    | TIME_TZ_UNCONSTRAINED
    | TIME_UNCONSTRAINED
    | YMINTERVAL_UNCONSTRAINED
    | DSINTERVAL_UNCONSTRAINED
    | BFILE
    | BLOB
    | CLOB
    | NCLOB
    | MLSLABEL
    ;

bind_variable
    : (BINDVAR | ':' UNSIGNED_INTEGER)
      // Pro*C/C++ indicator variables
      (INDICATOR? (BINDVAR | ':' UNSIGNED_INTEGER))?
      ('.' general_element_part)*
    ;

general_element
    : general_element_part ('.' general_element_part)*
    ;

general_element_part
    : (INTRODUCER char_set_name)? id_expression ('.' id_expression)* ('@' link_name)? function_argument?
    ;

table_element
    : (INTRODUCER char_set_name)? id_expression ('.' id_expression)*
    ;

// $>

// $<Lexer Mappings

constant
    : TIMESTAMP (quoted_string | bind_variable) (AT TIME ZONE quoted_string)?
    | INTERVAL (quoted_string | bind_variable | general_element_part)
      (YEAR | MONTH | DAY | HOUR | MINUTE | SECOND)
      (LEFT_PAREN (UNSIGNED_INTEGER | bind_variable) (COMMA (UNSIGNED_INTEGER | bind_variable) )? RIGHT_PAREN)?
      (TO ( DAY | HOUR | MINUTE | SECOND (LEFT_PAREN (UNSIGNED_INTEGER | bind_variable) RIGHT_PAREN)?))?
    | numeric
    | DATE quoted_string
    | quoted_string
    | NULL
    | TRUE
    | FALSE
    | DBTIMEZONE 
    | SESSIONTIMEZONE
    | MINVALUE
    | MAXVALUE
    | DEFAULT
    ;
/*
numeric
    : UNSIGNED_INTEGER
    | APPROXIMATE_NUM_LIT
    ;
*/
numeric
    : int_value
    | float_value
    ;

int_value
    : UNSIGNED_INTEGER
    ;
float_value
    : APPROXIMATE_NUM_LIT
    ;

numeric_negative
    : MINUS_SIGN numeric
    ;

quoted_string
    : CHAR_STRING
    //| CHAR_STRING_PERL
    | NATIONAL_CHAR_STRING_LIT
    ;

identifier
    : (INTRODUCER char_set_name)? id_expression
    ;

id_expression
    : regular_id
    | DELIMITED_ID
    ;

not_equal_op
    : NOT_EQUAL_OP
    | '<' '>'
    | '!' '='
    | '^' '='
    ;

greater_than_or_equals_op
    : '>='
    | '>' '='
    ;

less_than_or_equals_op
    : '<='
    | '<' '='
    ;

concatenation_op
    : '||'
    | '|' '|'
    ;

outer_join_sign
    : LEFT_PAREN '+' RIGHT_PAREN
    ;
    
regular_id
    : REGULAR_ID
    | A_LETTER
    | ASTERISK
    | string_function_name
    | numeric_function_name
    | date_time_function_name
    | conversion_function_name
    | advanced_function_name
    | ADD
    | AFTER
    | AGENT
    | AGGREGATE
    //| ALL
    //| ALTER
    | ANALYZE
    //| AND
    //| ANY
    | ARRAY
    // | AS
    //| ASC
    | ASSOCIATE
    | AT
    | ATTRIBUTE
    | AUDIT
    | AUTHID
    | AUTO
    | AUTOMATIC
    | AUTONOMOUS_TRANSACTION
    | BATCH
    | BEFORE
    //| BEGIN
    // | BETWEEN
    | BFILE
    | BINARY_DOUBLE
    | BINARY_FLOAT
    | BINARY_INTEGER
    | BLOB
    | BLOCK
    | BODY
    | BOOLEAN
    | BOTH
    // | BREADTH
    | BULK
    // | BY
    | BYTE
    | C_LETTER
    // | CACHE
    | CALL
    | CANONICAL
    | CASCADE
    //| CASE
    | CAST
    | CHAR
    | CHAR_CS
    | CHARACTER
    //| CHECK
    | CHR
    | CLOB
    | CLOSE
    | CLUSTER
    | COLLECT
    | COLUMNS
    | COMMENT
    | COMMIT
    | COMMITTED
    | COMPATIBILITY
    | COMPILE
    | COMPOUND
    //| CONNECT
    //| CONNECT_BY_ROOT
    | CONSTANT
    | CONSTRAINT
    | CONSTRAINTS
    | CONSTRUCTOR
    | CONTENT
    | CONTEXT
    | CONTINUE
    | CONVERT
    | CORRUPT_XID
    | CORRUPT_XID_ALL
    | COST
    | COUNT
    //| CREATE
    | CROSS
    | CUBE
    //| CURRENT
    | CURRENT_USER
    | CURSOR
    | CUSTOMDATUM
    | CYCLE
    | DATA
    | DATABASE
    //| DATE
    | DAY
    | DB_ROLE_CHANGE
    | DBTIMEZONE
    | DDL
    | DEBUG
    | DEC
    | DECIMAL
    //| DECLARE
    | DECOMPOSE
    | DECREMENT
    //| DEFAULT
    | DEFAULTS
    | DEFERRED
    | DEFINER
    | DELETE
    // | DEPTH
    //| DESC
    | DETERMINISTIC
    | DIMENSION
    | DISABLE
    | DISASSOCIATE
    //| DISTINCT
    | DOCUMENT
    | DOUBLE
    //| DROP
    | DSINTERVAL_UNCONSTRAINED
    | EACH
    | ELEMENT
    //| ELSE
    //| ELSIF
    | EMPTY
    | ENABLE
    | ENCODING
    //| END
    | ENTITYESCAPING
    | ERR
    | ERRORS
    | ESCAPE
    | EVALNAME
    | EXCEPTION
    | EXCEPTION_INIT
    | EXCEPTIONS
    | EXCLUDE
    //| EXCLUSIVE
    | EXECUTE
    //| EXISTS
    | EXIT
    | EXPLAIN
    | EXTERNAL
    | EXTRACT
    | FAILURE
    //| FALSE
    //| FETCH
    | FINAL
    | FIRST
    | FIRST_VALUE
    | FLOAT
    | FOLLOWING
    | FOLLOWS
    //| FOR
    | FORALL
    | FORCE
    // | FROM
    | FULL
    | FUNCTION
    //| GOTO
    //| GRANT
    //| GROUP
    | GROUPING
    | HASH
    //| HAVING
    | HIDE
    | HOUR
    //| IF
    | IGNORE
    | IMMEDIATE
    // | IN
    | INCLUDE
    | INCLUDING
    | INCREMENT
    | INDENT
    //| INDEX
    | INDEXED
    | INDICATOR
    | INDICES
    | INFINITE
    | INLINE
    | INNER
    | INOUT
    //| INSERT
    | INSTANTIABLE
    | INSTEAD
    | INT
    | INTEGER
    //| INTERSECT
    | INTERVAL
    // | INTO
    | INVALIDATE
    //| IS
    | ISOLATION
    | ITERATE
    | JAVA
    | JOIN
    | KEEP
    | KEY
    | LANGUAGE
    | LAST
    | LAST_VALUE
    | LEADING
    | LEFT
    | LEVEL
    | LIBRARY
    // | LIKE
    | LIKE2
    | LIKE4
    | LIKEC
    | LIMIT
    | LOCAL
    //| LOCK
    | LOCKED
    | LOG
    | LOGOFF
    | LOGON
    | LONG
    | LOOP
    | MAIN
    | MAP
    | MATCHED
    | MAXVALUE
    | MEASURES
    | MEMBER
    | MERGE
    //| MINUS
    | MINUTE
    | MINVALUE
    | MLSLABEL
    //| MODE
    | MODEL
    | MODIFY
    | MONTH
    | MULTISET
    | NAME
    | NAN
    | NATURAL
    | NATURALN
    | NAV
    | NCHAR
    | NCHAR_CS
    | NCLOB
    | NESTED
    | NEW
    | NO
    | NOAUDIT
    // | NOCACHE
    | NOCOPY
    | NOCYCLE
    | NOENTITYESCAPING
    //| NOMAXVALUE
    //| NOMINVALUE
    | NONE
    // | NOORDER
    | NOSCHEMACHECK
    //| NOT
    //| NOWAIT
    // | NULL
    | NULLS
    | NUMBER
    | NUMERIC
    | NVARCHAR2
    | OBJECT
    //| OF
    | OFF
    | OID
    | OLD
    //| ON
    | ONLY
    | OPAQUE
    | OPEN
    //| OPTION
    //| OR
    | ORADATA
    //| ORDER
    | ORDINALITY
    | OSERROR
    | OUT
    | OUTER
    | OVER
    | OVERRIDING
    | PACKAGE
    | PARALLEL_ENABLE
    | PARAMETERS
    | PARENT
    | PARTITION
    | PASSING
    | PATH
    //| PERCENT_ROWTYPE
    //| PERCENT_TYPE
    | PIPELINED
    //| PIVOT
    | PLAN
    | PLS_INTEGER
    | POSITIVE
    | POSITIVEN
    | PRAGMA
    | PRECEDING
    | PRECISION
    | PRESENT
    //| PRIOR
    //| PROCEDURE
    | RAISE
    | RANGE
    | RAW
    | READ
    | REAL
    | RECORD
    | REF
    | REFERENCE
    | REFERENCING
    | REJECT
    | RELIES_ON
    | RENAME
    | REPLACE
    | RESPECT
    | RESTRICT_REFERENCES
    | RESULT
    | RESULT_CACHE
    | RETURN
    | RETURNING
    | REUSE
    | REVERSE
    //| REVOKE
    | RIGHT
    | ROLLBACK
    | ROLLUP
    | ROW
    | ROWID
    | ROWS
    | RULES
    | SAMPLE
    | SAVE
    | SAVEPOINT
    | SCHEMA
    | SCHEMACHECK
    | SCN
    // | SEARCH
    | SECOND
    | SEED
    | SEGMENT
    // | SELECT
    | SELF
    // | SEQUENCE
    | SEQUENTIAL
    | SERIALIZABLE
    | SERIALLY_REUSABLE
    | SERVERERROR
    | SESSIONTIMEZONE
    | SET
    | SETS
    | SETTINGS
    //| SHARE
    | SHOW
    | SHUTDOWN
    | SIBLINGS
    | SIGNTYPE
    | SIMPLE_INTEGER
    | SINGLE
    //| SIZE
    | SKIP_
    | SMALLINT
    | SNAPSHOT
    | SOME
    | SPECIFICATION
    | SQLDATA
    | SQLERROR
    | STANDALONE
    //| START
    | STARTUP
    | STATEMENT
    | STATEMENT_ID
    | STATIC
    | STATISTICS
    | STRING
    | SUBSTR
    | SUBMULTISET
    | SUBPARTITION
    | SUBSTITUTABLE
    | SUBTYPE
    | SUCCESS
    | SUSPEND
    //| TABLE
    //| THE
    //| THEN
    | TIME
    | TIMESTAMP
    | TIMESTAMP_LTZ_UNCONSTRAINED
    | TIMESTAMP_TZ_UNCONSTRAINED
    | TIMESTAMP_UNCONSTRAINED
    | TIMEZONE_ABBR
    | TIMEZONE_HOUR
    | TIMEZONE_MINUTE
    | TIMEZONE_REGION
    //| TO
    | TRAILING
    | TRANSACTION
    | TRANSLATE
    | TREAT
    | TRIGGER
    | TRIM
    //| TRUE
    | TRUNCATE
    | TYPE
    | UNBOUNDED
    | UNDER
    //| UNION
    //| UNIQUE
    | UNLIMITED
    //| UNPIVOT
    | UNTIL
    //| UPDATE
    | UPDATED
    | UPSERT
    | UROWID
    | USE
    //| USING
    | VALIDATE
    | VALUE
    //| VALUES
    | VARCHAR
    | VARCHAR2
    | VARIABLE
    | VARRAY
    | VARYING
    | VERSION
    | VERSIONS
    | WAIT
    | WARNING
    | WELLFORMED
    // | WHEN
    | WHENEVER
    // | WHERE
    | WHILE
    //| WITH
    | WITHIN
    | WORK
    | WRITE
    | XML
    | XMLAGG
    | XMLATTRIBUTES
    | XMLCAST
    | XMLCOLATTVAL
    | XMLELEMENT
    | XMLEXISTS
    | XMLFOREST
    | XMLNAMESPACES
    | XMLPARSE
    | XMLPI
    | XMLQUERY
    | XMLROOT
    | XMLSERIALIZE
    | XMLTABLE
    | YEAR
    | YES
    | YMINTERVAL_UNCONSTRAINED
    | ZONE
    | PREDICTION
    | PREDICTION_BOUNDS
    | PREDICTION_COST
    | PREDICTION_DETAILS
    | PREDICTION_PROBABILITY
    | PREDICTION_SET
    | CUME_DIST
    | DENSE_RANK
    | LISTAGG
    | PERCENT_RANK
    | PERCENTILE_CONT
    | PERCENTILE_DISC
    | RANK
    | AVG
    | CORR
    | LAG
    | LEAD
    | MAX
    | MEDIAN
    | MIN
    | NTILE
    | RATIO_TO_REPORT
    | ROW_NUMBER
    | SUM
    | VARIANCE
    | REGR_
    | STDDEV
    | VAR_
    | COVAR_
    //liufang
    | INTERFACE
    | PROCEDURE
    | MOD
    | PRIOR
    ;

string_function_name
    : ASCII
	| ASCIISTR
	| CHR
	| COMPOSE
	| CONCAT
	| CONVERT
	| DECOMPOSE
	| DUMP
	| INITCAP
	| INSTR
	| INSTR2
	| INSTR4
	| INSTRB
	| INSTRC
	| LENGTH
	| LENGTH2
	| LENGTH4
	| LENGTHB
	| LENGTHC
	| LOWER
	| LPAD
	| LTRIM
	| NCHR
	| REGEXP_INSTR
	| REGEXP_REPLACE
	| REGEXP_SUBSTR
	| REPLACE
	| RPAD
	| RTRIM
	| SOUNDEX
	| SUBSTR
	| TRANSLATE
	| TRIM
	| UPPER
	| VSIZE
    ;

numeric_function_name
    : ABS
	| ACOS
	| ASIN
	| ATAN
	| ATAN2
	| AVG
	| BITAND
	| CEIL
	| COS
	| COSH
    | COUNT
	| EXP
	| FLOOR
	| GREATEST
	| LEAST
	| LN
	| LOG
	| MAX
	| MEDIAN
	| MIN
	| MOD
	| POWER
	| REGEXP_COUNT
	| REMAINDER
	| ROUND
	| ROWNUM
	| SIGN
	| SIN
	| SINH
	| SQRT
	| SUM
	| TAN
	| TANH
	| TRUNC
    ;

date_time_function_name
    : ADD_MONTHS
	| CURRENT_DATE
	| CURRENT_TIMESTAMP
	| DBTIMEZONE
	| EXTRACT
	| LAST_DAY
	| LOCALTIMESTAMP
	| MONTHS_BETWEEN
	| NEW_TIME
	| NEXT_DAY
	| ROUND
	| SESSIONTIMEZONE
	| SYSDATE
	| SYSTIMESTAMP
	| TRUNC
	| TZ_OFFSET
    ;

conversion_function_name
    : BIN_TO_NUM
	| CAST
	| CHARTOROWID
	| FROM_TZ
	| HEXTORAW
	| NUMTODSINTERVAL
	| NUMTOYMINTERVAL
	| RAWTOHEX
	| TO_CHAR
	| TO_CLOB
	| TO_DATE
	| TO_DSINTERVAL
	| TO_LOB
	| TO_MULTI_BYTE
	| TO_NCLOB
	| TO_NUMBER
	| TO_SINGLE_BYTE
	| TO_TIMESTAMP
	| TO_TIMESTAMP_TZ
	| TO_YMINTERVAL
    ;

analytic_function_name
    : CORR
	| COVAR_POP
	| COVAR_SAMP
	| CUME_DIST
	| DENSE_RANK
	| FIRST_VALUE
	| LAG
	| LAST_VALUE
	| LEAD
	| LISTAGG
	| NTH_VALUE
	| RANK
	| STDDEV
	| VAR_POP
	| VAR_SAMP
	| VARIANCE
    ;

advanced_function_name
    : BFILENAME
	| CARDINALITY
	| CASE
	| COALESCE
	| DECODE
	| EMPTY_BLOB
	| EMPTY_CLOB
	| GROUP_ID
	| LNNVL
	| NANVL
	| NULLIF
	| NVL
	| NVL2
	| SYS_CONTEXT
	| UID
	| USER
	| USERENV
    ;


