package com.kent.gumiho.sql.dialect.ppas.ast.statement.procedure;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.procedure.SQLCreateProcedureStatement;
import com.kent.gumiho.sql.dialect.ppas.ast.statement.OracleSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class OracleSQLAlterProcedureStatement extends SQLCreateProcedureStatement implements OracleSQLCreateStatement {


    

    public OracleSQLAlterProcedureStatement(DBType dbType) {
        super(dbType);
    }
}
