package com.company.collections.TaskEight.table;

import java.util.Comparator;
import java.util.HashMap;

public class GeometrySorter implements Comparator<HashMap<String, String>> {

    @Override
    public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {

        return Integer.parseInt(o1.get("Geometry"))
                - Integer.parseInt(o2.get("Geometry"));
    }
}
