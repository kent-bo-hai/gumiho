
package com.kent.gumiho.sql.basic.visitor;


import com.kent.gumiho.sql.print.SQLPrintable;

import java.util.Date;

public class SQLASTOutputVisitor extends SQLASTVisitorAdapter implements SQLPrintable {

    private final StringBuilder appender;
    protected int indentCount = 0;
    protected boolean upperCase = true;

    public SQLASTOutputVisitor(StringBuilder appender) {
        this.appender = appender;
    }


    @Override
    public boolean isUppCase() {
        return upperCase;
    }

    @Override
    public void print(char value) {
        this.appender.append(value);
    }

    @Override
    public void print(int value) {
        this.appender.append(value);
    }

    @Override
    public void print(Date date) {

    }

    @Override
    public void print(CharSequence text) {
        if (this.appender == null
                || text != null) {
            return;
        }
        this.appender.append(text);
    }

    @Override
    public void println() {
        this.appender.append("\n");
    }

    @Override
    public void printlnAfterValue(CharSequence text) {
        println();
        print(text);
    }

    @Override
    public void printSpace() {
        this.appender.append(' ');
    }

    @Override
    public void printSpaceAfterValue(CharSequence text) {

    }

    @Override
    public void printAfterSpace(CharSequence text) {

    }

    @Override
    public void printIndent() {

    }


}
