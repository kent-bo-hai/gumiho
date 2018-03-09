package com.kent.gumiho.sql.basic.ast.statement;

import com.kent.gumiho.sql.basic.DBType;
import com.kent.gumiho.sql.basic.ast.SQLObject;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public interface SQLStatement extends SQLObject {

    DBType getDbType();

    @Override
    SQLStatement clone() throws CloneNotSupportedException;

}
