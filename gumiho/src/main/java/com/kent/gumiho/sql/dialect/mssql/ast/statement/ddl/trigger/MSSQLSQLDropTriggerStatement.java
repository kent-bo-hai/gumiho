package com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.trigger;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.SQLDDLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.AbstractMSSQLSQLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.MSSQLSQLDropStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.ddl.MySQLSQLDropStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MSSQLSQLDropTriggerStatement extends AbstractMSSQLSQLStatement implements MSSQLSQLDropStatement {

    public MSSQLSQLDropTriggerStatement(DBType dbType) {
        super(dbType);
    }
}
