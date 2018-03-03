package com.kent.gumiho.sql.util;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.dialect.oracle.parser.OracleSQLStatementLexer;
import com.kent.gumiho.sql.dialect.oracle.parser.OracleSQLStatementParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;

/**
 * @author kongtong.ouyang on 2018/3/2.
 */
public final class SQLParserUtils {

    public static Parser createSQLStatementParser(String sql, DBType dbType) {
        CodePointCharStream charStreams = CharStreams.fromString(sql);

        if (dbType == DBType.ORACLE) {

            OracleSQLStatementLexer lexer = new OracleSQLStatementLexer(charStreams);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            OracleSQLStatementParser parser = new OracleSQLStatementParser(tokenStream);

            OracleSQLStatementParser.Compilation_unitContext cst = parser.compilation_unit();

            return new OracleStatementParser(sql);
        }

        return null;
    }
}
