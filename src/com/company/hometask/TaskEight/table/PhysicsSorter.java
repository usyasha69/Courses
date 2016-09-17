package com.company.hometask.TaskEight.table;

import java.util.Comparator;
import java.util.HashMap;

public class PhysicsSorter implements Comparator<HashMap<String, String >> {

    @Override
    public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {

        return Integer.parseInt(o1.get("Physics")) -
                Integer.parseInt(o2.get("Physics"));
    }
}
