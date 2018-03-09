package com.kent.gumiho.sql.dialect.postgresql.ast.statement.dml.delete;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.AbstractPostgreSQLSQLStatement;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.dml.PostgreSQLSQLDMLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PPASSQLDeleteStatement extends AbstractPostgreSQLSQLStatement implements PostgreSQLSQLDMLStatement {

    public PPASSQLDeleteStatement() {
    }

    public PPASSQLDeleteStatement(DBType dbType) {
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
