package com.kent.gumiho.sql.dialect.mysql.ast.statement;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLAbstractStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MySQLSQLSelectStatement extends SQLAbstractStatement implements MySQLSQLDMLStatement {

    private boolean hignPriority;
    private boolean straightJoin;
    private boolean smallResult;
    private boolean bigResult;
    private boolean bufferResult;
    private Boolean cache;
    private boolean calcFoundRows;

    public MySQLSQLSelectStatement(DBType dbType) {
        super(dbType);
    }
}
