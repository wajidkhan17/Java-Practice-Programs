package javasessions;

import java.util.ArrayList;

public class Application {
	// WAF: this will check how many menu items are available on that particular
	// page
	// Parameters : page name
	// return: Array list
	public ArrayList<String> getPageMenuLinks(String pageName) {
		System.out.println("Page name is : " + pageName);
		ArrayList<String> menuList = new ArrayList<String>();
		if (pageName.equals("loginpage")) {
			menuList.add("product");
			menuList.add("category");
			menuList.add("price");
		} else if (pageName.equals("home")) {
			menuList.add("product");
			menuList.add("category");
			menuList.add("price");
			menuList.add("search");
			menuList.add("cart");
		} else if (pageName.equals("productpage")) {
			menuList.add("product");
			menuList.add("category");
			menuList.add("price");
			menuList.add("info");
			menuList.add("seller");
		} else {
			System.out.println("Please pass the right page name...." + pageName);
		}
		return menuList;
	}

	public String[] getEmpDevicesList(String empName) {
		System.out.println("Employee name is: " + empName);
		String[] devices = new String[5];
		if (empName.trim().equalsIgnoreCase("Naveen")) {
			devices[0] = "iphone";
			devices[1] = "BMW";
			devices[2] = "laptop Charger";
			devices[3] = "laptop";
			devices[4] = "headphone";
		} else if (empName.trim().equalsIgnoreCase("Wajid")) {
			devices[0] = "Samsung";
			devices[1] = "Acer laptop";
			devices[2] = "Charger";
			devices[3] = "Tablet oppo";
			devices[4] = "earphone";
		} else if (empName.trim().equalsIgnoreCase("yash")) {
			devices[0] = "Apple iphone 13";
			devices[1] = "Acer laptop";
			devices[2] = "lap charger";
			devices[3] = "mousepad";
			devices[4] = "monitor";
		}
		return devices;
	}

	public ArrayList<String> getNewEmpList(String empName) {
		System.out.println("Employee name is: " + empName);
		ArrayList<String> empItemList = new ArrayList<String>();
		if (empName.trim().equalsIgnoreCase("Naveen")) {
			empItemList.add("iphone");
			empItemList.add("laptop");
			empItemList.add("charger");
		} else if (empName.trim().equalsIgnoreCase("Wajid")) {
			empItemList.add("Samsung");
			empItemList.add("Acer laptop");
			empItemList.add("Laptop charger");
		} else if (empName.trim().equalsIgnoreCase("Yash")) {
			empItemList.add("iphone 13");
			empItemList.add("mobile charger");
			empItemList.add("headphone");
		}
		return empItemList;
	}

	public static void main(String[] args) {
		Application ap = new Application();
//		ArrayList<String> menuList = ap.getPageMenuLinks("homee");
//		System.out.println(menuList);
//		String[] devices = ap.getEmpDevicesList("YASH");
//		for (String e : devices) {
//			System.out.println(e);
//		}
		ArrayList<String>deviceList = ap.getNewEmpList("Wajid");
		System.out.println(deviceList);
	}
}
