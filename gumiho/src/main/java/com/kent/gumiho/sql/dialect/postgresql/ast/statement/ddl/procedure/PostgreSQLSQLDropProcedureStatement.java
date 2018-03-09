package com.kent.gumiho.sql.dialect.postgresql.ast.statement.ddl.procedure;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.ddl.MySQLSQLDDLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.ddl.MySQLSQLDropStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PostgreSQLSQLDropProcedureStatement extends AbstractMySQLSQLStatement implements MySQLSQLDropStatement {


    public PostgreSQLSQLDropProcedureStatement(DBType dbType) {
        super(dbType);
    }
}
