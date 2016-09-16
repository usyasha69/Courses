package com.company.collections.TaskEight.table;

import java.util.Comparator;
import java.util.HashMap;

public class BestRatingSorter implements Comparator<HashMap<String, String>> {

    @Override
    public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {
        int mathResult = Integer.parseInt(o1.get("Math")) - Integer.parseInt(o2.get("Math"));

        int physicsResult = Integer.parseInt(o1.get("Physics"))
                - Integer.parseInt(o2.get("Physics"));

        int geometryResult = Integer.parseInt(o1.get("Geometry"))
                - Integer.parseInt(o2.get("Geometry"));

        return mathResult + physicsResult + geometryResult;
    }
}
