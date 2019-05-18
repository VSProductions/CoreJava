package com.gaurav.javafromnotes.inheritance;

class Parent {
	Parent() {
		System.out.println("DC of SuperClass");
	}
	
	Parent(int value) {
		System.out.println("PC of SuperClass");
	}
}

class Child extends SuperClass {
	Child() {
		// super();
		this(5);
		System.out.println("DC of SubClass");
	}

	Child(int value) {
		//this();
		System.out.println("PC of SubClass");
	}
}

public class ExampleThisAndSuper {

	public static void main(String[] args) {
		
		Child child = new Child();
		
	}

}
