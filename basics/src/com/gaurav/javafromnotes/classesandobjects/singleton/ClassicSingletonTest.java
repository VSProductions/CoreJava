package com.gaurav.javafromnotes.classesandobjects.singleton;

class ClassicSingleton {
	private static ClassicSingleton classicSingletonInstance = null;
	String string;
	int randomNum;
	
	private ClassicSingleton() {
		string = "string in classic singleton class";
		randomNum = 10;
	}

	public static ClassicSingleton getInstance() {
		if (classicSingletonInstance == null)
			classicSingletonInstance = new ClassicSingleton();

		return classicSingletonInstance;
	}
	
	public void displayData() {
		System.out.println(string + " with random number " + randomNum);
	}

	public void setString(String string) {
		this.string = string;
	}

	public void setRandomNum(int randomNum) {
		this.randomNum = randomNum;
	}
}

public class ClassicSingletonTest {

	public static void main(String[] args) {

		ClassicSingleton classicSingleton1 = ClassicSingleton.getInstance();
		classicSingleton1.displayData();
		
		ClassicSingleton classicSingleton2 = ClassicSingleton.getInstance();
		classicSingleton2.displayData();
		
		
		classicSingleton1.setRandomNum(20); // classicSingleton1 set new value for random number
		classicSingleton2.displayData();    // classicSingleton2 shows altered data
		
	}

}
