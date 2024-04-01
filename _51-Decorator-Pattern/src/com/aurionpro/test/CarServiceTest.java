package com.aurionpro.test;

import com.aurionpro.model.CarInspection;
import com.aurionpro.model.ICarServices;
import com.aurionpro.model.OilChange;
import com.aurionpro.model.WheelAlign;

public class CarServiceTest {
    public static void main(String[] args) {
        ICarServices car = new CarInspection();
        OilChange carOil = new OilChange(car);
        WheelAlign carWheel = new WheelAlign(carOil);
        System.out.println(carWheel.getCost());
    }
}
