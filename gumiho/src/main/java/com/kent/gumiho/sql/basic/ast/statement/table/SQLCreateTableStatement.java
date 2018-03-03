package com.kent.gumiho.sql.basic.ast.statement.table;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLAbstractStatement;
import com.kent.gumiho.sql.basic.ast.statement.SQLCreateStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class SQLCreateTableStatement extends SQLAbstractStatement implements SQLCreateStatement {

    public SQLCreateTableStatement(DBType dbType) {
        super(dbType);
    }
}
