// Generated from /Users/kent/IdeaProjects/github/gumiho/gumiho/src/main/resources/grammars/sql/SQLStatementParser.g4 by ANTLR 4.7
package com.kent.gumiho.sql.basic.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLStatementParser}.
 */
public interface SQLStatementParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLStatementParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLStatementParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(SQLStatementParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(SQLStatementParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(SQLStatementParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(SQLStatementParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(SQLStatementParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(SQLStatementParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(SQLStatementParser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(SQLStatementParser.DdlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(SQLStatementParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(SQLStatementParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransactionStatement(SQLStatementParser.TransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransactionStatement(SQLStatementParser.TransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#replicationStatement}.
	 * @param ctx the parse tree
	 */
	void enterReplicationStatement(SQLStatementParser.ReplicationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#replicationStatement}.
	 * @param ctx the parse tree
	 */
	void exitReplicationStatement(SQLStatementParser.ReplicationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#preparedStatement}.
	 * @param ctx the parse tree
	 */
	void enterPreparedStatement(SQLStatementParser.PreparedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#preparedStatement}.
	 * @param ctx the parse tree
	 */
	void exitPreparedStatement(SQLStatementParser.PreparedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(SQLStatementParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(SQLStatementParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#administrationStatement}.
	 * @param ctx the parse tree
	 */
	void enterAdministrationStatement(SQLStatementParser.AdministrationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#administrationStatement}.
	 * @param ctx the parse tree
	 */
	void exitAdministrationStatement(SQLStatementParser.AdministrationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#utilityStatement}.
	 * @param ctx the parse tree
	 */
	void enterUtilityStatement(SQLStatementParser.UtilityStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#utilityStatement}.
	 * @param ctx the parse tree
	 */
	void exitUtilityStatement(SQLStatementParser.UtilityStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(SQLStatementParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(SQLStatementParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void enterCreateEvent(SQLStatementParser.CreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void exitCreateEvent(SQLStatementParser.CreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(SQLStatementParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(SQLStatementParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateLogfileGroup(SQLStatementParser.CreateLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateLogfileGroup(SQLStatementParser.CreateLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(SQLStatementParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(SQLStatementParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(SQLStatementParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(SQLStatementParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void enterCreateServer(SQLStatementParser.CreateServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createServer}.
	 * @param ctx the parse tree
	 */
	void exitCreateServer(SQLStatementParser.CreateServerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link SQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCopyCreateTable(SQLStatementParser.CopyCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link SQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCopyCreateTable(SQLStatementParser.CopyCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link SQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterQueryCreateTable(SQLStatementParser.QueryCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link SQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitQueryCreateTable(SQLStatementParser.QueryCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link SQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterColumnCreateTable(SQLStatementParser.ColumnCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link SQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitColumnCreateTable(SQLStatementParser.ColumnCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespace(SQLStatementParser.CreateTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespace(SQLStatementParser.CreateTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceInnodb(SQLStatementParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceInnodb(SQLStatementParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceNdb(SQLStatementParser.CreateTablespaceNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceNdb(SQLStatementParser.CreateTablespaceNdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(SQLStatementParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(SQLStatementParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SQLStatementParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SQLStatementParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseOption(SQLStatementParser.CreateDatabaseOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseOption(SQLStatementParser.CreateDatabaseOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void enterOwnerStatement(SQLStatementParser.OwnerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void exitOwnerStatement(SQLStatementParser.OwnerStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link SQLStatementParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreciseSchedule(SQLStatementParser.PreciseScheduleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link SQLStatementParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreciseSchedule(SQLStatementParser.PreciseScheduleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link SQLStatementParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalSchedule(SQLStatementParser.IntervalScheduleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link SQLStatementParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalSchedule(SQLStatementParser.IntervalScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void enterTimestampValue(SQLStatementParser.TimestampValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void exitTimestampValue(SQLStatementParser.TimestampValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#intervalExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpr(SQLStatementParser.IntervalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#intervalExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpr(SQLStatementParser.IntervalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void enterIntervalType(SQLStatementParser.IntervalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void exitIntervalType(SQLStatementParser.IntervalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#enableType}.
	 * @param ctx the parse tree
	 */
	void enterEnableType(SQLStatementParser.EnableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#enableType}.
	 * @param ctx the parse tree
	 */
	void exitEnableType(SQLStatementParser.EnableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(SQLStatementParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(SQLStatementParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption(SQLStatementParser.IndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption(SQLStatementParser.IndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void enterProcedureParameter(SQLStatementParser.ProcedureParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void exitProcedureParameter(SQLStatementParser.ProcedureParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(SQLStatementParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(SQLStatementParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link SQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineComment(SQLStatementParser.RoutineCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link SQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineComment(SQLStatementParser.RoutineCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link SQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineLanguage(SQLStatementParser.RoutineLanguageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link SQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineLanguage(SQLStatementParser.RoutineLanguageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link SQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBehavior(SQLStatementParser.RoutineBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link SQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBehavior(SQLStatementParser.RoutineBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link SQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineData(SQLStatementParser.RoutineDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link SQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineData(SQLStatementParser.RoutineDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link SQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineSecurity(SQLStatementParser.RoutineSecurityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link SQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineSecurity(SQLStatementParser.RoutineSecurityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void enterServerOption(SQLStatementParser.ServerOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void exitServerOption(SQLStatementParser.ServerOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitions(SQLStatementParser.CreateDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitions(SQLStatementParser.CreateDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link SQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDeclaration(SQLStatementParser.ColumnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link SQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDeclaration(SQLStatementParser.ColumnDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link SQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDeclaration(SQLStatementParser.ConstraintDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link SQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDeclaration(SQLStatementParser.ConstraintDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link SQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIndexDeclaration(SQLStatementParser.IndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link SQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIndexDeclaration(SQLStatementParser.IndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(SQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(SQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterNullColumnConstraint(SQLStatementParser.NullColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitNullColumnConstraint(SQLStatementParser.NullColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDefaultColumnConstraint(SQLStatementParser.DefaultColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDefaultColumnConstraint(SQLStatementParser.DefaultColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAutoIncrementColumnConstraint(SQLStatementParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAutoIncrementColumnConstraint(SQLStatementParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyColumnConstraint(SQLStatementParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyColumnConstraint(SQLStatementParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyColumnConstraint(SQLStatementParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyColumnConstraint(SQLStatementParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCommentColumnConstraint(SQLStatementParser.CommentColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCommentColumnConstraint(SQLStatementParser.CommentColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterFormatColumnConstraint(SQLStatementParser.FormatColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitFormatColumnConstraint(SQLStatementParser.FormatColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterStorageColumnConstraint(SQLStatementParser.StorageColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitStorageColumnConstraint(SQLStatementParser.StorageColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterReferenceColumnConstraint(SQLStatementParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link SQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitReferenceColumnConstraint(SQLStatementParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link SQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyTableConstraint(SQLStatementParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link SQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyTableConstraint(SQLStatementParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link SQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyTableConstraint(SQLStatementParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link SQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyTableConstraint(SQLStatementParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link SQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyTableConstraint(SQLStatementParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link SQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyTableConstraint(SQLStatementParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link SQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableConstraint(SQLStatementParser.CheckTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link SQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableConstraint(SQLStatementParser.CheckTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(SQLStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(SQLStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void enterReferenceAction(SQLStatementParser.ReferenceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void exitReferenceAction(SQLStatementParser.ReferenceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceControlType(SQLStatementParser.ReferenceControlTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceControlType(SQLStatementParser.ReferenceControlTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link SQLStatementParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIndexDeclaration(SQLStatementParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link SQLStatementParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIndexDeclaration(SQLStatementParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link SQLStatementParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSpecialIndexDeclaration(SQLStatementParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link SQLStatementParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSpecialIndexDeclaration(SQLStatementParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEngine(SQLStatementParser.TableOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEngine(SQLStatementParser.TableOptionEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAutoIncrement(SQLStatementParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAutoIncrement(SQLStatementParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAverage(SQLStatementParser.TableOptionAverageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAverage(SQLStatementParser.TableOptionAverageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCharset(SQLStatementParser.TableOptionCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCharset(SQLStatementParser.TableOptionCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionChecksum(SQLStatementParser.TableOptionChecksumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionChecksum(SQLStatementParser.TableOptionChecksumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCollate(SQLStatementParser.TableOptionCollateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCollate(SQLStatementParser.TableOptionCollateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionComment(SQLStatementParser.TableOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionComment(SQLStatementParser.TableOptionCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCompression(SQLStatementParser.TableOptionCompressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCompression(SQLStatementParser.TableOptionCompressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionConnection(SQLStatementParser.TableOptionConnectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionConnection(SQLStatementParser.TableOptionConnectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDataDirectory(SQLStatementParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDataDirectory(SQLStatementParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDelay(SQLStatementParser.TableOptionDelayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDelay(SQLStatementParser.TableOptionDelayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEncryption(SQLStatementParser.TableOptionEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEncryption(SQLStatementParser.TableOptionEncryptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionIndexDirectory(SQLStatementParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionIndexDirectory(SQLStatementParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionInsertMethod(SQLStatementParser.TableOptionInsertMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionInsertMethod(SQLStatementParser.TableOptionInsertMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionKeyBlockSize(SQLStatementParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionKeyBlockSize(SQLStatementParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMaxRows(SQLStatementParser.TableOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMaxRows(SQLStatementParser.TableOptionMaxRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMinRows(SQLStatementParser.TableOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMinRows(SQLStatementParser.TableOptionMinRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPackKeys(SQLStatementParser.TableOptionPackKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPackKeys(SQLStatementParser.TableOptionPackKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPassword(SQLStatementParser.TableOptionPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPassword(SQLStatementParser.TableOptionPasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRowFormat(SQLStatementParser.TableOptionRowFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRowFormat(SQLStatementParser.TableOptionRowFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRecalculation(SQLStatementParser.TableOptionRecalculationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRecalculation(SQLStatementParser.TableOptionRecalculationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPersistent(SQLStatementParser.TableOptionPersistentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPersistent(SQLStatementParser.TableOptionPersistentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionSamplePage(SQLStatementParser.TableOptionSamplePageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionSamplePage(SQLStatementParser.TableOptionSamplePageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionTablespace(SQLStatementParser.TableOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionTablespace(SQLStatementParser.TableOptionTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionUnion(SQLStatementParser.TableOptionUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link SQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionUnion(SQLStatementParser.TableOptionUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void enterTablespaceStorage(SQLStatementParser.TablespaceStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void exitTablespaceStorage(SQLStatementParser.TablespaceStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitions(SQLStatementParser.PartitionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitions(SQLStatementParser.PartitionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link SQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionHash(SQLStatementParser.PartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link SQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionHash(SQLStatementParser.PartitionFunctionHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link SQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionKey(SQLStatementParser.PartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link SQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionKey(SQLStatementParser.PartitionFunctionKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link SQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionRange(SQLStatementParser.PartitionFunctionRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link SQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionRange(SQLStatementParser.PartitionFunctionRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link SQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionList(SQLStatementParser.PartitionFunctionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link SQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionList(SQLStatementParser.PartitionFunctionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link SQLStatementParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionHash(SQLStatementParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link SQLStatementParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionHash(SQLStatementParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link SQLStatementParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionKey(SQLStatementParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link SQLStatementParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionKey(SQLStatementParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link SQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionComparision(SQLStatementParser.PartitionComparisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link SQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionComparision(SQLStatementParser.PartitionComparisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link SQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListAtom(SQLStatementParser.PartitionListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link SQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListAtom(SQLStatementParser.PartitionListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link SQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListVector(SQLStatementParser.PartitionListVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link SQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListVector(SQLStatementParser.PartitionListVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link SQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSimple(SQLStatementParser.PartitionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link SQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSimple(SQLStatementParser.PartitionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerAtom(SQLStatementParser.PartitionDefinerAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerAtom(SQLStatementParser.PartitionDefinerAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerVector(SQLStatementParser.PartitionDefinerVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerVector(SQLStatementParser.PartitionDefinerVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubpartitionDefinition(SQLStatementParser.SubpartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubpartitionDefinition(SQLStatementParser.SubpartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionEngine(SQLStatementParser.PartitionOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionEngine(SQLStatementParser.PartitionOptionEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionComment(SQLStatementParser.PartitionOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionComment(SQLStatementParser.PartitionOptionCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionDataDirectory(SQLStatementParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionDataDirectory(SQLStatementParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionIndexDirectory(SQLStatementParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionIndexDirectory(SQLStatementParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMaxRows(SQLStatementParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMaxRows(SQLStatementParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMinRows(SQLStatementParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMinRows(SQLStatementParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionTablespace(SQLStatementParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionTablespace(SQLStatementParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionNodeGroup(SQLStatementParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link SQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionNodeGroup(SQLStatementParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link SQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterSimpleDatabase(SQLStatementParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link SQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterSimpleDatabase(SQLStatementParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link SQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterUpgradeName(SQLStatementParser.AlterUpgradeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link SQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterUpgradeName(SQLStatementParser.AlterUpgradeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void enterAlterEvent(SQLStatementParser.AlterEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void exitAlterEvent(SQLStatementParser.AlterEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(SQLStatementParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(SQLStatementParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void enterAlterInstance(SQLStatementParser.AlterInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void exitAlterInstance(SQLStatementParser.AlterInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterLogfileGroup(SQLStatementParser.AlterLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterLogfileGroup(SQLStatementParser.AlterLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(SQLStatementParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(SQLStatementParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void enterAlterServer(SQLStatementParser.AlterServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void exitAlterServer(SQLStatementParser.AlterServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(SQLStatementParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(SQLStatementParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespace(SQLStatementParser.AlterTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespace(SQLStatementParser.AlterTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(SQLStatementParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(SQLStatementParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTableOption(SQLStatementParser.AlterByTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTableOption(SQLStatementParser.AlterByTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumn(SQLStatementParser.AlterByAddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumn(SQLStatementParser.AlterByAddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumns(SQLStatementParser.AlterByAddColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumns(SQLStatementParser.AlterByAddColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddIndex(SQLStatementParser.AlterByAddIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddIndex(SQLStatementParser.AlterByAddIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPrimaryKey(SQLStatementParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPrimaryKey(SQLStatementParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddUniqueKey(SQLStatementParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddUniqueKey(SQLStatementParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddSpecialIndex(SQLStatementParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddSpecialIndex(SQLStatementParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddForeignKey(SQLStatementParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddForeignKey(SQLStatementParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterBySetAlgorithm(SQLStatementParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterBySetAlgorithm(SQLStatementParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeDefault(SQLStatementParser.AlterByChangeDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeDefault(SQLStatementParser.AlterByChangeDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeColumn(SQLStatementParser.AlterByChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeColumn(SQLStatementParser.AlterByChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByLock(SQLStatementParser.AlterByLockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByLock(SQLStatementParser.AlterByLockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByModifyColumn(SQLStatementParser.AlterByModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByModifyColumn(SQLStatementParser.AlterByModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropColumn(SQLStatementParser.AlterByDropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropColumn(SQLStatementParser.AlterByDropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPrimaryKey(SQLStatementParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPrimaryKey(SQLStatementParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropIndex(SQLStatementParser.AlterByDropIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropIndex(SQLStatementParser.AlterByDropIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropForeignKey(SQLStatementParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropForeignKey(SQLStatementParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDisableKeys(SQLStatementParser.AlterByDisableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDisableKeys(SQLStatementParser.AlterByDisableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByEnableKeys(SQLStatementParser.AlterByEnableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByEnableKeys(SQLStatementParser.AlterByEnableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRename(SQLStatementParser.AlterByRenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRename(SQLStatementParser.AlterByRenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOrder(SQLStatementParser.AlterByOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOrder(SQLStatementParser.AlterByOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByConvertCharset(SQLStatementParser.AlterByConvertCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByConvertCharset(SQLStatementParser.AlterByConvertCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDefaultCharset(SQLStatementParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDefaultCharset(SQLStatementParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardTablespace(SQLStatementParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardTablespace(SQLStatementParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportTablespace(SQLStatementParser.AlterByImportTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportTablespace(SQLStatementParser.AlterByImportTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByForce(SQLStatementParser.AlterByForceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByForce(SQLStatementParser.AlterByForceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByValidate(SQLStatementParser.AlterByValidateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByValidate(SQLStatementParser.AlterByValidateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPartition(SQLStatementParser.AlterByAddPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPartition(SQLStatementParser.AlterByAddPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPartition(SQLStatementParser.AlterByDropPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPartition(SQLStatementParser.AlterByDropPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardPartition(SQLStatementParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardPartition(SQLStatementParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportPartition(SQLStatementParser.AlterByImportPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportPartition(SQLStatementParser.AlterByImportPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTruncatePartition(SQLStatementParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTruncatePartition(SQLStatementParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCoalescePartition(SQLStatementParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCoalescePartition(SQLStatementParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByReorganizePartition(SQLStatementParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByReorganizePartition(SQLStatementParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByExchangePartition(SQLStatementParser.AlterByExchangePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByExchangePartition(SQLStatementParser.AlterByExchangePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAnalyzePartitiion}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAnalyzePartitiion(SQLStatementParser.AlterByAnalyzePartitiionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAnalyzePartitiion}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAnalyzePartitiion(SQLStatementParser.AlterByAnalyzePartitiionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCheckPartition(SQLStatementParser.AlterByCheckPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCheckPartition(SQLStatementParser.AlterByCheckPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOptimizePartition(SQLStatementParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOptimizePartition(SQLStatementParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRebuildPartition(SQLStatementParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRebuildPartition(SQLStatementParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRepairPartition(SQLStatementParser.AlterByRepairPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRepairPartition(SQLStatementParser.AlterByRepairPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRemovePartitioning(SQLStatementParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRemovePartitioning(SQLStatementParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByUpgradePartitioning(SQLStatementParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link SQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByUpgradePartitioning(SQLStatementParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(SQLStatementParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(SQLStatementParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void enterDropEvent(SQLStatementParser.DropEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void exitDropEvent(SQLStatementParser.DropEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(SQLStatementParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(SQLStatementParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropLogfileGroup(SQLStatementParser.DropLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropLogfileGroup(SQLStatementParser.DropLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(SQLStatementParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(SQLStatementParser.DropProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(SQLStatementParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(SQLStatementParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void enterDropServer(SQLStatementParser.DropServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void exitDropServer(SQLStatementParser.DropServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SQLStatementParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SQLStatementParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void enterDropTablespace(SQLStatementParser.DropTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void exitDropTablespace(SQLStatementParser.DropTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(SQLStatementParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(SQLStatementParser.DropTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(SQLStatementParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(SQLStatementParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(SQLStatementParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(SQLStatementParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableClause(SQLStatementParser.RenameTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableClause(SQLStatementParser.RenameTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(SQLStatementParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(SQLStatementParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(SQLStatementParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(SQLStatementParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(SQLStatementParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(SQLStatementParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(SQLStatementParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(SQLStatementParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerStatement(SQLStatementParser.HandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerStatement(SQLStatementParser.HandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(SQLStatementParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(SQLStatementParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadDataStatement(SQLStatementParser.LoadDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadDataStatement(SQLStatementParser.LoadDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadXmlStatement(SQLStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadXmlStatement(SQLStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceStatement(SQLStatementParser.ReplaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceStatement(SQLStatementParser.ReplaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link SQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelect(SQLStatementParser.SimpleSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link SQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelect(SQLStatementParser.SimpleSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link SQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisSelect(SQLStatementParser.ParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link SQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisSelect(SQLStatementParser.ParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link SQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionSelect(SQLStatementParser.UnionSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link SQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionSelect(SQLStatementParser.UnionSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link SQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesisSelect(SQLStatementParser.UnionParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link SQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesisSelect(SQLStatementParser.UnionParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(SQLStatementParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(SQLStatementParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatementValue(SQLStatementParser.InsertStatementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatementValue(SQLStatementParser.InsertStatementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void enterUpdatedElement(SQLStatementParser.UpdatedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void exitUpdatedElement(SQLStatementParser.UpdatedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentField(SQLStatementParser.AssignmentFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentField(SQLStatementParser.AssignmentFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(SQLStatementParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(SQLStatementParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeleteStatement(SQLStatementParser.SingleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeleteStatement(SQLStatementParser.SingleDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleDeleteStatement(SQLStatementParser.MultipleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleDeleteStatement(SQLStatementParser.MultipleDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerOpenStatement(SQLStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerOpenStatement(SQLStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadIndexStatement(SQLStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadIndexStatement(SQLStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadStatement(SQLStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadStatement(SQLStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerCloseStatement(SQLStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerCloseStatement(SQLStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleUpdateStatement(SQLStatementParser.SingleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleUpdateStatement(SQLStatementParser.SingleUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleUpdateStatement(SQLStatementParser.MultipleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleUpdateStatement(SQLStatementParser.MultipleUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SQLStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SQLStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(SQLStatementParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(SQLStatementParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(SQLStatementParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(SQLStatementParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link SQLStatementParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceBase(SQLStatementParser.TableSourceBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link SQLStatementParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceBase(SQLStatementParser.TableSourceBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link SQLStatementParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceNested(SQLStatementParser.TableSourceNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link SQLStatementParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceNested(SQLStatementParser.TableSourceNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link SQLStatementParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterAtomTableItem(SQLStatementParser.AtomTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link SQLStatementParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitAtomTableItem(SQLStatementParser.AtomTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link SQLStatementParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryTableItem(SQLStatementParser.SubqueryTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link SQLStatementParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryTableItem(SQLStatementParser.SubqueryTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link SQLStatementParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterTableSourcesItem(SQLStatementParser.TableSourcesItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link SQLStatementParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitTableSourcesItem(SQLStatementParser.TableSourcesItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(SQLStatementParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(SQLStatementParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintType(SQLStatementParser.IndexHintTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintType(SQLStatementParser.IndexHintTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link SQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoin(SQLStatementParser.InnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link SQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoin(SQLStatementParser.InnerJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link SQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterStraightJoin(SQLStatementParser.StraightJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link SQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitStraightJoin(SQLStatementParser.StraightJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link SQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoin(SQLStatementParser.OuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link SQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoin(SQLStatementParser.OuterJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link SQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoin(SQLStatementParser.NaturalJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link SQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoin(SQLStatementParser.NaturalJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(SQLStatementParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(SQLStatementParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionNointo(SQLStatementParser.QueryExpressionNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionNointo(SQLStatementParser.QueryExpressionNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(SQLStatementParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(SQLStatementParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecificationNointo(SQLStatementParser.QuerySpecificationNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecificationNointo(SQLStatementParser.QuerySpecificationNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesis(SQLStatementParser.UnionParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesis(SQLStatementParser.UnionParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionStatement(SQLStatementParser.UnionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionStatement(SQLStatementParser.UnionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpec(SQLStatementParser.SelectSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpec(SQLStatementParser.SelectSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(SQLStatementParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(SQLStatementParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link SQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStarElement(SQLStatementParser.SelectStarElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link SQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStarElement(SQLStatementParser.SelectStarElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(SQLStatementParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link SQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(SQLStatementParser.SelectColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link SQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectFunctionElement(SQLStatementParser.SelectFunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link SQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectFunctionElement(SQLStatementParser.SelectFunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link SQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpressionElement(SQLStatementParser.SelectExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link SQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpressionElement(SQLStatementParser.SelectExpressionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link SQLStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoVariables(SQLStatementParser.SelectIntoVariablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link SQLStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoVariables(SQLStatementParser.SelectIntoVariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link SQLStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoDumpFile(SQLStatementParser.SelectIntoDumpFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link SQLStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoDumpFile(SQLStatementParser.SelectIntoDumpFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link SQLStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoTextFile(SQLStatementParser.SelectIntoTextFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link SQLStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoTextFile(SQLStatementParser.SelectIntoTextFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(SQLStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(SQLStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(SQLStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(SQLStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SQLStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SQLStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(SQLStatementParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(SQLStatementParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SQLStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SQLStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void enterStartTransaction(SQLStatementParser.StartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void exitStartTransaction(SQLStatementParser.StartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#beginWork}.
	 * @param ctx the parse tree
	 */
	void enterBeginWork(SQLStatementParser.BeginWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#beginWork}.
	 * @param ctx the parse tree
	 */
	void exitBeginWork(SQLStatementParser.BeginWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void enterCommitWork(SQLStatementParser.CommitWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void exitCommitWork(SQLStatementParser.CommitWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void enterRollbackWork(SQLStatementParser.RollbackWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void exitRollbackWork(SQLStatementParser.RollbackWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void enterSavepointStatement(SQLStatementParser.SavepointStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void exitSavepointStatement(SQLStatementParser.SavepointStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void enterRollbackStatement(SQLStatementParser.RollbackStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void exitRollbackStatement(SQLStatementParser.RollbackStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterReleaseStatement(SQLStatementParser.ReleaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitReleaseStatement(SQLStatementParser.ReleaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#lockTables}.
	 * @param ctx the parse tree
	 */
	void enterLockTables(SQLStatementParser.LockTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#lockTables}.
	 * @param ctx the parse tree
	 */
	void exitLockTables(SQLStatementParser.LockTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#unlockTables}.
	 * @param ctx the parse tree
	 */
	void enterUnlockTables(SQLStatementParser.UnlockTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#unlockTables}.
	 * @param ctx the parse tree
	 */
	void exitUnlockTables(SQLStatementParser.UnlockTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetAutocommitStatement(SQLStatementParser.SetAutocommitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetAutocommitStatement(SQLStatementParser.SetAutocommitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetTransactionStatement(SQLStatementParser.SetTransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetTransactionStatement(SQLStatementParser.SetTransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionMode(SQLStatementParser.TransactionModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionMode(SQLStatementParser.TransactionModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#lockTableElement}.
	 * @param ctx the parse tree
	 */
	void enterLockTableElement(SQLStatementParser.LockTableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#lockTableElement}.
	 * @param ctx the parse tree
	 */
	void exitLockTableElement(SQLStatementParser.LockTableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#lockAction}.
	 * @param ctx the parse tree
	 */
	void enterLockAction(SQLStatementParser.LockActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#lockAction}.
	 * @param ctx the parse tree
	 */
	void exitLockAction(SQLStatementParser.LockActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#transactionOption}.
	 * @param ctx the parse tree
	 */
	void enterTransactionOption(SQLStatementParser.TransactionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#transactionOption}.
	 * @param ctx the parse tree
	 */
	void exitTransactionOption(SQLStatementParser.TransactionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#transactionLevel}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevel(SQLStatementParser.TransactionLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#transactionLevel}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevel(SQLStatementParser.TransactionLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#changeMaster}.
	 * @param ctx the parse tree
	 */
	void enterChangeMaster(SQLStatementParser.ChangeMasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#changeMaster}.
	 * @param ctx the parse tree
	 */
	void exitChangeMaster(SQLStatementParser.ChangeMasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationFilter(SQLStatementParser.ChangeReplicationFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationFilter(SQLStatementParser.ChangeReplicationFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void enterPurgeBinaryLogs(SQLStatementParser.PurgeBinaryLogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void exitPurgeBinaryLogs(SQLStatementParser.PurgeBinaryLogsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#resetMaster}.
	 * @param ctx the parse tree
	 */
	void enterResetMaster(SQLStatementParser.ResetMasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#resetMaster}.
	 * @param ctx the parse tree
	 */
	void exitResetMaster(SQLStatementParser.ResetMasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#resetSlave}.
	 * @param ctx the parse tree
	 */
	void enterResetSlave(SQLStatementParser.ResetSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#resetSlave}.
	 * @param ctx the parse tree
	 */
	void exitResetSlave(SQLStatementParser.ResetSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void enterStartSlave(SQLStatementParser.StartSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void exitStartSlave(SQLStatementParser.StartSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void enterStopSlave(SQLStatementParser.StopSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void exitStopSlave(SQLStatementParser.StopSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStartGroupReplication(SQLStatementParser.StartGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStartGroupReplication(SQLStatementParser.StartGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStopGroupReplication(SQLStatementParser.StopGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStopGroupReplication(SQLStatementParser.StopGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link SQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterStringOption(SQLStatementParser.MasterStringOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link SQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterStringOption(SQLStatementParser.MasterStringOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link SQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterDecimalOption(SQLStatementParser.MasterDecimalOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link SQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterDecimalOption(SQLStatementParser.MasterDecimalOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link SQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterBoolOption(SQLStatementParser.MasterBoolOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link SQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterBoolOption(SQLStatementParser.MasterBoolOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link SQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterRealOption(SQLStatementParser.MasterRealOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link SQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterRealOption(SQLStatementParser.MasterRealOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link SQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterUidListOption(SQLStatementParser.MasterUidListOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link SQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterUidListOption(SQLStatementParser.MasterUidListOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#stringMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterStringMasterOption(SQLStatementParser.StringMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#stringMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitStringMasterOption(SQLStatementParser.StringMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterDecimalMasterOption(SQLStatementParser.DecimalMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitDecimalMasterOption(SQLStatementParser.DecimalMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#boolMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterBoolMasterOption(SQLStatementParser.BoolMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#boolMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitBoolMasterOption(SQLStatementParser.BoolMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption(SQLStatementParser.ChannelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption(SQLStatementParser.ChannelOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterDoDbReplication(SQLStatementParser.DoDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitDoDbReplication(SQLStatementParser.DoDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreDbReplication(SQLStatementParser.IgnoreDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreDbReplication(SQLStatementParser.IgnoreDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterDoTableReplication(SQLStatementParser.DoTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitDoTableReplication(SQLStatementParser.DoTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreTableReplication(SQLStatementParser.IgnoreTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreTableReplication(SQLStatementParser.IgnoreTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterWildDoTableReplication(SQLStatementParser.WildDoTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitWildDoTableReplication(SQLStatementParser.WildDoTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterWildIgnoreTableReplication(SQLStatementParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitWildIgnoreTableReplication(SQLStatementParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterRewriteDbReplication(SQLStatementParser.RewriteDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link SQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitRewriteDbReplication(SQLStatementParser.RewriteDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#tablePair}.
	 * @param ctx the parse tree
	 */
	void enterTablePair(SQLStatementParser.TablePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#tablePair}.
	 * @param ctx the parse tree
	 */
	void exitTablePair(SQLStatementParser.TablePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#threadType}.
	 * @param ctx the parse tree
	 */
	void enterThreadType(SQLStatementParser.ThreadTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#threadType}.
	 * @param ctx the parse tree
	 */
	void exitThreadType(SQLStatementParser.ThreadTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link SQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterGtidsUntilOption(SQLStatementParser.GtidsUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link SQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitGtidsUntilOption(SQLStatementParser.GtidsUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link SQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterLogUntilOption(SQLStatementParser.MasterLogUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link SQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterLogUntilOption(SQLStatementParser.MasterLogUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link SQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterRelayLogUntilOption(SQLStatementParser.RelayLogUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link SQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitRelayLogUntilOption(SQLStatementParser.RelayLogUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link SQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterSqlGapsUntilOption(SQLStatementParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link SQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitSqlGapsUntilOption(SQLStatementParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link SQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterUserConnectionOption(SQLStatementParser.UserConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link SQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitUserConnectionOption(SQLStatementParser.UserConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link SQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterPasswordConnectionOption(SQLStatementParser.PasswordConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link SQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitPasswordConnectionOption(SQLStatementParser.PasswordConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link SQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultAuthConnectionOption(SQLStatementParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link SQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultAuthConnectionOption(SQLStatementParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link SQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterPluginDirConnectionOption(SQLStatementParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link SQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitPluginDirConnectionOption(SQLStatementParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#gtuidSet}.
	 * @param ctx the parse tree
	 */
	void enterGtuidSet(SQLStatementParser.GtuidSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#gtuidSet}.
	 * @param ctx the parse tree
	 */
	void exitGtuidSet(SQLStatementParser.GtuidSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 */
	void enterXaStartTransaction(SQLStatementParser.XaStartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 */
	void exitXaStartTransaction(SQLStatementParser.XaStartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 */
	void enterXaEndTransaction(SQLStatementParser.XaEndTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 */
	void exitXaEndTransaction(SQLStatementParser.XaEndTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 */
	void enterXaPrepareStatement(SQLStatementParser.XaPrepareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 */
	void exitXaPrepareStatement(SQLStatementParser.XaPrepareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#xaCommitWork}.
	 * @param ctx the parse tree
	 */
	void enterXaCommitWork(SQLStatementParser.XaCommitWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#xaCommitWork}.
	 * @param ctx the parse tree
	 */
	void exitXaCommitWork(SQLStatementParser.XaCommitWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 */
	void enterXaRollbackWork(SQLStatementParser.XaRollbackWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 */
	void exitXaRollbackWork(SQLStatementParser.XaRollbackWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 */
	void enterXaRecoverWork(SQLStatementParser.XaRecoverWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 */
	void exitXaRecoverWork(SQLStatementParser.XaRecoverWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrepareStatement(SQLStatementParser.PrepareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrepareStatement(SQLStatementParser.PrepareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStatement(SQLStatementParser.ExecuteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStatement(SQLStatementParser.ExecuteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 */
	void enterDeallocatePrepare(SQLStatementParser.DeallocatePrepareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 */
	void exitDeallocatePrepare(SQLStatementParser.DeallocatePrepareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBody(SQLStatementParser.RoutineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBody(SQLStatementParser.RoutineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(SQLStatementParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(SQLStatementParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(SQLStatementParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(SQLStatementParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SQLStatementParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SQLStatementParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterateStatement(SQLStatementParser.IterateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterateStatement(SQLStatementParser.IterateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeaveStatement(SQLStatementParser.LeaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeaveStatement(SQLStatementParser.LeaveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(SQLStatementParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(SQLStatementParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(SQLStatementParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(SQLStatementParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SQLStatementParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SQLStatementParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SQLStatementParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SQLStatementParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link SQLStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCloseCursor(SQLStatementParser.CloseCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link SQLStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCloseCursor(SQLStatementParser.CloseCursorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link SQLStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterFetchCursor(SQLStatementParser.FetchCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link SQLStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitFetchCursor(SQLStatementParser.FetchCursorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link SQLStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenCursor(SQLStatementParser.OpenCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link SQLStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenCursor(SQLStatementParser.OpenCursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVariable(SQLStatementParser.DeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVariable(SQLStatementParser.DeclareVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCondition(SQLStatementParser.DeclareConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCondition(SQLStatementParser.DeclareConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCursor(SQLStatementParser.DeclareCursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCursor(SQLStatementParser.DeclareCursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void enterDeclareHandler(SQLStatementParser.DeclareHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void exitDeclareHandler(SQLStatementParser.DeclareHandlerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionCode(SQLStatementParser.HandlerConditionCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionCode(SQLStatementParser.HandlerConditionCodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionState(SQLStatementParser.HandlerConditionStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionState(SQLStatementParser.HandlerConditionStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionName(SQLStatementParser.HandlerConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionName(SQLStatementParser.HandlerConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionWarning(SQLStatementParser.HandlerConditionWarningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionWarning(SQLStatementParser.HandlerConditionWarningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionNotfound(SQLStatementParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionNotfound(SQLStatementParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionException(SQLStatementParser.HandlerConditionExceptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link SQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionException(SQLStatementParser.HandlerConditionExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureSqlStatement(SQLStatementParser.ProcedureSqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureSqlStatement(SQLStatementParser.ProcedureSqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseAlternative(SQLStatementParser.CaseAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseAlternative(SQLStatementParser.CaseAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void enterElifAlternative(SQLStatementParser.ElifAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void exitElifAlternative(SQLStatementParser.ElifAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link SQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMysqlV56(SQLStatementParser.AlterUserMysqlV56Context ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link SQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMysqlV56(SQLStatementParser.AlterUserMysqlV56Context ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link SQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMysqlV57(SQLStatementParser.AlterUserMysqlV57Context ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link SQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMysqlV57(SQLStatementParser.AlterUserMysqlV57Context ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link SQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMysqlV56(SQLStatementParser.CreateUserMysqlV56Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link SQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMysqlV56(SQLStatementParser.CreateUserMysqlV56Context ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link SQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMysqlV57(SQLStatementParser.CreateUserMysqlV57Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link SQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMysqlV57(SQLStatementParser.CreateUserMysqlV57Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(SQLStatementParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(SQLStatementParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantStatement(SQLStatementParser.GrantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantStatement(SQLStatementParser.GrantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#grantProxy}.
	 * @param ctx the parse tree
	 */
	void enterGrantProxy(SQLStatementParser.GrantProxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#grantProxy}.
	 * @param ctx the parse tree
	 */
	void exitGrantProxy(SQLStatementParser.GrantProxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void enterRenameUser(SQLStatementParser.RenameUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void exitRenameUser(SQLStatementParser.RenameUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link SQLStatementParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterDetailRevoke(SQLStatementParser.DetailRevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link SQLStatementParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitDetailRevoke(SQLStatementParser.DetailRevokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link SQLStatementParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterShortRevoke(SQLStatementParser.ShortRevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link SQLStatementParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitShortRevoke(SQLStatementParser.ShortRevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#revokeProxy}.
	 * @param ctx the parse tree
	 */
	void enterRevokeProxy(SQLStatementParser.RevokeProxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#revokeProxy}.
	 * @param ctx the parse tree
	 */
	void exitRevokeProxy(SQLStatementParser.RevokeProxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPasswordStatement(SQLStatementParser.SetPasswordStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPasswordStatement(SQLStatementParser.SetPasswordStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#userSpecification}.
	 * @param ctx the parse tree
	 */
	void enterUserSpecification(SQLStatementParser.UserSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#userSpecification}.
	 * @param ctx the parse tree
	 */
	void exitUserSpecification(SQLStatementParser.UserSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link SQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterPasswordAuthOption(SQLStatementParser.PasswordAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link SQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitPasswordAuthOption(SQLStatementParser.PasswordAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link SQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterStringAuthOption(SQLStatementParser.StringAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link SQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitStringAuthOption(SQLStatementParser.StringAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link SQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterHashAuthOption(SQLStatementParser.HashAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link SQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitHashAuthOption(SQLStatementParser.HashAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link SQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAuthOption(SQLStatementParser.SimpleAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link SQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAuthOption(SQLStatementParser.SimpleAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void enterTlsOption(SQLStatementParser.TlsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void exitTlsOption(SQLStatementParser.TlsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#userResourceOption}.
	 * @param ctx the parse tree
	 */
	void enterUserResourceOption(SQLStatementParser.UserResourceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#userResourceOption}.
	 * @param ctx the parse tree
	 */
	void exitUserResourceOption(SQLStatementParser.UserResourceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#userPasswordOption}.
	 * @param ctx the parse tree
	 */
	void enterUserPasswordOption(SQLStatementParser.UserPasswordOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#userPasswordOption}.
	 * @param ctx the parse tree
	 */
	void exitUserPasswordOption(SQLStatementParser.UserPasswordOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#userLockOption}.
	 * @param ctx the parse tree
	 */
	void enterUserLockOption(SQLStatementParser.UserLockOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#userLockOption}.
	 * @param ctx the parse tree
	 */
	void exitUserLockOption(SQLStatementParser.UserLockOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#privelegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivelegeClause(SQLStatementParser.PrivelegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#privelegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivelegeClause(SQLStatementParser.PrivelegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(SQLStatementParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(SQLStatementParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link SQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterCurrentSchemaPriviLevel(SQLStatementParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link SQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitCurrentSchemaPriviLevel(SQLStatementParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link SQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterGlobalPrivLevel(SQLStatementParser.GlobalPrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link SQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitGlobalPrivLevel(SQLStatementParser.GlobalPrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link SQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteSchemaPrivLevel(SQLStatementParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link SQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteSchemaPrivLevel(SQLStatementParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link SQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteFullTablePrivLevel(SQLStatementParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link SQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteFullTablePrivLevel(SQLStatementParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link SQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteTablePrivLevel(SQLStatementParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link SQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteTablePrivLevel(SQLStatementParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#renameUserClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameUserClause(SQLStatementParser.RenameUserClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#renameUserClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameUserClause(SQLStatementParser.RenameUserClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTable(SQLStatementParser.AnalyzeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTable(SQLStatementParser.AnalyzeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void enterCheckTable(SQLStatementParser.CheckTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void exitCheckTable(SQLStatementParser.CheckTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void enterChecksumTable(SQLStatementParser.ChecksumTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void exitChecksumTable(SQLStatementParser.ChecksumTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeTable(SQLStatementParser.OptimizeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeTable(SQLStatementParser.OptimizeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(SQLStatementParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(SQLStatementParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableOption(SQLStatementParser.CheckTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableOption(SQLStatementParser.CheckTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#createUdfunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateUdfunction(SQLStatementParser.CreateUdfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#createUdfunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateUdfunction(SQLStatementParser.CreateUdfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void enterInstallPlugin(SQLStatementParser.InstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void exitInstallPlugin(SQLStatementParser.InstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void enterUninstallPlugin(SQLStatementParser.UninstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void exitUninstallPlugin(SQLStatementParser.UninstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(SQLStatementParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(SQLStatementParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetCharset(SQLStatementParser.SetCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetCharset(SQLStatementParser.SetCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetNames(SQLStatementParser.SetNamesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetNames(SQLStatementParser.SetNamesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPassword(SQLStatementParser.SetPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPassword(SQLStatementParser.SetPasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(SQLStatementParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(SQLStatementParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetAutocommit(SQLStatementParser.SetAutocommitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link SQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetAutocommit(SQLStatementParser.SetAutocommitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowMasterLogs(SQLStatementParser.ShowMasterLogsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowMasterLogs(SQLStatementParser.ShowMasterLogsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowLogEvents(SQLStatementParser.ShowLogEventsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowLogEvents(SQLStatementParser.ShowLogEventsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowObjectFilter(SQLStatementParser.ShowObjectFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowObjectFilter(SQLStatementParser.ShowObjectFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(SQLStatementParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(SQLStatementParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDb(SQLStatementParser.ShowCreateDbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDb(SQLStatementParser.ShowCreateDbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateFullIdObject(SQLStatementParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateFullIdObject(SQLStatementParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateUser(SQLStatementParser.ShowCreateUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateUser(SQLStatementParser.ShowCreateUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowEngine(SQLStatementParser.ShowEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowEngine(SQLStatementParser.ShowEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowGlobalInfo(SQLStatementParser.ShowGlobalInfoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowGlobalInfo(SQLStatementParser.ShowGlobalInfoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowErrors(SQLStatementParser.ShowErrorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowErrors(SQLStatementParser.ShowErrorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCountErrors(SQLStatementParser.ShowCountErrorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCountErrors(SQLStatementParser.ShowCountErrorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemaFilter(SQLStatementParser.ShowSchemaFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemaFilter(SQLStatementParser.ShowSchemaFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowRoutine(SQLStatementParser.ShowRoutineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowRoutine(SQLStatementParser.ShowRoutineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowGrants(SQLStatementParser.ShowGrantsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowGrants(SQLStatementParser.ShowGrantsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowIndexes(SQLStatementParser.ShowIndexesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowIndexes(SQLStatementParser.ShowIndexesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowOpenTables(SQLStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowOpenTables(SQLStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowProfile(SQLStatementParser.ShowProfileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowProfile(SQLStatementParser.ShowProfileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveStatus(SQLStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link SQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveStatus(SQLStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#variableClause}.
	 * @param ctx the parse tree
	 */
	void enterVariableClause(SQLStatementParser.VariableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#variableClause}.
	 * @param ctx the parse tree
	 */
	void exitVariableClause(SQLStatementParser.VariableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#showCommonEntity}.
	 * @param ctx the parse tree
	 */
	void enterShowCommonEntity(SQLStatementParser.ShowCommonEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#showCommonEntity}.
	 * @param ctx the parse tree
	 */
	void exitShowCommonEntity(SQLStatementParser.ShowCommonEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void enterShowFilter(SQLStatementParser.ShowFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void exitShowFilter(SQLStatementParser.ShowFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 */
	void enterShowGlobalInfoClause(SQLStatementParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 */
	void exitShowGlobalInfoClause(SQLStatementParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemaEntity(SQLStatementParser.ShowSchemaEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemaEntity(SQLStatementParser.ShowSchemaEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void enterShowProfileType(SQLStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void exitShowProfileType(SQLStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#binlogStatement}.
	 * @param ctx the parse tree
	 */
	void enterBinlogStatement(SQLStatementParser.BinlogStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#binlogStatement}.
	 * @param ctx the parse tree
	 */
	void exitBinlogStatement(SQLStatementParser.BinlogStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterCacheIndexStatement(SQLStatementParser.CacheIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitCacheIndexStatement(SQLStatementParser.CacheIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#flushStatement}.
	 * @param ctx the parse tree
	 */
	void enterFlushStatement(SQLStatementParser.FlushStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#flushStatement}.
	 * @param ctx the parse tree
	 */
	void exitFlushStatement(SQLStatementParser.FlushStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#killStatement}.
	 * @param ctx the parse tree
	 */
	void enterKillStatement(SQLStatementParser.KillStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#killStatement}.
	 * @param ctx the parse tree
	 */
	void exitKillStatement(SQLStatementParser.KillStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 */
	void enterLoadIndexIntoCache(SQLStatementParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 */
	void exitLoadIndexIntoCache(SQLStatementParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void enterResetStatement(SQLStatementParser.ResetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void exitResetStatement(SQLStatementParser.ResetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#shutdownStatement}.
	 * @param ctx the parse tree
	 */
	void enterShutdownStatement(SQLStatementParser.ShutdownStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#shutdownStatement}.
	 * @param ctx the parse tree
	 */
	void exitShutdownStatement(SQLStatementParser.ShutdownStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#tableIndexes}.
	 * @param ctx the parse tree
	 */
	void enterTableIndexes(SQLStatementParser.TableIndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#tableIndexes}.
	 * @param ctx the parse tree
	 */
	void exitTableIndexes(SQLStatementParser.TableIndexesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link SQLStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFlushOption(SQLStatementParser.SimpleFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link SQLStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFlushOption(SQLStatementParser.SimpleFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link SQLStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelFlushOption(SQLStatementParser.ChannelFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link SQLStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelFlushOption(SQLStatementParser.ChannelFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link SQLStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterTableFlushOption(SQLStatementParser.TableFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link SQLStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitTableFlushOption(SQLStatementParser.TableFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#flushTableOption}.
	 * @param ctx the parse tree
	 */
	void enterFlushTableOption(SQLStatementParser.FlushTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#flushTableOption}.
	 * @param ctx the parse tree
	 */
	void exitFlushTableOption(SQLStatementParser.FlushTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 */
	void enterLoadedTableIndexes(SQLStatementParser.LoadedTableIndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 */
	void exitLoadedTableIndexes(SQLStatementParser.LoadedTableIndexesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDescribeStatement(SQLStatementParser.SimpleDescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDescribeStatement(SQLStatementParser.SimpleDescribeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void enterFullDescribeStatement(SQLStatementParser.FullDescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void exitFullDescribeStatement(SQLStatementParser.FullDescribeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#helpStatement}.
	 * @param ctx the parse tree
	 */
	void enterHelpStatement(SQLStatementParser.HelpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#helpStatement}.
	 * @param ctx the parse tree
	 */
	void exitHelpStatement(SQLStatementParser.HelpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(SQLStatementParser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(SQLStatementParser.UseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link SQLStatementParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterDescribeStatements(SQLStatementParser.DescribeStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link SQLStatementParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitDescribeStatements(SQLStatementParser.DescribeStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link SQLStatementParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterDescribeConnection(SQLStatementParser.DescribeConnectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link SQLStatementParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitDescribeConnection(SQLStatementParser.DescribeConnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#fullId}.
	 * @param ctx the parse tree
	 */
	void enterFullId(SQLStatementParser.FullIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#fullId}.
	 * @param ctx the parse tree
	 */
	void exitFullId(SQLStatementParser.FullIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(SQLStatementParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(SQLStatementParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnName(SQLStatementParser.IndexColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnName(SQLStatementParser.IndexColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#userName}.
	 * @param ctx the parse tree
	 */
	void enterUserName(SQLStatementParser.UserNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#userName}.
	 * @param ctx the parse tree
	 */
	void exitUserName(SQLStatementParser.UserNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariable(SQLStatementParser.MysqlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariable(SQLStatementParser.MysqlVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(SQLStatementParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(SQLStatementParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(SQLStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(SQLStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#engineName}.
	 * @param ctx the parse tree
	 */
	void enterEngineName(SQLStatementParser.EngineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#engineName}.
	 * @param ctx the parse tree
	 */
	void exitEngineName(SQLStatementParser.EngineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#uuidSet}.
	 * @param ctx the parse tree
	 */
	void enterUuidSet(SQLStatementParser.UuidSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#uuidSet}.
	 * @param ctx the parse tree
	 */
	void exitUuidSet(SQLStatementParser.UuidSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#xid}.
	 * @param ctx the parse tree
	 */
	void enterXid(SQLStatementParser.XidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#xid}.
	 * @param ctx the parse tree
	 */
	void exitXid(SQLStatementParser.XidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#xuidStringId}.
	 * @param ctx the parse tree
	 */
	void enterXuidStringId(SQLStatementParser.XuidStringIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#xuidStringId}.
	 * @param ctx the parse tree
	 */
	void exitXuidStringId(SQLStatementParser.XuidStringIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#authPlugin}.
	 * @param ctx the parse tree
	 */
	void enterAuthPlugin(SQLStatementParser.AuthPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#authPlugin}.
	 * @param ctx the parse tree
	 */
	void exitAuthPlugin(SQLStatementParser.AuthPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(SQLStatementParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(SQLStatementParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleId(SQLStatementParser.SimpleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleId(SQLStatementParser.SimpleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void enterDottedId(SQLStatementParser.DottedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void exitDottedId(SQLStatementParser.DottedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SQLStatementParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SQLStatementParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFileSizeLiteral(SQLStatementParser.FileSizeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFileSizeLiteral(SQLStatementParser.FileSizeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SQLStatementParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SQLStatementParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SQLStatementParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SQLStatementParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(SQLStatementParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(SQLStatementParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void enterNullNotnull(SQLStatementParser.NullNotnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void exitNullNotnull(SQLStatementParser.NullNotnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SQLStatementParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SQLStatementParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link SQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterStringDataType(SQLStatementParser.StringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link SQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitStringDataType(SQLStatementParser.StringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link SQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDimensionDataType(SQLStatementParser.DimensionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link SQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDimensionDataType(SQLStatementParser.DimensionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link SQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDataType(SQLStatementParser.SimpleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link SQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDataType(SQLStatementParser.SimpleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link SQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionDataType(SQLStatementParser.CollectionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link SQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionDataType(SQLStatementParser.CollectionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link SQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSpatialDataType(SQLStatementParser.SpatialDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link SQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSpatialDataType(SQLStatementParser.SpatialDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void enterConvertedDataType(SQLStatementParser.ConvertedDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void exitConvertedDataType(SQLStatementParser.ConvertedDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthOneDimension(SQLStatementParser.LengthOneDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthOneDimension(SQLStatementParser.LengthOneDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoDimension(SQLStatementParser.LengthTwoDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoDimension(SQLStatementParser.LengthTwoDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoOptionalDimension(SQLStatementParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoOptionalDimension(SQLStatementParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#uidList}.
	 * @param ctx the parse tree
	 */
	void enterUidList(SQLStatementParser.UidListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#uidList}.
	 * @param ctx the parse tree
	 */
	void exitUidList(SQLStatementParser.UidListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(SQLStatementParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(SQLStatementParser.TablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnNames(SQLStatementParser.IndexColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnNames(SQLStatementParser.IndexColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SQLStatementParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SQLStatementParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsWithDefaults(SQLStatementParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsWithDefaults(SQLStatementParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(SQLStatementParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(SQLStatementParser.ConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#simpleStrings}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStrings(SQLStatementParser.SimpleStringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#simpleStrings}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStrings(SQLStatementParser.SimpleStringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#userVariables}.
	 * @param ctx the parse tree
	 */
	void enterUserVariables(SQLStatementParser.UserVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#userVariables}.
	 * @param ctx the parse tree
	 */
	void exitUserVariables(SQLStatementParser.UserVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(SQLStatementParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(SQLStatementParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrDefault(SQLStatementParser.ExpressionOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrDefault(SQLStatementParser.ExpressionOrDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(SQLStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(SQLStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(SQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(SQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSpecificFunctionCall(SQLStatementParser.SpecificFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSpecificFunctionCall(SQLStatementParser.SpecificFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(SQLStatementParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(SQLStatementParser.AggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionCall(SQLStatementParser.ScalarFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionCall(SQLStatementParser.ScalarFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunctionCall(SQLStatementParser.UdfFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunctionCall(SQLStatementParser.UdfFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionCall(SQLStatementParser.PasswordFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionCall(SQLStatementParser.PasswordFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionCall(SQLStatementParser.SimpleFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionCall(SQLStatementParser.SimpleFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeFunctionCall(SQLStatementParser.DataTypeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeFunctionCall(SQLStatementParser.DataTypeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunctionCall(SQLStatementParser.ValuesFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunctionCall(SQLStatementParser.ValuesFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCaseFunctionCall(SQLStatementParser.CaseFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCaseFunctionCall(SQLStatementParser.CaseFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunctionCall(SQLStatementParser.CharFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunctionCall(SQLStatementParser.CharFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunctionCall(SQLStatementParser.PositionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunctionCall(SQLStatementParser.PositionFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFunctionCall(SQLStatementParser.SubstrFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFunctionCall(SQLStatementParser.SubstrFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunctionCall(SQLStatementParser.TrimFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunctionCall(SQLStatementParser.TrimFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightFunctionCall(SQLStatementParser.WeightFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightFunctionCall(SQLStatementParser.WeightFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunctionCall(SQLStatementParser.ExtractFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunctionCall(SQLStatementParser.ExtractFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterGetFormatFunctionCall(SQLStatementParser.GetFormatFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link SQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitGetFormatFunctionCall(SQLStatementParser.GetFormatFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseFuncAlternative(SQLStatementParser.CaseFuncAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseFuncAlternative(SQLStatementParser.CaseFuncAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link SQLStatementParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightList(SQLStatementParser.LevelWeightListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link SQLStatementParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightList(SQLStatementParser.LevelWeightListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link SQLStatementParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightRange(SQLStatementParser.LevelWeightRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link SQLStatementParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightRange(SQLStatementParser.LevelWeightRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(SQLStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(SQLStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWindowedFunction(SQLStatementParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWindowedFunction(SQLStatementParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionName(SQLStatementParser.ScalarFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionName(SQLStatementParser.ScalarFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionClause(SQLStatementParser.PasswordFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionClause(SQLStatementParser.PasswordFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(SQLStatementParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(SQLStatementParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(SQLStatementParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(SQLStatementParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link SQLStatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(SQLStatementParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link SQLStatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(SQLStatementParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SQLStatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SQLStatementParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SQLStatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SQLStatementParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SQLStatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(SQLStatementParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SQLStatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(SQLStatementParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SQLStatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(SQLStatementParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SQLStatementParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(SQLStatementParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSoundsLikePredicate(SQLStatementParser.SoundsLikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSoundsLikePredicate(SQLStatementParser.SoundsLikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtomPredicate(SQLStatementParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtomPredicate(SQLStatementParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(SQLStatementParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(SQLStatementParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryComparasionPredicate(SQLStatementParser.SubqueryComparasionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryComparasionPredicate(SQLStatementParser.SubqueryComparasionPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(SQLStatementParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(SQLStatementParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparasionPredicate(SQLStatementParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparasionPredicate(SQLStatementParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterIsNullPredicate(SQLStatementParser.IsNullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitIsNullPredicate(SQLStatementParser.IsNullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(SQLStatementParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(SQLStatementParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterRegexpPredicate(SQLStatementParser.RegexpPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link SQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitRegexpPredicate(SQLStatementParser.RegexpPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionAtom(SQLStatementParser.UnaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionAtom(SQLStatementParser.UnaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterCollateExpressionAtom(SQLStatementParser.CollateExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitCollateExpressionAtom(SQLStatementParser.CollateExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpessionAtom(SQLStatementParser.SubqueryExpessionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpessionAtom(SQLStatementParser.SubqueryExpessionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariableExpressionAtom(SQLStatementParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariableExpressionAtom(SQLStatementParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpressionAtom(SQLStatementParser.NestedExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpressionAtom(SQLStatementParser.NestedExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedRowExpressionAtom(SQLStatementParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedRowExpressionAtom(SQLStatementParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionAtom(SQLStatementParser.MathExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionAtom(SQLStatementParser.MathExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpressionAtom(SQLStatementParser.IntervalExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpressionAtom(SQLStatementParser.IntervalExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpessionAtom(SQLStatementParser.ExistsExpessionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpessionAtom(SQLStatementParser.ExistsExpessionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionAtom(SQLStatementParser.ConstantExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionAtom(SQLStatementParser.ConstantExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpressionAtom(SQLStatementParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpressionAtom(SQLStatementParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionAtom(SQLStatementParser.BinaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionAtom(SQLStatementParser.BinaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnNameExpressionAtom(SQLStatementParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnNameExpressionAtom(SQLStatementParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBitExpressionAtom(SQLStatementParser.BitExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link SQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBitExpressionAtom(SQLStatementParser.BitExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(SQLStatementParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(SQLStatementParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(SQLStatementParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(SQLStatementParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(SQLStatementParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(SQLStatementParser.BitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(SQLStatementParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(SQLStatementParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void enterCharsetNameBase(SQLStatementParser.CharsetNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void exitCharsetNameBase(SQLStatementParser.CharsetNameBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevelBase(SQLStatementParser.TransactionLevelBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevelBase(SQLStatementParser.TransactionLevelBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegesBase(SQLStatementParser.PrivilegesBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegesBase(SQLStatementParser.PrivilegesBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterIntervalTypeBase(SQLStatementParser.IntervalTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitIntervalTypeBase(SQLStatementParser.IntervalTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeBase(SQLStatementParser.DataTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeBase(SQLStatementParser.DataTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsCanBeId(SQLStatementParser.KeywordsCanBeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsCanBeId(SQLStatementParser.KeywordsCanBeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameBase(SQLStatementParser.FunctionNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameBase(SQLStatementParser.FunctionNameBaseContext ctx);
}