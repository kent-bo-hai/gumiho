package com.kent.gumiho.sql.dialect.mssql.ast.statement.dml.update;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.AbstractMSSQLSQLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.dml.MSSQLSQLDMLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MSSQLSQLUpdateStatement extends AbstractMSSQLSQLStatement implements MSSQLSQLDMLStatement {

    public MSSQLSQLUpdateStatement(DBType dbType) {
        super(dbType);
    }
}
