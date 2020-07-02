package Condiments;

import Beverages.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        switch (beverage.getSize()){
            case SMALL:
                return 0.05 + beverage.cost();
            case MEDIUM:
                return 0.10 + beverage.cost();
            case LARGE:
                return 0.15 + beverage.cost();
            default:
                return 0;
        }
    }
}