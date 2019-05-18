package com.gaurav.javafromnotes.classesandobjects.singleton;

class ClassicSingletontonSynchronized {
	private static ClassicSingletontonSynchronized ClassicSingletontonSynchronizedInstance = null;
	String string;
	int randomNum;

	private ClassicSingletontonSynchronized() {
		string = "string in classic singleton class";
		randomNum = 10;
	}

	public static synchronized ClassicSingletontonSynchronized getInstance() { // complete method is synchronized
		if (ClassicSingletontonSynchronizedInstance == null)
			ClassicSingletontonSynchronizedInstance = new ClassicSingletontonSynchronized();

		return ClassicSingletontonSynchronizedInstance;
	}

	public static ClassicSingletontonSynchronized getInstance2() { // only critical code is synchronized
		synchronized (ClassicSingletontonSynchronized.class) {
			if (ClassicSingletontonSynchronizedInstance == null)
				ClassicSingletontonSynchronizedInstance = new ClassicSingletontonSynchronized();
		}

		return ClassicSingletontonSynchronizedInstance;
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

public class ClassicSingletontonSynchronizedTest {

	public static void main(String[] args) {

		ClassicSingletontonSynchronized ClassicSingletontonSynchronized1 = ClassicSingletontonSynchronized
				.getInstance();
		ClassicSingletontonSynchronized1.displayData();

		ClassicSingletontonSynchronized ClassicSingletontonSynchronized2 = ClassicSingletontonSynchronized
				.getInstance();
		ClassicSingletontonSynchronized2.displayData();

		ClassicSingletontonSynchronized1.setRandomNum(20); // ClassicSingletontonSynchronized1 set new value for random
															// number
		ClassicSingletontonSynchronized2.displayData(); // ClassicSingletontonSynchronized2 shows altered data

	}

}
