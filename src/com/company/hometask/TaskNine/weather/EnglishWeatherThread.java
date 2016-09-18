package com.company.hometask.TaskNine.weather;

public class EnglishWeatherThread extends Thread {

    private Weather weather;

    public EnglishWeatherThread(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        super.run();

        System.out.println("English weather thread: \n"
                + WeatherVocabulary.translateWeather(weather, "English").toString());
    }
}
