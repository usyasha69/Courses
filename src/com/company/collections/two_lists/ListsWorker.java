package com.company.collections.two_lists;

import java.util.LinkedList;

public class ListsWorker {

    /**
     * This method create two lists and found one different element in
     * first list
     *
     * @param firstListSize  - size of first list
     * @param secondListSize - size of second list
     */
    public void foundDifferentElement(int firstListSize, int secondListSize) {
        //create lists
        LinkedList<Integer> firstList = new LinkedList<>();
        LinkedList<Integer> secondList = new LinkedList<>();

        //filling first list
        for (int i = 0; i < firstListSize; i++) {
            firstList.add(i);
        }

        //filling second list
        for (int i = 0; i < secondListSize; i++) {
            secondList.add(i);
        }

        //sums of lists
        int sumOfFirstList = 0;
        int sumOfSecondList = 0;

        //get first list sum
        for (Integer i : firstList) {
            sumOfFirstList += i;
        }

        //get second list sum
        for (Integer i : secondList) {
            sumOfSecondList += i;
        }

        //print result
        System.out.println("Different element in first list = " + (sumOfFirstList - sumOfSecondList));
    }
}
