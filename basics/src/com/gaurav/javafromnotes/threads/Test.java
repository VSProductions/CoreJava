package com.gaurav.javafromnotes.threads;

class ThreadExtender extends Thread {
	public void run() {
		System.out.println("Hello from thread extending class");
	}
}

class RunnableImplementer implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello from runable Implementing class");
	}

}

public class Test {

	public static void main(String[] args) {
		ThreadExtender extender = new ThreadExtender();
		extender.run();
		
		Thread thread = new Thread(new RunnableImplementer());
		thread.run();
	}

}
