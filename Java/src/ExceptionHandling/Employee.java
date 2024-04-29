package ExceptionHandling;

public class Employee {
	
	String name =  "Wajid";
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
			Employee e = new Employee();
			e = null;
			System.out.println(e.name);
			int i = 9 / 0; //unwanted condition
			System.out.println("hello"); //after the exception remaing code in the try block does not execute
		} catch (NullPointerException e) {
			System.out.println("Null pointer Exception is coming");
			e.printStackTrace();
		}
//		catch (ArithmeticException e) {
//			System.out.println("Arithmetic Exception is coming");
//			e.printStackTrace();
//		}
		
		System.out.println("Bye");
	}
}
