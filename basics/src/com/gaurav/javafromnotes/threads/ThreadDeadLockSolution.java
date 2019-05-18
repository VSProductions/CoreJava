package com.gaurav.javafromnotes.threads;

public class ThreadDeadLockSolution {

	public static void main(String[] args) {
		Object train = new Object();
		Object compartment = new Object();

		BookTrainTicket bookTrainTicket = new BookTrainTicket(train, compartment);
		CancelTrainTicket cancelTrainTicket = new CancelTrainTicket(train, compartment);

		Thread th1 = new Thread(bookTrainTicket);
		Thread th2 = new Thread(cancelTrainTicket);

		th1.start();
		th2.start();
	}

}

class BookTrainTicket implements Runnable {
	Object train, compartment;

	BookTrainTicket(Object train, Object compartment) {
		this.train = train;
		this.compartment = compartment;
	}

	@Override
	public void run() {

		synchronized (train) {
			System.out.println("BookTrainTicket locked on train");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

			System.out.println("BookTrainTicket now waiting to lock on compartment");

			synchronized (compartment) {
				System.out.println("BookTrainTicket locked on compartment");
			}
		}

	}

}

class CancelTrainTicket implements Runnable {
	Object train, compartment;

	CancelTrainTicket(Object train, Object compartment) {
		this.train = train;
		this.compartment = compartment;
	}

	@Override
	public void run() {

			
			synchronized (train) {
				System.out.println("CancelTrainTicket locked on train");
			

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

			System.out.println("CancelTrainTicket now waiting to lock on compartment");

			synchronized (compartment) {
				System.out.println("CancelTrainTicket locked on compartment");
			
			}

		}

	}

}