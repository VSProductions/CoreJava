package com.gaurav.javafromnotes.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("C");
		lhs.add("C++");
		lhs.add("Java");
		lhs.add("Oracle");
		lhs.add("PHP");
		lhs.add("AJAX");
				
		System.out.print("Linked HashSet items : " + lhs); //predictable, maintains order of insertion
	}

}
