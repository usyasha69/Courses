package com.company.collections.TaskEight.Table;

import java.util.Comparator;

public class PhysicsSorter implements Comparator<Row> {
    @Override
    public int compare(Row o1, Row o2) {

        return Integer.parseInt(o1.getPhysics().get("Physics")) -
                Integer.parseInt(o2.getPhysics().get("Physics"));
    }
}
