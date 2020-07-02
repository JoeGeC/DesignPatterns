import Pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "greek":
                //pizza = new ChicagoYorkGreekPizza();
                break;
            case "pepperoni":
                //pizza = new ChicagoPepperoniPizza();
                break;
            case "clam":
                //pizza = new ChicagoClamPizza();
                break;
            case "veggie":
                //pizza = new ChicagoVeggiePizza();
                break;
        }
        return pizza;
    }
}
