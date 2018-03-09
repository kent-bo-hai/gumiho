package com.kent.gumiho.sql.dialect.mssql.ast.statement.dml.call;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.AbstractMSSQLSQLStatement;
import com.kent.gumiho.sql.dialect.mssql.ast.statement.dml.MSSQLSQLDMLStatement;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class MSSQLSQLCallStatement extends AbstractMSSQLSQLStatement implements MSSQLSQLDMLStatement {


    public MSSQLSQLCallStatement(DBType dbType) {
        super(dbType);
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {
//        if (visitor.visit(this)) {
//            acceptChild(visitor, this.select);
//        }
//        visitor.endVisit(this);
    }

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
