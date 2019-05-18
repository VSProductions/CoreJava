package com.gaurav.javafromnotes.classesandobjects.singleton;

enum SingletonEnum {
	INSTANCE;

	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

public class SingletonEnumTest {
	public static void main(String args[]) {
		SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
		SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;

		System.out.println("singletonEnum1.hashCode : " + singletonEnum1.hashCode());
		System.out.println("singletonEnum2.hashCode : " + singletonEnum2.hashCode());

		if (singletonEnum1.equals(singletonEnum2))
			System.out.println("Both are equal");

	}
}
