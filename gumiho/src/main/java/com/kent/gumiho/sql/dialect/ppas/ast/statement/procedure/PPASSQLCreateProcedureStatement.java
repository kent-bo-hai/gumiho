package com.kent.gumiho.sql.dialect.ppas.ast.statement.procedure;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.ddl.procedure.SQLCreateProcedureStatement;
import com.kent.gumiho.sql.dialect.ppas.ast.clause.SQLInvokerRights;
import com.kent.gumiho.sql.dialect.ppas.ast.statement.PPASSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PPASSQLCreateProcedureStatement extends SQLCreateProcedureStatement implements PPASSQLCreateStatement {


    private boolean orReplace = false;

    private String schema;

    private String name;

    private SQLInvokerRights invokerRights;



    public PPASSQLCreateProcedureStatement(DBType dbType) {
        super(dbType);
    }


}
