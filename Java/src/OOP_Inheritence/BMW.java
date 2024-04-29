package OOP_Inheritence;

public class BMW extends Car {
	public BMW() {
		super();
	}

	int speed = 200;

	// method overriding: Polymorphism: Run time polymorphism, dynamic polymorphism
	// when we have a method in parent class and the same method in the child class
	// 1. Method name should be same
	// 2. Same number of parameters
	// 3. Same types of parameters: with same sequense of parameters
	// 4. Same return type
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	public void autoparking() {
		System.out.println("BMW -- autoparking");
	}

	@Override
	public void engine() {
		System.out.println("bmw -- engine");
	}

//	Method hiding - Static method can not be override
	public static void run() {
		System.out.println("BMW -- Run");
	}

	@Override
	public void aeroDynamic() {
		System.out.println("BMW == aeroDynamic");
	}

//	Private method can not be overridden
	private void billing() {
		System.out.println("Car -- billing");
	}
}
