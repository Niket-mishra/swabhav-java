package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class WeatherStation implements ISubject {
    private List<IObserver> observers = new ArrayList<>();
    private String weather;



    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add((IObserver) observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}

