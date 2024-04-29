package ExceptionHandling;

public class FinallyBlock {
	public static int getMarks(String stName) {
		System.out.println("student name is:" + stName);
		if (stName.equals("vijay")) {
			try {
				int i = 9 / 0;
				return 90;
			} catch (ArithmeticException e) {
				e.printStackTrace();
				return 75;
			} finally {
				System.out.println("inside finally block");
				return 20;
			}
		} else if (stName.equals("Aman")) {
			return 95;
		} else if (stName.equals("Raj")) {
			return 95;
		} else {
			System.out.println("student not found.." + stName);
			return -1;
		}
	}

	// either exception is coming or not finally block will always execute
	public static void main(String[] args) {
		FinallyBlock fb = new FinallyBlock();
		System.out.println(getMarks("vijay"));
//		System.out.println("A");
//		System.out.println("A");
//		System.out.println("A");
//		try {
//			int i = 9 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println("AE is coming..");
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("inside the finally block");
//		}
//		System.out.println("bye");
	}
}
