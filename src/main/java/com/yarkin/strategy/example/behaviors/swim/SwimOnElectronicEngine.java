package com.yarkin.strategy.example.behaviors.swim;

import com.yarkin.strategy.example.behaviors.SwimBehavior;

public class SwimOnElectronicEngine implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("*swimming on electronic engine*");
    }
}
