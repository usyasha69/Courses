package com.company.collections.TasksSeven.number_lists;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberListWorker {

    /**
     * This method start the program.
     *
     * @param args - arguments of command line
     */
    public static void main(String[] args) {
        ArrayList<String> numberList = NumberListCreator.createNumberList(10);
        findMatch(numberList);
    }

    /**
     * This method find amounting and different discharges between elements in list.
     *
     * @param numberList - list with numbers
     */
    private static void findMatch(ArrayList<String> numberList) {
        //list with amounting
        ArrayList<Integer> amountingDischargesList = new ArrayList<>();
        ArrayList<Integer> differentDischargesList = new ArrayList<>();

        //find matches
        for (int i = 0; i < numberList.size(); i++) {
            String firstElement = numberList.get(i);
            char[] firstElementToCharArray = firstElement.toCharArray();

            for (int j = i; j < numberList.size(); j++) {

                if (i != j) {
                    String secondElement = numberList.get(j);
                    char[] secondElementToCharArray = secondElement.toCharArray();

                    //discharges counts
                    int amountingDischargesCount = 0;
                    int differentDischargesCount = 0;

                    //list with forbidden symbols
                    ArrayList<Character> forbiddenSymbols = new ArrayList<>();

                    //find count of equal number in amount discharges
                    for (int k = 0; k < firstElementToCharArray.length; k++) {
                        if (firstElementToCharArray[k] == secondElementToCharArray[k]) {
                            amountingDischargesCount++;
                            forbiddenSymbols.add(firstElementToCharArray[k]);
                        }
                    }

                    amountingDischargesList.add(amountingDischargesCount);

                    //find count of equal number in different discharges
                    for (int k = 0; k < firstElementToCharArray.length; k++) {
                        for (int l = k; l < secondElementToCharArray.length; l++) {
                            if (firstElementToCharArray[k] == secondElementToCharArray[l]
                                    && findForbiddenSymbols(firstElementToCharArray[k], forbiddenSymbols)) {
                                differentDischargesCount++;
                                break;
                            }
                        }
                    }

                    differentDischargesList.add(differentDischargesCount);
                }
            }
        }

        printMatches(numberList, amountingDischargesList, differentDischargesList);
    }

    /**
     * This method compare checked symbols with list with forbidden symbols.
     *
     * @param checkedSymbol    - checked symbols
     * @param forbiddenSymbols - list with forbidden symbols
     * @return - does it checked symbol is forbidden
     */
    private static boolean findForbiddenSymbols(char checkedSymbol, ArrayList<Character> forbiddenSymbols) {
        boolean result = true;

        for (Character forbiddenSymbol : forbiddenSymbols) {
            if (forbiddenSymbol == checkedSymbol) {
                result = false;
            }
        }

        return result;
    }

    /**
     * This method print numbers and discharges between elements in list.
     *
     * @param numberList              - list with numbers
     * @param amountingDischargesList - list with amounting discharges
     * @param differentDischargesList - list with different discharges
     */
    private static void printMatches(ArrayList<String> numberList
            , ArrayList<Integer> amountingDischargesList
            , ArrayList<Integer> differentDischargesList) {

        Iterator<Integer> adlIterator = amountingDischargesList.iterator();
        Iterator<Integer> ddlIterator = differentDischargesList.iterator();

        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i; j < numberList.size(); j++) {
                if (adlIterator.hasNext() && ddlIterator.hasNext() && i != j)
                    System.out.println("First number = '" + numberList.get(i) + "' , second number = '"
                            + numberList.get(j) + "' ; amounting discharges: " + adlIterator.next()
                            + " , different discharges: " + ddlIterator.next());
            }
        }
    }
}
