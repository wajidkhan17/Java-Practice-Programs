package javasessions;

public class TimeComplexity {
	public static void main(String[] args) {
		// O(n) - BIG O
		int i = 1; // O(1): Constant Time
		int j = 1;
		System.out.println(i + j);// O(1) Constant Time
		// 1 to 10: loop O(N)
		for (int p = 0; p <= 10; p++) {
			System.out.println(p);
		}
		System.out.println("---------------------------------");
		// Why time complexity is O(N)
		// 1+n+n+n => 3n+1 : Linear equation --> 3n --> n -->O(n)
		// Nested for loop
		// (1+n+n+n)(1+n+n+n) => (1+3n)(1+3n) => 1+3n+3n+9n^2 => 9n^2+6n+1 => 9n^2+6n
		// 3n(3n+2) ==> 3n(3n) => 9n^2 ==> O(n^2)
		for (int m = 0; m <= 5; m++) {
			for (int n = 0; n <= 5; n++) {
				System.out.print(m + "" + n + " ");
			}
			System.out.println();
		}
	}
}
