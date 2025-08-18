package ch9io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("c://tmp//kunj.data");
		file.createNewFile();

		FileWriter fw = new FileWriter(file);
		fw.write("Royal");
		fw.write("edu");
		fw.write("\nAhmedabad");

		fw.close();
		System.out.println("Done");

	}
}

//byte 
//char 
