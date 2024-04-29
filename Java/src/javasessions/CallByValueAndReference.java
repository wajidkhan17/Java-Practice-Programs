package javasessions;

public class CallByValueAndReference {
	
	String name;
	int age;
	public int add(int a, int b) {
		int z = a + b;
		return z;
	}
	
	public void getInfo(CallByValueAndReference t1) {
		System.out.println(t1.name +" "+ t1.age);
	}

	public static void main(String[] args) {
		CallByValueAndReference obj = new CallByValueAndReference();
		obj.add(10, 20); // call by value
		obj.add(20, 40); // call by value
		obj.name= "Tom";
		obj.age = 30;
		obj.getInfo(obj);  //Call by reference
	}
}
