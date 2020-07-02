package Beverages;

public abstract class Beverage {
    String description = "Unknown Beverages.Beverage";
    BeverageSize size;

    public String getDescription() {
        return description;
    }

    public BeverageSize getSize() { return size; }

    public abstract double cost();
}

