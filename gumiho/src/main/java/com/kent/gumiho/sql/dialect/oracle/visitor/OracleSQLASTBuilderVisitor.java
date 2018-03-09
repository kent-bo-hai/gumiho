package com.kent.gumiho.sql.dialect.oracle.visitor;

import com.kent.gumiho.sql.basic.ast.SQLObject;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.dialect.mysql.parser.MySQLSQLStatementParser;
import com.kent.gumiho.sql.dialect.mysql.parser.MySQLSQLStatementParserVisitor;
import com.kent.gumiho.sql.dialect.oracle.parser.OracleSQLStatementParser;
import com.kent.gumiho.sql.dialect.oracle.parser.OracleSQLStatementParserVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * @author kongtong.ouyang on 2018/3/6.
 */
public class OracleSQLASTBuilderVisitor extends AbstractParseTreeVisitor<Boolean> implements OracleSQLStatementParserVisitor<Boolean> {


    private final List<SQLStatement> statementList;
    private SQLObject parent;

    public OracleSQLASTBuilderVisitor(List<SQLStatement> statementList) {
        this.statementList = statementList;
    }

    @Override
    public Boolean visitParse(OracleSQLStatementParser.ParseContext ctx) {
        visitChildren(ctx);
        return false;
    }

    @Override
    public Boolean visitSwallow_to_semi(OracleSQLStatementParser.Swallow_to_semiContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnit_statement(OracleSQLStatementParser.Unit_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDrop_function(OracleSQLStatementParser.Drop_functionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlter_function(OracleSQLStatementParser.Alter_functionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreate_function_body(OracleSQLStatementParser.Create_function_bodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitParallel_enable_clause(OracleSQLStatementParser.Parallel_enable_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartition_by_clause(OracleSQLStatementParser.Partition_by_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitResult_cache_clause(OracleSQLStatementParser.Result_cache_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRelies_on_part(OracleSQLStatementParser.Relies_on_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStreaming_clause(OracleSQLStatementParser.Streaming_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDrop_package(OracleSQLStatementParser.Drop_packageContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlter_package(OracleSQLStatementParser.Alter_packageContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreate_package(OracleSQLStatementParser.Create_packageContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreate_package_body(OracleSQLStatementParser.Create_package_bodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPackage_obj_spec(OracleSQLStatementParser.Package_obj_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitProcedure_spec(OracleSQLStatementParser.Procedure_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunction_spec(OracleSQLStatementParser.Function_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPackage_obj_body(OracleSQLStatementParser.Package_obj_bodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDrop_procedure(OracleSQLStatementParser.Drop_procedureContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlter_procedure(OracleSQLStatementParser.Alter_procedureContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunction_body(OracleSQLStatementParser.Function_bodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitProcedure_body(OracleSQLStatementParser.Procedure_bodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreate_procedure_body(OracleSQLStatementParser.Create_procedure_bodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDrop_trigger(OracleSQLStatementParser.Drop_triggerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlter_trigger(OracleSQLStatementParser.Alter_triggerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreate_trigger(OracleSQLStatementParser.Create_triggerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTrigger_follows_clause(OracleSQLStatementParser.Trigger_follows_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTrigger_when_clause(OracleSQLStatementParser.Trigger_when_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimple_dml_trigger(OracleSQLStatementParser.Simple_dml_triggerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFor_each_row(OracleSQLStatementParser.For_each_rowContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCompound_dml_trigger(OracleSQLStatementParser.Compound_dml_triggerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNon_dml_trigger(OracleSQLStatementParser.Non_dml_triggerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTrigger_body(OracleSQLStatementParser.Trigger_bodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCompound_trigger_block(OracleSQLStatementParser.Compound_trigger_blockContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTiming_point_section(OracleSQLStatementParser.Timing_point_sectionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNon_dml_event(OracleSQLStatementParser.Non_dml_eventContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDml_event_clause(OracleSQLStatementParser.Dml_event_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDml_event_element(OracleSQLStatementParser.Dml_event_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDml_event_nested_clause(OracleSQLStatementParser.Dml_event_nested_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReferencing_clause(OracleSQLStatementParser.Referencing_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReferencing_element(OracleSQLStatementParser.Referencing_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDrop_type(OracleSQLStatementParser.Drop_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlter_type(OracleSQLStatementParser.Alter_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCompile_type_clause(OracleSQLStatementParser.Compile_type_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReplace_type_clause(OracleSQLStatementParser.Replace_type_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlter_method_spec(OracleSQLStatementParser.Alter_method_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlter_method_element(OracleSQLStatementParser.Alter_method_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlter_attribute_definition(OracleSQLStatementParser.Alter_attribute_definitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAttribute_definition(OracleSQLStatementParser.Attribute_definitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlter_collection_clauses(OracleSQLStatementParser.Alter_collection_clausesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDependent_handling_clause(OracleSQLStatementParser.Dependent_handling_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDependent_exceptions_part(OracleSQLStatementParser.Dependent_exceptions_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreate_type(OracleSQLStatementParser.Create_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreate_type_body(OracleSQLStatementParser.Create_type_bodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitType_definition(OracleSQLStatementParser.Type_definitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitObject_type_def(OracleSQLStatementParser.Object_type_defContext ctx) {
        return null;
    }

    @Override
    public Boolean visitObject_as_part(OracleSQLStatementParser.Object_as_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitObject_under_part(OracleSQLStatementParser.Object_under_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNested_table_type_def(OracleSQLStatementParser.Nested_table_type_defContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSqlj_object_type(OracleSQLStatementParser.Sqlj_object_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitType_body(OracleSQLStatementParser.Type_bodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitType_body_elements(OracleSQLStatementParser.Type_body_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMap_order_func_declaration(OracleSQLStatementParser.Map_order_func_declarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubprog_decl_in_type(OracleSQLStatementParser.Subprog_decl_in_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitProc_decl_in_type(OracleSQLStatementParser.Proc_decl_in_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunc_decl_in_type(OracleSQLStatementParser.Func_decl_in_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstructor_declaration(OracleSQLStatementParser.Constructor_declarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModifier_clause(OracleSQLStatementParser.Modifier_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitObject_member_spec(OracleSQLStatementParser.Object_member_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSqlj_object_type_attr(OracleSQLStatementParser.Sqlj_object_type_attrContext ctx) {
        return null;
    }

    @Override
    public Boolean visitElement_spec(OracleSQLStatementParser.Element_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitElement_spec_options(OracleSQLStatementParser.Element_spec_optionsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubprogram_spec(OracleSQLStatementParser.Subprogram_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitType_procedure_spec(OracleSQLStatementParser.Type_procedure_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReturn_type_spec(OracleSQLStatementParser.Return_type_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitType_function_spec(OracleSQLStatementParser.Type_function_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstructor_spec(OracleSQLStatementParser.Constructor_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMap_order_function_spec(OracleSQLStatementParser.Map_order_function_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPragma_clause(OracleSQLStatementParser.Pragma_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPragma_elements(OracleSQLStatementParser.Pragma_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDrop_sequence(OracleSQLStatementParser.Drop_sequenceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlter_sequence(OracleSQLStatementParser.Alter_sequenceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreate_sequence(OracleSQLStatementParser.Create_sequenceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSequence_spec(OracleSQLStatementParser.Sequence_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSequence_start_clause(OracleSQLStatementParser.Sequence_start_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreate_table(OracleSQLStatementParser.Create_tableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreate_view(OracleSQLStatementParser.Create_viewContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDrop_table(OracleSQLStatementParser.Drop_tableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitComment_on_column(OracleSQLStatementParser.Comment_on_columnContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreate_synonym(OracleSQLStatementParser.Create_synonymContext ctx) {
        return null;
    }

    @Override
    public Boolean visitComment_on_table(OracleSQLStatementParser.Comment_on_tableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlter_table(OracleSQLStatementParser.Alter_tableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAdd_constraint(OracleSQLStatementParser.Add_constraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitForeign_key_clause(OracleSQLStatementParser.Foreign_key_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReferences_clause(OracleSQLStatementParser.References_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOn_delete_clause(OracleSQLStatementParser.On_delete_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnique_key_clause(OracleSQLStatementParser.Unique_key_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrimary_key_clause(OracleSQLStatementParser.Primary_key_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAnonymous_block(OracleSQLStatementParser.Anonymous_blockContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInvoker_rights_clause(OracleSQLStatementParser.Invoker_rights_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCompiler_parameters_clause(OracleSQLStatementParser.Compiler_parameters_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCall_spec(OracleSQLStatementParser.Call_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitJava_spec(OracleSQLStatementParser.Java_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitC_spec(OracleSQLStatementParser.C_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitC_agent_in_clause(OracleSQLStatementParser.C_agent_in_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitC_parameters_clause(OracleSQLStatementParser.C_parameters_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitParameter(OracleSQLStatementParser.ParameterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefault_value_part(OracleSQLStatementParser.Default_value_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeclare_spec(OracleSQLStatementParser.Declare_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitVariable_declaration(OracleSQLStatementParser.Variable_declarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubtype_declaration(OracleSQLStatementParser.Subtype_declarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCursor_declaration(OracleSQLStatementParser.Cursor_declarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitParameter_specs(OracleSQLStatementParser.Parameter_specsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitParameter_spec(OracleSQLStatementParser.Parameter_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitException_declaration(OracleSQLStatementParser.Exception_declarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPragma_declaration(OracleSQLStatementParser.Pragma_declarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRecord_type_def(OracleSQLStatementParser.Record_type_defContext ctx) {
        return null;
    }

    @Override
    public Boolean visitField_spec(OracleSQLStatementParser.Field_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRef_cursor_type_def(OracleSQLStatementParser.Ref_cursor_type_defContext ctx) {
        return null;
    }

    @Override
    public Boolean visitType_declaration(OracleSQLStatementParser.Type_declarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_type_def(OracleSQLStatementParser.Table_type_defContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_indexed_by_part(OracleSQLStatementParser.Table_indexed_by_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitVarray_type_def(OracleSQLStatementParser.Varray_type_defContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSeq_of_statements(OracleSQLStatementParser.Seq_of_statementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLabel_declaration(OracleSQLStatementParser.Label_declarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStatement(OracleSQLStatementParser.StatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAssignment_statement(OracleSQLStatementParser.Assignment_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitContinue_statement(OracleSQLStatementParser.Continue_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExit_statement(OracleSQLStatementParser.Exit_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGoto_statement(OracleSQLStatementParser.Goto_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIf_statement(OracleSQLStatementParser.If_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitElsif_part(OracleSQLStatementParser.Elsif_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitElse_part(OracleSQLStatementParser.Else_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLoop_statement(OracleSQLStatementParser.Loop_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCursor_loop_param(OracleSQLStatementParser.Cursor_loop_paramContext ctx) {
        return null;
    }

    @Override
    public Boolean visitForall_statement(OracleSQLStatementParser.Forall_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBounds_clause(OracleSQLStatementParser.Bounds_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBetween_bound(OracleSQLStatementParser.Between_boundContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLower_bound(OracleSQLStatementParser.Lower_boundContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUpper_bound(OracleSQLStatementParser.Upper_boundContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNull_statement(OracleSQLStatementParser.Null_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRaise_statement(OracleSQLStatementParser.Raise_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReturn_statement(OracleSQLStatementParser.Return_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunction_call(OracleSQLStatementParser.Function_callContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPipe_row_statement(OracleSQLStatementParser.Pipe_row_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBody(OracleSQLStatementParser.BodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitException_handler(OracleSQLStatementParser.Exception_handlerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTrigger_block(OracleSQLStatementParser.Trigger_blockContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBlock(OracleSQLStatementParser.BlockContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSql_statement(OracleSQLStatementParser.Sql_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExecute_immediate(OracleSQLStatementParser.Execute_immediateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDynamic_returning_clause(OracleSQLStatementParser.Dynamic_returning_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitData_manipulation_language_statements(OracleSQLStatementParser.Data_manipulation_language_statementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCursor_manipulation_statements(OracleSQLStatementParser.Cursor_manipulation_statementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitClose_statement(OracleSQLStatementParser.Close_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOpen_statement(OracleSQLStatementParser.Open_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFetch_statement(OracleSQLStatementParser.Fetch_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOpen_for_statement(OracleSQLStatementParser.Open_for_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTransaction_control_statements(OracleSQLStatementParser.Transaction_control_statementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSet_transaction_command(OracleSQLStatementParser.Set_transaction_commandContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSet_constraint_command(OracleSQLStatementParser.Set_constraint_commandContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCommit_statement(OracleSQLStatementParser.Commit_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRollback_statement(OracleSQLStatementParser.Rollback_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSavepoint_statement(OracleSQLStatementParser.Savepoint_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExplain_statement(OracleSQLStatementParser.Explain_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelect_statement(OracleSQLStatementParser.Select_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubquery_factoring_clause(OracleSQLStatementParser.Subquery_factoring_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFactoring_element(OracleSQLStatementParser.Factoring_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSearch_clause(OracleSQLStatementParser.Search_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCycle_clause(OracleSQLStatementParser.Cycle_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubquery(OracleSQLStatementParser.SubqueryContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubquery_operation_part(OracleSQLStatementParser.Subquery_operation_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubquery_basic_elements(OracleSQLStatementParser.Subquery_basic_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQuery_block(OracleSQLStatementParser.Query_blockContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelected_element(OracleSQLStatementParser.Selected_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFrom_clause(OracleSQLStatementParser.From_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelect_list_elements(OracleSQLStatementParser.Select_list_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_ref_list(OracleSQLStatementParser.Table_ref_listContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_ref(OracleSQLStatementParser.Table_refContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_ref_aux(OracleSQLStatementParser.Table_ref_auxContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_ref_aux_internal_one(OracleSQLStatementParser.Table_ref_aux_internal_oneContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_ref_aux_internal_two(OracleSQLStatementParser.Table_ref_aux_internal_twoContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_ref_aux_internal_three(OracleSQLStatementParser.Table_ref_aux_internal_threeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitJoin_clause(OracleSQLStatementParser.Join_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitJoin_on_part(OracleSQLStatementParser.Join_on_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitJoin_using_part(OracleSQLStatementParser.Join_using_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOuter_join_type(OracleSQLStatementParser.Outer_join_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQuery_partition_clause(OracleSQLStatementParser.Query_partition_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFlashback_query_clause(OracleSQLStatementParser.Flashback_query_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPivot_clause(OracleSQLStatementParser.Pivot_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPivot_element(OracleSQLStatementParser.Pivot_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPivot_for_clause(OracleSQLStatementParser.Pivot_for_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPivot_in_clause(OracleSQLStatementParser.Pivot_in_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPivot_in_clause_element(OracleSQLStatementParser.Pivot_in_clause_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPivot_in_clause_elements(OracleSQLStatementParser.Pivot_in_clause_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnpivot_clause(OracleSQLStatementParser.Unpivot_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnpivot_in_clause(OracleSQLStatementParser.Unpivot_in_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnpivot_in_elements(OracleSQLStatementParser.Unpivot_in_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHierarchical_query_clause(OracleSQLStatementParser.Hierarchical_query_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStart_part(OracleSQLStatementParser.Start_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGroup_by_clause(OracleSQLStatementParser.Group_by_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGroup_by_elements(OracleSQLStatementParser.Group_by_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRollup_cube_clause(OracleSQLStatementParser.Rollup_cube_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGrouping_sets_clause(OracleSQLStatementParser.Grouping_sets_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGrouping_sets_elements(OracleSQLStatementParser.Grouping_sets_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHaving_clause(OracleSQLStatementParser.Having_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModel_clause(OracleSQLStatementParser.Model_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCell_reference_options(OracleSQLStatementParser.Cell_reference_optionsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReturn_rows_clause(OracleSQLStatementParser.Return_rows_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReference_model(OracleSQLStatementParser.Reference_modelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMain_model(OracleSQLStatementParser.Main_modelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModel_column_clauses(OracleSQLStatementParser.Model_column_clausesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModel_column_partition_part(OracleSQLStatementParser.Model_column_partition_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModel_column_list(OracleSQLStatementParser.Model_column_listContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModel_column(OracleSQLStatementParser.Model_columnContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModel_rules_clause(OracleSQLStatementParser.Model_rules_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModel_rules_part(OracleSQLStatementParser.Model_rules_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModel_rules_element(OracleSQLStatementParser.Model_rules_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCell_assignment(OracleSQLStatementParser.Cell_assignmentContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModel_iterate_clause(OracleSQLStatementParser.Model_iterate_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUntil_part(OracleSQLStatementParser.Until_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOrder_by_clause(OracleSQLStatementParser.Order_by_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOrder_by_elements(OracleSQLStatementParser.Order_by_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFor_update_clause(OracleSQLStatementParser.For_update_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFor_update_of_part(OracleSQLStatementParser.For_update_of_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFor_update_options(OracleSQLStatementParser.For_update_optionsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUpdate_statement(OracleSQLStatementParser.Update_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUpdate_set_clause(OracleSQLStatementParser.Update_set_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitColumn_based_update_set_clause(OracleSQLStatementParser.Column_based_update_set_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDelete_statement(OracleSQLStatementParser.Delete_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInsert_statement(OracleSQLStatementParser.Insert_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSingle_table_insert(OracleSQLStatementParser.Single_table_insertContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMulti_table_insert(OracleSQLStatementParser.Multi_table_insertContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMulti_table_element(OracleSQLStatementParser.Multi_table_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConditional_insert_clause(OracleSQLStatementParser.Conditional_insert_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConditional_insert_when_part(OracleSQLStatementParser.Conditional_insert_when_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConditional_insert_else_part(OracleSQLStatementParser.Conditional_insert_else_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInsert_into_clause(OracleSQLStatementParser.Insert_into_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitValues_clause(OracleSQLStatementParser.Values_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMerge_statement(OracleSQLStatementParser.Merge_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMerge_update_clause(OracleSQLStatementParser.Merge_update_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMerge_element(OracleSQLStatementParser.Merge_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMerge_update_delete_part(OracleSQLStatementParser.Merge_update_delete_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMerge_insert_clause(OracleSQLStatementParser.Merge_insert_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelected_tableview(OracleSQLStatementParser.Selected_tableviewContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLock_table_statement(OracleSQLStatementParser.Lock_table_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWait_nowait_part(OracleSQLStatementParser.Wait_nowait_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLock_table_element(OracleSQLStatementParser.Lock_table_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLock_mode(OracleSQLStatementParser.Lock_modeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGeneral_table_ref(OracleSQLStatementParser.General_table_refContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStatic_returning_clause(OracleSQLStatementParser.Static_returning_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitError_logging_clause(OracleSQLStatementParser.Error_logging_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitError_logging_into_part(OracleSQLStatementParser.Error_logging_into_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitError_logging_reject_part(OracleSQLStatementParser.Error_logging_reject_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDml_table_expression_clause(OracleSQLStatementParser.Dml_table_expression_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_collection_expression(OracleSQLStatementParser.Table_collection_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubquery_restriction_clause(OracleSQLStatementParser.Subquery_restriction_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSample_clause(OracleSQLStatementParser.Sample_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSeed_part(OracleSQLStatementParser.Seed_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCursor_expression(OracleSQLStatementParser.Cursor_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpression_list(OracleSQLStatementParser.Expression_listContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCondition(OracleSQLStatementParser.ConditionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpression(OracleSQLStatementParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLogical_or_expression(OracleSQLStatementParser.Logical_or_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLogical_and_expression(OracleSQLStatementParser.Logical_and_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNegated_expression(OracleSQLStatementParser.Negated_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitEquality_expression(OracleSQLStatementParser.Equality_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMultiset_expression(OracleSQLStatementParser.Multiset_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMultiset_type(OracleSQLStatementParser.Multiset_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRelational_expression(OracleSQLStatementParser.Relational_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRelational_operator(OracleSQLStatementParser.Relational_operatorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCompound_expression(OracleSQLStatementParser.Compound_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLike_concatenation(OracleSQLStatementParser.Like_concatenationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLike_type(OracleSQLStatementParser.Like_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLike_escape_part(OracleSQLStatementParser.Like_escape_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIn_elements(OracleSQLStatementParser.In_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBetween_elements(OracleSQLStatementParser.Between_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConcatenation(OracleSQLStatementParser.ConcatenationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAdditive_expression(OracleSQLStatementParser.Additive_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMultiply_expression(OracleSQLStatementParser.Multiply_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDatetime_expression(OracleSQLStatementParser.Datetime_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInterval_expression(OracleSQLStatementParser.Interval_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModel_expression(OracleSQLStatementParser.Model_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitModel_expression_element(OracleSQLStatementParser.Model_expression_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSingle_column_for_loop(OracleSQLStatementParser.Single_column_for_loopContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFor_like_part(OracleSQLStatementParser.For_like_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFor_increment_decrement_type(OracleSQLStatementParser.For_increment_decrement_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMulti_column_for_loop(OracleSQLStatementParser.Multi_column_for_loopContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnary_expression(OracleSQLStatementParser.Unary_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCase_statement(OracleSQLStatementParser.Case_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimple_case_statement(OracleSQLStatementParser.Simple_case_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimple_case_when_part(OracleSQLStatementParser.Simple_case_when_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSearched_case_statement(OracleSQLStatementParser.Searched_case_statementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSearched_case_when_part(OracleSQLStatementParser.Searched_case_when_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCase_else_part(OracleSQLStatementParser.Case_else_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAtom(OracleSQLStatementParser.AtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpression_or_vector(OracleSQLStatementParser.Expression_or_vectorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitVector_expr(OracleSQLStatementParser.Vector_exprContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQuantified_expression(OracleSQLStatementParser.Quantified_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitString_function(OracleSQLStatementParser.String_functionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStandard_function(OracleSQLStatementParser.Standard_functionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNumeric_function_wrapper(OracleSQLStatementParser.Numeric_function_wrapperContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNumeric_function(OracleSQLStatementParser.Numeric_functionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDate_time_function(OracleSQLStatementParser.Date_time_functionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOther_function(OracleSQLStatementParser.Other_functionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOver_clause_keyword(OracleSQLStatementParser.Over_clause_keywordContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWithin_or_over_clause_keyword(OracleSQLStatementParser.Within_or_over_clause_keywordContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStandard_prediction_function_keyword(OracleSQLStatementParser.Standard_prediction_function_keywordContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOver_clause(OracleSQLStatementParser.Over_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWindowing_clause(OracleSQLStatementParser.Windowing_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWindowing_type(OracleSQLStatementParser.Windowing_typeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWindowing_elements(OracleSQLStatementParser.Windowing_elementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUsing_clause(OracleSQLStatementParser.Using_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUsing_element(OracleSQLStatementParser.Using_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCollect_order_by_part(OracleSQLStatementParser.Collect_order_by_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWithin_or_over_part(OracleSQLStatementParser.Within_or_over_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCost_matrix_clause(OracleSQLStatementParser.Cost_matrix_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXml_passing_clause(OracleSQLStatementParser.Xml_passing_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXml_attributes_clause(OracleSQLStatementParser.Xml_attributes_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXml_namespaces_clause(OracleSQLStatementParser.Xml_namespaces_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXml_table_column(OracleSQLStatementParser.Xml_table_columnContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXml_general_default_part(OracleSQLStatementParser.Xml_general_default_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXml_multiuse_expression_element(OracleSQLStatementParser.Xml_multiuse_expression_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXmlroot_param_version_part(OracleSQLStatementParser.Xmlroot_param_version_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXmlroot_param_standalone_part(OracleSQLStatementParser.Xmlroot_param_standalone_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXmlserialize_param_enconding_part(OracleSQLStatementParser.Xmlserialize_param_enconding_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXmlserialize_param_version_part(OracleSQLStatementParser.Xmlserialize_param_version_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXmlserialize_param_ident_part(OracleSQLStatementParser.Xmlserialize_param_ident_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSql_plus_command(OracleSQLStatementParser.Sql_plus_commandContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWhenever_command(OracleSQLStatementParser.Whenever_commandContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSet_command(OracleSQLStatementParser.Set_commandContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExit_command(OracleSQLStatementParser.Exit_commandContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrompt_command(OracleSQLStatementParser.Prompt_commandContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShow_errors_command(OracleSQLStatementParser.Show_errors_commandContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStart_command(OracleSQLStatementParser.Start_commandContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartition_extension_clause(OracleSQLStatementParser.Partition_extension_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitColumn_alias(OracleSQLStatementParser.Column_aliasContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_alias(OracleSQLStatementParser.Table_aliasContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlias_quoted_string(OracleSQLStatementParser.Alias_quoted_stringContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWhere_clause(OracleSQLStatementParser.Where_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCurrent_of_clause(OracleSQLStatementParser.Current_of_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInto_clause(OracleSQLStatementParser.Into_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXml_column_name(OracleSQLStatementParser.Xml_column_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCost_class_name(OracleSQLStatementParser.Cost_class_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAttribute_name(OracleSQLStatementParser.Attribute_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSavepoint_name(OracleSQLStatementParser.Savepoint_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRollback_segment_name(OracleSQLStatementParser.Rollback_segment_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_var_name(OracleSQLStatementParser.Table_var_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSchema_name(OracleSQLStatementParser.Schema_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutine_name(OracleSQLStatementParser.Routine_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPackage_name(OracleSQLStatementParser.Package_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitImplementation_type_name(OracleSQLStatementParser.Implementation_type_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitParameter_name(OracleSQLStatementParser.Parameter_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReference_model_name(OracleSQLStatementParser.Reference_model_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMain_model_name(OracleSQLStatementParser.Main_model_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAggregate_function_name(OracleSQLStatementParser.Aggregate_function_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQuery_name(OracleSQLStatementParser.Query_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstraint_name(OracleSQLStatementParser.Constraint_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLabel_name(OracleSQLStatementParser.Label_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitType_name(OracleSQLStatementParser.Type_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSequence_name(OracleSQLStatementParser.Sequence_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitException_name(OracleSQLStatementParser.Exception_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunction_name(OracleSQLStatementParser.Function_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitProcedure_name(OracleSQLStatementParser.Procedure_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstructor_name(OracleSQLStatementParser.Constructor_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTrigger_name(OracleSQLStatementParser.Trigger_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitVariable_name(OracleSQLStatementParser.Variable_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndex_name(OracleSQLStatementParser.Index_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCursor_name(OracleSQLStatementParser.Cursor_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRecord_name(OracleSQLStatementParser.Record_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCollection_name(OracleSQLStatementParser.Collection_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLink_name(OracleSQLStatementParser.Link_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitColumn_name(OracleSQLStatementParser.Column_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableview_name(OracleSQLStatementParser.Tableview_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitChar_set_name(OracleSQLStatementParser.Char_set_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSynonym_name(OracleSQLStatementParser.Synonym_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSchema_object_name(OracleSQLStatementParser.Schema_object_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitKeep_clause(OracleSQLStatementParser.Keep_clauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitComma(OracleSQLStatementParser.CommaContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunction_argument(OracleSQLStatementParser.Function_argumentContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunction_argument_analytic(OracleSQLStatementParser.Function_argument_analyticContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunction_argument_modeling(OracleSQLStatementParser.Function_argument_modelingContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRespect_or_ignore_nulls(OracleSQLStatementParser.Respect_or_ignore_nullsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitArgument(OracleSQLStatementParser.ArgumentContext ctx) {
        return null;
    }

    @Override
    public Boolean visitType_spec(OracleSQLStatementParser.Type_specContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDatatype(OracleSQLStatementParser.DatatypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrecision_part(OracleSQLStatementParser.Precision_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNative_datatype_element(OracleSQLStatementParser.Native_datatype_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBind_variable(OracleSQLStatementParser.Bind_variableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGeneral_element(OracleSQLStatementParser.General_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGeneral_element_part(OracleSQLStatementParser.General_element_partContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTable_element(OracleSQLStatementParser.Table_elementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstant(OracleSQLStatementParser.ConstantContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNumeric(OracleSQLStatementParser.NumericContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInt_value(OracleSQLStatementParser.Int_valueContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFloat_value(OracleSQLStatementParser.Float_valueContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNumeric_negative(OracleSQLStatementParser.Numeric_negativeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQuoted_string(OracleSQLStatementParser.Quoted_stringContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIdentifier(OracleSQLStatementParser.IdentifierContext ctx) {
        return null;
    }

    @Override
    public Boolean visitId_expression(OracleSQLStatementParser.Id_expressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNot_equal_op(OracleSQLStatementParser.Not_equal_opContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGreater_than_or_equals_op(OracleSQLStatementParser.Greater_than_or_equals_opContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLess_than_or_equals_op(OracleSQLStatementParser.Less_than_or_equals_opContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConcatenation_op(OracleSQLStatementParser.Concatenation_opContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOuter_join_sign(OracleSQLStatementParser.Outer_join_signContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRegular_id(OracleSQLStatementParser.Regular_idContext ctx) {
        return null;
    }

    @Override
    public Boolean visitString_function_name(OracleSQLStatementParser.String_function_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNumeric_function_name(OracleSQLStatementParser.Numeric_function_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDate_time_function_name(OracleSQLStatementParser.Date_time_function_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConversion_function_name(OracleSQLStatementParser.Conversion_function_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAnalytic_function_name(OracleSQLStatementParser.Analytic_function_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAdvanced_function_name(OracleSQLStatementParser.Advanced_function_nameContext ctx) {
        return null;
    }

    @Override
    public Boolean visit(ParseTree tree) {
        return null;
    }

    @Override
    public Boolean visitChildren(RuleNode node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            visit(node.getChild(i));
        }
        return false;
    }

    @Override
    public Boolean visitTerminal(TerminalNode node) {
        return null;
    }

    @Override
    public Boolean visitErrorNode(ErrorNode node) {
        return null;
    }
}
