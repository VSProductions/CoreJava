package com.gaurav.programs.basic;

public class AVGUsingArray {

	public static void main(String[] args) {

		int array[] = new int[]{1,2,3,4,5};
		int avg = 0, sum = 0;
		
		for(int element : array) {
			sum += element;
		}
		
		avg = sum/array.length;
		System.out.println("Average of array whose sum is " + sum + " is " + avg);

	}

}
