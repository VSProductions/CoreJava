package com.gaurav.javafromnotes.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicArrayExample {
	public static void main(String args[]) throws IOException {

		// int a[] = { 10, 12, 14 };

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int a[] = new int[3];
		System.out.println("Enter the array elements");
		for (int i = 0; i < 3; i++) {
			String temp;
			temp = br.readLine();
			a[i] = Integer.parseInt(temp);
		}
		int arraySum = addArrayElements(a);
		System.out.println("The sum of the array is " + arraySum);

	}

	private static int addArrayElements(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
