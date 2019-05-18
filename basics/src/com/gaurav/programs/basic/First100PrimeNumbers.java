package com.gaurav.programs.basic;

import java.util.Scanner;

public class First100PrimeNumbers {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (checkPrime(num))
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");*/

		 printFirstNPrimeNumbers();

	}

	private static void printFirstNPrimeNumbers() {
		int n = 100, firstNPrimeNumersCounter = 0, testNumber = 2;
		while (firstNPrimeNumersCounter <= n) {
			if (checkPrime(testNumber)) {
				System.out.println(testNumber);
				firstNPrimeNumersCounter++;
			}
			testNumber++;

		}
	}

	private static boolean checkPrime(int num) {

		if (num == 1 || num == 0)
			return false;
		else {
			for (int i = 2; i <= num/2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}

		return true;

	}
}
