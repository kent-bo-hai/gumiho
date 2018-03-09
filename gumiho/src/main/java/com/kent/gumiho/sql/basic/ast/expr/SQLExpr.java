
package com.kent.gumiho.sql.basic.ast.expr;

import com.kent.gumiho.sql.basic.ast.SQLObject;

import java.util.List;

public interface SQLExpr extends SQLObject, Cloneable {

    @Override
    SQLExpr clone() ;

    List<SQLObject> getChildren();
}
