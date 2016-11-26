package factory.client;

import factory.pizza.PizzaStore;
import factory.pizza.SimplePizzaFactory;

/**
 * Prenons un cas simple, nous sommes en charge d'une pizzaria.
 *
 *
 *
 * Created by Rémy Pocquerusse on 23/11/2016.
 */
public class Application {

    public static void main(String[] args) {

        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        pizzaStore.orderPizza("cheese");
    }
}
