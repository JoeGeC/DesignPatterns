package Condiments;

import Beverages.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        switch (beverage.getSize()){
            case SMALL:
                return 0.15 + beverage.cost();
            case MEDIUM:
                return 0.20 + beverage.cost();
            case LARGE:
                return 0.25 + beverage.cost();
            default:
                return 0;
        }
    }
}
