package BrowserVendors;

import Browser.BrowserUtils;

public class Chrome extends BrowserUtils {
	
	@Override
	public void click() {
		System.out.println("Chrome -- Clicking");
	}
	
	public void launchURL() {
		System.out.println("https://google.com");
	}
}
