package com.company.hometask.TaskEight.table;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TableWorker {

    /**
     * This method start the program.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> progressTable = TableCreator.createTable();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String actionNumber;

        for (; ; ) {
            System.out.println("Please, enter the number of action(empty line if we ending): "
                    + "\n1 Print start table" + "\n2 Print table sorted by name"
                    + "\n3 Print table sorted by math rating"
                    + "\n4 Print table sorted by physics rating" + "\n5 Print table sorted by geometry rating"
                    + "\n6 Print table sorted by best rating" + "\n7 Separate table");

            try {
                actionNumber = reader.readLine();

                if (actionNumber.isEmpty() ||
                        (Integer.parseInt(actionNumber) > 0 && Integer.parseInt(actionNumber) < 8)) {
                    break;
                } else {
                    System.out.println("Please, enter the correct number of action!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Please, enter the correct number of action!\n");
            }
        }

        switch (actionNumber) {
            case "1":
                System.out.println("START TABLE");
                printProgressTable(progressTable);
                break;
            case "2":
                System.out.println("\nTABLE SORTED BY NAME");
                //sorted and print table by name
                Collections.sort(progressTable, new NameSorter());
                printProgressTable(progressTable);
                break;
            case "3":
                System.out.println("\nTABLE SORTED BY MATH RATING");
                //sorted and print table by math rating
                Collections.sort(progressTable, new MathSorter());
                printProgressTable(progressTable);
                break;
            case "4":
                System.out.println("\nTABLE SORTED BY PHYSICS RATING");
                //sorted and print table by physics rating
                Collections.sort(progressTable, new PhysicsSorter());
                printProgressTable(progressTable);
                break;
            case "5":
                System.out.println("\nTABLE SORTED BY GEOMETRY RATING");
                //sorted and print table by geometry rating
                Collections.sort(progressTable, new GeometrySorter());
                printProgressTable(progressTable);
                break;
            case "6":
                System.out.println("\nTABLE SORTED BY BEST RATING");
                //sorted and print table by best rating
                Collections.sort(progressTable, new BestRatingSorter());
                printProgressTable(progressTable);
                break;
            case "7":
                System.out.println("\nSEPARATE TABLE");

                int tablesNumber;

                for (; ; ) {
                    System.out.println("Progress table length: " + progressTable.size()
                            + "\nPlease, enter the number of tables:");

                    try {
                        tablesNumber = Integer.parseInt(reader.readLine());

                        if (tablesNumber != 0 && (progressTable.size() % tablesNumber == 0)) {
                            break;
                        } else {
                            System.out.println("Please, enter the correct number of tables!");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (NumberFormatException e) {
                        System.out.println("Please, enter the correct number of tables!\n");
                    }
                }
                //separate table and print
                printSeparateProgressTable(separationTable(progressTable, tablesNumber));
                break;
        }
    }

    /**
     * @param progressTable - list with table
     */
    private static void printProgressTable(ArrayList<HashMap<String, String>> progressTable) {

        for (HashMap<String, String> hashMap : progressTable) {
            System.out.println(rowToString(hashMap));
        }
    }

    /**
     * This method separate progress table to pages.
     *
     * @param progressTable  - progress table
     * @param numberOfTables - number of pages
     */
    private static ArrayList<ArrayList<HashMap<String, String>>> separationTable(
            ArrayList<HashMap<String, String>> progressTable, int numberOfTables) {
        //result
        ArrayList<ArrayList<HashMap<String, String>>> pages = new ArrayList<>();

        int pagesNumber = progressTable.size() / numberOfTables;
        System.out.println(pagesNumber);

        for (int i = 0; i < numberOfTables; i++) {
            ArrayList<HashMap<String, String>> page = new ArrayList<>();
            //filling page
            for (int j = 0; j < pagesNumber; j++) {
                page.add(progressTable.get(j));
            }
            pages.add(page);
            //delete added page
            for (int j = 0; j < pagesNumber; j++) {
                if (!progressTable.isEmpty()) {
                    progressTable.remove(0);
                }
            }
        }

        return pages;
    }

    /**
     * This method print separate table.
     *
     * @param separateTable - separate progress table
     */
    private static void printSeparateProgressTable(ArrayList<ArrayList<HashMap<String, String>>> separateTable) {
        for (int i = 0; i < separateTable.size(); i++) {
            System.out.println((i + 1) + " page: ");

            Iterator<HashMap<String, String>> iterator = separateTable.get(i).iterator();

            while (iterator.hasNext()) {
                HashMap<String, String> row = iterator.next();
                System.out.println(rowToString(row));
            }
        }
    }

    /**
     * This method convert map with row to String format.
     *
     * @param row - map with row
     * @return - row to String
     */
    private static String rowToString(HashMap<String, String> row) {

        return "Name: " + row.get("Name") + "; Math: " + row.get("Math")
                + "; Physics: " + row.get("Physics") + "; Geometry: "
                + row.get("Geometry");
    }
}
