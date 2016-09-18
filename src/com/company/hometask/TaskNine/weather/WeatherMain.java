package com.company.hometask.TaskNine.weather;

public class WeatherMain {

    public static void main(String[] args) {
        final int WEATHER_NUMBER = 5;

        for (int i = 0; i < WEATHER_NUMBER; i++) {
            Weather weather = WeatherGenerator.generateWeather();

            new EnglishWeatherThread(weather).start();
            new RussianWeatherThread(weather).start();
            new GermanyWeatherThread(weather).start();

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();
        }

    }
}
