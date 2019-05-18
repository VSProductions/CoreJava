package com.gaurav.javafromnotes.threads.creation;

class AClassExtendingThreadClass extends Thread {

	public void run() {

		System.out.println("-----------------------------");
		System.out.println("This is a thread extending class");

		Thread t = Thread.currentThread();
		System.out.println("Current Thread: " + t);
		System.out.println("Thread Id: " + t.getId());
		System.out.println("Thread Name: " + t.getName());
		System.out.println("Thread Priority: " + t.getPriority());

		t.setName("Thread A");
		// t.setPriority(5);

		if (t.isAlive())
			System.out.println("Thread with ID: " + t.getId() + " and name: " + t.getName() + " and priority: "
					+ t.getPriority() + " is alive");

		System.out.println("\nExiting from thread extending classes run method");

	}

}

class AClassImplementingRunnableInterface implements Runnable {

	@Override
	public void run() {

		System.out.println("-----------------------------");
		System.out.println("This is a runnable implementing class");

		Thread t = Thread.currentThread();
		System.out.println("Current Thread: " + t);
		System.out.println("Thread Id: " + t.getId());
		System.out.println("Thread Name: " + t.getName());
		System.out.println("Thread Priority: " + t.getPriority());

		t.setName("Thread B");
		t.setPriority(10);

		for (int i = 0; i < 5; i++) {
			System.out.println("Value = " + (i + 1));

			try {

				t.sleep(1000);

			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}

		if (t.isAlive())
			System.out.println("Thread with ID: " + t.getId() + " and name: " + t.getName() + " and priority: "
					+ t.getPriority() + " is alive");

		System.out.println("\nExiting from runnable implementing classes run method");

	}

}

public class ThreadDemo {

	public static void main(String[] args) {

		System.out.println("Main Thread Starts. Thread properties of main thread");

		System.out.println("-----------------------------");

		Thread t = Thread.currentThread();
		System.out.println("Current Thread: " + t);
		System.out.println("Thread Id: " + t.getId());
		System.out.println("Thread Name: " + t.getName());
		System.out.println("Thread Priority: " + t.getPriority());

		AClassExtendingThreadClass thObj = new AClassExtendingThreadClass();
		Thread thobj2 = new Thread(new AClassImplementingRunnableInterface());

		thObj.start();

		try {
			thObj.join();

		} catch (InterruptedException e) {
			System.out.println(e);
		}

		thobj2.start();

		System.out.println("Main Thread Ends");

	}

}
