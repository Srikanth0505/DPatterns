package java.creational.abstractFactoryDP;

public class HDFCBank implements Bank{
	
	String BankName;

	public HDFCBank() {
		BankName="HDFCBank";
	}
	
	@Override
	public String getBank() {
		return BankName;
	}

}
