package com.kent.gumiho.sql.basic.ast.statement;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.visitor.SQLVisitor;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class SQLSelectStatement extends SQLAbstractStatement implements SQLDMLStatement {


    public SQLSelectStatement(DBType dbType) {
        super(dbType);
    }

    @Override
    protected void accept0(SQLVisitor visitor) {
//        if (visitor.visit(this)) {
//            acceptChild(visitor, this.select);
//        }
//        visitor.endVisit(this);
    }

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
