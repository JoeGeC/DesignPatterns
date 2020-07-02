package Condiments;

import Beverages.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        switch (beverage.getSize()){
            case SMALL:
                return 0.10 + beverage.cost();
            case MEDIUM:
                return 0.15 + beverage.cost();
            case LARGE:
                return 0.20 + beverage.cost();
            default:
                return 0;
        }
    }
}
