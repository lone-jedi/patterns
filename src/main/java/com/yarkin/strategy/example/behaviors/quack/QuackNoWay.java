package com.yarkin.strategy.example.behaviors.quack;

import com.yarkin.strategy.example.behaviors.QuackBehavior;

public class QuackNoWay implements QuackBehavior {
    @Override
    public void quack() {
        // Silence golden
    }
}
