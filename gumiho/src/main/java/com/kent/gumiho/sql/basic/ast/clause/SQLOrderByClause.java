package com.kent.gumiho.sql.basic.ast.clause;

import com.kent.gumiho.sql.basic.ast.SQLAbstractObject;
import com.kent.gumiho.sql.basic.ast.expr.SQLOrderByItemExpr;
import com.kent.gumiho.sql.basic.visitor.SQLVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class SQLOrderByClause extends SQLAbstractObject {

    protected final List<SQLOrderByItemExpr> items = new ArrayList<SQLOrderByItemExpr>();

    @Override
    protected void accept0(SQLVisitor visitor) {

    }
}
