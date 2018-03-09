package com.kent.gumiho.sql.basic.ast.statement.dml.update;

import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.dml.SQLDMLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class SQLUpdateStatement extends AbstractSQLStatement implements SQLDMLStatement {

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {

    }
}
