package Polymorphism;

public class Apple extends Fruit implements Organic {

	
	public void appleMethod() {
		System.out.println("Apple method in aplle class");
	}
	
	
	@Override
	public void fruitMethod() {
		System.out.println("Fruit method overriden in Apple class");
	}
	
	public void eat() {
		System.out.println("Eating an apple in Apple class");
	}
}
