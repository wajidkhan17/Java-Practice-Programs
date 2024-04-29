package OOP_Interface;

public interface USMedical extends WHO{
	
	//Interface variables are static and final i nature
	int min_fee = 10;
	
	// Interface can not have a method body
	// no method body, then it is called abstract methods
	// only method prototype -- only method declaration
	// can not have method logic
	// interface object strictly not allowed in Java
	// interface to interface use extend keyword
	
	public void cardioServices();

	public void neuroServices();

	public void phisioServices();

	public void emergencyServices();
	
	@Override
	public void covid19Vaccination();
	// after jdk 1.8 two major chnages in Interfaces:
	// 1. can have static method with method body

	public static void billing() {
		System.out.println("US Medical -- billing");
	}

	// 2. We can have default method with method body
	default void medicalDevelopment() {
		System.out.println("US -- medicalDevelopment");
	}
}
