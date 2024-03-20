package com.kodilla.Proxy;

import com.kodilla.Proxy.db.LazyWeather;
import com.kodilla.Proxy.db.WeatherInterface;

import java.util.Random;

public class ProxyApp {

    public static void main(String[] args) throws InterruptedException {

        long begin = System.currentTimeMillis();
        for (int i = 0; i < 3; i++) {
            WeatherInterface weatherInterface = new LazyWeather();
            System.out.println(weatherInterface.getWeather());

            int number = new Random().nextInt(100);
            if (number < 20) {
                System.out.println(weatherInterface.refreshData());
            }

            System.out.println("Execution #" + i + " just finished");
        }
        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");

    }

}
