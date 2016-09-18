package com.company.hometask.TaskNine.weather;

public class RussianWeatherThread extends Thread {

    private Weather weather;

    public RussianWeatherThread(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        super.run();

        System.out.println("Russian weather thread: \n"
                + WeatherVocabulary.translateWeather(weather, "Russian").toString());
    }
}
