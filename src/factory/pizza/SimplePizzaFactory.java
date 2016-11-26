package factory.pizza;

/**
 * Created by Rémy Pocquerusse on 23/11/2016.
 */
public class SimplePizzaFactory {

    public SimplePizzaFactory() {
    }

    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            return new PepperoniPizza();
        } else {
            return pizza;
        }
    }
}
