// Generated from /Users/kent/IdeaProjects/github/gumiho/gumiho/src/main/resources/grammars/sql/dialect/oracle/OracleSQLStatementParser.g4 by ANTLR 4.7
package com.kent.gumiho.sql.dialect.oracle.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OracleSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OracleSQLStatementParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(OracleSQLStatementParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwallow_to_semi(OracleSQLStatementParser.Swallow_to_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#unit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit_statement(OracleSQLStatementParser.Unit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#drop_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function(OracleSQLStatementParser.Drop_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alter_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_function(OracleSQLStatementParser.Alter_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#create_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_body(OracleSQLStatementParser.Create_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_enable_clause(OracleSQLStatementParser.Parallel_enable_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by_clause(OracleSQLStatementParser.Partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#result_cache_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_cache_clause(OracleSQLStatementParser.Result_cache_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#relies_on_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelies_on_part(OracleSQLStatementParser.Relies_on_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#streaming_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreaming_clause(OracleSQLStatementParser.Streaming_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#drop_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_package(OracleSQLStatementParser.Drop_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alter_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_package(OracleSQLStatementParser.Alter_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#create_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package(OracleSQLStatementParser.Create_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#create_package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body(OracleSQLStatementParser.Create_package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#package_obj_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_obj_spec(OracleSQLStatementParser.Package_obj_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#procedure_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_spec(OracleSQLStatementParser.Procedure_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_spec(OracleSQLStatementParser.Function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#package_obj_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_obj_body(OracleSQLStatementParser.Package_obj_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#drop_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure(OracleSQLStatementParser.Drop_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alter_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_procedure(OracleSQLStatementParser.Alter_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(OracleSQLStatementParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#procedure_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_body(OracleSQLStatementParser.Procedure_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#create_procedure_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_body(OracleSQLStatementParser.Create_procedure_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#drop_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger(OracleSQLStatementParser.Drop_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alter_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_trigger(OracleSQLStatementParser.Alter_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#create_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger(OracleSQLStatementParser.Create_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_follows_clause(OracleSQLStatementParser.Trigger_follows_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_when_clause(OracleSQLStatementParser.Trigger_when_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_dml_trigger(OracleSQLStatementParser.Simple_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#for_each_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_row(OracleSQLStatementParser.For_each_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_dml_trigger(OracleSQLStatementParser.Compound_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_dml_trigger(OracleSQLStatementParser.Non_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#trigger_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_body(OracleSQLStatementParser.Trigger_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_trigger_block(OracleSQLStatementParser.Compound_trigger_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#timing_point_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_point_section(OracleSQLStatementParser.Timing_point_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#non_dml_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_dml_event(OracleSQLStatementParser.Non_dml_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#dml_event_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_clause(OracleSQLStatementParser.Dml_event_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#dml_event_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_element(OracleSQLStatementParser.Dml_event_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_nested_clause(OracleSQLStatementParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#referencing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencing_clause(OracleSQLStatementParser.Referencing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#referencing_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencing_element(OracleSQLStatementParser.Referencing_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(OracleSQLStatementParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alter_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type(OracleSQLStatementParser.Alter_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#compile_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompile_type_clause(OracleSQLStatementParser.Compile_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#replace_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace_type_clause(OracleSQLStatementParser.Replace_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alter_method_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_method_spec(OracleSQLStatementParser.Alter_method_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alter_method_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_method_element(OracleSQLStatementParser.Alter_method_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_attribute_definition(OracleSQLStatementParser.Alter_attribute_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#attribute_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_definition(OracleSQLStatementParser.Attribute_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_collection_clauses(OracleSQLStatementParser.Alter_collection_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_handling_clause(OracleSQLStatementParser.Dependent_handling_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_exceptions_part(OracleSQLStatementParser.Dependent_exceptions_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(OracleSQLStatementParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#create_type_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_body(OracleSQLStatementParser.Create_type_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(OracleSQLStatementParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#object_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_def(OracleSQLStatementParser.Object_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#object_as_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_as_part(OracleSQLStatementParser.Object_as_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#object_under_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_under_part(OracleSQLStatementParser.Object_under_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_table_type_def(OracleSQLStatementParser.Nested_table_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlj_object_type(OracleSQLStatementParser.Sqlj_object_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#type_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_body(OracleSQLStatementParser.Type_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#type_body_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_body_elements(OracleSQLStatementParser.Type_body_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_order_func_declaration(OracleSQLStatementParser.Map_order_func_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprog_decl_in_type(OracleSQLStatementParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_decl_in_type(OracleSQLStatementParser.Proc_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl_in_type(OracleSQLStatementParser.Func_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration(OracleSQLStatementParser.Constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#modifier_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier_clause(OracleSQLStatementParser.Modifier_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#object_member_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_member_spec(OracleSQLStatementParser.Object_member_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlj_object_type_attr(OracleSQLStatementParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#element_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_spec(OracleSQLStatementParser.Element_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#element_spec_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_spec_options(OracleSQLStatementParser.Element_spec_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#subprogram_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_spec(OracleSQLStatementParser.Subprogram_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_procedure_spec(OracleSQLStatementParser.Type_procedure_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#return_type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type_spec(OracleSQLStatementParser.Return_type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#type_function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_function_spec(OracleSQLStatementParser.Type_function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#constructor_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_spec(OracleSQLStatementParser.Constructor_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_order_function_spec(OracleSQLStatementParser.Map_order_function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#pragma_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_clause(OracleSQLStatementParser.Pragma_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#pragma_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_elements(OracleSQLStatementParser.Pragma_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#drop_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_sequence(OracleSQLStatementParser.Drop_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alter_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence(OracleSQLStatementParser.Alter_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#create_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence(OracleSQLStatementParser.Create_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#sequence_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_spec(OracleSQLStatementParser.Sequence_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_start_clause(OracleSQLStatementParser.Sequence_start_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(OracleSQLStatementParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(OracleSQLStatementParser.Create_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(OracleSQLStatementParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#comment_on_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_column(OracleSQLStatementParser.Comment_on_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#create_synonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_synonym(OracleSQLStatementParser.Create_synonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#comment_on_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_table(OracleSQLStatementParser.Comment_on_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(OracleSQLStatementParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_constraint(OracleSQLStatementParser.Add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(OracleSQLStatementParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#references_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferences_clause(OracleSQLStatementParser.References_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#on_delete_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_delete_clause(OracleSQLStatementParser.On_delete_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#unique_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_key_clause(OracleSQLStatementParser.Unique_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#primary_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_key_clause(OracleSQLStatementParser.Primary_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#anonymous_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_block(OracleSQLStatementParser.Anonymous_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoker_rights_clause(OracleSQLStatementParser.Invoker_rights_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_parameters_clause(OracleSQLStatementParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#call_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_spec(OracleSQLStatementParser.Call_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#java_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_spec(OracleSQLStatementParser.Java_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#c_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_spec(OracleSQLStatementParser.C_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_agent_in_clause(OracleSQLStatementParser.C_agent_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_parameters_clause(OracleSQLStatementParser.C_parameters_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(OracleSQLStatementParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#default_value_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value_part(OracleSQLStatementParser.Default_value_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#declare_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_spec(OracleSQLStatementParser.Declare_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(OracleSQLStatementParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#subtype_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_declaration(OracleSQLStatementParser.Subtype_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#cursor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_declaration(OracleSQLStatementParser.Cursor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#parameter_specs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_specs(OracleSQLStatementParser.Parameter_specsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#parameter_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_spec(OracleSQLStatementParser.Parameter_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#exception_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_declaration(OracleSQLStatementParser.Exception_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#pragma_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_declaration(OracleSQLStatementParser.Pragma_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#record_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type_def(OracleSQLStatementParser.Record_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#field_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_spec(OracleSQLStatementParser.Field_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#ref_cursor_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_cursor_type_def(OracleSQLStatementParser.Ref_cursor_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(OracleSQLStatementParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#table_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_def(OracleSQLStatementParser.Table_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_indexed_by_part(OracleSQLStatementParser.Table_indexed_by_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#varray_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_type_def(OracleSQLStatementParser.Varray_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#seq_of_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_of_statements(OracleSQLStatementParser.Seq_of_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#label_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_declaration(OracleSQLStatementParser.Label_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(OracleSQLStatementParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(OracleSQLStatementParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(OracleSQLStatementParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(OracleSQLStatementParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(OracleSQLStatementParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(OracleSQLStatementParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#elsif_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_part(OracleSQLStatementParser.Elsif_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(OracleSQLStatementParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(OracleSQLStatementParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_loop_param(OracleSQLStatementParser.Cursor_loop_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#forall_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_statement(OracleSQLStatementParser.Forall_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#bounds_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBounds_clause(OracleSQLStatementParser.Bounds_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#between_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_bound(OracleSQLStatementParser.Between_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#lower_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower_bound(OracleSQLStatementParser.Lower_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#upper_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper_bound(OracleSQLStatementParser.Upper_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#null_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_statement(OracleSQLStatementParser.Null_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#raise_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_statement(OracleSQLStatementParser.Raise_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(OracleSQLStatementParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(OracleSQLStatementParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#pipe_row_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipe_row_statement(OracleSQLStatementParser.Pipe_row_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(OracleSQLStatementParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#exception_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_handler(OracleSQLStatementParser.Exception_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#trigger_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_block(OracleSQLStatementParser.Trigger_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(OracleSQLStatementParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(OracleSQLStatementParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#execute_immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_immediate(OracleSQLStatementParser.Execute_immediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_returning_clause(OracleSQLStatementParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_manipulation_language_statements(OracleSQLStatementParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_manipulation_statements(OracleSQLStatementParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#close_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_statement(OracleSQLStatementParser.Close_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#open_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_statement(OracleSQLStatementParser.Open_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#fetch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_statement(OracleSQLStatementParser.Fetch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#open_for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_for_statement(OracleSQLStatementParser.Open_for_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_control_statements(OracleSQLStatementParser.Transaction_control_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#set_transaction_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_transaction_command(OracleSQLStatementParser.Set_transaction_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#set_constraint_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_constraint_command(OracleSQLStatementParser.Set_constraint_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#commit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_statement(OracleSQLStatementParser.Commit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#rollback_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_statement(OracleSQLStatementParser.Rollback_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#savepoint_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_statement(OracleSQLStatementParser.Savepoint_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#explain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_statement(OracleSQLStatementParser.Explain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(OracleSQLStatementParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_factoring_clause(OracleSQLStatementParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#factoring_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoring_element(OracleSQLStatementParser.Factoring_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#search_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_clause(OracleSQLStatementParser.Search_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#cycle_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_clause(OracleSQLStatementParser.Cycle_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(OracleSQLStatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_operation_part(OracleSQLStatementParser.Subquery_operation_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_basic_elements(OracleSQLStatementParser.Subquery_basic_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#query_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_block(OracleSQLStatementParser.Query_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#selected_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_element(OracleSQLStatementParser.Selected_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(OracleSQLStatementParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#select_list_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elements(OracleSQLStatementParser.Select_list_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#table_ref_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_list(OracleSQLStatementParser.Table_ref_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref(OracleSQLStatementParser.Table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#table_ref_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_aux(OracleSQLStatementParser.Table_ref_auxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table_ref_aux_internal_one}
	 * labeled alternative in {@link OracleSQLStatementParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_aux_internal_one(OracleSQLStatementParser.Table_ref_aux_internal_oneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table_ref_aux_internal_two}
	 * labeled alternative in {@link OracleSQLStatementParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_aux_internal_two(OracleSQLStatementParser.Table_ref_aux_internal_twoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table_ref_aux_internal_three}
	 * labeled alternative in {@link OracleSQLStatementParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_aux_internal_three(OracleSQLStatementParser.Table_ref_aux_internal_threeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(OracleSQLStatementParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#join_on_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_on_part(OracleSQLStatementParser.Join_on_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#join_using_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_using_part(OracleSQLStatementParser.Join_using_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#outer_join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_type(OracleSQLStatementParser.Outer_join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#query_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_partition_clause(OracleSQLStatementParser.Query_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_query_clause(OracleSQLStatementParser.Flashback_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#pivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_clause(OracleSQLStatementParser.Pivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#pivot_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_element(OracleSQLStatementParser.Pivot_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_for_clause(OracleSQLStatementParser.Pivot_for_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause(OracleSQLStatementParser.Pivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_element(OracleSQLStatementParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_elements(OracleSQLStatementParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#unpivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_clause(OracleSQLStatementParser.Unpivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_clause(OracleSQLStatementParser.Unpivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_elements(OracleSQLStatementParser.Unpivot_in_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_query_clause(OracleSQLStatementParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#start_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_part(OracleSQLStatementParser.Start_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(OracleSQLStatementParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#group_by_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_elements(OracleSQLStatementParser.Group_by_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup_cube_clause(OracleSQLStatementParser.Rollup_cube_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_clause(OracleSQLStatementParser.Grouping_sets_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_elements(OracleSQLStatementParser.Grouping_sets_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(OracleSQLStatementParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#model_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_clause(OracleSQLStatementParser.Model_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#cell_reference_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_reference_options(OracleSQLStatementParser.Cell_reference_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#return_rows_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_rows_clause(OracleSQLStatementParser.Return_rows_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#reference_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model(OracleSQLStatementParser.Reference_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#main_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model(OracleSQLStatementParser.Main_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#model_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_clauses(OracleSQLStatementParser.Model_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_partition_part(OracleSQLStatementParser.Model_column_partition_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#model_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_list(OracleSQLStatementParser.Model_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#model_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column(OracleSQLStatementParser.Model_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#model_rules_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_clause(OracleSQLStatementParser.Model_rules_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#model_rules_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_part(OracleSQLStatementParser.Model_rules_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#model_rules_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_element(OracleSQLStatementParser.Model_rules_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#cell_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_assignment(OracleSQLStatementParser.Cell_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_iterate_clause(OracleSQLStatementParser.Model_iterate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#until_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_part(OracleSQLStatementParser.Until_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(OracleSQLStatementParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#order_by_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_elements(OracleSQLStatementParser.Order_by_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#for_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_clause(OracleSQLStatementParser.For_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#for_update_of_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_of_part(OracleSQLStatementParser.For_update_of_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#for_update_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_options(OracleSQLStatementParser.For_update_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(OracleSQLStatementParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#update_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_set_clause(OracleSQLStatementParser.Update_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_based_update_set_clause(OracleSQLStatementParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(OracleSQLStatementParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(OracleSQLStatementParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#single_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_table_insert(OracleSQLStatementParser.Single_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#multi_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_table_insert(OracleSQLStatementParser.Multi_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#multi_table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_table_element(OracleSQLStatementParser.Multi_table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_clause(OracleSQLStatementParser.Conditional_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_when_part(OracleSQLStatementParser.Conditional_insert_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_else_part(OracleSQLStatementParser.Conditional_insert_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#insert_into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_into_clause(OracleSQLStatementParser.Insert_into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(OracleSQLStatementParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(OracleSQLStatementParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#merge_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_clause(OracleSQLStatementParser.Merge_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#merge_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_element(OracleSQLStatementParser.Merge_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_delete_part(OracleSQLStatementParser.Merge_update_delete_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_insert_clause(OracleSQLStatementParser.Merge_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#selected_tableview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_tableview(OracleSQLStatementParser.Selected_tableviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#lock_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table_statement(OracleSQLStatementParser.Lock_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_nowait_part(OracleSQLStatementParser.Wait_nowait_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#lock_table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table_element(OracleSQLStatementParser.Lock_table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#lock_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_mode(OracleSQLStatementParser.Lock_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#general_table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_table_ref(OracleSQLStatementParser.General_table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#static_returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_returning_clause(OracleSQLStatementParser.Static_returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#error_logging_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_clause(OracleSQLStatementParser.Error_logging_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_into_part(OracleSQLStatementParser.Error_logging_into_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_reject_part(OracleSQLStatementParser.Error_logging_reject_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_table_expression_clause(OracleSQLStatementParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#table_collection_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_collection_expression(OracleSQLStatementParser.Table_collection_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_restriction_clause(OracleSQLStatementParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#sample_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_clause(OracleSQLStatementParser.Sample_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#seed_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeed_part(OracleSQLStatementParser.Seed_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#cursor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_expression(OracleSQLStatementParser.Cursor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(OracleSQLStatementParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(OracleSQLStatementParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(OracleSQLStatementParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(OracleSQLStatementParser.Logical_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(OracleSQLStatementParser.Logical_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#negated_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegated_expression(OracleSQLStatementParser.Negated_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(OracleSQLStatementParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#multiset_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiset_expression(OracleSQLStatementParser.Multiset_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#multiset_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiset_type(OracleSQLStatementParser.Multiset_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(OracleSQLStatementParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(OracleSQLStatementParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#compound_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_expression(OracleSQLStatementParser.Compound_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#like_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_concatenation(OracleSQLStatementParser.Like_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#like_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_type(OracleSQLStatementParser.Like_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#like_escape_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_escape_part(OracleSQLStatementParser.Like_escape_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#in_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_elements(OracleSQLStatementParser.In_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#between_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_elements(OracleSQLStatementParser.Between_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(OracleSQLStatementParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(OracleSQLStatementParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#multiply_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply_expression(OracleSQLStatementParser.Multiply_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#datetime_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_expression(OracleSQLStatementParser.Datetime_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#interval_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_expression(OracleSQLStatementParser.Interval_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#model_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_expression(OracleSQLStatementParser.Model_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#model_expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_expression_element(OracleSQLStatementParser.Model_expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_column_for_loop(OracleSQLStatementParser.Single_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#for_like_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_like_part(OracleSQLStatementParser.For_like_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_increment_decrement_type(OracleSQLStatementParser.For_increment_decrement_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_column_for_loop(OracleSQLStatementParser.Multi_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(OracleSQLStatementParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(OracleSQLStatementParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#simple_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_statement(OracleSQLStatementParser.Simple_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_when_part(OracleSQLStatementParser.Simple_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#searched_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_statement(OracleSQLStatementParser.Searched_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_when_part(OracleSQLStatementParser.Searched_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#case_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_else_part(OracleSQLStatementParser.Case_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(OracleSQLStatementParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#expression_or_vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_or_vector(OracleSQLStatementParser.Expression_or_vectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#vector_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_expr(OracleSQLStatementParser.Vector_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#quantified_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantified_expression(OracleSQLStatementParser.Quantified_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#string_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_function(OracleSQLStatementParser.String_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_function(OracleSQLStatementParser.Standard_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#numeric_function_wrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_function_wrapper(OracleSQLStatementParser.Numeric_function_wrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#numeric_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_function(OracleSQLStatementParser.Numeric_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#date_time_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time_function(OracleSQLStatementParser.Date_time_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#other_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_function(OracleSQLStatementParser.Other_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause_keyword(OracleSQLStatementParser.Over_clause_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_or_over_clause_keyword(OracleSQLStatementParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_prediction_function_keyword(OracleSQLStatementParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(OracleSQLStatementParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#windowing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_clause(OracleSQLStatementParser.Windowing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#windowing_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_type(OracleSQLStatementParser.Windowing_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#windowing_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_elements(OracleSQLStatementParser.Windowing_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(OracleSQLStatementParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#using_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_element(OracleSQLStatementParser.Using_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_order_by_part(OracleSQLStatementParser.Collect_order_by_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#within_or_over_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_or_over_part(OracleSQLStatementParser.Within_or_over_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost_matrix_clause(OracleSQLStatementParser.Cost_matrix_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_passing_clause(OracleSQLStatementParser.Xml_passing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attributes_clause(OracleSQLStatementParser.Xml_attributes_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_namespaces_clause(OracleSQLStatementParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xml_table_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_table_column(OracleSQLStatementParser.Xml_table_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_general_default_part(OracleSQLStatementParser.Xml_general_default_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_multiuse_expression_element(OracleSQLStatementParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlroot_param_version_part(OracleSQLStatementParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlroot_param_standalone_part(OracleSQLStatementParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_enconding_part(OracleSQLStatementParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_version_part(OracleSQLStatementParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_ident_part(OracleSQLStatementParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#sql_plus_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_plus_command(OracleSQLStatementParser.Sql_plus_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#whenever_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenever_command(OracleSQLStatementParser.Whenever_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#set_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_command(OracleSQLStatementParser.Set_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#exit_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_command(OracleSQLStatementParser.Exit_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#prompt_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrompt_command(OracleSQLStatementParser.Prompt_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#show_errors_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_errors_command(OracleSQLStatementParser.Show_errors_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#start_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_command(OracleSQLStatementParser.Start_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_extension_clause(OracleSQLStatementParser.Partition_extension_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(OracleSQLStatementParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(OracleSQLStatementParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_quoted_string(OracleSQLStatementParser.Alias_quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(OracleSQLStatementParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#current_of_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_of_clause(OracleSQLStatementParser.Current_of_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(OracleSQLStatementParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#xml_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_column_name(OracleSQLStatementParser.Xml_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#cost_class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost_class_name(OracleSQLStatementParser.Cost_class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(OracleSQLStatementParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(OracleSQLStatementParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_segment_name(OracleSQLStatementParser.Rollback_segment_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#table_var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_var_name(OracleSQLStatementParser.Table_var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(OracleSQLStatementParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#routine_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_name(OracleSQLStatementParser.Routine_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#package_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_name(OracleSQLStatementParser.Package_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#implementation_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation_type_name(OracleSQLStatementParser.Implementation_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(OracleSQLStatementParser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#reference_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model_name(OracleSQLStatementParser.Reference_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#main_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model_name(OracleSQLStatementParser.Main_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function_name(OracleSQLStatementParser.Aggregate_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#query_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_name(OracleSQLStatementParser.Query_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name(OracleSQLStatementParser.Constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(OracleSQLStatementParser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(OracleSQLStatementParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#sequence_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_name(OracleSQLStatementParser.Sequence_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#exception_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_name(OracleSQLStatementParser.Exception_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(OracleSQLStatementParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(OracleSQLStatementParser.Procedure_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#constructor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_name(OracleSQLStatementParser.Constructor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(OracleSQLStatementParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(OracleSQLStatementParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(OracleSQLStatementParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(OracleSQLStatementParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#record_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_name(OracleSQLStatementParser.Record_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#collection_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_name(OracleSQLStatementParser.Collection_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#link_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink_name(OracleSQLStatementParser.Link_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(OracleSQLStatementParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#tableview_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableview_name(OracleSQLStatementParser.Tableview_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#char_set_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_set_name(OracleSQLStatementParser.Char_set_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#synonym_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynonym_name(OracleSQLStatementParser.Synonym_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#schema_object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_object_name(OracleSQLStatementParser.Schema_object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#keep_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeep_clause(OracleSQLStatementParser.Keep_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(OracleSQLStatementParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(OracleSQLStatementParser.Function_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_analytic(OracleSQLStatementParser.Function_argument_analyticContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_modeling(OracleSQLStatementParser.Function_argument_modelingContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespect_or_ignore_nulls(OracleSQLStatementParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(OracleSQLStatementParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(OracleSQLStatementParser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(OracleSQLStatementParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#precision_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision_part(OracleSQLStatementParser.Precision_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#native_datatype_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNative_datatype_element(OracleSQLStatementParser.Native_datatype_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#bind_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_variable(OracleSQLStatementParser.Bind_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#general_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_element(OracleSQLStatementParser.General_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#general_element_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_element_part(OracleSQLStatementParser.General_element_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_element(OracleSQLStatementParser.Table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(OracleSQLStatementParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(OracleSQLStatementParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#int_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_value(OracleSQLStatementParser.Int_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#float_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_value(OracleSQLStatementParser.Float_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#numeric_negative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_negative(OracleSQLStatementParser.Numeric_negativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_string(OracleSQLStatementParser.Quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(OracleSQLStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#id_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_expression(OracleSQLStatementParser.Id_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#not_equal_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal_op(OracleSQLStatementParser.Not_equal_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_than_or_equals_op(OracleSQLStatementParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_than_or_equals_op(OracleSQLStatementParser.Less_than_or_equals_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#concatenation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation_op(OracleSQLStatementParser.Concatenation_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#outer_join_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_sign(OracleSQLStatementParser.Outer_join_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#regular_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular_id(OracleSQLStatementParser.Regular_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#string_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_function_name(OracleSQLStatementParser.String_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#numeric_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_function_name(OracleSQLStatementParser.Numeric_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#date_time_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time_function_name(OracleSQLStatementParser.Date_time_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#conversion_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversion_function_name(OracleSQLStatementParser.Conversion_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#analytic_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalytic_function_name(OracleSQLStatementParser.Analytic_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OracleSQLStatementParser#advanced_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdvanced_function_name(OracleSQLStatementParser.Advanced_function_nameContext ctx);
}