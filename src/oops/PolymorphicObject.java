package oops;

public class PolymorphicObject {

	public static void main(String[] args) {
//		Banta b = new Banta();
//		b.add();
//		b.div();
//		b.sub();

//		Santa s = new Santa();
//		s.add();
//		s.div();
//		s.sub();

		//polymorphic object 
		
		// parent -> ref
		// child -> memory
		Santa sb = new Banta();

		sb.add();//compiletime parent class runtime child class 
		sb.sub();
//		sb.div();
	}
}

class Santa {
	void add() {
		System.out.println("add::santa");
	}

	void sub() {
		System.out.println("sub::santa");
	}
}

class Banta extends Santa {
	void add() {
		System.out.println("add::banta");
	}

	void div() {
		System.out.println("div::banta");
	}
}
