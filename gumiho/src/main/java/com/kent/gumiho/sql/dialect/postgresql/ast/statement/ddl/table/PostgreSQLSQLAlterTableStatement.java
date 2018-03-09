package com.kent.gumiho.sql.dialect.postgresql.ast.statement.ddl.table;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.AbstractPostgreSQLSQLStatement;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.ddl.PostgreSQLSQLAlterStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PostgreSQLSQLAlterTableStatement extends AbstractPostgreSQLSQLStatement implements PostgreSQLSQLAlterStatement {

    public PostgreSQLSQLAlterTableStatement(DBType dbType) {
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
