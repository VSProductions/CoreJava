package com.gaurav.javafromnotes.classesandobjects.singleton;

class BillPughSingleton {

	private static class BillPughSingletonHolder {
		public static BillPughSingleton billPughSingletonInstance = new BillPughSingleton();
	}
	
	String string;
	int randomNum;

	private BillPughSingleton() {
		string = "string in classic singleton class";
		randomNum = 10;
	}

	public static BillPughSingleton getInstance() {
		return BillPughSingletonHolder.billPughSingletonInstance;
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

public class BillPughSingletonTest {

	public static void main(String[] args) {

		BillPughSingleton BillPughSingleton1 = BillPughSingleton.getInstance();
		BillPughSingleton1.displayData();

		BillPughSingleton BillPughSingleton2 = BillPughSingleton.getInstance();
		BillPughSingleton2.displayData();

		BillPughSingleton1.setRandomNum(20); // BillPughSingleton1 set new value for random number
		BillPughSingleton2.displayData(); // BillPughSingleton2 shows altered data

	}

}
