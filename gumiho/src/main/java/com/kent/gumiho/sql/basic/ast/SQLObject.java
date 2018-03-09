package com.kent.gumiho.sql.basic.ast;


import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;

import java.util.Map;

public interface SQLObject extends Cloneable {

    void accept(SQLASTVisitor visitor);

    SQLObject clone() throws CloneNotSupportedException;

    SQLObject getParent();

    void setParent(SQLObject parent);

    Map<String, Object> getAttributes();

    Object getAttribute(String name);

    void putAttribute(String name, Object value);

    Map<String, Object> getAttributesDirect();

    void output(StringBuilder out);

}
