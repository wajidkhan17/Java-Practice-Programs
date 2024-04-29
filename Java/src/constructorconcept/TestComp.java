package constructorconcept;

import java.util.ArrayList;

public class TestComp {
	public static void main(String[] args) {
		Company c1 = new Company("IBM", "NY");
		System.out.println(c1.name + " " + c1.ceo + " " + c1.empCount + " " + c1.sharePrice + " " + c1.hq);
		Company c2 = new Company("infosys", 10000, 500.44);
		System.out.println(c2.name + " " + c2.ceo + " " + c2.empCount + " " + c2.sharePrice + " " + c2.hq);
		c2.hq = "Bangalore";
		System.out.println(c2.name + " " + c2.ceo + " " + c2.empCount + " " + c2.sharePrice + " " + c2.hq);
		Company c3 = new Company("ABC");
		System.out.println(c3.name);
		Customer cu1 = new Customer("Naveen", "99999", "wajid@gmail.com");
		ArrayList<String> tomOrderList = new ArrayList<String>();
		tomOrderList.add("Macbookpro");
		tomOrderList.add("iph12");
		tomOrderList.add("nikeShoes");
		Customer cu2 = new Customer("Tom", "Peter", tomOrderList);
		System.out.println(cu2.firstName + " " + cu2.lastName + " " + cu2.orderList);
	}
}
