
package com.kent.gumiho.sql.dialect.postgresql.ast.expr;


import com.kent.gumiho.sql.basic.ast.expr.datatype.SQLDataType;
import com.kent.gumiho.sql.basic.ast.SQLObject;

import java.util.List;

/**
 *
 */
public interface PPASSQLExpr extends SQLObject, Cloneable {

    @Override
    PPASSQLExpr clone();

    SQLDataType computeDataType();

    List<SQLObject> getChildren();
}
