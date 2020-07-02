package Beverages;

public class Decaf extends Beverage {

    public Decaf(BeverageSize size) {
        description = "Beverages.Decaf";
        this.size = size;
    }

    @Override
    public double cost() {
        switch (size){
            case SMALL:
                return 0.84;
            case MEDIUM:
                return 1.05;
            case LARGE:
                return 1.34;
            default:
                return 0;
        }
    }
}
