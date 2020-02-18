package java.creational.singletone;

public class Eager_Singleton {

	// Eager Instantiation

	// Static initializer based Java implementation of
	// singleton design pattern

	private static Eager_Singleton obj = new Eager_Singleton();  // --> eager object creation

	private Eager_Singleton() {
	}

	public static Eager_Singleton getInstance() {
		return obj;
	}
}
