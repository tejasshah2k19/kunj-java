package ch9io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BankDemo {
	public static void main(String[] args) throws Exception {
		Customer c = new Customer();
		c.firstName = "ram";
		c.lastName = "patel";
		c.balance = 58000f;
		c.email = "ram@gmail.com";
		c.password = "secret";

		// 500
		// write 500*5 =>
		// read

		// single object file ?
		// serialization => process of writing object state in persistence storage

		// FileWriter
		// FileOutputStream
		// PrintWriter
		// DataOutputStream
		// BufferedWriter

		FileOutputStream fos = new FileOutputStream("data.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(c);// serialize
		oos.close();

		FileInputStream fis = new FileInputStream("data.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Customer c1 = (Customer) ois.readObject();
		System.out.println(c1.email);
		System.out.println(c1.password);
		System.out.println(c1.firstName);
		System.out.println(c1.lastName);
		System.out.println(c1.balance);

		ois.close();
	}
}

//empty interface ==> Marker interface 
class Customer implements Serializable {
	String firstName;
	String lastName;
	String email;
	transient String password;
	Float balance;

	public Customer() {
		System.out.println("Customer()");
	}

}

class Saving extends Customer {

}

class Current extends Customer {

}



