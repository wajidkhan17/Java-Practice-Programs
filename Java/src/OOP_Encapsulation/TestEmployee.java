package OOP_Encapsulation;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Tom");
		System.out.println(e1.getName());
		
		e1.setAge(25);
		System.out.println(e1.getAge());
		System.out.println("--------------------------");
		Loginpage lp = new Loginpage();
		lp.setUn("Wajid");
		System.out.println(lp.getUn());
	}
}
