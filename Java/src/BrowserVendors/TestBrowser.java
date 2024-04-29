package BrowserVendors;

import Browser.BrowserUtils;

public class TestBrowser {
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.click();
		c.launchURL();
		System.out.println("-------------------");
//		BrowserUtils br = new BrowserUtils();
//		br.click();
//		System.out.println("-------------------");
//		BrowserUtils br1 = new Firefox();
//		br1.click();
//		System.out.println("-------------------");
//		BrowserUtils br2 = new Safari();
//		br2.click();
		BrowserUtils br = null;
		String browesrName = "firefox";
		//Cross browser logic
		if (browesrName.equals("chrome")) {
			br = new Chrome();
		} else if (browesrName.equals("firefox")) {
			br = new Firefox();
		} else if (browesrName.equals("safari")) {
			br = new Safari();
		} else {
			System.out.println("Please pass the right browser...");
		}
		br.click();
	}
}
