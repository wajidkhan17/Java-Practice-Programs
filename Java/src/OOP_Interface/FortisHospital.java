package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
	
	static int min_fee = 20;
	// US
	@Override
	public void cardioServices() {
		System.out.println("FH -- cardio services");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");
	}

	@Override
	public void phisioServices() {
		System.out.println("FH -- phisioServices");
	}

	// uk
	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
	}

	// uk
	@Override
	public void entServices() {
		System.out.println("FH -- entServices");
	}

	// india
	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
	}

	// Common method in all the interfaces
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}

	// individual methods
	public void medicalTraining() {
		System.out.println("FH -- medicalTraining");
	}

	public void medicalInsurance() {
		System.out.println("FH -- medicalInsurance");
	}

	@Override
	public void medicalResearch() {
		System.out.println("medical FH -- medicalResearch");
	}

	public static void billing() {
		System.out.println("FH -- billing");
	}

	@Override
	public void medicalDevelopment() {
		// TODO Auto-generated method stub
		USMedical.super.medicalDevelopment();
	}

	@Override
	public void covid19Vaccination() {
		System.out.println("FH -- covid19Vaccination");
	}
//	@Override
//	public void medicalDevelopment() {
//		System.out.println("FH -- medicalDevelopment");
//	}
}
