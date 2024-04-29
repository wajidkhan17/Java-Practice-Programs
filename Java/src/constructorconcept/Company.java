package constructorconcept;

//const: looks like a function but not a function
//const: can not have a return type
//const: name will be same as class name, but function name can be any thing
//const: const called when we create the object but function called with the object reference
//const: is used to initilize the class variable with this keyword
//const: is used to restrict of creatig the unnecessary objects and should not have the business logic
//business logic should be written in the method/function

public class Company {
	String name;
	int empCount;
	String hq;
	String ceo;
	double sharePrice;

	public Company(String name, int empCount, String hq, String ceo, double sharePrice) {
		this.name = name;
		this.empCount = empCount;
		this.hq = hq;
		this.ceo = ceo;
		this.sharePrice = sharePrice;
	}

	public Company(String name, String hq) {
		this.name = name;
		this.hq = hq;
	}

	public Company(String name, int empCount, double shareprice) {
		this.name = name;
		this.empCount = empCount;
		this.sharePrice = shareprice;
	}

	public Company(String name) {
		this.name = name;
	}
}
