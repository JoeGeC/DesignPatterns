package Beverages;

public class HouseBlend extends Beverage {

    public HouseBlend(BeverageSize size) {
        description = "House Blend Coffee";
        this.size = size;
    }

    @Override
    public double cost() {
        switch (size){
            case SMALL:
                return 0.89;
            case MEDIUM:
                return 1.19;
            case LARGE:
                return 1.49;
            default:
                return 0;
        }
    }
}
