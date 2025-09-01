package ch8;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();// sql util
		System.out.println(d); // Mon Sep 01 11:29:07 IST 2025

		System.out.println(d.getHours());// 11
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
		System.out.println(d.getDay());// 1
		System.out.println(d.getDate());// date 1

		Date dd = new Date(0);
		System.out.println(dd);

		Date dx = new Date(1000 * 60 * 60 * 24);
		System.out.println(dx);
	
	
	}
}
