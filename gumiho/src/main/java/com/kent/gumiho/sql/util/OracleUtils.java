package com.kent.gumiho.sql.util;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.translate.TransformConfig;
import com.kent.gumiho.sql.translate.result.TransformResult;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public final class OracleUtils {

    public static String format(String sql) {
        return SQLUtils.format(sql, DBType.ORACLE);
    }

    public static TransformResult toMySQL(String sql) {
        return null;
    }

    public static TransformResult toMySQL(String sql, TransformConfig config) {
        return null;
    }

    public static TransformResult toPostgreSQL(String sql) {
        return null;
    }

    public static TransformResult toPostgreSQL(String sql, TransformConfig config) {
        return null;
    }

    public static TransformResult toPPAS(String sql) {
        return null;
    }

    public static TransformResult toPPAS(String sql, TransformConfig config) {
        return null;
    }

}
