package javasessions;

public class MailApp {
	
	int price; // Copy of this variable will be store inside the object of this class
	static String name = "gmail";
	
	public void sendMail() {  // Copy of this variable will be store inside the object of this class
		System.out.println("Send Mail");
	}

	public static void sendInfo() { //CMA - MetaSpace
		System.out.println("Send Info");
	}

	public static void main(String[] args) {  //CMA - MetaSpace
		// How to call non static method?a
		MailApp ma = new MailApp();
		ma.sendMail();
		// How to call static method? --> Using class name
		MailApp.sendInfo();
		
		//In the same class we can call it directly
		sendInfo();
		
		
	}
}
