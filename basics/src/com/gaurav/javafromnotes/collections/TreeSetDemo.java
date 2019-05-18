package com.gaurav.javafromnotes.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("C");
		ts.add("C++");
		ts.add("Java");
		ts.add("Oracle");
		ts.add("PHP");
		ts.add("AJAX");
				
		System.out.print("Linked HashSet items : " + ts); //predictable, ascending order according to natural order
	}

}
