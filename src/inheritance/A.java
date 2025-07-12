package inheritance;

import google.Gmail;

public class A extends Gmail {

	public static void main(String[] args) {
		Gmail g = new Gmail();
		g.sendMail();//public 
//		g.signin();
//		g.logout();
//		g.authenticate();

		A a = new A();
		a.sendMail();
		a.authenticate(); 
		
		B b  = new B();
		b.sendMail();
//		b.authenticate(); 
		
	}
}


class B extends Gmail{
	
	void add() {
		authenticate();
	}
}