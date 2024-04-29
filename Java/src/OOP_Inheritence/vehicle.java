package OOP_Inheritence;

public class vehicle extends Automobile {
	
	
	public vehicle() {
		super();
	}

	public void engine() {
		System.out.println("vehicle -- engine");
	}

	@Override
	public void aeroDynamic() {
		System.out.println("Vehicle == aeroDynamic");
	}
}
