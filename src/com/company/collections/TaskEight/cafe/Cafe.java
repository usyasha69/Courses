package com.company.collections.TaskEight.cafe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;

public class Cafe {

    /**
     * This method start the program.
     *
     * @param args - command line arguments
     */
    public static void main(String[] args) {
        HashMap<Course, Double> drinks = MenuCreator.createDrinks();
        HashMap<Course, Double> firstCourses = MenuCreator.createFirstCourses();
        HashMap<Course, Double> secondCourses = MenuCreator.createSecondCourses();
        HashMap<Course, Double> desserts = MenuCreator.createDesserts();

        Menu menu = new Menu(drinks, firstCourses, secondCourses, desserts);

        makeAnOrder(menu);
    }

    private static void makeAnOrder(Menu menu) {
        String foodNumber;

        //result map with order
        ArrayList<HashMap<Course, Double>> order = new ArrayList<>();

        //filling result map
        for (; ; ) {
            System.out.println("Hello dear costumer, please choose the food number: "
                    + "\n1. Drinks" + "\n2. First courses" + "\n3. Second courses"
                    + "\n4. Desserts" + "\nOr empty line, if you ending");

            foodNumber = getFoodNumber();

            if (foodNumber.isEmpty()) {
                break;
            }

            //add food to final order
            switch (foodNumber) {
                case "1":
                    order.add(selectFood(menu, foodNumber));
                    break;
                case "2":
                    order.add(selectFood(menu, foodNumber));
                    break;
                case "3":
                    order.add(selectFood(menu, foodNumber));
                    break;
                case "4":
                    order.add(selectFood(menu, foodNumber));
                    break;
                default:
                    System.out.println("Incorrect food number!");
            }
        }

        //print fool order
        System.out.println("\nYour final order: ");
        for (HashMap<Course, Double> courseDoubleHashMap : order) {
            for (Map.Entry<Course, Double> entry : courseDoubleHashMap.entrySet()) {
                System.out.println("Course: " + entry.getKey().getName() +
                        "; number: " + entry.getKey().getNumber() + "; cost: "
                        + new DecimalFormat("#0.00").format(entry.getValue() * entry.getKey().getNumber()) + "$");
            }
        }

        //get final cost
        double finalOrder = getFinalCost(order);
        System.out.println("\nFinal order: " + finalOrder + "$");
    }

    /**
     * This method getting the food number (1-4).
     *
     * @return - the food number
     */
    private static String getFoodNumber() {
        String result = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            for (; ; ) {
                result = reader.readLine();
                if (result.isEmpty()
                        || Integer.parseInt(result) > 0 && Integer.parseInt(result) < 5) {
                    break;
                } else {
                    System.out.println("Please put the correct food number!");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Incorrect number of food!");
        }

        return result;
    }

    /**
     * This method print all food and return map with selected food
     *
     * @param menu - menu
     * @return - map with food
     */
    private static HashMap<Course, Double> selectFood(Menu menu, String foodNumber) {
        //result map
        HashMap<Course, Double> result = new HashMap<>();

        //map with select food
        HashMap<Course, Double> food = new HashMap<>();

        //filling map with select food
        switch (foodNumber) {
            case "1":
                food = menu.getDrinks();
                break;
            case "2":
                food = menu.getFirstCourses();
                break;
            case "3":
                food = menu.getSecondCoarser();
                break;
            case "4":
                food = menu.getDesserts();
                break;
            default:
                System.out.println("Incorrect food number!");
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String foodName = "";
        int foodCount = 0;

        for (; ; ) {
            System.out.println("Please enter the food name(enter empty line if you ending): ");

            //print all selected food
            for (Map.Entry<Course, Double> entry : food.entrySet()) {
                System.out.println("Course: " + entry.getKey().getName() + " - " + entry.getValue() + "$");
            }

            try {
                foodName = reader.readLine();

                if (foodName.isEmpty()) {
                    break;
                } else {
                    System.out.println("Please, enter number of " + foodName + ":");
                }

                //checked right number of course
                for (; ; ) {
                    foodCount = Integer.parseInt(reader.readLine());
                    if (foodCount >= 0) {
                        break;
                    } else {
                        System.out.println("Please, enter the correct number of food!   ");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Incorrect number of food!");
            }

            Set<Course> set = food.keySet();

            //set number of courses and filling result map
            for (Course course : set) {
                double cost = food.get(course);
                if (course.getName().equals(foodName)) {
                    course.setNumber(foodCount);
                    result.put(course, cost);
                }
            }
        }

        return result;
    }

    /**
     * This method calculate total cost of order.
     *
     * @param order - list with food
     * @return - total cost
     */
    private static double getFinalCost(ArrayList<HashMap<Course, Double>> order) {
        double result = 0.0;

        for (HashMap<Course, Double> courseDoubleHashMap : order) {
            for (Map.Entry<Course, Double> entry : courseDoubleHashMap.entrySet()) {
                result += entry.getValue() * entry.getKey().getNumber();
            }
        }

        return result;
    }
}
