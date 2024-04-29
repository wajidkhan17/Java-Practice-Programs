package enumconcept;

public enum Enviroment {
	
	QA("qa"), STAGE("stage"), DEV("dev"),UAT("uat"),PROD("prod");
	
	String envName;
	
	Enviroment(String envName) {
		this.envName = envName;
	}
	
	public String getEnvValue () {
		return this.envName;
	}
}
