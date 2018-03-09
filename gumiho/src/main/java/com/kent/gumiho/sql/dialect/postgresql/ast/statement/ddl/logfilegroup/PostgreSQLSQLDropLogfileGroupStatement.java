package com.kent.gumiho.sql.dialect.postgresql.ast.statement.ddl.logfilegroup;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.AbstractPostgreSQLSQLStatement;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.ddl.PostgreSQLSQLDropStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PostgreSQLSQLDropLogfileGroupStatement extends AbstractPostgreSQLSQLStatement implements PostgreSQLSQLDropStatement {

    public PostgreSQLSQLDropLogfileGroupStatement(DBType dbType) {
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
