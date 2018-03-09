package com.kent.gumiho.sql.dialect.ppas.ast.clause;

import com.kent.gumiho.sql.basic.ast.AbstractSQLObject;
import com.kent.gumiho.sql.basic.visitor.SQLVisitor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
@Setter
@Getter
public class SQLCallSpec extends AbstractSQLObject {

    private SQLDeclaration declaration;

    @Override
    protected void accept0(SQLVisitor visitor) {

    }


}
