package com.yarkin.observer.weatherapp.views;

import com.yarkin.observer.weatherapp.DisplayElement;
import com.yarkin.observer.weatherapp.Observer;
import com.yarkin.observer.weatherapp.models.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        StringBuilder stringBuilder = new StringBuilder("Forecast - ");
        double temperature = weatherData.getTemperature();
        double humidity = weatherData.getHumidity();

        if(temperature < 0) {
            stringBuilder.append("cold, ");
        } else if(temperature >= 0 && temperature < 15) {
            stringBuilder.append("cool, ");
        } else if(temperature >= 15 && temperature < 25) {
            stringBuilder.append("warm, ");
        } else if(temperature >= 25 && temperature < 35) {
            stringBuilder.append("hot, ");
        } else {
            stringBuilder.append("very hot, ");
        }

        if(humidity < 20) {
            stringBuilder.append("dry ");
        } else if(humidity >= 20 && humidity < 40) {
            stringBuilder.append("normal ");
        } else if(humidity >= 40 && humidity < 70) {
            stringBuilder.append("cloudy ");
        } else if(humidity >= 70 && humidity < 90) {
            stringBuilder.append("overcast ");
        } else {
            stringBuilder.append("rainy ");
        }

        stringBuilder.append(" day.");
        System.out.println(stringBuilder);
    }

    @Override
    public void update() {
        display();
    }
}
