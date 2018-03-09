package com.kent.gumiho.sql.dialect.postgresql.ast.statement.ddl.server;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.AbstractPostgreSQLSQLStatement;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.ddl.PostgreSQLSQLAlterStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PostgreSQLSQLAlterServerStatement extends AbstractPostgreSQLSQLStatement implements PostgreSQLSQLAlterStatement {

    public PostgreSQLSQLAlterServerStatement(DBType dbType) {
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
