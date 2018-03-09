
package com.kent.gumiho.sql.basic.ast.expr;

import com.kent.gumiho.sql.basic.ast.AbstractSQLObject;

public abstract class AbstractSQLExpr extends AbstractSQLObject implements SQLExpr {

    @Override
    public abstract SQLExpr clone();
}
