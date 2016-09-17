package com.company.hometask.TaskEight.cafe;

import java.util.HashMap;

public class MenuCreator {

    public static HashMap<Course, Double> createDrinks() {
        //create and filling map with drinks
        HashMap<Course, Double> drinks = new HashMap<>();

        drinks.put(new Course("Coffee"), 10.6);
        drinks.put(new Course("Tea"), 8.4);
        drinks.put(new Course("Latte"), 16.4);
        drinks.put(new Course("Ice tea"), 10.3);
        drinks.put(new Course("Cappuccino"), 16.8);

        return drinks;
    }

    public static HashMap<Course, Double> createFirstCourses() {
        //create and filling map with first courses
        HashMap<Course, Double> firstCourses = new HashMap<>();

        firstCourses.put(new Course("Borscht"), 22.6);
        firstCourses.put(new Course("Okroshka"), 18.3);
        firstCourses.put(new Course("Soup"), 13.8);

        return firstCourses;
    }

    public static HashMap<Course, Double> createSecondCourses() {
        //create and filling map with second courses
        HashMap<Course, Double> secondCourses = new HashMap<>();

        secondCourses.put(new Course("Grilled meat"), 34.6);
        secondCourses.put(new Course("Grilled potatoes"), 18.5);
        secondCourses.put(new Course("Pizza"), 30.0);
        secondCourses.put(new Course("Shawarma"), 25.9);

        return secondCourses;
    }

    public static HashMap<Course, Double> createDesserts() {
        //create and filling map with desserts
        HashMap<Course, Double> desserts = new HashMap<>();

        desserts.put(new Course("Apple cake"), 12.4);
        desserts.put(new Course("Orange strudel"), 16.4);
        desserts.put(new Course("Raspberry tartlet"), 10.0);

        return desserts;
    }
}
