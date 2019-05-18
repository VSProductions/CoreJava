package com.gaurav.javafromnotes.threads;

public class ThreadDeadLockDemo {

	public static void main(String[] args) {
		Object train = new Object();
		Object compartment = new Object();

		BookTrainTicketDeadLock BookTrainTicketDeadLock = new BookTrainTicketDeadLock(train, compartment);
		CancelTrainTicketDeadLock CancelTrainTicketDeadLock = new CancelTrainTicketDeadLock(train, compartment);

		Thread th1 = new Thread(BookTrainTicketDeadLock);
		Thread th2 = new Thread(CancelTrainTicketDeadLock);

		th1.start();
		th2.start();
	}

}

class BookTrainTicketDeadLock implements Runnable {
	Object train, compartment;

	BookTrainTicketDeadLock(Object train, Object compartment) {
		this.train = train;
		this.compartment = compartment;
	}

	@Override
	public void run() {

		synchronized (train) {
			System.out.println("BookTrainTicketDeadLock locked on train");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

			System.out.println("BookTrainTicketDeadLock now waiting to lock on compartment");

			synchronized (compartment) {
				System.out.println("BookTrainTicketDeadLock locked on compartment");
			}
		}

	}

}

class CancelTrainTicketDeadLock implements Runnable {
	Object train, compartment;

	CancelTrainTicketDeadLock(Object train, Object compartment) {
		this.train = train;
		this.compartment = compartment;
	}

	@Override
	public void run() {

			
		synchronized (compartment) {
			System.out.println("CancelTrainTicketDeadLock locked on compartment");
			

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

			System.out.println("CancelTrainTicketDeadLock now waiting to lock on train");

			synchronized (train) {
				System.out.println("CancelTrainTicketDeadLock locked on train");
			
			}

		}

	}

}