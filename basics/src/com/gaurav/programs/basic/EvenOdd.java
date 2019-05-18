package com.gaurav.programs.basic;

public class EvenOdd {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			checkEvenOdd(i);
		}
	}

	private static void checkEvenOdd(int num) {

		if ((num % 2) == 0)
			System.out.println("The number " + num + " is even");
		else
			System.out.println("The number " + num + " is odd");
	}

}
