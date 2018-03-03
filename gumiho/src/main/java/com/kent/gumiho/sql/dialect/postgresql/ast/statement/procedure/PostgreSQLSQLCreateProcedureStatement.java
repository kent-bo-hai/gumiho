package com.kent.gumiho.sql.dialect.postgresql.ast.statement.procedure;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.procedure.SQLCreateProcedureStatement;
import com.kent.gumiho.sql.dialect.postgresql.ast.clause.SQLInvokerRights;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.PostgreSQLSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PostgreSQLSQLCreateProcedureStatement extends SQLCreateProcedureStatement implements PostgreSQLSQLCreateStatement {


    private boolean orReplace = false;

    private String schema;

    private String name;

    private SQLInvokerRights invokerRights;



    public PostgreSQLSQLCreateProcedureStatement(DBType dbType) {
        super(dbType);
    }


}
