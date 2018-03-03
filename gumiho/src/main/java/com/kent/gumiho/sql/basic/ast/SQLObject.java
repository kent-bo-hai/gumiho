package com.kent.gumiho.sql.basic.ast;


import com.kent.gumiho.sql.basic.visitor.SQLVisitor;

import java.util.Map;

public interface SQLObject extends Cloneable {

    void accept(SQLVisitor visitor);

    SQLObject clone() throws CloneNotSupportedException;

    SQLObject getParent();

    void setParent(SQLObject parent);

    Map<String, Object> getAttributes();

    Object getAttribute(String name);

    void putAttribute(String name, Object value);

    Map<String, Object> getAttributesDirect();

    void output(StringBuffer buf);

}
