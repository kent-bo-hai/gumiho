package com.kent.gumiho.sql.dialect.mysql.ast.statement.procedure;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.procedure.SQLCreateProcedureStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.MySQLSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLAlterProcedureStatement extends SQLCreateProcedureStatement implements MySQLSQLCreateStatement {



    public MySQLSQLAlterProcedureStatement(DBType dbType) {
        super(dbType);
    }
}
