package com.kent.gumiho.sql.dialect.ppas.ast.clause;

import com.kent.gumiho.sql.basic.ast.SQLAbstractObject;
import com.kent.gumiho.sql.basic.visitor.SQLVisitor;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */

public class SQLCDeclaration extends SQLAbstractObject implements SQLDeclaration {

    private boolean name;

    @Override
    protected void accept0(SQLVisitor visitor) {

    }

}
