package com.kent.gumiho.sql.dialect.oracle.visitor;

import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.oracle.ast.statement.OracleSQLStatement;
import com.kent.gumiho.sql.dialect.oracle.parser.OracleSQLStatementParserBaseVisitor;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class OracleSQLASTVisitor extends OracleSQLStatementParserBaseVisitor<OracleSQLStatement> implements SQLASTVisitor {

    
}
