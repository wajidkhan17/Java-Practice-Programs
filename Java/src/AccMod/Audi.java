package AccMod;

import AccessModifies.Car;

public class Audi {
	public static void main(String[] args) {
		Car c = new Car();
		c.name = "Audi";
//		c.price and c.licenseumber and c.color iss private and default and protected
//		so can't be use in different package subclass		
	}
}
