package ch13thread;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("start"+System.currentTimeMillis());
		Print p = new Print();
		p.start();

		Copy c = new Copy();
		c.start();
	}
}

//extends Thread 
//run()
//start()

class Print extends Thread {
	public void run() {
		printMsg();
		System.out.println("Print"+System.currentTimeMillis());

	}

	void printMsg() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Print " + i);
		}
		
	}
}

class Copy extends Thread {
	void copyMsg() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Copy " + i);
		}
	}

	public void run() {
		copyMsg();
		System.out.println("Copy"+System.currentTimeMillis());

	}
}

//rahul - office 
//shivani-new -2 days 
//jeet-new
//krisha thakkar-sunday : c 
//6->7 dt 
//7->8 kts 
//