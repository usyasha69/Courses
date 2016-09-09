package com.company.collections.cars;

public class Main {
    public static void main(String[] args) {
        double roadLength = 20;

        //start race
        new SimulatorOvertaking(CarCreator.createCars(roadLength), roadLength, 4).startRace();
    }
}
