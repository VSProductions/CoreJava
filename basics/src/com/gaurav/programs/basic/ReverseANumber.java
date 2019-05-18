package com.gaurav.programs.basic;

public class ReverseANumber {

	public static void main(String[] args) {

		long num = 123;
		long revNum = 0;

		do {

			long remainder = num % 10;
			revNum = revNum * 10 + remainder;
			num = num / 10;
		} while (num != 0);

		System.out.println("Reversed Number is " + revNum);

	}

}
