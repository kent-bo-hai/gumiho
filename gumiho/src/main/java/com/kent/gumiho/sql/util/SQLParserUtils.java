package com.kent.gumiho.sql.util;

import com.kent.gumiho.sql.antlr.CaseInsensitiveCharStream;
import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.parser.SQLStatementLexer;
import com.kent.gumiho.sql.basic.parser.SQLStatementParser;
import com.kent.gumiho.sql.basic.visitor.SQLASTBuilderVisitor;
import com.kent.gumiho.sql.dialect.mysql.parser.MySQLSQLStatementLexer;
import com.kent.gumiho.sql.dialect.mysql.parser.MySQLSQLStatementParser;
import com.kent.gumiho.sql.dialect.mysql.visitor.MySQLSQLASTBuilderVisitor;
import com.kent.gumiho.sql.dialect.oracle.parser.OracleSQLStatementLexer;
import com.kent.gumiho.sql.dialect.oracle.parser.OracleSQLStatementParser;
import com.kent.gumiho.sql.dialect.oracle.visitor.OracleSQLASTBuilderVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kongtong.ouyang on 2018/3/2.
 */
public final class SQLParserUtils {

    public static List<SQLStatement> parse(String sql, DBType dbType) {
        ParseTree parseTree = createParseTree(sql, dbType);

        List<SQLStatement> statements = new ArrayList<>();
        ParseTreeVisitor visitor = createASTBuilderVisitor(statements, dbType);

        visitor.visit(parseTree);

        return statements;
    }

    public static ParseTree createParseTree(String sql, DBType dbType) {

        CodePointCharStream charStream = CharStreams.fromString(sql);
        CaseInsensitiveCharStream caseInsensitiveCharStream = new CaseInsensitiveCharStream(charStream);

        Lexer lexer;

        if (dbType == DBType.ORACLE) {
            lexer = new OracleSQLStatementLexer(caseInsensitiveCharStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            OracleSQLStatementParser parser = new OracleSQLStatementParser(tokenStream);
            return parser.parse();
        }

        if (dbType == DBType.MYSQL) {
            lexer = new MySQLSQLStatementLexer(caseInsensitiveCharStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            MySQLSQLStatementParser parser = new MySQLSQLStatementParser(tokenStream);

            return parser.parse();
        }

        if (dbType == DBType.MSSQL) {
            lexer = new MySQLSQLStatementLexer(caseInsensitiveCharStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            MySQLSQLStatementParser parser = new MySQLSQLStatementParser(tokenStream);
            return parser.parse();
        }

        if (dbType == DBType.PPAS) {

            return null;
        }

        if (dbType == DBType.POSTGRESQL) {
            lexer = new MySQLSQLStatementLexer(caseInsensitiveCharStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            MySQLSQLStatementParser parser = new MySQLSQLStatementParser(tokenStream);

            return parser.parse();
        }

        lexer = new SQLStatementLexer(caseInsensitiveCharStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SQLStatementParser parser = new SQLStatementParser(tokenStream);
        return parser.parse();

    }

    public static ParseTreeVisitor createASTBuilderVisitor(List<SQLStatement> statements, DBType dbType) {

        switch (dbType) {
            case ORACLE:
                return new OracleSQLASTBuilderVisitor(statements);
            case MYSQL:
                return new MySQLSQLASTBuilderVisitor(statements);
            default:
                return new SQLASTBuilderVisitor(statements);
        }

    }


}
