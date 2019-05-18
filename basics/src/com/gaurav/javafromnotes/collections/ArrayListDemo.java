package com.gaurav.javafromnotes.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		
		System.out.println("Initial Size of arralist : " + al.size());
		
		al.add("C");
		al.add("C++");
		al.add("Java");
		al.add("Oracle");
		al.add("PHP");
		al.add(1,"AJAX");
		
		System.out.println("Size after addition : " + al.size());
		
		System.out.println("Contents of array list : " + al); //predictable because it maintains insertion order
		al.remove("PHP");
		al.remove(2);
		
		System.out.println("Size after deletion : " + al.size());
		
		for(String s : al) {
			System.out.println(s + " ");
		}
		
		System.out.println();
		
		System.out.println("al contains Java : " + al.contains("Java"));
		
		System.out.println("al position 2 : " + al.get(2));
		
		Iterator<String> i = al.iterator();
		System.out.println("Iterating arralist with iterator");
		while(i.hasNext()) {
			System.out.print(i.next() + " | ");
			
		}
		
		

	}

}
