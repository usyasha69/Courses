package com.company.collections.TaskEight.Table;

import java.util.Comparator;

public class GeometrySorter implements Comparator<Row> {
    @Override
    public int compare(Row o1, Row o2) {

        return Integer.parseInt(o1.getGeometry().get("Geometry"))
                - Integer.parseInt(o2.getGeometry().get("Geometry"));
    }
}
