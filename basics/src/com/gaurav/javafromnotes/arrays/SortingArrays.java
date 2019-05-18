package com.gaurav.javafromnotes.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) throws IOException {
		sortIntArray();
		sortStringArray();
	}

	private static void sortIntArray() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int a[] = new int[3];
		System.out.println("Enter the array elements");
		for (int i = 0; i < 3; i++) {
			String temp;
			temp = br.readLine();
			a[i] = Integer.parseInt(temp);
		}
		Arrays.sort(a);
		System.out.println("Sorted array elements");
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}

	}

	private static void sortStringArray() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String a[] = new String[3];
		System.out.println("Enter the array elements");
		for (int i = 0; i < 3; i++) {
			a[i] = br.readLine();
		}
		Arrays.sort(a);
		System.out.println("Sorted array elements");
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}

	}

}
