package com.gaurav.javafromnotes.threads;

class Reserve implements Runnable {

	int available = 1;
	int wanted;

	public Reserve(int wanted) {
		this.wanted = wanted;
	}

	public void run() {
		System.out.println("Available = " + available);

		if (available >= wanted) {
			System.out.println(wanted + " Berths Reserved for " + Thread.currentThread().getName());

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			available -= wanted;
		} else
			System.out.println("Sorry No Berths available");

	}

}

public class ThreadsRaceConditionDemo {

	public static void main(String[] args) {

		Reserve obj1 = new Reserve(1);

		Thread t1 = new Thread(obj1, "Ravi");
		Thread t2 = new Thread(obj1, "Anil");

		t1.start();
		t2.start();

	}

}
