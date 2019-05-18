package com.gaurav.javafromnotes.threads.creation;

//Thread as a separate concrete class
class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Keep Some task here......");
	}
}

// Usage Class
class UsageClassOne {
	void method() {
		// Using the thread and it's task

		MyThread t = new MyThread();
		t.start();
	}
}

// Usage Class
class UsageClassTwo {
	void method() {
		// Using the thread and it's task

		MyThread t = new MyThread();
		t.start();
	}
}

public class ThreadConcrete {
	public static void main(String args[]) {
		UsageClassOne classOne = new UsageClassOne();
		UsageClassTwo classTwo = new UsageClassTwo();

		classOne.method();
		classTwo.method();
	}
}
