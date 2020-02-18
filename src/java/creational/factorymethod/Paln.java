package java.creational.factorymethod;

public abstract class Paln {
	
	protected Double rate;
	
	abstract void getRate();
	
	public void getCalculateBills(int units) {
		
		System.out.println("Total Bill:"+rate*units);
	}
}
