package com.kent.gumiho.sql.dialect.mysql.ast.statement.dml.insert;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.dml.MySQLSQLDMLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLInsertStatement extends AbstractMySQLSQLStatement implements MySQLSQLDMLStatement {

    public MySQLSQLInsertStatement(DBType dbType) {
        super(dbType);
    }
}
