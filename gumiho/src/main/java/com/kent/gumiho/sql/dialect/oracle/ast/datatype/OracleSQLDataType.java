package com.kent.gumiho.sql.dialect.oracle.ast.datatype;


import com.kent.gumiho.sql.basic.ast.expr.SQLExpr;

import java.util.List;

public interface OracleSQLDataType extends SQLExpr {

    String getName();

    long nameHashCode64();

    void setName(String name);

    List<SQLExpr> getArguments();

    Boolean getWithTimeZone();

    void setWithTimeZone(Boolean value);

    boolean isWithLocalTimeZone();

    void setWithLocalTimeZone(boolean value);

    @Override
    OracleSQLDataType clone();

//    void setDbType(DBType dbType);

//    DBType getDbType();

    interface Constants {
        String CHAR = "CHAR";
        String NCHAR = "NCHAR";
        String VARCHAR = "VARCHAR";
        String DATE = "DATE";
        String TIMESTAMP = "TIMESTAMP";
        String XML = "XML";

        String DECIMAL = "DECIMAL";
        String NUMBER = "NUMBER";
        String REAL = "REAL";
        String DOUBLE_PRECISION = "DOUBLE PRECISION";

        String TINYINT = "TINYINT";
        String SMALLINT = "SMALLINT";
        String INT = "INT";
        String BIGINT = "BIGINT";
        String TEXT = "TEXT";
        String BYTEA = "BYTEA";
        String BOOLEAN = "BOOLEAN";
    }
}
