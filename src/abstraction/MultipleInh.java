package abstraction;

public class MultipleInh {

}

class Parent {

}

interface ParentI {
	void add();
}

interface ParentI2 {
	void sub();
	
}


interface I3 extends ParentI{
	
}
//multiple inheritance
class Child extends Parent implements ParentI {

	public void add() {

	}

}

class ChildI implements ParentI, ParentI2 {

	public void sub() {

	}

	public void add() {

	}

}

class ChildII extends Parent implements ParentI, ParentI2 {

	public void sub() {

	}

	public void add() {

	}

}