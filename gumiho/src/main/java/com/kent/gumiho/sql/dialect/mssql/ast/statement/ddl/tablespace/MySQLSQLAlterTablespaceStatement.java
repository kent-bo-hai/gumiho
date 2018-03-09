package com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.tablespace;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.AbstractMSSQLSQLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.MSSQLSQLAlterStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLAlterTablespaceStatement extends AbstractMSSQLSQLStatement implements MSSQLSQLAlterStatement {

    public MySQLSQLAlterTablespaceStatement(DBType dbType) {
        super(dbType);
    }
}
