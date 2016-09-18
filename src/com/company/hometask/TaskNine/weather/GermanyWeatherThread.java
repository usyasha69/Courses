package com.company.hometask.TaskNine.weather;

public class GermanyWeatherThread extends Thread {

    private Weather weather;

    public GermanyWeatherThread(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        super.run();

        System.out.println("Germany weather thread: \n"
                + WeatherVocabulary.translateWeather(weather, "Germany").toString());
    }
}
