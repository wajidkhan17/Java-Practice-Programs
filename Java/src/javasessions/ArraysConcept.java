package javasessions;

import java.util.Arrays;

public class ArraysConcept {
	public static void main(String[] args) {
		// Two limitations--
		// 1. Size is fixed: Static Array, To overcome this we use ArrayList
		// 2. Similar type of data: To overcome this we use object Array(Static)
		// Array Literals: Static Array
		// Ex: int marks [] = {0,1,2,3,4,5}
		int i[] = new int[4];
//		int li = 0;
//		int hi = 3;
		System.out.println(i.length);
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[0]);
		System.out.println(i[3]);
		System.out.println(i[1] + i[2]);
		// System.out.println(i[4]); //Index out of bound exception
//		System.out.println(i[-1]); //Index out of bound exception
		int k[] = new int[3];
		k[0] = 100;
		k[2] = 300;
		System.out.println(k[0]); // o/p would be 0 (Default values of integers
		System.out.println(k[2]); // o/p would be 0 (Default values of integers
		int marks[] = new int[4];
		marks[0] = 100;
		marks[1] = 200;
		marks[2] = 300;
		marks[3] = 400;
		// To print all the values of array marks
		for (int j = 0; j <= marks.length - 1; j++) {
			System.out.println(marks[j]);
		}
		// Other approach to print Arrays values
		System.out.println(Arrays.toString(marks));
		System.out.println("---------------------------------");
		// String Array
		String[] employee = new String[5];
		employee[0] = "Chetan";
		employee[1] = "Ravi";
		employee[2] = "Tom";
		employee[3] = "Peter";
		employee[4] = "Vineeta";
		// For each loop
		for (String e : employee) {
			System.out.println(e);
		}
		System.out.println("---------------------------------");
		for (int k1 = 0; k1 <= employee.length - 1; k1++) {
			if (employee[k1].equals("Tom")) {
				System.out.println("Hi");
				break;
			}
			System.out.println(employee[k1]);
		}
		System.out.println("---------------------------------");
		Object[] data = new Object[5];
		data[0] = "Tom";
		data[1] = 25;
		data[2] = 45.55;
		data[3] = 'm';
		data[4] = true;
		for (int k2 = 0; k2 <= data.length - 1; k2++) {
			System.out.println(data[k2]);
		}
	}
}
