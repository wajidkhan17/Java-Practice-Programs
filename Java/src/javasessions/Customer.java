package javasessions;

public class Customer {
	// Can not create a method inside a method
	// 1. no input and no return
	// void: Can not return anything
	// Return type is void
	public void test() {
		System.out.println("This is the test method...");
	}

	public void printMyName() {
		System.out.println("My name is Wajid");
		String name = "Wajid Khan";
		System.out.println(name);
	}

	// 2. no input and some return:
	// Return type: integer
	public int getNumber() {
		System.out.println("get number....");
		int num = 100;
		int num1 = 200;
		int sum = num + num1;
		System.out.println(sum);
		return sum;
	}

	public String getTrainerName() {
		System.out.println("get Trainer name");
		String name = "Naveen";
		return name;
	}

	public int getBill() {
		int a = 100;
		int b = 200;
		int c = 300;
		int z = a + b + c;
		return z;
	}

	// WAF: name: getMarks
	// input parameter: student name
	// return: marks (integer)
	// A method can return one value at a time, two return together not possible
	// return should be a the last statement
	public int getMarks(String studentName) {
		System.out.println("The student name is: " + studentName);
		if (studentName.equals("Vijay")) {
			return 90;
		} else if (studentName.equals("Aman")) {
			return 95;
		} else if (studentName.equals("priyanka")) {
			return 100;
		} else if (studentName.equals("Naveen")) {
			return 10;
		} else {
			System.out.println("Student name is not found...Please pass the right student name" + " " + studentName);
			return -1;
		}
	}

	public int getStudentMarks(String studentName) {
		System.out.println("The student name is: " + studentName);
		int marks = -1;
		if (studentName.equals("Vijay")) {
			marks = 90;
		} else if (studentName.equals("Aman")) {
			marks = 95;
		} else if (studentName.equals("priyanka")) {
			marks = 100;
		} else if (studentName.equals("Naveen")) {
			marks = 10;
		} else {
			System.out.println("Student name is not found...Please pass the right student name" + " " + studentName);
		}
		return marks;
	}

	// 3. Some input and some return
	// It has two input parameters
	public int add(int a, int b) {
		System.out.println("add method");
		int total = a + b;
		return total;
	}

	public static void main(String[] args) {
		Customer obj = new Customer();
		obj.test();
		System.out.println("-------------------------");
		obj.printMyName();
		System.out.println("-------------------------");
		int s1 = obj.getNumber();
		System.out.println(s1);
		System.out.println(obj.getNumber());
		System.out.println("-------------------------");
		String s2 = obj.getTrainerName();
		System.out.println(s2);
		System.out.println("-------------------------");
		int totalAmount = obj.getBill();
		System.out.println(totalAmount - 50);
		System.out.println("-------------------------");
		// When we pass the values for the parameters that is called arguments
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(100, 2000));
		System.out.println("-------------------------");
		int marks = obj.getMarks("Vijay");
		System.out.println(marks);
		int marks1 = obj.getMarks("Amaan");
		System.out.println(marks1);
		if (marks1 == -1) {
			System.out.println("Dont print the marksheet");
		}
		System.out.println("-------------------------");
		int marks2 = obj.getStudentMarks("Vijay");
		System.out.println(marks2);
	}
}
