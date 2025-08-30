package ch9io;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("c:\\tmp\\demo.txt");// outputstream , writer , string ,file

		pw.write("hi");
		pw.printf("%d %d %d",1,2,3);
		pw.println("hi");
		pw.write("end");
		pw.close();

	}
}
