package com.company.hometask.TasksSeven.number_lists;

import java.util.ArrayList;

public class NumberListCreator {

    /**
     * This method create list with five-digit numbers.
     *
     * @param listLength - length of result list
     * @return - list with numbers
     */
    public static ArrayList<String> createNumberList(int listLength) {
        //result
        ArrayList<String> result = new ArrayList<>();

        //length of element in list
        final int NUMBER_LENGTH = 5;

        //filling list
        for (int i = 0; i < listLength; i++) {
            //value of element
            String element = "";

            for (int j = 0; j < NUMBER_LENGTH; j++) {
                element += (int) (Math.random() * 10);
            }

            result.add(element);
        }

        return result;
    }

}
