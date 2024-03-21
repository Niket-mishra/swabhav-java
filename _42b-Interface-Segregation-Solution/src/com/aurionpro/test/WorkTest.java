package com.aurionpro.test;

import com.aurionpro.model.Labour;
import com.aurionpro.model.Robot;

public class WorkTest {  public static void main(String[] args) {
    Labour labour = new Labour();
    labour.startWork();
    labour.stopWork();
    labour.eat();
    labour.drink();
    System.out.println();

    Robot robot = new Robot();
    robot.startWork();
    robot.stopWork();

}}
