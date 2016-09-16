package com.company.collections.TaskEight.table;

import java.util.ArrayList;
import java.util.Collections;

public class TableWorker {

    /**
     * This method start the program.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Row> progressTable = TableCreator.createTable();

        System.out.println("START TABLE");
        printProgressTable(progressTable);

        System.out.println("\nTABLE SORTED BY NAME");
        //sorted and print table by name
        Collections.sort(progressTable, new NameSorter());
        printProgressTable(progressTable);

        System.out.println("\nTABLE SORTED BY MATH RATING");
        //sorted and print table by math rating
        Collections.sort(progressTable, new MathSorter());
        printProgressTable(progressTable);

        System.out.println("\nTABLE SORTED BY PHYSICS RATING");
        //sorted and print table by physics rating
        Collections.sort(progressTable, new PhysicsSorter());
        printProgressTable(progressTable);

        System.out.println("\nTABLE SORTED BY GEOMETRY RATING");
        //sorted and print table by geometry rating
        Collections.sort(progressTable, new GeometrySorter());
        printProgressTable(progressTable);

        System.out.println("\nTABLE SORTED BY BEST RATING");
        //sorted and print table by best rating
        Collections.sort(progressTable);
        printProgressTable(progressTable);
    }

    /**
     * @param progressTable - list with table
     */
    private static void printProgressTable(ArrayList<Row> progressTable) {
        for (Row row : progressTable) {
            System.out.println(row.toString());
        }
    }
}
