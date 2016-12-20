package factory;

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
