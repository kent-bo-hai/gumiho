package com.kent.gumiho.sql.basic.ast.statement.ddl.database;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.expr.SQLNameExpr;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.SQLCreateStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class SQLCreateDatabaseStatement extends AbstractSQLStatement implements SQLCreateStatement {

    private SQLNameExpr name;


    public SQLCreateDatabaseStatement() {

    }

    public SQLCreateDatabaseStatement(DBType dbType) {
        super(dbType);
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {

        if (visitor.visit(this)) {
            acceptChild(visitor, name);
        }
    }

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        SQLCreateDatabaseStatement x = new SQLCreateDatabaseStatement();

        x.setName(this.name);

        return x;
    }


    public SQLNameExpr getName() {
        return name;
    }

    public void setName(SQLNameExpr name) {
        if (name != null) {
            name.setParent(this);
        }

        this.name = name;
    }


}
