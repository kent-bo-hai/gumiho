package com.kent.gumiho.sql.dialect.ppas.ast.statement.table;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.dialect.oracle.ast.statement.ddl.OracleSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PPASSQLCreateTableStatement extends AbstractSQLStatement implements OracleSQLCreateStatement {

    public PPASSQLCreateTableStatement(DBType dbType) {
        super(dbType);
    }
}
