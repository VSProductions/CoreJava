package com.gaurav.javafromnotes.fundamentalclasses;

public class EqualsAndHashCodeExample {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(10);
		MyClass obj2 = new MyClass(10);
		Integer obj3 = new Integer(10);
		MyClass obj4 = new MyClass(10);

		if (obj1.equals(obj1))
			System.out.println("obj1 is equal to itself Reflexivity. \n\tHashcode of obj1 " + obj1.hashCode());
		else
			System.out.println("obj1 and obj1 are not equal");

		if (obj1.equals(obj3))
			System.out.println("obj1 and obj3 are equal \n\tHashcode of obj1=" + obj1.hashCode() + "\tHashcode of obj3=" + obj3.hashCode());
		else
			System.out.println("obj1 and obj3 are not equal");

		if (obj1.equals(obj2) && obj2.equals(obj1))
			System.out.println("obj1 and obj2 are equal shows Symmetry \n\tHashcode of obj1=" + obj1.hashCode() + "\tHashcode of obj2=" + obj2.hashCode());
		else
			System.out.println("obj1 and obj2 are not equal");

		if (obj1.equals(obj2) && obj2.equals(obj4) && obj1.equals(obj4))
			System.out.println("obj1, obj2 and obj4 are equal shows Transitivity \n\tHashcode of obj1=" + obj1.hashCode() + "\tHashcode of obj2=" + obj2.hashCode() + "\t Hashcode of obj4=" + obj4.hashCode());
		else
			System.out.println("obj1, obj2 and obj4 are not equal");
		
		System.out.println();

	}
}