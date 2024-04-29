package programPractice;

public class StringComaprison {
	public static void main(String[] args) {
		String name = "Wajid";
		String name1 = "Wajid";
		if (name.equals(name1)) {
			System.out.println("the name is same");
		} else {
			System.out.println("no match");
		}
		if (name.equalsIgnoreCase("wajid")) {
			System.out.println("the name is same");
		} else {
			System.out.println("no match");
		}
		String lastName = "Khan";
		String lastName1 = "Wajid";
		int result = lastName.compareTo(lastName1);
		System.out.println(result);
	}
}
