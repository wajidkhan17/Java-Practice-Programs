package WebDriver_Arch;

public class SafariDriver implements WebDriver {
	public SafariDriver() {
		System.out.println("launch Safari....");
	}

	@Override
	public void findElement() {
		System.out.println("findElement...");
	}

	@Override
	public void findElements() {
		System.out.println("findElements...");
	}

	@Override
	public void click(String element) {
		System.out.println("click on:" + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("send keys to the element:" + element + "value" + value);
	}

	@Override
	public void get(String url) {
		System.out.println("launch url.." + url);
	}

	@Override
	public String getTitle() {
		String title = "Amazon Shop";
		return title;
	}

	@Override
	public void close() {
		System.out.println("close the browser");
	}
}
