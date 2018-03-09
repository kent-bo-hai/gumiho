package com.kent.gumiho.sql.print;

import java.util.Date;

/**
 * @author kongtong.ouyang on 2018/3/7.
 */
public interface SQLPrintable {

    boolean isUppCase();

    void print(char value);

    void print(int value);

    void print(Date date);

    void print(CharSequence text);

    void println();

    void printlnAfterValue(CharSequence text);

    void printSpace();

    void printSpaceAfterValue(CharSequence text);

    void printAfterSpace(CharSequence text);

    void printIndent();
}
