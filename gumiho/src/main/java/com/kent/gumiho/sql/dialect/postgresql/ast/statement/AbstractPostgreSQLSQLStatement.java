package com.kent.gumiho.sql.dialect.postgresql.ast.statement;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public abstract class AbstractPostgreSQLSQLStatement extends AbstractSQLStatement implements PostgreSQLSQLStatement {


    public AbstractPostgreSQLSQLStatement() {

    }

    public AbstractPostgreSQLSQLStatement(DBType dbType) {
        super(dbType);
    }
}
