
package com.kent.gumiho.sql.dialect.mysql.ast.expr;


import com.kent.gumiho.sql.basic.ast.SQLDataType;
import com.kent.gumiho.sql.basic.ast.SQLObject;

import java.util.List;

/**
 *
 */
public interface OracleSQLExpr extends SQLObject, Cloneable {

    @Override
    OracleSQLExpr clone();

    SQLDataType computeDataType();

    List<SQLObject> getChildren();
}
