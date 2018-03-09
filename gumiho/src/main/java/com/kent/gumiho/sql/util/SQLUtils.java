package com.kent.gumiho.sql.util;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTOutputVisitor;
import com.kent.gumiho.sql.dialect.mysql.visitor.MySQLSQLASTOutputVisitor;
import com.kent.gumiho.sql.dialect.oracle.visitor.OracleSQLASTOuputVisitor;

import java.util.List;

/**
 * @author kongtong.ouyang on 2018/1/18.
 */
public final class SQLUtils {

    public static String format(String sql, DBType dbType) {
        List<SQLStatement> statements = SQLParserUtils.parse(sql, dbType);
        return toSQLString(statements, dbType);
    }

    public static String toSQLString(List<SQLStatement> statementList, DBType dbType) {
        StringBuilder out = new StringBuilder();

        SQLASTOutputVisitor visitor = createASTOutputVisitor(out, dbType);

        for (SQLStatement stmt : statementList) {
            stmt.accept(visitor);
        }

        return out.toString();
    }

    public static SQLASTOutputVisitor createASTOutputVisitor(StringBuilder out, DBType dbType) {
        switch (dbType) {
            case ORACLE:
                return new OracleSQLASTOuputVisitor(out);
            case MYSQL:
                return new MySQLSQLASTOutputVisitor(out);
            default:
                return new SQLASTOutputVisitor(out);
        }

    }

}
