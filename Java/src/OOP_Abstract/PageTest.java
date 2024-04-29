package OOP_Abstract;

public class PageTest {
	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.header();
		lp.loadingPage();
		lp.logo();
		Page.footer();
		LoginPage.footer();
		lp.doLogin("admin", "admin");
		lp.load();
		System.out.println(Page.price);
		System.out.println(LoginPage.price);
		System.out.println(lp.name);
		lp.name = "Wajid";
		System.out.println(lp.name);
		
		//top casting: parent class reference variable, child class object
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		p.logo();
		p.loadingPage();
		
	}
}
