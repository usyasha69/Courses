package com.company.hometask.TasksSix.cars;

import java.util.ArrayList;
import java.util.Iterator;

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

        Iterator<Car> iterator = cars.iterator();

        //if begin position of car less road length, delete this car
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getStartingPosition() > roadLength || car.getStartingPosition() < 0) {
                iterator.remove();
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
