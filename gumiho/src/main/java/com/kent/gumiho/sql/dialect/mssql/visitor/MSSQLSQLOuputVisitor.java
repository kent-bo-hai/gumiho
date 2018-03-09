package com.kent.gumiho.sql.dialect.mssql.visitor;

import com.kent.gumiho.sql.basic.visitor.SQLASTOutputVisitor;
import com.kent.gumiho.sql.dialect.mysql.visitor.MySQLSQLASTVisitor;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
public class MSSQLSQLOuputVisitor extends SQLASTOutputVisitor implements MySQLSQLASTVisitor {


    public MSSQLSQLOuputVisitor(StringBuilder appender) {
        super(appender);
    }
}
