package com.yarkin.strategy.example.duck;

import com.yarkin.strategy.example.behaviors.FlyBehavior;
import com.yarkin.strategy.example.behaviors.QuackBehavior;
import com.yarkin.strategy.example.behaviors.SwimBehavior;
import com.yarkin.strategy.example.behaviors.fly.FlyOnAirplane;
import com.yarkin.strategy.example.behaviors.quack.QuackWithElectroSound;
import com.yarkin.strategy.example.behaviors.swim.SwimOnElectronicEngine;

public class ElectronicDuck extends Duck {

    public ElectronicDuck() {
        super(new FlyOnAirplane(), new QuackWithElectroSound(), new SwimOnElectronicEngine());
    }

    @Override
    public void display() {
        System.out.println("*display electronic duck*");
    }
}
