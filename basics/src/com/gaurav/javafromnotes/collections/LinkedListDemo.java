package com.gaurav.javafromnotes.collections;

import java.util.LinkedList;

public class LinkedListDemo {
 
	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("C");
		al.add("C++");
		al.addFirst("Java");
		al.addLast("Oracle");
		al.add("PHP");
		al.add(1,"AJAX");
		
		System.out.print("al : " + al + "\n");
		
		al.removeFirst();
		al.removeLast();
		
		System.out.print("al : " + al + "\n");

	}

}
