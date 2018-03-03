package com.kent.gumiho.sql.dialect.oracle.ast.statement.procedure;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.procedure.SQLCreateProcedureStatement;
import com.kent.gumiho.sql.dialect.oracle.ast.clause.SQLInvokerRights;
import com.kent.gumiho.sql.dialect.oracle.ast.statement.OracleSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class OracleSQLCreateProcedureStatement extends SQLCreateProcedureStatement implements OracleSQLCreateStatement {


    private boolean orReplace = false;

    private String schema;

    private String name;

    private SQLInvokerRights invokerRights;



    public OracleSQLCreateProcedureStatement(DBType dbType) {
        super(dbType);
    }


}
