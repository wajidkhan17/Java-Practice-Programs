package OOP_Encapsulation;

public class User {
	private String name;
	private int age;
	private boolean isActive;
	
	//creat a user and get the user info but the update is not allowed -- const, getter
	//create a user and get the user info and also the update allowed -- const, getter and setter

	public User(String name, int sharePrice, boolean isActive) {
		this.name = name;
		this.age = sharePrice;
		this.isActive = isActive;
	}

	// getter and setter
	public String getName() {
		return name;
	}
	//Setter is not requied because the costructor is working as setter	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
