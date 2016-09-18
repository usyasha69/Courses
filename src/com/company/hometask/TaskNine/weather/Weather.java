package com.company.hometask.TaskNine.weather;

public class Weather {

    private String cityName;
    private int temperature;
    private String mainWeather;
    private double pressure;
    private double windSpeed;

    public Weather(String cityName, int temperature, String mainWeather, double pressure, double windSpeed) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.mainWeather = mainWeather;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
    }

    public Weather(Weather weather) {
        this.cityName = weather.getCityName();
        this.temperature = weather.getTemperature();
        this.mainWeather = weather.getMainWeather();
        this.pressure = weather.getPressure();
        this.windSpeed = weather.getWindSpeed();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getMainWeather() {
        return mainWeather;
    }

    public void setMainWeather(String mainWeather) {
        this.mainWeather = mainWeather;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Weather weather = (Weather) o;

        if (temperature != weather.temperature) return false;
        if (Double.compare(weather.pressure, pressure) != 0) return false;
        if (Double.compare(weather.windSpeed, windSpeed) != 0) return false;
        if (!cityName.equals(weather.cityName)) return false;
        return mainWeather.equals(weather.mainWeather);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = cityName.hashCode();
        result = 31 * result + temperature;
        result = 31 * result + mainWeather.hashCode();
        temp = Double.doubleToLongBits(pressure);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(windSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "cityName='" + cityName + '\'' +
                ", temperature=" + temperature +
                " C°, mainWeather='" + mainWeather + '\'' +
                ", pressure=" + pressure +
                " hPa, windSpeed=" + windSpeed +
                " m/s}";
    }
}
