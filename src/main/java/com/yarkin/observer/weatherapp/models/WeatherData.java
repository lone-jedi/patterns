package com.yarkin.observer.weatherapp.models;

import com.yarkin.observer.weatherapp.Observer;
import com.yarkin.observer.weatherapp.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private final ArrayList<Observer> observers = new ArrayList<>();
    private double temperature;
    private double pressure;
    private double humidity;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int observerIndex = observers.indexOf(observer);

        if(observerIndex < 0) {
            throw new IllegalStateException("Observer not registered");
        }

        observers.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public double computeHeatIndex() {
        double rh = humidity;
        double t = temperature;
        double index = (double)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

    public void setMeasurements(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }
    public void measurementsChanged() {
        notifyObservers();
    }
}
