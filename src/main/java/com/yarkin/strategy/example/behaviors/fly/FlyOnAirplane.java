package com.yarkin.strategy.example.behaviors.fly;

import com.yarkin.strategy.example.behaviors.FlyBehavior;

public class FlyOnAirplane implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("*flying on airplane*");
    }
}
