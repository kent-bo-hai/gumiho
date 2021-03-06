package com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.server;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.SQLDDLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLAlterServerStatement extends AbstractMySQLSQLStatement implements SQLDDLStatement {

    public MySQLSQLAlterServerStatement(DBType dbType) {
        super(dbType);
    }
}
