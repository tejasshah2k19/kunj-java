package ch13thread;

public class SleepDemo {
	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		B b = new B();
		
		a.start();
//		a.sleep(1000);//ms 
		b.start(); 
	}
}

class A extends Thread {
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println("A");
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("B");
		}

	}
}