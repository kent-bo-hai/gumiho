package com.kent.gumiho.sql.dialect.postgresql.ast.statement;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLAbstractStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class PostgreSQLSQLDeleteStatement extends SQLAbstractStatement implements PostgreSQLSQLDMLStatement {

    public PostgreSQLSQLDeleteStatement(DBType dbType) {
        super(dbType);
    }
}