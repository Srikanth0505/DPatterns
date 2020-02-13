package java.designpattern.abstractFactoryDP;

public class SBIBank implements Bank {

	String BankName;

	public SBIBank() {
		BankName = "SBIBank";
	}

	@Override
	public String getBank() {
		return BankName;
	}

}
