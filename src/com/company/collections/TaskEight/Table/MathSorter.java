package com.company.collections.TaskEight.Table;

import java.util.Comparator;

public class MathSorter implements Comparator<Row> {

    @Override
    public int compare(Row o1, Row o2) {

        return Integer.parseInt(o1.getMath().get("Math"))
                - Integer.parseInt(o2.getMath().get("Math"));
    }
}
