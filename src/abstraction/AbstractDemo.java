package abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
	}
}

//class abstract - you can not instantiate - object-instance creation not possible   
abstract class RBI {

	// non abstract
	// static
	static void code() {

	}

	// instance - non static
	// non abstract
	void roi() {
		System.out.println("roi");// non abstract
	}

	abstract void wid();// abstract method
	abstract void dep();
}

class ICICI extends RBI{
	
	//override
	void wid() {
		
	}
	//override
	void dep() {
		
	}
}

abstract class SBI extends RBI{
	
}

