package javasessions;

public class Employee {
	// Class: Template, category of all the new objects, blueprint for all objects
	// Data members: variables, methods
	int id;
	String name;
	int age;
	double salary;
	static final String compName = "IBM"; //Constant variable

	public static void main(String[] args) {
		
		final int days = 7;
		//days = 10; can not chnage the variable values once it is defined final
		System.out.println(days * 100);
		System.out.println(Employee.compName);
		//Employee.compName = "Michrosoft";
		//System.out.println(Employee.compName);
		
		
		
		//	static int i = 1; Static variable are only allowed for the class variables
		
		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "Sachin";
		e1.age = 30;
		e1.salary = 35.55;
		System.out.println(e1.id + " " + e1.name + " " + e1.age + " " + e1.salary);
		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "Wajid";
		e2.age = 35;
		e2.salary = 80.00;
		System.out.println(e2.id + " " + e2.name + " " + e2.age + " " + e2.salary);
		
//		No reference object, Unnecessary new objects created, bad practice
//		new Employee().id = 1011;
//		new Employee().name = "Tom";
		
//		null reference objects
//		Employee e4 = new Employee();
//		e4 = null;
//		e4.id = 101;
		
//		System.gc(); //Calling Garbage collector
		
		
		
		
	}
}
