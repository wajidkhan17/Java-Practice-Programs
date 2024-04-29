package constructorconcept;

public class Employee {
	String name;
	int age;
	double salary;
	boolean isPerm;
	
	//Constructor of the class
	//const... name will be same as the class name 
	//const.. looks like as functional but not a function
	//const.. can not return any value, there is no return type 
	//const.. can be overloaded
	//const.. it is used to initilize the class variable
	//Const.. it is used to create the object on the basis of given parameters
	//const.. it helps to prevent of craeting unnecessary object
	
//	public Employee() {// 0 parameter const
//		System.out.println("default const...");
//	}
//	
//	public Employee(int i) {
//		System.out.println("1 default const..."+ i);
//	}
//	
//	public Employee(int i, String p) {
//		System.out.println("1 default const..."+ i + " " + p);
//	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Wajid", 20);
		System.out.println(e1.name+" "+e1.age);
//		Employee e2 = new Employee(10);
//		Employee e3 = new Employee(10, "Wajid");
//		e1.name = "Tom";
//		e1.age = 20;
//		e1.salary = 12.33;
//		e1.isPerm = true;
	}
}
