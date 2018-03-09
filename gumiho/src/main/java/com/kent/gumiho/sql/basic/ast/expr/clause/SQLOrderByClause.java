package com.kent.gumiho.sql.basic.ast.expr.clause;

import com.kent.gumiho.sql.basic.ast.SQLObject;
import com.kent.gumiho.sql.basic.ast.expr.AbstractSQLExpr;
import com.kent.gumiho.sql.basic.ast.expr.SQLExpr;
import com.kent.gumiho.sql.basic.ast.expr.SQLOrderByItemExpr;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class SQLOrderByClause extends AbstractSQLExpr {

    protected final List<SQLOrderByItemExpr> items = new ArrayList<SQLOrderByItemExpr>();

    @Override
    public SQLExpr clone() {
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
