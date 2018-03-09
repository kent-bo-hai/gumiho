package com.kent.gumiho.sql.dialect.mssql.ast.statement;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public abstract class AbstractMSSQLSQLStatement extends AbstractSQLStatement implements MSSQLSQLStatement {

    public AbstractMSSQLSQLStatement(DBType dbType) {
        super(dbType);
    }
}
