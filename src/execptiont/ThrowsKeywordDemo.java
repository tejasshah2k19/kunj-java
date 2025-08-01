package execptiont;

import java.io.File;
import java.io.IOException;

public class ThrowsKeywordDemo {

	public static void main(String[] args) throws ArithmeticException,IOException{
	
		File f = new File("a.txt");
		f.createNewFile();
	}
}
//import 