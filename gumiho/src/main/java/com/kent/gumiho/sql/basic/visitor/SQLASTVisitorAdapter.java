
package com.kent.gumiho.sql.basic.visitor;


import com.kent.gumiho.sql.basic.ast.SQLObject;
import com.kent.gumiho.sql.basic.ast.statement.ddl.database.SQLAlterDatabaseStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.database.SQLCreateDatabaseStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.database.SQLDropDatabaseStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.event.SQLAlterEventStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.event.SQLCreateEventStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.event.SQLDropEventStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.function.SQLAlterFunctionStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.function.SQLCreateFunctionStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.function.SQLDropFunctionStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.index.SQLAlterIndexStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.index.SQLCreateIndexStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.index.SQLDropIndexStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.logfilegroup.SQLAlterLogfileGroupStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.logfilegroup.SQLCreateLogfileGroupStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.logfilegroup.SQLDropLogfileGroupStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.procedure.SQLAlterProcedureStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.procedure.SQLCreateProcedureStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.procedure.SQLDropProcedureStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.schema.SQLAlterSchemaStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.schema.SQLCreateSchemaStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.schema.SQLDropSchemaStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.server.SQLAlterServerStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.server.SQLCreateServerStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.server.SQLDropServerStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.table.SQLAlterTableStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.table.SQLCreateTableStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.table.SQLDropTableStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.tablespace.SQLAlterTablespaceStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.tablespace.SQLCreateTablespaceStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.tablespace.SQLDropTablespaceStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.trigger.SQLAlterTriggerStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.trigger.SQLCreateTriggerStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.trigger.SQLDropTriggerStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.user.SQLAlterUserStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.user.SQLCreateUserStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.user.SQLDropUserStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.view.SQLAlterViewStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.view.SQLCreateViewStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.view.SQLDropViewStatement;

public class SQLASTVisitorAdapter implements SQLASTVisitor {

    @Override
    public boolean preVisit(SQLObject x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateDatabaseStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterDatabaseStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropDatabaseStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateSchemaStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterSchemaStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropSchemaStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateEventStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterEventStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropEventStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateFunctionStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterFunctionStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropFunctionStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateIndexStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterIndexStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropIndexStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateLogfileGroupStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterLogfileGroupStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropLogfileGroupStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateProcedureStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterProcedureStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropProcedureStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateServerStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterServerStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropServerStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateTableStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterTableStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropTableStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateTablespaceStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterTablespaceStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropTablespaceStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateTriggerStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterTriggerStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropTriggerStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateUserStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterUserStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropUserStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLCreateViewStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterViewStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLDropViewStatement x) {
        return false;
    }

    @Override
    public void postVisit(SQLObject x) {

    }
}
