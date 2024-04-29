package javasessions;

public class MethodChaning {
	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		m4();
	}

	public void m4() {
		System.out.println("m4 method");
		System.out.println("------------------");
	}

	public static void t1() {
		System.out.println("t1 method");
		t2();
		MethodChaning o1 = new MethodChaning();
		o1.m1();
	}

	public static void t2() {
		System.out.println("t2 method");
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		MethodChaning obj = new MethodChaning();
		obj.m1();
		MethodChaning.t1();
	}
}
