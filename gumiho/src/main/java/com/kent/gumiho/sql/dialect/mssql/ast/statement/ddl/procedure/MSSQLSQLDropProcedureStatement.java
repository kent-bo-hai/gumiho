package com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.procedure;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.AbstractMSSQLSQLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.ddl.MSSQLSQLDropStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.ddl.MySQLSQLDDLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MSSQLSQLDropProcedureStatement extends AbstractMSSQLSQLStatement implements MSSQLSQLDropStatement {


    public MSSQLSQLDropProcedureStatement(DBType dbType) {
        super(dbType);
    }
}
