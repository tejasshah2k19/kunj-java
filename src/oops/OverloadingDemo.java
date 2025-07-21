package oops;

//more than one form 

public class OverloadingDemo {

	public static void main(String[] args) {

	}
}

class SicCalc extends Calc {
	//
	
	void add(float a, float b) {

	}
}

class Calc {

	// constructor overloading
	Calc() {

	}

	Calc(int a) {

	}

	// method -> overloading
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void add(int d, int e, float f) {
		System.out.println(d + e + f);
	}

	int add() {
		return 0;
	}
}
