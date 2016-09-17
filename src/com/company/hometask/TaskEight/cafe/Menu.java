package com.company.hometask.TaskEight.cafe;

import java.util.HashMap;

public class Menu {
    private HashMap<Course, Double> drinks;
    private HashMap<Course, Double> firstCourses;
    private HashMap<Course, Double> secondCoarser;
    private HashMap<Course, Double> desserts;

    public Menu(HashMap<Course, Double> drinks, HashMap<Course
            , Double> firstCourses, HashMap<Course
            , Double> secondCoarser, HashMap<Course
            , Double> desserts) {

        this.drinks = drinks;
        this.firstCourses = firstCourses;
        this.secondCoarser = secondCoarser;
        this.desserts = desserts;
    }

    public HashMap<Course, Double> getDrinks() {
        return drinks;
    }

    public void setDrinks(HashMap<Course, Double> drinks) {
        this.drinks = drinks;
    }

    public HashMap<Course, Double> getFirstCourses() {
        return firstCourses;
    }

    public void setFirstCourses(HashMap<Course, Double> firstCourses) {
        this.firstCourses = firstCourses;
    }

    public HashMap<Course, Double> getSecondCoarser() {
        return secondCoarser;
    }

    public void setSecondCoarser(HashMap<Course, Double> secondCoarser) {
        this.secondCoarser = secondCoarser;
    }

    public HashMap<Course, Double> getDesserts() {
        return desserts;
    }

    public void setDesserts(HashMap<Course, Double> desserts) {
        this.desserts = desserts;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "drinks=" + drinks.toString() +
                ", firstCourses=" + firstCourses.toString() +
                ", secondCoarser=" + secondCoarser.toString() +
                ", desserts=" + desserts.toString() +
                '}';
    }
}
