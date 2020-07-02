import Pizzas.*;

public class NewYorkPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NewYorkCheesePizza();
                break;
            case "greek":
                //pizza = new NewYorkGreekPizza();
                break;
            case "pepperoni":
                //pizza = new NewYorkPepperoniPizza();
                break;
            case "clam":
                //pizza = new NewYorkClamPizza();
                break;
            case "veggie":
                //pizza = new NewYorkVeggiePizza();
                break;
        }
        return pizza;
    }
}
