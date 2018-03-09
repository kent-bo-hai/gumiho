// Generated from /Users/kent/IdeaProjects/github/gumiho/gumiho/src/main/resources/grammars/dialect/mysql/MySQLSQLStatementParser.g4 by ANTLR 4.7
package com.kent.gumiho.sql.dialect.mysql.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySQLSQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySQLSQLStatementParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(MySQLSQLStatementParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(MySQLSQLStatementParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(MySQLSQLStatementParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(MySQLSQLStatementParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#ddlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdlStatement(MySQLSQLStatementParser.DdlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(MySQLSQLStatementParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#transactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionStatement(MySQLSQLStatementParser.TransactionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#replicationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplicationStatement(MySQLSQLStatementParser.ReplicationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#preparedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparedStatement(MySQLSQLStatementParser.PreparedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(MySQLSQLStatementParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#administrationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdministrationStatement(MySQLSQLStatementParser.AdministrationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#utilityStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtilityStatement(MySQLSQLStatementParser.UtilityStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(MySQLSQLStatementParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEvent(MySQLSQLStatementParser.CreateEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(MySQLSQLStatementParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLogfileGroup(MySQLSQLStatementParser.CreateLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(MySQLSQLStatementParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(MySQLSQLStatementParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateServer(MySQLSQLStatementParser.CreateServerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link MySQLSQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyCreateTable(MySQLSQLStatementParser.CopyCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link MySQLSQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryCreateTable(MySQLSQLStatementParser.QueryCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link MySQLSQLStatementParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnCreateTable(MySQLSQLStatementParser.ColumnCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceInnodb(MySQLSQLStatementParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceNdb(MySQLSQLStatementParser.CreateTablespaceNdbContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigger(MySQLSQLStatementParser.CreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(MySQLSQLStatementParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseOption(MySQLSQLStatementParser.CreateDatabaseOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#ownerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnerStatement(MySQLSQLStatementParser.OwnerStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link MySQLSQLStatementParser#scheduleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreciseSchedule(MySQLSQLStatementParser.PreciseScheduleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link MySQLSQLStatementParser#scheduleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalSchedule(MySQLSQLStatementParser.IntervalScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#timestampValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampValue(MySQLSQLStatementParser.TimestampValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#intervalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpr(MySQLSQLStatementParser.IntervalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#intervalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalType(MySQLSQLStatementParser.IntervalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#enableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableType(MySQLSQLStatementParser.EnableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(MySQLSQLStatementParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#indexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOption(MySQLSQLStatementParser.IndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#procedureParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureParameter(MySQLSQLStatementParser.ProcedureParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(MySQLSQLStatementParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineComment(MySQLSQLStatementParser.RoutineCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineLanguage(MySQLSQLStatementParser.RoutineLanguageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineBehavior(MySQLSQLStatementParser.RoutineBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineData(MySQLSQLStatementParser.RoutineDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link MySQLSQLStatementParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineSecurity(MySQLSQLStatementParser.RoutineSecurityContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#serverOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerOption(MySQLSQLStatementParser.ServerOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitions(MySQLSQLStatementParser.CreateDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link MySQLSQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDeclaration(MySQLSQLStatementParser.ColumnDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link MySQLSQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintDeclaration(MySQLSQLStatementParser.ConstraintDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link MySQLSQLStatementParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexDeclaration(MySQLSQLStatementParser.IndexDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(MySQLSQLStatementParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullColumnConstraint(MySQLSQLStatementParser.NullColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultColumnConstraint(MySQLSQLStatementParser.DefaultColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoIncrementColumnConstraint(MySQLSQLStatementParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyColumnConstraint(MySQLSQLStatementParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueKeyColumnConstraint(MySQLSQLStatementParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentColumnConstraint(MySQLSQLStatementParser.CommentColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatColumnConstraint(MySQLSQLStatementParser.FormatColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageColumnConstraint(MySQLSQLStatementParser.StorageColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceColumnConstraint(MySQLSQLStatementParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyTableConstraint(MySQLSQLStatementParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueKeyTableConstraint(MySQLSQLStatementParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyTableConstraint(MySQLSQLStatementParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTableConstraint(MySQLSQLStatementParser.CheckTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#referenceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceDefinition(MySQLSQLStatementParser.ReferenceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#referenceAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceAction(MySQLSQLStatementParser.ReferenceActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#referenceControlType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceControlType(MySQLSQLStatementParser.ReferenceControlTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link MySQLSQLStatementParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIndexDeclaration(MySQLSQLStatementParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link MySQLSQLStatementParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialIndexDeclaration(MySQLSQLStatementParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionEngine(MySQLSQLStatementParser.TableOptionEngineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionAutoIncrement(MySQLSQLStatementParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionAverage(MySQLSQLStatementParser.TableOptionAverageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionCharset(MySQLSQLStatementParser.TableOptionCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionChecksum(MySQLSQLStatementParser.TableOptionChecksumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionCollate(MySQLSQLStatementParser.TableOptionCollateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionComment(MySQLSQLStatementParser.TableOptionCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionCompression(MySQLSQLStatementParser.TableOptionCompressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionConnection(MySQLSQLStatementParser.TableOptionConnectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionDataDirectory(MySQLSQLStatementParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionDelay(MySQLSQLStatementParser.TableOptionDelayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionEncryption(MySQLSQLStatementParser.TableOptionEncryptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionIndexDirectory(MySQLSQLStatementParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionInsertMethod(MySQLSQLStatementParser.TableOptionInsertMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionKeyBlockSize(MySQLSQLStatementParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionMaxRows(MySQLSQLStatementParser.TableOptionMaxRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionMinRows(MySQLSQLStatementParser.TableOptionMinRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionPackKeys(MySQLSQLStatementParser.TableOptionPackKeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionPassword(MySQLSQLStatementParser.TableOptionPasswordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionRowFormat(MySQLSQLStatementParser.TableOptionRowFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionRecalculation(MySQLSQLStatementParser.TableOptionRecalculationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionPersistent(MySQLSQLStatementParser.TableOptionPersistentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionSamplePage(MySQLSQLStatementParser.TableOptionSamplePageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionTablespace(MySQLSQLStatementParser.TableOptionTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionUnion(MySQLSQLStatementParser.TableOptionUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespaceStorage(MySQLSQLStatementParser.TablespaceStorageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinitions(MySQLSQLStatementParser.PartitionDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionHash(MySQLSQLStatementParser.PartitionFunctionHashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionKey(MySQLSQLStatementParser.PartitionFunctionKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionRange(MySQLSQLStatementParser.PartitionFunctionRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionList(MySQLSQLStatementParser.PartitionFunctionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link MySQLSQLStatementParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPartitionFunctionHash(MySQLSQLStatementParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link MySQLSQLStatementParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPartitionFunctionKey(MySQLSQLStatementParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionComparision(MySQLSQLStatementParser.PartitionComparisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionListAtom(MySQLSQLStatementParser.PartitionListAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionListVector(MySQLSQLStatementParser.PartitionListVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSimple(MySQLSQLStatementParser.PartitionSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinerAtom(MySQLSQLStatementParser.PartitionDefinerAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinerVector(MySQLSQLStatementParser.PartitionDefinerVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartitionDefinition(MySQLSQLStatementParser.SubpartitionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionEngine(MySQLSQLStatementParser.PartitionOptionEngineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionComment(MySQLSQLStatementParser.PartitionOptionCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionDataDirectory(MySQLSQLStatementParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionIndexDirectory(MySQLSQLStatementParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionMaxRows(MySQLSQLStatementParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionMinRows(MySQLSQLStatementParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionTablespace(MySQLSQLStatementParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link MySQLSQLStatementParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionNodeGroup(MySQLSQLStatementParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSimpleDatabase(MySQLSQLStatementParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUpgradeName(MySQLSQLStatementParser.AlterUpgradeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#alterEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEvent(MySQLSQLStatementParser.AlterEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#alterFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunction(MySQLSQLStatementParser.AlterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#alterInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterInstance(MySQLSQLStatementParser.AlterInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLogfileGroup(MySQLSQLStatementParser.AlterLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#alterProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedure(MySQLSQLStatementParser.AlterProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#alterServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterServer(MySQLSQLStatementParser.AlterServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(MySQLSQLStatementParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#alterTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespace(MySQLSQLStatementParser.AlterTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#alterView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterView(MySQLSQLStatementParser.AlterViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByTableOption(MySQLSQLStatementParser.AlterByTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddColumn(MySQLSQLStatementParser.AlterByAddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddColumns(MySQLSQLStatementParser.AlterByAddColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddIndex(MySQLSQLStatementParser.AlterByAddIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddPrimaryKey(MySQLSQLStatementParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddUniqueKey(MySQLSQLStatementParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddSpecialIndex(MySQLSQLStatementParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddForeignKey(MySQLSQLStatementParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterBySetAlgorithm(MySQLSQLStatementParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByChangeDefault(MySQLSQLStatementParser.AlterByChangeDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByChangeColumn(MySQLSQLStatementParser.AlterByChangeColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByLock(MySQLSQLStatementParser.AlterByLockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByModifyColumn(MySQLSQLStatementParser.AlterByModifyColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropColumn(MySQLSQLStatementParser.AlterByDropColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropPrimaryKey(MySQLSQLStatementParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropIndex(MySQLSQLStatementParser.AlterByDropIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropForeignKey(MySQLSQLStatementParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDisableKeys(MySQLSQLStatementParser.AlterByDisableKeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByEnableKeys(MySQLSQLStatementParser.AlterByEnableKeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRename(MySQLSQLStatementParser.AlterByRenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByOrder(MySQLSQLStatementParser.AlterByOrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByConvertCharset(MySQLSQLStatementParser.AlterByConvertCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDefaultCharset(MySQLSQLStatementParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDiscardTablespace(MySQLSQLStatementParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByImportTablespace(MySQLSQLStatementParser.AlterByImportTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByForce(MySQLSQLStatementParser.AlterByForceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByValidate(MySQLSQLStatementParser.AlterByValidateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddPartition(MySQLSQLStatementParser.AlterByAddPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropPartition(MySQLSQLStatementParser.AlterByDropPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDiscardPartition(MySQLSQLStatementParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByImportPartition(MySQLSQLStatementParser.AlterByImportPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByTruncatePartition(MySQLSQLStatementParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByCoalescePartition(MySQLSQLStatementParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByReorganizePartition(MySQLSQLStatementParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByExchangePartition(MySQLSQLStatementParser.AlterByExchangePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAnalyzePartitiion}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAnalyzePartitiion(MySQLSQLStatementParser.AlterByAnalyzePartitiionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByCheckPartition(MySQLSQLStatementParser.AlterByCheckPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByOptimizePartition(MySQLSQLStatementParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRebuildPartition(MySQLSQLStatementParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRepairPartition(MySQLSQLStatementParser.AlterByRepairPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRemovePartitioning(MySQLSQLStatementParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByUpgradePartitioning(MySQLSQLStatementParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(MySQLSQLStatementParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropEvent(MySQLSQLStatementParser.DropEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(MySQLSQLStatementParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropLogfileGroup(MySQLSQLStatementParser.DropLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropProcedure(MySQLSQLStatementParser.DropProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(MySQLSQLStatementParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropServer(MySQLSQLStatementParser.DropServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(MySQLSQLStatementParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablespace(MySQLSQLStatementParser.DropTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrigger(MySQLSQLStatementParser.DropTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(MySQLSQLStatementParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#renameTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(MySQLSQLStatementParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#renameTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableClause(MySQLSQLStatementParser.RenameTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(MySQLSQLStatementParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(MySQLSQLStatementParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(MySQLSQLStatementParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(MySQLSQLStatementParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerStatement(MySQLSQLStatementParser.HandlerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(MySQLSQLStatementParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadDataStatement(MySQLSQLStatementParser.LoadDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadXmlStatement(MySQLSQLStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#replaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceStatement(MySQLSQLStatementParser.ReplaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelect(MySQLSQLStatementParser.SimpleSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisSelect(MySQLSQLStatementParser.ParenthesisSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionSelect(MySQLSQLStatementParser.UnionSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link MySQLSQLStatementParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionParenthesisSelect(MySQLSQLStatementParser.UnionParenthesisSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(MySQLSQLStatementParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#insertStatementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatementValue(MySQLSQLStatementParser.InsertStatementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#updatedElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdatedElement(MySQLSQLStatementParser.UpdatedElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#assignmentField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentField(MySQLSQLStatementParser.AssignmentFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(MySQLSQLStatementParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDeleteStatement(MySQLSQLStatementParser.SingleDeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleDeleteStatement(MySQLSQLStatementParser.MultipleDeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerOpenStatement(MySQLSQLStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadIndexStatement(MySQLSQLStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadStatement(MySQLSQLStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerCloseStatement(MySQLSQLStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleUpdateStatement(MySQLSQLStatementParser.SingleUpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleUpdateStatement(MySQLSQLStatementParser.MultipleUpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(MySQLSQLStatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#orderByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpression(MySQLSQLStatementParser.OrderByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#tableSources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSources(MySQLSQLStatementParser.TableSourcesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceBase(MySQLSQLStatementParser.TableSourceBaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceNested(MySQLSQLStatementParser.TableSourceNestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomTableItem(MySQLSQLStatementParser.AtomTableItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryTableItem(MySQLSQLStatementParser.SubqueryTableItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link MySQLSQLStatementParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourcesItem(MySQLSQLStatementParser.TableSourcesItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#indexHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHint(MySQLSQLStatementParser.IndexHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#indexHintType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintType(MySQLSQLStatementParser.IndexHintTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoin(MySQLSQLStatementParser.InnerJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStraightJoin(MySQLSQLStatementParser.StraightJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterJoin(MySQLSQLStatementParser.OuterJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link MySQLSQLStatementParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoin(MySQLSQLStatementParser.NaturalJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpression(MySQLSQLStatementParser.QueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionNointo(MySQLSQLStatementParser.QueryExpressionNointoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(MySQLSQLStatementParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecificationNointo(MySQLSQLStatementParser.QuerySpecificationNointoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#unionParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionParenthesis(MySQLSQLStatementParser.UnionParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#unionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionStatement(MySQLSQLStatementParser.UnionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#selectSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpec(MySQLSQLStatementParser.SelectSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(MySQLSQLStatementParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStarElement(MySQLSQLStatementParser.SelectStarElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnElement(MySQLSQLStatementParser.SelectColumnElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionElement(MySQLSQLStatementParser.SelectFunctionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link MySQLSQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpressionElement(MySQLSQLStatementParser.SelectExpressionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link MySQLSQLStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoVariables(MySQLSQLStatementParser.SelectIntoVariablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link MySQLSQLStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoDumpFile(MySQLSQLStatementParser.SelectIntoDumpFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link MySQLSQLStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoTextFile(MySQLSQLStatementParser.SelectIntoTextFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFieldsInto(MySQLSQLStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLinesInto(MySQLSQLStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(MySQLSQLStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(MySQLSQLStatementParser.GroupByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(MySQLSQLStatementParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#startTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTransaction(MySQLSQLStatementParser.StartTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#beginWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginWork(MySQLSQLStatementParser.BeginWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#commitWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitWork(MySQLSQLStatementParser.CommitWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#rollbackWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackWork(MySQLSQLStatementParser.RollbackWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#savepointStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepointStatement(MySQLSQLStatementParser.SavepointStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#rollbackStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackStatement(MySQLSQLStatementParser.RollbackStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#releaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseStatement(MySQLSQLStatementParser.ReleaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#lockTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockTables(MySQLSQLStatementParser.LockTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#unlockTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlockTables(MySQLSQLStatementParser.UnlockTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAutocommitStatement(MySQLSQLStatementParser.SetAutocommitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransactionStatement(MySQLSQLStatementParser.SetTransactionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#transactionMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionMode(MySQLSQLStatementParser.TransactionModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#lockTableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockTableElement(MySQLSQLStatementParser.LockTableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#lockAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockAction(MySQLSQLStatementParser.LockActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#transactionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionOption(MySQLSQLStatementParser.TransactionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#transactionLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionLevel(MySQLSQLStatementParser.TransactionLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#changeMaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeMaster(MySQLSQLStatementParser.ChangeMasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeReplicationFilter(MySQLSQLStatementParser.ChangeReplicationFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurgeBinaryLogs(MySQLSQLStatementParser.PurgeBinaryLogsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#resetMaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetMaster(MySQLSQLStatementParser.ResetMasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#resetSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetSlave(MySQLSQLStatementParser.ResetSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#startSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartSlave(MySQLSQLStatementParser.StartSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#stopSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopSlave(MySQLSQLStatementParser.StopSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#startGroupReplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartGroupReplication(MySQLSQLStatementParser.StartGroupReplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopGroupReplication(MySQLSQLStatementParser.StopGroupReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterStringOption(MySQLSQLStatementParser.MasterStringOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterDecimalOption(MySQLSQLStatementParser.MasterDecimalOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterBoolOption(MySQLSQLStatementParser.MasterBoolOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterRealOption(MySQLSQLStatementParser.MasterRealOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterUidListOption(MySQLSQLStatementParser.MasterUidListOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#stringMasterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringMasterOption(MySQLSQLStatementParser.StringMasterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalMasterOption(MySQLSQLStatementParser.DecimalMasterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#boolMasterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolMasterOption(MySQLSQLStatementParser.BoolMasterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#channelOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelOption(MySQLSQLStatementParser.ChannelOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoDbReplication(MySQLSQLStatementParser.DoDbReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreDbReplication(MySQLSQLStatementParser.IgnoreDbReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoTableReplication(MySQLSQLStatementParser.DoTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreTableReplication(MySQLSQLStatementParser.IgnoreTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildDoTableReplication(MySQLSQLStatementParser.WildDoTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildIgnoreTableReplication(MySQLSQLStatementParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link MySQLSQLStatementParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewriteDbReplication(MySQLSQLStatementParser.RewriteDbReplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#tablePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePair(MySQLSQLStatementParser.TablePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#threadType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreadType(MySQLSQLStatementParser.ThreadTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtidsUntilOption(MySQLSQLStatementParser.GtidsUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterLogUntilOption(MySQLSQLStatementParser.MasterLogUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelayLogUntilOption(MySQLSQLStatementParser.RelayLogUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlGapsUntilOption(MySQLSQLStatementParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserConnectionOption(MySQLSQLStatementParser.UserConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordConnectionOption(MySQLSQLStatementParser.PasswordConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultAuthConnectionOption(MySQLSQLStatementParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginDirConnectionOption(MySQLSQLStatementParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#gtuidSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtuidSet(MySQLSQLStatementParser.GtuidSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaStartTransaction(MySQLSQLStatementParser.XaStartTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaEndTransaction(MySQLSQLStatementParser.XaEndTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaPrepareStatement(MySQLSQLStatementParser.XaPrepareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#xaCommitWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaCommitWork(MySQLSQLStatementParser.XaCommitWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaRollbackWork(MySQLSQLStatementParser.XaRollbackWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaRecoverWork(MySQLSQLStatementParser.XaRecoverWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#prepareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareStatement(MySQLSQLStatementParser.PrepareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#executeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStatement(MySQLSQLStatementParser.ExecuteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocatePrepare(MySQLSQLStatementParser.DeallocatePrepareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#routineBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineBody(MySQLSQLStatementParser.RoutineBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(MySQLSQLStatementParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(MySQLSQLStatementParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MySQLSQLStatementParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#iterateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterateStatement(MySQLSQLStatementParser.IterateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#leaveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeaveStatement(MySQLSQLStatementParser.LeaveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(MySQLSQLStatementParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(MySQLSQLStatementParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MySQLSQLStatementParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MySQLSQLStatementParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link MySQLSQLStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseCursor(MySQLSQLStatementParser.CloseCursorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link MySQLSQLStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchCursor(MySQLSQLStatementParser.FetchCursorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link MySQLSQLStatementParser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenCursor(MySQLSQLStatementParser.OpenCursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#declareVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVariable(MySQLSQLStatementParser.DeclareVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#declareCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCondition(MySQLSQLStatementParser.DeclareConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#declareCursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCursor(MySQLSQLStatementParser.DeclareCursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#declareHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareHandler(MySQLSQLStatementParser.DeclareHandlerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionCode(MySQLSQLStatementParser.HandlerConditionCodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionState(MySQLSQLStatementParser.HandlerConditionStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionName(MySQLSQLStatementParser.HandlerConditionNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionWarning(MySQLSQLStatementParser.HandlerConditionWarningContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionNotfound(MySQLSQLStatementParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link MySQLSQLStatementParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionException(MySQLSQLStatementParser.HandlerConditionExceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureSqlStatement(MySQLSQLStatementParser.ProcedureSqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#caseAlternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseAlternative(MySQLSQLStatementParser.CaseAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#elifAlternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifAlternative(MySQLSQLStatementParser.ElifAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMysqlV56(MySQLSQLStatementParser.AlterUserMysqlV56Context ctx);
	/**
	 * Visit a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link MySQLSQLStatementParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMysqlV57(MySQLSQLStatementParser.AlterUserMysqlV57Context ctx);
	/**
	 * Visit a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link MySQLSQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMysqlV56(MySQLSQLStatementParser.CreateUserMysqlV56Context ctx);
	/**
	 * Visit a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link MySQLSQLStatementParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMysqlV57(MySQLSQLStatementParser.CreateUserMysqlV57Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dropUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUser(MySQLSQLStatementParser.DropUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#grantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantStatement(MySQLSQLStatementParser.GrantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#grantProxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantProxy(MySQLSQLStatementParser.GrantProxyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#renameUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameUser(MySQLSQLStatementParser.RenameUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link MySQLSQLStatementParser#revokeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetailRevoke(MySQLSQLStatementParser.DetailRevokeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link MySQLSQLStatementParser#revokeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortRevoke(MySQLSQLStatementParser.ShortRevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#revokeProxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeProxy(MySQLSQLStatementParser.RevokeProxyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPasswordStatement(MySQLSQLStatementParser.SetPasswordStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#userSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserSpecification(MySQLSQLStatementParser.UserSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordAuthOption(MySQLSQLStatementParser.PasswordAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAuthOption(MySQLSQLStatementParser.StringAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashAuthOption(MySQLSQLStatementParser.HashAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAuthOption(MySQLSQLStatementParser.SimpleAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#tlsOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTlsOption(MySQLSQLStatementParser.TlsOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#userResourceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserResourceOption(MySQLSQLStatementParser.UserResourceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#userPasswordOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserPasswordOption(MySQLSQLStatementParser.UserPasswordOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#userLockOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserLockOption(MySQLSQLStatementParser.UserLockOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#privelegeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivelegeClause(MySQLSQLStatementParser.PrivelegeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(MySQLSQLStatementParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentSchemaPriviLevel(MySQLSQLStatementParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalPrivLevel(MySQLSQLStatementParser.GlobalPrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniteSchemaPrivLevel(MySQLSQLStatementParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniteFullTablePrivLevel(MySQLSQLStatementParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link MySQLSQLStatementParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniteTablePrivLevel(MySQLSQLStatementParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#renameUserClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameUserClause(MySQLSQLStatementParser.RenameUserClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeTable(MySQLSQLStatementParser.AnalyzeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#checkTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTable(MySQLSQLStatementParser.CheckTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecksumTable(MySQLSQLStatementParser.ChecksumTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeTable(MySQLSQLStatementParser.OptimizeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#repairTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(MySQLSQLStatementParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#checkTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTableOption(MySQLSQLStatementParser.CheckTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#createUdfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUdfunction(MySQLSQLStatementParser.CreateUdfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallPlugin(MySQLSQLStatementParser.InstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstallPlugin(MySQLSQLStatementParser.UninstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(MySQLSQLStatementParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCharset(MySQLSQLStatementParser.SetCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNames(MySQLSQLStatementParser.SetNamesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPassword(MySQLSQLStatementParser.SetPasswordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(MySQLSQLStatementParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link MySQLSQLStatementParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAutocommit(MySQLSQLStatementParser.SetAutocommitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMasterLogs(MySQLSQLStatementParser.ShowMasterLogsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLogEvents(MySQLSQLStatementParser.ShowLogEventsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowObjectFilter(MySQLSQLStatementParser.ShowObjectFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(MySQLSQLStatementParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateDb(MySQLSQLStatementParser.ShowCreateDbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateFullIdObject(MySQLSQLStatementParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateUser(MySQLSQLStatementParser.ShowCreateUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEngine(MySQLSQLStatementParser.ShowEngineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGlobalInfo(MySQLSQLStatementParser.ShowGlobalInfoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowErrors(MySQLSQLStatementParser.ShowErrorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCountErrors(MySQLSQLStatementParser.ShowCountErrorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSchemaFilter(MySQLSQLStatementParser.ShowSchemaFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRoutine(MySQLSQLStatementParser.ShowRoutineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGrants(MySQLSQLStatementParser.ShowGrantsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowIndexes(MySQLSQLStatementParser.ShowIndexesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowOpenTables(MySQLSQLStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfile(MySQLSQLStatementParser.ShowProfileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link MySQLSQLStatementParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSlaveStatus(MySQLSQLStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#variableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableClause(MySQLSQLStatementParser.VariableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#showCommonEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCommonEntity(MySQLSQLStatementParser.ShowCommonEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#showFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFilter(MySQLSQLStatementParser.ShowFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGlobalInfoClause(MySQLSQLStatementParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSchemaEntity(MySQLSQLStatementParser.ShowSchemaEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfileType(MySQLSQLStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#binlogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinlogStatement(MySQLSQLStatementParser.BinlogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheIndexStatement(MySQLSQLStatementParser.CacheIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#flushStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlushStatement(MySQLSQLStatementParser.FlushStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#killStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKillStatement(MySQLSQLStatementParser.KillStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadIndexIntoCache(MySQLSQLStatementParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetStatement(MySQLSQLStatementParser.ResetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#shutdownStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShutdownStatement(MySQLSQLStatementParser.ShutdownStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#tableIndexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIndexes(MySQLSQLStatementParser.TableIndexesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#flushOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFlushOption(MySQLSQLStatementParser.SimpleFlushOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#flushOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelFlushOption(MySQLSQLStatementParser.ChannelFlushOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link MySQLSQLStatementParser#flushOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFlushOption(MySQLSQLStatementParser.TableFlushOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#flushTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlushTableOption(MySQLSQLStatementParser.FlushTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadedTableIndexes(MySQLSQLStatementParser.LoadedTableIndexesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDescribeStatement(MySQLSQLStatementParser.SimpleDescribeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullDescribeStatement(MySQLSQLStatementParser.FullDescribeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#helpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelpStatement(MySQLSQLStatementParser.HelpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#useStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStatement(MySQLSQLStatementParser.UseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link MySQLSQLStatementParser#describeObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeStatements(MySQLSQLStatementParser.DescribeStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link MySQLSQLStatementParser#describeObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeConnection(MySQLSQLStatementParser.DescribeConnectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#fullId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullId(MySQLSQLStatementParser.FullIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(MySQLSQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#fullColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnName(MySQLSQLStatementParser.FullColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#indexColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexColumnName(MySQLSQLStatementParser.IndexColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#userName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserName(MySQLSQLStatementParser.UserNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#mysqlVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlVariable(MySQLSQLStatementParser.MysqlVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#charsetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetName(MySQLSQLStatementParser.CharsetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(MySQLSQLStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#engineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineName(MySQLSQLStatementParser.EngineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#uuidSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUuidSet(MySQLSQLStatementParser.UuidSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#xid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXid(MySQLSQLStatementParser.XidContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#xuidStringId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXuidStringId(MySQLSQLStatementParser.XuidStringIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#authPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthPlugin(MySQLSQLStatementParser.AuthPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(MySQLSQLStatementParser.UidContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#simpleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleId(MySQLSQLStatementParser.SimpleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dottedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedId(MySQLSQLStatementParser.DottedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(MySQLSQLStatementParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSizeLiteral(MySQLSQLStatementParser.FileSizeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(MySQLSQLStatementParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(MySQLSQLStatementParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiteral(MySQLSQLStatementParser.HexadecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#nullNotnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullNotnull(MySQLSQLStatementParser.NullNotnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MySQLSQLStatementParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDataType(MySQLSQLStatementParser.StringDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionDataType(MySQLSQLStatementParser.DimensionDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDataType(MySQLSQLStatementParser.SimpleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionDataType(MySQLSQLStatementParser.CollectionDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link MySQLSQLStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpatialDataType(MySQLSQLStatementParser.SpatialDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#convertedDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertedDataType(MySQLSQLStatementParser.ConvertedDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthOneDimension(MySQLSQLStatementParser.LengthOneDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthTwoDimension(MySQLSQLStatementParser.LengthTwoDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthTwoOptionalDimension(MySQLSQLStatementParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#uidList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUidList(MySQLSQLStatementParser.UidListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTables(MySQLSQLStatementParser.TablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#indexColumnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexColumnNames(MySQLSQLStatementParser.IndexColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(MySQLSQLStatementParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsWithDefaults(MySQLSQLStatementParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants(MySQLSQLStatementParser.ConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#simpleStrings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStrings(MySQLSQLStatementParser.SimpleStringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#userVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariables(MySQLSQLStatementParser.UserVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(MySQLSQLStatementParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrDefault(MySQLSQLStatementParser.ExpressionOrDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(MySQLSQLStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(MySQLSQLStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificFunctionCall(MySQLSQLStatementParser.SpecificFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunctionCall(MySQLSQLStatementParser.AggregateFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunctionCall(MySQLSQLStatementParser.ScalarFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfFunctionCall(MySQLSQLStatementParser.UdfFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordFunctionCall(MySQLSQLStatementParser.PasswordFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFunctionCall(MySQLSQLStatementParser.SimpleFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeFunctionCall(MySQLSQLStatementParser.DataTypeFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesFunctionCall(MySQLSQLStatementParser.ValuesFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseFunctionCall(MySQLSQLStatementParser.CaseFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunctionCall(MySQLSQLStatementParser.CharFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunctionCall(MySQLSQLStatementParser.PositionFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrFunctionCall(MySQLSQLStatementParser.SubstrFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunctionCall(MySQLSQLStatementParser.TrimFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightFunctionCall(MySQLSQLStatementParser.WeightFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunctionCall(MySQLSQLStatementParser.ExtractFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link MySQLSQLStatementParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFormatFunctionCall(MySQLSQLStatementParser.GetFormatFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseFuncAlternative(MySQLSQLStatementParser.CaseFuncAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link MySQLSQLStatementParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelWeightList(MySQLSQLStatementParser.LevelWeightListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link MySQLSQLStatementParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelWeightRange(MySQLSQLStatementParser.LevelWeightRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelInWeightListElement(MySQLSQLStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWindowedFunction(MySQLSQLStatementParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunctionName(MySQLSQLStatementParser.ScalarFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordFunctionClause(MySQLSQLStatementParser.PasswordFunctionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgs(MySQLSQLStatementParser.FunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(MySQLSQLStatementParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link MySQLSQLStatementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpression(MySQLSQLStatementParser.IsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MySQLSQLStatementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(MySQLSQLStatementParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link MySQLSQLStatementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(MySQLSQLStatementParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link MySQLSQLStatementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateExpression(MySQLSQLStatementParser.PredicateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoundsLikePredicate(MySQLSQLStatementParser.SoundsLikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtomPredicate(MySQLSQLStatementParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(MySQLSQLStatementParser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryComparasionPredicate(MySQLSQLStatementParser.SubqueryComparasionPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(MySQLSQLStatementParser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComparasionPredicate(MySQLSQLStatementParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullPredicate(MySQLSQLStatementParser.IsNullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(MySQLSQLStatementParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link MySQLSQLStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexpPredicate(MySQLSQLStatementParser.RegexpPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionAtom(MySQLSQLStatementParser.UnaryExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateExpressionAtom(MySQLSQLStatementParser.CollateExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpessionAtom(MySQLSQLStatementParser.SubqueryExpessionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlVariableExpressionAtom(MySQLSQLStatementParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpressionAtom(MySQLSQLStatementParser.NestedExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedRowExpressionAtom(MySQLSQLStatementParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionAtom(MySQLSQLStatementParser.MathExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpressionAtom(MySQLSQLStatementParser.IntervalExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExpessionAtom(MySQLSQLStatementParser.ExistsExpessionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpressionAtom(MySQLSQLStatementParser.ConstantExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpressionAtom(MySQLSQLStatementParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionAtom(MySQLSQLStatementParser.BinaryExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnNameExpressionAtom(MySQLSQLStatementParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link MySQLSQLStatementParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpressionAtom(MySQLSQLStatementParser.BitExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(MySQLSQLStatementParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(MySQLSQLStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(MySQLSQLStatementParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#bitOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOperator(MySQLSQLStatementParser.BitOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#mathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperator(MySQLSQLStatementParser.MathOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#charsetNameBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetNameBase(MySQLSQLStatementParser.CharsetNameBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionLevelBase(MySQLSQLStatementParser.TransactionLevelBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#privilegesBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegesBase(MySQLSQLStatementParser.PrivilegesBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalTypeBase(MySQLSQLStatementParser.IntervalTypeBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#dataTypeBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeBase(MySQLSQLStatementParser.DataTypeBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordsCanBeId(MySQLSQLStatementParser.KeywordsCanBeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLSQLStatementParser#functionNameBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNameBase(MySQLSQLStatementParser.FunctionNameBaseContext ctx);
}