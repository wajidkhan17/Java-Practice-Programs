package constructorconcept;

import java.util.ArrayList;

public class Customer {
	String firstName;
	String lastName;
	boolean isprime;
	String phone;
	String address;
	String email;
	ArrayList<String> orderList;

	public Customer(String firstName, String phone, String email) {
		this.firstName = firstName;
		this.phone = phone;
		this.email = email;
	}

	public Customer(String firstName, String phone, String address, String email) {
		this.firstName = firstName;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public Customer(String firstName, boolean isprime, String phone, String email) {
		this.firstName = firstName;
		this.isprime = isprime;
		this.phone = phone;
		this.email = email;
	}

	public Customer(String firstName, String lastName, ArrayList<String> orderList) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.orderList = orderList;
	}

	public Customer(String firstName, String lastName, boolean isprime, String phone, String address, String email,
			ArrayList<String> orderList) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.isprime = isprime;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.orderList = orderList;
	}
}
