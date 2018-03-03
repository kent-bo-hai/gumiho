package com.kent.gumiho.sql.util;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.parser.SQLStatementParser;

import java.util.List;

/**
 * @author kongtong.ouyang on 2018/1/18.
 */
public final class SQLUtils {

    public static String format(String sql, DBType dbType) {
        SQLStatementParser parser = SQLParserUtils.createSQLStatementParser(sql, dbType);
        List<SQLStatement> statementList = parser.parseStatementList();
        return toSQLString(statementList, dbType, parameters, option);
    }



}
