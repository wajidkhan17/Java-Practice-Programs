package javasessions;

import java.util.Arrays;

public class LoginPage {
	String username;
	String password;
	boolean isActive;
	double bmi;
	int age;
	String st[] = { "Tom", "Lisa", "Peter" };

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		System.out.println(lp); // It will be give the memory address of the object
		System.out.println(lp.st.length);
		System.out.println(Arrays.toString(lp.st));
		for (String e : lp.st) {
			System.out.println(e);
		}
		System.out.println("-----------------------");
		for (int i = 0; i <= lp.st.length - 1; i++) {
			System.out.println(lp.st[i]);
		}
	}
}
