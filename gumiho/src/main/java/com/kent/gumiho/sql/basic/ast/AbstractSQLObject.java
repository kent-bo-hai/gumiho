package com.kent.gumiho.sql.basic.ast;


import com.kent.gumiho.sql.basic.ast.expr.datatype.SQLDataType;
import com.kent.gumiho.sql.basic.visitor.SQLASTVisitor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Setter
@Getter
public abstract class AbstractSQLObject implements SQLObject {

    protected SQLObject parent;
    protected Map<String, Object> attributes;

    public AbstractSQLObject() {
    }

    @Override
    public final void accept(SQLASTVisitor visitor) {
        if (visitor == null) {
            throw new IllegalArgumentException();
        }

        visitor.preVisit(this);

        accept0(visitor);

        visitor.postVisit(this);
    }

    protected abstract void accept0(SQLASTVisitor visitor);


    protected final void acceptChild(SQLASTVisitor visitor, List<? extends SQLObject> children) {
        if (children == null) {
            return;
        }

        for (int i = 0; i < children.size(); i++) {
//            acceptChild(visitor, children.get(i));
        }
    }

    protected final void acceptChild(SQLASTVisitor visitor, SQLObject child) {
        if (child == null) {
            return;
        }

        child.accept(visitor);
    }

    @Override
    public void output(StringBuilder out) {
        out.append(super.toString());
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        output(out);
        return out.toString();
    }

    @Override
    public SQLObject getParent() {
        return parent;
    }

    @Override
    public void setParent(SQLObject parent) {
        this.parent = parent;
    }

    @Override
    public Map<String, Object> getAttributes() {
        if (attributes == null) {
            attributes = new HashMap<String, Object>(1);
        }

        return attributes;
    }

    @Override
    public Object getAttribute(String name) {
        if (attributes == null) {
            return null;
        }

        return attributes.get(name);
    }

    @Override
    public void putAttribute(String name, Object value) {
        if (attributes == null) {
            attributes = new HashMap<String, Object>(1);
        }

        attributes.put(name, value);
    }

    @Override
    public Map<String, Object> getAttributesDirect() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    public void addBeforeComment(String comment) {
        if (comment == null) {
            return;
        }

        if (attributes == null) {
            attributes = new HashMap<String, Object>(1);
        }

        List<String> comments = (List<String>) attributes.get("format.before_comment");
        if (comments == null) {
            comments = new ArrayList<String>(2);
            attributes.put("format.before_comment", comments);
        }

        comments.add(comment);
    }

    @SuppressWarnings("unchecked")
    public void addBeforeComment(List<String> comments) {
        if (attributes == null) {
            attributes = new HashMap<String, Object>(1);
        }

        List<String> attrComments = (List<String>) attributes.get("format.before_comment");
        if (attrComments == null) {
            attributes.put("format.before_comment", comments);
        } else {
            attrComments.addAll(comments);
        }
    }

    @SuppressWarnings("unchecked")
    public List<String> getBeforeCommentsDirect() {
        if (attributes == null) {
            return null;
        }

        return (List<String>) attributes.get("format.before_comment");
    }

    @SuppressWarnings("unchecked")
    public void addAfterComment(String comment) {
        if (attributes == null) {
            attributes = new HashMap<String, Object>(1);
        }

        List<String> comments = (List<String>) attributes.get("format.after_comment");
        if (comments == null) {
            comments = new ArrayList<String>(2);
            attributes.put("format.after_comment", comments);
        }

        comments.add(comment);
    }

    @SuppressWarnings("unchecked")
    public void addAfterComment(List<String> comments) {
        if (comments == null) {
            return;
        }

        if (attributes == null) {
            attributes = new HashMap<String, Object>(1);
        }

        List<String> attrComments = (List<String>) attributes.get("format.after_comment");
        if (attrComments == null) {
            attributes.put("format.after_comment", comments);
        } else {
            attrComments.addAll(comments);
        }
    }

    @SuppressWarnings("unchecked")
    public List<String> getAfterCommentsDirect() {
        if (attributes == null) {
            return null;
        }

        return (List<String>) attributes.get("format.after_comment");
    }

    public boolean hasBeforeComment() {
        if (attributes == null) {
            return false;
        }

        List<String> comments = (List<String>) attributes.get("format.before_comment");

        if (comments == null) {
            return false;
        }

        return !comments.isEmpty();
    }

    public boolean hasAfterComment() {
        if (attributes == null) {
            return false;
        }

        List<String> comments = (List<String>) attributes.get("format.after_comment");
        if (comments == null) {
            return false;
        }

        return !comments.isEmpty();
    }


    public SQLDataType computeDataType() {
        return null;
    }





}
