package com.kent.gumiho.sql.dialect.ppas.ast.statement.procedure;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.ddl.procedure.SQLCreateProcedureStatement;
import com.kent.gumiho.sql.dialect.ppas.ast.statement.PPASSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PPASSQLAlterProcedureStatement extends SQLCreateProcedureStatement implements PPASSQLCreateStatement {


    

    public PPASSQLAlterProcedureStatement(DBType dbType) {
        super(dbType);
    }
}
