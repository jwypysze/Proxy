package com.kodilla.Proxy.db;

public class LazyWeather implements WeatherInterface{

    private WeatherInterface weatherInterface;

    @Override
    public String getWeather() {
        return "It is sunny";
    }

    @Override
    public String refreshData() throws InterruptedException {
        if (weatherInterface == null) {
           weatherInterface = new Weather();
        }
        return weatherInterface.refreshData();
    }
}
