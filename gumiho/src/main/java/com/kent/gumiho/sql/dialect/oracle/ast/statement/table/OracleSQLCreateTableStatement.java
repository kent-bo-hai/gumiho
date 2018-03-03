package com.kent.gumiho.sql.dialect.oracle.ast.statement.table;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLAbstractStatement;
import com.kent.gumiho.sql.basic.ast.statement.SQLDDLStatement;
import com.kent.gumiho.sql.dialect.oracle.ast.statement.OracleSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class OracleSQLCreateTableStatement extends SQLAbstractStatement implements OracleSQLCreateStatement {

    public OracleSQLCreateTableStatement(DBType dbType) {
        super(dbType);
    }
}
