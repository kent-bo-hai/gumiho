package com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.logfilegroup;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.SQLDDLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.AbstractMSSQLSQLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.MSSQLSQLAlterStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MSSQLSQLAlterLogfileGroupStatement extends AbstractMSSQLSQLStatement implements MSSQLSQLAlterStatement {

    public MSSQLSQLAlterLogfileGroupStatement(DBType dbType) {
        super(dbType);
    }
}
