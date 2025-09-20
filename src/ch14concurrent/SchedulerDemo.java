package ch14concurrent;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerDemo {

	public static void main(String[] args) {

		// thread pool

		// submit -> queue ->

		Print p = new Print();
//		ExecutorService ex = Executors.newSingleThreadExecutor();// w1

//		ExecutorService ex  = Executors.newFixedThreadPool(5);//w1-w5

//		ExecutorService ex = Executors.newCachedThreadPool();// 2------N
//		ex.submit(p);//
//		ex.submit(p);//
//		ex.submit(p);//
//		ex.submit(p);//
//		ex.submit(p);//
//		ex.submit(p);//

		System.out.println(LocalDateTime.now());
		ScheduledExecutorService ex = Executors.newScheduledThreadPool(3);//worker count

		ex.scheduleAtFixedRate(p, 5, 5, TimeUnit.SECONDS);
		ex.scheduleWithFixedDelay(p, 5, 10, TimeUnit.SECONDS);
		ex.shutdown();
	}
}

class Print extends Thread {
	public void run() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("Print : " + i);
//		}
		System.out.println("hi..." + LocalDateTime.now());
	}
}
