package com.kent.gumiho.sql.dialect.mysql.visitor;

import com.kent.gumiho.sql.basic.visitor.SQLASTOutputVisitor;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class MySQLSQLASTOutputVisitor extends SQLASTOutputVisitor implements MySQLSQLASTVisitor {


    public MySQLSQLASTOutputVisitor(StringBuilder appender) {
        super(appender);
    }


}
