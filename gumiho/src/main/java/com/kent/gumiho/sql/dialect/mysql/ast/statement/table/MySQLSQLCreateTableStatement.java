package com.kent.gumiho.sql.dialect.mysql.ast.statement.table;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLAbstractStatement;
import com.kent.gumiho.sql.dialect.mysql.ast.statement.MySQLSQLDDLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLCreateTableStatement extends SQLAbstractStatement implements MySQLSQLDDLStatement {

    public MySQLSQLCreateTableStatement(DBType dbType) {
        super(dbType);
    }
}
