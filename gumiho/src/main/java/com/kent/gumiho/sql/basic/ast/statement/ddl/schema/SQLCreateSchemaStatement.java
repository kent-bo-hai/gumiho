package com.kent.gumiho.sql.basic.ast.statement.ddl.schema;


import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.expr.SQLNameExpr;
import com.kent.gumiho.sql.basic.ast.statement.AbstractSQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.SQLStatement;
import com.kent.gumiho.sql.basic.ast.statement.ddl.SQLCreateStatement;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class SQLCreateSchemaStatement extends AbstractSQLStatement implements SQLCreateStatement {

    private SQLNameExpr name;


    public SQLCreateSchemaStatement() {
    }

    public SQLCreateSchemaStatement(DBType dbType) {
        super(dbType);
    }

    @Override
    protected void accept0(SQLASTVisitor visitor) {
        visitor.preVisit(this);
        if (visitor.visit(this)) {
            acceptChild(visitor, name);
        }
    }

    @Override
    public SQLStatement clone() throws CloneNotSupportedException {
        SQLCreateSchemaStatement x = new SQLCreateSchemaStatement(this.dbType);

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
