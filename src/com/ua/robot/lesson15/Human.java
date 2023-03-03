package com.ua.robot.lesson15;

public class Human implements DriverAbility, FlyAbility {
    @Override
    public void drive() {
        System.out.println("I can drive");
    }
    @Override
    public void fly () {
        System.out.println( "I can fly");
    }


}

