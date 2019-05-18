package com.gaurav.javafromnotes.fundamentalclasses;

public class MyClass {
	int x;

	public MyClass(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}

	@Override
	public int hashCode() {
		return x * 31 * 17;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MyClass))
			return false;
		MyClass myClass = (MyClass) obj;

		return (this.x == myClass.getX());
	}

}
