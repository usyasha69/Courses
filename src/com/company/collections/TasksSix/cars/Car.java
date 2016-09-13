package com.company.collections.TasksSix.cars;

import java.text.DecimalFormat;

public class Car {
    private String carModel;
    private double speed;
    private double startingPosition;
    private double driveTime;

    public Car(String carModel, double speed, double startingPosition) {
        this.carModel = carModel;
        this.speed = speed;
        this.startingPosition = startingPosition;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getStartingPosition() {
        return startingPosition;
    }

    public void setStartingPosition(double startingPosition) {
        this.startingPosition = startingPosition;
    }

    public double getDriveTime() {
        return driveTime;
    }

    public void setDriveTime(double driveTime) {
        this.driveTime = driveTime;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", speed='" + speed +
                " km/h', startingPosition='" + startingPosition +
                " km;, driveTime='" + new DecimalFormat("#0.000").format(driveTime) +
                " km'}";
    }
}
