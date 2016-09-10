//5* На прямой гоночной трассе длинной L стоит N автомобилей, для каждого из которых известны начальное положение и скорость.
// Определить, сколько произойдет обгонов.
//6* На прямой гоночной трассе длинной L стоит N автомобилей, для каждого из которых известны начальное положение и скорость.
// Вывести первые K обгонов.
package com.company.collections.TasksSix.cars;

public class Main {
    public static void main(String[] args) {
        double roadLength = 20;

        //start race
        new SimulatorOvertaking(CarCreator.createCars(roadLength), roadLength, 4).startRace();
    }
}
