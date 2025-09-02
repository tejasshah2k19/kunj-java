package ch13thread;

public class BankThread {

	public static void main(String[] args) {
		Customer c = new Customer();
		Customer d  = new Customer();
		d.setName("D");
		Thread t1 = new Thread(c);
		t1.setName("John");
		Thread t2 = new Thread(c, "Jack");
		Thread t3 = new Thread(c, "Rock");

		t1.start();
		t2.start();
		t3.start();
		d.start();

	}
}

class Customer extends Thread {
	int balance = 50000;
	//Object Level lock 
	synchronized void wid(int amt) {

		System.out.println("wid process started....." + currentThread().getName());

		if (balance - amt >= 0) {
			System.out.println("balance deduction started...." + currentThread().getName());
			balance = balance - amt;
		} else {
			System.out.println("insufficient balance...." + currentThread().getName());
		}
		System.out.println("wid completed....." + currentThread().getName() + " => " + balance);

	}

	public void run() {
		wid(25000);
	}
}
