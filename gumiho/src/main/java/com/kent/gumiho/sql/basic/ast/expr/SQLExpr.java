
package com.kent.gumiho.sql.basic.ast.expr;

import com.kent.gumiho.sql.basic.ast.SQLDataType;
import com.kent.gumiho.sql.basic.ast.SQLObject;

import java.util.List;

public interface SQLExpr extends SQLObject, Cloneable {
    SQLExpr clone();

    SQLDataType computeDataType();

    List<SQLObject> getChildren();
}
