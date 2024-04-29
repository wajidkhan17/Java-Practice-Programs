package javasessions;

public class SwitchCases {
	public static void main(String[] args) {
		String browser = "chrome";
		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		default:
			System.out.println("Please launch correct browser");
		}
		// Wrong logic approach
		int marks = 100;
		switch (marks) {
		case 100:
			System.out.println("Grade A");
			break;
		case 90:
			System.out.println("Grade B");
			break;
		case 80:
			System.out.println("Grade C");
			break;
		default:
			System.out.println("Failed");
		}
		String env = "   DEV   ";
		switch (env.toLowerCase().trim()) {
		case "qa":
			System.out.println("QA Enviroment");
			break;
		case "dev":
			System.out.println("dev Enviroment");
			break;
		case "production":
			System.out.println("production Enviroment");
			break;
		case "uat":
			System.out.println("uat Enviroment");
			break;
		default:
			System.out.println("Please provide the valid env");
		}
	}
}
