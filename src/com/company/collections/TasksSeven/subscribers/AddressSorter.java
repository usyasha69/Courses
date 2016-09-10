package com.company.collections.TasksSeven.subscribers;

import java.util.Comparator;

public class AddressSorter implements Comparator<Subscriber> {

    @Override
    public int compare(Subscriber s1, Subscriber s2) {

        return s1.getAddress().compareToIgnoreCase(s2.getAddress());
    }
}
