package com.kent.gumiho.sql.dialect.postgresql.ast.statement.table;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLAbstractStatement;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.PostgreSQLSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PostgreSQLSQLCreateTableStatement extends SQLAbstractStatement implements PostgreSQLSQLCreateStatement {

    public PostgreSQLSQLCreateTableStatement(DBType dbType) {
        super(dbType);
    }
}
