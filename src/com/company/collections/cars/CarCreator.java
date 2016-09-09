package com.company.collections.cars;

import java.util.ArrayList;

public class CarCreator {

    public static ArrayList<Car> createCars(double roadLength) {
        //result
        ArrayList<Car> cars = new ArrayList<>();

        //create cars
        cars.add(new Car("Tayota", 67.4, 0.4));
        cars.add(new Car("Bmw", 78.3, 1.0));
        cars.add(new Car("Fiat", 76.5, 0.3));
        cars.add(new Car("Chevrolet", 68.3, 1.4));
        cars.add(new Car("Mazda", 86.4, 1.3));
        cars.add(new Car("Honda", 69.3, 1.6));
        cars.add(new Car("Lada", 122.8, 21.4));
        cars.add(new Car("Lexus", 136.4, -32.2));

        //if begin position of car less road length, delete this car
        for (int i  = 0; i < cars.size(); i++) {
            if (cars.get(i).getStartingPosition() > roadLength || cars.get(i).getStartingPosition() < 0) {
                cars.remove(cars.get(i));
                i--;
            }
        }

        //drive time of cars
        double driveTime;

        //set drive time of cars
        for (Car c : cars) {
            driveTime = (roadLength / c.getSpeed());
            c.setDriveTime(driveTime);
        }

        return cars;
    }
}
