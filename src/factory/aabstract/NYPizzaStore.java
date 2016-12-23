package factory.aabstract;

import factory.function.PizzaType;

/**
 * @author suvan
 * @create 2016-12-23-15:28
 */
public class NYPizzaStore extends PizzaStoreFactory {

    @Override
    protected Pizza createPizza(PizzaType type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = null;
        if (type == PizzaType.CHEESE) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
