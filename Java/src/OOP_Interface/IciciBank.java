package OOP_Interface;

public class IciciBank implements USBanking, UKBanking, IndianBanking {

	@Override
	public void AtmManagemnet() {
		System.out.println("Icici -- Atm Management");
		
	}

	@Override
	public void credittcard() {
		System.out.println("Icici -- credittcard");
		
	}

	@Override
	public void loanManagemnet() {
		System.out.println("Icici -- loanManagemnet");
		
	}

	@Override
	public void debitcard() {
		System.out.println("Icici -- debitcard");
		
	}

	@Override
	public void accountManagemnet() {
		System.out.println("Icici -- accountManagemnet");
		
	}

	@Override
	public void transation() {
		System.out.println("Icici -- transation");
		
	}
}
