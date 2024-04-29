package HashMap;

import java.util.HashMap;

public class HashMapConcept<K, V> {
	public static void main(String[] args) {
		// key value pair format <k,v>
		// does not maintain format
		// we can have a duplicate value but t always give the latest value
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		empMap.put("Tom", 100);
		empMap.put("Peter", 200);
		empMap.put("Lisa", 300);
		empMap.put("Ravi", 400);
		empMap.put("Naveen", 500);
		//null values store at 0 position
//		empMap.put(null, 600);
//		empMap.put("Naveen", 600);
//		System.out.println(empMap.get("Tom"));
//		System.out.println(empMap.get("Naveen"));
		empMap.forEach((a,j) -> System.out.println(a+ ":"+ j));
	}
}