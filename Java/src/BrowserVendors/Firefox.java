package BrowserVendors;

import Browser.BrowserUtils;

public class Firefox extends BrowserUtils {
	
	@Override
	public void click() {
		System.out.println("Firefox -- Clicking");
	}
	
	public void launchURL() {
		System.out.println("https://google.com");
	}
}
