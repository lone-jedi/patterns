package com.yarkin.observer.weatherapp;

import com.yarkin.observer.weatherapp.models.WeatherData;
import com.yarkin.observer.weatherapp.views.CurrentConditionsDisplay;
import com.yarkin.observer.weatherapp.views.ForecastDisplay;
import com.yarkin.observer.weatherapp.views.HeatIndexDisplay;
import com.yarkin.observer.weatherapp.views.StatisticsDisplay;

import java.util.Random;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program started...");

        WeatherData weatherData = new WeatherData();
        var currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        var forecastDisplay = new ForecastDisplay(weatherData);
        var statisticsDisplay = new StatisticsDisplay(weatherData);
        var heatIndexDisplay = new HeatIndexDisplay(weatherData);

//        weatherData.registerObserver(currentConditionsDisplay);
//        weatherData.registerObserver(forecastDisplay);
//        weatherData.registerObserver(statisticsDisplay);

        while(true) {
            Random random = new Random();
            weatherData.setMeasurements(random.nextInt(100) - 50,
                    random.nextInt(20) + 750,
                    random.nextInt(100));
            System.out.println();
            Thread.sleep(20);
        }

    }
}
