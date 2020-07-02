package Beverages;

public class DarkRoast extends Beverage {

    public DarkRoast(BeverageSize size) {
        description = "Dark Roast";
        this.size = size;
    }

    @Override
    public double cost() {
        switch (size){
            case SMALL:
                return 0.79;
            case MEDIUM:
                return 0.99;
            case LARGE:
                return 1.29;
            default:
                return 0;
        }
    }
}
