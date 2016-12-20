package test;

import factory.ChicagoPizzaStore;
import factory.NYPizzaStore;
import factory.Pizza;
import factory.PizzaStoreFactory;
import factory.PizzaType;

public class FactoryTest {
	public static void main(String[] args) {
		PizzaStoreFactory chicagoPizzaStore = new ChicagoPizzaStore();
		PizzaStoreFactory nyPizzaStore = new NYPizzaStore();
		
		Pizza pizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName());
		
		System.out.println();
		
		pizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Joel ordered a " + pizza.getName());
	}
}
