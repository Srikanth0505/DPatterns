package java.designpattern.abstractFactoryDP;

public class LoanFactory extends AbstarctFactory {

	public Bank getBank(String bank) {
		return null;
	}
	@Override
	public Loan GetLoan(String loan) {
		if (loan == null) {
			return null;
		}
		if (loan.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		} else if (loan.equalsIgnoreCase("Personal")) {
			return new PersonalLoan();
		} else if (loan.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}
		return null;
	}

}
