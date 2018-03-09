package com.kent.gumiho.sql.basic.ast.expr;

import com.kent.gumiho.sql.basic.ast.SQLObject;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;

import java.util.List;

/**
 * @author kongtong.ouyang on 2018/3/9.
 */
public class SQLIdentifierExpr extends AbstractSQLExpr implements SQLNameExpr {

    protected String name;
    private long hashCode64;

    private SQLObject resolvedColumn;
    private SQLObject resolvedOwnerObject;

    @Override
    public SQLIdentifierExpr clone() {
        return null;
    }

    @Override
    public List<SQLObject> getChildren() {
        return null;
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {

    }
}
