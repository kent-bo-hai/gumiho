
package com.kent.gumiho.sql.basic.visitor;


import com.kent.gumiho.sql.basic.ast.SQLObject;

public interface SQLVisitor<T> {

    boolean preVisit(SQLObject x);

    void postVisit(SQLObject x);
}
