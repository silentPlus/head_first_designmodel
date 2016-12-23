package factory.aabstract;

import factory.function.PizzaType;

/**
 * @author suvan
 * @create 2016-12-23-15:33
 */
public abstract class PizzaStoreFactory {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}
