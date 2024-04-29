package BrowserVendors;

import Browser.BrowserUtils;

public class Safari extends BrowserUtils {
	
	@Override
	public void click() {
		System.out.println("Safari -- Clicking");
	}
	
	public void launchURL() {
		System.out.println("https://google.com");
	}
}
