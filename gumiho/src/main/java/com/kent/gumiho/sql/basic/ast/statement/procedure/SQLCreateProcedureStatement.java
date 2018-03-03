package com.kent.gumiho.sql.basic.ast.statement.procedure;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLAbstractStatement;
import com.kent.gumiho.sql.basic.ast.statement.SQLDDLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class SQLCreateProcedureStatement extends SQLAbstractStatement implements SQLDDLStatement {

    public SQLCreateProcedureStatement(DBType dbType) {
        super(dbType);
    }
}
