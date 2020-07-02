package Ducks;

import FlyBehaviour.FlyNoWay;
import QuackBehaviour.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {

    }
}
