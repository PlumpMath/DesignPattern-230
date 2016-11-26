package factory.client;

import factory.pizza.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

/**
 * Created by Rémy Pocquerusse on 24/11/2016.
 */
public class PizzaStoreTest {

    PizzaStore pizzaStore;
    SimplePizzaFactory pizzaFactory;

    @BeforeMethod
    public void setUp() throws Exception {

        pizzaFactory = new SimplePizzaFactory();
        pizzaStore = new PizzaStore(pizzaFactory);
    }

    @Test
    public void testPizza() {
        assertTrue(pizzaStore.orderPizza("cheese") instanceof CheesePizza);
        assertTrue(pizzaStore.orderPizza("pepperoni") instanceof PepperoniPizza);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        pizzaFactory = null;
        pizzaStore = null;
    }

}