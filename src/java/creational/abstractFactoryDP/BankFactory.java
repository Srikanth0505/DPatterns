package java.creational.abstractFactoryDP;

public class BankFactory extends AbstarctFactory {

	@Override
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFCBank();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICIBank();
		} else if (bank.equalsIgnoreCase("SBI")) {
			return new SBIBank();
		}
		return null;
	}

	@Override
	Loan GetLoan(String Loan) {
		return null;
	}

}
