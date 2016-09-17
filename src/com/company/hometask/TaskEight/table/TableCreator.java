package com.company.hometask.TaskEight.table;

import java.util.ArrayList;
import java.util.HashMap;

public class TableCreator {

    /**
     * This method create array list with rows.
     *
     * @return - array list with rows
     */
    public static ArrayList<HashMap<String, String>> createTable() {
        //result
        ArrayList<HashMap<String, String>> progressTable = new ArrayList<>();

        //create and filling first table row
        HashMap<String, String> firstRow = new HashMap<>();

        firstRow.put("Name", "Vasya");
        firstRow.put("Math", "10");
        firstRow.put("Physics", "11");
        firstRow.put("Geometry", "9");

        progressTable.add(firstRow);

        //create and filling second table row
        HashMap<String, String> secondRow = new HashMap<>();

        secondRow.put("Name", "Petya");
        secondRow.put("Math", "8");
        secondRow.put("Physics", "12");
        secondRow.put("Geometry", "7");

        progressTable.add(secondRow);

        //create and filling third table row
        HashMap<String, String> thirdRow = new HashMap<>();

        thirdRow.put("Name", "Sanya");
        thirdRow.put("Math", "12");
        thirdRow.put("Physics", "10");
        thirdRow.put("Geometry", "9");

        progressTable.add(thirdRow);

        //create and filling fourth table row
        HashMap<String, String> fourthRow = new HashMap<>();

        fourthRow.put("Name", "Dima");
        fourthRow.put("Math", "12");
        fourthRow.put("Physics", "9");
        fourthRow.put("Geometry", "11");

        progressTable.add(fourthRow);

        //create and filling fifth table row
        HashMap<String, String> fifthRow = new HashMap<>();

        fifthRow.put("Name", "Kolya");
        fifthRow.put("Math", "9");
        fifthRow.put("Physics", "11");
        fifthRow.put("Geometry", "9");

        progressTable.add(fifthRow);

        //create and filling sixth table row
        HashMap<String, String> sixthRow = new HashMap<>();

        sixthRow.put("Name", "Danya");
        sixthRow.put("Math", "10");
        sixthRow.put("Physics", "8");
        sixthRow.put("Geometry", "12");

        progressTable.add(sixthRow);

        return progressTable;
    }
}
