package com.kent.gumiho.sql.dialect.mysql.ast.statement.ddl.trigger;


import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.ddl.MySQLSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLCreateTriggerStatement extends AbstractMySQLSQLStatement implements MySQLSQLCreateStatement {


    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {

    }
}
