package com.company.collections.TaskEight.Table;

import java.util.Comparator;

public class NameSorter implements Comparator<Row> {
    @Override
    public int compare(Row o1, Row o2) {

        return o1.getName().get("Name").compareToIgnoreCase(o2.getName().get("Name"));
    }
}
