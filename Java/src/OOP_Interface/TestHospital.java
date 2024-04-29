package OOP_Interface;

public class TestHospital {
	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.entServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		fh.medicalResearch();
		fh.medicalDevelopment();
		fh.covid19Vaccination();
		//parent static value can be access by child class
		System.out.println(FortisHospital.min_fee);
		System.out.println(USMedical.min_fee);
		System.out.println("---------------");
		// top casting: child class object can be referred by parent interface variable
		// Can call only the methods coming from the interface
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.emergencyServices();
		us.neuroServices();
		us.neuroServices();
		System.out.println("---------------");
		USMedical.billing();
	}
}
