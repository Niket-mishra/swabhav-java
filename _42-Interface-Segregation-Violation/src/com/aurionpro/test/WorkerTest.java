package com.aurionpro.test;

import com.aurionpro.model.*;

public class WorkerTest {
    public static void main(String[] args) {
        Labour labour = new Labour();
        labour.startWork();
        labour.stopWork();
        labour.eat();
        labour.drink();
        System.out.println();

        Robot robot = new Robot();
        robot.startWork();
        robot.stopWork();
        robot.eat();
        robot.drink();
    }
}
