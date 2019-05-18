package com.gaurav.javafromnotes.fundamentalclasses;

public class GarbageCollector {

	private int a = 1, b = 2;
	static int count;

	public static void main(String[] args) {

		GarbageCollector collector1, collector2, collector3;
		collector1 = new GarbageCollector();
		collector2 = new GarbageCollector();
		collector3 = new GarbageCollector();

		collector1 = collector3;
		collector2 = collector3;
		
		System.gc();
		
		System.out.println(count);

	}

	public void finalize() {
		count++;
	}

}
