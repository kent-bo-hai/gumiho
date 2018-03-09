package com.kent.gumiho.sql.dialect.postgresql.ast.statement.ddl.view;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.SQLDDLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.ddl.MySQLSQLAlterStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLAlterViewStatement extends AbstractMySQLSQLStatement implements MySQLSQLAlterStatement {

    public MySQLSQLAlterViewStatement(DBType dbType) {
        super(dbType);
    }
}
