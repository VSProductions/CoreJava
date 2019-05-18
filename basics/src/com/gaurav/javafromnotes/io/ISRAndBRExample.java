package com.gaurav.javafromnotes.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISRAndBRExample {

	public static void main(String args[]) throws IOException {

		String input;
		int number;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter a number");
		input = br.readLine();
		number = Integer.parseInt(input);
		System.out.println("The number enetered is " + number);

	}

}
