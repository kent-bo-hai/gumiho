package com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.database;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.ddl.SQLDDLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.AbstractMSSQLSQLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.MSSQLSQLAlterStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MSSQLSQLAlterDatabaseStatement extends AbstractMSSQLSQLStatement implements MSSQLSQLAlterStatement {

    public MSSQLSQLAlterDatabaseStatement(DBType dbType) {
        super(dbType);
    }
}
