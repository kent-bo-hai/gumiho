// Generated from /Users/kent/IdeaProjects/github/gumiho/gumiho/src/main/resources/grammars/dialect/mysql/MySQLSQLStatementParser.g4 by ANTLR 4.7
package com.kent.gumiho.sql.dialect.mysql.parser;



import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySQLSQLStatementParser}.
 */
public interface MySQLSQLStatementParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#parse}.
     *
     * @param ctx the parse tree
     */
    void enterParse(MySQLSQLStatementParser.ParseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#parse}.
     *
     * @param ctx the parse tree
     */
    void exitParse(MySQLSQLStatementParser.ParseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#sqlStatements}.
     *
     * @param ctx the parse tree
     */
    void enterSqlStatements(MySQLSQLStatementParser.SqlStatementsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#sqlStatements}.
     *
     * @param ctx the parse tree
     */
    void exitSqlStatements(MySQLSQLStatementParser.SqlStatementsContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#sqlStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSqlStatement(MySQLSQLStatementParser.SqlStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#sqlStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSqlStatement(MySQLSQLStatementParser.SqlStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#emptyStatement}.
     *
     * @param ctx the parse tree
     */
    void enterEmptyStatement(MySQLSQLStatementParser.EmptyStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#emptyStatement}.
     *
     * @param ctx the parse tree
     */
    void exitEmptyStatement(MySQLSQLStatementParser.EmptyStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#ddlStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDdlStatement(MySQLSQLStatementParser.DdlStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#ddlStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDdlStatement(MySQLSQLStatementParser.DdlStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dmlStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDmlStatement(MySQLSQLStatementParser.DmlStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dmlStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDmlStatement(MySQLSQLStatementParser.DmlStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#transactionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterTransactionStatement(MySQLSQLStatementParser.TransactionStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#transactionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitTransactionStatement(MySQLSQLStatementParser.TransactionStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#replicationStatement}.
     *
     * @param ctx the parse tree
     */
    void enterReplicationStatement(MySQLSQLStatementParser.ReplicationStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#replicationStatement}.
     *
     * @param ctx the parse tree
     */
    void exitReplicationStatement(MySQLSQLStatementParser.ReplicationStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#preparedStatement}.
     *
     * @param ctx the parse tree
     */
    void enterPreparedStatement(MySQLSQLStatementParser.PreparedStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#preparedStatement}.
     *
     * @param ctx the parse tree
     */
    void exitPreparedStatement(MySQLSQLStatementParser.PreparedStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#compoundStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCompoundStatement(MySQLSQLStatementParser.CompoundStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#compoundStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCompoundStatement(MySQLSQLStatementParser.CompoundStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#administrationStatement}.
     *
     * @param ctx the parse tree
     */
    void enterAdministrationStatement(MySQLSQLStatementParser.AdministrationStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#administrationStatement}.
     *
     * @param ctx the parse tree
     */
    void exitAdministrationStatement(MySQLSQLStatementParser.AdministrationStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#utilityStatement}.
     *
     * @param ctx the parse tree
     */
    void enterUtilityStatement(MySQLSQLStatementParser.UtilityStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#utilityStatement}.
     *
     * @param ctx the parse tree
     */
    void exitUtilityStatement(MySQLSQLStatementParser.UtilityStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createDatabase}.
     *
     * @param ctx the parse tree
     */
    void enterCreateDatabase(MySQLSQLStatementParser.CreateDatabaseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createDatabase}.
     *
     * @param ctx the parse tree
     */
    void exitCreateDatabase(MySQLSQLStatementParser.CreateDatabaseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createEvent}.
     *
     * @param ctx the parse tree
     */
    void enterCreateEvent(MySQLSQLStatementParser.CreateEventContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createEvent}.
     *
     * @param ctx the parse tree
     */
    void exitCreateEvent(MySQLSQLStatementParser.CreateEventContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createIndex}.
     *
     * @param ctx the parse tree
     */
    void enterCreateIndex(MySQLSQLStatementParser.CreateIndexContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createIndex}.
     *
     * @param ctx the parse tree
     */
    void exitCreateIndex(MySQLSQLStatementParser.CreateIndexContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createLogfileGroup}.
     *
     * @param ctx the parse tree
     */
    void enterCreateLogfileGroup(MySQLSQLStatementParser.CreateLogfileGroupContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createLogfileGroup}.
     *
     * @param ctx the parse tree
     */
    void exitCreateLogfileGroup(MySQLSQLStatementParser.CreateLogfileGroupContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createProcedure}.
     *
     * @param ctx the parse tree
     */
    void enterCreateProcedure(MySQLSQLStatementParser.CreateProcedureContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createProcedure}.
     *
     * @param ctx the parse tree
     */
    void exitCreateProcedure(MySQLSQLStatementParser.CreateProcedureContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createFunction}.
     *
     * @param ctx the parse tree
     */
    void enterCreateFunction(MySQLSQLStatementParser.CreateFunctionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createFunction}.
     *
     * @param ctx the parse tree
     */
    void exitCreateFunction(MySQLSQLStatementParser.CreateFunctionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createServer}.
     *
     * @param ctx the parse tree
     */
    void enterCreateServer(MySQLSQLStatementParser.CreateServerContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createServer}.
     *
     * @param ctx the parse tree
     */
    void exitCreateServer(MySQLSQLStatementParser.CreateServerContext ctx);

    /**
     * Enter a parse tree produced by the {@code copyCreateTable}
     * labeled alternative in {@link MySQLSQLStatementParser#createTable}.
     *
     * @param ctx the parse tree
     */
    void enterCopyCreateTable(MySQLSQLStatementParser.CopyCreateTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code copyCreateTable}
     * labeled alternative in {@link MySQLSQLStatementParser#createTable}.
     *
     * @param ctx the parse tree
     */
    void exitCopyCreateTable(MySQLSQLStatementParser.CopyCreateTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code queryCreateTable}
     * labeled alternative in {@link MySQLSQLStatementParser#createTable}.
     *
     * @param ctx the parse tree
     */
    void enterQueryCreateTable(MySQLSQLStatementParser.QueryCreateTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code queryCreateTable}
     * labeled alternative in {@link MySQLSQLStatementParser#createTable}.
     *
     * @param ctx the parse tree
     */
    void exitQueryCreateTable(MySQLSQLStatementParser.QueryCreateTableContext ctx);

    /**
     * Enter a parse tree produced by the {@code columnCreateTable}
     * labeled alternative in {@link MySQLSQLStatementParser#createTable}.
     *
     * @param ctx the parse tree
     */
    void enterColumnCreateTable(MySQLSQLStatementParser.ColumnCreateTableContext ctx);

    /**
     * Exit a parse tree produced by the {@code columnCreateTable}
     * labeled alternative in {@link MySQLSQLStatementParser#createTable}.
     *
     * @param ctx the parse tree
     */
    void exitColumnCreateTable(MySQLSQLStatementParser.ColumnCreateTableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createTablespaceInnodb}.
     *
     * @param ctx the parse tree
     */
    void enterCreateTablespaceInnodb(MySQLSQLStatementParser.CreateTablespaceInnodbContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createTablespaceInnodb}.
     *
     * @param ctx the parse tree
     */
    void exitCreateTablespaceInnodb(MySQLSQLStatementParser.CreateTablespaceInnodbContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createTablespaceNdb}.
     *
     * @param ctx the parse tree
     */
    void enterCreateTablespaceNdb(MySQLSQLStatementParser.CreateTablespaceNdbContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createTablespaceNdb}.
     *
     * @param ctx the parse tree
     */
    void exitCreateTablespaceNdb(MySQLSQLStatementParser.CreateTablespaceNdbContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createTrigger}.
     *
     * @param ctx the parse tree
     */
    void enterCreateTrigger(MySQLSQLStatementParser.CreateTriggerContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createTrigger}.
     *
     * @param ctx the parse tree
     */
    void exitCreateTrigger(MySQLSQLStatementParser.CreateTriggerContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createView}.
     *
     * @param ctx the parse tree
     */
    void enterCreateView(MySQLSQLStatementParser.CreateViewContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createView}.
     *
     * @param ctx the parse tree
     */
    void exitCreateView(MySQLSQLStatementParser.CreateViewContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createDatabaseOption}.
     *
     * @param ctx the parse tree
     */
    void enterCreateDatabaseOption(MySQLSQLStatementParser.CreateDatabaseOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createDatabaseOption}.
     *
     * @param ctx the parse tree
     */
    void exitCreateDatabaseOption(MySQLSQLStatementParser.CreateDatabaseOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#ownerStatement}.
     *
     * @param ctx the parse tree
     */
    void enterOwnerStatement(MySQLSQLStatementParser.OwnerStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#ownerStatement}.
     *
     * @param ctx the parse tree
     */
    void exitOwnerStatement(MySQLSQLStatementParser.OwnerStatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code preciseSchedule}
     * labeled alternative in {@link MySQLSQLStatementParser#scheduleExpression}.
     *
     * @param ctx the parse tree
     */
    void enterPreciseSchedule(MySQLSQLStatementParser.PreciseScheduleContext ctx);

    /**
     * Exit a parse tree produced by the {@code preciseSchedule}
     * labeled alternative in {@link MySQLSQLStatementParser#scheduleExpression}.
     *
     * @param ctx the parse tree
     */
    void exitPreciseSchedule(MySQLSQLStatementParser.PreciseScheduleContext ctx);

    /**
     * Enter a parse tree produced by the {@code intervalSchedule}
     * labeled alternative in {@link MySQLSQLStatementParser#scheduleExpression}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalSchedule(MySQLSQLStatementParser.IntervalScheduleContext ctx);

    /**
     * Exit a parse tree produced by the {@code intervalSchedule}
     * labeled alternative in {@link MySQLSQLStatementParser#scheduleExpression}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalSchedule(MySQLSQLStatementParser.IntervalScheduleContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#timestampValue}.
     *
     * @param ctx the parse tree
     */
    void enterTimestampValue(MySQLSQLStatementParser.TimestampValueContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#timestampValue}.
     *
     * @param ctx the parse tree
     */
    void exitTimestampValue(MySQLSQLStatementParser.TimestampValueContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#intervalExpr}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalExpr(MySQLSQLStatementParser.IntervalExprContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#intervalExpr}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalExpr(MySQLSQLStatementParser.IntervalExprContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#intervalType}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalType(MySQLSQLStatementParser.IntervalTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#intervalType}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalType(MySQLSQLStatementParser.IntervalTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#enableType}.
     *
     * @param ctx the parse tree
     */
    void enterEnableType(MySQLSQLStatementParser.EnableTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#enableType}.
     *
     * @param ctx the parse tree
     */
    void exitEnableType(MySQLSQLStatementParser.EnableTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#indexType}.
     *
     * @param ctx the parse tree
     */
    void enterIndexType(MySQLSQLStatementParser.IndexTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#indexType}.
     *
     * @param ctx the parse tree
     */
    void exitIndexType(MySQLSQLStatementParser.IndexTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#indexOption}.
     *
     * @param ctx the parse tree
     */
    void enterIndexOption(MySQLSQLStatementParser.IndexOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#indexOption}.
     *
     * @param ctx the parse tree
     */
    void exitIndexOption(MySQLSQLStatementParser.IndexOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#procedureParameter}.
     *
     * @param ctx the parse tree
     */
    void enterProcedureParameter(MySQLSQLStatementParser.ProcedureParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#procedureParameter}.
     *
     * @param ctx the parse tree
     */
    void exitProcedureParameter(MySQLSQLStatementParser.ProcedureParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#functionParameter}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionParameter(MySQLSQLStatementParser.FunctionParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#functionParameter}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionParameter(MySQLSQLStatementParser.FunctionParameterContext ctx);

    /**
     * Enter a parse tree produced by the {@code routineComment}
     * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
     *
     * @param ctx the parse tree
     */
    void enterRoutineComment(MySQLSQLStatementParser.RoutineCommentContext ctx);

    /**
     * Exit a parse tree produced by the {@code routineComment}
     * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
     *
     * @param ctx the parse tree
     */
    void exitRoutineComment(MySQLSQLStatementParser.RoutineCommentContext ctx);

    /**
     * Enter a parse tree produced by the {@code routineLanguage}
     * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
     *
     * @param ctx the parse tree
     */
    void enterRoutineLanguage(MySQLSQLStatementParser.RoutineLanguageContext ctx);

    /**
     * Exit a parse tree produced by the {@code routineLanguage}
     * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
     *
     * @param ctx the parse tree
     */
    void exitRoutineLanguage(MySQLSQLStatementParser.RoutineLanguageContext ctx);

    /**
     * Enter a parse tree produced by the {@code routineBehavior}
     * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
     *
     * @param ctx the parse tree
     */
    void enterRoutineBehavior(MySQLSQLStatementParser.RoutineBehaviorContext ctx);

    /**
     * Exit a parse tree produced by the {@code routineBehavior}
     * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
     *
     * @param ctx the parse tree
     */
    void exitRoutineBehavior(MySQLSQLStatementParser.RoutineBehaviorContext ctx);

    /**
     * Enter a parse tree produced by the {@code routineData}
     * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
     *
     * @param ctx the parse tree
     */
    void enterRoutineData(MySQLSQLStatementParser.RoutineDataContext ctx);

    /**
     * Exit a parse tree produced by the {@code routineData}
     * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
     *
     * @param ctx the parse tree
     */
    void exitRoutineData(MySQLSQLStatementParser.RoutineDataContext ctx);

    /**
     * Enter a parse tree produced by the {@code routineSecurity}
     * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
     *
     * @param ctx the parse tree
     */
    void enterRoutineSecurity(MySQLSQLStatementParser.RoutineSecurityContext ctx);

    /**
     * Exit a parse tree produced by the {@code routineSecurity}
     * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
     *
     * @param ctx the parse tree
     */
    void exitRoutineSecurity(MySQLSQLStatementParser.RoutineSecurityContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#serverOption}.
     *
     * @param ctx the parse tree
     */
    void enterServerOption(MySQLSQLStatementParser.ServerOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#serverOption}.
     *
     * @param ctx the parse tree
     */
    void exitServerOption(MySQLSQLStatementParser.ServerOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createDefinitions}.
     *
     * @param ctx the parse tree
     */
    void enterCreateDefinitions(MySQLSQLStatementParser.CreateDefinitionsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createDefinitions}.
     *
     * @param ctx the parse tree
     */
    void exitCreateDefinitions(MySQLSQLStatementParser.CreateDefinitionsContext ctx);

    /**
     * Enter a parse tree produced by the {@code columnDeclaration}
     * labeled alternative in {@link MySQLSQLStatementParser#createDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterColumnDeclaration(MySQLSQLStatementParser.ColumnDeclarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code columnDeclaration}
     * labeled alternative in {@link MySQLSQLStatementParser#createDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitColumnDeclaration(MySQLSQLStatementParser.ColumnDeclarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code constraintDeclaration}
     * labeled alternative in {@link MySQLSQLStatementParser#createDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterConstraintDeclaration(MySQLSQLStatementParser.ConstraintDeclarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code constraintDeclaration}
     * labeled alternative in {@link MySQLSQLStatementParser#createDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitConstraintDeclaration(MySQLSQLStatementParser.ConstraintDeclarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code indexDeclaration}
     * labeled alternative in {@link MySQLSQLStatementParser#createDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterIndexDeclaration(MySQLSQLStatementParser.IndexDeclarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code indexDeclaration}
     * labeled alternative in {@link MySQLSQLStatementParser#createDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitIndexDeclaration(MySQLSQLStatementParser.IndexDeclarationContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#columnDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterColumnDefinition(MySQLSQLStatementParser.ColumnDefinitionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#columnDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitColumnDefinition(MySQLSQLStatementParser.ColumnDefinitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code nullColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterNullColumnConstraint(MySQLSQLStatementParser.NullColumnConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code nullColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitNullColumnConstraint(MySQLSQLStatementParser.NullColumnConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code defaultColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterDefaultColumnConstraint(MySQLSQLStatementParser.DefaultColumnConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code defaultColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitDefaultColumnConstraint(MySQLSQLStatementParser.DefaultColumnConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code autoIncrementColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterAutoIncrementColumnConstraint(MySQLSQLStatementParser.AutoIncrementColumnConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code autoIncrementColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitAutoIncrementColumnConstraint(MySQLSQLStatementParser.AutoIncrementColumnConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code primaryKeyColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryKeyColumnConstraint(MySQLSQLStatementParser.PrimaryKeyColumnConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code primaryKeyColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryKeyColumnConstraint(MySQLSQLStatementParser.PrimaryKeyColumnConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code uniqueKeyColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterUniqueKeyColumnConstraint(MySQLSQLStatementParser.UniqueKeyColumnConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code uniqueKeyColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitUniqueKeyColumnConstraint(MySQLSQLStatementParser.UniqueKeyColumnConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code commentColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterCommentColumnConstraint(MySQLSQLStatementParser.CommentColumnConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code commentColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitCommentColumnConstraint(MySQLSQLStatementParser.CommentColumnConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code formatColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterFormatColumnConstraint(MySQLSQLStatementParser.FormatColumnConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code formatColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitFormatColumnConstraint(MySQLSQLStatementParser.FormatColumnConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code storageColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterStorageColumnConstraint(MySQLSQLStatementParser.StorageColumnConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code storageColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitStorageColumnConstraint(MySQLSQLStatementParser.StorageColumnConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code referenceColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterReferenceColumnConstraint(MySQLSQLStatementParser.ReferenceColumnConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code referenceColumnConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitReferenceColumnConstraint(MySQLSQLStatementParser.ReferenceColumnConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code primaryKeyTableConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterPrimaryKeyTableConstraint(MySQLSQLStatementParser.PrimaryKeyTableConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code primaryKeyTableConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitPrimaryKeyTableConstraint(MySQLSQLStatementParser.PrimaryKeyTableConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code uniqueKeyTableConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterUniqueKeyTableConstraint(MySQLSQLStatementParser.UniqueKeyTableConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code uniqueKeyTableConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitUniqueKeyTableConstraint(MySQLSQLStatementParser.UniqueKeyTableConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code foreignKeyTableConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterForeignKeyTableConstraint(MySQLSQLStatementParser.ForeignKeyTableConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code foreignKeyTableConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitForeignKeyTableConstraint(MySQLSQLStatementParser.ForeignKeyTableConstraintContext ctx);

    /**
     * Enter a parse tree produced by the {@code checkTableConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
     *
     * @param ctx the parse tree
     */
    void enterCheckTableConstraint(MySQLSQLStatementParser.CheckTableConstraintContext ctx);

    /**
     * Exit a parse tree produced by the {@code checkTableConstraint}
     * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
     *
     * @param ctx the parse tree
     */
    void exitCheckTableConstraint(MySQLSQLStatementParser.CheckTableConstraintContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#referenceDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterReferenceDefinition(MySQLSQLStatementParser.ReferenceDefinitionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#referenceDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitReferenceDefinition(MySQLSQLStatementParser.ReferenceDefinitionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#referenceAction}.
     *
     * @param ctx the parse tree
     */
    void enterReferenceAction(MySQLSQLStatementParser.ReferenceActionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#referenceAction}.
     *
     * @param ctx the parse tree
     */
    void exitReferenceAction(MySQLSQLStatementParser.ReferenceActionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#referenceControlType}.
     *
     * @param ctx the parse tree
     */
    void enterReferenceControlType(MySQLSQLStatementParser.ReferenceControlTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#referenceControlType}.
     *
     * @param ctx the parse tree
     */
    void exitReferenceControlType(MySQLSQLStatementParser.ReferenceControlTypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code simpleIndexDeclaration}
     * labeled alternative in {@link MySQLSQLStatementParser#indexColumnDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleIndexDeclaration(MySQLSQLStatementParser.SimpleIndexDeclarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code simpleIndexDeclaration}
     * labeled alternative in {@link MySQLSQLStatementParser#indexColumnDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleIndexDeclaration(MySQLSQLStatementParser.SimpleIndexDeclarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code specialIndexDeclaration}
     * labeled alternative in {@link MySQLSQLStatementParser#indexColumnDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterSpecialIndexDeclaration(MySQLSQLStatementParser.SpecialIndexDeclarationContext ctx);

    /**
     * Exit a parse tree produced by the {@code specialIndexDeclaration}
     * labeled alternative in {@link MySQLSQLStatementParser#indexColumnDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitSpecialIndexDeclaration(MySQLSQLStatementParser.SpecialIndexDeclarationContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionEngine}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionEngine(MySQLSQLStatementParser.TableOptionEngineContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionEngine}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionEngine(MySQLSQLStatementParser.TableOptionEngineContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionAutoIncrement}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionAutoIncrement(MySQLSQLStatementParser.TableOptionAutoIncrementContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionAutoIncrement}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionAutoIncrement(MySQLSQLStatementParser.TableOptionAutoIncrementContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionAverage}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionAverage(MySQLSQLStatementParser.TableOptionAverageContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionAverage}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionAverage(MySQLSQLStatementParser.TableOptionAverageContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionCharset}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionCharset(MySQLSQLStatementParser.TableOptionCharsetContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionCharset}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionCharset(MySQLSQLStatementParser.TableOptionCharsetContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionChecksum}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionChecksum(MySQLSQLStatementParser.TableOptionChecksumContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionChecksum}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionChecksum(MySQLSQLStatementParser.TableOptionChecksumContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionCollate}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionCollate(MySQLSQLStatementParser.TableOptionCollateContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionCollate}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionCollate(MySQLSQLStatementParser.TableOptionCollateContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionComment}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionComment(MySQLSQLStatementParser.TableOptionCommentContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionComment}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionComment(MySQLSQLStatementParser.TableOptionCommentContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionCompression}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionCompression(MySQLSQLStatementParser.TableOptionCompressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionCompression}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionCompression(MySQLSQLStatementParser.TableOptionCompressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionConnection}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionConnection(MySQLSQLStatementParser.TableOptionConnectionContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionConnection}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionConnection(MySQLSQLStatementParser.TableOptionConnectionContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionDataDirectory}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionDataDirectory(MySQLSQLStatementParser.TableOptionDataDirectoryContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionDataDirectory}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionDataDirectory(MySQLSQLStatementParser.TableOptionDataDirectoryContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionDelay}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionDelay(MySQLSQLStatementParser.TableOptionDelayContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionDelay}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionDelay(MySQLSQLStatementParser.TableOptionDelayContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionEncryption}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionEncryption(MySQLSQLStatementParser.TableOptionEncryptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionEncryption}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionEncryption(MySQLSQLStatementParser.TableOptionEncryptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionIndexDirectory}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionIndexDirectory(MySQLSQLStatementParser.TableOptionIndexDirectoryContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionIndexDirectory}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionIndexDirectory(MySQLSQLStatementParser.TableOptionIndexDirectoryContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionInsertMethod}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionInsertMethod(MySQLSQLStatementParser.TableOptionInsertMethodContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionInsertMethod}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionInsertMethod(MySQLSQLStatementParser.TableOptionInsertMethodContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionKeyBlockSize}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionKeyBlockSize(MySQLSQLStatementParser.TableOptionKeyBlockSizeContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionKeyBlockSize}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionKeyBlockSize(MySQLSQLStatementParser.TableOptionKeyBlockSizeContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionMaxRows}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionMaxRows(MySQLSQLStatementParser.TableOptionMaxRowsContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionMaxRows}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionMaxRows(MySQLSQLStatementParser.TableOptionMaxRowsContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionMinRows}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionMinRows(MySQLSQLStatementParser.TableOptionMinRowsContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionMinRows}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionMinRows(MySQLSQLStatementParser.TableOptionMinRowsContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionPackKeys}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionPackKeys(MySQLSQLStatementParser.TableOptionPackKeysContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionPackKeys}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionPackKeys(MySQLSQLStatementParser.TableOptionPackKeysContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionPassword}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionPassword(MySQLSQLStatementParser.TableOptionPasswordContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionPassword}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionPassword(MySQLSQLStatementParser.TableOptionPasswordContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionRowFormat}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionRowFormat(MySQLSQLStatementParser.TableOptionRowFormatContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionRowFormat}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionRowFormat(MySQLSQLStatementParser.TableOptionRowFormatContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionRecalculation}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionRecalculation(MySQLSQLStatementParser.TableOptionRecalculationContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionRecalculation}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionRecalculation(MySQLSQLStatementParser.TableOptionRecalculationContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionPersistent}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionPersistent(MySQLSQLStatementParser.TableOptionPersistentContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionPersistent}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionPersistent(MySQLSQLStatementParser.TableOptionPersistentContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionSamplePage}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionSamplePage(MySQLSQLStatementParser.TableOptionSamplePageContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionSamplePage}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionSamplePage(MySQLSQLStatementParser.TableOptionSamplePageContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionTablespace}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionTablespace(MySQLSQLStatementParser.TableOptionTablespaceContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionTablespace}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionTablespace(MySQLSQLStatementParser.TableOptionTablespaceContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableOptionUnion}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableOptionUnion(MySQLSQLStatementParser.TableOptionUnionContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableOptionUnion}
     * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableOptionUnion(MySQLSQLStatementParser.TableOptionUnionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#tablespaceStorage}.
     *
     * @param ctx the parse tree
     */
    void enterTablespaceStorage(MySQLSQLStatementParser.TablespaceStorageContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#tablespaceStorage}.
     *
     * @param ctx the parse tree
     */
    void exitTablespaceStorage(MySQLSQLStatementParser.TablespaceStorageContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#partitionDefinitions}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionDefinitions(MySQLSQLStatementParser.PartitionDefinitionsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#partitionDefinitions}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionDefinitions(MySQLSQLStatementParser.PartitionDefinitionsContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionFunctionHash}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionFunctionHash(MySQLSQLStatementParser.PartitionFunctionHashContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionFunctionHash}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionFunctionHash(MySQLSQLStatementParser.PartitionFunctionHashContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionFunctionKey}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionFunctionKey(MySQLSQLStatementParser.PartitionFunctionKeyContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionFunctionKey}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionFunctionKey(MySQLSQLStatementParser.PartitionFunctionKeyContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionFunctionRange}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionFunctionRange(MySQLSQLStatementParser.PartitionFunctionRangeContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionFunctionRange}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionFunctionRange(MySQLSQLStatementParser.PartitionFunctionRangeContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionFunctionList}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionFunctionList(MySQLSQLStatementParser.PartitionFunctionListContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionFunctionList}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionFunctionList(MySQLSQLStatementParser.PartitionFunctionListContext ctx);

    /**
     * Enter a parse tree produced by the {@code subPartitionFunctionHash}
     * labeled alternative in {@link MySQLSQLStatementParser#subpartitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterSubPartitionFunctionHash(MySQLSQLStatementParser.SubPartitionFunctionHashContext ctx);

    /**
     * Exit a parse tree produced by the {@code subPartitionFunctionHash}
     * labeled alternative in {@link MySQLSQLStatementParser#subpartitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitSubPartitionFunctionHash(MySQLSQLStatementParser.SubPartitionFunctionHashContext ctx);

    /**
     * Enter a parse tree produced by the {@code subPartitionFunctionKey}
     * labeled alternative in {@link MySQLSQLStatementParser#subpartitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterSubPartitionFunctionKey(MySQLSQLStatementParser.SubPartitionFunctionKeyContext ctx);

    /**
     * Exit a parse tree produced by the {@code subPartitionFunctionKey}
     * labeled alternative in {@link MySQLSQLStatementParser#subpartitionFunctionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitSubPartitionFunctionKey(MySQLSQLStatementParser.SubPartitionFunctionKeyContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionComparision}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionComparision(MySQLSQLStatementParser.PartitionComparisionContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionComparision}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionComparision(MySQLSQLStatementParser.PartitionComparisionContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionListAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionListAtom(MySQLSQLStatementParser.PartitionListAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionListAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionListAtom(MySQLSQLStatementParser.PartitionListAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionListVector}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionListVector(MySQLSQLStatementParser.PartitionListVectorContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionListVector}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionListVector(MySQLSQLStatementParser.PartitionListVectorContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionSimple}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionSimple(MySQLSQLStatementParser.PartitionSimpleContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionSimple}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionSimple(MySQLSQLStatementParser.PartitionSimpleContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#partitionDefinerAtom}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionDefinerAtom(MySQLSQLStatementParser.PartitionDefinerAtomContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#partitionDefinerAtom}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionDefinerAtom(MySQLSQLStatementParser.PartitionDefinerAtomContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#partitionDefinerVector}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionDefinerVector(MySQLSQLStatementParser.PartitionDefinerVectorContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#partitionDefinerVector}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionDefinerVector(MySQLSQLStatementParser.PartitionDefinerVectorContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#subpartitionDefinition}.
     *
     * @param ctx the parse tree
     */
    void enterSubpartitionDefinition(MySQLSQLStatementParser.SubpartitionDefinitionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#subpartitionDefinition}.
     *
     * @param ctx the parse tree
     */
    void exitSubpartitionDefinition(MySQLSQLStatementParser.SubpartitionDefinitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionOptionEngine}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionOptionEngine(MySQLSQLStatementParser.PartitionOptionEngineContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionOptionEngine}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionOptionEngine(MySQLSQLStatementParser.PartitionOptionEngineContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionOptionComment}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionOptionComment(MySQLSQLStatementParser.PartitionOptionCommentContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionOptionComment}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionOptionComment(MySQLSQLStatementParser.PartitionOptionCommentContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionOptionDataDirectory}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionOptionDataDirectory(MySQLSQLStatementParser.PartitionOptionDataDirectoryContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionOptionDataDirectory}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionOptionDataDirectory(MySQLSQLStatementParser.PartitionOptionDataDirectoryContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionOptionIndexDirectory}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionOptionIndexDirectory(MySQLSQLStatementParser.PartitionOptionIndexDirectoryContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionOptionIndexDirectory}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionOptionIndexDirectory(MySQLSQLStatementParser.PartitionOptionIndexDirectoryContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionOptionMaxRows}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionOptionMaxRows(MySQLSQLStatementParser.PartitionOptionMaxRowsContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionOptionMaxRows}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionOptionMaxRows(MySQLSQLStatementParser.PartitionOptionMaxRowsContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionOptionMinRows}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionOptionMinRows(MySQLSQLStatementParser.PartitionOptionMinRowsContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionOptionMinRows}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionOptionMinRows(MySQLSQLStatementParser.PartitionOptionMinRowsContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionOptionTablespace}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionOptionTablespace(MySQLSQLStatementParser.PartitionOptionTablespaceContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionOptionTablespace}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionOptionTablespace(MySQLSQLStatementParser.PartitionOptionTablespaceContext ctx);

    /**
     * Enter a parse tree produced by the {@code partitionOptionNodeGroup}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void enterPartitionOptionNodeGroup(MySQLSQLStatementParser.PartitionOptionNodeGroupContext ctx);

    /**
     * Exit a parse tree produced by the {@code partitionOptionNodeGroup}
     * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
     *
     * @param ctx the parse tree
     */
    void exitPartitionOptionNodeGroup(MySQLSQLStatementParser.PartitionOptionNodeGroupContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterSimpleDatabase}
     * labeled alternative in {@link MySQLSQLStatementParser#alterDatabase}.
     *
     * @param ctx the parse tree
     */
    void enterAlterSimpleDatabase(MySQLSQLStatementParser.AlterSimpleDatabaseContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterSimpleDatabase}
     * labeled alternative in {@link MySQLSQLStatementParser#alterDatabase}.
     *
     * @param ctx the parse tree
     */
    void exitAlterSimpleDatabase(MySQLSQLStatementParser.AlterSimpleDatabaseContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterUpgradeName}
     * labeled alternative in {@link MySQLSQLStatementParser#alterDatabase}.
     *
     * @param ctx the parse tree
     */
    void enterAlterUpgradeName(MySQLSQLStatementParser.AlterUpgradeNameContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterUpgradeName}
     * labeled alternative in {@link MySQLSQLStatementParser#alterDatabase}.
     *
     * @param ctx the parse tree
     */
    void exitAlterUpgradeName(MySQLSQLStatementParser.AlterUpgradeNameContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#alterEvent}.
     *
     * @param ctx the parse tree
     */
    void enterAlterEvent(MySQLSQLStatementParser.AlterEventContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#alterEvent}.
     *
     * @param ctx the parse tree
     */
    void exitAlterEvent(MySQLSQLStatementParser.AlterEventContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#alterFunction}.
     *
     * @param ctx the parse tree
     */
    void enterAlterFunction(MySQLSQLStatementParser.AlterFunctionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#alterFunction}.
     *
     * @param ctx the parse tree
     */
    void exitAlterFunction(MySQLSQLStatementParser.AlterFunctionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#alterInstance}.
     *
     * @param ctx the parse tree
     */
    void enterAlterInstance(MySQLSQLStatementParser.AlterInstanceContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#alterInstance}.
     *
     * @param ctx the parse tree
     */
    void exitAlterInstance(MySQLSQLStatementParser.AlterInstanceContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#alterLogfileGroup}.
     *
     * @param ctx the parse tree
     */
    void enterAlterLogfileGroup(MySQLSQLStatementParser.AlterLogfileGroupContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#alterLogfileGroup}.
     *
     * @param ctx the parse tree
     */
    void exitAlterLogfileGroup(MySQLSQLStatementParser.AlterLogfileGroupContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#alterProcedure}.
     *
     * @param ctx the parse tree
     */
    void enterAlterProcedure(MySQLSQLStatementParser.AlterProcedureContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#alterProcedure}.
     *
     * @param ctx the parse tree
     */
    void exitAlterProcedure(MySQLSQLStatementParser.AlterProcedureContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#alterServer}.
     *
     * @param ctx the parse tree
     */
    void enterAlterServer(MySQLSQLStatementParser.AlterServerContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#alterServer}.
     *
     * @param ctx the parse tree
     */
    void exitAlterServer(MySQLSQLStatementParser.AlterServerContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#alterTable}.
     *
     * @param ctx the parse tree
     */
    void enterAlterTable(MySQLSQLStatementParser.AlterTableContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#alterTable}.
     *
     * @param ctx the parse tree
     */
    void exitAlterTable(MySQLSQLStatementParser.AlterTableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#alterTablespace}.
     *
     * @param ctx the parse tree
     */
    void enterAlterTablespace(MySQLSQLStatementParser.AlterTablespaceContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#alterTablespace}.
     *
     * @param ctx the parse tree
     */
    void exitAlterTablespace(MySQLSQLStatementParser.AlterTablespaceContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#alterView}.
     *
     * @param ctx the parse tree
     */
    void enterAlterView(MySQLSQLStatementParser.AlterViewContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#alterView}.
     *
     * @param ctx the parse tree
     */
    void exitAlterView(MySQLSQLStatementParser.AlterViewContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByTableOption}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByTableOption(MySQLSQLStatementParser.AlterByTableOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByTableOption}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByTableOption(MySQLSQLStatementParser.AlterByTableOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByAddColumn}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByAddColumn(MySQLSQLStatementParser.AlterByAddColumnContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByAddColumn}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByAddColumn(MySQLSQLStatementParser.AlterByAddColumnContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByAddColumns}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByAddColumns(MySQLSQLStatementParser.AlterByAddColumnsContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByAddColumns}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByAddColumns(MySQLSQLStatementParser.AlterByAddColumnsContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByAddIndex}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByAddIndex(MySQLSQLStatementParser.AlterByAddIndexContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByAddIndex}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByAddIndex(MySQLSQLStatementParser.AlterByAddIndexContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByAddPrimaryKey}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByAddPrimaryKey(MySQLSQLStatementParser.AlterByAddPrimaryKeyContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByAddPrimaryKey}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByAddPrimaryKey(MySQLSQLStatementParser.AlterByAddPrimaryKeyContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByAddUniqueKey}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByAddUniqueKey(MySQLSQLStatementParser.AlterByAddUniqueKeyContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByAddUniqueKey}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByAddUniqueKey(MySQLSQLStatementParser.AlterByAddUniqueKeyContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByAddSpecialIndex}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByAddSpecialIndex(MySQLSQLStatementParser.AlterByAddSpecialIndexContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByAddSpecialIndex}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByAddSpecialIndex(MySQLSQLStatementParser.AlterByAddSpecialIndexContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByAddForeignKey}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByAddForeignKey(MySQLSQLStatementParser.AlterByAddForeignKeyContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByAddForeignKey}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByAddForeignKey(MySQLSQLStatementParser.AlterByAddForeignKeyContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterBySetAlgorithm}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterBySetAlgorithm(MySQLSQLStatementParser.AlterBySetAlgorithmContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterBySetAlgorithm}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterBySetAlgorithm(MySQLSQLStatementParser.AlterBySetAlgorithmContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByChangeDefault}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByChangeDefault(MySQLSQLStatementParser.AlterByChangeDefaultContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByChangeDefault}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByChangeDefault(MySQLSQLStatementParser.AlterByChangeDefaultContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByChangeColumn}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByChangeColumn(MySQLSQLStatementParser.AlterByChangeColumnContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByChangeColumn}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByChangeColumn(MySQLSQLStatementParser.AlterByChangeColumnContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByLock}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByLock(MySQLSQLStatementParser.AlterByLockContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByLock}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByLock(MySQLSQLStatementParser.AlterByLockContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByModifyColumn}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByModifyColumn(MySQLSQLStatementParser.AlterByModifyColumnContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByModifyColumn}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByModifyColumn(MySQLSQLStatementParser.AlterByModifyColumnContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByDropColumn}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByDropColumn(MySQLSQLStatementParser.AlterByDropColumnContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByDropColumn}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByDropColumn(MySQLSQLStatementParser.AlterByDropColumnContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByDropPrimaryKey}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByDropPrimaryKey(MySQLSQLStatementParser.AlterByDropPrimaryKeyContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByDropPrimaryKey}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByDropPrimaryKey(MySQLSQLStatementParser.AlterByDropPrimaryKeyContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByDropIndex}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByDropIndex(MySQLSQLStatementParser.AlterByDropIndexContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByDropIndex}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByDropIndex(MySQLSQLStatementParser.AlterByDropIndexContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByDropForeignKey}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByDropForeignKey(MySQLSQLStatementParser.AlterByDropForeignKeyContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByDropForeignKey}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByDropForeignKey(MySQLSQLStatementParser.AlterByDropForeignKeyContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByDisableKeys}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByDisableKeys(MySQLSQLStatementParser.AlterByDisableKeysContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByDisableKeys}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByDisableKeys(MySQLSQLStatementParser.AlterByDisableKeysContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByEnableKeys}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByEnableKeys(MySQLSQLStatementParser.AlterByEnableKeysContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByEnableKeys}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByEnableKeys(MySQLSQLStatementParser.AlterByEnableKeysContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByRename}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByRename(MySQLSQLStatementParser.AlterByRenameContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByRename}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByRename(MySQLSQLStatementParser.AlterByRenameContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByOrder}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByOrder(MySQLSQLStatementParser.AlterByOrderContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByOrder}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByOrder(MySQLSQLStatementParser.AlterByOrderContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByConvertCharset}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByConvertCharset(MySQLSQLStatementParser.AlterByConvertCharsetContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByConvertCharset}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByConvertCharset(MySQLSQLStatementParser.AlterByConvertCharsetContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByDefaultCharset}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByDefaultCharset(MySQLSQLStatementParser.AlterByDefaultCharsetContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByDefaultCharset}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByDefaultCharset(MySQLSQLStatementParser.AlterByDefaultCharsetContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByDiscardTablespace}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByDiscardTablespace(MySQLSQLStatementParser.AlterByDiscardTablespaceContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByDiscardTablespace}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByDiscardTablespace(MySQLSQLStatementParser.AlterByDiscardTablespaceContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByImportTablespace}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByImportTablespace(MySQLSQLStatementParser.AlterByImportTablespaceContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByImportTablespace}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByImportTablespace(MySQLSQLStatementParser.AlterByImportTablespaceContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByForce}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByForce(MySQLSQLStatementParser.AlterByForceContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByForce}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByForce(MySQLSQLStatementParser.AlterByForceContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByValidate}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByValidate(MySQLSQLStatementParser.AlterByValidateContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByValidate}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByValidate(MySQLSQLStatementParser.AlterByValidateContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByAddPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByAddPartition(MySQLSQLStatementParser.AlterByAddPartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByAddPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByAddPartition(MySQLSQLStatementParser.AlterByAddPartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByDropPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByDropPartition(MySQLSQLStatementParser.AlterByDropPartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByDropPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByDropPartition(MySQLSQLStatementParser.AlterByDropPartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByDiscardPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByDiscardPartition(MySQLSQLStatementParser.AlterByDiscardPartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByDiscardPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByDiscardPartition(MySQLSQLStatementParser.AlterByDiscardPartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByImportPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByImportPartition(MySQLSQLStatementParser.AlterByImportPartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByImportPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByImportPartition(MySQLSQLStatementParser.AlterByImportPartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByTruncatePartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByTruncatePartition(MySQLSQLStatementParser.AlterByTruncatePartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByTruncatePartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByTruncatePartition(MySQLSQLStatementParser.AlterByTruncatePartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByCoalescePartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByCoalescePartition(MySQLSQLStatementParser.AlterByCoalescePartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByCoalescePartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByCoalescePartition(MySQLSQLStatementParser.AlterByCoalescePartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByReorganizePartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByReorganizePartition(MySQLSQLStatementParser.AlterByReorganizePartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByReorganizePartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByReorganizePartition(MySQLSQLStatementParser.AlterByReorganizePartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByExchangePartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByExchangePartition(MySQLSQLStatementParser.AlterByExchangePartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByExchangePartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByExchangePartition(MySQLSQLStatementParser.AlterByExchangePartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByAnalyzePartitiion}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByAnalyzePartitiion(MySQLSQLStatementParser.AlterByAnalyzePartitiionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByAnalyzePartitiion}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByAnalyzePartitiion(MySQLSQLStatementParser.AlterByAnalyzePartitiionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByCheckPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByCheckPartition(MySQLSQLStatementParser.AlterByCheckPartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByCheckPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByCheckPartition(MySQLSQLStatementParser.AlterByCheckPartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByOptimizePartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByOptimizePartition(MySQLSQLStatementParser.AlterByOptimizePartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByOptimizePartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByOptimizePartition(MySQLSQLStatementParser.AlterByOptimizePartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByRebuildPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByRebuildPartition(MySQLSQLStatementParser.AlterByRebuildPartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByRebuildPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByRebuildPartition(MySQLSQLStatementParser.AlterByRebuildPartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByRepairPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByRepairPartition(MySQLSQLStatementParser.AlterByRepairPartitionContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByRepairPartition}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByRepairPartition(MySQLSQLStatementParser.AlterByRepairPartitionContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByRemovePartitioning}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByRemovePartitioning(MySQLSQLStatementParser.AlterByRemovePartitioningContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByRemovePartitioning}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByRemovePartitioning(MySQLSQLStatementParser.AlterByRemovePartitioningContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterByUpgradePartitioning}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterAlterByUpgradePartitioning(MySQLSQLStatementParser.AlterByUpgradePartitioningContext ctx);

    /**
     * Exit a parse tree produced by the {@code alterByUpgradePartitioning}
     * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitAlterByUpgradePartitioning(MySQLSQLStatementParser.AlterByUpgradePartitioningContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropDatabase}.
     *
     * @param ctx the parse tree
     */
    void enterDropDatabase(MySQLSQLStatementParser.DropDatabaseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropDatabase}.
     *
     * @param ctx the parse tree
     */
    void exitDropDatabase(MySQLSQLStatementParser.DropDatabaseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropEvent}.
     *
     * @param ctx the parse tree
     */
    void enterDropEvent(MySQLSQLStatementParser.DropEventContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropEvent}.
     *
     * @param ctx the parse tree
     */
    void exitDropEvent(MySQLSQLStatementParser.DropEventContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropIndex}.
     *
     * @param ctx the parse tree
     */
    void enterDropIndex(MySQLSQLStatementParser.DropIndexContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropIndex}.
     *
     * @param ctx the parse tree
     */
    void exitDropIndex(MySQLSQLStatementParser.DropIndexContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropLogfileGroup}.
     *
     * @param ctx the parse tree
     */
    void enterDropLogfileGroup(MySQLSQLStatementParser.DropLogfileGroupContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropLogfileGroup}.
     *
     * @param ctx the parse tree
     */
    void exitDropLogfileGroup(MySQLSQLStatementParser.DropLogfileGroupContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropProcedure}.
     *
     * @param ctx the parse tree
     */
    void enterDropProcedure(MySQLSQLStatementParser.DropProcedureContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropProcedure}.
     *
     * @param ctx the parse tree
     */
    void exitDropProcedure(MySQLSQLStatementParser.DropProcedureContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropFunction}.
     *
     * @param ctx the parse tree
     */
    void enterDropFunction(MySQLSQLStatementParser.DropFunctionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropFunction}.
     *
     * @param ctx the parse tree
     */
    void exitDropFunction(MySQLSQLStatementParser.DropFunctionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropServer}.
     *
     * @param ctx the parse tree
     */
    void enterDropServer(MySQLSQLStatementParser.DropServerContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropServer}.
     *
     * @param ctx the parse tree
     */
    void exitDropServer(MySQLSQLStatementParser.DropServerContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropTable}.
     *
     * @param ctx the parse tree
     */
    void enterDropTable(MySQLSQLStatementParser.DropTableContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropTable}.
     *
     * @param ctx the parse tree
     */
    void exitDropTable(MySQLSQLStatementParser.DropTableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropTablespace}.
     *
     * @param ctx the parse tree
     */
    void enterDropTablespace(MySQLSQLStatementParser.DropTablespaceContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropTablespace}.
     *
     * @param ctx the parse tree
     */
    void exitDropTablespace(MySQLSQLStatementParser.DropTablespaceContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropTrigger}.
     *
     * @param ctx the parse tree
     */
    void enterDropTrigger(MySQLSQLStatementParser.DropTriggerContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropTrigger}.
     *
     * @param ctx the parse tree
     */
    void exitDropTrigger(MySQLSQLStatementParser.DropTriggerContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropView}.
     *
     * @param ctx the parse tree
     */
    void enterDropView(MySQLSQLStatementParser.DropViewContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropView}.
     *
     * @param ctx the parse tree
     */
    void exitDropView(MySQLSQLStatementParser.DropViewContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#renameTable}.
     *
     * @param ctx the parse tree
     */
    void enterRenameTable(MySQLSQLStatementParser.RenameTableContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#renameTable}.
     *
     * @param ctx the parse tree
     */
    void exitRenameTable(MySQLSQLStatementParser.RenameTableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#renameTableClause}.
     *
     * @param ctx the parse tree
     */
    void enterRenameTableClause(MySQLSQLStatementParser.RenameTableClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#renameTableClause}.
     *
     * @param ctx the parse tree
     */
    void exitRenameTableClause(MySQLSQLStatementParser.RenameTableClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#truncateTable}.
     *
     * @param ctx the parse tree
     */
    void enterTruncateTable(MySQLSQLStatementParser.TruncateTableContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#truncateTable}.
     *
     * @param ctx the parse tree
     */
    void exitTruncateTable(MySQLSQLStatementParser.TruncateTableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#callStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCallStatement(MySQLSQLStatementParser.CallStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#callStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCallStatement(MySQLSQLStatementParser.CallStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#deleteStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDeleteStatement(MySQLSQLStatementParser.DeleteStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#deleteStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDeleteStatement(MySQLSQLStatementParser.DeleteStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#doStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDoStatement(MySQLSQLStatementParser.DoStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#doStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDoStatement(MySQLSQLStatementParser.DoStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#handlerStatement}.
     *
     * @param ctx the parse tree
     */
    void enterHandlerStatement(MySQLSQLStatementParser.HandlerStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#handlerStatement}.
     *
     * @param ctx the parse tree
     */
    void exitHandlerStatement(MySQLSQLStatementParser.HandlerStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#insertStatement}.
     *
     * @param ctx the parse tree
     */
    void enterInsertStatement(MySQLSQLStatementParser.InsertStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#insertStatement}.
     *
     * @param ctx the parse tree
     */
    void exitInsertStatement(MySQLSQLStatementParser.InsertStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#loadDataStatement}.
     *
     * @param ctx the parse tree
     */
    void enterLoadDataStatement(MySQLSQLStatementParser.LoadDataStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#loadDataStatement}.
     *
     * @param ctx the parse tree
     */
    void exitLoadDataStatement(MySQLSQLStatementParser.LoadDataStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#loadXmlStatement}.
     *
     * @param ctx the parse tree
     */
    void enterLoadXmlStatement(MySQLSQLStatementParser.LoadXmlStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#loadXmlStatement}.
     *
     * @param ctx the parse tree
     */
    void exitLoadXmlStatement(MySQLSQLStatementParser.LoadXmlStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#replaceStatement}.
     *
     * @param ctx the parse tree
     */
    void enterReplaceStatement(MySQLSQLStatementParser.ReplaceStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#replaceStatement}.
     *
     * @param ctx the parse tree
     */
    void exitReplaceStatement(MySQLSQLStatementParser.ReplaceStatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code simpleSelect}
     * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleSelect(MySQLSQLStatementParser.SimpleSelectContext ctx);

    /**
     * Exit a parse tree produced by the {@code simpleSelect}
     * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleSelect(MySQLSQLStatementParser.SimpleSelectContext ctx);

    /**
     * Enter a parse tree produced by the {@code parenthesisSelect}
     * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void enterParenthesisSelect(MySQLSQLStatementParser.ParenthesisSelectContext ctx);

    /**
     * Exit a parse tree produced by the {@code parenthesisSelect}
     * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void exitParenthesisSelect(MySQLSQLStatementParser.ParenthesisSelectContext ctx);

    /**
     * Enter a parse tree produced by the {@code unionSelect}
     * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void enterUnionSelect(MySQLSQLStatementParser.UnionSelectContext ctx);

    /**
     * Exit a parse tree produced by the {@code unionSelect}
     * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void exitUnionSelect(MySQLSQLStatementParser.UnionSelectContext ctx);

    /**
     * Enter a parse tree produced by the {@code unionParenthesisSelect}
     * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void enterUnionParenthesisSelect(MySQLSQLStatementParser.UnionParenthesisSelectContext ctx);

    /**
     * Exit a parse tree produced by the {@code unionParenthesisSelect}
     * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
     *
     * @param ctx the parse tree
     */
    void exitUnionParenthesisSelect(MySQLSQLStatementParser.UnionParenthesisSelectContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#updateStatement}.
     *
     * @param ctx the parse tree
     */
    void enterUpdateStatement(MySQLSQLStatementParser.UpdateStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#updateStatement}.
     *
     * @param ctx the parse tree
     */
    void exitUpdateStatement(MySQLSQLStatementParser.UpdateStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#insertStatementValue}.
     *
     * @param ctx the parse tree
     */
    void enterInsertStatementValue(MySQLSQLStatementParser.InsertStatementValueContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#insertStatementValue}.
     *
     * @param ctx the parse tree
     */
    void exitInsertStatementValue(MySQLSQLStatementParser.InsertStatementValueContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#updatedElement}.
     *
     * @param ctx the parse tree
     */
    void enterUpdatedElement(MySQLSQLStatementParser.UpdatedElementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#updatedElement}.
     *
     * @param ctx the parse tree
     */
    void exitUpdatedElement(MySQLSQLStatementParser.UpdatedElementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#assignmentField}.
     *
     * @param ctx the parse tree
     */
    void enterAssignmentField(MySQLSQLStatementParser.AssignmentFieldContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#assignmentField}.
     *
     * @param ctx the parse tree
     */
    void exitAssignmentField(MySQLSQLStatementParser.AssignmentFieldContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#lockClause}.
     *
     * @param ctx the parse tree
     */
    void enterLockClause(MySQLSQLStatementParser.LockClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#lockClause}.
     *
     * @param ctx the parse tree
     */
    void exitLockClause(MySQLSQLStatementParser.LockClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#singleDeleteStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSingleDeleteStatement(MySQLSQLStatementParser.SingleDeleteStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#singleDeleteStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSingleDeleteStatement(MySQLSQLStatementParser.SingleDeleteStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#multipleDeleteStatement}.
     *
     * @param ctx the parse tree
     */
    void enterMultipleDeleteStatement(MySQLSQLStatementParser.MultipleDeleteStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#multipleDeleteStatement}.
     *
     * @param ctx the parse tree
     */
    void exitMultipleDeleteStatement(MySQLSQLStatementParser.MultipleDeleteStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#handlerOpenStatement}.
     *
     * @param ctx the parse tree
     */
    void enterHandlerOpenStatement(MySQLSQLStatementParser.HandlerOpenStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#handlerOpenStatement}.
     *
     * @param ctx the parse tree
     */
    void exitHandlerOpenStatement(MySQLSQLStatementParser.HandlerOpenStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#handlerReadIndexStatement}.
     *
     * @param ctx the parse tree
     */
    void enterHandlerReadIndexStatement(MySQLSQLStatementParser.HandlerReadIndexStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#handlerReadIndexStatement}.
     *
     * @param ctx the parse tree
     */
    void exitHandlerReadIndexStatement(MySQLSQLStatementParser.HandlerReadIndexStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#handlerReadStatement}.
     *
     * @param ctx the parse tree
     */
    void enterHandlerReadStatement(MySQLSQLStatementParser.HandlerReadStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#handlerReadStatement}.
     *
     * @param ctx the parse tree
     */
    void exitHandlerReadStatement(MySQLSQLStatementParser.HandlerReadStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#handlerCloseStatement}.
     *
     * @param ctx the parse tree
     */
    void enterHandlerCloseStatement(MySQLSQLStatementParser.HandlerCloseStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#handlerCloseStatement}.
     *
     * @param ctx the parse tree
     */
    void exitHandlerCloseStatement(MySQLSQLStatementParser.HandlerCloseStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#singleUpdateStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSingleUpdateStatement(MySQLSQLStatementParser.SingleUpdateStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#singleUpdateStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSingleUpdateStatement(MySQLSQLStatementParser.SingleUpdateStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#multipleUpdateStatement}.
     *
     * @param ctx the parse tree
     */
    void enterMultipleUpdateStatement(MySQLSQLStatementParser.MultipleUpdateStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#multipleUpdateStatement}.
     *
     * @param ctx the parse tree
     */
    void exitMultipleUpdateStatement(MySQLSQLStatementParser.MultipleUpdateStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#orderByClause}.
     *
     * @param ctx the parse tree
     */
    void enterOrderByClause(MySQLSQLStatementParser.OrderByClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#orderByClause}.
     *
     * @param ctx the parse tree
     */
    void exitOrderByClause(MySQLSQLStatementParser.OrderByClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#orderByExpression}.
     *
     * @param ctx the parse tree
     */
    void enterOrderByExpression(MySQLSQLStatementParser.OrderByExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#orderByExpression}.
     *
     * @param ctx the parse tree
     */
    void exitOrderByExpression(MySQLSQLStatementParser.OrderByExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#tableSources}.
     *
     * @param ctx the parse tree
     */
    void enterTableSources(MySQLSQLStatementParser.TableSourcesContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#tableSources}.
     *
     * @param ctx the parse tree
     */
    void exitTableSources(MySQLSQLStatementParser.TableSourcesContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableSourceBase}
     * labeled alternative in {@link MySQLSQLStatementParser#tableSource}.
     *
     * @param ctx the parse tree
     */
    void enterTableSourceBase(MySQLSQLStatementParser.TableSourceBaseContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableSourceBase}
     * labeled alternative in {@link MySQLSQLStatementParser#tableSource}.
     *
     * @param ctx the parse tree
     */
    void exitTableSourceBase(MySQLSQLStatementParser.TableSourceBaseContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableSourceNested}
     * labeled alternative in {@link MySQLSQLStatementParser#tableSource}.
     *
     * @param ctx the parse tree
     */
    void enterTableSourceNested(MySQLSQLStatementParser.TableSourceNestedContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableSourceNested}
     * labeled alternative in {@link MySQLSQLStatementParser#tableSource}.
     *
     * @param ctx the parse tree
     */
    void exitTableSourceNested(MySQLSQLStatementParser.TableSourceNestedContext ctx);

    /**
     * Enter a parse tree produced by the {@code atomTableItem}
     * labeled alternative in {@link MySQLSQLStatementParser#tableSourceItem}.
     *
     * @param ctx the parse tree
     */
    void enterAtomTableItem(MySQLSQLStatementParser.AtomTableItemContext ctx);

    /**
     * Exit a parse tree produced by the {@code atomTableItem}
     * labeled alternative in {@link MySQLSQLStatementParser#tableSourceItem}.
     *
     * @param ctx the parse tree
     */
    void exitAtomTableItem(MySQLSQLStatementParser.AtomTableItemContext ctx);

    /**
     * Enter a parse tree produced by the {@code subqueryTableItem}
     * labeled alternative in {@link MySQLSQLStatementParser#tableSourceItem}.
     *
     * @param ctx the parse tree
     */
    void enterSubqueryTableItem(MySQLSQLStatementParser.SubqueryTableItemContext ctx);

    /**
     * Exit a parse tree produced by the {@code subqueryTableItem}
     * labeled alternative in {@link MySQLSQLStatementParser#tableSourceItem}.
     *
     * @param ctx the parse tree
     */
    void exitSubqueryTableItem(MySQLSQLStatementParser.SubqueryTableItemContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableSourcesItem}
     * labeled alternative in {@link MySQLSQLStatementParser#tableSourceItem}.
     *
     * @param ctx the parse tree
     */
    void enterTableSourcesItem(MySQLSQLStatementParser.TableSourcesItemContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableSourcesItem}
     * labeled alternative in {@link MySQLSQLStatementParser#tableSourceItem}.
     *
     * @param ctx the parse tree
     */
    void exitTableSourcesItem(MySQLSQLStatementParser.TableSourcesItemContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#indexHint}.
     *
     * @param ctx the parse tree
     */
    void enterIndexHint(MySQLSQLStatementParser.IndexHintContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#indexHint}.
     *
     * @param ctx the parse tree
     */
    void exitIndexHint(MySQLSQLStatementParser.IndexHintContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#indexHintType}.
     *
     * @param ctx the parse tree
     */
    void enterIndexHintType(MySQLSQLStatementParser.IndexHintTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#indexHintType}.
     *
     * @param ctx the parse tree
     */
    void exitIndexHintType(MySQLSQLStatementParser.IndexHintTypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code innerJoin}
     * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
     *
     * @param ctx the parse tree
     */
    void enterInnerJoin(MySQLSQLStatementParser.InnerJoinContext ctx);

    /**
     * Exit a parse tree produced by the {@code innerJoin}
     * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
     *
     * @param ctx the parse tree
     */
    void exitInnerJoin(MySQLSQLStatementParser.InnerJoinContext ctx);

    /**
     * Enter a parse tree produced by the {@code straightJoin}
     * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
     *
     * @param ctx the parse tree
     */
    void enterStraightJoin(MySQLSQLStatementParser.StraightJoinContext ctx);

    /**
     * Exit a parse tree produced by the {@code straightJoin}
     * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
     *
     * @param ctx the parse tree
     */
    void exitStraightJoin(MySQLSQLStatementParser.StraightJoinContext ctx);

    /**
     * Enter a parse tree produced by the {@code outerJoin}
     * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
     *
     * @param ctx the parse tree
     */
    void enterOuterJoin(MySQLSQLStatementParser.OuterJoinContext ctx);

    /**
     * Exit a parse tree produced by the {@code outerJoin}
     * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
     *
     * @param ctx the parse tree
     */
    void exitOuterJoin(MySQLSQLStatementParser.OuterJoinContext ctx);

    /**
     * Enter a parse tree produced by the {@code naturalJoin}
     * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
     *
     * @param ctx the parse tree
     */
    void enterNaturalJoin(MySQLSQLStatementParser.NaturalJoinContext ctx);

    /**
     * Exit a parse tree produced by the {@code naturalJoin}
     * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
     *
     * @param ctx the parse tree
     */
    void exitNaturalJoin(MySQLSQLStatementParser.NaturalJoinContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#queryExpression}.
     *
     * @param ctx the parse tree
     */
    void enterQueryExpression(MySQLSQLStatementParser.QueryExpressionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#queryExpression}.
     *
     * @param ctx the parse tree
     */
    void exitQueryExpression(MySQLSQLStatementParser.QueryExpressionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#queryExpressionNointo}.
     *
     * @param ctx the parse tree
     */
    void enterQueryExpressionNointo(MySQLSQLStatementParser.QueryExpressionNointoContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#queryExpressionNointo}.
     *
     * @param ctx the parse tree
     */
    void exitQueryExpressionNointo(MySQLSQLStatementParser.QueryExpressionNointoContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#querySpecification}.
     *
     * @param ctx the parse tree
     */
    void enterQuerySpecification(MySQLSQLStatementParser.QuerySpecificationContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#querySpecification}.
     *
     * @param ctx the parse tree
     */
    void exitQuerySpecification(MySQLSQLStatementParser.QuerySpecificationContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#querySpecificationNointo}.
     *
     * @param ctx the parse tree
     */
    void enterQuerySpecificationNointo(MySQLSQLStatementParser.QuerySpecificationNointoContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#querySpecificationNointo}.
     *
     * @param ctx the parse tree
     */
    void exitQuerySpecificationNointo(MySQLSQLStatementParser.QuerySpecificationNointoContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#unionParenthesis}.
     *
     * @param ctx the parse tree
     */
    void enterUnionParenthesis(MySQLSQLStatementParser.UnionParenthesisContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#unionParenthesis}.
     *
     * @param ctx the parse tree
     */
    void exitUnionParenthesis(MySQLSQLStatementParser.UnionParenthesisContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#unionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterUnionStatement(MySQLSQLStatementParser.UnionStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#unionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitUnionStatement(MySQLSQLStatementParser.UnionStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#selectSpec}.
     *
     * @param ctx the parse tree
     */
    void enterSelectSpec(MySQLSQLStatementParser.SelectSpecContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#selectSpec}.
     *
     * @param ctx the parse tree
     */
    void exitSelectSpec(MySQLSQLStatementParser.SelectSpecContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#selectElements}.
     *
     * @param ctx the parse tree
     */
    void enterSelectElements(MySQLSQLStatementParser.SelectElementsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#selectElements}.
     *
     * @param ctx the parse tree
     */
    void exitSelectElements(MySQLSQLStatementParser.SelectElementsContext ctx);

    /**
     * Enter a parse tree produced by the {@code selectStarElement}
     * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
     *
     * @param ctx the parse tree
     */
    void enterSelectStarElement(MySQLSQLStatementParser.SelectStarElementContext ctx);

    /**
     * Exit a parse tree produced by the {@code selectStarElement}
     * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
     *
     * @param ctx the parse tree
     */
    void exitSelectStarElement(MySQLSQLStatementParser.SelectStarElementContext ctx);

    /**
     * Enter a parse tree produced by the {@code selectColumnElement}
     * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
     *
     * @param ctx the parse tree
     */
    void enterSelectColumnElement(MySQLSQLStatementParser.SelectColumnElementContext ctx);

    /**
     * Exit a parse tree produced by the {@code selectColumnElement}
     * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
     *
     * @param ctx the parse tree
     */
    void exitSelectColumnElement(MySQLSQLStatementParser.SelectColumnElementContext ctx);

    /**
     * Enter a parse tree produced by the {@code selectFunctionElement}
     * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
     *
     * @param ctx the parse tree
     */
    void enterSelectFunctionElement(MySQLSQLStatementParser.SelectFunctionElementContext ctx);

    /**
     * Exit a parse tree produced by the {@code selectFunctionElement}
     * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
     *
     * @param ctx the parse tree
     */
    void exitSelectFunctionElement(MySQLSQLStatementParser.SelectFunctionElementContext ctx);

    /**
     * Enter a parse tree produced by the {@code selectExpressionElement}
     * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
     *
     * @param ctx the parse tree
     */
    void enterSelectExpressionElement(MySQLSQLStatementParser.SelectExpressionElementContext ctx);

    /**
     * Exit a parse tree produced by the {@code selectExpressionElement}
     * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
     *
     * @param ctx the parse tree
     */
    void exitSelectExpressionElement(MySQLSQLStatementParser.SelectExpressionElementContext ctx);

    /**
     * Enter a parse tree produced by the {@code selectIntoVariables}
     * labeled alternative in {@link MySQLSQLStatementParser#selectIntoExpression}.
     *
     * @param ctx the parse tree
     */
    void enterSelectIntoVariables(MySQLSQLStatementParser.SelectIntoVariablesContext ctx);

    /**
     * Exit a parse tree produced by the {@code selectIntoVariables}
     * labeled alternative in {@link MySQLSQLStatementParser#selectIntoExpression}.
     *
     * @param ctx the parse tree
     */
    void exitSelectIntoVariables(MySQLSQLStatementParser.SelectIntoVariablesContext ctx);

    /**
     * Enter a parse tree produced by the {@code selectIntoDumpFile}
     * labeled alternative in {@link MySQLSQLStatementParser#selectIntoExpression}.
     *
     * @param ctx the parse tree
     */
    void enterSelectIntoDumpFile(MySQLSQLStatementParser.SelectIntoDumpFileContext ctx);

    /**
     * Exit a parse tree produced by the {@code selectIntoDumpFile}
     * labeled alternative in {@link MySQLSQLStatementParser#selectIntoExpression}.
     *
     * @param ctx the parse tree
     */
    void exitSelectIntoDumpFile(MySQLSQLStatementParser.SelectIntoDumpFileContext ctx);

    /**
     * Enter a parse tree produced by the {@code selectIntoTextFile}
     * labeled alternative in {@link MySQLSQLStatementParser#selectIntoExpression}.
     *
     * @param ctx the parse tree
     */
    void enterSelectIntoTextFile(MySQLSQLStatementParser.SelectIntoTextFileContext ctx);

    /**
     * Exit a parse tree produced by the {@code selectIntoTextFile}
     * labeled alternative in {@link MySQLSQLStatementParser#selectIntoExpression}.
     *
     * @param ctx the parse tree
     */
    void exitSelectIntoTextFile(MySQLSQLStatementParser.SelectIntoTextFileContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#selectFieldsInto}.
     *
     * @param ctx the parse tree
     */
    void enterSelectFieldsInto(MySQLSQLStatementParser.SelectFieldsIntoContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#selectFieldsInto}.
     *
     * @param ctx the parse tree
     */
    void exitSelectFieldsInto(MySQLSQLStatementParser.SelectFieldsIntoContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#selectLinesInto}.
     *
     * @param ctx the parse tree
     */
    void enterSelectLinesInto(MySQLSQLStatementParser.SelectLinesIntoContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#selectLinesInto}.
     *
     * @param ctx the parse tree
     */
    void exitSelectLinesInto(MySQLSQLStatementParser.SelectLinesIntoContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#fromClause}.
     *
     * @param ctx the parse tree
     */
    void enterFromClause(MySQLSQLStatementParser.FromClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#fromClause}.
     *
     * @param ctx the parse tree
     */
    void exitFromClause(MySQLSQLStatementParser.FromClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#groupByItem}.
     *
     * @param ctx the parse tree
     */
    void enterGroupByItem(MySQLSQLStatementParser.GroupByItemContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#groupByItem}.
     *
     * @param ctx the parse tree
     */
    void exitGroupByItem(MySQLSQLStatementParser.GroupByItemContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#limitClause}.
     *
     * @param ctx the parse tree
     */
    void enterLimitClause(MySQLSQLStatementParser.LimitClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#limitClause}.
     *
     * @param ctx the parse tree
     */
    void exitLimitClause(MySQLSQLStatementParser.LimitClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#startTransaction}.
     *
     * @param ctx the parse tree
     */
    void enterStartTransaction(MySQLSQLStatementParser.StartTransactionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#startTransaction}.
     *
     * @param ctx the parse tree
     */
    void exitStartTransaction(MySQLSQLStatementParser.StartTransactionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#beginWork}.
     *
     * @param ctx the parse tree
     */
    void enterBeginWork(MySQLSQLStatementParser.BeginWorkContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#beginWork}.
     *
     * @param ctx the parse tree
     */
    void exitBeginWork(MySQLSQLStatementParser.BeginWorkContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#commitWork}.
     *
     * @param ctx the parse tree
     */
    void enterCommitWork(MySQLSQLStatementParser.CommitWorkContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#commitWork}.
     *
     * @param ctx the parse tree
     */
    void exitCommitWork(MySQLSQLStatementParser.CommitWorkContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#rollbackWork}.
     *
     * @param ctx the parse tree
     */
    void enterRollbackWork(MySQLSQLStatementParser.RollbackWorkContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#rollbackWork}.
     *
     * @param ctx the parse tree
     */
    void exitRollbackWork(MySQLSQLStatementParser.RollbackWorkContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#savepointStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSavepointStatement(MySQLSQLStatementParser.SavepointStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#savepointStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSavepointStatement(MySQLSQLStatementParser.SavepointStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#rollbackStatement}.
     *
     * @param ctx the parse tree
     */
    void enterRollbackStatement(MySQLSQLStatementParser.RollbackStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#rollbackStatement}.
     *
     * @param ctx the parse tree
     */
    void exitRollbackStatement(MySQLSQLStatementParser.RollbackStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#releaseStatement}.
     *
     * @param ctx the parse tree
     */
    void enterReleaseStatement(MySQLSQLStatementParser.ReleaseStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#releaseStatement}.
     *
     * @param ctx the parse tree
     */
    void exitReleaseStatement(MySQLSQLStatementParser.ReleaseStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#lockTables}.
     *
     * @param ctx the parse tree
     */
    void enterLockTables(MySQLSQLStatementParser.LockTablesContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#lockTables}.
     *
     * @param ctx the parse tree
     */
    void exitLockTables(MySQLSQLStatementParser.LockTablesContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#unlockTables}.
     *
     * @param ctx the parse tree
     */
    void enterUnlockTables(MySQLSQLStatementParser.UnlockTablesContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#unlockTables}.
     *
     * @param ctx the parse tree
     */
    void exitUnlockTables(MySQLSQLStatementParser.UnlockTablesContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#setAutocommitStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSetAutocommitStatement(MySQLSQLStatementParser.SetAutocommitStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#setAutocommitStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSetAutocommitStatement(MySQLSQLStatementParser.SetAutocommitStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#setTransactionStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSetTransactionStatement(MySQLSQLStatementParser.SetTransactionStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#setTransactionStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSetTransactionStatement(MySQLSQLStatementParser.SetTransactionStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#transactionMode}.
     *
     * @param ctx the parse tree
     */
    void enterTransactionMode(MySQLSQLStatementParser.TransactionModeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#transactionMode}.
     *
     * @param ctx the parse tree
     */
    void exitTransactionMode(MySQLSQLStatementParser.TransactionModeContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#lockTableElement}.
     *
     * @param ctx the parse tree
     */
    void enterLockTableElement(MySQLSQLStatementParser.LockTableElementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#lockTableElement}.
     *
     * @param ctx the parse tree
     */
    void exitLockTableElement(MySQLSQLStatementParser.LockTableElementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#lockAction}.
     *
     * @param ctx the parse tree
     */
    void enterLockAction(MySQLSQLStatementParser.LockActionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#lockAction}.
     *
     * @param ctx the parse tree
     */
    void exitLockAction(MySQLSQLStatementParser.LockActionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#transactionOption}.
     *
     * @param ctx the parse tree
     */
    void enterTransactionOption(MySQLSQLStatementParser.TransactionOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#transactionOption}.
     *
     * @param ctx the parse tree
     */
    void exitTransactionOption(MySQLSQLStatementParser.TransactionOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#transactionLevel}.
     *
     * @param ctx the parse tree
     */
    void enterTransactionLevel(MySQLSQLStatementParser.TransactionLevelContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#transactionLevel}.
     *
     * @param ctx the parse tree
     */
    void exitTransactionLevel(MySQLSQLStatementParser.TransactionLevelContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#changeMaster}.
     *
     * @param ctx the parse tree
     */
    void enterChangeMaster(MySQLSQLStatementParser.ChangeMasterContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#changeMaster}.
     *
     * @param ctx the parse tree
     */
    void exitChangeMaster(MySQLSQLStatementParser.ChangeMasterContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#changeReplicationFilter}.
     *
     * @param ctx the parse tree
     */
    void enterChangeReplicationFilter(MySQLSQLStatementParser.ChangeReplicationFilterContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#changeReplicationFilter}.
     *
     * @param ctx the parse tree
     */
    void exitChangeReplicationFilter(MySQLSQLStatementParser.ChangeReplicationFilterContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#purgeBinaryLogs}.
     *
     * @param ctx the parse tree
     */
    void enterPurgeBinaryLogs(MySQLSQLStatementParser.PurgeBinaryLogsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#purgeBinaryLogs}.
     *
     * @param ctx the parse tree
     */
    void exitPurgeBinaryLogs(MySQLSQLStatementParser.PurgeBinaryLogsContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#resetMaster}.
     *
     * @param ctx the parse tree
     */
    void enterResetMaster(MySQLSQLStatementParser.ResetMasterContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#resetMaster}.
     *
     * @param ctx the parse tree
     */
    void exitResetMaster(MySQLSQLStatementParser.ResetMasterContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#resetSlave}.
     *
     * @param ctx the parse tree
     */
    void enterResetSlave(MySQLSQLStatementParser.ResetSlaveContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#resetSlave}.
     *
     * @param ctx the parse tree
     */
    void exitResetSlave(MySQLSQLStatementParser.ResetSlaveContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#startSlave}.
     *
     * @param ctx the parse tree
     */
    void enterStartSlave(MySQLSQLStatementParser.StartSlaveContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#startSlave}.
     *
     * @param ctx the parse tree
     */
    void exitStartSlave(MySQLSQLStatementParser.StartSlaveContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#stopSlave}.
     *
     * @param ctx the parse tree
     */
    void enterStopSlave(MySQLSQLStatementParser.StopSlaveContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#stopSlave}.
     *
     * @param ctx the parse tree
     */
    void exitStopSlave(MySQLSQLStatementParser.StopSlaveContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#startGroupReplication}.
     *
     * @param ctx the parse tree
     */
    void enterStartGroupReplication(MySQLSQLStatementParser.StartGroupReplicationContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#startGroupReplication}.
     *
     * @param ctx the parse tree
     */
    void exitStartGroupReplication(MySQLSQLStatementParser.StartGroupReplicationContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#stopGroupReplication}.
     *
     * @param ctx the parse tree
     */
    void enterStopGroupReplication(MySQLSQLStatementParser.StopGroupReplicationContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#stopGroupReplication}.
     *
     * @param ctx the parse tree
     */
    void exitStopGroupReplication(MySQLSQLStatementParser.StopGroupReplicationContext ctx);

    /**
     * Enter a parse tree produced by the {@code masterStringOption}
     * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
     *
     * @param ctx the parse tree
     */
    void enterMasterStringOption(MySQLSQLStatementParser.MasterStringOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code masterStringOption}
     * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
     *
     * @param ctx the parse tree
     */
    void exitMasterStringOption(MySQLSQLStatementParser.MasterStringOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code masterDecimalOption}
     * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
     *
     * @param ctx the parse tree
     */
    void enterMasterDecimalOption(MySQLSQLStatementParser.MasterDecimalOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code masterDecimalOption}
     * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
     *
     * @param ctx the parse tree
     */
    void exitMasterDecimalOption(MySQLSQLStatementParser.MasterDecimalOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code masterBoolOption}
     * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
     *
     * @param ctx the parse tree
     */
    void enterMasterBoolOption(MySQLSQLStatementParser.MasterBoolOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code masterBoolOption}
     * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
     *
     * @param ctx the parse tree
     */
    void exitMasterBoolOption(MySQLSQLStatementParser.MasterBoolOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code masterRealOption}
     * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
     *
     * @param ctx the parse tree
     */
    void enterMasterRealOption(MySQLSQLStatementParser.MasterRealOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code masterRealOption}
     * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
     *
     * @param ctx the parse tree
     */
    void exitMasterRealOption(MySQLSQLStatementParser.MasterRealOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code masterUidListOption}
     * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
     *
     * @param ctx the parse tree
     */
    void enterMasterUidListOption(MySQLSQLStatementParser.MasterUidListOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code masterUidListOption}
     * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
     *
     * @param ctx the parse tree
     */
    void exitMasterUidListOption(MySQLSQLStatementParser.MasterUidListOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#stringMasterOption}.
     *
     * @param ctx the parse tree
     */
    void enterStringMasterOption(MySQLSQLStatementParser.StringMasterOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#stringMasterOption}.
     *
     * @param ctx the parse tree
     */
    void exitStringMasterOption(MySQLSQLStatementParser.StringMasterOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#decimalMasterOption}.
     *
     * @param ctx the parse tree
     */
    void enterDecimalMasterOption(MySQLSQLStatementParser.DecimalMasterOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#decimalMasterOption}.
     *
     * @param ctx the parse tree
     */
    void exitDecimalMasterOption(MySQLSQLStatementParser.DecimalMasterOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#boolMasterOption}.
     *
     * @param ctx the parse tree
     */
    void enterBoolMasterOption(MySQLSQLStatementParser.BoolMasterOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#boolMasterOption}.
     *
     * @param ctx the parse tree
     */
    void exitBoolMasterOption(MySQLSQLStatementParser.BoolMasterOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#channelOption}.
     *
     * @param ctx the parse tree
     */
    void enterChannelOption(MySQLSQLStatementParser.ChannelOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#channelOption}.
     *
     * @param ctx the parse tree
     */
    void exitChannelOption(MySQLSQLStatementParser.ChannelOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code doDbReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void enterDoDbReplication(MySQLSQLStatementParser.DoDbReplicationContext ctx);

    /**
     * Exit a parse tree produced by the {@code doDbReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void exitDoDbReplication(MySQLSQLStatementParser.DoDbReplicationContext ctx);

    /**
     * Enter a parse tree produced by the {@code ignoreDbReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void enterIgnoreDbReplication(MySQLSQLStatementParser.IgnoreDbReplicationContext ctx);

    /**
     * Exit a parse tree produced by the {@code ignoreDbReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void exitIgnoreDbReplication(MySQLSQLStatementParser.IgnoreDbReplicationContext ctx);

    /**
     * Enter a parse tree produced by the {@code doTableReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void enterDoTableReplication(MySQLSQLStatementParser.DoTableReplicationContext ctx);

    /**
     * Exit a parse tree produced by the {@code doTableReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void exitDoTableReplication(MySQLSQLStatementParser.DoTableReplicationContext ctx);

    /**
     * Enter a parse tree produced by the {@code ignoreTableReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void enterIgnoreTableReplication(MySQLSQLStatementParser.IgnoreTableReplicationContext ctx);

    /**
     * Exit a parse tree produced by the {@code ignoreTableReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void exitIgnoreTableReplication(MySQLSQLStatementParser.IgnoreTableReplicationContext ctx);

    /**
     * Enter a parse tree produced by the {@code wildDoTableReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void enterWildDoTableReplication(MySQLSQLStatementParser.WildDoTableReplicationContext ctx);

    /**
     * Exit a parse tree produced by the {@code wildDoTableReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void exitWildDoTableReplication(MySQLSQLStatementParser.WildDoTableReplicationContext ctx);

    /**
     * Enter a parse tree produced by the {@code wildIgnoreTableReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void enterWildIgnoreTableReplication(MySQLSQLStatementParser.WildIgnoreTableReplicationContext ctx);

    /**
     * Exit a parse tree produced by the {@code wildIgnoreTableReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void exitWildIgnoreTableReplication(MySQLSQLStatementParser.WildIgnoreTableReplicationContext ctx);

    /**
     * Enter a parse tree produced by the {@code rewriteDbReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void enterRewriteDbReplication(MySQLSQLStatementParser.RewriteDbReplicationContext ctx);

    /**
     * Exit a parse tree produced by the {@code rewriteDbReplication}
     * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
     *
     * @param ctx the parse tree
     */
    void exitRewriteDbReplication(MySQLSQLStatementParser.RewriteDbReplicationContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#tablePair}.
     *
     * @param ctx the parse tree
     */
    void enterTablePair(MySQLSQLStatementParser.TablePairContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#tablePair}.
     *
     * @param ctx the parse tree
     */
    void exitTablePair(MySQLSQLStatementParser.TablePairContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#threadType}.
     *
     * @param ctx the parse tree
     */
    void enterThreadType(MySQLSQLStatementParser.ThreadTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#threadType}.
     *
     * @param ctx the parse tree
     */
    void exitThreadType(MySQLSQLStatementParser.ThreadTypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code gtidsUntilOption}
     * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
     *
     * @param ctx the parse tree
     */
    void enterGtidsUntilOption(MySQLSQLStatementParser.GtidsUntilOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code gtidsUntilOption}
     * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
     *
     * @param ctx the parse tree
     */
    void exitGtidsUntilOption(MySQLSQLStatementParser.GtidsUntilOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code masterLogUntilOption}
     * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
     *
     * @param ctx the parse tree
     */
    void enterMasterLogUntilOption(MySQLSQLStatementParser.MasterLogUntilOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code masterLogUntilOption}
     * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
     *
     * @param ctx the parse tree
     */
    void exitMasterLogUntilOption(MySQLSQLStatementParser.MasterLogUntilOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code relayLogUntilOption}
     * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
     *
     * @param ctx the parse tree
     */
    void enterRelayLogUntilOption(MySQLSQLStatementParser.RelayLogUntilOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code relayLogUntilOption}
     * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
     *
     * @param ctx the parse tree
     */
    void exitRelayLogUntilOption(MySQLSQLStatementParser.RelayLogUntilOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code sqlGapsUntilOption}
     * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
     *
     * @param ctx the parse tree
     */
    void enterSqlGapsUntilOption(MySQLSQLStatementParser.SqlGapsUntilOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code sqlGapsUntilOption}
     * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
     *
     * @param ctx the parse tree
     */
    void exitSqlGapsUntilOption(MySQLSQLStatementParser.SqlGapsUntilOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code userConnectionOption}
     * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
     *
     * @param ctx the parse tree
     */
    void enterUserConnectionOption(MySQLSQLStatementParser.UserConnectionOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code userConnectionOption}
     * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
     *
     * @param ctx the parse tree
     */
    void exitUserConnectionOption(MySQLSQLStatementParser.UserConnectionOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code passwordConnectionOption}
     * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
     *
     * @param ctx the parse tree
     */
    void enterPasswordConnectionOption(MySQLSQLStatementParser.PasswordConnectionOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code passwordConnectionOption}
     * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
     *
     * @param ctx the parse tree
     */
    void exitPasswordConnectionOption(MySQLSQLStatementParser.PasswordConnectionOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code defaultAuthConnectionOption}
     * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
     *
     * @param ctx the parse tree
     */
    void enterDefaultAuthConnectionOption(MySQLSQLStatementParser.DefaultAuthConnectionOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code defaultAuthConnectionOption}
     * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
     *
     * @param ctx the parse tree
     */
    void exitDefaultAuthConnectionOption(MySQLSQLStatementParser.DefaultAuthConnectionOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code pluginDirConnectionOption}
     * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
     *
     * @param ctx the parse tree
     */
    void enterPluginDirConnectionOption(MySQLSQLStatementParser.PluginDirConnectionOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code pluginDirConnectionOption}
     * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
     *
     * @param ctx the parse tree
     */
    void exitPluginDirConnectionOption(MySQLSQLStatementParser.PluginDirConnectionOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#gtuidSet}.
     *
     * @param ctx the parse tree
     */
    void enterGtuidSet(MySQLSQLStatementParser.GtuidSetContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#gtuidSet}.
     *
     * @param ctx the parse tree
     */
    void exitGtuidSet(MySQLSQLStatementParser.GtuidSetContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#xaStartTransaction}.
     *
     * @param ctx the parse tree
     */
    void enterXaStartTransaction(MySQLSQLStatementParser.XaStartTransactionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#xaStartTransaction}.
     *
     * @param ctx the parse tree
     */
    void exitXaStartTransaction(MySQLSQLStatementParser.XaStartTransactionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#xaEndTransaction}.
     *
     * @param ctx the parse tree
     */
    void enterXaEndTransaction(MySQLSQLStatementParser.XaEndTransactionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#xaEndTransaction}.
     *
     * @param ctx the parse tree
     */
    void exitXaEndTransaction(MySQLSQLStatementParser.XaEndTransactionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#xaPrepareStatement}.
     *
     * @param ctx the parse tree
     */
    void enterXaPrepareStatement(MySQLSQLStatementParser.XaPrepareStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#xaPrepareStatement}.
     *
     * @param ctx the parse tree
     */
    void exitXaPrepareStatement(MySQLSQLStatementParser.XaPrepareStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#xaCommitWork}.
     *
     * @param ctx the parse tree
     */
    void enterXaCommitWork(MySQLSQLStatementParser.XaCommitWorkContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#xaCommitWork}.
     *
     * @param ctx the parse tree
     */
    void exitXaCommitWork(MySQLSQLStatementParser.XaCommitWorkContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#xaRollbackWork}.
     *
     * @param ctx the parse tree
     */
    void enterXaRollbackWork(MySQLSQLStatementParser.XaRollbackWorkContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#xaRollbackWork}.
     *
     * @param ctx the parse tree
     */
    void exitXaRollbackWork(MySQLSQLStatementParser.XaRollbackWorkContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#xaRecoverWork}.
     *
     * @param ctx the parse tree
     */
    void enterXaRecoverWork(MySQLSQLStatementParser.XaRecoverWorkContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#xaRecoverWork}.
     *
     * @param ctx the parse tree
     */
    void exitXaRecoverWork(MySQLSQLStatementParser.XaRecoverWorkContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#prepareStatement}.
     *
     * @param ctx the parse tree
     */
    void enterPrepareStatement(MySQLSQLStatementParser.PrepareStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#prepareStatement}.
     *
     * @param ctx the parse tree
     */
    void exitPrepareStatement(MySQLSQLStatementParser.PrepareStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#executeStatement}.
     *
     * @param ctx the parse tree
     */
    void enterExecuteStatement(MySQLSQLStatementParser.ExecuteStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#executeStatement}.
     *
     * @param ctx the parse tree
     */
    void exitExecuteStatement(MySQLSQLStatementParser.ExecuteStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#deallocatePrepare}.
     *
     * @param ctx the parse tree
     */
    void enterDeallocatePrepare(MySQLSQLStatementParser.DeallocatePrepareContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#deallocatePrepare}.
     *
     * @param ctx the parse tree
     */
    void exitDeallocatePrepare(MySQLSQLStatementParser.DeallocatePrepareContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#routineBody}.
     *
     * @param ctx the parse tree
     */
    void enterRoutineBody(MySQLSQLStatementParser.RoutineBodyContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#routineBody}.
     *
     * @param ctx the parse tree
     */
    void exitRoutineBody(MySQLSQLStatementParser.RoutineBodyContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#blockStatement}.
     *
     * @param ctx the parse tree
     */
    void enterBlockStatement(MySQLSQLStatementParser.BlockStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#blockStatement}.
     *
     * @param ctx the parse tree
     */
    void exitBlockStatement(MySQLSQLStatementParser.BlockStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#caseStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCaseStatement(MySQLSQLStatementParser.CaseStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#caseStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCaseStatement(MySQLSQLStatementParser.CaseStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIfStatement(MySQLSQLStatementParser.IfStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#ifStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIfStatement(MySQLSQLStatementParser.IfStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#iterateStatement}.
     *
     * @param ctx the parse tree
     */
    void enterIterateStatement(MySQLSQLStatementParser.IterateStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#iterateStatement}.
     *
     * @param ctx the parse tree
     */
    void exitIterateStatement(MySQLSQLStatementParser.IterateStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#leaveStatement}.
     *
     * @param ctx the parse tree
     */
    void enterLeaveStatement(MySQLSQLStatementParser.LeaveStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#leaveStatement}.
     *
     * @param ctx the parse tree
     */
    void exitLeaveStatement(MySQLSQLStatementParser.LeaveStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#loopStatement}.
     *
     * @param ctx the parse tree
     */
    void enterLoopStatement(MySQLSQLStatementParser.LoopStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#loopStatement}.
     *
     * @param ctx the parse tree
     */
    void exitLoopStatement(MySQLSQLStatementParser.LoopStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#repeatStatement}.
     *
     * @param ctx the parse tree
     */
    void enterRepeatStatement(MySQLSQLStatementParser.RepeatStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#repeatStatement}.
     *
     * @param ctx the parse tree
     */
    void exitRepeatStatement(MySQLSQLStatementParser.RepeatStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#returnStatement}.
     *
     * @param ctx the parse tree
     */
    void enterReturnStatement(MySQLSQLStatementParser.ReturnStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#returnStatement}.
     *
     * @param ctx the parse tree
     */
    void exitReturnStatement(MySQLSQLStatementParser.ReturnStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#whileStatement}.
     *
     * @param ctx the parse tree
     */
    void enterWhileStatement(MySQLSQLStatementParser.WhileStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#whileStatement}.
     *
     * @param ctx the parse tree
     */
    void exitWhileStatement(MySQLSQLStatementParser.WhileStatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code CloseCursor}
     * labeled alternative in {@link MySQLSQLStatementParser#cursorStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCloseCursor(MySQLSQLStatementParser.CloseCursorContext ctx);

    /**
     * Exit a parse tree produced by the {@code CloseCursor}
     * labeled alternative in {@link MySQLSQLStatementParser#cursorStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCloseCursor(MySQLSQLStatementParser.CloseCursorContext ctx);

    /**
     * Enter a parse tree produced by the {@code FetchCursor}
     * labeled alternative in {@link MySQLSQLStatementParser#cursorStatement}.
     *
     * @param ctx the parse tree
     */
    void enterFetchCursor(MySQLSQLStatementParser.FetchCursorContext ctx);

    /**
     * Exit a parse tree produced by the {@code FetchCursor}
     * labeled alternative in {@link MySQLSQLStatementParser#cursorStatement}.
     *
     * @param ctx the parse tree
     */
    void exitFetchCursor(MySQLSQLStatementParser.FetchCursorContext ctx);

    /**
     * Enter a parse tree produced by the {@code OpenCursor}
     * labeled alternative in {@link MySQLSQLStatementParser#cursorStatement}.
     *
     * @param ctx the parse tree
     */
    void enterOpenCursor(MySQLSQLStatementParser.OpenCursorContext ctx);

    /**
     * Exit a parse tree produced by the {@code OpenCursor}
     * labeled alternative in {@link MySQLSQLStatementParser#cursorStatement}.
     *
     * @param ctx the parse tree
     */
    void exitOpenCursor(MySQLSQLStatementParser.OpenCursorContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#declareVariable}.
     *
     * @param ctx the parse tree
     */
    void enterDeclareVariable(MySQLSQLStatementParser.DeclareVariableContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#declareVariable}.
     *
     * @param ctx the parse tree
     */
    void exitDeclareVariable(MySQLSQLStatementParser.DeclareVariableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#declareCondition}.
     *
     * @param ctx the parse tree
     */
    void enterDeclareCondition(MySQLSQLStatementParser.DeclareConditionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#declareCondition}.
     *
     * @param ctx the parse tree
     */
    void exitDeclareCondition(MySQLSQLStatementParser.DeclareConditionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#declareCursor}.
     *
     * @param ctx the parse tree
     */
    void enterDeclareCursor(MySQLSQLStatementParser.DeclareCursorContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#declareCursor}.
     *
     * @param ctx the parse tree
     */
    void exitDeclareCursor(MySQLSQLStatementParser.DeclareCursorContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#declareHandler}.
     *
     * @param ctx the parse tree
     */
    void enterDeclareHandler(MySQLSQLStatementParser.DeclareHandlerContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#declareHandler}.
     *
     * @param ctx the parse tree
     */
    void exitDeclareHandler(MySQLSQLStatementParser.DeclareHandlerContext ctx);

    /**
     * Enter a parse tree produced by the {@code handlerConditionCode}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void enterHandlerConditionCode(MySQLSQLStatementParser.HandlerConditionCodeContext ctx);

    /**
     * Exit a parse tree produced by the {@code handlerConditionCode}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void exitHandlerConditionCode(MySQLSQLStatementParser.HandlerConditionCodeContext ctx);

    /**
     * Enter a parse tree produced by the {@code handlerConditionState}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void enterHandlerConditionState(MySQLSQLStatementParser.HandlerConditionStateContext ctx);

    /**
     * Exit a parse tree produced by the {@code handlerConditionState}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void exitHandlerConditionState(MySQLSQLStatementParser.HandlerConditionStateContext ctx);

    /**
     * Enter a parse tree produced by the {@code handlerConditionName}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void enterHandlerConditionName(MySQLSQLStatementParser.HandlerConditionNameContext ctx);

    /**
     * Exit a parse tree produced by the {@code handlerConditionName}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void exitHandlerConditionName(MySQLSQLStatementParser.HandlerConditionNameContext ctx);

    /**
     * Enter a parse tree produced by the {@code handlerConditionWarning}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void enterHandlerConditionWarning(MySQLSQLStatementParser.HandlerConditionWarningContext ctx);

    /**
     * Exit a parse tree produced by the {@code handlerConditionWarning}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void exitHandlerConditionWarning(MySQLSQLStatementParser.HandlerConditionWarningContext ctx);

    /**
     * Enter a parse tree produced by the {@code handlerConditionNotfound}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void enterHandlerConditionNotfound(MySQLSQLStatementParser.HandlerConditionNotfoundContext ctx);

    /**
     * Exit a parse tree produced by the {@code handlerConditionNotfound}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void exitHandlerConditionNotfound(MySQLSQLStatementParser.HandlerConditionNotfoundContext ctx);

    /**
     * Enter a parse tree produced by the {@code handlerConditionException}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void enterHandlerConditionException(MySQLSQLStatementParser.HandlerConditionExceptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code handlerConditionException}
     * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
     *
     * @param ctx the parse tree
     */
    void exitHandlerConditionException(MySQLSQLStatementParser.HandlerConditionExceptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#procedureSqlStatement}.
     *
     * @param ctx the parse tree
     */
    void enterProcedureSqlStatement(MySQLSQLStatementParser.ProcedureSqlStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#procedureSqlStatement}.
     *
     * @param ctx the parse tree
     */
    void exitProcedureSqlStatement(MySQLSQLStatementParser.ProcedureSqlStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#caseAlternative}.
     *
     * @param ctx the parse tree
     */
    void enterCaseAlternative(MySQLSQLStatementParser.CaseAlternativeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#caseAlternative}.
     *
     * @param ctx the parse tree
     */
    void exitCaseAlternative(MySQLSQLStatementParser.CaseAlternativeContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#elifAlternative}.
     *
     * @param ctx the parse tree
     */
    void enterElifAlternative(MySQLSQLStatementParser.ElifAlternativeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#elifAlternative}.
     *
     * @param ctx the parse tree
     */
    void exitElifAlternative(MySQLSQLStatementParser.ElifAlternativeContext ctx);

    /**
     * Enter a parse tree produced by the {@code alterUserMysqlV56}
     * labeled alternative in {@link MySQLSQLStatementParser#alterUser}.
     *
     * @param ctx the parse tree
     */
    void enterAlterUserMysqlV56(MySQLSQLStatementParser.AlterUserMysqlV56Context ctx);

    /**
     * Exit a parse tree produced by the {@code alterUserMysqlV56}
     * labeled alternative in {@link MySQLSQLStatementParser#alterUser}.
     *
     * @param ctx the parse tree
     */
    void exitAlterUserMysqlV56(MySQLSQLStatementParser.AlterUserMysqlV56Context ctx);

    /**
     * Enter a parse tree produced by the {@code alterUserMysqlV57}
     * labeled alternative in {@link MySQLSQLStatementParser#alterUser}.
     *
     * @param ctx the parse tree
     */
    void enterAlterUserMysqlV57(MySQLSQLStatementParser.AlterUserMysqlV57Context ctx);

    /**
     * Exit a parse tree produced by the {@code alterUserMysqlV57}
     * labeled alternative in {@link MySQLSQLStatementParser#alterUser}.
     *
     * @param ctx the parse tree
     */
    void exitAlterUserMysqlV57(MySQLSQLStatementParser.AlterUserMysqlV57Context ctx);

    /**
     * Enter a parse tree produced by the {@code createUserMysqlV56}
     * labeled alternative in {@link MySQLSQLStatementParser#createUser}.
     *
     * @param ctx the parse tree
     */
    void enterCreateUserMysqlV56(MySQLSQLStatementParser.CreateUserMysqlV56Context ctx);

    /**
     * Exit a parse tree produced by the {@code createUserMysqlV56}
     * labeled alternative in {@link MySQLSQLStatementParser#createUser}.
     *
     * @param ctx the parse tree
     */
    void exitCreateUserMysqlV56(MySQLSQLStatementParser.CreateUserMysqlV56Context ctx);

    /**
     * Enter a parse tree produced by the {@code createUserMysqlV57}
     * labeled alternative in {@link MySQLSQLStatementParser#createUser}.
     *
     * @param ctx the parse tree
     */
    void enterCreateUserMysqlV57(MySQLSQLStatementParser.CreateUserMysqlV57Context ctx);

    /**
     * Exit a parse tree produced by the {@code createUserMysqlV57}
     * labeled alternative in {@link MySQLSQLStatementParser#createUser}.
     *
     * @param ctx the parse tree
     */
    void exitCreateUserMysqlV57(MySQLSQLStatementParser.CreateUserMysqlV57Context ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dropUser}.
     *
     * @param ctx the parse tree
     */
    void enterDropUser(MySQLSQLStatementParser.DropUserContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dropUser}.
     *
     * @param ctx the parse tree
     */
    void exitDropUser(MySQLSQLStatementParser.DropUserContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#grantStatement}.
     *
     * @param ctx the parse tree
     */
    void enterGrantStatement(MySQLSQLStatementParser.GrantStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#grantStatement}.
     *
     * @param ctx the parse tree
     */
    void exitGrantStatement(MySQLSQLStatementParser.GrantStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#grantProxy}.
     *
     * @param ctx the parse tree
     */
    void enterGrantProxy(MySQLSQLStatementParser.GrantProxyContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#grantProxy}.
     *
     * @param ctx the parse tree
     */
    void exitGrantProxy(MySQLSQLStatementParser.GrantProxyContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#renameUser}.
     *
     * @param ctx the parse tree
     */
    void enterRenameUser(MySQLSQLStatementParser.RenameUserContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#renameUser}.
     *
     * @param ctx the parse tree
     */
    void exitRenameUser(MySQLSQLStatementParser.RenameUserContext ctx);

    /**
     * Enter a parse tree produced by the {@code detailRevoke}
     * labeled alternative in {@link MySQLSQLStatementParser#revokeStatement}.
     *
     * @param ctx the parse tree
     */
    void enterDetailRevoke(MySQLSQLStatementParser.DetailRevokeContext ctx);

    /**
     * Exit a parse tree produced by the {@code detailRevoke}
     * labeled alternative in {@link MySQLSQLStatementParser#revokeStatement}.
     *
     * @param ctx the parse tree
     */
    void exitDetailRevoke(MySQLSQLStatementParser.DetailRevokeContext ctx);

    /**
     * Enter a parse tree produced by the {@code shortRevoke}
     * labeled alternative in {@link MySQLSQLStatementParser#revokeStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShortRevoke(MySQLSQLStatementParser.ShortRevokeContext ctx);

    /**
     * Exit a parse tree produced by the {@code shortRevoke}
     * labeled alternative in {@link MySQLSQLStatementParser#revokeStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShortRevoke(MySQLSQLStatementParser.ShortRevokeContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#revokeProxy}.
     *
     * @param ctx the parse tree
     */
    void enterRevokeProxy(MySQLSQLStatementParser.RevokeProxyContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#revokeProxy}.
     *
     * @param ctx the parse tree
     */
    void exitRevokeProxy(MySQLSQLStatementParser.RevokeProxyContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#setPasswordStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSetPasswordStatement(MySQLSQLStatementParser.SetPasswordStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#setPasswordStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSetPasswordStatement(MySQLSQLStatementParser.SetPasswordStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#userSpecification}.
     *
     * @param ctx the parse tree
     */
    void enterUserSpecification(MySQLSQLStatementParser.UserSpecificationContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#userSpecification}.
     *
     * @param ctx the parse tree
     */
    void exitUserSpecification(MySQLSQLStatementParser.UserSpecificationContext ctx);

    /**
     * Enter a parse tree produced by the {@code passwordAuthOption}
     * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
     *
     * @param ctx the parse tree
     */
    void enterPasswordAuthOption(MySQLSQLStatementParser.PasswordAuthOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code passwordAuthOption}
     * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
     *
     * @param ctx the parse tree
     */
    void exitPasswordAuthOption(MySQLSQLStatementParser.PasswordAuthOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code stringAuthOption}
     * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
     *
     * @param ctx the parse tree
     */
    void enterStringAuthOption(MySQLSQLStatementParser.StringAuthOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code stringAuthOption}
     * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
     *
     * @param ctx the parse tree
     */
    void exitStringAuthOption(MySQLSQLStatementParser.StringAuthOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code hashAuthOption}
     * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
     *
     * @param ctx the parse tree
     */
    void enterHashAuthOption(MySQLSQLStatementParser.HashAuthOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code hashAuthOption}
     * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
     *
     * @param ctx the parse tree
     */
    void exitHashAuthOption(MySQLSQLStatementParser.HashAuthOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code simpleAuthOption}
     * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleAuthOption(MySQLSQLStatementParser.SimpleAuthOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code simpleAuthOption}
     * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleAuthOption(MySQLSQLStatementParser.SimpleAuthOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#tlsOption}.
     *
     * @param ctx the parse tree
     */
    void enterTlsOption(MySQLSQLStatementParser.TlsOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#tlsOption}.
     *
     * @param ctx the parse tree
     */
    void exitTlsOption(MySQLSQLStatementParser.TlsOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#userResourceOption}.
     *
     * @param ctx the parse tree
     */
    void enterUserResourceOption(MySQLSQLStatementParser.UserResourceOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#userResourceOption}.
     *
     * @param ctx the parse tree
     */
    void exitUserResourceOption(MySQLSQLStatementParser.UserResourceOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#userPasswordOption}.
     *
     * @param ctx the parse tree
     */
    void enterUserPasswordOption(MySQLSQLStatementParser.UserPasswordOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#userPasswordOption}.
     *
     * @param ctx the parse tree
     */
    void exitUserPasswordOption(MySQLSQLStatementParser.UserPasswordOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#userLockOption}.
     *
     * @param ctx the parse tree
     */
    void enterUserLockOption(MySQLSQLStatementParser.UserLockOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#userLockOption}.
     *
     * @param ctx the parse tree
     */
    void exitUserLockOption(MySQLSQLStatementParser.UserLockOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#privelegeClause}.
     *
     * @param ctx the parse tree
     */
    void enterPrivelegeClause(MySQLSQLStatementParser.PrivelegeClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#privelegeClause}.
     *
     * @param ctx the parse tree
     */
    void exitPrivelegeClause(MySQLSQLStatementParser.PrivelegeClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#privilege}.
     *
     * @param ctx the parse tree
     */
    void enterPrivilege(MySQLSQLStatementParser.PrivilegeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#privilege}.
     *
     * @param ctx the parse tree
     */
    void exitPrivilege(MySQLSQLStatementParser.PrivilegeContext ctx);

    /**
     * Enter a parse tree produced by the {@code currentSchemaPriviLevel}
     * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     */
    void enterCurrentSchemaPriviLevel(MySQLSQLStatementParser.CurrentSchemaPriviLevelContext ctx);

    /**
     * Exit a parse tree produced by the {@code currentSchemaPriviLevel}
     * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     */
    void exitCurrentSchemaPriviLevel(MySQLSQLStatementParser.CurrentSchemaPriviLevelContext ctx);

    /**
     * Enter a parse tree produced by the {@code globalPrivLevel}
     * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     */
    void enterGlobalPrivLevel(MySQLSQLStatementParser.GlobalPrivLevelContext ctx);

    /**
     * Exit a parse tree produced by the {@code globalPrivLevel}
     * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     */
    void exitGlobalPrivLevel(MySQLSQLStatementParser.GlobalPrivLevelContext ctx);

    /**
     * Enter a parse tree produced by the {@code definiteSchemaPrivLevel}
     * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     */
    void enterDefiniteSchemaPrivLevel(MySQLSQLStatementParser.DefiniteSchemaPrivLevelContext ctx);

    /**
     * Exit a parse tree produced by the {@code definiteSchemaPrivLevel}
     * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     */
    void exitDefiniteSchemaPrivLevel(MySQLSQLStatementParser.DefiniteSchemaPrivLevelContext ctx);

    /**
     * Enter a parse tree produced by the {@code definiteFullTablePrivLevel}
     * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     */
    void enterDefiniteFullTablePrivLevel(MySQLSQLStatementParser.DefiniteFullTablePrivLevelContext ctx);

    /**
     * Exit a parse tree produced by the {@code definiteFullTablePrivLevel}
     * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     */
    void exitDefiniteFullTablePrivLevel(MySQLSQLStatementParser.DefiniteFullTablePrivLevelContext ctx);

    /**
     * Enter a parse tree produced by the {@code definiteTablePrivLevel}
     * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     */
    void enterDefiniteTablePrivLevel(MySQLSQLStatementParser.DefiniteTablePrivLevelContext ctx);

    /**
     * Exit a parse tree produced by the {@code definiteTablePrivLevel}
     * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
     *
     * @param ctx the parse tree
     */
    void exitDefiniteTablePrivLevel(MySQLSQLStatementParser.DefiniteTablePrivLevelContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#renameUserClause}.
     *
     * @param ctx the parse tree
     */
    void enterRenameUserClause(MySQLSQLStatementParser.RenameUserClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#renameUserClause}.
     *
     * @param ctx the parse tree
     */
    void exitRenameUserClause(MySQLSQLStatementParser.RenameUserClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#analyzeTable}.
     *
     * @param ctx the parse tree
     */
    void enterAnalyzeTable(MySQLSQLStatementParser.AnalyzeTableContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#analyzeTable}.
     *
     * @param ctx the parse tree
     */
    void exitAnalyzeTable(MySQLSQLStatementParser.AnalyzeTableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#checkTable}.
     *
     * @param ctx the parse tree
     */
    void enterCheckTable(MySQLSQLStatementParser.CheckTableContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#checkTable}.
     *
     * @param ctx the parse tree
     */
    void exitCheckTable(MySQLSQLStatementParser.CheckTableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#checksumTable}.
     *
     * @param ctx the parse tree
     */
    void enterChecksumTable(MySQLSQLStatementParser.ChecksumTableContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#checksumTable}.
     *
     * @param ctx the parse tree
     */
    void exitChecksumTable(MySQLSQLStatementParser.ChecksumTableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#optimizeTable}.
     *
     * @param ctx the parse tree
     */
    void enterOptimizeTable(MySQLSQLStatementParser.OptimizeTableContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#optimizeTable}.
     *
     * @param ctx the parse tree
     */
    void exitOptimizeTable(MySQLSQLStatementParser.OptimizeTableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#repairTable}.
     *
     * @param ctx the parse tree
     */
    void enterRepairTable(MySQLSQLStatementParser.RepairTableContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#repairTable}.
     *
     * @param ctx the parse tree
     */
    void exitRepairTable(MySQLSQLStatementParser.RepairTableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#checkTableOption}.
     *
     * @param ctx the parse tree
     */
    void enterCheckTableOption(MySQLSQLStatementParser.CheckTableOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#checkTableOption}.
     *
     * @param ctx the parse tree
     */
    void exitCheckTableOption(MySQLSQLStatementParser.CheckTableOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#createUdfunction}.
     *
     * @param ctx the parse tree
     */
    void enterCreateUdfunction(MySQLSQLStatementParser.CreateUdfunctionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#createUdfunction}.
     *
     * @param ctx the parse tree
     */
    void exitCreateUdfunction(MySQLSQLStatementParser.CreateUdfunctionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#installPlugin}.
     *
     * @param ctx the parse tree
     */
    void enterInstallPlugin(MySQLSQLStatementParser.InstallPluginContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#installPlugin}.
     *
     * @param ctx the parse tree
     */
    void exitInstallPlugin(MySQLSQLStatementParser.InstallPluginContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#uninstallPlugin}.
     *
     * @param ctx the parse tree
     */
    void enterUninstallPlugin(MySQLSQLStatementParser.UninstallPluginContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#uninstallPlugin}.
     *
     * @param ctx the parse tree
     */
    void exitUninstallPlugin(MySQLSQLStatementParser.UninstallPluginContext ctx);

    /**
     * Enter a parse tree produced by the {@code setVariable}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSetVariable(MySQLSQLStatementParser.SetVariableContext ctx);

    /**
     * Exit a parse tree produced by the {@code setVariable}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSetVariable(MySQLSQLStatementParser.SetVariableContext ctx);

    /**
     * Enter a parse tree produced by the {@code setCharset}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSetCharset(MySQLSQLStatementParser.SetCharsetContext ctx);

    /**
     * Exit a parse tree produced by the {@code setCharset}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSetCharset(MySQLSQLStatementParser.SetCharsetContext ctx);

    /**
     * Enter a parse tree produced by the {@code setNames}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSetNames(MySQLSQLStatementParser.SetNamesContext ctx);

    /**
     * Exit a parse tree produced by the {@code setNames}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSetNames(MySQLSQLStatementParser.SetNamesContext ctx);

    /**
     * Enter a parse tree produced by the {@code setPassword}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSetPassword(MySQLSQLStatementParser.SetPasswordContext ctx);

    /**
     * Exit a parse tree produced by the {@code setPassword}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSetPassword(MySQLSQLStatementParser.SetPasswordContext ctx);

    /**
     * Enter a parse tree produced by the {@code setTransaction}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSetTransaction(MySQLSQLStatementParser.SetTransactionContext ctx);

    /**
     * Exit a parse tree produced by the {@code setTransaction}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSetTransaction(MySQLSQLStatementParser.SetTransactionContext ctx);

    /**
     * Enter a parse tree produced by the {@code setAutocommit}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSetAutocommit(MySQLSQLStatementParser.SetAutocommitContext ctx);

    /**
     * Exit a parse tree produced by the {@code setAutocommit}
     * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSetAutocommit(MySQLSQLStatementParser.SetAutocommitContext ctx);

    /**
     * Enter a parse tree produced by the {@code showMasterLogs}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowMasterLogs(MySQLSQLStatementParser.ShowMasterLogsContext ctx);

    /**
     * Exit a parse tree produced by the {@code showMasterLogs}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowMasterLogs(MySQLSQLStatementParser.ShowMasterLogsContext ctx);

    /**
     * Enter a parse tree produced by the {@code showLogEvents}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowLogEvents(MySQLSQLStatementParser.ShowLogEventsContext ctx);

    /**
     * Exit a parse tree produced by the {@code showLogEvents}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowLogEvents(MySQLSQLStatementParser.ShowLogEventsContext ctx);

    /**
     * Enter a parse tree produced by the {@code showObjectFilter}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowObjectFilter(MySQLSQLStatementParser.ShowObjectFilterContext ctx);

    /**
     * Exit a parse tree produced by the {@code showObjectFilter}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowObjectFilter(MySQLSQLStatementParser.ShowObjectFilterContext ctx);

    /**
     * Enter a parse tree produced by the {@code showColumns}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowColumns(MySQLSQLStatementParser.ShowColumnsContext ctx);

    /**
     * Exit a parse tree produced by the {@code showColumns}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowColumns(MySQLSQLStatementParser.ShowColumnsContext ctx);

    /**
     * Enter a parse tree produced by the {@code showCreateDb}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowCreateDb(MySQLSQLStatementParser.ShowCreateDbContext ctx);

    /**
     * Exit a parse tree produced by the {@code showCreateDb}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowCreateDb(MySQLSQLStatementParser.ShowCreateDbContext ctx);

    /**
     * Enter a parse tree produced by the {@code showCreateFullIdObject}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowCreateFullIdObject(MySQLSQLStatementParser.ShowCreateFullIdObjectContext ctx);

    /**
     * Exit a parse tree produced by the {@code showCreateFullIdObject}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowCreateFullIdObject(MySQLSQLStatementParser.ShowCreateFullIdObjectContext ctx);

    /**
     * Enter a parse tree produced by the {@code showCreateUser}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowCreateUser(MySQLSQLStatementParser.ShowCreateUserContext ctx);

    /**
     * Exit a parse tree produced by the {@code showCreateUser}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowCreateUser(MySQLSQLStatementParser.ShowCreateUserContext ctx);

    /**
     * Enter a parse tree produced by the {@code showEngine}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowEngine(MySQLSQLStatementParser.ShowEngineContext ctx);

    /**
     * Exit a parse tree produced by the {@code showEngine}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowEngine(MySQLSQLStatementParser.ShowEngineContext ctx);

    /**
     * Enter a parse tree produced by the {@code showGlobalInfo}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowGlobalInfo(MySQLSQLStatementParser.ShowGlobalInfoContext ctx);

    /**
     * Exit a parse tree produced by the {@code showGlobalInfo}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowGlobalInfo(MySQLSQLStatementParser.ShowGlobalInfoContext ctx);

    /**
     * Enter a parse tree produced by the {@code showErrors}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowErrors(MySQLSQLStatementParser.ShowErrorsContext ctx);

    /**
     * Exit a parse tree produced by the {@code showErrors}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowErrors(MySQLSQLStatementParser.ShowErrorsContext ctx);

    /**
     * Enter a parse tree produced by the {@code showCountErrors}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowCountErrors(MySQLSQLStatementParser.ShowCountErrorsContext ctx);

    /**
     * Exit a parse tree produced by the {@code showCountErrors}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowCountErrors(MySQLSQLStatementParser.ShowCountErrorsContext ctx);

    /**
     * Enter a parse tree produced by the {@code showSchemaFilter}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowSchemaFilter(MySQLSQLStatementParser.ShowSchemaFilterContext ctx);

    /**
     * Exit a parse tree produced by the {@code showSchemaFilter}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowSchemaFilter(MySQLSQLStatementParser.ShowSchemaFilterContext ctx);

    /**
     * Enter a parse tree produced by the {@code showRoutine}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowRoutine(MySQLSQLStatementParser.ShowRoutineContext ctx);

    /**
     * Exit a parse tree produced by the {@code showRoutine}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowRoutine(MySQLSQLStatementParser.ShowRoutineContext ctx);

    /**
     * Enter a parse tree produced by the {@code showGrants}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowGrants(MySQLSQLStatementParser.ShowGrantsContext ctx);

    /**
     * Exit a parse tree produced by the {@code showGrants}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowGrants(MySQLSQLStatementParser.ShowGrantsContext ctx);

    /**
     * Enter a parse tree produced by the {@code showIndexes}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowIndexes(MySQLSQLStatementParser.ShowIndexesContext ctx);

    /**
     * Exit a parse tree produced by the {@code showIndexes}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowIndexes(MySQLSQLStatementParser.ShowIndexesContext ctx);

    /**
     * Enter a parse tree produced by the {@code showOpenTables}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowOpenTables(MySQLSQLStatementParser.ShowOpenTablesContext ctx);

    /**
     * Exit a parse tree produced by the {@code showOpenTables}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowOpenTables(MySQLSQLStatementParser.ShowOpenTablesContext ctx);

    /**
     * Enter a parse tree produced by the {@code showProfile}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowProfile(MySQLSQLStatementParser.ShowProfileContext ctx);

    /**
     * Exit a parse tree produced by the {@code showProfile}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowProfile(MySQLSQLStatementParser.ShowProfileContext ctx);

    /**
     * Enter a parse tree produced by the {@code showSlaveStatus}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShowSlaveStatus(MySQLSQLStatementParser.ShowSlaveStatusContext ctx);

    /**
     * Exit a parse tree produced by the {@code showSlaveStatus}
     * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShowSlaveStatus(MySQLSQLStatementParser.ShowSlaveStatusContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#variableClause}.
     *
     * @param ctx the parse tree
     */
    void enterVariableClause(MySQLSQLStatementParser.VariableClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#variableClause}.
     *
     * @param ctx the parse tree
     */
    void exitVariableClause(MySQLSQLStatementParser.VariableClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#showCommonEntity}.
     *
     * @param ctx the parse tree
     */
    void enterShowCommonEntity(MySQLSQLStatementParser.ShowCommonEntityContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#showCommonEntity}.
     *
     * @param ctx the parse tree
     */
    void exitShowCommonEntity(MySQLSQLStatementParser.ShowCommonEntityContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#showFilter}.
     *
     * @param ctx the parse tree
     */
    void enterShowFilter(MySQLSQLStatementParser.ShowFilterContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#showFilter}.
     *
     * @param ctx the parse tree
     */
    void exitShowFilter(MySQLSQLStatementParser.ShowFilterContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#showGlobalInfoClause}.
     *
     * @param ctx the parse tree
     */
    void enterShowGlobalInfoClause(MySQLSQLStatementParser.ShowGlobalInfoClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#showGlobalInfoClause}.
     *
     * @param ctx the parse tree
     */
    void exitShowGlobalInfoClause(MySQLSQLStatementParser.ShowGlobalInfoClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#showSchemaEntity}.
     *
     * @param ctx the parse tree
     */
    void enterShowSchemaEntity(MySQLSQLStatementParser.ShowSchemaEntityContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#showSchemaEntity}.
     *
     * @param ctx the parse tree
     */
    void exitShowSchemaEntity(MySQLSQLStatementParser.ShowSchemaEntityContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#showProfileType}.
     *
     * @param ctx the parse tree
     */
    void enterShowProfileType(MySQLSQLStatementParser.ShowProfileTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#showProfileType}.
     *
     * @param ctx the parse tree
     */
    void exitShowProfileType(MySQLSQLStatementParser.ShowProfileTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#binlogStatement}.
     *
     * @param ctx the parse tree
     */
    void enterBinlogStatement(MySQLSQLStatementParser.BinlogStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#binlogStatement}.
     *
     * @param ctx the parse tree
     */
    void exitBinlogStatement(MySQLSQLStatementParser.BinlogStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#cacheIndexStatement}.
     *
     * @param ctx the parse tree
     */
    void enterCacheIndexStatement(MySQLSQLStatementParser.CacheIndexStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#cacheIndexStatement}.
     *
     * @param ctx the parse tree
     */
    void exitCacheIndexStatement(MySQLSQLStatementParser.CacheIndexStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#flushStatement}.
     *
     * @param ctx the parse tree
     */
    void enterFlushStatement(MySQLSQLStatementParser.FlushStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#flushStatement}.
     *
     * @param ctx the parse tree
     */
    void exitFlushStatement(MySQLSQLStatementParser.FlushStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#killStatement}.
     *
     * @param ctx the parse tree
     */
    void enterKillStatement(MySQLSQLStatementParser.KillStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#killStatement}.
     *
     * @param ctx the parse tree
     */
    void exitKillStatement(MySQLSQLStatementParser.KillStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#loadIndexIntoCache}.
     *
     * @param ctx the parse tree
     */
    void enterLoadIndexIntoCache(MySQLSQLStatementParser.LoadIndexIntoCacheContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#loadIndexIntoCache}.
     *
     * @param ctx the parse tree
     */
    void exitLoadIndexIntoCache(MySQLSQLStatementParser.LoadIndexIntoCacheContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#resetStatement}.
     *
     * @param ctx the parse tree
     */
    void enterResetStatement(MySQLSQLStatementParser.ResetStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#resetStatement}.
     *
     * @param ctx the parse tree
     */
    void exitResetStatement(MySQLSQLStatementParser.ResetStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#shutdownStatement}.
     *
     * @param ctx the parse tree
     */
    void enterShutdownStatement(MySQLSQLStatementParser.ShutdownStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#shutdownStatement}.
     *
     * @param ctx the parse tree
     */
    void exitShutdownStatement(MySQLSQLStatementParser.ShutdownStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#tableIndexes}.
     *
     * @param ctx the parse tree
     */
    void enterTableIndexes(MySQLSQLStatementParser.TableIndexesContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#tableIndexes}.
     *
     * @param ctx the parse tree
     */
    void exitTableIndexes(MySQLSQLStatementParser.TableIndexesContext ctx);

    /**
     * Enter a parse tree produced by the {@code simpleFlushOption}
     * labeled alternative in {@link MySQLSQLStatementParser#flushOption}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleFlushOption(MySQLSQLStatementParser.SimpleFlushOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code simpleFlushOption}
     * labeled alternative in {@link MySQLSQLStatementParser#flushOption}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleFlushOption(MySQLSQLStatementParser.SimpleFlushOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code channelFlushOption}
     * labeled alternative in {@link MySQLSQLStatementParser#flushOption}.
     *
     * @param ctx the parse tree
     */
    void enterChannelFlushOption(MySQLSQLStatementParser.ChannelFlushOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code channelFlushOption}
     * labeled alternative in {@link MySQLSQLStatementParser#flushOption}.
     *
     * @param ctx the parse tree
     */
    void exitChannelFlushOption(MySQLSQLStatementParser.ChannelFlushOptionContext ctx);

    /**
     * Enter a parse tree produced by the {@code tableFlushOption}
     * labeled alternative in {@link MySQLSQLStatementParser#flushOption}.
     *
     * @param ctx the parse tree
     */
    void enterTableFlushOption(MySQLSQLStatementParser.TableFlushOptionContext ctx);

    /**
     * Exit a parse tree produced by the {@code tableFlushOption}
     * labeled alternative in {@link MySQLSQLStatementParser#flushOption}.
     *
     * @param ctx the parse tree
     */
    void exitTableFlushOption(MySQLSQLStatementParser.TableFlushOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#flushTableOption}.
     *
     * @param ctx the parse tree
     */
    void enterFlushTableOption(MySQLSQLStatementParser.FlushTableOptionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#flushTableOption}.
     *
     * @param ctx the parse tree
     */
    void exitFlushTableOption(MySQLSQLStatementParser.FlushTableOptionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#loadedTableIndexes}.
     *
     * @param ctx the parse tree
     */
    void enterLoadedTableIndexes(MySQLSQLStatementParser.LoadedTableIndexesContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#loadedTableIndexes}.
     *
     * @param ctx the parse tree
     */
    void exitLoadedTableIndexes(MySQLSQLStatementParser.LoadedTableIndexesContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#simpleDescribeStatement}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleDescribeStatement(MySQLSQLStatementParser.SimpleDescribeStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#simpleDescribeStatement}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleDescribeStatement(MySQLSQLStatementParser.SimpleDescribeStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#fullDescribeStatement}.
     *
     * @param ctx the parse tree
     */
    void enterFullDescribeStatement(MySQLSQLStatementParser.FullDescribeStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#fullDescribeStatement}.
     *
     * @param ctx the parse tree
     */
    void exitFullDescribeStatement(MySQLSQLStatementParser.FullDescribeStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#helpStatement}.
     *
     * @param ctx the parse tree
     */
    void enterHelpStatement(MySQLSQLStatementParser.HelpStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#helpStatement}.
     *
     * @param ctx the parse tree
     */
    void exitHelpStatement(MySQLSQLStatementParser.HelpStatementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#useStatement}.
     *
     * @param ctx the parse tree
     */
    void enterUseStatement(MySQLSQLStatementParser.UseStatementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#useStatement}.
     *
     * @param ctx the parse tree
     */
    void exitUseStatement(MySQLSQLStatementParser.UseStatementContext ctx);

    /**
     * Enter a parse tree produced by the {@code describeStatements}
     * labeled alternative in {@link MySQLSQLStatementParser#describeObjectClause}.
     *
     * @param ctx the parse tree
     */
    void enterDescribeStatements(MySQLSQLStatementParser.DescribeStatementsContext ctx);

    /**
     * Exit a parse tree produced by the {@code describeStatements}
     * labeled alternative in {@link MySQLSQLStatementParser#describeObjectClause}.
     *
     * @param ctx the parse tree
     */
    void exitDescribeStatements(MySQLSQLStatementParser.DescribeStatementsContext ctx);

    /**
     * Enter a parse tree produced by the {@code describeConnection}
     * labeled alternative in {@link MySQLSQLStatementParser#describeObjectClause}.
     *
     * @param ctx the parse tree
     */
    void enterDescribeConnection(MySQLSQLStatementParser.DescribeConnectionContext ctx);

    /**
     * Exit a parse tree produced by the {@code describeConnection}
     * labeled alternative in {@link MySQLSQLStatementParser#describeObjectClause}.
     *
     * @param ctx the parse tree
     */
    void exitDescribeConnection(MySQLSQLStatementParser.DescribeConnectionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#fullId}.
     *
     * @param ctx the parse tree
     */
    void enterFullId(MySQLSQLStatementParser.FullIdContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#fullId}.
     *
     * @param ctx the parse tree
     */
    void exitFullId(MySQLSQLStatementParser.FullIdContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#tableName}.
     *
     * @param ctx the parse tree
     */
    void enterTableName(MySQLSQLStatementParser.TableNameContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#tableName}.
     *
     * @param ctx the parse tree
     */
    void exitTableName(MySQLSQLStatementParser.TableNameContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#fullColumnName}.
     *
     * @param ctx the parse tree
     */
    void enterFullColumnName(MySQLSQLStatementParser.FullColumnNameContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#fullColumnName}.
     *
     * @param ctx the parse tree
     */
    void exitFullColumnName(MySQLSQLStatementParser.FullColumnNameContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#indexColumnName}.
     *
     * @param ctx the parse tree
     */
    void enterIndexColumnName(MySQLSQLStatementParser.IndexColumnNameContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#indexColumnName}.
     *
     * @param ctx the parse tree
     */
    void exitIndexColumnName(MySQLSQLStatementParser.IndexColumnNameContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#userName}.
     *
     * @param ctx the parse tree
     */
    void enterUserName(MySQLSQLStatementParser.UserNameContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#userName}.
     *
     * @param ctx the parse tree
     */
    void exitUserName(MySQLSQLStatementParser.UserNameContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#mysqlVariable}.
     *
     * @param ctx the parse tree
     */
    void enterMysqlVariable(MySQLSQLStatementParser.MysqlVariableContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#mysqlVariable}.
     *
     * @param ctx the parse tree
     */
    void exitMysqlVariable(MySQLSQLStatementParser.MysqlVariableContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#charsetName}.
     *
     * @param ctx the parse tree
     */
    void enterCharsetName(MySQLSQLStatementParser.CharsetNameContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#charsetName}.
     *
     * @param ctx the parse tree
     */
    void exitCharsetName(MySQLSQLStatementParser.CharsetNameContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#collationName}.
     *
     * @param ctx the parse tree
     */
    void enterCollationName(MySQLSQLStatementParser.CollationNameContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#collationName}.
     *
     * @param ctx the parse tree
     */
    void exitCollationName(MySQLSQLStatementParser.CollationNameContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#engineName}.
     *
     * @param ctx the parse tree
     */
    void enterEngineName(MySQLSQLStatementParser.EngineNameContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#engineName}.
     *
     * @param ctx the parse tree
     */
    void exitEngineName(MySQLSQLStatementParser.EngineNameContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#uuidSet}.
     *
     * @param ctx the parse tree
     */
    void enterUuidSet(MySQLSQLStatementParser.UuidSetContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#uuidSet}.
     *
     * @param ctx the parse tree
     */
    void exitUuidSet(MySQLSQLStatementParser.UuidSetContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#xid}.
     *
     * @param ctx the parse tree
     */
    void enterXid(MySQLSQLStatementParser.XidContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#xid}.
     *
     * @param ctx the parse tree
     */
    void exitXid(MySQLSQLStatementParser.XidContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#xuidStringId}.
     *
     * @param ctx the parse tree
     */
    void enterXuidStringId(MySQLSQLStatementParser.XuidStringIdContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#xuidStringId}.
     *
     * @param ctx the parse tree
     */
    void exitXuidStringId(MySQLSQLStatementParser.XuidStringIdContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#authPlugin}.
     *
     * @param ctx the parse tree
     */
    void enterAuthPlugin(MySQLSQLStatementParser.AuthPluginContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#authPlugin}.
     *
     * @param ctx the parse tree
     */
    void exitAuthPlugin(MySQLSQLStatementParser.AuthPluginContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#uid}.
     *
     * @param ctx the parse tree
     */
    void enterUid(MySQLSQLStatementParser.UidContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#uid}.
     *
     * @param ctx the parse tree
     */
    void exitUid(MySQLSQLStatementParser.UidContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#simpleId}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleId(MySQLSQLStatementParser.SimpleIdContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#simpleId}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleId(MySQLSQLStatementParser.SimpleIdContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dottedId}.
     *
     * @param ctx the parse tree
     */
    void enterDottedId(MySQLSQLStatementParser.DottedIdContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dottedId}.
     *
     * @param ctx the parse tree
     */
    void exitDottedId(MySQLSQLStatementParser.DottedIdContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#decimalLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterDecimalLiteral(MySQLSQLStatementParser.DecimalLiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#decimalLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitDecimalLiteral(MySQLSQLStatementParser.DecimalLiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#fileSizeLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterFileSizeLiteral(MySQLSQLStatementParser.FileSizeLiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#fileSizeLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitFileSizeLiteral(MySQLSQLStatementParser.FileSizeLiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#stringLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterStringLiteral(MySQLSQLStatementParser.StringLiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#stringLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitStringLiteral(MySQLSQLStatementParser.StringLiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#booleanLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterBooleanLiteral(MySQLSQLStatementParser.BooleanLiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#booleanLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitBooleanLiteral(MySQLSQLStatementParser.BooleanLiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#hexadecimalLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterHexadecimalLiteral(MySQLSQLStatementParser.HexadecimalLiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#hexadecimalLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitHexadecimalLiteral(MySQLSQLStatementParser.HexadecimalLiteralContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#nullNotnull}.
     *
     * @param ctx the parse tree
     */
    void enterNullNotnull(MySQLSQLStatementParser.NullNotnullContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#nullNotnull}.
     *
     * @param ctx the parse tree
     */
    void exitNullNotnull(MySQLSQLStatementParser.NullNotnullContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#constant}.
     *
     * @param ctx the parse tree
     */
    void enterConstant(MySQLSQLStatementParser.ConstantContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#constant}.
     *
     * @param ctx the parse tree
     */
    void exitConstant(MySQLSQLStatementParser.ConstantContext ctx);

    /**
     * Enter a parse tree produced by the {@code stringDataType}
     * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void enterStringDataType(MySQLSQLStatementParser.StringDataTypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code stringDataType}
     * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void exitStringDataType(MySQLSQLStatementParser.StringDataTypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code dimensionDataType}
     * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void enterDimensionDataType(MySQLSQLStatementParser.DimensionDataTypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code dimensionDataType}
     * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void exitDimensionDataType(MySQLSQLStatementParser.DimensionDataTypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code simpleDataType}
     * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleDataType(MySQLSQLStatementParser.SimpleDataTypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code simpleDataType}
     * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleDataType(MySQLSQLStatementParser.SimpleDataTypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code collectionDataType}
     * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void enterCollectionDataType(MySQLSQLStatementParser.CollectionDataTypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code collectionDataType}
     * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void exitCollectionDataType(MySQLSQLStatementParser.CollectionDataTypeContext ctx);

    /**
     * Enter a parse tree produced by the {@code spatialDataType}
     * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void enterSpatialDataType(MySQLSQLStatementParser.SpatialDataTypeContext ctx);

    /**
     * Exit a parse tree produced by the {@code spatialDataType}
     * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
     *
     * @param ctx the parse tree
     */
    void exitSpatialDataType(MySQLSQLStatementParser.SpatialDataTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#convertedDataType}.
     *
     * @param ctx the parse tree
     */
    void enterConvertedDataType(MySQLSQLStatementParser.ConvertedDataTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#convertedDataType}.
     *
     * @param ctx the parse tree
     */
    void exitConvertedDataType(MySQLSQLStatementParser.ConvertedDataTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#lengthOneDimension}.
     *
     * @param ctx the parse tree
     */
    void enterLengthOneDimension(MySQLSQLStatementParser.LengthOneDimensionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#lengthOneDimension}.
     *
     * @param ctx the parse tree
     */
    void exitLengthOneDimension(MySQLSQLStatementParser.LengthOneDimensionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#lengthTwoDimension}.
     *
     * @param ctx the parse tree
     */
    void enterLengthTwoDimension(MySQLSQLStatementParser.LengthTwoDimensionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#lengthTwoDimension}.
     *
     * @param ctx the parse tree
     */
    void exitLengthTwoDimension(MySQLSQLStatementParser.LengthTwoDimensionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#lengthTwoOptionalDimension}.
     *
     * @param ctx the parse tree
     */
    void enterLengthTwoOptionalDimension(MySQLSQLStatementParser.LengthTwoOptionalDimensionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#lengthTwoOptionalDimension}.
     *
     * @param ctx the parse tree
     */
    void exitLengthTwoOptionalDimension(MySQLSQLStatementParser.LengthTwoOptionalDimensionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#uidList}.
     *
     * @param ctx the parse tree
     */
    void enterUidList(MySQLSQLStatementParser.UidListContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#uidList}.
     *
     * @param ctx the parse tree
     */
    void exitUidList(MySQLSQLStatementParser.UidListContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#tables}.
     *
     * @param ctx the parse tree
     */
    void enterTables(MySQLSQLStatementParser.TablesContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#tables}.
     *
     * @param ctx the parse tree
     */
    void exitTables(MySQLSQLStatementParser.TablesContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#indexColumnNames}.
     *
     * @param ctx the parse tree
     */
    void enterIndexColumnNames(MySQLSQLStatementParser.IndexColumnNamesContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#indexColumnNames}.
     *
     * @param ctx the parse tree
     */
    void exitIndexColumnNames(MySQLSQLStatementParser.IndexColumnNamesContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#expressions}.
     *
     * @param ctx the parse tree
     */
    void enterExpressions(MySQLSQLStatementParser.ExpressionsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#expressions}.
     *
     * @param ctx the parse tree
     */
    void exitExpressions(MySQLSQLStatementParser.ExpressionsContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#expressionsWithDefaults}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionsWithDefaults(MySQLSQLStatementParser.ExpressionsWithDefaultsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#expressionsWithDefaults}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionsWithDefaults(MySQLSQLStatementParser.ExpressionsWithDefaultsContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#constants}.
     *
     * @param ctx the parse tree
     */
    void enterConstants(MySQLSQLStatementParser.ConstantsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#constants}.
     *
     * @param ctx the parse tree
     */
    void exitConstants(MySQLSQLStatementParser.ConstantsContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#simpleStrings}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleStrings(MySQLSQLStatementParser.SimpleStringsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#simpleStrings}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleStrings(MySQLSQLStatementParser.SimpleStringsContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#userVariables}.
     *
     * @param ctx the parse tree
     */
    void enterUserVariables(MySQLSQLStatementParser.UserVariablesContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#userVariables}.
     *
     * @param ctx the parse tree
     */
    void exitUserVariables(MySQLSQLStatementParser.UserVariablesContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#defaultValue}.
     *
     * @param ctx the parse tree
     */
    void enterDefaultValue(MySQLSQLStatementParser.DefaultValueContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#defaultValue}.
     *
     * @param ctx the parse tree
     */
    void exitDefaultValue(MySQLSQLStatementParser.DefaultValueContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#expressionOrDefault}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionOrDefault(MySQLSQLStatementParser.ExpressionOrDefaultContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#expressionOrDefault}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionOrDefault(MySQLSQLStatementParser.ExpressionOrDefaultContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#ifExists}.
     *
     * @param ctx the parse tree
     */
    void enterIfExists(MySQLSQLStatementParser.IfExistsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#ifExists}.
     *
     * @param ctx the parse tree
     */
    void exitIfExists(MySQLSQLStatementParser.IfExistsContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#ifNotExists}.
     *
     * @param ctx the parse tree
     */
    void enterIfNotExists(MySQLSQLStatementParser.IfNotExistsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#ifNotExists}.
     *
     * @param ctx the parse tree
     */
    void exitIfNotExists(MySQLSQLStatementParser.IfNotExistsContext ctx);

    /**
     * Enter a parse tree produced by the {@code specificFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterSpecificFunctionCall(MySQLSQLStatementParser.SpecificFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code specificFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitSpecificFunctionCall(MySQLSQLStatementParser.SpecificFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code aggregateFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterAggregateFunctionCall(MySQLSQLStatementParser.AggregateFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code aggregateFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitAggregateFunctionCall(MySQLSQLStatementParser.AggregateFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code scalarFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterScalarFunctionCall(MySQLSQLStatementParser.ScalarFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code scalarFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitScalarFunctionCall(MySQLSQLStatementParser.ScalarFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code udfFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterUdfFunctionCall(MySQLSQLStatementParser.UdfFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code udfFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitUdfFunctionCall(MySQLSQLStatementParser.UdfFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code passwordFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void enterPasswordFunctionCall(MySQLSQLStatementParser.PasswordFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code passwordFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
     *
     * @param ctx the parse tree
     */
    void exitPasswordFunctionCall(MySQLSQLStatementParser.PasswordFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code simpleFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void enterSimpleFunctionCall(MySQLSQLStatementParser.SimpleFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code simpleFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void exitSimpleFunctionCall(MySQLSQLStatementParser.SimpleFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code dataTypeFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void enterDataTypeFunctionCall(MySQLSQLStatementParser.DataTypeFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code dataTypeFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void exitDataTypeFunctionCall(MySQLSQLStatementParser.DataTypeFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code valuesFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void enterValuesFunctionCall(MySQLSQLStatementParser.ValuesFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code valuesFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void exitValuesFunctionCall(MySQLSQLStatementParser.ValuesFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code caseFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void enterCaseFunctionCall(MySQLSQLStatementParser.CaseFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code caseFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void exitCaseFunctionCall(MySQLSQLStatementParser.CaseFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code charFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void enterCharFunctionCall(MySQLSQLStatementParser.CharFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code charFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void exitCharFunctionCall(MySQLSQLStatementParser.CharFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code positionFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void enterPositionFunctionCall(MySQLSQLStatementParser.PositionFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code positionFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void exitPositionFunctionCall(MySQLSQLStatementParser.PositionFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code substrFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void enterSubstrFunctionCall(MySQLSQLStatementParser.SubstrFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code substrFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void exitSubstrFunctionCall(MySQLSQLStatementParser.SubstrFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code trimFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void enterTrimFunctionCall(MySQLSQLStatementParser.TrimFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code trimFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void exitTrimFunctionCall(MySQLSQLStatementParser.TrimFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code weightFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void enterWeightFunctionCall(MySQLSQLStatementParser.WeightFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code weightFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void exitWeightFunctionCall(MySQLSQLStatementParser.WeightFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code extractFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void enterExtractFunctionCall(MySQLSQLStatementParser.ExtractFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code extractFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void exitExtractFunctionCall(MySQLSQLStatementParser.ExtractFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by the {@code getFormatFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void enterGetFormatFunctionCall(MySQLSQLStatementParser.GetFormatFunctionCallContext ctx);

    /**
     * Exit a parse tree produced by the {@code getFormatFunctionCall}
     * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
     *
     * @param ctx the parse tree
     */
    void exitGetFormatFunctionCall(MySQLSQLStatementParser.GetFormatFunctionCallContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#caseFuncAlternative}.
     *
     * @param ctx the parse tree
     */
    void enterCaseFuncAlternative(MySQLSQLStatementParser.CaseFuncAlternativeContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#caseFuncAlternative}.
     *
     * @param ctx the parse tree
     */
    void exitCaseFuncAlternative(MySQLSQLStatementParser.CaseFuncAlternativeContext ctx);

    /**
     * Enter a parse tree produced by the {@code levelWeightList}
     * labeled alternative in {@link MySQLSQLStatementParser#levelsInWeightString}.
     *
     * @param ctx the parse tree
     */
    void enterLevelWeightList(MySQLSQLStatementParser.LevelWeightListContext ctx);

    /**
     * Exit a parse tree produced by the {@code levelWeightList}
     * labeled alternative in {@link MySQLSQLStatementParser#levelsInWeightString}.
     *
     * @param ctx the parse tree
     */
    void exitLevelWeightList(MySQLSQLStatementParser.LevelWeightListContext ctx);

    /**
     * Enter a parse tree produced by the {@code levelWeightRange}
     * labeled alternative in {@link MySQLSQLStatementParser#levelsInWeightString}.
     *
     * @param ctx the parse tree
     */
    void enterLevelWeightRange(MySQLSQLStatementParser.LevelWeightRangeContext ctx);

    /**
     * Exit a parse tree produced by the {@code levelWeightRange}
     * labeled alternative in {@link MySQLSQLStatementParser#levelsInWeightString}.
     *
     * @param ctx the parse tree
     */
    void exitLevelWeightRange(MySQLSQLStatementParser.LevelWeightRangeContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#levelInWeightListElement}.
     *
     * @param ctx the parse tree
     */
    void enterLevelInWeightListElement(MySQLSQLStatementParser.LevelInWeightListElementContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#levelInWeightListElement}.
     *
     * @param ctx the parse tree
     */
    void exitLevelInWeightListElement(MySQLSQLStatementParser.LevelInWeightListElementContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#aggregateWindowedFunction}.
     *
     * @param ctx the parse tree
     */
    void enterAggregateWindowedFunction(MySQLSQLStatementParser.AggregateWindowedFunctionContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#aggregateWindowedFunction}.
     *
     * @param ctx the parse tree
     */
    void exitAggregateWindowedFunction(MySQLSQLStatementParser.AggregateWindowedFunctionContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#scalarFunctionName}.
     *
     * @param ctx the parse tree
     */
    void enterScalarFunctionName(MySQLSQLStatementParser.ScalarFunctionNameContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#scalarFunctionName}.
     *
     * @param ctx the parse tree
     */
    void exitScalarFunctionName(MySQLSQLStatementParser.ScalarFunctionNameContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#passwordFunctionClause}.
     *
     * @param ctx the parse tree
     */
    void enterPasswordFunctionClause(MySQLSQLStatementParser.PasswordFunctionClauseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#passwordFunctionClause}.
     *
     * @param ctx the parse tree
     */
    void exitPasswordFunctionClause(MySQLSQLStatementParser.PasswordFunctionClauseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#functionArgs}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionArgs(MySQLSQLStatementParser.FunctionArgsContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#functionArgs}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionArgs(MySQLSQLStatementParser.FunctionArgsContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#functionArg}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionArg(MySQLSQLStatementParser.FunctionArgContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#functionArg}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionArg(MySQLSQLStatementParser.FunctionArgContext ctx);

    /**
     * Enter a parse tree produced by the {@code isExpression}
     * labeled alternative in {@link MySQLSQLStatementParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterIsExpression(MySQLSQLStatementParser.IsExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code isExpression}
     * labeled alternative in {@link MySQLSQLStatementParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitIsExpression(MySQLSQLStatementParser.IsExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code notExpression}
     * labeled alternative in {@link MySQLSQLStatementParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterNotExpression(MySQLSQLStatementParser.NotExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code notExpression}
     * labeled alternative in {@link MySQLSQLStatementParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitNotExpression(MySQLSQLStatementParser.NotExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code logicalExpression}
     * labeled alternative in {@link MySQLSQLStatementParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterLogicalExpression(MySQLSQLStatementParser.LogicalExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code logicalExpression}
     * labeled alternative in {@link MySQLSQLStatementParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitLogicalExpression(MySQLSQLStatementParser.LogicalExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code predicateExpression}
     * labeled alternative in {@link MySQLSQLStatementParser#expression}.
     *
     * @param ctx the parse tree
     */
    void enterPredicateExpression(MySQLSQLStatementParser.PredicateExpressionContext ctx);

    /**
     * Exit a parse tree produced by the {@code predicateExpression}
     * labeled alternative in {@link MySQLSQLStatementParser#expression}.
     *
     * @param ctx the parse tree
     */
    void exitPredicateExpression(MySQLSQLStatementParser.PredicateExpressionContext ctx);

    /**
     * Enter a parse tree produced by the {@code soundsLikePredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void enterSoundsLikePredicate(MySQLSQLStatementParser.SoundsLikePredicateContext ctx);

    /**
     * Exit a parse tree produced by the {@code soundsLikePredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void exitSoundsLikePredicate(MySQLSQLStatementParser.SoundsLikePredicateContext ctx);

    /**
     * Enter a parse tree produced by the {@code expressionAtomPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void enterExpressionAtomPredicate(MySQLSQLStatementParser.ExpressionAtomPredicateContext ctx);

    /**
     * Exit a parse tree produced by the {@code expressionAtomPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void exitExpressionAtomPredicate(MySQLSQLStatementParser.ExpressionAtomPredicateContext ctx);

    /**
     * Enter a parse tree produced by the {@code inPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void enterInPredicate(MySQLSQLStatementParser.InPredicateContext ctx);

    /**
     * Exit a parse tree produced by the {@code inPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void exitInPredicate(MySQLSQLStatementParser.InPredicateContext ctx);

    /**
     * Enter a parse tree produced by the {@code subqueryComparasionPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void enterSubqueryComparasionPredicate(MySQLSQLStatementParser.SubqueryComparasionPredicateContext ctx);

    /**
     * Exit a parse tree produced by the {@code subqueryComparasionPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void exitSubqueryComparasionPredicate(MySQLSQLStatementParser.SubqueryComparasionPredicateContext ctx);

    /**
     * Enter a parse tree produced by the {@code betweenPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void enterBetweenPredicate(MySQLSQLStatementParser.BetweenPredicateContext ctx);

    /**
     * Exit a parse tree produced by the {@code betweenPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void exitBetweenPredicate(MySQLSQLStatementParser.BetweenPredicateContext ctx);

    /**
     * Enter a parse tree produced by the {@code binaryComparasionPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void enterBinaryComparasionPredicate(MySQLSQLStatementParser.BinaryComparasionPredicateContext ctx);

    /**
     * Exit a parse tree produced by the {@code binaryComparasionPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void exitBinaryComparasionPredicate(MySQLSQLStatementParser.BinaryComparasionPredicateContext ctx);

    /**
     * Enter a parse tree produced by the {@code isNullPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void enterIsNullPredicate(MySQLSQLStatementParser.IsNullPredicateContext ctx);

    /**
     * Exit a parse tree produced by the {@code isNullPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void exitIsNullPredicate(MySQLSQLStatementParser.IsNullPredicateContext ctx);

    /**
     * Enter a parse tree produced by the {@code likePredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void enterLikePredicate(MySQLSQLStatementParser.LikePredicateContext ctx);

    /**
     * Exit a parse tree produced by the {@code likePredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void exitLikePredicate(MySQLSQLStatementParser.LikePredicateContext ctx);

    /**
     * Enter a parse tree produced by the {@code regexpPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void enterRegexpPredicate(MySQLSQLStatementParser.RegexpPredicateContext ctx);

    /**
     * Exit a parse tree produced by the {@code regexpPredicate}
     * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
     *
     * @param ctx the parse tree
     */
    void exitRegexpPredicate(MySQLSQLStatementParser.RegexpPredicateContext ctx);

    /**
     * Enter a parse tree produced by the {@code unaryExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryExpressionAtom(MySQLSQLStatementParser.UnaryExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code unaryExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryExpressionAtom(MySQLSQLStatementParser.UnaryExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code collateExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterCollateExpressionAtom(MySQLSQLStatementParser.CollateExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code collateExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitCollateExpressionAtom(MySQLSQLStatementParser.CollateExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code subqueryExpessionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterSubqueryExpessionAtom(MySQLSQLStatementParser.SubqueryExpessionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code subqueryExpessionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitSubqueryExpessionAtom(MySQLSQLStatementParser.SubqueryExpessionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code mysqlVariableExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterMysqlVariableExpressionAtom(MySQLSQLStatementParser.MysqlVariableExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code mysqlVariableExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitMysqlVariableExpressionAtom(MySQLSQLStatementParser.MysqlVariableExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code nestedExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterNestedExpressionAtom(MySQLSQLStatementParser.NestedExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code nestedExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitNestedExpressionAtom(MySQLSQLStatementParser.NestedExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code nestedRowExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterNestedRowExpressionAtom(MySQLSQLStatementParser.NestedRowExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code nestedRowExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitNestedRowExpressionAtom(MySQLSQLStatementParser.NestedRowExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code mathExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterMathExpressionAtom(MySQLSQLStatementParser.MathExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code mathExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitMathExpressionAtom(MySQLSQLStatementParser.MathExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code intervalExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalExpressionAtom(MySQLSQLStatementParser.IntervalExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code intervalExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalExpressionAtom(MySQLSQLStatementParser.IntervalExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code existsExpessionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterExistsExpessionAtom(MySQLSQLStatementParser.ExistsExpessionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code existsExpessionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitExistsExpessionAtom(MySQLSQLStatementParser.ExistsExpessionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code constantExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterConstantExpressionAtom(MySQLSQLStatementParser.ConstantExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code constantExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitConstantExpressionAtom(MySQLSQLStatementParser.ConstantExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code functionCallExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionCallExpressionAtom(MySQLSQLStatementParser.FunctionCallExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code functionCallExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionCallExpressionAtom(MySQLSQLStatementParser.FunctionCallExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code binaryExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterBinaryExpressionAtom(MySQLSQLStatementParser.BinaryExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code binaryExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitBinaryExpressionAtom(MySQLSQLStatementParser.BinaryExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code fullColumnNameExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterFullColumnNameExpressionAtom(MySQLSQLStatementParser.FullColumnNameExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code fullColumnNameExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitFullColumnNameExpressionAtom(MySQLSQLStatementParser.FullColumnNameExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by the {@code bitExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void enterBitExpressionAtom(MySQLSQLStatementParser.BitExpressionAtomContext ctx);

    /**
     * Exit a parse tree produced by the {@code bitExpressionAtom}
     * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
     *
     * @param ctx the parse tree
     */
    void exitBitExpressionAtom(MySQLSQLStatementParser.BitExpressionAtomContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#unaryOperator}.
     *
     * @param ctx the parse tree
     */
    void enterUnaryOperator(MySQLSQLStatementParser.UnaryOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#unaryOperator}.
     *
     * @param ctx the parse tree
     */
    void exitUnaryOperator(MySQLSQLStatementParser.UnaryOperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#comparisonOperator}.
     *
     * @param ctx the parse tree
     */
    void enterComparisonOperator(MySQLSQLStatementParser.ComparisonOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#comparisonOperator}.
     *
     * @param ctx the parse tree
     */
    void exitComparisonOperator(MySQLSQLStatementParser.ComparisonOperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#logicalOperator}.
     *
     * @param ctx the parse tree
     */
    void enterLogicalOperator(MySQLSQLStatementParser.LogicalOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#logicalOperator}.
     *
     * @param ctx the parse tree
     */
    void exitLogicalOperator(MySQLSQLStatementParser.LogicalOperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#bitOperator}.
     *
     * @param ctx the parse tree
     */
    void enterBitOperator(MySQLSQLStatementParser.BitOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#bitOperator}.
     *
     * @param ctx the parse tree
     */
    void exitBitOperator(MySQLSQLStatementParser.BitOperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#mathOperator}.
     *
     * @param ctx the parse tree
     */
    void enterMathOperator(MySQLSQLStatementParser.MathOperatorContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#mathOperator}.
     *
     * @param ctx the parse tree
     */
    void exitMathOperator(MySQLSQLStatementParser.MathOperatorContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#charsetNameBase}.
     *
     * @param ctx the parse tree
     */
    void enterCharsetNameBase(MySQLSQLStatementParser.CharsetNameBaseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#charsetNameBase}.
     *
     * @param ctx the parse tree
     */
    void exitCharsetNameBase(MySQLSQLStatementParser.CharsetNameBaseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#transactionLevelBase}.
     *
     * @param ctx the parse tree
     */
    void enterTransactionLevelBase(MySQLSQLStatementParser.TransactionLevelBaseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#transactionLevelBase}.
     *
     * @param ctx the parse tree
     */
    void exitTransactionLevelBase(MySQLSQLStatementParser.TransactionLevelBaseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#privilegesBase}.
     *
     * @param ctx the parse tree
     */
    void enterPrivilegesBase(MySQLSQLStatementParser.PrivilegesBaseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#privilegesBase}.
     *
     * @param ctx the parse tree
     */
    void exitPrivilegesBase(MySQLSQLStatementParser.PrivilegesBaseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#intervalTypeBase}.
     *
     * @param ctx the parse tree
     */
    void enterIntervalTypeBase(MySQLSQLStatementParser.IntervalTypeBaseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#intervalTypeBase}.
     *
     * @param ctx the parse tree
     */
    void exitIntervalTypeBase(MySQLSQLStatementParser.IntervalTypeBaseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#dataTypeBase}.
     *
     * @param ctx the parse tree
     */
    void enterDataTypeBase(MySQLSQLStatementParser.DataTypeBaseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#dataTypeBase}.
     *
     * @param ctx the parse tree
     */
    void exitDataTypeBase(MySQLSQLStatementParser.DataTypeBaseContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#keywordsCanBeId}.
     *
     * @param ctx the parse tree
     */
    void enterKeywordsCanBeId(MySQLSQLStatementParser.KeywordsCanBeIdContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#keywordsCanBeId}.
     *
     * @param ctx the parse tree
     */
    void exitKeywordsCanBeId(MySQLSQLStatementParser.KeywordsCanBeIdContext ctx);

    /**
     * Enter a parse tree produced by {@link MySQLSQLStatementParser#functionNameBase}.
     *
     * @param ctx the parse tree
     */
    void enterFunctionNameBase(MySQLSQLStatementParser.FunctionNameBaseContext ctx);

    /**
     * Exit a parse tree produced by {@link MySQLSQLStatementParser#functionNameBase}.
     *
     * @param ctx the parse tree
     */
    void exitFunctionNameBase(MySQLSQLStatementParser.FunctionNameBaseContext ctx);
}