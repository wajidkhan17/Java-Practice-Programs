package OOP_Inheritence;

public class TestCar {
	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();// overridden
		b.stop(); // inherite
		b.refuel(); // inherite
		b.autoparking(); // individual
		b.engine();
		BMW.run();
		System.out.println(b.speed);
		b.aeroDynamic();
		System.out.println("----------------");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.run();
		c.aeroDynamic();
		System.out.println("----------------");
		Audi a = new Audi();
		a.thefSafety(); // individual
		a.start(); // inherited
		a.stop(); // inherited
		a.refuel(); // inherited
		a.engine();
		System.out.println("----------------");
		Automobile au = new Automobile();
		au.aeroDynamic();
		 
		System.out.println("----------------");
		Truck t = new Truck();
		t.heavyLoading();
		System.out.println("---------------");
		Car c1 = new BMW(); // child class object can be refrred by parent class reference variable
		c1.start(); // top casting
		c1.stop();
		c1.refuel();
		c1.engine();
//		Down casting - JAVA does not support it at run time
//		BMW b1 = (BMW) new Car();
//		b1.autoparking();
	}
}
