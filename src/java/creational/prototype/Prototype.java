package java.creational.prototype;

//Prototype Design Pattern with example  
//of a ColorStore class to store existing objects.

/* 
  	The prototype pattern is a creational design pattern.Prototype patterns is required,
	when object creation is time consuming,and costly operation,
	so we create object with existing object itself.One of the best available way 
	to create object from existing objects are clone()method.Clone is the simplest 
	approach to implement prototype pattern.However,it is your call to decide 
	how to copy existing object based on your business model.
	 */

import java.util.HashMap;
import java.util.Map;

abstract class Color implements Cloneable {

	protected String colorName;

	abstract void addColor();

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}

class blueColor extends Color {
	public blueColor() {
		this.colorName = "blue";
	}

	@Override
	void addColor() {
		System.out.println("Blue color added");
	}

}

class blackColor extends Color {

	public blackColor() {
		this.colorName = "black";
	}

	@Override
	void addColor() {
		System.out.println("Black color added");
	}
}

class ColorStore {

	private static Map<String, Color> colorMap = new HashMap<String, Color>();

	static {
		colorMap.put("blue", new blueColor());
		colorMap.put("black", new blackColor());
	}

	public static Color getColor(String colorName) {
		return (Color) colorMap.get(colorName).clone();
	}
}

//Driver class 
class Prototype {
	public static void main(String[] args) {
		ColorStore.getColor("blue").addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("black").addColor();
		ColorStore.getColor("blue").addColor();
	}
}