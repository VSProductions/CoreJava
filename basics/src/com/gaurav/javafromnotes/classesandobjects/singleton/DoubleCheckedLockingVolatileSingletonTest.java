package com.gaurav.javafromnotes.classesandobjects.singleton;

class DoubleCheckedLockingVolatileSingleton {
	private volatile static DoubleCheckedLockingVolatileSingleton doubleCheckedLockingVolatileSingletonInstance;

	String string;
	int randomNum;

	private DoubleCheckedLockingVolatileSingleton() {
		string = "string in classic singleton class";
		randomNum = 10;
	}

	public static DoubleCheckedLockingVolatileSingleton getInstance() {
		if (null == doubleCheckedLockingVolatileSingletonInstance) {
			synchronized (DoubleCheckedLockingVolatileSingleton.class) {
				if (null == doubleCheckedLockingVolatileSingletonInstance)
					doubleCheckedLockingVolatileSingletonInstance = new DoubleCheckedLockingVolatileSingleton();
			}
		}

		return doubleCheckedLockingVolatileSingletonInstance;

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

public class DoubleCheckedLockingVolatileSingletonTest {

	public static void main(String[] args) {

		DoubleCheckedLockingVolatileSingleton DoubleCheckedLockingVolatileSingleton1 = DoubleCheckedLockingVolatileSingleton.getInstance();
		DoubleCheckedLockingVolatileSingleton1.displayData();

		DoubleCheckedLockingVolatileSingleton DoubleCheckedLockingVolatileSingleton2 = DoubleCheckedLockingVolatileSingleton.getInstance();
		DoubleCheckedLockingVolatileSingleton2.displayData();

		DoubleCheckedLockingVolatileSingleton1.setRandomNum(20); // DoubleCheckedLockingVolatileSingleton1 set new value for random number
		DoubleCheckedLockingVolatileSingleton2.displayData(); // DoubleCheckedLockingVolatileSingleton2 shows altered data

	}

}
