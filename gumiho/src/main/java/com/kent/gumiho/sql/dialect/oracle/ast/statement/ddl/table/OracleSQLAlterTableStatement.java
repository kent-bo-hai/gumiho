package com.kent.gumiho.sql.dialect.oracle.ast.statement.ddl.table;


import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.ddl.MySQLSQLAlterStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class OracleSQLAlterTableStatement extends AbstractMySQLSQLStatement implements MySQLSQLAlterStatement {

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {

    }
}