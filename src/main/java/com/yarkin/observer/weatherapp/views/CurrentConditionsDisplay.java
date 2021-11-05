package com.yarkin.observer.weatherapp.views;

import com.yarkin.observer.weatherapp.DisplayElement;
import com.yarkin.observer.weatherapp.Observer;
import com.yarkin.observer.weatherapp.models.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current condition - temperature:%f, pressure:%f, humidity:%f\n",
                weatherData.getTemperature(), weatherData.getPressure(), weatherData.getHumidity());
    }

    @Override
    public void update() {
        display();
    }
}
