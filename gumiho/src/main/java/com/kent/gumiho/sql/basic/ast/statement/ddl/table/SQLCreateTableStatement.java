package com.kent.gumiho.sql.basic.ast.statement.ddl.table;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.SQLCreateStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class SQLCreateTableStatement extends AbstractSQLStatement implements SQLCreateStatement {

    public SQLCreateTableStatement(DBType dbType) {
        super(dbType);
    }

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {

    }
}
