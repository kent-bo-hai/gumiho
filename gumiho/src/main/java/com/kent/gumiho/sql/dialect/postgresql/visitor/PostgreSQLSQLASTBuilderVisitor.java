package com.kent.gumiho.sql.dialect.postgresql.visitor;

import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.dialect.mysql.parser.MySQLSQLStatementParser;
import com.kent.gumiho.sql.dialect.mysql.parser.MySQLSQLStatementParserVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kongtong.ouyang on 2018/3/6.
 */
public class PostgreSQLSQLASTBuilderVisitor implements MySQLSQLStatementParserVisitor<Boolean> {


    List<SQLStatement> statementList = new ArrayList<SQLStatement>();


    @Override
    public Boolean visitParse(MySQLSQLStatementParser.ParseContext ctx) {

        return false;
    }

    @Override
    public Boolean visitSqlStatements(MySQLSQLStatementParser.SqlStatementsContext ctx) {
        return false;
    }

    @Override
    public Boolean visitSqlStatement(MySQLSQLStatementParser.SqlStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitEmptyStatement(MySQLSQLStatementParser.EmptyStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDdlStatement(MySQLSQLStatementParser.DdlStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDmlStatement(MySQLSQLStatementParser.DmlStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTransactionStatement(MySQLSQLStatementParser.TransactionStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReplicationStatement(MySQLSQLStatementParser.ReplicationStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPreparedStatement(MySQLSQLStatementParser.PreparedStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCompoundStatement(MySQLSQLStatementParser.CompoundStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAdministrationStatement(MySQLSQLStatementParser.AdministrationStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUtilityStatement(MySQLSQLStatementParser.UtilityStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateDatabase(MySQLSQLStatementParser.CreateDatabaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateEvent(MySQLSQLStatementParser.CreateEventContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateIndex(MySQLSQLStatementParser.CreateIndexContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateLogfileGroup(MySQLSQLStatementParser.CreateLogfileGroupContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateProcedure(MySQLSQLStatementParser.CreateProcedureContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateFunction(MySQLSQLStatementParser.CreateFunctionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateServer(MySQLSQLStatementParser.CreateServerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCopyCreateTable(MySQLSQLStatementParser.CopyCreateTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQueryCreateTable(MySQLSQLStatementParser.QueryCreateTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitColumnCreateTable(MySQLSQLStatementParser.ColumnCreateTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateTablespaceInnodb(MySQLSQLStatementParser.CreateTablespaceInnodbContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateTablespaceNdb(MySQLSQLStatementParser.CreateTablespaceNdbContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateTrigger(MySQLSQLStatementParser.CreateTriggerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateView(MySQLSQLStatementParser.CreateViewContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateDatabaseOption(MySQLSQLStatementParser.CreateDatabaseOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOwnerStatement(MySQLSQLStatementParser.OwnerStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPreciseSchedule(MySQLSQLStatementParser.PreciseScheduleContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIntervalSchedule(MySQLSQLStatementParser.IntervalScheduleContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTimestampValue(MySQLSQLStatementParser.TimestampValueContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIntervalExpr(MySQLSQLStatementParser.IntervalExprContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIntervalType(MySQLSQLStatementParser.IntervalTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitEnableType(MySQLSQLStatementParser.EnableTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexType(MySQLSQLStatementParser.IndexTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexOption(MySQLSQLStatementParser.IndexOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitProcedureParameter(MySQLSQLStatementParser.ProcedureParameterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunctionParameter(MySQLSQLStatementParser.FunctionParameterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineComment(MySQLSQLStatementParser.RoutineCommentContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineLanguage(MySQLSQLStatementParser.RoutineLanguageContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineBehavior(MySQLSQLStatementParser.RoutineBehaviorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineData(MySQLSQLStatementParser.RoutineDataContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineSecurity(MySQLSQLStatementParser.RoutineSecurityContext ctx) {
        return null;
    }

    @Override
    public Boolean visitServerOption(MySQLSQLStatementParser.ServerOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateDefinitions(MySQLSQLStatementParser.CreateDefinitionsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitColumnDeclaration(MySQLSQLStatementParser.ColumnDeclarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstraintDeclaration(MySQLSQLStatementParser.ConstraintDeclarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexDeclaration(MySQLSQLStatementParser.IndexDeclarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitColumnDefinition(MySQLSQLStatementParser.ColumnDefinitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNullColumnConstraint(MySQLSQLStatementParser.NullColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefaultColumnConstraint(MySQLSQLStatementParser.DefaultColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAutoIncrementColumnConstraint(MySQLSQLStatementParser.AutoIncrementColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrimaryKeyColumnConstraint(MySQLSQLStatementParser.PrimaryKeyColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUniqueKeyColumnConstraint(MySQLSQLStatementParser.UniqueKeyColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCommentColumnConstraint(MySQLSQLStatementParser.CommentColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFormatColumnConstraint(MySQLSQLStatementParser.FormatColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStorageColumnConstraint(MySQLSQLStatementParser.StorageColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReferenceColumnConstraint(MySQLSQLStatementParser.ReferenceColumnConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrimaryKeyTableConstraint(MySQLSQLStatementParser.PrimaryKeyTableConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUniqueKeyTableConstraint(MySQLSQLStatementParser.UniqueKeyTableConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitForeignKeyTableConstraint(MySQLSQLStatementParser.ForeignKeyTableConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCheckTableConstraint(MySQLSQLStatementParser.CheckTableConstraintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReferenceDefinition(MySQLSQLStatementParser.ReferenceDefinitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReferenceAction(MySQLSQLStatementParser.ReferenceActionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReferenceControlType(MySQLSQLStatementParser.ReferenceControlTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleIndexDeclaration(MySQLSQLStatementParser.SimpleIndexDeclarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSpecialIndexDeclaration(MySQLSQLStatementParser.SpecialIndexDeclarationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionEngine(MySQLSQLStatementParser.TableOptionEngineContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionAutoIncrement(MySQLSQLStatementParser.TableOptionAutoIncrementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionAverage(MySQLSQLStatementParser.TableOptionAverageContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionCharset(MySQLSQLStatementParser.TableOptionCharsetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionChecksum(MySQLSQLStatementParser.TableOptionChecksumContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionCollate(MySQLSQLStatementParser.TableOptionCollateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionComment(MySQLSQLStatementParser.TableOptionCommentContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionCompression(MySQLSQLStatementParser.TableOptionCompressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionConnection(MySQLSQLStatementParser.TableOptionConnectionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionDataDirectory(MySQLSQLStatementParser.TableOptionDataDirectoryContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionDelay(MySQLSQLStatementParser.TableOptionDelayContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionEncryption(MySQLSQLStatementParser.TableOptionEncryptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionIndexDirectory(MySQLSQLStatementParser.TableOptionIndexDirectoryContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionInsertMethod(MySQLSQLStatementParser.TableOptionInsertMethodContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionKeyBlockSize(MySQLSQLStatementParser.TableOptionKeyBlockSizeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionMaxRows(MySQLSQLStatementParser.TableOptionMaxRowsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionMinRows(MySQLSQLStatementParser.TableOptionMinRowsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionPackKeys(MySQLSQLStatementParser.TableOptionPackKeysContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionPassword(MySQLSQLStatementParser.TableOptionPasswordContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionRowFormat(MySQLSQLStatementParser.TableOptionRowFormatContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionRecalculation(MySQLSQLStatementParser.TableOptionRecalculationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionPersistent(MySQLSQLStatementParser.TableOptionPersistentContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionSamplePage(MySQLSQLStatementParser.TableOptionSamplePageContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionTablespace(MySQLSQLStatementParser.TableOptionTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableOptionUnion(MySQLSQLStatementParser.TableOptionUnionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTablespaceStorage(MySQLSQLStatementParser.TablespaceStorageContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionDefinitions(MySQLSQLStatementParser.PartitionDefinitionsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionFunctionHash(MySQLSQLStatementParser.PartitionFunctionHashContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionFunctionKey(MySQLSQLStatementParser.PartitionFunctionKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionFunctionRange(MySQLSQLStatementParser.PartitionFunctionRangeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionFunctionList(MySQLSQLStatementParser.PartitionFunctionListContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubPartitionFunctionHash(MySQLSQLStatementParser.SubPartitionFunctionHashContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubPartitionFunctionKey(MySQLSQLStatementParser.SubPartitionFunctionKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionComparision(MySQLSQLStatementParser.PartitionComparisionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionListAtom(MySQLSQLStatementParser.PartitionListAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionListVector(MySQLSQLStatementParser.PartitionListVectorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionSimple(MySQLSQLStatementParser.PartitionSimpleContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionDefinerAtom(MySQLSQLStatementParser.PartitionDefinerAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionDefinerVector(MySQLSQLStatementParser.PartitionDefinerVectorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubpartitionDefinition(MySQLSQLStatementParser.SubpartitionDefinitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionEngine(MySQLSQLStatementParser.PartitionOptionEngineContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionComment(MySQLSQLStatementParser.PartitionOptionCommentContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionDataDirectory(MySQLSQLStatementParser.PartitionOptionDataDirectoryContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionIndexDirectory(MySQLSQLStatementParser.PartitionOptionIndexDirectoryContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionMaxRows(MySQLSQLStatementParser.PartitionOptionMaxRowsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionMinRows(MySQLSQLStatementParser.PartitionOptionMinRowsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionTablespace(MySQLSQLStatementParser.PartitionOptionTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPartitionOptionNodeGroup(MySQLSQLStatementParser.PartitionOptionNodeGroupContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterSimpleDatabase(MySQLSQLStatementParser.AlterSimpleDatabaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterUpgradeName(MySQLSQLStatementParser.AlterUpgradeNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterEvent(MySQLSQLStatementParser.AlterEventContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterFunction(MySQLSQLStatementParser.AlterFunctionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterInstance(MySQLSQLStatementParser.AlterInstanceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterLogfileGroup(MySQLSQLStatementParser.AlterLogfileGroupContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterProcedure(MySQLSQLStatementParser.AlterProcedureContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterServer(MySQLSQLStatementParser.AlterServerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterTable(MySQLSQLStatementParser.AlterTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterTablespace(MySQLSQLStatementParser.AlterTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterView(MySQLSQLStatementParser.AlterViewContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByTableOption(MySQLSQLStatementParser.AlterByTableOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddColumn(MySQLSQLStatementParser.AlterByAddColumnContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddColumns(MySQLSQLStatementParser.AlterByAddColumnsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddIndex(MySQLSQLStatementParser.AlterByAddIndexContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddPrimaryKey(MySQLSQLStatementParser.AlterByAddPrimaryKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddUniqueKey(MySQLSQLStatementParser.AlterByAddUniqueKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddSpecialIndex(MySQLSQLStatementParser.AlterByAddSpecialIndexContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddForeignKey(MySQLSQLStatementParser.AlterByAddForeignKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterBySetAlgorithm(MySQLSQLStatementParser.AlterBySetAlgorithmContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByChangeDefault(MySQLSQLStatementParser.AlterByChangeDefaultContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByChangeColumn(MySQLSQLStatementParser.AlterByChangeColumnContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByLock(MySQLSQLStatementParser.AlterByLockContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByModifyColumn(MySQLSQLStatementParser.AlterByModifyColumnContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDropColumn(MySQLSQLStatementParser.AlterByDropColumnContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDropPrimaryKey(MySQLSQLStatementParser.AlterByDropPrimaryKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDropIndex(MySQLSQLStatementParser.AlterByDropIndexContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDropForeignKey(MySQLSQLStatementParser.AlterByDropForeignKeyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDisableKeys(MySQLSQLStatementParser.AlterByDisableKeysContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByEnableKeys(MySQLSQLStatementParser.AlterByEnableKeysContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByRename(MySQLSQLStatementParser.AlterByRenameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByOrder(MySQLSQLStatementParser.AlterByOrderContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByConvertCharset(MySQLSQLStatementParser.AlterByConvertCharsetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDefaultCharset(MySQLSQLStatementParser.AlterByDefaultCharsetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDiscardTablespace(MySQLSQLStatementParser.AlterByDiscardTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByImportTablespace(MySQLSQLStatementParser.AlterByImportTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByForce(MySQLSQLStatementParser.AlterByForceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByValidate(MySQLSQLStatementParser.AlterByValidateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAddPartition(MySQLSQLStatementParser.AlterByAddPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDropPartition(MySQLSQLStatementParser.AlterByDropPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByDiscardPartition(MySQLSQLStatementParser.AlterByDiscardPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByImportPartition(MySQLSQLStatementParser.AlterByImportPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByTruncatePartition(MySQLSQLStatementParser.AlterByTruncatePartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByCoalescePartition(MySQLSQLStatementParser.AlterByCoalescePartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByReorganizePartition(MySQLSQLStatementParser.AlterByReorganizePartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByExchangePartition(MySQLSQLStatementParser.AlterByExchangePartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByAnalyzePartitiion(MySQLSQLStatementParser.AlterByAnalyzePartitiionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByCheckPartition(MySQLSQLStatementParser.AlterByCheckPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByOptimizePartition(MySQLSQLStatementParser.AlterByOptimizePartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByRebuildPartition(MySQLSQLStatementParser.AlterByRebuildPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByRepairPartition(MySQLSQLStatementParser.AlterByRepairPartitionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByRemovePartitioning(MySQLSQLStatementParser.AlterByRemovePartitioningContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterByUpgradePartitioning(MySQLSQLStatementParser.AlterByUpgradePartitioningContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropDatabase(MySQLSQLStatementParser.DropDatabaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropEvent(MySQLSQLStatementParser.DropEventContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropIndex(MySQLSQLStatementParser.DropIndexContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropLogfileGroup(MySQLSQLStatementParser.DropLogfileGroupContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropProcedure(MySQLSQLStatementParser.DropProcedureContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropFunction(MySQLSQLStatementParser.DropFunctionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropServer(MySQLSQLStatementParser.DropServerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropTable(MySQLSQLStatementParser.DropTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropTablespace(MySQLSQLStatementParser.DropTablespaceContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropTrigger(MySQLSQLStatementParser.DropTriggerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDropView(MySQLSQLStatementParser.DropViewContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRenameTable(MySQLSQLStatementParser.RenameTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRenameTableClause(MySQLSQLStatementParser.RenameTableClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTruncateTable(MySQLSQLStatementParser.TruncateTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCallStatement(MySQLSQLStatementParser.CallStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeleteStatement(MySQLSQLStatementParser.DeleteStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDoStatement(MySQLSQLStatementParser.DoStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerStatement(MySQLSQLStatementParser.HandlerStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInsertStatement(MySQLSQLStatementParser.InsertStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLoadDataStatement(MySQLSQLStatementParser.LoadDataStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLoadXmlStatement(MySQLSQLStatementParser.LoadXmlStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReplaceStatement(MySQLSQLStatementParser.ReplaceStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleSelect(MySQLSQLStatementParser.SimpleSelectContext ctx) {
        return null;
    }

    @Override
    public Boolean visitParenthesisSelect(MySQLSQLStatementParser.ParenthesisSelectContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnionSelect(MySQLSQLStatementParser.UnionSelectContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnionParenthesisSelect(MySQLSQLStatementParser.UnionParenthesisSelectContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUpdateStatement(MySQLSQLStatementParser.UpdateStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInsertStatementValue(MySQLSQLStatementParser.InsertStatementValueContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUpdatedElement(MySQLSQLStatementParser.UpdatedElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAssignmentField(MySQLSQLStatementParser.AssignmentFieldContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLockClause(MySQLSQLStatementParser.LockClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSingleDeleteStatement(MySQLSQLStatementParser.SingleDeleteStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMultipleDeleteStatement(MySQLSQLStatementParser.MultipleDeleteStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerOpenStatement(MySQLSQLStatementParser.HandlerOpenStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerReadIndexStatement(MySQLSQLStatementParser.HandlerReadIndexStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerReadStatement(MySQLSQLStatementParser.HandlerReadStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerCloseStatement(MySQLSQLStatementParser.HandlerCloseStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSingleUpdateStatement(MySQLSQLStatementParser.SingleUpdateStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMultipleUpdateStatement(MySQLSQLStatementParser.MultipleUpdateStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOrderByClause(MySQLSQLStatementParser.OrderByClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOrderByExpression(MySQLSQLStatementParser.OrderByExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableSources(MySQLSQLStatementParser.TableSourcesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableSourceBase(MySQLSQLStatementParser.TableSourceBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableSourceNested(MySQLSQLStatementParser.TableSourceNestedContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAtomTableItem(MySQLSQLStatementParser.AtomTableItemContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubqueryTableItem(MySQLSQLStatementParser.SubqueryTableItemContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableSourcesItem(MySQLSQLStatementParser.TableSourcesItemContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexHint(MySQLSQLStatementParser.IndexHintContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexHintType(MySQLSQLStatementParser.IndexHintTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInnerJoin(MySQLSQLStatementParser.InnerJoinContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStraightJoin(MySQLSQLStatementParser.StraightJoinContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOuterJoin(MySQLSQLStatementParser.OuterJoinContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNaturalJoin(MySQLSQLStatementParser.NaturalJoinContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQueryExpression(MySQLSQLStatementParser.QueryExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQueryExpressionNointo(MySQLSQLStatementParser.QueryExpressionNointoContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQuerySpecification(MySQLSQLStatementParser.QuerySpecificationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitQuerySpecificationNointo(MySQLSQLStatementParser.QuerySpecificationNointoContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnionParenthesis(MySQLSQLStatementParser.UnionParenthesisContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnionStatement(MySQLSQLStatementParser.UnionStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectSpec(MySQLSQLStatementParser.SelectSpecContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectElements(MySQLSQLStatementParser.SelectElementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectStarElement(MySQLSQLStatementParser.SelectStarElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectColumnElement(MySQLSQLStatementParser.SelectColumnElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectFunctionElement(MySQLSQLStatementParser.SelectFunctionElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectExpressionElement(MySQLSQLStatementParser.SelectExpressionElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectIntoVariables(MySQLSQLStatementParser.SelectIntoVariablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectIntoDumpFile(MySQLSQLStatementParser.SelectIntoDumpFileContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectIntoTextFile(MySQLSQLStatementParser.SelectIntoTextFileContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectFieldsInto(MySQLSQLStatementParser.SelectFieldsIntoContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSelectLinesInto(MySQLSQLStatementParser.SelectLinesIntoContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFromClause(MySQLSQLStatementParser.FromClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGroupByItem(MySQLSQLStatementParser.GroupByItemContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLimitClause(MySQLSQLStatementParser.LimitClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStartTransaction(MySQLSQLStatementParser.StartTransactionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBeginWork(MySQLSQLStatementParser.BeginWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCommitWork(MySQLSQLStatementParser.CommitWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRollbackWork(MySQLSQLStatementParser.RollbackWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSavepointStatement(MySQLSQLStatementParser.SavepointStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRollbackStatement(MySQLSQLStatementParser.RollbackStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReleaseStatement(MySQLSQLStatementParser.ReleaseStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLockTables(MySQLSQLStatementParser.LockTablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnlockTables(MySQLSQLStatementParser.UnlockTablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetAutocommitStatement(MySQLSQLStatementParser.SetAutocommitStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetTransactionStatement(MySQLSQLStatementParser.SetTransactionStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTransactionMode(MySQLSQLStatementParser.TransactionModeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLockTableElement(MySQLSQLStatementParser.LockTableElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLockAction(MySQLSQLStatementParser.LockActionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTransactionOption(MySQLSQLStatementParser.TransactionOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTransactionLevel(MySQLSQLStatementParser.TransactionLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitChangeMaster(MySQLSQLStatementParser.ChangeMasterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitChangeReplicationFilter(MySQLSQLStatementParser.ChangeReplicationFilterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPurgeBinaryLogs(MySQLSQLStatementParser.PurgeBinaryLogsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitResetMaster(MySQLSQLStatementParser.ResetMasterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitResetSlave(MySQLSQLStatementParser.ResetSlaveContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStartSlave(MySQLSQLStatementParser.StartSlaveContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStopSlave(MySQLSQLStatementParser.StopSlaveContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStartGroupReplication(MySQLSQLStatementParser.StartGroupReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStopGroupReplication(MySQLSQLStatementParser.StopGroupReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterStringOption(MySQLSQLStatementParser.MasterStringOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterDecimalOption(MySQLSQLStatementParser.MasterDecimalOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterBoolOption(MySQLSQLStatementParser.MasterBoolOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterRealOption(MySQLSQLStatementParser.MasterRealOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterUidListOption(MySQLSQLStatementParser.MasterUidListOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStringMasterOption(MySQLSQLStatementParser.StringMasterOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDecimalMasterOption(MySQLSQLStatementParser.DecimalMasterOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBoolMasterOption(MySQLSQLStatementParser.BoolMasterOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitChannelOption(MySQLSQLStatementParser.ChannelOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDoDbReplication(MySQLSQLStatementParser.DoDbReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIgnoreDbReplication(MySQLSQLStatementParser.IgnoreDbReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDoTableReplication(MySQLSQLStatementParser.DoTableReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIgnoreTableReplication(MySQLSQLStatementParser.IgnoreTableReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWildDoTableReplication(MySQLSQLStatementParser.WildDoTableReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWildIgnoreTableReplication(MySQLSQLStatementParser.WildIgnoreTableReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRewriteDbReplication(MySQLSQLStatementParser.RewriteDbReplicationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTablePair(MySQLSQLStatementParser.TablePairContext ctx) {
        return null;
    }

    @Override
    public Boolean visitThreadType(MySQLSQLStatementParser.ThreadTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGtidsUntilOption(MySQLSQLStatementParser.GtidsUntilOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMasterLogUntilOption(MySQLSQLStatementParser.MasterLogUntilOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRelayLogUntilOption(MySQLSQLStatementParser.RelayLogUntilOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSqlGapsUntilOption(MySQLSQLStatementParser.SqlGapsUntilOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserConnectionOption(MySQLSQLStatementParser.UserConnectionOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPasswordConnectionOption(MySQLSQLStatementParser.PasswordConnectionOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefaultAuthConnectionOption(MySQLSQLStatementParser.DefaultAuthConnectionOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPluginDirConnectionOption(MySQLSQLStatementParser.PluginDirConnectionOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGtuidSet(MySQLSQLStatementParser.GtuidSetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaStartTransaction(MySQLSQLStatementParser.XaStartTransactionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaEndTransaction(MySQLSQLStatementParser.XaEndTransactionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaPrepareStatement(MySQLSQLStatementParser.XaPrepareStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaCommitWork(MySQLSQLStatementParser.XaCommitWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaRollbackWork(MySQLSQLStatementParser.XaRollbackWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXaRecoverWork(MySQLSQLStatementParser.XaRecoverWorkContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrepareStatement(MySQLSQLStatementParser.PrepareStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExecuteStatement(MySQLSQLStatementParser.ExecuteStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeallocatePrepare(MySQLSQLStatementParser.DeallocatePrepareContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRoutineBody(MySQLSQLStatementParser.RoutineBodyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBlockStatement(MySQLSQLStatementParser.BlockStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCaseStatement(MySQLSQLStatementParser.CaseStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIfStatement(MySQLSQLStatementParser.IfStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIterateStatement(MySQLSQLStatementParser.IterateStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLeaveStatement(MySQLSQLStatementParser.LeaveStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLoopStatement(MySQLSQLStatementParser.LoopStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRepeatStatement(MySQLSQLStatementParser.RepeatStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitReturnStatement(MySQLSQLStatementParser.ReturnStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWhileStatement(MySQLSQLStatementParser.WhileStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCloseCursor(MySQLSQLStatementParser.CloseCursorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFetchCursor(MySQLSQLStatementParser.FetchCursorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOpenCursor(MySQLSQLStatementParser.OpenCursorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeclareVariable(MySQLSQLStatementParser.DeclareVariableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeclareCondition(MySQLSQLStatementParser.DeclareConditionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeclareCursor(MySQLSQLStatementParser.DeclareCursorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDeclareHandler(MySQLSQLStatementParser.DeclareHandlerContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionCode(MySQLSQLStatementParser.HandlerConditionCodeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionState(MySQLSQLStatementParser.HandlerConditionStateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionName(MySQLSQLStatementParser.HandlerConditionNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionWarning(MySQLSQLStatementParser.HandlerConditionWarningContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionNotfound(MySQLSQLStatementParser.HandlerConditionNotfoundContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHandlerConditionException(MySQLSQLStatementParser.HandlerConditionExceptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitProcedureSqlStatement(MySQLSQLStatementParser.ProcedureSqlStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCaseAlternative(MySQLSQLStatementParser.CaseAlternativeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitElifAlternative(MySQLSQLStatementParser.ElifAlternativeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterUserMysqlV56(MySQLSQLStatementParser.AlterUserMysqlV56Context ctx) {
        return null;
    }

    @Override
    public Boolean visitAlterUserMysqlV57(MySQLSQLStatementParser.AlterUserMysqlV57Context ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateUserMysqlV56(MySQLSQLStatementParser.CreateUserMysqlV56Context ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateUserMysqlV57(MySQLSQLStatementParser.CreateUserMysqlV57Context ctx) {
        return null;
    }

    @Override
    public Boolean visitDropUser(MySQLSQLStatementParser.DropUserContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGrantStatement(MySQLSQLStatementParser.GrantStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGrantProxy(MySQLSQLStatementParser.GrantProxyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRenameUser(MySQLSQLStatementParser.RenameUserContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDetailRevoke(MySQLSQLStatementParser.DetailRevokeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShortRevoke(MySQLSQLStatementParser.ShortRevokeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRevokeProxy(MySQLSQLStatementParser.RevokeProxyContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetPasswordStatement(MySQLSQLStatementParser.SetPasswordStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserSpecification(MySQLSQLStatementParser.UserSpecificationContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPasswordAuthOption(MySQLSQLStatementParser.PasswordAuthOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStringAuthOption(MySQLSQLStatementParser.StringAuthOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHashAuthOption(MySQLSQLStatementParser.HashAuthOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleAuthOption(MySQLSQLStatementParser.SimpleAuthOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTlsOption(MySQLSQLStatementParser.TlsOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserResourceOption(MySQLSQLStatementParser.UserResourceOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserPasswordOption(MySQLSQLStatementParser.UserPasswordOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserLockOption(MySQLSQLStatementParser.UserLockOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrivelegeClause(MySQLSQLStatementParser.PrivelegeClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrivilege(MySQLSQLStatementParser.PrivilegeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCurrentSchemaPriviLevel(MySQLSQLStatementParser.CurrentSchemaPriviLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGlobalPrivLevel(MySQLSQLStatementParser.GlobalPrivLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefiniteSchemaPrivLevel(MySQLSQLStatementParser.DefiniteSchemaPrivLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefiniteFullTablePrivLevel(MySQLSQLStatementParser.DefiniteFullTablePrivLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefiniteTablePrivLevel(MySQLSQLStatementParser.DefiniteTablePrivLevelContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRenameUserClause(MySQLSQLStatementParser.RenameUserClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAnalyzeTable(MySQLSQLStatementParser.AnalyzeTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCheckTable(MySQLSQLStatementParser.CheckTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitChecksumTable(MySQLSQLStatementParser.ChecksumTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitOptimizeTable(MySQLSQLStatementParser.OptimizeTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRepairTable(MySQLSQLStatementParser.RepairTableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCheckTableOption(MySQLSQLStatementParser.CheckTableOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCreateUdfunction(MySQLSQLStatementParser.CreateUdfunctionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInstallPlugin(MySQLSQLStatementParser.InstallPluginContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUninstallPlugin(MySQLSQLStatementParser.UninstallPluginContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetVariable(MySQLSQLStatementParser.SetVariableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetCharset(MySQLSQLStatementParser.SetCharsetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetNames(MySQLSQLStatementParser.SetNamesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetPassword(MySQLSQLStatementParser.SetPasswordContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetTransaction(MySQLSQLStatementParser.SetTransactionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSetAutocommit(MySQLSQLStatementParser.SetAutocommitContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowMasterLogs(MySQLSQLStatementParser.ShowMasterLogsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowLogEvents(MySQLSQLStatementParser.ShowLogEventsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowObjectFilter(MySQLSQLStatementParser.ShowObjectFilterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowColumns(MySQLSQLStatementParser.ShowColumnsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowCreateDb(MySQLSQLStatementParser.ShowCreateDbContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowCreateFullIdObject(MySQLSQLStatementParser.ShowCreateFullIdObjectContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowCreateUser(MySQLSQLStatementParser.ShowCreateUserContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowEngine(MySQLSQLStatementParser.ShowEngineContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowGlobalInfo(MySQLSQLStatementParser.ShowGlobalInfoContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowErrors(MySQLSQLStatementParser.ShowErrorsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowCountErrors(MySQLSQLStatementParser.ShowCountErrorsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowSchemaFilter(MySQLSQLStatementParser.ShowSchemaFilterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowRoutine(MySQLSQLStatementParser.ShowRoutineContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowGrants(MySQLSQLStatementParser.ShowGrantsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowIndexes(MySQLSQLStatementParser.ShowIndexesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowOpenTables(MySQLSQLStatementParser.ShowOpenTablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowProfile(MySQLSQLStatementParser.ShowProfileContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowSlaveStatus(MySQLSQLStatementParser.ShowSlaveStatusContext ctx) {
        return null;
    }

    @Override
    public Boolean visitVariableClause(MySQLSQLStatementParser.VariableClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowCommonEntity(MySQLSQLStatementParser.ShowCommonEntityContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowFilter(MySQLSQLStatementParser.ShowFilterContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowGlobalInfoClause(MySQLSQLStatementParser.ShowGlobalInfoClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowSchemaEntity(MySQLSQLStatementParser.ShowSchemaEntityContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShowProfileType(MySQLSQLStatementParser.ShowProfileTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBinlogStatement(MySQLSQLStatementParser.BinlogStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCacheIndexStatement(MySQLSQLStatementParser.CacheIndexStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFlushStatement(MySQLSQLStatementParser.FlushStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitKillStatement(MySQLSQLStatementParser.KillStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLoadIndexIntoCache(MySQLSQLStatementParser.LoadIndexIntoCacheContext ctx) {
        return null;
    }

    @Override
    public Boolean visitResetStatement(MySQLSQLStatementParser.ResetStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitShutdownStatement(MySQLSQLStatementParser.ShutdownStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableIndexes(MySQLSQLStatementParser.TableIndexesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleFlushOption(MySQLSQLStatementParser.SimpleFlushOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitChannelFlushOption(MySQLSQLStatementParser.ChannelFlushOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableFlushOption(MySQLSQLStatementParser.TableFlushOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFlushTableOption(MySQLSQLStatementParser.FlushTableOptionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLoadedTableIndexes(MySQLSQLStatementParser.LoadedTableIndexesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleDescribeStatement(MySQLSQLStatementParser.SimpleDescribeStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFullDescribeStatement(MySQLSQLStatementParser.FullDescribeStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHelpStatement(MySQLSQLStatementParser.HelpStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUseStatement(MySQLSQLStatementParser.UseStatementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDescribeStatements(MySQLSQLStatementParser.DescribeStatementsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDescribeConnection(MySQLSQLStatementParser.DescribeConnectionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFullId(MySQLSQLStatementParser.FullIdContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTableName(MySQLSQLStatementParser.TableNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFullColumnName(MySQLSQLStatementParser.FullColumnNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexColumnName(MySQLSQLStatementParser.IndexColumnNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserName(MySQLSQLStatementParser.UserNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMysqlVariable(MySQLSQLStatementParser.MysqlVariableContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCharsetName(MySQLSQLStatementParser.CharsetNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCollationName(MySQLSQLStatementParser.CollationNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitEngineName(MySQLSQLStatementParser.EngineNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUuidSet(MySQLSQLStatementParser.UuidSetContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXid(MySQLSQLStatementParser.XidContext ctx) {
        return null;
    }

    @Override
    public Boolean visitXuidStringId(MySQLSQLStatementParser.XuidStringIdContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAuthPlugin(MySQLSQLStatementParser.AuthPluginContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUid(MySQLSQLStatementParser.UidContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleId(MySQLSQLStatementParser.SimpleIdContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDottedId(MySQLSQLStatementParser.DottedIdContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDecimalLiteral(MySQLSQLStatementParser.DecimalLiteralContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFileSizeLiteral(MySQLSQLStatementParser.FileSizeLiteralContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStringLiteral(MySQLSQLStatementParser.StringLiteralContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBooleanLiteral(MySQLSQLStatementParser.BooleanLiteralContext ctx) {
        return null;
    }

    @Override
    public Boolean visitHexadecimalLiteral(MySQLSQLStatementParser.HexadecimalLiteralContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNullNotnull(MySQLSQLStatementParser.NullNotnullContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstant(MySQLSQLStatementParser.ConstantContext ctx) {
        return null;
    }

    @Override
    public Boolean visitStringDataType(MySQLSQLStatementParser.StringDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDimensionDataType(MySQLSQLStatementParser.DimensionDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleDataType(MySQLSQLStatementParser.SimpleDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCollectionDataType(MySQLSQLStatementParser.CollectionDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSpatialDataType(MySQLSQLStatementParser.SpatialDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConvertedDataType(MySQLSQLStatementParser.ConvertedDataTypeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLengthOneDimension(MySQLSQLStatementParser.LengthOneDimensionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLengthTwoDimension(MySQLSQLStatementParser.LengthTwoDimensionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLengthTwoOptionalDimension(MySQLSQLStatementParser.LengthTwoOptionalDimensionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUidList(MySQLSQLStatementParser.UidListContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTables(MySQLSQLStatementParser.TablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIndexColumnNames(MySQLSQLStatementParser.IndexColumnNamesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpressions(MySQLSQLStatementParser.ExpressionsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpressionsWithDefaults(MySQLSQLStatementParser.ExpressionsWithDefaultsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstants(MySQLSQLStatementParser.ConstantsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleStrings(MySQLSQLStatementParser.SimpleStringsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUserVariables(MySQLSQLStatementParser.UserVariablesContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDefaultValue(MySQLSQLStatementParser.DefaultValueContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpressionOrDefault(MySQLSQLStatementParser.ExpressionOrDefaultContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIfExists(MySQLSQLStatementParser.IfExistsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIfNotExists(MySQLSQLStatementParser.IfNotExistsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSpecificFunctionCall(MySQLSQLStatementParser.SpecificFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAggregateFunctionCall(MySQLSQLStatementParser.AggregateFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitScalarFunctionCall(MySQLSQLStatementParser.ScalarFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUdfFunctionCall(MySQLSQLStatementParser.UdfFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPasswordFunctionCall(MySQLSQLStatementParser.PasswordFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSimpleFunctionCall(MySQLSQLStatementParser.SimpleFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDataTypeFunctionCall(MySQLSQLStatementParser.DataTypeFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitValuesFunctionCall(MySQLSQLStatementParser.ValuesFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCaseFunctionCall(MySQLSQLStatementParser.CaseFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCharFunctionCall(MySQLSQLStatementParser.CharFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPositionFunctionCall(MySQLSQLStatementParser.PositionFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubstrFunctionCall(MySQLSQLStatementParser.SubstrFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTrimFunctionCall(MySQLSQLStatementParser.TrimFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitWeightFunctionCall(MySQLSQLStatementParser.WeightFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExtractFunctionCall(MySQLSQLStatementParser.ExtractFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitGetFormatFunctionCall(MySQLSQLStatementParser.GetFormatFunctionCallContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCaseFuncAlternative(MySQLSQLStatementParser.CaseFuncAlternativeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLevelWeightList(MySQLSQLStatementParser.LevelWeightListContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLevelWeightRange(MySQLSQLStatementParser.LevelWeightRangeContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLevelInWeightListElement(MySQLSQLStatementParser.LevelInWeightListElementContext ctx) {
        return null;
    }

    @Override
    public Boolean visitAggregateWindowedFunction(MySQLSQLStatementParser.AggregateWindowedFunctionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitScalarFunctionName(MySQLSQLStatementParser.ScalarFunctionNameContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPasswordFunctionClause(MySQLSQLStatementParser.PasswordFunctionClauseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunctionArgs(MySQLSQLStatementParser.FunctionArgsContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunctionArg(MySQLSQLStatementParser.FunctionArgContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIsExpression(MySQLSQLStatementParser.IsExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNotExpression(MySQLSQLStatementParser.NotExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLogicalExpression(MySQLSQLStatementParser.LogicalExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPredicateExpression(MySQLSQLStatementParser.PredicateExpressionContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSoundsLikePredicate(MySQLSQLStatementParser.SoundsLikePredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExpressionAtomPredicate(MySQLSQLStatementParser.ExpressionAtomPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitInPredicate(MySQLSQLStatementParser.InPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubqueryComparasionPredicate(MySQLSQLStatementParser.SubqueryComparasionPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBetweenPredicate(MySQLSQLStatementParser.BetweenPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBinaryComparasionPredicate(MySQLSQLStatementParser.BinaryComparasionPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIsNullPredicate(MySQLSQLStatementParser.IsNullPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLikePredicate(MySQLSQLStatementParser.LikePredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRegexpPredicate(MySQLSQLStatementParser.RegexpPredicateContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnaryExpressionAtom(MySQLSQLStatementParser.UnaryExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCollateExpressionAtom(MySQLSQLStatementParser.CollateExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitSubqueryExpessionAtom(MySQLSQLStatementParser.SubqueryExpessionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMysqlVariableExpressionAtom(MySQLSQLStatementParser.MysqlVariableExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNestedExpressionAtom(MySQLSQLStatementParser.NestedExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitNestedRowExpressionAtom(MySQLSQLStatementParser.NestedRowExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMathExpressionAtom(MySQLSQLStatementParser.MathExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIntervalExpressionAtom(MySQLSQLStatementParser.IntervalExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitExistsExpessionAtom(MySQLSQLStatementParser.ExistsExpessionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitConstantExpressionAtom(MySQLSQLStatementParser.ConstantExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunctionCallExpressionAtom(MySQLSQLStatementParser.FunctionCallExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBinaryExpressionAtom(MySQLSQLStatementParser.BinaryExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFullColumnNameExpressionAtom(MySQLSQLStatementParser.FullColumnNameExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBitExpressionAtom(MySQLSQLStatementParser.BitExpressionAtomContext ctx) {
        return null;
    }

    @Override
    public Boolean visitUnaryOperator(MySQLSQLStatementParser.UnaryOperatorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitComparisonOperator(MySQLSQLStatementParser.ComparisonOperatorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitLogicalOperator(MySQLSQLStatementParser.LogicalOperatorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitBitOperator(MySQLSQLStatementParser.BitOperatorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitMathOperator(MySQLSQLStatementParser.MathOperatorContext ctx) {
        return null;
    }

    @Override
    public Boolean visitCharsetNameBase(MySQLSQLStatementParser.CharsetNameBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitTransactionLevelBase(MySQLSQLStatementParser.TransactionLevelBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitPrivilegesBase(MySQLSQLStatementParser.PrivilegesBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitIntervalTypeBase(MySQLSQLStatementParser.IntervalTypeBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitDataTypeBase(MySQLSQLStatementParser.DataTypeBaseContext ctx) {
        return null;
    }

    @Override
    public Boolean visitKeywordsCanBeId(MySQLSQLStatementParser.KeywordsCanBeIdContext ctx) {
        return null;
    }

    @Override
    public Boolean visitFunctionNameBase(MySQLSQLStatementParser.FunctionNameBaseContext ctx) {
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
