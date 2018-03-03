package com.kent.gumiho.sql.dialect.postgresql.ast.statement.procedure;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.procedure.SQLCreateProcedureStatement;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.PostgreSQLSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PostgreSQLSQLAlterProcedureStatement extends SQLCreateProcedureStatement implements PostgreSQLSQLCreateStatement {


    

    public PostgreSQLSQLAlterProcedureStatement(DBType dbType) {
        super(dbType);
    }
}
