package com.kent.gumiho.sql.dialect.oracle.ast.statement;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public abstract class AbstractOracleSQLStatement extends AbstractSQLStatement implements OracleSQLStatement {

    public AbstractOracleSQLStatement() {
        super(DBType.ORACLE);
    }
}
