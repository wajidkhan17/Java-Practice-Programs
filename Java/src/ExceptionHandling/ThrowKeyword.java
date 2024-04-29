package ExceptionHandling;

public class ThrowKeyword {
	// it is used when we want generate our own exception
	public static void getInfo() {
		String data = null;
		try {
			if (data == null) {
				throw new Exception("data not found");
			} else {
				System.out.println(data);
			}
		} catch (Exception e) {
			System.out.println("data not found for this user...");
			e.printStackTrace();
		}
		System.out.println("bye");
	}

	public static void main(String[] args) {
		getInfo();
	}
}