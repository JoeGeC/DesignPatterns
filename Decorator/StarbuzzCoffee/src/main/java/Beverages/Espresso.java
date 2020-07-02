package Beverages;

public class Espresso extends Beverage {

    public Espresso(BeverageSize size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public double cost() {
        switch (size){
            case SMALL:
                return 1.79;
            case MEDIUM:
                return 1.99;
            case LARGE:
                return 2.29;
            default:
                return 0;
        }
    }
}
