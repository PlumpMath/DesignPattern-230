package factory.pizza;

/**
 * L'utilisation d'une classe abstraite aurait été plus judicieuse si la façon de préparer une pizzaFactory était toujours
 * la même.
 */
public interface Pizza {

    void prepare();
    void bake();
    void cut();
    void box();
}
