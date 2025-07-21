
package basic;

import java.util.*;

public class Blocks {

	static {
		System.out.println("static B");
	}

	{
		System.out.println("instance B");
	}

	public static void main(String[] args) {

		System.out.println("hi");
		System.out.println("bye");
	}
}

class User {
	//static block will invoke when class load 
	//instance block will invoke when you create instance 
	

	User() {
		System.out.println("User()");
	}

	{
		System.out.println("instance block 1 ");
	}
	{
		System.out.println("instance block 2 ");
	}

	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}

}