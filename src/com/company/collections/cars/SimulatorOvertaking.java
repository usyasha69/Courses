package com.company.collections.cars;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class SimulatorOvertaking {
    /**
     * List with cars.
     */
    private ArrayList<Car> cars;

    /**
     * Length of road.
     */
    private double roadLength;

    /**
     * First K overtaking.
     */
    private int firstOvertaking;

    /**
     * List with sorted cars.
     */
    private ArrayList<Car> sortedCars;

    /**
     * Overtaking list.
     */
    private ArrayList<Integer> overtaking;

    /**
     * Overtaking cars list.
     */
    private ArrayList<Car> overtakingCars;

    public SimulatorOvertaking(ArrayList<Car> cars, double roadLength, int firstOvertaking) {
        this.cars = cars;
        this.roadLength = roadLength;
        this.firstOvertaking = firstOvertaking;
    }

    /**
     * This method starting race.
     */
    public void startRace() {
        System.out.println("*************************PRINT ALL OVERTAKING*************************\n");
        printCarsAndOvertaking();

        System.out.println("\n*************************PRINT FIRST K OVERTAKING*************************\n");
        printCarsAndFirstNumberOvertaking();
    }

    /**
     * This method print all overtaking.
     */
    private void printCarsAndOvertaking() {
        sortedCars = sortedCarsByDriveTime(cars);
        fillingOvertakingList();


        //values for cycle
        int jStart = 0;
        int jEnd = 0;

        //print cars, overtaking cars and overtaking
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("CAR " + cars.get(i).getCarModel() + " , WITH SPEED: " + cars.get(i).getSpeed()
                    + " KM/H ,WITH STARTING POSITION: " + cars.get(i).getStartingPosition()
                    + " KM ,WITH DRIVE TIME: " + new DecimalFormat("#0.000").format(cars.get(i).getDriveTime())
                    + " HOUR OVERTAKING: \n");

            jEnd += overtaking.get(i);

            for (int j = jStart; j < jEnd; j++) {
                System.out.println("Car " + overtakingCars.get(j).getCarModel()
                        + " , with speed: " + overtakingCars.get(j).getSpeed()
                        + " km/h, with starting position: " + overtakingCars.get(j).getStartingPosition()
                        + " km, with drive time: "
                        + new DecimalFormat("#0.000").format(overtakingCars.get(j).getDriveTime()) + " hour");
            }

            jStart += overtaking.get(i);

            System.out.println("\nNumber of overtaking: " + overtaking.get(i) + "\n");
        }

        int totalNumberOvertaking = 0;
        for (Integer i : overtaking) {
            totalNumberOvertaking += i;
        }

        System.out.println("TOTAL NUMBER OF OVERTAKING: " + totalNumberOvertaking);
    }

    /**
     * This method sorted list with cars by drive time of cars.
     *
     * @return - sorted list with cars
     */
    private ArrayList<Car> sortedCarsByDriveTime(ArrayList<Car> cars) {
        //sorted cars by drive time
        for (int i = 0; i < cars.size(); i++) {
            for (int j = 0; j < cars.size() - 1; j++) {
                if (cars.get(j).getDriveTime() > cars.get(j + 1).getDriveTime()) {
                    Car temp = cars.get(j);
                    cars.set(j, cars.get(j + 1));
                    cars.set(j + 1, temp);
                }
            }
        }

        return cars;
    }

    /**
     * This method filling list with overtaking.
     */
    private void fillingOvertakingList() {
        overtaking = new ArrayList<>();
        overtakingCars = new ArrayList<>();

        //filling list with overtaking
        int overtakingCount = 0;
        for (int i = 0; i < sortedCars.size(); i++) {
            for (int j = i; j < sortedCars.size(); j++) {
                if (sortedCars.get(i).getStartingPosition() < sortedCars.get(j).getStartingPosition() && i != j) {
                    overtakingCount++;
                    overtakingCars.add(sortedCars.get(j));
                }
            }

            overtaking.add(overtakingCount);
            overtakingCount = 0;
        }
    }

    /**
     * This method print first K overtaking.
     */
    private void printCarsAndFirstNumberOvertaking() {

    }
}
