package com.yarkin.strategy.example;

import com.yarkin.strategy.example.behaviors.fly.FlyOnAirplane;
import com.yarkin.strategy.example.behaviors.quack.QuackWithElectroSound;
import com.yarkin.strategy.example.behaviors.swim.SwimNatural;
import com.yarkin.strategy.example.duck.CommonDuck;
import com.yarkin.strategy.example.duck.Duck;
import com.yarkin.strategy.example.duck.ElectronicDuck;
import com.yarkin.strategy.example.duck.WoodenDuck;

public class Program {
    public static void main(String[] args) {
        System.out.println("Program started...");

        Duck[] ducks = { new WoodenDuck(), new CommonDuck(), new ElectronicDuck() };

        for (Duck duck : ducks) {
            duck.display();
            duck.fly();
            duck.quack();
            duck.swim();
        }

        ducks[0].setFlyBehavior(new FlyOnAirplane());
        ducks[1].setQuackBehavior(new QuackWithElectroSound());
        ducks[2].setSwimBehavior(new SwimNatural());

        for (Duck duck : ducks) {
            duck.display();
            duck.fly();
            duck.quack();
            duck.swim();
        }

    }
}
