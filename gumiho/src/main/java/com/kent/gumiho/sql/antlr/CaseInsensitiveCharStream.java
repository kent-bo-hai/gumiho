package com.kent.gumiho.sql.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.misc.Interval;

/**
 * @author kongtong.ouyang on 2018/3/6.
 * @see CaseChangingCharStream
 */
public class CaseInsensitiveCharStream implements CharStream {

    final CharStream stream;

    /**
     * Constructs a new CaseChangingCharStream wrapping the given {@link CharStream} forcing
     * all characters to upper case
     *
     * @param stream The stream to wrap.
     */
    public CaseInsensitiveCharStream(CharStream stream) {
        this.stream = stream;
    }

    @Override
    public String getText(Interval interval) {
        return stream.getText(interval);
    }

    @Override
    public void consume() {
        stream.consume();
    }

    @Override
    public int LA(int i) {
        int c = stream.LA(i);
        if (c <= 0) {
            return c;
        }

        return Character.toUpperCase(c);
    }

    @Override
    public int mark() {
        return stream.mark();
    }

    @Override
    public void release(int marker) {
        stream.release(marker);
    }

    @Override
    public int index() {
        return stream.index();
    }

    @Override
    public void seek(int index) {
        stream.seek(index);
    }

    @Override
    public int size() {
        return stream.size();
    }

    @Override
    public String getSourceName() {
        return stream.getSourceName();
    }
}
