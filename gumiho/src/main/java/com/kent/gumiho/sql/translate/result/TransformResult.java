package com.kent.gumiho.sql.translate.result;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kongtong.ouyang on 2018/1/23.
 */
public class TransformResult {

    public final String sourceSql;
    public String targetSql;


    public final Set<TransformError> errors = new HashSet<TransformError>();
    public final Set<TransformChange> changes = new HashSet<TransformChange>();
    public final Set<TransformWarnning> warnnings = new HashSet<TransformWarnning>();

    public TransformResult(String sourceSql) {
        this.sourceSql = sourceSql;
    }


}
