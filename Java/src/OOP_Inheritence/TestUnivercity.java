package OOP_Inheritence;

public class TestUnivercity {
	public static void main(String[] args) {
		Univercity u = new Univercity();
		u.courses();
		System.out.println("------------");
		
		TechUnivercity tu = new TechUnivercity();
		tu.courses();
		tu.enggCourse();
		tu.managementCourse();
		tu.pharmaCourse();
		System.out.println("------------");
		
		TechUnivercity tu1 = new IIMI();
		tu1.courses();
		tu1.enggCourse();
		tu1.managementCourse();
		tu1.pharmaCourse();
		System.out.println("------------");
		
		IIMI i = new IIMI();
		i.courses();
		i.enggCourse();
		i.managementCourse();
		i.pharmaCourse();
		i.bPharma();
		System.out.println("------------");
	}
}
