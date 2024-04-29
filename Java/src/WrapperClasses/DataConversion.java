package WrapperClasses;

public class DataConversion {
	
	
	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		//String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String y = "100A";
		String z = y.substring(0,3);
		y = y.substring(0, 3);
		System.out.println(z);
		int j1 = Integer.parseInt(y);
		int j = Integer.parseInt(z);
		System.out.println(j1+j+20);
		
		//int to string 
		int i1 = 500;
		String a = String.valueOf(i1);
		System.out.println(a+20);
		
		//double to string
		double d = 50.55;
		String i2 = String.valueOf(d);
		System.out.println(i2+20);
				
	}
}
