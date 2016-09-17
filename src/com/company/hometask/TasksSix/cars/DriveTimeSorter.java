package com.company.hometask.TasksSix.cars;

import java.util.Comparator;

public class DriveTimeSorter implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getDriveTime() < o2.getDriveTime()) return -1;
        if (o1.getDriveTime() > o2.getDriveTime()) return 1;

        return 0;
    }
}
