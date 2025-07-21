package oops;

public class PolymorphicCasting {

	public static void main(String[] args) {

		P p = new C();

		P p1 = new P();
		p.add();
		((C) p).sub();

		//

		((C) p1).sub();
	}
}

class P {
	void add() {
		System.out.println("add Parent");
	}
}

class C extends P {
	void add() {
		System.out.println("add Child");
	}

	void sub() {
		System.out.println("sub child");
	}
}