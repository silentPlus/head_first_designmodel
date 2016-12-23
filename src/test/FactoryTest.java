package test;


import factory.aabstract.NYPizzaStore;
import factory.function.ChicagoPizzaStore;
import factory.function.Pizza;
import factory.function.PizzaStoreFactory;
import factory.function.PizzaType;

public class FactoryTest {
	public static void main(String[] args) {
		PizzaStoreFactory chicagoPizzaStore = new ChicagoPizzaStore();
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		
		Pizza pizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Ethan ordered a " + pizza.getName());
		
		System.out.println();
		
		factory.aabstract.Pizza pizzaq = nyPizzaStore.orderPizza(PizzaType.CHEESE);
		System.out.println("Joel ordered a " + pizzaq.getName());
	}
}
