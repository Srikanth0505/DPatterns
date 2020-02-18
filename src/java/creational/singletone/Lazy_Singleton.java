package java.creational.singletone;

public class Lazy_Singleton {

	// Thread Synchronized Java implementation of
	// singleton design pattern

	private static Lazy_Singleton obj;

	private Lazy_Singleton() {
	}

	// Only one thread can execute this at a time
	public static synchronized Lazy_Singleton getInstance() {      //--> Synchronized method
		if (obj == null)
			obj = new Lazy_Singleton();         //--> Lazy Object
		return obj;
	}
}
