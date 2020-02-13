package java.designpattern.abstractFactoryDP;

public class ICICIBank implements Bank {

	String BankName;

	public ICICIBank() {
		BankName = "ICICIBank";
	}

	@Override
	public String getBank() {
		return BankName;
	}

}
