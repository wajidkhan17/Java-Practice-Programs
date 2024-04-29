package ExceptionHandling;

public class Company {
	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		try {
			m3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void m3() {
		System.out.println("m3 method");
		int i = 9 / 0;
	}

	public static void main(String[] args) {
		Company c = new Company();
		c.m1();
		System.out.println("Bye");
	}
}
