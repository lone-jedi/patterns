package com.yarkin.observer.weatherapp.views;

import com.yarkin.observer.weatherapp.DisplayElement;
import com.yarkin.observer.weatherapp.Observer;
import com.yarkin.observer.weatherapp.models.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private double maxTemperature;
    private double minTemperature;
    private double avgTemperature;
    private int numberOfUpdates;
    private int lastSumOfElements;

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Statistic - max:%f, min:%f, avg:%f\n",
                maxTemperature, minTemperature, avgTemperature);
    }

    @Override
    public void update() {
        double temperature = weatherData.getTemperature();

        if(maxTemperature < temperature) {
            maxTemperature = temperature;
        }

        if(minTemperature > temperature) {
            minTemperature = temperature;
        }

        lastSumOfElements += temperature;
        numberOfUpdates++;
        avgTemperature = lastSumOfElements / numberOfUpdates;

        display();
    }
}
