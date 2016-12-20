package factory;

public class NYPizzaStore extends PizzaStoreFactory{

	@Override
	protected Pizza createPizza(PizzaType type) {
		Pizza pizza = new SimplePizza();
		if (type == PizzaType.CHEESE) {
			pizza = new NYStyleCheesePizza();
		}
		return pizza;
	}

}
