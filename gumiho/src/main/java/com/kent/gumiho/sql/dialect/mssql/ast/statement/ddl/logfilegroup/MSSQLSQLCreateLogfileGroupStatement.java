package com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.logfilegroup;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.SQLDDLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.AbstractMSSQLSQLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.MSSQLSQLCreateStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MSSQLSQLCreateLogfileGroupStatement extends AbstractMSSQLSQLStatement implements MSSQLSQLCreateStatement {


    public MSSQLSQLCreateLogfileGroupStatement(DBType dbType) {
        super(dbType);
    }


}
