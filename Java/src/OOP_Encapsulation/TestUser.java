package OOP_Encapsulation;

public class TestUser {
	public static void main(String[] args) {
		// Creaing the object first time --Post
		User u1 = new User("Nikita", 26, true);
		// Retrive -- get
		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		System.out.println(u1.isActive());
		// update -- Put/Patch
		u1.setActive(true);
		u1.setName("Nikeeta Kapoor");
		System.out.println("---------------");
		System.out.println(u1.getName());
		System.out.println(u1.getAge());
		System.out.println(u1.isActive());
		System.out.println("-------------------");
		Login l = new Login("wajid", "wk123");
		System.out.println(l.getUsername() + " " + l.getPassword());
		Login l1 = new Login("Anu", "aj123");
		System.out.println(l1.getUsername() + " " + l1.getPassword());
	}
}
