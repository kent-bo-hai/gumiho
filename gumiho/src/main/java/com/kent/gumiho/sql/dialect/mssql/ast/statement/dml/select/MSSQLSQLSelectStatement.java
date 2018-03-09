package com.kent.gumiho.sql.dialect.mssql.ast.statement.dml.select;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.AbstractMSSQLSQLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.dml.MSSQLSQLDMLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.AbstractMySQLSQLStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.dml.MySQLSQLDMLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MSSQLSQLSelectStatement extends AbstractMSSQLSQLStatement implements MSSQLSQLDMLStatement {

    private boolean hignPriority;
    private boolean straightJoin;
    private boolean smallResult;
    private boolean bigResult;
    private boolean bufferResult;
    private Boolean cache;
    private boolean calcFoundRows;

    public MSSQLSQLSelectStatement(DBType dbType) {
        super(dbType);
    }
}
