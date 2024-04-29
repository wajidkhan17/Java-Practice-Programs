package javasessions;

public class EcommOverLoading {
	// Method overloading: Its also called polymorphism -->
	// Complie time and run time polymorphism CompileTime(Static)
	// Within the same class, we have number f methods with:
	// 1. with the same name
	// 2. different number of parameters
	// 3. different types of parameters
	// 4. with the different sequence of the parameters
	// Return does'nt matter in method overloading
	public void test() {
		System.out.println("test method");
	}
//	public int test(int a) {
//		System.out.println("test method: " + a);
//		return a+10;
//	}
	// return does not matter, it depends on the parameters only

	public double test(int a) {
		System.out.println("test method: " + a);
		return a + 20.10;
	}

	public void test(int a, int b) {
		System.out.println("test method: " + (a + b));
	}

	public void test(String a, int b) {
		System.out.println("test method: " + (a + b));
	}

	public void test(int a, String b) {
		System.out.println("test method: " + (a + b));
	}

	// Amazon login:
	public void login() {
		System.out.println();
	}

	public void login(String un, String pw) {
		System.out.println();
	}

	public void login(String un, String pw, int otp) {
		System.out.println();
	}

	public void login(String un, String pw, String role) {
		System.out.println();
	}
	// Search

	public void search() {
	}

	public void search(String productName) {
	}

	public void search(String productName, int price) {
	}

	public void search(String productName, int price, String color) {
	}

	public void search(String productName, int price, String color, String sellerName) {
	}

	// Make the payment
	public void doPayment(String cc, int cv) {
	}

	public void doPayment(String cc, int cv, int otp) {
	}

	public void doPayment(String upi) {
	}

	// uber App
	public void booking(String startPoint, String endPoint) {
	}

	public void booking(String startPoint, String endPoint, String carType) {
	}

	public void booking(String startPoint, String endPoint, String carType, int persons) {
	}

	public static void main(String[] args) {
		EcommOverLoading obj = new EcommOverLoading();
		double result = obj.test(10);
		System.out.println(result);
		obj.test(100, "testing");
	}
}
