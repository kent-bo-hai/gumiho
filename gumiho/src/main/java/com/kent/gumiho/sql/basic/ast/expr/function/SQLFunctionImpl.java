package com.kent.gumiho.sql.basic.ast.expr.function;

import com.kent.gumiho.sql.basic.ast.SQLObject;
import com.kent.gumiho.sql.basic.ast.expr.AbstractSQLExpr;
import com.kent.gumiho.sql.basic.ast.expr.SQLExpr;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;

import java.util.List;

/**
 * @author kongtong.ouyang on 2018/3/9.
 */
public class SQLFunctionImpl extends AbstractSQLExpr implements SQLFunction {


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
