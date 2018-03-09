package com.kent.gumiho.sql.dialect.mysql.ast.statement.dml.select;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.dml.MySQLSQLDMLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLSelectStatement extends AbstractMySQLSQLStatement implements MySQLSQLDMLStatement {

    private boolean hignPriority;
    private boolean straightJoin;
    private boolean smallResult;
    private boolean bigResult;
    private boolean bufferResult;
    private Boolean cache;
    private boolean calcFoundRows;

    public MySQLSQLSelectStatement() {
    }

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {

    }
}
