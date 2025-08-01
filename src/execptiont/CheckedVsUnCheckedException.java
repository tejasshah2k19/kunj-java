package execptiont;

import java.io.File;
import java.io.IOException;

public class CheckedVsUnCheckedException {

	public static void main(String[] args) {

		
		//checked exception 
		try {
			File f = new File("demo.txt");
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//unchecked exception 
		int a = 10;
		int b = 0;
		int c = a / b;// ArithmeticException
		System.out.println(c);

	}
}
