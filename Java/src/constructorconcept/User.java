package constructorconcept;

public class User {
	String name;
	String id;
	int age;
	boolean isActive;

	public User(String id, boolean isActive) {
		this.id = id;
		this.isActive = isActive;
	}

	public User(String name, String id, int age, boolean isActive) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.isActive = isActive;
	}

	public User(String name, String id, boolean isActive) {
		this.name = name;
		this.id = id;
		this.isActive = isActive;
	}

	public User(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public User(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		User u1 = new User("101", "Tom");
		System.out.println(u1.id + " " + u1.name);
		User u2 = new User("102", "Peter", 25);
		User u3 = new User("103", "Wajid", true);
		User u4 = new User("104", "Ravi", 20, false);
	}
}
