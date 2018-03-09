package com.kent.gumiho.sql.print;

import com.kent.gumiho.sql.translate.result.TransformChange;
import com.kent.gumiho.sql.translate.result.TransformError;
import com.kent.gumiho.sql.translate.result.TransformWarnning;

import java.util.List;
import java.util.Set;

/**
 * @author kongtong.ouyang on 2018/3/7.
 */
public interface SQLTransformPrintable extends SQLPrintable {

    List<TransformError> getErrors();

    Set<TransformChange> getChanges();

    Set<TransformWarnning> getWarnnings();

    List<Integer> getOutputParameters();

    Set<Integer> getLimitParameters();
}
