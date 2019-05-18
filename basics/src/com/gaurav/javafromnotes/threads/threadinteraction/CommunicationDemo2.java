package com.gaurav.javafromnotes.threads.threadinteraction;

class Producer2 implements Runnable {
	StringBuffer sb;

	Producer2() {
		sb = new StringBuffer();
	}

	@Override
	public void run() {
		synchronized (sb) {
			for (int i = 1; i <= 10; i++) {
				try {
					sb.append(i + " : ");
					Thread.sleep(100);
					System.out.println("Appending : " + i);
				} catch (InterruptedException e) {
				}
			}
			sb.notify();
		}

	}

}

class Consumer2 implements Runnable {
	Producer2 producer2;

	Consumer2(Producer2 Producer2) {
		this.producer2 = Producer2;
	}

	@Override
	public void run() {
		synchronized (producer2.sb) {
			try {
				producer2.sb.wait();
			} catch (InterruptedException e) {}

			System.out.println("producer2.sb = " + producer2.sb);
		}

	}

}

public class CommunicationDemo2 {

	public static void main(String[] args) {
		Producer2 producer2 = new Producer2();
		Consumer2 consumer2 = new Consumer2(producer2);

		Thread thread21 = new Thread(producer2);
		Thread thread22 = new Thread(consumer2);

		thread21.start();
		thread22.start();

	}

}
