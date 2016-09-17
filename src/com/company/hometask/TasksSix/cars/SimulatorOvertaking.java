package com.company.hometask.TasksSix.cars;

import java.util.ArrayList;
import java.util.Collections;

public class SimulatorOvertaking {
    /**
     * List with number of overtaking.
     */
    private ArrayList<Integer> numbersOfOvertaking;

    /**
     * List with overtaking cars.
     */
    private ArrayList<Car> overtakingCars;

    /**
     * List with car who defeated overtaking cars.
     */
    private ArrayList<Car> whoWasDefeatedCarList;

    /**
     * This method start the program.
     *
     * @param args - argument of command line
     */
    public static void main(String[] args) {
        final double ROAD_LENGTH = 20;
        final int FIRST_K_OVERTAKING = 4;

        SimulatorOvertaking simulatorOvertaking = new SimulatorOvertaking();
        ArrayList<Car> cars = CarCreator.createCars(ROAD_LENGTH);

        System.out.println("*************************PRINT ALL OVERTAKING*************************\n");
        simulatorOvertaking.printCarsAndOvertaking(cars);

        System.out.println("\n*************************PRINT FIRST " + FIRST_K_OVERTAKING
                + " OVERTAKING*************************\n");
        simulatorOvertaking.printCarsAndFirstNumberOvertaking(FIRST_K_OVERTAKING);
    }

    /**
     * This method print all overtaking.
     */
    private void printCarsAndOvertaking(ArrayList<Car> cars) {
        //sorted cars by drive time
        Collections.sort(cars, new DriveTimeSorter());
        fillingOvertakingList(cars);

        //values for cycle
        int jStart = 0;
        int jEnd = 0;

        //print cars, overtaking cars and number of overtaking
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString().toUpperCase()
                    + " OVERTAKING: \n");

            jEnd += numbersOfOvertaking.get(i);

            for (int j = jStart; j < jEnd; j++) {
                System.out.println(overtakingCars.get(j).toString());
            }

            jStart += numbersOfOvertaking.get(i);

            System.out.println("\nNumber of overtaking: " + numbersOfOvertaking.get(i) + "\n");
        }

        int totalNumberOvertaking = 0;
        for (Integer i : numbersOfOvertaking) {
            totalNumberOvertaking += i;
        }

        System.out.println("TOTAL NUMBER OF OVERTAKING: " + totalNumberOvertaking);
    }

    /**
     * This method filling list with overtaking.
     */
    private void fillingOvertakingList(ArrayList<Car> cars) {
        numbersOfOvertaking = new ArrayList<>();
        overtakingCars = new ArrayList<>();
        whoWasDefeatedCarList = new ArrayList<>();

        //filling list with numbersOfOvertaking
        int overtakingCount = 0;
        for (int i = 0; i < cars.size(); i++) {
            for (int j = i + 1; j < cars.size(); j++) {
                if (cars.get(i).getStartingPosition() < cars.get(j).getStartingPosition()) {
                    overtakingCount++;
                    overtakingCars.add(cars.get(j));
                    whoWasDefeatedCarList.add(cars.get(i));
                }
            }

            numbersOfOvertaking.add(overtakingCount);
            overtakingCount = 0;
        }
    }

    /**
     * This method print first K overtaking.
     */
    private void printCarsAndFirstNumberOvertaking(int firstKOvertaking) {
        orderByDriveTimeToOvertaking();

        //print first K overtaking
        for (int i = 0; i < firstKOvertaking; i++) {
            System.out.println((i + 1) + " OVERTAKING: " + overtakingCars.get(i).toString() + " \novertaking by: "
                    + whoWasDefeatedCarList.get(i).toString().toUpperCase());
        }
    }

    /**
     * This method order lists with cars by drive time to overtaking
     */
    private void orderByDriveTimeToOvertaking() {
        //list with drive time to overtaking
        ArrayList<Double> driveTimeToOvertakingList = new ArrayList<>();

        //filling list with drive time to overtaking
        for (int i = 0; i < overtakingCars.size(); i++) {
            double differenceSpeed = (whoWasDefeatedCarList.get(i).getSpeed() - overtakingCars.get(i).getSpeed());
            double differenceDistance = (overtakingCars.get(i).getStartingPosition()
                    - whoWasDefeatedCarList.get(i).getStartingPosition());

            driveTimeToOvertakingList.add(differenceDistance / differenceSpeed);
        }

        //sorted list with numbers of overtaking and list of overtaking cars
        for (int i = 0; i < overtakingCars.size(); i++) {
            for (int j = 0; j < overtakingCars.size() - 1; j++) {
                if (driveTimeToOvertakingList.get(j) > driveTimeToOvertakingList.get(j + 1)) {

                    //bubble sort
                    Car temp = overtakingCars.get(j);
                    overtakingCars.set(j, overtakingCars.get(j + 1));
                    overtakingCars.set(j + 1, temp);

                    //bubble sort
                    temp = whoWasDefeatedCarList.get(j);
                    whoWasDefeatedCarList.set(j, whoWasDefeatedCarList.get(j + 1));
                    whoWasDefeatedCarList.set(j + 1, temp);
                }
            }
        }
    }
}
