package com.yarkin.observer.weatherapp.views;

import com.yarkin.observer.weatherapp.DisplayElement;
import com.yarkin.observer.weatherapp.Observer;
import com.yarkin.observer.weatherapp.models.WeatherData;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private double heatIndex;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Head index:%f", heatIndex);
    }

    @Override
    public void update() {
        heatIndex = weatherData.computeHeatIndex();
        display();
    }
}
