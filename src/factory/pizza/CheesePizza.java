package factory.pizza;

/**
 * Created by Rémy Pocquerusse on 23/11/2016.
 */
public class CheesePizza implements Pizza {

    CheesePizza() {
    }

    @Override
    public void prepare() {
        System.out.println("CheesePizza.prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza.bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza.cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza.box");
    }
}
