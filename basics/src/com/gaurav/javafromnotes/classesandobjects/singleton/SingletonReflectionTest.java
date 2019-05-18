package com.gaurav.javafromnotes.classesandobjects.singleton;// ReflectionSingleton class 

import java.lang.reflect.Constructor;

class ReflectionSingleton {
	// public instance initialized when loading the class
	public static final ReflectionSingleton singletonInstance = new ReflectionSingleton();

	private ReflectionSingleton() {
		// private constructor
	}
}

public class SingletonReflectionTest {

	public static void main(String[] args) {
		ReflectionSingleton reflectionSingleton1 = ReflectionSingleton.singletonInstance;
		ReflectionSingleton reflectionSingleton2 = null;
		try {
			Constructor[] constructors = ReflectionSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the ReflectionSingleton pattern
				constructor.setAccessible(true);
				reflectionSingleton2 = (ReflectionSingleton) constructor.newInstance();
				break;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("reflectionSingleton1.hashCode():- " + reflectionSingleton1.hashCode());
		System.out.println("reflectionSingleton2.hashCode():- " + reflectionSingleton2.hashCode());
	}
}