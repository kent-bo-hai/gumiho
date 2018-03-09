package com.kent.gumiho.sql.basic.ast.statement;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.AbstractSQLObject;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public abstract class AbstractSQLStatement extends AbstractSQLObject implements SQLStatement {

    public DBType dbType;

    public AbstractSQLStatement() {
    }

    public AbstractSQLStatement(DBType dbType) {
        this.dbType = dbType;
    }

    @Override
    public DBType getDbType() {
        return dbType;
    }


}
