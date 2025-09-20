package ch13thread;

public class BankThread {

	public static void main(String[] args) {
		Customer c = new Customer();
		Customer d = new Customer();
		d.setName("D");
		Thread t1 = new Thread(c);
		t1.setName("John");
		Thread t2 = new Thread(c, "Jack");
		Thread t3 = new Thread(c, "Rock");

		t1.start();
		t2.start();
		t3.start();
		d.start();

		synchronized (d) {
			// logic
		}

	}
}

class Customer extends Thread {
	int balance = 50000;

	static int x = 10;

	// class level lock
	synchronized void aaa() {
		// static variable
		x = 100;
	}

	// Object Level lock
	synchronized void wid(int amt) {
		// balance

		System.out.println("wid process started....." + currentThread().getName());

		if (balance - amt >= 0) {
			System.out.println("balance deduction started...." + currentThread().getName());
			balance = balance - amt;
		} else {
			System.out.println("insufficient balance...." + currentThread().getName());
		}
		System.out.println("wid completed....." + currentThread().getName() + " => " + balance);

	}

	// Object Level lock
	void wid2(int amt) {
		// balance
		// 1
		// 2
		System.out.println("wid process started....." + currentThread().getName());
		synchronized (this) {

			if (balance - amt >= 0) {
				System.out.println("balance deduction started...." + currentThread().getName());
				balance = balance - amt;
			} else {
				System.out.println("insufficient balance...." + currentThread().getName());
			}

			System.out.println("wid completed....." + currentThread().getName() + " => " + balance);
		}
	}

	public void run() {
		wid(25000);
	}
}
