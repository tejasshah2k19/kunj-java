package abstraction;

public class InterfaceDemo {

}

abstract class A {
	abstract public void start();

	abstract protected void end();
}

class ChildA extends A {
	// override -> exact signature -given by the parent
	public void start() {

	}

	public void end() {

	}
}

//pure abstract class
//all methods are abstract 
interface B {

}

abstract interface C {
	
	void add();

	abstract void sub();

	public abstract void div();
}

class ChildC implements C {
	public void add() {

	}

	public void sub() {

	}

	public void div() {

	}
}
