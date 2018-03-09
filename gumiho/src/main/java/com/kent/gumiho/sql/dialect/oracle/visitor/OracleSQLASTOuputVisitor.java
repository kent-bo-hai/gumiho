package com.kent.gumiho.sql.dialect.oracle.visitor;

import com.kent.gumiho.sql.basic.visitor.SQLASTOutputVisitor;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class OracleSQLASTOuputVisitor extends SQLASTOutputVisitor implements OracleSQLASTVisitor {

    public OracleSQLASTOuputVisitor(StringBuilder appender) {
        super(appender);
    }
}
