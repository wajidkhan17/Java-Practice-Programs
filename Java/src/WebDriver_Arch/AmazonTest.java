package WebDriver_Arch;

public class AmazonTest {
	static WebDriver driver;

	public static void main(String[] args) {
		String browser = "firefox";
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new firefox();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("the browser is not supported");
		}
		driver.get("https://Amazon.com");
		driver.click("sign in");
		driver.sendKeys("emailId", "wajid@gmail.com");
		driver.sendKeys("password", "wajid@1234");
		driver.click("login");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("Amazon shop")) {
			System.out.println("The title is correct");
		} else {
			System.out.println("The title does not match");
		}
		driver.close();
	}
}
