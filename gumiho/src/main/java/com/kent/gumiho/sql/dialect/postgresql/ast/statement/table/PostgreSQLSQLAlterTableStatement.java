package com.kent.gumiho.sql.dialect.postgresql.ast.statement.table;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLAbstractStatement;
import com.kent.gumiho.sql.dialect.postgresql.ast.statement.PostgreSQLSQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PostgreSQLSQLAlterTableStatement extends SQLAbstractStatement implements PostgreSQLSQLCreateStatement {

    public PostgreSQLSQLAlterTableStatement(DBType dbType) {
        super(dbType);
    }
}
