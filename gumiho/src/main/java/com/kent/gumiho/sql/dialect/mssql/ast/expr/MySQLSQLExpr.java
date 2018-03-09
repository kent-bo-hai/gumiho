
package com.kent.gumiho.sql.dialect.mssql.ast.expr;


import com.kent.gumiho.sql.basic.ast.expr.datatype.SQLDataType;
import com.kent.gumiho.sql.basic.ast.SQLObject;

import java.util.List;

/**
 *
 */
public interface MySQLSQLExpr extends SQLObject, Cloneable {

    @Override
    MySQLSQLExpr clone();

    SQLDataType computeDataType();

    List<SQLObject> getChildren();
}
