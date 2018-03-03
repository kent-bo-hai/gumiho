package com.kent.gumiho.sql.dialect.mysql.ast.statement;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLAbstractStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLDeleteStatement extends SQLAbstractStatement implements MySQLSQLDMLStatement {




    public MySQLSQLDeleteStatement(DBType dbType) {
        super(dbType);
    }
}
