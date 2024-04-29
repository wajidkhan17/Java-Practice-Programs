package javasessions;

public class MainMethodOverloading {
	public void main() {
		System.out.println("main 1 method");
	}

	public void main(String a) {
		System.out.println("main 1 method: " + a);
	}

//JVM is calling this main method with no values
	public static void main(String[] args) {
		System.out.println("This is my java code");
		MainMethodOverloading obj = new MainMethodOverloading();
		obj.main("Wajid");
	}

	public void main(int[] a) {
		System.out.println("java code");
	}
}
