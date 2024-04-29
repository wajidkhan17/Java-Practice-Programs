package AccessModifies;

public class BMW extends Car{
	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.name = "BMW";
		b.color = "white";
		b.licenseumber = "75674564";
	//	b.price iss private so can't be use in subclass. 
	}
}
