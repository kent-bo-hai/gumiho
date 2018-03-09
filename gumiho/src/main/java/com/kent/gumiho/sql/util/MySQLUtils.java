package com.kent.gumiho.sql.util;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.translate.TransformConfig;
import com.kent.gumiho.sql.translate.result.TransformResult;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public final class MySQLUtils {

    public static final String SHOW_DATABASES_SQL = "show databases";
    public static final String SHOW_TABLES_SQL = "show tables";

    public static List<String> showDatabases(Connection conn) throws SQLException {
        List<String> tables = new ArrayList<String>();

        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("show databases");
            while (rs.next()) {
                String tableName = rs.getString(1);
                tables.add(tableName);
            }
        } finally {
            JdbcUtils.close(rs);
            JdbcUtils.close(stmt);
        }

        return tables;
    }

    public static List<String> showTables(Connection conn) throws SQLException {
        List<String> tables = new ArrayList<String>();

        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("show tables");
            while (rs.next()) {
                String tableName = rs.getString(1);
                tables.add(tableName);
            }
        } finally {
            JdbcUtils.close(rs);
            JdbcUtils.close(stmt);
        }

        return tables;
    }

    public static String format(String sql) {
        return SQLUtils.format(sql, DBType.MYSQL);
    }

    public static TransformResult toOracle(String sql) {
        return null;
    }

    public static TransformResult toOracle(String sql, TransformConfig config) {
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
