package com.company.hometask.TaskNine.weather;

import java.util.ArrayList;

public class WeatherGenerator {

    /**
     * This method create random weather.
     *
     * @return - weather
     */
    public static Weather generateWeather() {
        //list with city names
        ArrayList<String> cityNames = new ArrayList<>();
        cityNames.add("Kharkov");
        cityNames.add("London");
        cityNames.add("Paris");
        cityNames.add("Berlin");
        cityNames.add("Vein");
        cityNames.add("Amsterdam");

        int cityNameIndex = (int) (Math.random() * 6);

        //list with temperature
        ArrayList<Integer> temperature = new ArrayList<>();
        temperature.add(31);
        temperature.add(33);
        temperature.add(15);
        temperature.add(22);
        temperature.add(28);
        temperature.add(35);

        int temperatureIndex = (int) (Math.random() * 6);

        //list with main weather
        ArrayList<String> mainWeather = new ArrayList<>();
        mainWeather.add("Clear sky");
        mainWeather.add("Overcast clouds");
        mainWeather.add("Snow");
        mainWeather.add("Light rain");
        mainWeather.add("Moderate rain");
        mainWeather.add("Light snow");

        int weatherIndex = (int) (Math.random() * 6);

        //list with pressure
        ArrayList<Double> pressure = new ArrayList<>();
        pressure.add(1008.2);
        pressure.add(1005.3);
        pressure.add(1100.3);
        pressure.add(1004.3);
        pressure.add(1003.8);
        pressure.add(1004.9);

        int pressureIndex = (int) (Math.random() * 6);

        //list with wind speed
        ArrayList<Double> windSpeed = new ArrayList<>();
        windSpeed.add(1.21);
        windSpeed.add(1.41);
        windSpeed.add(1.22);
        windSpeed.add(1.33);
        windSpeed.add(1.54);
        windSpeed.add(1.72);

        int windSpeedIndex = (int) (Math.random() * 6);

        return new Weather(cityNames.get(cityNameIndex)
                , temperature.get(temperatureIndex), mainWeather.get(weatherIndex)
                , pressure.get(pressureIndex), windSpeed.get(windSpeedIndex));
    }
}
