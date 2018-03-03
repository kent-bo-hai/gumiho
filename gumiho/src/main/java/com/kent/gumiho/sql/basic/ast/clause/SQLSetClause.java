package com.kent.gumiho.sql.basic.ast.clause;

import com.kent.gumiho.sql.basic.ast.SQLAbstractObject;
import com.kent.gumiho.sql.basic.ast.expr.SQLExpr;
import com.kent.gumiho.sql.basic.visitor.SQLVisitor;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class SQLSetClause extends SQLAbstractObject {

    private SQLExpr offset;
    private SQLExpr rowCount;

    @Override
    protected void accept0(SQLVisitor visitor) {

    }
}
