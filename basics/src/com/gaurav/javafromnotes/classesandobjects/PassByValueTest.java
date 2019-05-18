package com.gaurav.javafromnotes.classesandobjects;

import java.util.Arrays;

class Record {
	int n;
}

public class PassByValueTest {

	public static void main(String[] args) {
		Record record1 = new Record();
		record1.n = 20;
		System.out.println("n = " + record1.n);
		changeRecord(record1); // passed reference of record
		System.out.println("n = " + record1.n);
		
		int arr[] = new int[2];
		arr[0] = 2;
		arr[1] = 1;
		Arrays.sort(arr);
		System.out.println(arr);
	}

	private static void changeRecord(Record record1) {
		record1.n = 30;
	}

}