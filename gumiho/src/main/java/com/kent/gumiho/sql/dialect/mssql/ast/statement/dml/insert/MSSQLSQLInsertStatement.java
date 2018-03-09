package com.kent.gumiho.sql.dialect.mssql.ast.statement.dml.insert;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.AbstractMSSQLSQLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.dml.MSSQLSQLDMLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MSSQLSQLInsertStatement extends AbstractMSSQLSQLStatement implements MSSQLSQLDMLStatement {

    public MSSQLSQLInsertStatement(DBType dbType) {
        super(dbType);
    }
}
