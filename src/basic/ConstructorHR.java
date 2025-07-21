package basic;

public class ConstructorHR {

	public static void main(String[] args) {

		
		
		 Banta b = new Banta(1);
	}
}


class Jack{
	public Jack() {
		this(1);
		System.out.println("Jack()");
	}
	
	Jack(int a){
		//this();//Jack()
		System.out.println("Jack(int)");
	}
}

class Santa {
	Santa() {
		System.out.println("Santa()");
	}

	Santa(int a) {
		System.out.println("Santa(int)");
	}
}

class Banta extends Santa {
	Banta() {
		super(1);//
		System.out.println("Banta()");
	}

	Banta(int a) {
		this();//
		System.out.println("Banta(int)");
	}
}