package OOP_Encapsulation;

public class Loginpage {
	private String username;
	private String password;

	// setter
	public void setUn(String username) {
		if (username == null) {
			return;
		}
		this.username = username;
	}

	// getter
	public String getUn() {
		if (username == null) {
			System.out.println("Pleaes enter the valid password");
		}
		return username;
	}

	// setter
	public void setPw(String password) {
		this.password = password;
	}

	// getter
	public String getPw() {
		return password;
	}
}
