package com.kent.gumiho.sql.basic.visitor;

import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.parser.SQLStatementParser;
import com.kent.gumiho.sql.basic.parser.SQLStatementParserVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

/**
 * @author kongtong.ouyang on 2018/3/6.
 */
public class SQLASTBuilderVisitor implements SQLStatementParserVisitor<Boolean> {

    private final List<SQLStatement> statementList;

    public SQLASTBuilderVisitor(List<SQLStatement> statementList) {
        this.statementList = statementList;
    }

    @Override
    public Boolean visitParse(SQLStatementParser.ParseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSqlStatements(SQLStatementParser.SqlStatementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSqlStatement(SQLStatementParser.SqlStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitEmptyStatement(SQLStatementParser.EmptyStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDdlStatement(SQLStatementParser.DdlStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDmlStatement(SQLStatementParser.DmlStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTransactionStatement(SQLStatementParser.TransactionStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReplicationStatement(SQLStatementParser.ReplicationStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPreparedStatement(SQLStatementParser.PreparedStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCompoundStatement(SQLStatementParser.CompoundStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAdministrationStatement(SQLStatementParser.AdministrationStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUtilityStatement(SQLStatementParser.UtilityStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateDatabase(SQLStatementParser.CreateDatabaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateEvent(SQLStatementParser.CreateEventContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateIndex(SQLStatementParser.CreateIndexContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateLogfileGroup(SQLStatementParser.CreateLogfileGroupContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateProcedure(SQLStatementParser.CreateProcedureContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateFunction(SQLStatementParser.CreateFunctionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateServer(SQLStatementParser.CreateServerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCopyCreateTable(SQLStatementParser.CopyCreateTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQueryCreateTable(SQLStatementParser.QueryCreateTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitColumnCreateTable(SQLStatementParser.ColumnCreateTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateTablespace(SQLStatementParser.CreateTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateTablespaceInnodb(SQLStatementParser.CreateTablespaceInnodbContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateTablespaceNdb(SQLStatementParser.CreateTablespaceNdbContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateTrigger(SQLStatementParser.CreateTriggerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateView(SQLStatementParser.CreateViewContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateDatabaseOption(SQLStatementParser.CreateDatabaseOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOwnerStatement(SQLStatementParser.OwnerStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPreciseSchedule(SQLStatementParser.PreciseScheduleContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIntervalSchedule(SQLStatementParser.IntervalScheduleContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTimestampValue(SQLStatementParser.TimestampValueContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIntervalExpr(SQLStatementParser.IntervalExprContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIntervalType(SQLStatementParser.IntervalTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitEnableType(SQLStatementParser.EnableTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexType(SQLStatementParser.IndexTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexOption(SQLStatementParser.IndexOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitProcedureParameter(SQLStatementParser.ProcedureParameterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunctionParameter(SQLStatementParser.FunctionParameterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineComment(SQLStatementParser.RoutineCommentContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineLanguage(SQLStatementParser.RoutineLanguageContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineBehavior(SQLStatementParser.RoutineBehaviorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineData(SQLStatementParser.RoutineDataContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineSecurity(SQLStatementParser.RoutineSecurityContext ctx) {
        return null;
    }

    @Override
    public Boolean visitServerOption(SQLStatementParser.ServerOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateDefinitions(SQLStatementParser.CreateDefinitionsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitColumnDeclaration(SQLStatementParser.ColumnDeclarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstraintDeclaration(SQLStatementParser.ConstraintDeclarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexDeclaration(SQLStatementParser.IndexDeclarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitColumnDefinition(SQLStatementParser.ColumnDefinitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNullColumnConstraint(SQLStatementParser.NullColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefaultColumnConstraint(SQLStatementParser.DefaultColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAutoIncrementColumnConstraint(SQLStatementParser.AutoIncrementColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrimaryKeyColumnConstraint(SQLStatementParser.PrimaryKeyColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUniqueKeyColumnConstraint(SQLStatementParser.UniqueKeyColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCommentColumnConstraint(SQLStatementParser.CommentColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFormatColumnConstraint(SQLStatementParser.FormatColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStorageColumnConstraint(SQLStatementParser.StorageColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReferenceColumnConstraint(SQLStatementParser.ReferenceColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrimaryKeyTableConstraint(SQLStatementParser.PrimaryKeyTableConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUniqueKeyTableConstraint(SQLStatementParser.UniqueKeyTableConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitForeignKeyTableConstraint(SQLStatementParser.ForeignKeyTableConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCheckTableConstraint(SQLStatementParser.CheckTableConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReferenceDefinition(SQLStatementParser.ReferenceDefinitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReferenceAction(SQLStatementParser.ReferenceActionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReferenceControlType(SQLStatementParser.ReferenceControlTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleIndexDeclaration(SQLStatementParser.SimpleIndexDeclarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSpecialIndexDeclaration(SQLStatementParser.SpecialIndexDeclarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionEngine(SQLStatementParser.TableOptionEngineContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionAutoIncrement(SQLStatementParser.TableOptionAutoIncrementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionAverage(SQLStatementParser.TableOptionAverageContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionCharset(SQLStatementParser.TableOptionCharsetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionChecksum(SQLStatementParser.TableOptionChecksumContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionCollate(SQLStatementParser.TableOptionCollateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionComment(SQLStatementParser.TableOptionCommentContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionCompression(SQLStatementParser.TableOptionCompressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionConnection(SQLStatementParser.TableOptionConnectionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionDataDirectory(SQLStatementParser.TableOptionDataDirectoryContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionDelay(SQLStatementParser.TableOptionDelayContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionEncryption(SQLStatementParser.TableOptionEncryptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionIndexDirectory(SQLStatementParser.TableOptionIndexDirectoryContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionInsertMethod(SQLStatementParser.TableOptionInsertMethodContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionKeyBlockSize(SQLStatementParser.TableOptionKeyBlockSizeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionMaxRows(SQLStatementParser.TableOptionMaxRowsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionMinRows(SQLStatementParser.TableOptionMinRowsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionPackKeys(SQLStatementParser.TableOptionPackKeysContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionPassword(SQLStatementParser.TableOptionPasswordContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionRowFormat(SQLStatementParser.TableOptionRowFormatContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionRecalculation(SQLStatementParser.TableOptionRecalculationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionPersistent(SQLStatementParser.TableOptionPersistentContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionSamplePage(SQLStatementParser.TableOptionSamplePageContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionTablespace(SQLStatementParser.TableOptionTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionUnion(SQLStatementParser.TableOptionUnionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTablespaceStorage(SQLStatementParser.TablespaceStorageContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionDefinitions(SQLStatementParser.PartitionDefinitionsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionFunctionHash(SQLStatementParser.PartitionFunctionHashContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionFunctionKey(SQLStatementParser.PartitionFunctionKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionFunctionRange(SQLStatementParser.PartitionFunctionRangeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionFunctionList(SQLStatementParser.PartitionFunctionListContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubPartitionFunctionHash(SQLStatementParser.SubPartitionFunctionHashContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubPartitionFunctionKey(SQLStatementParser.SubPartitionFunctionKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionComparision(SQLStatementParser.PartitionComparisionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionListAtom(SQLStatementParser.PartitionListAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionListVector(SQLStatementParser.PartitionListVectorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionSimple(SQLStatementParser.PartitionSimpleContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionDefinerAtom(SQLStatementParser.PartitionDefinerAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionDefinerVector(SQLStatementParser.PartitionDefinerVectorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubpartitionDefinition(SQLStatementParser.SubpartitionDefinitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionEngine(SQLStatementParser.PartitionOptionEngineContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionComment(SQLStatementParser.PartitionOptionCommentContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionDataDirectory(SQLStatementParser.PartitionOptionDataDirectoryContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionIndexDirectory(SQLStatementParser.PartitionOptionIndexDirectoryContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionMaxRows(SQLStatementParser.PartitionOptionMaxRowsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionMinRows(SQLStatementParser.PartitionOptionMinRowsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionTablespace(SQLStatementParser.PartitionOptionTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionNodeGroup(SQLStatementParser.PartitionOptionNodeGroupContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterSimpleDatabase(SQLStatementParser.AlterSimpleDatabaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterUpgradeName(SQLStatementParser.AlterUpgradeNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterEvent(SQLStatementParser.AlterEventContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterFunction(SQLStatementParser.AlterFunctionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterInstance(SQLStatementParser.AlterInstanceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterLogfileGroup(SQLStatementParser.AlterLogfileGroupContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterProcedure(SQLStatementParser.AlterProcedureContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterServer(SQLStatementParser.AlterServerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterTable(SQLStatementParser.AlterTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterTablespace(SQLStatementParser.AlterTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterView(SQLStatementParser.AlterViewContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByTableOption(SQLStatementParser.AlterByTableOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddColumn(SQLStatementParser.AlterByAddColumnContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddColumns(SQLStatementParser.AlterByAddColumnsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddIndex(SQLStatementParser.AlterByAddIndexContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddPrimaryKey(SQLStatementParser.AlterByAddPrimaryKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddUniqueKey(SQLStatementParser.AlterByAddUniqueKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddSpecialIndex(SQLStatementParser.AlterByAddSpecialIndexContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddForeignKey(SQLStatementParser.AlterByAddForeignKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterBySetAlgorithm(SQLStatementParser.AlterBySetAlgorithmContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByChangeDefault(SQLStatementParser.AlterByChangeDefaultContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByChangeColumn(SQLStatementParser.AlterByChangeColumnContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByLock(SQLStatementParser.AlterByLockContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByModifyColumn(SQLStatementParser.AlterByModifyColumnContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDropColumn(SQLStatementParser.AlterByDropColumnContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDropPrimaryKey(SQLStatementParser.AlterByDropPrimaryKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDropIndex(SQLStatementParser.AlterByDropIndexContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDropForeignKey(SQLStatementParser.AlterByDropForeignKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDisableKeys(SQLStatementParser.AlterByDisableKeysContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByEnableKeys(SQLStatementParser.AlterByEnableKeysContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByRename(SQLStatementParser.AlterByRenameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByOrder(SQLStatementParser.AlterByOrderContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByConvertCharset(SQLStatementParser.AlterByConvertCharsetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDefaultCharset(SQLStatementParser.AlterByDefaultCharsetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDiscardTablespace(SQLStatementParser.AlterByDiscardTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByImportTablespace(SQLStatementParser.AlterByImportTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByForce(SQLStatementParser.AlterByForceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByValidate(SQLStatementParser.AlterByValidateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddPartition(SQLStatementParser.AlterByAddPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDropPartition(SQLStatementParser.AlterByDropPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDiscardPartition(SQLStatementParser.AlterByDiscardPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByImportPartition(SQLStatementParser.AlterByImportPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByTruncatePartition(SQLStatementParser.AlterByTruncatePartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByCoalescePartition(SQLStatementParser.AlterByCoalescePartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByReorganizePartition(SQLStatementParser.AlterByReorganizePartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByExchangePartition(SQLStatementParser.AlterByExchangePartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAnalyzePartitiion(SQLStatementParser.AlterByAnalyzePartitiionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByCheckPartition(SQLStatementParser.AlterByCheckPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByOptimizePartition(SQLStatementParser.AlterByOptimizePartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByRebuildPartition(SQLStatementParser.AlterByRebuildPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByRepairPartition(SQLStatementParser.AlterByRepairPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByRemovePartitioning(SQLStatementParser.AlterByRemovePartitioningContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByUpgradePartitioning(SQLStatementParser.AlterByUpgradePartitioningContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropDatabase(SQLStatementParser.DropDatabaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropEvent(SQLStatementParser.DropEventContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropIndex(SQLStatementParser.DropIndexContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropLogfileGroup(SQLStatementParser.DropLogfileGroupContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropProcedure(SQLStatementParser.DropProcedureContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropFunction(SQLStatementParser.DropFunctionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropServer(SQLStatementParser.DropServerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropTable(SQLStatementParser.DropTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropTablespace(SQLStatementParser.DropTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropTrigger(SQLStatementParser.DropTriggerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropView(SQLStatementParser.DropViewContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRenameTable(SQLStatementParser.RenameTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRenameTableClause(SQLStatementParser.RenameTableClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTruncateTable(SQLStatementParser.TruncateTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCallStatement(SQLStatementParser.CallStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeleteStatement(SQLStatementParser.DeleteStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDoStatement(SQLStatementParser.DoStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerStatement(SQLStatementParser.HandlerStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInsertStatement(SQLStatementParser.InsertStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLoadDataStatement(SQLStatementParser.LoadDataStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLoadXmlStatement(SQLStatementParser.LoadXmlStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReplaceStatement(SQLStatementParser.ReplaceStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleSelect(SQLStatementParser.SimpleSelectContext ctx) {
        return null;
    }

    @Override
    public Boolean visitParenthesisSelect(SQLStatementParser.ParenthesisSelectContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnionSelect(SQLStatementParser.UnionSelectContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnionParenthesisSelect(SQLStatementParser.UnionParenthesisSelectContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUpdateStatement(SQLStatementParser.UpdateStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInsertStatementValue(SQLStatementParser.InsertStatementValueContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUpdatedElement(SQLStatementParser.UpdatedElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAssignmentField(SQLStatementParser.AssignmentFieldContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLockClause(SQLStatementParser.LockClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSingleDeleteStatement(SQLStatementParser.SingleDeleteStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMultipleDeleteStatement(SQLStatementParser.MultipleDeleteStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerOpenStatement(SQLStatementParser.HandlerOpenStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerReadIndexStatement(SQLStatementParser.HandlerReadIndexStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerReadStatement(SQLStatementParser.HandlerReadStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerCloseStatement(SQLStatementParser.HandlerCloseStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSingleUpdateStatement(SQLStatementParser.SingleUpdateStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMultipleUpdateStatement(SQLStatementParser.MultipleUpdateStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOrderByClause(SQLStatementParser.OrderByClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOrderByExpression(SQLStatementParser.OrderByExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableSources(SQLStatementParser.TableSourcesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableSourceBase(SQLStatementParser.TableSourceBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableSourceNested(SQLStatementParser.TableSourceNestedContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAtomTableItem(SQLStatementParser.AtomTableItemContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubqueryTableItem(SQLStatementParser.SubqueryTableItemContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableSourcesItem(SQLStatementParser.TableSourcesItemContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexHint(SQLStatementParser.IndexHintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexHintType(SQLStatementParser.IndexHintTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInnerJoin(SQLStatementParser.InnerJoinContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStraightJoin(SQLStatementParser.StraightJoinContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOuterJoin(SQLStatementParser.OuterJoinContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNaturalJoin(SQLStatementParser.NaturalJoinContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQueryExpression(SQLStatementParser.QueryExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQueryExpressionNointo(SQLStatementParser.QueryExpressionNointoContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQuerySpecification(SQLStatementParser.QuerySpecificationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQuerySpecificationNointo(SQLStatementParser.QuerySpecificationNointoContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnionParenthesis(SQLStatementParser.UnionParenthesisContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnionStatement(SQLStatementParser.UnionStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectSpec(SQLStatementParser.SelectSpecContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectElements(SQLStatementParser.SelectElementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectStarElement(SQLStatementParser.SelectStarElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectColumnElement(SQLStatementParser.SelectColumnElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectFunctionElement(SQLStatementParser.SelectFunctionElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectExpressionElement(SQLStatementParser.SelectExpressionElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectIntoVariables(SQLStatementParser.SelectIntoVariablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectIntoDumpFile(SQLStatementParser.SelectIntoDumpFileContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectIntoTextFile(SQLStatementParser.SelectIntoTextFileContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectFieldsInto(SQLStatementParser.SelectFieldsIntoContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectLinesInto(SQLStatementParser.SelectLinesIntoContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFromClause(SQLStatementParser.FromClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGroupByItem(SQLStatementParser.GroupByItemContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLimitClause(SQLStatementParser.LimitClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStartTransaction(SQLStatementParser.StartTransactionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBeginWork(SQLStatementParser.BeginWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCommitWork(SQLStatementParser.CommitWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRollbackWork(SQLStatementParser.RollbackWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSavepointStatement(SQLStatementParser.SavepointStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRollbackStatement(SQLStatementParser.RollbackStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReleaseStatement(SQLStatementParser.ReleaseStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLockTables(SQLStatementParser.LockTablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnlockTables(SQLStatementParser.UnlockTablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetAutocommitStatement(SQLStatementParser.SetAutocommitStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetTransactionStatement(SQLStatementParser.SetTransactionStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTransactionMode(SQLStatementParser.TransactionModeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLockTableElement(SQLStatementParser.LockTableElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLockAction(SQLStatementParser.LockActionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTransactionOption(SQLStatementParser.TransactionOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTransactionLevel(SQLStatementParser.TransactionLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitChangeMaster(SQLStatementParser.ChangeMasterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitChangeReplicationFilter(SQLStatementParser.ChangeReplicationFilterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPurgeBinaryLogs(SQLStatementParser.PurgeBinaryLogsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitResetMaster(SQLStatementParser.ResetMasterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitResetSlave(SQLStatementParser.ResetSlaveContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStartSlave(SQLStatementParser.StartSlaveContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStopSlave(SQLStatementParser.StopSlaveContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStartGroupReplication(SQLStatementParser.StartGroupReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStopGroupReplication(SQLStatementParser.StopGroupReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterStringOption(SQLStatementParser.MasterStringOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterDecimalOption(SQLStatementParser.MasterDecimalOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterBoolOption(SQLStatementParser.MasterBoolOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterRealOption(SQLStatementParser.MasterRealOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterUidListOption(SQLStatementParser.MasterUidListOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStringMasterOption(SQLStatementParser.StringMasterOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDecimalMasterOption(SQLStatementParser.DecimalMasterOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBoolMasterOption(SQLStatementParser.BoolMasterOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitChannelOption(SQLStatementParser.ChannelOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDoDbReplication(SQLStatementParser.DoDbReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIgnoreDbReplication(SQLStatementParser.IgnoreDbReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDoTableReplication(SQLStatementParser.DoTableReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIgnoreTableReplication(SQLStatementParser.IgnoreTableReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWildDoTableReplication(SQLStatementParser.WildDoTableReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWildIgnoreTableReplication(SQLStatementParser.WildIgnoreTableReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRewriteDbReplication(SQLStatementParser.RewriteDbReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTablePair(SQLStatementParser.TablePairContext ctx) {
        return null;
    }

    @Override
    public Boolean visitThreadType(SQLStatementParser.ThreadTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGtidsUntilOption(SQLStatementParser.GtidsUntilOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterLogUntilOption(SQLStatementParser.MasterLogUntilOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRelayLogUntilOption(SQLStatementParser.RelayLogUntilOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSqlGapsUntilOption(SQLStatementParser.SqlGapsUntilOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserConnectionOption(SQLStatementParser.UserConnectionOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPasswordConnectionOption(SQLStatementParser.PasswordConnectionOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefaultAuthConnectionOption(SQLStatementParser.DefaultAuthConnectionOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPluginDirConnectionOption(SQLStatementParser.PluginDirConnectionOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGtuidSet(SQLStatementParser.GtuidSetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaStartTransaction(SQLStatementParser.XaStartTransactionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaEndTransaction(SQLStatementParser.XaEndTransactionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaPrepareStatement(SQLStatementParser.XaPrepareStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaCommitWork(SQLStatementParser.XaCommitWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaRollbackWork(SQLStatementParser.XaRollbackWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaRecoverWork(SQLStatementParser.XaRecoverWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrepareStatement(SQLStatementParser.PrepareStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExecuteStatement(SQLStatementParser.ExecuteStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeallocatePrepare(SQLStatementParser.DeallocatePrepareContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineBody(SQLStatementParser.RoutineBodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBlockStatement(SQLStatementParser.BlockStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCaseStatement(SQLStatementParser.CaseStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIfStatement(SQLStatementParser.IfStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIterateStatement(SQLStatementParser.IterateStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLeaveStatement(SQLStatementParser.LeaveStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLoopStatement(SQLStatementParser.LoopStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRepeatStatement(SQLStatementParser.RepeatStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReturnStatement(SQLStatementParser.ReturnStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWhileStatement(SQLStatementParser.WhileStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCloseCursor(SQLStatementParser.CloseCursorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFetchCursor(SQLStatementParser.FetchCursorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOpenCursor(SQLStatementParser.OpenCursorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeclareVariable(SQLStatementParser.DeclareVariableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeclareCondition(SQLStatementParser.DeclareConditionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeclareCursor(SQLStatementParser.DeclareCursorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeclareHandler(SQLStatementParser.DeclareHandlerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionCode(SQLStatementParser.HandlerConditionCodeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionState(SQLStatementParser.HandlerConditionStateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionName(SQLStatementParser.HandlerConditionNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionWarning(SQLStatementParser.HandlerConditionWarningContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionNotfound(SQLStatementParser.HandlerConditionNotfoundContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionException(SQLStatementParser.HandlerConditionExceptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitProcedureSqlStatement(SQLStatementParser.ProcedureSqlStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCaseAlternative(SQLStatementParser.CaseAlternativeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitElifAlternative(SQLStatementParser.ElifAlternativeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterUserMysqlV56(SQLStatementParser.AlterUserMysqlV56Context ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterUserMysqlV57(SQLStatementParser.AlterUserMysqlV57Context ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateUserMysqlV56(SQLStatementParser.CreateUserMysqlV56Context ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateUserMysqlV57(SQLStatementParser.CreateUserMysqlV57Context ctx) {
        return null;
    }

    @Override
    public Boolean visitDropUser(SQLStatementParser.DropUserContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGrantStatement(SQLStatementParser.GrantStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGrantProxy(SQLStatementParser.GrantProxyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRenameUser(SQLStatementParser.RenameUserContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDetailRevoke(SQLStatementParser.DetailRevokeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShortRevoke(SQLStatementParser.ShortRevokeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRevokeProxy(SQLStatementParser.RevokeProxyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetPasswordStatement(SQLStatementParser.SetPasswordStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserSpecification(SQLStatementParser.UserSpecificationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPasswordAuthOption(SQLStatementParser.PasswordAuthOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStringAuthOption(SQLStatementParser.StringAuthOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHashAuthOption(SQLStatementParser.HashAuthOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleAuthOption(SQLStatementParser.SimpleAuthOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTlsOption(SQLStatementParser.TlsOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserResourceOption(SQLStatementParser.UserResourceOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserPasswordOption(SQLStatementParser.UserPasswordOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserLockOption(SQLStatementParser.UserLockOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrivelegeClause(SQLStatementParser.PrivelegeClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrivilege(SQLStatementParser.PrivilegeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCurrentSchemaPriviLevel(SQLStatementParser.CurrentSchemaPriviLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGlobalPrivLevel(SQLStatementParser.GlobalPrivLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefiniteSchemaPrivLevel(SQLStatementParser.DefiniteSchemaPrivLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefiniteFullTablePrivLevel(SQLStatementParser.DefiniteFullTablePrivLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefiniteTablePrivLevel(SQLStatementParser.DefiniteTablePrivLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRenameUserClause(SQLStatementParser.RenameUserClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAnalyzeTable(SQLStatementParser.AnalyzeTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCheckTable(SQLStatementParser.CheckTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitChecksumTable(SQLStatementParser.ChecksumTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOptimizeTable(SQLStatementParser.OptimizeTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRepairTable(SQLStatementParser.RepairTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCheckTableOption(SQLStatementParser.CheckTableOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateUdfunction(SQLStatementParser.CreateUdfunctionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInstallPlugin(SQLStatementParser.InstallPluginContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUninstallPlugin(SQLStatementParser.UninstallPluginContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetVariable(SQLStatementParser.SetVariableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetCharset(SQLStatementParser.SetCharsetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetNames(SQLStatementParser.SetNamesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetPassword(SQLStatementParser.SetPasswordContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetTransaction(SQLStatementParser.SetTransactionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetAutocommit(SQLStatementParser.SetAutocommitContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowMasterLogs(SQLStatementParser.ShowMasterLogsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowLogEvents(SQLStatementParser.ShowLogEventsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowObjectFilter(SQLStatementParser.ShowObjectFilterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowColumns(SQLStatementParser.ShowColumnsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowCreateDb(SQLStatementParser.ShowCreateDbContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowCreateFullIdObject(SQLStatementParser.ShowCreateFullIdObjectContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowCreateUser(SQLStatementParser.ShowCreateUserContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowEngine(SQLStatementParser.ShowEngineContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowGlobalInfo(SQLStatementParser.ShowGlobalInfoContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowErrors(SQLStatementParser.ShowErrorsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowCountErrors(SQLStatementParser.ShowCountErrorsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowSchemaFilter(SQLStatementParser.ShowSchemaFilterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowRoutine(SQLStatementParser.ShowRoutineContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowGrants(SQLStatementParser.ShowGrantsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowIndexes(SQLStatementParser.ShowIndexesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowOpenTables(SQLStatementParser.ShowOpenTablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowProfile(SQLStatementParser.ShowProfileContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowSlaveStatus(SQLStatementParser.ShowSlaveStatusContext ctx) {
        return null;
    }

    @Override
    public Boolean visitVariableClause(SQLStatementParser.VariableClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowCommonEntity(SQLStatementParser.ShowCommonEntityContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowFilter(SQLStatementParser.ShowFilterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowGlobalInfoClause(SQLStatementParser.ShowGlobalInfoClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowSchemaEntity(SQLStatementParser.ShowSchemaEntityContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowProfileType(SQLStatementParser.ShowProfileTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBinlogStatement(SQLStatementParser.BinlogStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCacheIndexStatement(SQLStatementParser.CacheIndexStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFlushStatement(SQLStatementParser.FlushStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitKillStatement(SQLStatementParser.KillStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLoadIndexIntoCache(SQLStatementParser.LoadIndexIntoCacheContext ctx) {
        return null;
    }

    @Override
    public Boolean visitResetStatement(SQLStatementParser.ResetStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShutdownStatement(SQLStatementParser.ShutdownStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableIndexes(SQLStatementParser.TableIndexesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleFlushOption(SQLStatementParser.SimpleFlushOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitChannelFlushOption(SQLStatementParser.ChannelFlushOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableFlushOption(SQLStatementParser.TableFlushOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFlushTableOption(SQLStatementParser.FlushTableOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLoadedTableIndexes(SQLStatementParser.LoadedTableIndexesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleDescribeStatement(SQLStatementParser.SimpleDescribeStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFullDescribeStatement(SQLStatementParser.FullDescribeStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHelpStatement(SQLStatementParser.HelpStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUseStatement(SQLStatementParser.UseStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDescribeStatements(SQLStatementParser.DescribeStatementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDescribeConnection(SQLStatementParser.DescribeConnectionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFullId(SQLStatementParser.FullIdContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableName(SQLStatementParser.TableNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFullColumnName(SQLStatementParser.FullColumnNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexColumnName(SQLStatementParser.IndexColumnNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserName(SQLStatementParser.UserNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMysqlVariable(SQLStatementParser.MysqlVariableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCharsetName(SQLStatementParser.CharsetNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCollationName(SQLStatementParser.CollationNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitEngineName(SQLStatementParser.EngineNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUuidSet(SQLStatementParser.UuidSetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXid(SQLStatementParser.XidContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXuidStringId(SQLStatementParser.XuidStringIdContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAuthPlugin(SQLStatementParser.AuthPluginContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUid(SQLStatementParser.UidContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleId(SQLStatementParser.SimpleIdContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDottedId(SQLStatementParser.DottedIdContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDecimalLiteral(SQLStatementParser.DecimalLiteralContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFileSizeLiteral(SQLStatementParser.FileSizeLiteralContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStringLiteral(SQLStatementParser.StringLiteralContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBooleanLiteral(SQLStatementParser.BooleanLiteralContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHexadecimalLiteral(SQLStatementParser.HexadecimalLiteralContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNullNotnull(SQLStatementParser.NullNotnullContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstant(SQLStatementParser.ConstantContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStringDataType(SQLStatementParser.StringDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDimensionDataType(SQLStatementParser.DimensionDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleDataType(SQLStatementParser.SimpleDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCollectionDataType(SQLStatementParser.CollectionDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSpatialDataType(SQLStatementParser.SpatialDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConvertedDataType(SQLStatementParser.ConvertedDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLengthOneDimension(SQLStatementParser.LengthOneDimensionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLengthTwoDimension(SQLStatementParser.LengthTwoDimensionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLengthTwoOptionalDimension(SQLStatementParser.LengthTwoOptionalDimensionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUidList(SQLStatementParser.UidListContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTables(SQLStatementParser.TablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexColumnNames(SQLStatementParser.IndexColumnNamesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpressions(SQLStatementParser.ExpressionsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpressionsWithDefaults(SQLStatementParser.ExpressionsWithDefaultsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstants(SQLStatementParser.ConstantsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleStrings(SQLStatementParser.SimpleStringsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserVariables(SQLStatementParser.UserVariablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefaultValue(SQLStatementParser.DefaultValueContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpressionOrDefault(SQLStatementParser.ExpressionOrDefaultContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIfExists(SQLStatementParser.IfExistsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIfNotExists(SQLStatementParser.IfNotExistsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSpecificFunctionCall(SQLStatementParser.SpecificFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAggregateFunctionCall(SQLStatementParser.AggregateFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitScalarFunctionCall(SQLStatementParser.ScalarFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUdfFunctionCall(SQLStatementParser.UdfFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPasswordFunctionCall(SQLStatementParser.PasswordFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleFunctionCall(SQLStatementParser.SimpleFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDataTypeFunctionCall(SQLStatementParser.DataTypeFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitValuesFunctionCall(SQLStatementParser.ValuesFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCaseFunctionCall(SQLStatementParser.CaseFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCharFunctionCall(SQLStatementParser.CharFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPositionFunctionCall(SQLStatementParser.PositionFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubstrFunctionCall(SQLStatementParser.SubstrFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTrimFunctionCall(SQLStatementParser.TrimFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWeightFunctionCall(SQLStatementParser.WeightFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExtractFunctionCall(SQLStatementParser.ExtractFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGetFormatFunctionCall(SQLStatementParser.GetFormatFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCaseFuncAlternative(SQLStatementParser.CaseFuncAlternativeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLevelWeightList(SQLStatementParser.LevelWeightListContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLevelWeightRange(SQLStatementParser.LevelWeightRangeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLevelInWeightListElement(SQLStatementParser.LevelInWeightListElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAggregateWindowedFunction(SQLStatementParser.AggregateWindowedFunctionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitScalarFunctionName(SQLStatementParser.ScalarFunctionNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPasswordFunctionClause(SQLStatementParser.PasswordFunctionClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunctionArgs(SQLStatementParser.FunctionArgsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunctionArg(SQLStatementParser.FunctionArgContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIsExpression(SQLStatementParser.IsExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNotExpression(SQLStatementParser.NotExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLogicalExpression(SQLStatementParser.LogicalExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPredicateExpression(SQLStatementParser.PredicateExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSoundsLikePredicate(SQLStatementParser.SoundsLikePredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpressionAtomPredicate(SQLStatementParser.ExpressionAtomPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInPredicate(SQLStatementParser.InPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubqueryComparasionPredicate(SQLStatementParser.SubqueryComparasionPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBetweenPredicate(SQLStatementParser.BetweenPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBinaryComparasionPredicate(SQLStatementParser.BinaryComparasionPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIsNullPredicate(SQLStatementParser.IsNullPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLikePredicate(SQLStatementParser.LikePredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRegexpPredicate(SQLStatementParser.RegexpPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnaryExpressionAtom(SQLStatementParser.UnaryExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCollateExpressionAtom(SQLStatementParser.CollateExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubqueryExpessionAtom(SQLStatementParser.SubqueryExpessionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMysqlVariableExpressionAtom(SQLStatementParser.MysqlVariableExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNestedExpressionAtom(SQLStatementParser.NestedExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNestedRowExpressionAtom(SQLStatementParser.NestedRowExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMathExpressionAtom(SQLStatementParser.MathExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIntervalExpressionAtom(SQLStatementParser.IntervalExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExistsExpessionAtom(SQLStatementParser.ExistsExpessionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstantExpressionAtom(SQLStatementParser.ConstantExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunctionCallExpressionAtom(SQLStatementParser.FunctionCallExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBinaryExpressionAtom(SQLStatementParser.BinaryExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFullColumnNameExpressionAtom(SQLStatementParser.FullColumnNameExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBitExpressionAtom(SQLStatementParser.BitExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnaryOperator(SQLStatementParser.UnaryOperatorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitComparisonOperator(SQLStatementParser.ComparisonOperatorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLogicalOperator(SQLStatementParser.LogicalOperatorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBitOperator(SQLStatementParser.BitOperatorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMathOperator(SQLStatementParser.MathOperatorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCharsetNameBase(SQLStatementParser.CharsetNameBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTransactionLevelBase(SQLStatementParser.TransactionLevelBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrivilegesBase(SQLStatementParser.PrivilegesBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIntervalTypeBase(SQLStatementParser.IntervalTypeBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDataTypeBase(SQLStatementParser.DataTypeBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitKeywordsCanBeId(SQLStatementParser.KeywordsCanBeIdContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunctionNameBase(SQLStatementParser.FunctionNameBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visit(ParseTree tree) {
        return null;
    }

    @Override
    public Boolean visitChildren(RuleNode node) {
        return null;
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
