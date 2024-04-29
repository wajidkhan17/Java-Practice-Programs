package javasessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Nidhi");
		empList.add("Sachin");
		empList.add("Saurabh");
		empList.add("Pooja");
		empList.add("Tom");
		empList.add("Peter");
		// To get the size of Array list
		System.out.println(empList.size());
		// Duplicate value can be store again and assign new PC
		empList.add("Nidhi");
		System.out.println(empList.size());
//		empList.add(null);
//		System.out.println(empList.size());
		empList.add(1, "Naveen");
		System.out.println(empList.size());
		System.out.println(empList.get(0));
		empList.add(8, "Lisa"); // Index out of bound, its continuous memory allocation
		System.out.println(empList.size());
		System.out.println(empList.remove(0)); // Nidhi will be removed
		System.out.println(empList);
		System.out.println(empList.size());
		System.out.println("---------------------------------");
		ArrayList<String> stList = new ArrayList<String>();
		stList.add("Nidhi");
		stList.add("Sachin");
		stList.add("Saurabh");
		stList.add("Pooja");
		stList.add("Tom");
		stList.add("Peter");
		stList.add("Nidhi");
		for (int i = stList.size() - 1; i >= 0; i--) {
			System.out.println(stList.get(i));
		}
		System.out.println("------------------------");
		
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("Ravi");
		userList.add("Suman");
		userList.add("Rahul");
		
		userList.addAll(stList);
		System.out.println(userList);
		
		System.out.println("------------------------");
		
//		Collections.reverse(stList);
//		System.out.println(stList);
		Collections.swap(stList, 0, 1);
		System.out.println(stList);
		for (String e : stList) {
			System.out.println(e);
			if (e.equals("Saurabh")) {
				System.out.println("100 Marks");
				break;
			}
		}
		System.out.println("------------------------");
		System.out.println(stList.contains("Tom"));
		if (stList.contains("Tom")) {
			System.out.println("Test case is Pass");
		} else {
			System.out.println("Test case is Fail");
		}
	}
}
