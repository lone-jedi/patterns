package com.yarkin.strategy.example.duck;

import com.yarkin.strategy.example.behaviors.FlyBehavior;
import com.yarkin.strategy.example.behaviors.QuackBehavior;
import com.yarkin.strategy.example.behaviors.SwimBehavior;
import com.yarkin.strategy.example.behaviors.fly.FlyWithWings;
import com.yarkin.strategy.example.behaviors.quack.QuackNatural;
import com.yarkin.strategy.example.behaviors.swim.SwimNatural;

public class CommonDuck extends Duck {
    public CommonDuck() {
        super(new FlyWithWings(), new QuackNatural(), new SwimNatural());
    }

    @Override
    public void display() {
        System.out.println("*display common duck*");
    }
}
