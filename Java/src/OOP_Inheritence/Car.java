package OOP_Inheritence;

public class Car extends vehicle {
	int speed = 100;
	String name;
	int price;
	// final: to prevent the constant variables
	// to prevent inheritence
	// to prevent overriding

	public Car() {
		super();
		//super should be the first line in the constuctor calling and remaining belo lines does not executed
		System.out.println("Speed");
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");
	}

	public void refuel() {
		System.out.println("car -- refuel");
	}

	public static void run() {
		System.out.println("Car -- Run");
	}

	private void billing() {
		System.out.println("Car -- billing");
	}

	@Override
	public void aeroDynamic() {
		System.out.println("Car == aeroDynamic");
	}
//	Final method can not be overridden
//	private final billing() {
//		System.out.println("Car -- billing");
//	}
}
