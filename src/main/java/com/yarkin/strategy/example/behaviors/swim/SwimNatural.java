package com.yarkin.strategy.example.behaviors.swim;

import com.yarkin.strategy.example.behaviors.SwimBehavior;

public class SwimNatural implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("*swimming natural*");
    }
}
