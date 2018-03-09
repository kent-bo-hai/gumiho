package com.kent.gumiho.sql.dialect.postgresql.ast.statement.dml.insert;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.dml.PostgreSQLSQLDMLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PPASSQLInsertStatement extends AbstractSQLStatement implements PostgreSQLSQLDMLStatement {

    public PPASSQLInsertStatement(DBType dbType) {
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
