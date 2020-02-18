package java.creational.singletone;

public class Double_Checked_Locking_Singleton {

	// Double Checked Locking based Java implementation of
	// singleton design pattern

	private volatile static Double_Checked_Locking_Singleton obj;

	private Double_Checked_Locking_Singleton() {
	}

	public static Double_Checked_Locking_Singleton getInstance() {
		if (obj == null) {
			// To make thread safe
			synchronized (Double_Checked_Locking_Singleton.class) {
				// check again as multiple threads
				// can reach above step
				if (obj == null) {

					obj = new Double_Checked_Locking_Singleton();
				}
			}
		}
		return obj;
	}
}
