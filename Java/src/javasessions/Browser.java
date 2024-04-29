package javasessions;

public class Browser {
	// WAF: Write a function to launch a browser of given the browser name
	public boolean browserName(String browsername) {
		boolean flag = false;
		System.out.println("The browser name is...." + browsername);
		if (browsername.toLowerCase().equals("chrome")) {
			System.out.println(browsername);
			flag = true;
		} else if (browsername.toLowerCase().equals("firefox")) {
			System.out.println(browsername);
			flag = true;
		} else if (browsername.toLowerCase().equals("ie")) {
			System.out.println(browsername);
			flag = true;
		} else if (browsername.toLowerCase().equals("safari")) {
			System.out.println(browsername);
			flag = true;
		} else {
			System.out.println("Please enter the right broweser name");
		}
		return flag;
	}
//		boolean flag = false;
//		switch (browsername.toLowerCase()) {
//		case "chrome":
//			System.out.println("Chrome Browser");
//			flag = true;
//			break;
//		case "firefox":
//			System.out.println("Firefox Browser");
//			flag = true;
//			break;
//		case "ie":
//			System.out.println("IE Browser");
//			flag = true;
//			break;
//		default:
//			System.out.println("Wrong browser");
//		}
//		return flag;
//	}

	public static void main(String[] args) {
		Browser br = new Browser();
		boolean flag = br.browserName("Chrome");
		System.out.println(flag);
		if (flag) {
			System.out.println("www.google.com");
		}
	}
}
