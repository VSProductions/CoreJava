package com.gaurav.javafromnotes.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DetermineIfInputIsCharacter {
	public static void main(String args[]) throws IOException {

		char ch;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a character");
		ch = (char) br.read();

		if (Character.isLetter(ch)) {
			System.out.println("The character is a letter");
		} else if (Character.isDigit(ch)) {
			System.out.println("The character is a digit");
		} else
			System.out.println("Some other character");

	}
}
