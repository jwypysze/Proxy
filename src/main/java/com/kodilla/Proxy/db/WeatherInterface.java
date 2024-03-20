package com.kodilla.Proxy.db;

public interface WeatherInterface {

    String getWeather() throws InterruptedException;
    String refreshData() throws InterruptedException;

}
