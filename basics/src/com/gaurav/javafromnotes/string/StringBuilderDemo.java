package com.gaurav.javafromnotes.string;

public class StringBuilderDemo {
	public static void main(String args[]) {
		StringBuilder builder = new StringBuilder("gaurav");
		builder.append(" singh");
		System.out.println(builder);
		
		String string = new String("gaurav singh");
		System.out.println(string.equals(builder));
		
		StringBuffer sbf = new StringBuffer();
	}
}
