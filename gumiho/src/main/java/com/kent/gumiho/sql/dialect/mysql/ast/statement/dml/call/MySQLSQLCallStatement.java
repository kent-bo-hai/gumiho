package com.kent.gumiho.sql.dialect.mysql.ast.statement.dml.call;

import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.dml.SQLDMLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLCallStatement extends AbstractSQLStatement implements SQLDMLStatement {


    public MySQLSQLCallStatement() {
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {
//        if (visitor.visit(this)) {
//            acceptChild(visitor, this.select);
//        }
//        visitor.endVisit(this);
    }

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        return null;
    }
}
