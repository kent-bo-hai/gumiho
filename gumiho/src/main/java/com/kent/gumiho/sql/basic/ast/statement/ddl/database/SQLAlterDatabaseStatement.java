package com.kent.gumiho.sql.basic.ast.statement.ddl.database;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.SQLAlterStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class SQLAlterDatabaseStatement extends AbstractSQLStatement implements SQLAlterStatement {

    public SQLAlterDatabaseStatement(DBType dbType) {
        super(dbType);
    }


    @Override
    protected void accept0(SQLASTVisitor visitor) {

    }

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        return null;
    }
}
