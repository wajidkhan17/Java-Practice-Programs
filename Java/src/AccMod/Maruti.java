package AccMod;

import AccessModifies.Car;

public class Maruti extends Car {
	public static void main(String[] args) {
		Maruti m = new Maruti();
		m.name = "Alto";
		m.color = "grey";
//	m.price and m.licenseumber iss private and default so can't be use in different package subclass
	}
}
