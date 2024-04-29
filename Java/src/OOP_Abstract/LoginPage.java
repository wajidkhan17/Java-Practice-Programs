package OOP_Abstract;

public class LoginPage extends Page {
	
	static int price = 20;
	
	public LoginPage() {
		System.out.println("const... login page");
	}

	@Override
	public void title() {
		System.out.println("Login page -- title");
		
	}

	@Override
	public void url() {
		System.out.println("Login page -- title");
		
	}

	@Override
	public void header() {
		System.out.println("Login page -- header");
		
	}
	
	public void doLogin(String un, String pw) {
		System.out.println("login with "+ un + ":" + pw);
	}
	@Override
	public void loadingPage() {
		System.out.println("page -- loading..." + 10);
	}
}
