package com.gaurav.programs.strings;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
	String s = "Hello World is the worst way of programming";
	
	s = s.replaceAll("\\s", "");
	
	System.out.println("After removing all white spaces : " + s);

	}

}
