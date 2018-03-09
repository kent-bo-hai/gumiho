package com.kent.gumiho.sql.dialect.postgresql.ast.statement.ddl.server;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.SQLDDLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.ddl.MySQLSQLDropStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PostgreSQLSQLDropServerStatement extends AbstractMySQLSQLStatement implements MySQLSQLDropStatement {

    public PostgreSQLSQLDropServerStatement(DBType dbType) {
        super(dbType);
    }
}
