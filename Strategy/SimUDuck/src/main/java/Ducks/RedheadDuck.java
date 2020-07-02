package Ducks;

import FlyBehaviour.FlyWithWings;
import QuackBehaviour.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {

    }
}
