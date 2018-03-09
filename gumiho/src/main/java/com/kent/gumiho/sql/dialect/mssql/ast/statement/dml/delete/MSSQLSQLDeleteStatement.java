package com.kent.gumiho.sql.dialect.mssql.ast.statement.dml.delete;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.dml.MySQLSQLDMLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MSSQLSQLDeleteStatement extends AbstractSQLStatement implements MySQLSQLDMLStatement {




    public MSSQLSQLDeleteStatement(DBType dbType) {
        super(dbType);
    }
}
