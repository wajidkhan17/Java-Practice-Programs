package SuperKeyword;

public class Audi extends Car {
	
	//to use parent class variable if same in child and parent then user super keyword
	int speed = 200;

	public Audi() {
		super(10);
		System.out.println("Audi const");
	}

	@Override
	public void start() {
		System.out.println("car start");
		super.start();
		super.refuel();
	}

	public void getSpeed() {
		System.out.println(speed);
		System.out.println(super.speed);
	}
}
