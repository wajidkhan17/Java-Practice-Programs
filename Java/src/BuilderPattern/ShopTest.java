package BuilderPattern;

public class ShopTest {
	public static void main(String[] args) {
		AmazonShop app = new AmazonShop();
		app.login("wajid@gmail.com", "wajid123").search("macbook", "white").addToCard("macbook").doPayment("wajid@hdfc")
				.generateOrderID().logout();
		System.out.println("----------------------------------------------");
		//
		app.login("wk@gmail.com", "wk1234").search("tshirt", "black").addToCard("tshirt").doPayment("wk@hdfc")
				.generateOrderID().logout();
	}
}
