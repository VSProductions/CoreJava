package com.gaurav.javafromnotes.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class1 {

	public static void main(String[] args) throws IOException {

		int a;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s;
		
		System.out.println("Enter Value");
		s = br.readLine();
		//a = s; //Incompatible types
		a = Integer.parseInt(s);
		System.out.println("Entered Value = " + a);

	}

}
