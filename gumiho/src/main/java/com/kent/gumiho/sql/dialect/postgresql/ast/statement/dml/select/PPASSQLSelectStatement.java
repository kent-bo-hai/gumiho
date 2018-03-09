package com.kent.gumiho.sql.dialect.postgresql.ast.statement.dml.select;

/**
 * @author kongtong.ouyang on 2018/3/10.
 */

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.AbstractPostgreSQLSQLStatement;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.dml.PostgreSQLSQLDMLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PPASSQLSelectStatement extends AbstractPostgreSQLSQLStatement implements PostgreSQLSQLDMLStatement {


    public PPASSQLSelectStatement() {
        super(DBType.POSTGRESQL);
    }


    @Override
    protected void accept0(SQLASTVisitor visitor) {

    }

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        return null;
    }
}
