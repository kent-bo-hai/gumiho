package com.kent.gumiho.sql.dialect.mysql.ast.statement;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public abstract class AbstractMySQLSQLStatement extends AbstractSQLStatement implements MySQLSQLStatement {

    public AbstractMySQLSQLStatement() {
        super(DBType.MYSQL);
    }
}
