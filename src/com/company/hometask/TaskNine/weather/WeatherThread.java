package com.company.hometask.TaskNine.weather;

public class WeatherThread extends Thread {

    private Weather weather;
    private String language;

    public WeatherThread(Weather weather, String language) {
        this.weather = weather;
        this.language = language;
    }

    @Override
    public void run() {
        super.run();

        System.out.println(language + " weather thread: \n" + weather.toString());
    }
}
