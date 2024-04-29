package javasessions;

public class Car {
	String name;
	int price;
	String color;
	// Static properties saved under the CMA - Common memory allocatiob earlier it
	// was called
	// Permanent generation but after 1.8 it is called as metaSpace
	static int wheels = 4;

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 30;
		c1.color = "Red";
		// c1.wheels = 4;
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 40;
		c2.color = "White";
		// c2.wheels = 4;
		Car c3 = new Car();
		c3.name = "BMW";
		c3.price = 20;
		c3.color = "Black";
		// c3.wheels = 4;
		// how to access the static vars:
		// 1. by using class name always do, its a best practice
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + Car.wheels);
		System.out.println("--------------------");
		// 2. using directly in the same class
		System.out.println(wheels);
		// 3. can we use static variable with the object reference variable
		// Wrong approch should not do the below practice
		// System.out.println(c1.wheels);
	}
}
