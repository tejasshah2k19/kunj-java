package ch13thread;

import java.applet.Applet;

//extends Thread 
//implements Runnable 

public class RunnableDemo {

	public static void main(String[] args) {
		ScanThread st= new ScanThread();
		st.start();
		
		Scan sr = new Scan();
		Thread t = new Thread(sr);
		t.start();
	}
}

//class A extends Applet implements Runnable{
//	
//}

class ScanThread extends Thread {
	public void run() {
		scanning();
	}

	void scanning() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("ScanningThread : " + i);
		}
	}
}

class Scan implements Runnable {
	void scanning() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("ScanningRunnable : " + i);
		}
	}

	public void run() {
		scanning();
	}
}
