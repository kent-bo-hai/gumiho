package com.kent.gumiho.sql.basic.ast.expr.datatype;


import com.kent.gumiho.sql.basic.ast.expr.SQLExpr;

import java.util.List;

public interface SQLDataType extends SQLExpr {

    String getName();

    long nameHashCode64();

    void setName(String name);

    List<SQLExpr> getArguments();

    Boolean getWithTimeZone();

    void setWithTimeZone(Boolean value);

    boolean isWithLocalTimeZone();

    void setWithLocalTimeZone(boolean value);

    @Override
    SQLDataType clone();

//    void setDbType(DBType dbType);

//    DBType getDbType();

    interface Constants {

        String CHARACTER = "CHARACTER";
        String CHAR = "CHAR";

        String CHARACTER_VARYING = "CHARACTER VARYING";
        String CHAR_VARYING = "CHAR VARYING";

        String VARCHAR = "VARCHAR";
        String CHARACTER_LARGE_OBJECT = "CHARACTER LARGE OBJECT";
        String CHAR_LARGE_OBJECT = "CHAR LARGE OBJECT";
        String  CLOB = "CLOB";

        String NCHAR = "NCHAR";

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
