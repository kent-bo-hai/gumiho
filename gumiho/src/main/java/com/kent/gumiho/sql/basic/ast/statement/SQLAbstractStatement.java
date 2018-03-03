package com.kent.gumiho.sql.basic.ast.statement;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.SQLAbstractObject;
import com.kent.gumiho.sql.basic.visitor.SQLVisitor;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public abstract class SQLAbstractStatement extends SQLAbstractObject implements SQLStatement {

    private DBType dbType;

    public SQLAbstractStatement(DBType dbType) {
        this.dbType = dbType;
    }

    @Override
    public DBType getDbType() {
        return dbType;
    }

    @Override
    protected void accept0(SQLVisitor visitor) {
        throw new UnsupportedOperationException(this.getClass().getName());
    }

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        throw new UnsupportedOperationException(this.getClass().getName());
    }
}
