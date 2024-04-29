package AccessModifies;

public class Car {
//										default	private protected pulic
//	Same class   						Yes		Yes		Yes			Yes
//	Same package sub class				Yes		No		Yes			Yes	
//	Same package non-sub class			Yes		No		Yes			Yes
//	different package subclass			no		no		yes			yes
//	different package non-sub class     no		no		no			yes
	public String name;
	private int price;
	protected String color;
	String licenseumber;

	public static void main(String[] args) {
		Car c = new Car();
		c.name = "BMW";
		c.price = 30;
		c.color = "grey";
		c.licenseumber = "121345";
	}
}
