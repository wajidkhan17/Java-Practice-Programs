package OOP_Interface;

public class TestBank {
	public static void main(String[] args) {
		HdfcBank hb = new HdfcBank();
		hb.saving();
		IndianBanking ib = new HdfcBank();
		ib.AtmManagemnet();
		ib.credittcard();
	}
}
