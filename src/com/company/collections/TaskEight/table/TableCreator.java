package com.company.collections.TaskEight.table;

import java.util.ArrayList;
import java.util.HashMap;

public class TableCreator {

    /**
     * This method create array list with rows.
     *
     * @return - array list with rows
     */
    public static ArrayList<Row> createTable() {
        //result
        ArrayList<Row> progressTable = new ArrayList<>();

        //create and filling first table row
        HashMap<String, String> firstRowName = new HashMap<>();
        firstRowName.put("Name", "Vasya");

        HashMap<String, String> firstRowMath = new HashMap<>();
        firstRowMath.put("Math", "10");

        HashMap<String, String> firstRowPhysics = new HashMap<>();
        firstRowPhysics.put("Physics", "11");

        HashMap<String, String> firstRowGeometry = new HashMap<>();
        firstRowGeometry.put("Geometry", "9");

        progressTable.add(new Row(firstRowName, firstRowMath, firstRowPhysics, firstRowGeometry));

        //create and filling second table row
        HashMap<String, String> secondRowName = new HashMap<>();
        secondRowName.put("Name", "Petya");

        HashMap<String, String> secondRowMath = new HashMap<>();
        secondRowMath.put("Math", "8");

        HashMap<String, String> secondRowPhysics = new HashMap<>();
        secondRowPhysics.put("Physics", "12");

        HashMap<String, String> secondRowGeometry = new HashMap<>();
        secondRowGeometry.put("Geometry", "7");

        progressTable.add(new Row(secondRowName, secondRowMath, secondRowPhysics, secondRowGeometry));

        //create and filling third table row
        HashMap<String, String> thirdRowName = new HashMap<>();
        thirdRowName.put("Name", "Sanya");

        HashMap<String, String> thirdRowMath = new HashMap<>();
        thirdRowMath.put("Math", "12");

        HashMap<String, String> thirdRowPhysics = new HashMap<>();
        thirdRowPhysics.put("Physics", "10");

        HashMap<String, String> thirdRowGeometry = new HashMap<>();
        thirdRowGeometry.put("Geometry", "9");

        progressTable.add(new Row(thirdRowName, thirdRowMath, thirdRowPhysics, thirdRowGeometry));

        //create and filling fourth table row
        HashMap<String, String> fourthRowName = new HashMap<>();
        fourthRowName.put("Name", "Dima");

        HashMap<String, String> fourthRowMath = new HashMap<>();
        fourthRowMath.put("Math", "12");

        HashMap<String, String> fourthRowPhysics = new HashMap<>();
        fourthRowPhysics.put("Physics", "9");

        HashMap<String, String> fourthRowGeometry = new HashMap<>();
        fourthRowGeometry.put("Geometry", "11");

        progressTable.add(new Row(fourthRowName, fourthRowMath, fourthRowPhysics, fourthRowGeometry));

        //create and filling fifth table row
        HashMap<String, String> fifthRowName = new HashMap<>();
        fifthRowName.put("Name", "Kolya");

        HashMap<String, String> fifthRowMath = new HashMap<>();
        fifthRowMath.put("Math", "9");

        HashMap<String, String> fifthRowPhysics = new HashMap<>();
        fifthRowPhysics.put("Physics", "11");

        HashMap<String, String> fifthRowGeometry = new HashMap<>();
        fifthRowGeometry.put("Geometry", "9");

        progressTable.add(new Row(fifthRowName, fifthRowMath, fifthRowPhysics, fifthRowGeometry));

        //create and filling sixth table row
        HashMap<String, String> sixthRowName = new HashMap<>();
        sixthRowName.put("Name", "Danya");

        HashMap<String, String> sixthRowMath = new HashMap<>();
        sixthRowMath.put("Math", "10");

        HashMap<String, String> sixthRowPhysics = new HashMap<>();
        sixthRowPhysics.put("Physics", "8");

        HashMap<String, String> SixthRowGeometry = new HashMap<>();
        SixthRowGeometry.put("Geometry", "12");

        progressTable.add(new Row(sixthRowName, sixthRowMath, sixthRowPhysics, SixthRowGeometry));

        return progressTable;
    }
}
