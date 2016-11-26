package factory.pizza;

/**
 * Created by Rémy Pocquerusse on 23/11/2016.
 */
public class PepperoniPizza implements Pizza {

    PepperoniPizza() {
    }

    @Override
    public void prepare() {
        System.out.println("PepperoniPizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("PepperoniPizza.bake");
    }

    @Override
    public void cut() {
        System.out.println("PepperoniPizza.cut");
    }

    @Override
    public void box() {
        System.out.println("PepperoniPizza.box");
    }
}
