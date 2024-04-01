package com.aurionpro.test;

import com.aurionpro.model.Bus;
import com.aurionpro.model.Car;
import com.aurionpro.model.IMovable;
import com.aurionpro.model.Vehicle;


import java.time.LocalDate;

public class MovableTest {
    public static void main(String[] args) {
        IMovable[] movables = {
                new Car("Toyota", LocalDate.of(2010,10,15)),
                new Bus("Mahindra", LocalDate.of(2019,1,5)),


        };
        for (IMovable movable : movables) {
            startMoving(movable);
        }
    }

    private static void startMoving(IMovable obj) {
        obj.move();
        if(obj instanceof Vehicle){
            Vehicle obj1 = (Vehicle) obj;
            obj1.showTopSpeed();
            obj1.getBrand();
        }





    }
}
