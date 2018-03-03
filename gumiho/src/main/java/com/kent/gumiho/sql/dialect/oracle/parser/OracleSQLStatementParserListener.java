// Generated from /Users/kent/IdeaProjects/github/gumiho/gumiho/src/main/resources/grammars/dialect/oracle/OracleSQLStatementParser.g4 by ANTLR 4.7
package com.kent.gumiho.sql.dialect.oracle.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OracleSQLStatementParser}.
 */
public interface OracleSQLStatementParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void enterSwallow_to_semi(OracleSQLStatementParser.Swallow_to_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void exitSwallow_to_semi(OracleSQLStatementParser.Swallow_to_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(OracleSQLStatementParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(OracleSQLStatementParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSql_script(OracleSQLStatementParser.Sql_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSql_script(OracleSQLStatementParser.Sql_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnit_statement(OracleSQLStatementParser.Unit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnit_statement(OracleSQLStatementParser.Unit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(OracleSQLStatementParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(OracleSQLStatementParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function(OracleSQLStatementParser.Alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function(OracleSQLStatementParser.Alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_body(OracleSQLStatementParser.Create_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_body(OracleSQLStatementParser.Create_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void enterParallel_enable_clause(OracleSQLStatementParser.Parallel_enable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void exitParallel_enable_clause(OracleSQLStatementParser.Parallel_enable_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by_clause(OracleSQLStatementParser.Partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by_clause(OracleSQLStatementParser.Partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void enterResult_cache_clause(OracleSQLStatementParser.Result_cache_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void exitResult_cache_clause(OracleSQLStatementParser.Result_cache_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void enterRelies_on_part(OracleSQLStatementParser.Relies_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void exitRelies_on_part(OracleSQLStatementParser.Relies_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void enterStreaming_clause(OracleSQLStatementParser.Streaming_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void exitStreaming_clause(OracleSQLStatementParser.Streaming_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void enterDrop_package(OracleSQLStatementParser.Drop_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void exitDrop_package(OracleSQLStatementParser.Drop_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void enterAlter_package(OracleSQLStatementParser.Alter_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void exitAlter_package(OracleSQLStatementParser.Alter_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#create_package}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package(OracleSQLStatementParser.Create_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#create_package}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package(OracleSQLStatementParser.Create_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#create_package_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body(OracleSQLStatementParser.Create_package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#create_package_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body(OracleSQLStatementParser.Create_package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_spec(OracleSQLStatementParser.Package_obj_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_spec(OracleSQLStatementParser.Package_obj_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_spec(OracleSQLStatementParser.Procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_spec(OracleSQLStatementParser.Procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_spec(OracleSQLStatementParser.Function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_spec(OracleSQLStatementParser.Function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_body(OracleSQLStatementParser.Package_obj_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_body(OracleSQLStatementParser.Package_obj_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(OracleSQLStatementParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(OracleSQLStatementParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterAlter_procedure(OracleSQLStatementParser.Alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitAlter_procedure(OracleSQLStatementParser.Alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(OracleSQLStatementParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(OracleSQLStatementParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_body(OracleSQLStatementParser.Procedure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_body(OracleSQLStatementParser.Procedure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_body(OracleSQLStatementParser.Create_procedure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_body(OracleSQLStatementParser.Create_procedure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger(OracleSQLStatementParser.Drop_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger(OracleSQLStatementParser.Drop_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger(OracleSQLStatementParser.Alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger(OracleSQLStatementParser.Alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger(OracleSQLStatementParser.Create_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger(OracleSQLStatementParser.Create_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_follows_clause(OracleSQLStatementParser.Trigger_follows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_follows_clause(OracleSQLStatementParser.Trigger_follows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_when_clause(OracleSQLStatementParser.Trigger_when_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_when_clause(OracleSQLStatementParser.Trigger_when_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterSimple_dml_trigger(OracleSQLStatementParser.Simple_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitSimple_dml_trigger(OracleSQLStatementParser.Simple_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_row(OracleSQLStatementParser.For_each_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_row(OracleSQLStatementParser.For_each_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCompound_dml_trigger(OracleSQLStatementParser.Compound_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCompound_dml_trigger(OracleSQLStatementParser.Compound_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_trigger(OracleSQLStatementParser.Non_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_trigger(OracleSQLStatementParser.Non_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_body(OracleSQLStatementParser.Trigger_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_body(OracleSQLStatementParser.Trigger_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterCompound_trigger_block(OracleSQLStatementParser.Compound_trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitCompound_trigger_block(OracleSQLStatementParser.Compound_trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void enterTiming_point_section(OracleSQLStatementParser.Timing_point_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void exitTiming_point_section(OracleSQLStatementParser.Timing_point_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_event(OracleSQLStatementParser.Non_dml_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_event(OracleSQLStatementParser.Non_dml_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_clause(OracleSQLStatementParser.Dml_event_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_clause(OracleSQLStatementParser.Dml_event_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_element(OracleSQLStatementParser.Dml_event_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_element(OracleSQLStatementParser.Dml_event_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_nested_clause(OracleSQLStatementParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_nested_clause(OracleSQLStatementParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_clause(OracleSQLStatementParser.Referencing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_clause(OracleSQLStatementParser.Referencing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_element(OracleSQLStatementParser.Referencing_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_element(OracleSQLStatementParser.Referencing_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(OracleSQLStatementParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(OracleSQLStatementParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type(OracleSQLStatementParser.Alter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type(OracleSQLStatementParser.Alter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompile_type_clause(OracleSQLStatementParser.Compile_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompile_type_clause(OracleSQLStatementParser.Compile_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterReplace_type_clause(OracleSQLStatementParser.Replace_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitReplace_type_clause(OracleSQLStatementParser.Replace_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_spec(OracleSQLStatementParser.Alter_method_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_spec(OracleSQLStatementParser.Alter_method_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_element(OracleSQLStatementParser.Alter_method_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_element(OracleSQLStatementParser.Alter_method_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAlter_attribute_definition(OracleSQLStatementParser.Alter_attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAlter_attribute_definition(OracleSQLStatementParser.Alter_attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_definition(OracleSQLStatementParser.Attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_definition(OracleSQLStatementParser.Attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAlter_collection_clauses(OracleSQLStatementParser.Alter_collection_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAlter_collection_clauses(OracleSQLStatementParser.Alter_collection_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void enterDependent_handling_clause(OracleSQLStatementParser.Dependent_handling_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void exitDependent_handling_clause(OracleSQLStatementParser.Dependent_handling_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void enterDependent_exceptions_part(OracleSQLStatementParser.Dependent_exceptions_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void exitDependent_exceptions_part(OracleSQLStatementParser.Dependent_exceptions_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(OracleSQLStatementParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(OracleSQLStatementParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#create_type_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_body(OracleSQLStatementParser.Create_type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#create_type_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_body(OracleSQLStatementParser.Create_type_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(OracleSQLStatementParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(OracleSQLStatementParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_def(OracleSQLStatementParser.Object_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_def(OracleSQLStatementParser.Object_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_as_part(OracleSQLStatementParser.Object_as_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_as_part(OracleSQLStatementParser.Object_as_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_under_part(OracleSQLStatementParser.Object_under_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_under_part(OracleSQLStatementParser.Object_under_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_type_def(OracleSQLStatementParser.Nested_table_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_type_def(OracleSQLStatementParser.Nested_table_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type(OracleSQLStatementParser.Sqlj_object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type(OracleSQLStatementParser.Sqlj_object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#type_body}.
	 * @param ctx the parse tree
	 */
	void enterType_body(OracleSQLStatementParser.Type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#type_body}.
	 * @param ctx the parse tree
	 */
	void exitType_body(OracleSQLStatementParser.Type_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void enterType_body_elements(OracleSQLStatementParser.Type_body_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void exitType_body_elements(OracleSQLStatementParser.Type_body_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_func_declaration(OracleSQLStatementParser.Map_order_func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_func_declaration(OracleSQLStatementParser.Map_order_func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterSubprog_decl_in_type(OracleSQLStatementParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitSubprog_decl_in_type(OracleSQLStatementParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterProc_decl_in_type(OracleSQLStatementParser.Proc_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitProc_decl_in_type(OracleSQLStatementParser.Proc_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_in_type(OracleSQLStatementParser.Func_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_in_type(OracleSQLStatementParser.Func_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(OracleSQLStatementParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(OracleSQLStatementParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void enterModifier_clause(OracleSQLStatementParser.Modifier_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void exitModifier_clause(OracleSQLStatementParser.Modifier_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void enterObject_member_spec(OracleSQLStatementParser.Object_member_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void exitObject_member_spec(OracleSQLStatementParser.Object_member_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type_attr(OracleSQLStatementParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type_attr(OracleSQLStatementParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec(OracleSQLStatementParser.Element_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec(OracleSQLStatementParser.Element_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec_options(OracleSQLStatementParser.Element_spec_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec_options(OracleSQLStatementParser.Element_spec_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_spec(OracleSQLStatementParser.Subprogram_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_spec(OracleSQLStatementParser.Subprogram_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_procedure_spec(OracleSQLStatementParser.Type_procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_procedure_spec(OracleSQLStatementParser.Type_procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#return_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type_spec(OracleSQLStatementParser.Return_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#return_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type_spec(OracleSQLStatementParser.Return_type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_function_spec(OracleSQLStatementParser.Type_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_function_spec(OracleSQLStatementParser.Type_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_spec(OracleSQLStatementParser.Constructor_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_spec(OracleSQLStatementParser.Constructor_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_function_spec(OracleSQLStatementParser.Map_order_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_function_spec(OracleSQLStatementParser.Map_order_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void enterPragma_clause(OracleSQLStatementParser.Pragma_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void exitPragma_clause(OracleSQLStatementParser.Pragma_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void enterPragma_elements(OracleSQLStatementParser.Pragma_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void exitPragma_elements(OracleSQLStatementParser.Pragma_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(OracleSQLStatementParser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(OracleSQLStatementParser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(OracleSQLStatementParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(OracleSQLStatementParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(OracleSQLStatementParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(OracleSQLStatementParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void enterSequence_spec(OracleSQLStatementParser.Sequence_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void exitSequence_spec(OracleSQLStatementParser.Sequence_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void enterSequence_start_clause(OracleSQLStatementParser.Sequence_start_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void exitSequence_start_clause(OracleSQLStatementParser.Sequence_start_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(OracleSQLStatementParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(OracleSQLStatementParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(OracleSQLStatementParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(OracleSQLStatementParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(OracleSQLStatementParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(OracleSQLStatementParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#comment_on_column}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_column(OracleSQLStatementParser.Comment_on_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#comment_on_column}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_column(OracleSQLStatementParser.Comment_on_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void enterCreate_synonym(OracleSQLStatementParser.Create_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void exitCreate_synonym(OracleSQLStatementParser.Create_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#comment_on_table}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_table(OracleSQLStatementParser.Comment_on_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#comment_on_table}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_table(OracleSQLStatementParser.Comment_on_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(OracleSQLStatementParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(OracleSQLStatementParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAdd_constraint(OracleSQLStatementParser.Add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAdd_constraint(OracleSQLStatementParser.Add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(OracleSQLStatementParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(OracleSQLStatementParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#references_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferences_clause(OracleSQLStatementParser.References_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#references_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferences_clause(OracleSQLStatementParser.References_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#on_delete_clause}.
	 * @param ctx the parse tree
	 */
	void enterOn_delete_clause(OracleSQLStatementParser.On_delete_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#on_delete_clause}.
	 * @param ctx the parse tree
	 */
	void exitOn_delete_clause(OracleSQLStatementParser.On_delete_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#unique_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnique_key_clause(OracleSQLStatementParser.Unique_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#unique_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnique_key_clause(OracleSQLStatementParser.Unique_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#primary_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_key_clause(OracleSQLStatementParser.Primary_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#primary_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_key_clause(OracleSQLStatementParser.Primary_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#anonymous_block}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_block(OracleSQLStatementParser.Anonymous_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#anonymous_block}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_block(OracleSQLStatementParser.Anonymous_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvoker_rights_clause(OracleSQLStatementParser.Invoker_rights_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvoker_rights_clause(OracleSQLStatementParser.Invoker_rights_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_parameters_clause(OracleSQLStatementParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_parameters_clause(OracleSQLStatementParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void enterCall_spec(OracleSQLStatementParser.Call_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void exitCall_spec(OracleSQLStatementParser.Call_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void enterJava_spec(OracleSQLStatementParser.Java_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void exitJava_spec(OracleSQLStatementParser.Java_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void enterC_spec(OracleSQLStatementParser.C_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void exitC_spec(OracleSQLStatementParser.C_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_agent_in_clause(OracleSQLStatementParser.C_agent_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_agent_in_clause(OracleSQLStatementParser.C_agent_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_parameters_clause(OracleSQLStatementParser.C_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_parameters_clause(OracleSQLStatementParser.C_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(OracleSQLStatementParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(OracleSQLStatementParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value_part(OracleSQLStatementParser.Default_value_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value_part(OracleSQLStatementParser.Default_value_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_spec(OracleSQLStatementParser.Declare_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_spec(OracleSQLStatementParser.Declare_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(OracleSQLStatementParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(OracleSQLStatementParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_declaration(OracleSQLStatementParser.Subtype_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_declaration(OracleSQLStatementParser.Subtype_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCursor_declaration(OracleSQLStatementParser.Cursor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCursor_declaration(OracleSQLStatementParser.Cursor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#parameter_specs}.
	 * @param ctx the parse tree
	 */
	void enterParameter_specs(OracleSQLStatementParser.Parameter_specsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#parameter_specs}.
	 * @param ctx the parse tree
	 */
	void exitParameter_specs(OracleSQLStatementParser.Parameter_specsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void enterParameter_spec(OracleSQLStatementParser.Parameter_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void exitParameter_spec(OracleSQLStatementParser.Parameter_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(OracleSQLStatementParser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(OracleSQLStatementParser.Exception_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPragma_declaration(OracleSQLStatementParser.Pragma_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPragma_declaration(OracleSQLStatementParser.Pragma_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#record_type_def}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_def(OracleSQLStatementParser.Record_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#record_type_def}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_def(OracleSQLStatementParser.Record_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void enterField_spec(OracleSQLStatementParser.Field_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void exitField_spec(OracleSQLStatementParser.Field_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#ref_cursor_type_def}.
	 * @param ctx the parse tree
	 */
	void enterRef_cursor_type_def(OracleSQLStatementParser.Ref_cursor_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#ref_cursor_type_def}.
	 * @param ctx the parse tree
	 */
	void exitRef_cursor_type_def(OracleSQLStatementParser.Ref_cursor_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(OracleSQLStatementParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(OracleSQLStatementParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#table_type_def}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_def(OracleSQLStatementParser.Table_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#table_type_def}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_def(OracleSQLStatementParser.Table_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void enterTable_indexed_by_part(OracleSQLStatementParser.Table_indexed_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void exitTable_indexed_by_part(OracleSQLStatementParser.Table_indexed_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void enterVarray_type_def(OracleSQLStatementParser.Varray_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void exitVarray_type_def(OracleSQLStatementParser.Varray_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSeq_of_statements(OracleSQLStatementParser.Seq_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSeq_of_statements(OracleSQLStatementParser.Seq_of_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLabel_declaration(OracleSQLStatementParser.Label_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLabel_declaration(OracleSQLStatementParser.Label_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OracleSQLStatementParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OracleSQLStatementParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(OracleSQLStatementParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(OracleSQLStatementParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(OracleSQLStatementParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(OracleSQLStatementParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(OracleSQLStatementParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(OracleSQLStatementParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(OracleSQLStatementParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(OracleSQLStatementParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(OracleSQLStatementParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(OracleSQLStatementParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void enterElsif_part(OracleSQLStatementParser.Elsif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void exitElsif_part(OracleSQLStatementParser.Elsif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(OracleSQLStatementParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(OracleSQLStatementParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(OracleSQLStatementParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(OracleSQLStatementParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void enterCursor_loop_param(OracleSQLStatementParser.Cursor_loop_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void exitCursor_loop_param(OracleSQLStatementParser.Cursor_loop_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void enterForall_statement(OracleSQLStatementParser.Forall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void exitForall_statement(OracleSQLStatementParser.Forall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void enterBounds_clause(OracleSQLStatementParser.Bounds_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void exitBounds_clause(OracleSQLStatementParser.Bounds_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void enterBetween_bound(OracleSQLStatementParser.Between_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void exitBetween_bound(OracleSQLStatementParser.Between_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void enterLower_bound(OracleSQLStatementParser.Lower_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void exitLower_bound(OracleSQLStatementParser.Lower_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(OracleSQLStatementParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(OracleSQLStatementParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(OracleSQLStatementParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(OracleSQLStatementParser.Null_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(OracleSQLStatementParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(OracleSQLStatementParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(OracleSQLStatementParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(OracleSQLStatementParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(OracleSQLStatementParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(OracleSQLStatementParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#pipe_row_statement}.
	 * @param ctx the parse tree
	 */
	void enterPipe_row_statement(OracleSQLStatementParser.Pipe_row_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#pipe_row_statement}.
	 * @param ctx the parse tree
	 */
	void exitPipe_row_statement(OracleSQLStatementParser.Pipe_row_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(OracleSQLStatementParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(OracleSQLStatementParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(OracleSQLStatementParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(OracleSQLStatementParser.Exception_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_block(OracleSQLStatementParser.Trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_block(OracleSQLStatementParser.Trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(OracleSQLStatementParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(OracleSQLStatementParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(OracleSQLStatementParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(OracleSQLStatementParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate(OracleSQLStatementParser.Execute_immediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate(OracleSQLStatementParser.Execute_immediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_returning_clause(OracleSQLStatementParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_returning_clause(OracleSQLStatementParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void enterData_manipulation_language_statements(OracleSQLStatementParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void exitData_manipulation_language_statements(OracleSQLStatementParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void enterCursor_manipulation_statements(OracleSQLStatementParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void exitCursor_manipulation_statements(OracleSQLStatementParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(OracleSQLStatementParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(OracleSQLStatementParser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(OracleSQLStatementParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(OracleSQLStatementParser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(OracleSQLStatementParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(OracleSQLStatementParser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_for_statement(OracleSQLStatementParser.Open_for_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_for_statement(OracleSQLStatementParser.Open_for_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_control_statements(OracleSQLStatementParser.Transaction_control_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_control_statements(OracleSQLStatementParser.Transaction_control_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_transaction_command(OracleSQLStatementParser.Set_transaction_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_transaction_command(OracleSQLStatementParser.Set_transaction_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_constraint_command(OracleSQLStatementParser.Set_constraint_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_constraint_command(OracleSQLStatementParser.Set_constraint_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(OracleSQLStatementParser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(OracleSQLStatementParser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(OracleSQLStatementParser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(OracleSQLStatementParser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_statement(OracleSQLStatementParser.Savepoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_statement(OracleSQLStatementParser.Savepoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain_statement(OracleSQLStatementParser.Explain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain_statement(OracleSQLStatementParser.Explain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(OracleSQLStatementParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(OracleSQLStatementParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause(OracleSQLStatementParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause(OracleSQLStatementParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void enterFactoring_element(OracleSQLStatementParser.Factoring_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void exitFactoring_element(OracleSQLStatementParser.Factoring_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(OracleSQLStatementParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(OracleSQLStatementParser.Search_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void enterCycle_clause(OracleSQLStatementParser.Cycle_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void exitCycle_clause(OracleSQLStatementParser.Cycle_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(OracleSQLStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(OracleSQLStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_operation_part(OracleSQLStatementParser.Subquery_operation_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_operation_part(OracleSQLStatementParser.Subquery_operation_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_basic_elements(OracleSQLStatementParser.Subquery_basic_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_basic_elements(OracleSQLStatementParser.Subquery_basic_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#query_block}.
	 * @param ctx the parse tree
	 */
	void enterQuery_block(OracleSQLStatementParser.Query_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#query_block}.
	 * @param ctx the parse tree
	 */
	void exitQuery_block(OracleSQLStatementParser.Query_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void enterSelected_element(OracleSQLStatementParser.Selected_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void exitSelected_element(OracleSQLStatementParser.Selected_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(OracleSQLStatementParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(OracleSQLStatementParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elements(OracleSQLStatementParser.Select_list_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elements(OracleSQLStatementParser.Select_list_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_list(OracleSQLStatementParser.Table_ref_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_list(OracleSQLStatementParser.Table_ref_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref(OracleSQLStatementParser.Table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref(OracleSQLStatementParser.Table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux(OracleSQLStatementParser.Table_ref_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux(OracleSQLStatementParser.Table_ref_auxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_ref_aux_internal_one}
	 * labeled alternative in {@link OracleSQLStatementParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux_internal_one(OracleSQLStatementParser.Table_ref_aux_internal_oneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_ref_aux_internal_one}
	 * labeled alternative in {@link OracleSQLStatementParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux_internal_one(OracleSQLStatementParser.Table_ref_aux_internal_oneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_ref_aux_internal_two}
	 * labeled alternative in {@link OracleSQLStatementParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux_internal_two(OracleSQLStatementParser.Table_ref_aux_internal_twoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_ref_aux_internal_two}
	 * labeled alternative in {@link OracleSQLStatementParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux_internal_two(OracleSQLStatementParser.Table_ref_aux_internal_twoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_ref_aux_internal_three}
	 * labeled alternative in {@link OracleSQLStatementParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux_internal_three(OracleSQLStatementParser.Table_ref_aux_internal_threeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_ref_aux_internal_three}
	 * labeled alternative in {@link OracleSQLStatementParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux_internal_three(OracleSQLStatementParser.Table_ref_aux_internal_threeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(OracleSQLStatementParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(OracleSQLStatementParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_on_part(OracleSQLStatementParser.Join_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_on_part(OracleSQLStatementParser.Join_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_using_part(OracleSQLStatementParser.Join_using_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_using_part(OracleSQLStatementParser.Join_using_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(OracleSQLStatementParser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(OracleSQLStatementParser.Outer_join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_partition_clause(OracleSQLStatementParser.Query_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_partition_clause(OracleSQLStatementParser.Query_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_query_clause(OracleSQLStatementParser.Flashback_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_query_clause(OracleSQLStatementParser.Flashback_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(OracleSQLStatementParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(OracleSQLStatementParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_element(OracleSQLStatementParser.Pivot_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_element(OracleSQLStatementParser.Pivot_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_for_clause(OracleSQLStatementParser.Pivot_for_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_for_clause(OracleSQLStatementParser.Pivot_for_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause(OracleSQLStatementParser.Pivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause(OracleSQLStatementParser.Pivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_element(OracleSQLStatementParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_element(OracleSQLStatementParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_elements(OracleSQLStatementParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_elements(OracleSQLStatementParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(OracleSQLStatementParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(OracleSQLStatementParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause(OracleSQLStatementParser.Unpivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause(OracleSQLStatementParser.Unpivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_elements(OracleSQLStatementParser.Unpivot_in_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_elements(OracleSQLStatementParser.Unpivot_in_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_query_clause(OracleSQLStatementParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_query_clause(OracleSQLStatementParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#start_part}.
	 * @param ctx the parse tree
	 */
	void enterStart_part(OracleSQLStatementParser.Start_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#start_part}.
	 * @param ctx the parse tree
	 */
	void exitStart_part(OracleSQLStatementParser.Start_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(OracleSQLStatementParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(OracleSQLStatementParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_elements(OracleSQLStatementParser.Group_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_elements(OracleSQLStatementParser.Group_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void enterRollup_cube_clause(OracleSQLStatementParser.Rollup_cube_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void exitRollup_cube_clause(OracleSQLStatementParser.Rollup_cube_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_clause(OracleSQLStatementParser.Grouping_sets_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_clause(OracleSQLStatementParser.Grouping_sets_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_elements(OracleSQLStatementParser.Grouping_sets_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_elements(OracleSQLStatementParser.Grouping_sets_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(OracleSQLStatementParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(OracleSQLStatementParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_clause(OracleSQLStatementParser.Model_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_clause(OracleSQLStatementParser.Model_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference_options(OracleSQLStatementParser.Cell_reference_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference_options(OracleSQLStatementParser.Cell_reference_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rows_clause(OracleSQLStatementParser.Return_rows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rows_clause(OracleSQLStatementParser.Return_rows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void enterReference_model(OracleSQLStatementParser.Reference_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void exitReference_model(OracleSQLStatementParser.Reference_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#main_model}.
	 * @param ctx the parse tree
	 */
	void enterMain_model(OracleSQLStatementParser.Main_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#main_model}.
	 * @param ctx the parse tree
	 */
	void exitMain_model(OracleSQLStatementParser.Main_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_clauses(OracleSQLStatementParser.Model_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_clauses(OracleSQLStatementParser.Model_column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_partition_part(OracleSQLStatementParser.Model_column_partition_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_partition_part(OracleSQLStatementParser.Model_column_partition_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_list(OracleSQLStatementParser.Model_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_list(OracleSQLStatementParser.Model_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#model_column}.
	 * @param ctx the parse tree
	 */
	void enterModel_column(OracleSQLStatementParser.Model_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#model_column}.
	 * @param ctx the parse tree
	 */
	void exitModel_column(OracleSQLStatementParser.Model_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_clause(OracleSQLStatementParser.Model_rules_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_clause(OracleSQLStatementParser.Model_rules_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_part(OracleSQLStatementParser.Model_rules_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_part(OracleSQLStatementParser.Model_rules_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_element(OracleSQLStatementParser.Model_rules_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_element(OracleSQLStatementParser.Model_rules_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment(OracleSQLStatementParser.Cell_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment(OracleSQLStatementParser.Cell_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_iterate_clause(OracleSQLStatementParser.Model_iterate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_iterate_clause(OracleSQLStatementParser.Model_iterate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#until_part}.
	 * @param ctx the parse tree
	 */
	void enterUntil_part(OracleSQLStatementParser.Until_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#until_part}.
	 * @param ctx the parse tree
	 */
	void exitUntil_part(OracleSQLStatementParser.Until_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(OracleSQLStatementParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(OracleSQLStatementParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_elements(OracleSQLStatementParser.Order_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_elements(OracleSQLStatementParser.Order_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause(OracleSQLStatementParser.For_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause(OracleSQLStatementParser.For_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_of_part(OracleSQLStatementParser.For_update_of_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_of_part(OracleSQLStatementParser.For_update_of_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_options(OracleSQLStatementParser.For_update_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_options(OracleSQLStatementParser.For_update_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(OracleSQLStatementParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(OracleSQLStatementParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause(OracleSQLStatementParser.Update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause(OracleSQLStatementParser.Update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterColumn_based_update_set_clause(OracleSQLStatementParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitColumn_based_update_set_clause(OracleSQLStatementParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(OracleSQLStatementParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(OracleSQLStatementParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(OracleSQLStatementParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(OracleSQLStatementParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_insert(OracleSQLStatementParser.Single_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_insert(OracleSQLStatementParser.Single_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_insert(OracleSQLStatementParser.Multi_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_insert(OracleSQLStatementParser.Multi_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_element(OracleSQLStatementParser.Multi_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_element(OracleSQLStatementParser.Multi_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_clause(OracleSQLStatementParser.Conditional_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_clause(OracleSQLStatementParser.Conditional_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_when_part(OracleSQLStatementParser.Conditional_insert_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_when_part(OracleSQLStatementParser.Conditional_insert_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_else_part(OracleSQLStatementParser.Conditional_insert_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_else_part(OracleSQLStatementParser.Conditional_insert_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_clause(OracleSQLStatementParser.Insert_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_clause(OracleSQLStatementParser.Insert_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(OracleSQLStatementParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(OracleSQLStatementParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(OracleSQLStatementParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(OracleSQLStatementParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_clause(OracleSQLStatementParser.Merge_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_clause(OracleSQLStatementParser.Merge_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void enterMerge_element(OracleSQLStatementParser.Merge_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void exitMerge_element(OracleSQLStatementParser.Merge_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_delete_part(OracleSQLStatementParser.Merge_update_delete_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_delete_part(OracleSQLStatementParser.Merge_update_delete_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert_clause(OracleSQLStatementParser.Merge_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert_clause(OracleSQLStatementParser.Merge_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void enterSelected_tableview(OracleSQLStatementParser.Selected_tableviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void exitSelected_tableview(OracleSQLStatementParser.Selected_tableviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_statement(OracleSQLStatementParser.Lock_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_statement(OracleSQLStatementParser.Lock_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void enterWait_nowait_part(OracleSQLStatementParser.Wait_nowait_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void exitWait_nowait_part(OracleSQLStatementParser.Wait_nowait_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_element(OracleSQLStatementParser.Lock_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_element(OracleSQLStatementParser.Lock_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void enterLock_mode(OracleSQLStatementParser.Lock_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void exitLock_mode(OracleSQLStatementParser.Lock_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_table_ref(OracleSQLStatementParser.General_table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_table_ref(OracleSQLStatementParser.General_table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterStatic_returning_clause(OracleSQLStatementParser.Static_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitStatic_returning_clause(OracleSQLStatementParser.Static_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_clause(OracleSQLStatementParser.Error_logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_clause(OracleSQLStatementParser.Error_logging_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_into_part(OracleSQLStatementParser.Error_logging_into_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_into_part(OracleSQLStatementParser.Error_logging_into_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_reject_part(OracleSQLStatementParser.Error_logging_reject_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_reject_part(OracleSQLStatementParser.Error_logging_reject_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_table_expression_clause(OracleSQLStatementParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_table_expression_clause(OracleSQLStatementParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void enterTable_collection_expression(OracleSQLStatementParser.Table_collection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void exitTable_collection_expression(OracleSQLStatementParser.Table_collection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_restriction_clause(OracleSQLStatementParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_restriction_clause(OracleSQLStatementParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void enterSample_clause(OracleSQLStatementParser.Sample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void exitSample_clause(OracleSQLStatementParser.Sample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void enterSeed_part(OracleSQLStatementParser.Seed_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void exitSeed_part(OracleSQLStatementParser.Seed_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterCursor_expression(OracleSQLStatementParser.Cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitCursor_expression(OracleSQLStatementParser.Cursor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(OracleSQLStatementParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(OracleSQLStatementParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(OracleSQLStatementParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(OracleSQLStatementParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(OracleSQLStatementParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(OracleSQLStatementParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(OracleSQLStatementParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(OracleSQLStatementParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(OracleSQLStatementParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(OracleSQLStatementParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#negated_expression}.
	 * @param ctx the parse tree
	 */
	void enterNegated_expression(OracleSQLStatementParser.Negated_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#negated_expression}.
	 * @param ctx the parse tree
	 */
	void exitNegated_expression(OracleSQLStatementParser.Negated_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(OracleSQLStatementParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(OracleSQLStatementParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_expression(OracleSQLStatementParser.Multiset_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_expression(OracleSQLStatementParser.Multiset_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#multiset_type}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_type(OracleSQLStatementParser.Multiset_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#multiset_type}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_type(OracleSQLStatementParser.Multiset_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(OracleSQLStatementParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(OracleSQLStatementParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(OracleSQLStatementParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(OracleSQLStatementParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expression(OracleSQLStatementParser.Compound_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expression(OracleSQLStatementParser.Compound_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#like_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterLike_concatenation(OracleSQLStatementParser.Like_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#like_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitLike_concatenation(OracleSQLStatementParser.Like_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#like_type}.
	 * @param ctx the parse tree
	 */
	void enterLike_type(OracleSQLStatementParser.Like_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#like_type}.
	 * @param ctx the parse tree
	 */
	void exitLike_type(OracleSQLStatementParser.Like_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#like_escape_part}.
	 * @param ctx the parse tree
	 */
	void enterLike_escape_part(OracleSQLStatementParser.Like_escape_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#like_escape_part}.
	 * @param ctx the parse tree
	 */
	void exitLike_escape_part(OracleSQLStatementParser.Like_escape_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void enterIn_elements(OracleSQLStatementParser.In_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void exitIn_elements(OracleSQLStatementParser.In_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void enterBetween_elements(OracleSQLStatementParser.Between_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void exitBetween_elements(OracleSQLStatementParser.Between_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(OracleSQLStatementParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(OracleSQLStatementParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(OracleSQLStatementParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(OracleSQLStatementParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_expression(OracleSQLStatementParser.Multiply_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#multiply_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_expression(OracleSQLStatementParser.Multiply_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expression(OracleSQLStatementParser.Datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expression(OracleSQLStatementParser.Datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expression(OracleSQLStatementParser.Interval_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expression(OracleSQLStatementParser.Interval_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression(OracleSQLStatementParser.Model_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression(OracleSQLStatementParser.Model_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression_element(OracleSQLStatementParser.Model_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression_element(OracleSQLStatementParser.Model_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterSingle_column_for_loop(OracleSQLStatementParser.Single_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitSingle_column_for_loop(OracleSQLStatementParser.Single_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#for_like_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_like_part(OracleSQLStatementParser.For_like_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#for_like_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_like_part(OracleSQLStatementParser.For_like_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 */
	void enterFor_increment_decrement_type(OracleSQLStatementParser.For_increment_decrement_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 */
	void exitFor_increment_decrement_type(OracleSQLStatementParser.For_increment_decrement_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterMulti_column_for_loop(OracleSQLStatementParser.Multi_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitMulti_column_for_loop(OracleSQLStatementParser.Multi_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(OracleSQLStatementParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(OracleSQLStatementParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(OracleSQLStatementParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(OracleSQLStatementParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_statement(OracleSQLStatementParser.Simple_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_statement(OracleSQLStatementParser.Simple_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_when_part(OracleSQLStatementParser.Simple_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_when_part(OracleSQLStatementParser.Simple_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_statement(OracleSQLStatementParser.Searched_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_statement(OracleSQLStatementParser.Searched_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_when_part(OracleSQLStatementParser.Searched_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_when_part(OracleSQLStatementParser.Searched_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void enterCase_else_part(OracleSQLStatementParser.Case_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void exitCase_else_part(OracleSQLStatementParser.Case_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(OracleSQLStatementParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(OracleSQLStatementParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#expression_or_vector}.
	 * @param ctx the parse tree
	 */
	void enterExpression_or_vector(OracleSQLStatementParser.Expression_or_vectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#expression_or_vector}.
	 * @param ctx the parse tree
	 */
	void exitExpression_or_vector(OracleSQLStatementParser.Expression_or_vectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void enterVector_expr(OracleSQLStatementParser.Vector_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#vector_expr}.
	 * @param ctx the parse tree
	 */
	void exitVector_expr(OracleSQLStatementParser.Vector_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuantified_expression(OracleSQLStatementParser.Quantified_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuantified_expression(OracleSQLStatementParser.Quantified_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#string_function}.
	 * @param ctx the parse tree
	 */
	void enterString_function(OracleSQLStatementParser.String_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#string_function}.
	 * @param ctx the parse tree
	 */
	void exitString_function(OracleSQLStatementParser.String_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void enterStandard_function(OracleSQLStatementParser.Standard_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void exitStandard_function(OracleSQLStatementParser.Standard_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#numeric_function_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_function_wrapper(OracleSQLStatementParser.Numeric_function_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#numeric_function_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_function_wrapper(OracleSQLStatementParser.Numeric_function_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#numeric_function}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_function(OracleSQLStatementParser.Numeric_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#numeric_function}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_function(OracleSQLStatementParser.Numeric_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#date_time_function}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_function(OracleSQLStatementParser.Date_time_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#date_time_function}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_function(OracleSQLStatementParser.Date_time_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#other_function}.
	 * @param ctx the parse tree
	 */
	void enterOther_function(OracleSQLStatementParser.Other_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#other_function}.
	 * @param ctx the parse tree
	 */
	void exitOther_function(OracleSQLStatementParser.Other_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause_keyword(OracleSQLStatementParser.Over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause_keyword(OracleSQLStatementParser.Over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_clause_keyword(OracleSQLStatementParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_clause_keyword(OracleSQLStatementParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void enterStandard_prediction_function_keyword(OracleSQLStatementParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void exitStandard_prediction_function_keyword(OracleSQLStatementParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(OracleSQLStatementParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(OracleSQLStatementParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause(OracleSQLStatementParser.Windowing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause(OracleSQLStatementParser.Windowing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_type(OracleSQLStatementParser.Windowing_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_type(OracleSQLStatementParser.Windowing_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_elements(OracleSQLStatementParser.Windowing_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_elements(OracleSQLStatementParser.Windowing_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(OracleSQLStatementParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(OracleSQLStatementParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#using_element}.
	 * @param ctx the parse tree
	 */
	void enterUsing_element(OracleSQLStatementParser.Using_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#using_element}.
	 * @param ctx the parse tree
	 */
	void exitUsing_element(OracleSQLStatementParser.Using_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void enterCollect_order_by_part(OracleSQLStatementParser.Collect_order_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void exitCollect_order_by_part(OracleSQLStatementParser.Collect_order_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_part(OracleSQLStatementParser.Within_or_over_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_part(OracleSQLStatementParser.Within_or_over_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void enterCost_matrix_clause(OracleSQLStatementParser.Cost_matrix_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void exitCost_matrix_clause(OracleSQLStatementParser.Cost_matrix_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_passing_clause(OracleSQLStatementParser.Xml_passing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_passing_clause(OracleSQLStatementParser.Xml_passing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_attributes_clause(OracleSQLStatementParser.Xml_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_attributes_clause(OracleSQLStatementParser.Xml_attributes_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_namespaces_clause(OracleSQLStatementParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_namespaces_clause(OracleSQLStatementParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void enterXml_table_column(OracleSQLStatementParser.Xml_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void exitXml_table_column(OracleSQLStatementParser.Xml_table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void enterXml_general_default_part(OracleSQLStatementParser.Xml_general_default_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void exitXml_general_default_part(OracleSQLStatementParser.Xml_general_default_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterXml_multiuse_expression_element(OracleSQLStatementParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitXml_multiuse_expression_element(OracleSQLStatementParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_version_part(OracleSQLStatementParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_version_part(OracleSQLStatementParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_standalone_part(OracleSQLStatementParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_standalone_part(OracleSQLStatementParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_enconding_part(OracleSQLStatementParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_enconding_part(OracleSQLStatementParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_version_part(OracleSQLStatementParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_version_part(OracleSQLStatementParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_ident_part(OracleSQLStatementParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_ident_part(OracleSQLStatementParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void enterSql_plus_command(OracleSQLStatementParser.Sql_plus_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void exitSql_plus_command(OracleSQLStatementParser.Sql_plus_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void enterWhenever_command(OracleSQLStatementParser.Whenever_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void exitWhenever_command(OracleSQLStatementParser.Whenever_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#set_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_command(OracleSQLStatementParser.Set_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#set_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_command(OracleSQLStatementParser.Set_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#exit_command}.
	 * @param ctx the parse tree
	 */
	void enterExit_command(OracleSQLStatementParser.Exit_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#exit_command}.
	 * @param ctx the parse tree
	 */
	void exitExit_command(OracleSQLStatementParser.Exit_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#prompt_command}.
	 * @param ctx the parse tree
	 */
	void enterPrompt_command(OracleSQLStatementParser.Prompt_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#prompt_command}.
	 * @param ctx the parse tree
	 */
	void exitPrompt_command(OracleSQLStatementParser.Prompt_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#show_errors_command}.
	 * @param ctx the parse tree
	 */
	void enterShow_errors_command(OracleSQLStatementParser.Show_errors_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#show_errors_command}.
	 * @param ctx the parse tree
	 */
	void exitShow_errors_command(OracleSQLStatementParser.Show_errors_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#start_command}.
	 * @param ctx the parse tree
	 */
	void enterStart_command(OracleSQLStatementParser.Start_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#start_command}.
	 * @param ctx the parse tree
	 */
	void exitStart_command(OracleSQLStatementParser.Start_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extension_clause(OracleSQLStatementParser.Partition_extension_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extension_clause(OracleSQLStatementParser.Partition_extension_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(OracleSQLStatementParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(OracleSQLStatementParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(OracleSQLStatementParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(OracleSQLStatementParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterAlias_quoted_string(OracleSQLStatementParser.Alias_quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitAlias_quoted_string(OracleSQLStatementParser.Alias_quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(OracleSQLStatementParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(OracleSQLStatementParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#current_of_clause}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_of_clause(OracleSQLStatementParser.Current_of_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#current_of_clause}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_of_clause(OracleSQLStatementParser.Current_of_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(OracleSQLStatementParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(OracleSQLStatementParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void enterXml_column_name(OracleSQLStatementParser.Xml_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void exitXml_column_name(OracleSQLStatementParser.Xml_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void enterCost_class_name(OracleSQLStatementParser.Cost_class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void exitCost_class_name(OracleSQLStatementParser.Cost_class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(OracleSQLStatementParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(OracleSQLStatementParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(OracleSQLStatementParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(OracleSQLStatementParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void enterRollback_segment_name(OracleSQLStatementParser.Rollback_segment_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void exitRollback_segment_name(OracleSQLStatementParser.Rollback_segment_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_var_name(OracleSQLStatementParser.Table_var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_var_name(OracleSQLStatementParser.Table_var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(OracleSQLStatementParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(OracleSQLStatementParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_name(OracleSQLStatementParser.Routine_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_name(OracleSQLStatementParser.Routine_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(OracleSQLStatementParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(OracleSQLStatementParser.Package_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_type_name(OracleSQLStatementParser.Implementation_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_type_name(OracleSQLStatementParser.Implementation_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(OracleSQLStatementParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(OracleSQLStatementParser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void enterReference_model_name(OracleSQLStatementParser.Reference_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void exitReference_model_name(OracleSQLStatementParser.Reference_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void enterMain_model_name(OracleSQLStatementParser.Main_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void exitMain_model_name(OracleSQLStatementParser.Main_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function_name(OracleSQLStatementParser.Aggregate_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function_name(OracleSQLStatementParser.Aggregate_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#query_name}.
	 * @param ctx the parse tree
	 */
	void enterQuery_name(OracleSQLStatementParser.Query_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#query_name}.
	 * @param ctx the parse tree
	 */
	void exitQuery_name(OracleSQLStatementParser.Query_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(OracleSQLStatementParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(OracleSQLStatementParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(OracleSQLStatementParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(OracleSQLStatementParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(OracleSQLStatementParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(OracleSQLStatementParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void enterSequence_name(OracleSQLStatementParser.Sequence_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void exitSequence_name(OracleSQLStatementParser.Sequence_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void enterException_name(OracleSQLStatementParser.Exception_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void exitException_name(OracleSQLStatementParser.Exception_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(OracleSQLStatementParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(OracleSQLStatementParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(OracleSQLStatementParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(OracleSQLStatementParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#constructor_name}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_name(OracleSQLStatementParser.Constructor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#constructor_name}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_name(OracleSQLStatementParser.Constructor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(OracleSQLStatementParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(OracleSQLStatementParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(OracleSQLStatementParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(OracleSQLStatementParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(OracleSQLStatementParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(OracleSQLStatementParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(OracleSQLStatementParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(OracleSQLStatementParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#record_name}.
	 * @param ctx the parse tree
	 */
	void enterRecord_name(OracleSQLStatementParser.Record_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#record_name}.
	 * @param ctx the parse tree
	 */
	void exitRecord_name(OracleSQLStatementParser.Record_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void enterCollection_name(OracleSQLStatementParser.Collection_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void exitCollection_name(OracleSQLStatementParser.Collection_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#link_name}.
	 * @param ctx the parse tree
	 */
	void enterLink_name(OracleSQLStatementParser.Link_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#link_name}.
	 * @param ctx the parse tree
	 */
	void exitLink_name(OracleSQLStatementParser.Link_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(OracleSQLStatementParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(OracleSQLStatementParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void enterTableview_name(OracleSQLStatementParser.Tableview_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void exitTableview_name(OracleSQLStatementParser.Tableview_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void enterChar_set_name(OracleSQLStatementParser.Char_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void exitChar_set_name(OracleSQLStatementParser.Char_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#synonym_name}.
	 * @param ctx the parse tree
	 */
	void enterSynonym_name(OracleSQLStatementParser.Synonym_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#synonym_name}.
	 * @param ctx the parse tree
	 */
	void exitSynonym_name(OracleSQLStatementParser.Synonym_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#schema_object_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_object_name(OracleSQLStatementParser.Schema_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#schema_object_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_object_name(OracleSQLStatementParser.Schema_object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void enterKeep_clause(OracleSQLStatementParser.Keep_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void exitKeep_clause(OracleSQLStatementParser.Keep_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(OracleSQLStatementParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(OracleSQLStatementParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(OracleSQLStatementParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(OracleSQLStatementParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_analytic(OracleSQLStatementParser.Function_argument_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_analytic(OracleSQLStatementParser.Function_argument_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_modeling(OracleSQLStatementParser.Function_argument_modelingContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_modeling(OracleSQLStatementParser.Function_argument_modelingContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void enterRespect_or_ignore_nulls(OracleSQLStatementParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void exitRespect_or_ignore_nulls(OracleSQLStatementParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(OracleSQLStatementParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(OracleSQLStatementParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(OracleSQLStatementParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(OracleSQLStatementParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(OracleSQLStatementParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(OracleSQLStatementParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_part(OracleSQLStatementParser.Precision_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_part(OracleSQLStatementParser.Precision_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void enterNative_datatype_element(OracleSQLStatementParser.Native_datatype_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void exitNative_datatype_element(OracleSQLStatementParser.Native_datatype_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void enterBind_variable(OracleSQLStatementParser.Bind_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void exitBind_variable(OracleSQLStatementParser.Bind_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#general_element}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element(OracleSQLStatementParser.General_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#general_element}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element(OracleSQLStatementParser.General_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element_part(OracleSQLStatementParser.General_element_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element_part(OracleSQLStatementParser.General_element_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#table_element}.
	 * @param ctx the parse tree
	 */
	void enterTable_element(OracleSQLStatementParser.Table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#table_element}.
	 * @param ctx the parse tree
	 */
	void exitTable_element(OracleSQLStatementParser.Table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(OracleSQLStatementParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(OracleSQLStatementParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(OracleSQLStatementParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(OracleSQLStatementParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#int_value}.
	 * @param ctx the parse tree
	 */
	void enterInt_value(OracleSQLStatementParser.Int_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#int_value}.
	 * @param ctx the parse tree
	 */
	void exitInt_value(OracleSQLStatementParser.Int_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#float_value}.
	 * @param ctx the parse tree
	 */
	void enterFloat_value(OracleSQLStatementParser.Float_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#float_value}.
	 * @param ctx the parse tree
	 */
	void exitFloat_value(OracleSQLStatementParser.Float_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#numeric_negative}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_negative(OracleSQLStatementParser.Numeric_negativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#numeric_negative}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_negative(OracleSQLStatementParser.Numeric_negativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(OracleSQLStatementParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(OracleSQLStatementParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OracleSQLStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OracleSQLStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void enterId_expression(OracleSQLStatementParser.Id_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void exitId_expression(OracleSQLStatementParser.Id_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#not_equal_op}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal_op(OracleSQLStatementParser.Not_equal_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#not_equal_op}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal_op(OracleSQLStatementParser.Not_equal_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void enterGreater_than_or_equals_op(OracleSQLStatementParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void exitGreater_than_or_equals_op(OracleSQLStatementParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void enterLess_than_or_equals_op(OracleSQLStatementParser.Less_than_or_equals_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 */
	void exitLess_than_or_equals_op(OracleSQLStatementParser.Less_than_or_equals_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#concatenation_op}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation_op(OracleSQLStatementParser.Concatenation_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#concatenation_op}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation_op(OracleSQLStatementParser.Concatenation_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_sign(OracleSQLStatementParser.Outer_join_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_sign(OracleSQLStatementParser.Outer_join_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void enterRegular_id(OracleSQLStatementParser.Regular_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void exitRegular_id(OracleSQLStatementParser.Regular_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#string_function_name}.
	 * @param ctx the parse tree
	 */
	void enterString_function_name(OracleSQLStatementParser.String_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#string_function_name}.
	 * @param ctx the parse tree
	 */
	void exitString_function_name(OracleSQLStatementParser.String_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#numeric_function_name}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_function_name(OracleSQLStatementParser.Numeric_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#numeric_function_name}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_function_name(OracleSQLStatementParser.Numeric_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#date_time_function_name}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_function_name(OracleSQLStatementParser.Date_time_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#date_time_function_name}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_function_name(OracleSQLStatementParser.Date_time_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#conversion_function_name}.
	 * @param ctx the parse tree
	 */
	void enterConversion_function_name(OracleSQLStatementParser.Conversion_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#conversion_function_name}.
	 * @param ctx the parse tree
	 */
	void exitConversion_function_name(OracleSQLStatementParser.Conversion_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#analytic_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_function_name(OracleSQLStatementParser.Analytic_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#analytic_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_function_name(OracleSQLStatementParser.Analytic_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OracleSQLStatementParser#advanced_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAdvanced_function_name(OracleSQLStatementParser.Advanced_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OracleSQLStatementParser#advanced_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAdvanced_function_name(OracleSQLStatementParser.Advanced_function_nameContext ctx);
}