package javasessions;
import java.util.ArrayList; 

public class ArrayListConcepts {
	public static void main(String[] args) {
		// Array list is default class in Java
		// Collections: Dynamic Array
		// Order/index based array list
		// Create the object of Array list
		// Default virtual capacity is always 10
		ArrayList ar = new ArrayList();
		// System.out.println(ar.get(0)); Index out of bound
		ar.add(100); // 0
		ar.add(200); // 1
		System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());
		ar.add(500);
		ar.add(600);
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(5));
		// System.out.println(ar.get(6)); Index out of bound
		// System.out.println(ar.get(-1)); Index out of bound
		System.out.println("---------------------------------");
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		// Virtual capacity will be 5 here
		ar1.add(100);
		ar1.add(200);
		ar1.add(300);
		ar1.add(400);
		ar1.add(500);
		System.out.println(ar1.size());
		ar1.add(600);
		System.out.println(ar1.size());
		System.out.println(ar1);
		// To print all the values
		for (int i = 0; i <= ar1.size() - 1; i++) {
			System.out.println(ar1.get(i));
		}
		// To print all the values with for each loop
		for (Integer e : ar1) {
			System.out.println(e);
		}
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Nidhi");
		nameList.add("Sachin");
		nameList.add("Saurabh");
		nameList.add("Pooja");
		System.out.println(nameList);
		System.out.println("-------------------------------------");
		// for each loop
		for (String e : nameList) {
			System.out.println(e);
		}
		// generic
		ArrayList<Object> empdataList = new ArrayList<Object>();
		empdataList.add("Tom");
		empdataList.add(20);
		empdataList.add(12.33);
		empdataList.add(true);
		empdataList.add('m');
		System.out.println(empdataList.size());
		for (int i = 0; i <= empdataList.size() - 1; i++) {
			System.out.println(empdataList.get(i));
		}
		System.out.println("---------------------------------");
		for (Object e : empdataList) {
			System.out.println(e);
		}
		System.out.println("---------------------------------");
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Nidhi");
		empList.add("Sachin");
		empList.add("Saurabh");
		empList.add("Pooja");
		empList.add("Tom");
		empList.add("Peter");
		for (String e : empList) {
			System.out.println(e);
			if (e.equals("Pooja")) {
				System.out.println("Give 50% Bnus");
				break;
			}
		}
	}
}
