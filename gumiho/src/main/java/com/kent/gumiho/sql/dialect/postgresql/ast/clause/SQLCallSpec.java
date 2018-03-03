package com.kent.gumiho.sql.dialect.postgresql.ast.clause;

import com.kent.gumiho.sql.basic.ast.SQLAbstractObject;
import com.kent.gumiho.sql.basic.visitor.SQLVisitor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author kongtong.ouyang on 2018/2/8.
 */
@Setter
@Getter
public class SQLCallSpec extends SQLAbstractObject {

    private SQLDeclaration declaration;

    @Override
    protected void accept0(SQLVisitor visitor) {

    }


}
