package enumconcept;

public class BrowserUtils {
	public static void main(String[] args) {
	
		Browser browser = Browser.CHROME;
		
		if (browser == Browser.CHROME) {
			System.out.println("launch chrome");
		}
		
		Enviroment env = Enviroment.QA;
		System.out.println(env.getEnvValue());
	}
}
