package BuilderPattern;

public class AmazonShop {
	public void login() {
		System.out.println("login to app");
	}

	public AmazonShop login(String un, String pw) {
		System.out.println("login with " + un + " " + pw);
		return this;
	}

	public AmazonShop search() {
		System.out.println("display all the product name");
		return this;
	}

	public AmazonShop search(String productName, String color) {
		System.out.println("display all the product name with the : " + productName + " " + color);
		return this;
	}

	public AmazonShop search(String productName, String color, int price) {
		System.out.println("display all the product name with the : " + productName + " " + color + " " + price);
		return this;
	}

	public AmazonShop addToCard(String productName) {
		System.out.println("add to cart: " + productName);
		return this;
	}

	public AmazonShop doPayment(String cc, int cvv) {
		System.out.println("make payment with: " + cc + " " + cvv);
		return this;
	}

	public AmazonShop doPayment(String upiNumber) {
		System.out.println("make payment with: " + upiNumber);
		return this;
	}

	public AmazonShop generateOrderID() {
		System.out.println("Your ID is: " + 12345);
		return this;
	}

	public AmazonShop logout() {
		System.out.println("logout...");
		return this;
	}
}
