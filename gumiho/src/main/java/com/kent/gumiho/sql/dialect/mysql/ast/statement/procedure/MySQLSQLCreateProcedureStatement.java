package com.kent.gumiho.sql.dialect.mysql.ast.statement.procedure;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.procedure.SQLCreateProcedureStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.clause.SQLInvokerRights;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.MySQLSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLCreateProcedureStatement extends SQLCreateProcedureStatement implements MySQLSQLCreateStatement {


    private boolean orReplace = false;

    private String schema;

    private String name;

    private SQLInvokerRights invokerRights;



    public MySQLSQLCreateProcedureStatement(DBType dbType) {
        super(dbType);
    }


}
