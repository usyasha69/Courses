package com.company.hometask.TaskNine.weather;

public class WeatherMain {

    public static void main(String[] args) {
        final int WEATHER_NUMBER = 5;

        for (int i = 0; i < WEATHER_NUMBER; i++) {
            Weather weather = WeatherGenerator.generateWeather();

            new WeatherThread(WeatherVocabulary.translateWeather(weather, "English"), "English").start();

            new WeatherThread(WeatherVocabulary.translateWeather(weather, "Russian"), "Russian").start();

            new WeatherThread(WeatherVocabulary.translateWeather(weather, "Germany"), "Germany").start();

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();
        }

    }
}
