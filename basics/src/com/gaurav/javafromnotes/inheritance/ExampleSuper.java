package com.gaurav.javafromnotes.inheritance;

class SuperClass {
	int i = 10, j = 20;

	SuperClass() {
		System.out.println("DC of SuperClass");
	}

	SuperClass(int x) {
		System.out.println("PC of SuperClass");
	}

	public int getI() {
		return this.i;
	}

	public int add() {
		System.out.println("Subclass add method");
		return i + j;
	}

}

class SubClass extends SuperClass {

	public int getI() {
		return i;
	}

	public int add() {
		System.out.println("Subclass add method");
		return i + j;
	}

	SubClass() {
		// super();
		System.out.println("DC of SubClass");
	}

	SubClass(int value) {

		System.out.println("PC of SubClass");
	}
}

public class ExampleSuper {

	public static void main(String[] args) {
		/*
		 * System.out.println("1"); SuperClass superClass = new SuperClass();
		 * System.out.println("2"); SubClass subClass = new SubClass();
		 * System.out.println("3"); SubClass subClass2 = new SubClass(5);
		 */

		SuperClass poly = new SubClass();
		System.out.println("i = " + poly.i);

		System.out.println(poly.add());

	}

}
