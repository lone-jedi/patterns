package com.yarkin.strategy.example.behaviors.quack;

import com.yarkin.strategy.example.behaviors.QuackBehavior;

public class QuackWithElectroSound implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("*quacking with electronic sound*");
    }
}
