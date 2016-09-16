package com.company.collections.TaskEight.table;

import java.util.Comparator;
import java.util.HashMap;

public class NameSorter implements Comparator<HashMap<String, String>> {

    @Override
    public int compare(HashMap<String, String> o1, HashMap<String, String> o2) {

        return o1.get("Name").compareToIgnoreCase(o2.get("Name"));
    }
}
