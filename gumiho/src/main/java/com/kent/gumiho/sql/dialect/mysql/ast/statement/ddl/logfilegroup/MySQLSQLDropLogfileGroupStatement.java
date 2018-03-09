package com.kent.gumiho.sql.dialect.mysql.ast.statement.ddl.logfilegroup;


import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.ddl.MySQLSQLDropStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLDropLogfileGroupStatement extends AbstractMySQLSQLStatement implements MySQLSQLDropStatement {

    public MySQLSQLDropLogfileGroupStatement() {
    }

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {

    }
}
