package com.kodilla.Proxy.db;

public class Weather implements WeatherInterface{


    public Weather() throws InterruptedException {
        refreshData();
    }

    @Override
    public String refreshData() throws InterruptedException {
        Thread.sleep(5000);
        return "Actualization";
    }

    @Override
    public String getWeather() {
        return "It is sunny";
    }
}
