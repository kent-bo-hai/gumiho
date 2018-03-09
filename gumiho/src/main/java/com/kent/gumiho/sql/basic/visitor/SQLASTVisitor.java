
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

public interface SQLASTVisitor {

    boolean preVisit(SQLObject x);


    boolean visit(SQLCreateDatabaseStatement x);

    boolean visit(SQLAlterDatabaseStatement x);

    boolean visit(SQLDropDatabaseStatement x);


    boolean visit(SQLCreateSchemaStatement x);

    boolean visit(SQLAlterSchemaStatement x);

    boolean visit(SQLDropSchemaStatement x);


    boolean visit(SQLCreateEventStatement x);

    boolean visit(SQLAlterEventStatement x);

    boolean visit(SQLDropEventStatement x);


    boolean visit(SQLCreateFunctionStatement x);

    boolean visit(SQLAlterFunctionStatement x);

    boolean visit(SQLDropFunctionStatement x);


    boolean visit(SQLCreateIndexStatement x);

    boolean visit(SQLAlterIndexStatement x);

    boolean visit(SQLDropIndexStatement x);


    boolean visit(SQLCreateLogfileGroupStatement x);

    boolean visit(SQLAlterLogfileGroupStatement x);

    boolean visit(SQLDropLogfileGroupStatement x);


    boolean visit(SQLCreateProcedureStatement x);

    boolean visit(SQLAlterProcedureStatement x);

    boolean visit(SQLDropProcedureStatement x);


    boolean visit(SQLCreateServerStatement x);

    boolean visit(SQLAlterServerStatement x);

    boolean visit(SQLDropServerStatement x);


    boolean visit(SQLCreateTableStatement x);

    boolean visit(SQLAlterTableStatement x);

    boolean visit(SQLDropTableStatement x);


    boolean visit(SQLCreateTablespaceStatement x);

    boolean visit(SQLAlterTablespaceStatement x);

    boolean visit(SQLDropTablespaceStatement x);


    boolean visit(SQLCreateTriggerStatement x);

    boolean visit(SQLAlterTriggerStatement x);

    boolean visit(SQLDropTriggerStatement x);


    boolean visit(SQLCreateUserStatement x);

    boolean visit(SQLAlterUserStatement x);

    boolean visit(SQLDropUserStatement x);


    boolean visit(SQLCreateViewStatement x);

    boolean visit(SQLAlterViewStatement x);

    boolean visit(SQLDropViewStatement x);


    void postVisit(SQLObject x);


}
