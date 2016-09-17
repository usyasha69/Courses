package com.company.hometask.TaskEight.holidays_of_the_year;

import java.util.HashMap;

public class HolidayCreator {

    /**
     * This method create hash map with holidays.
     *
     * @return - hash map with holidays
     */
    public static HashMap<String, Holiday> createHolidays() {
        HashMap<String, Holiday> holidays = new HashMap<>();

        holidays.put("01.01.2016", new Holiday("New year", true));
        holidays.put("07.01.2016", new Holiday("Christmas", true));
        holidays.put("25.01.2016", new Holiday("Day of students", false));
        holidays.put("14.02.2016", new Holiday("Valentin's day", false));
        holidays.put("08.03.2016", new Holiday("Women's day", true));
        holidays.put("01.05.2016", new Holiday("Working holiday", true));
        holidays.put("09.05.2016", new Holiday("Victory day", true));
        holidays.put("21.01.2016", new Holiday("Day of science", false));
        holidays.put("01.07.2016", new Holiday("Day of architecture", true));

        return holidays;
    }
}
