package com.company.hometask.TaskEight.holidays_of_the_year;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HolidayWorker {

    /**
     * This method start the program.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Holiday> holidays = HolidayCreator.createHolidays();

        printHolidaysFromDate(holidays);
        printHolidayDays(holidays);
        printDayOffDays(holidays);
    }

    /**
     * This method print all holidays by month of entry user.
     *
     * @param holidays - map with holidays
     */
    private static void printHolidaysFromDate(HashMap<String, Holiday> holidays) {
        int monthNumber = entryMonthNumber();

        String month = getMonth(monthNumber);

        System.out.println("\nHolidays for " + month + ": ");

        for (Map.Entry<String, Holiday> entry : holidays.entrySet()) {
            if (splitDate(entry.getKey()) == monthNumber) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    /**
     * This method return the entry month number of user.
     *
     * @return - number of month
     */
    private static int entryMonthNumber() {
        int result = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            for (; ; ) {
                System.out.println("Please, enter the number of month: ");
                result = Integer.parseInt(reader.readLine());
                if (result > 0 && result < 13) {
                    break;
                } else {
                    System.out.println("Please enter the correct number of month");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    /**
     * This method converts Integer number of month to String name of month.
     *
     * @param numberOfMonth - Integer number of month
     * @return - String name of month
     */
    private static String getMonth(int numberOfMonth) {
        String result;

        switch (numberOfMonth) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "Month doe's not exist";
        }

        return result;
    }

    /**
     * This method split String date and return Integer number of month.
     *
     * @param date - String date
     * @return - Integer number of month
     */
    private static int splitDate(String date) {
        String[] splitArray = date.split("\\.");

        return Integer.parseInt(splitArray[1]);
    }

    /**
     * This method print all holidays.
     *
     * @param holidays - map with holidays
     */
    private static void printHolidayDays(HashMap<String, Holiday> holidays) {
        //print holidays
        System.out.println("\nHolidays: ");
        for (Map.Entry<String, Holiday> entry : holidays.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    /**
     * This method print holidays that are days off.
     *
     * @param holidays - map with holidays
     */
    private static HashMap<String, Holiday> printDayOffDays(HashMap<String, Holiday> holidays) {
        //result map with daysOff
        HashMap<String, Holiday> dayOffMap = new HashMap<>();

        //found daysOff
        for (Map.Entry<String, Holiday> entry : holidays.entrySet()) {
            if (entry.getValue().isDayOff()) {
                dayOffMap.put(entry.getKey(), entry.getValue());
            }
        }

        //print daysOff
        System.out.println("\nDaysOff: ");
        for (Map.Entry<String, Holiday> entry : dayOffMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        return dayOffMap;
    }
}
