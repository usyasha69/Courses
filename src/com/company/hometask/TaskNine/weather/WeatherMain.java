package com.company.hometask.TaskNine.weather;

public class WeatherMain {

    public static Weather weather;

    public static void main(String[] args) {
        final int NUMBER_UPDATES = 14;

        new WeatherThread("English").start();
        new WeatherThread("Russian").start();
        new WeatherThread("Germany").start();

        for (int i = 0; i < NUMBER_UPDATES; i++) {
            weather = WeatherGenerator.generateWeather();

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
