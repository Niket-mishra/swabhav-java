package com.aurionpro.test;

import com.aurionpro.model.IObserver;
import com.aurionpro.model.PhoneDisplay;
import com.aurionpro.model.TVDisplay;
import com.aurionpro.model.WeatherStation;

public class ObserverPatternTest {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        IObserver phoneDisplay = new PhoneDisplay();
        IObserver tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        weatherStation.setWeather("Sunny");
    }
}


