package OOP_Interface;

public class HdfcBank extends Banking implements USBanking, UKBanking, IndianBanking {

	@Override
	public void AtmManagemnet() {
		System.out.println("Hdfc -- Atm Management");
		
	}

	@Override
	public void credittcard() {
		System.out.println("Hdfc -- credittcard");
		
	}

	@Override
	public void loanManagemnet() {
		System.out.println("Hdfc -- loanManagemnet");
		
	}

	@Override
	public void debitcard() {
		System.out.println("Hdfc -- debitcard");
		
	}

	@Override
	public void accountManagemnet() {
		System.out.println("Hdfc -- accountManagemnet");
		
	}

	@Override
	public void transation() {
		System.out.println("Hdfc -- transation");
		
	}
}
