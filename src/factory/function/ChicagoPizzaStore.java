package factory.function;

public class ChicagoPizzaStore extends PizzaStoreFactory{

	@Override
	protected Pizza createPizza(PizzaType type) {
		Pizza pizza = new SimplePizza();
		if (type == PizzaType.CHEESE) {
			pizza = new ChicagoStyleCheesePizza();
		}
		return pizza;
	}

}
