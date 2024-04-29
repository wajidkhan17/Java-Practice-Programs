package AccessModifies;

public class Cycle {
	public static void main(String[] args) {
		
		Car c = new Car();
		c.color = "black";
		c.licenseumber = "785674";
		c.name = "Atlas";
	//	c.price iss private so can't be use in non-sub class.
		
	}
}
