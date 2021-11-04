package com.yarkin.strategy.example.duck;

import com.yarkin.strategy.example.behaviors.FlyBehavior;
import com.yarkin.strategy.example.behaviors.QuackBehavior;
import com.yarkin.strategy.example.behaviors.SwimBehavior;
import com.yarkin.strategy.example.behaviors.fly.FlyNoWay;
import com.yarkin.strategy.example.behaviors.quack.QuackNoWay;
import com.yarkin.strategy.example.behaviors.swim.SwimNoWay;

public class WoodenDuck extends Duck{

    public WoodenDuck() {
        super(new FlyNoWay(), new QuackNoWay(), new SwimNoWay());
    }

    @Override
    public void display() {
        System.out.println("*display wooden duck*");
    }
}
