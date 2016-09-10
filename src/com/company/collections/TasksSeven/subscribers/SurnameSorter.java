package com.company.collections.TasksSeven.subscribers;

import java.util.Comparator;

public class SurnameSorter implements Comparator<Subscriber> {
    @Override
    public int compare(Subscriber s1, Subscriber s2) {
        String[] firstArray = s1.getFullName().split(" ");
        String[] secondArray = s2.getFullName().split(" ");

        return firstArray[0].compareToIgnoreCase(secondArray[0]);
    }
}
