package OOP_Abstract;

public abstract class Page {
	
	String name;
	int timeOut;
	static int price = 10;
	
	// to mentione abstract method, abstrct keyword is required
	//0 to 100% abstration
	//we can have only non abc.. method-->
	//can not create the object abstract class
	//but const... are allowed and it will be called when you creat the object of the child class
	//if the child and parent class both have constructor defined then java first call the parents call const 
	
	public Page() {
		System.out.println("page... const...");
	}
	
	public abstract void title();

	public abstract void url();

	public abstract void header();

	public void loadingPage() {
		System.out.println("page -- loading..." + 20);
	}

	public final void logo() {
		System.out.println("page -- logo");
	}

	public static void footer() {
		System.out.println("page -- footers");
	}
	
	private void loadHtml() {
		System.out.println("page -- load html");
	}
	
	public void load() {
		loadHtml();
	}
}
