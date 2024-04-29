package OOP_Encapsulation;

public class Browser {
	public void launchChromeBrowser() {
		System.out.println("launch chrome browser");
		checkOSCompatabile();
		checkRamSize();
		checkChromeVersion();
		checkChromeServices();
	}

	private void checkOSCompatabile() {
		System.out.println("checkOSCompatabile");
	}

	private void checkRamSize() {
		System.out.println("checkRamSize");
	}

	private void checkChromeVersion() {
		System.out.println("checkChromeVersion");
	}

	private void checkChromeServices() {
		System.out.println("checkChromeServices");
	}
}
