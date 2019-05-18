package com.gaurav.javafromnotes.threads.threadinteraction;

class Producer1 implements Runnable {
	StringBuffer sb;
	boolean dpo;

	Producer1() {
		sb = new StringBuffer();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			
			try {
				sb.append(i + " : ");
				Thread.sleep(100);
				System.out.println("Appending : " + i);
			} catch (InterruptedException e) {
			}

			dpo = true;

		}
	}

}

class Consumer1 implements Runnable {
	Producer1 producer1;

	Consumer1(Producer1 producer1) {
		this.producer1 = producer1;
	}

	@Override
	public void run() {
		System.out.println(producer1.dpo);
		while (!producer1.dpo) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
			
			System.out.println("producer1.sb = " + producer1.sb);
		}
	}

}

public class CommunicationDemo1 {

	public static void main(String[] args) {
		Producer1 producer1 = new Producer1();
		Consumer1 consumer1 = new Consumer1(producer1);

		Thread thread1 = new Thread(producer1);
		Thread thread2 = new Thread(consumer1);
		
		thread1.start();
		thread2.start();

	}

}
