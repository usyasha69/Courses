package com.company.hometask.TaskNine.weather;

import java.util.HashMap;

public class WeatherVocabulary {

    public static Weather translateWeather(Weather weather, String language) {
        //result
        Weather resultWeather = new Weather(weather);

        //map with translate city name to russian
        HashMap<String, String> cityNameRussian = new HashMap<>();
        cityNameRussian.put("Kharkov", "Харьков");
        cityNameRussian.put("London", "Лондон");
        cityNameRussian.put("Paris", "Париж");
        cityNameRussian.put("Berlin", "Берлин");
        cityNameRussian.put("Vein", "Вена");
        cityNameRussian.put("Amsterdam", "Амстердам");

        //map with translate city name to germany
        HashMap<String, String> cityNameGermany = new HashMap<>();
        cityNameGermany.put("Kharkov", "Charkow");
        cityNameGermany.put("London", "London");
        cityNameGermany.put("Paris", "Paris");
        cityNameGermany.put("Berlin", "Berlin");
        cityNameGermany.put("Vein", "Wien");
        cityNameGermany.put("Amsterdam", "Amsterdam");

        //map with translate main weather to russian
        HashMap<String, String> mainWeatherRussian = new HashMap<>();
        mainWeatherRussian.put("Clear sky", "Чистое небо");
        mainWeatherRussian.put("Overcast clouds", "Переменчивая облачность");
        mainWeatherRussian.put("Snow", "Снег");
        mainWeatherRussian.put("Light rain", "Легкий дождь");
        mainWeatherRussian.put("Moderate rain", "Средний дождь");
        mainWeatherRussian.put("Light snow", "Легкий снег");

        //map with translate main weather to russian
        HashMap<String, String> mainWeatherGermany = new HashMap<>();
        mainWeatherGermany.put("Clear sky", "Klarem himmel");
        mainWeatherGermany.put("Overcast clouds", "Veränderbar bewölkt");
        mainWeatherGermany.put("Snow", "Schnee");
        mainWeatherGermany.put("Light rain", "Light regen");
        mainWeatherGermany.put("Moderate rain", "Durchschnittliche regen");
        mainWeatherGermany.put("Light snow", "Durchschnittliche schnee");

        //translate
        switch (language) {
            case "English":
                resultWeather = new Weather(weather.getCityName(), weather.getTemperature()
                        , weather.getMainWeather(), weather.getPressure(), weather.getWindSpeed());
                break;
            case "Russian":
                resultWeather = new Weather(cityNameRussian.get(weather.getCityName())
                        , weather.getTemperature(), mainWeatherRussian.get(weather.getMainWeather())
                        , weather.getPressure(), weather.getWindSpeed());
                break;
            case "Germany":
                resultWeather = new Weather(cityNameGermany.get(weather.getCityName())
                        , weather.getTemperature(), mainWeatherGermany.get(weather.getMainWeather())
                        , weather.getPressure(), weather.getWindSpeed());
                break;
        }

        return resultWeather;
    }
}
