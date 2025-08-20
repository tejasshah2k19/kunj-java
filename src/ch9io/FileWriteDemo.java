package ch9io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	static void writeData() throws IOException {
		File file = new File("c://tmp//kunj.data");
		file.createNewFile();

		FileWriter fw = new FileWriter(file);
		fw.write("Royal");
		fw.write("edu");
		fw.write("\nAhmedabad");

		fw.close();
		System.out.println("Done");

	}

	static void readData() throws IOException {
		File file = new File("c://tmp//kunj.data");
		FileReader fr = new FileReader(file);

//		int b = fr.read();// single character read and return unicode { ascii } value
		
		int b = 0;
		
		while(true) {
			b=fr.read();
			if(b == -1) {
				//-1 end of file 
				break;
			}
			System.out.print((char)b);
		}
		
		fr.close();

	}

	static void readLineData() throws IOException{
		File file = new File("data.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String line ;
		
		while( (line= br.readLine())!=null) {
			System.out.println(line);
		} 
		
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
//		writeData();
//		readData();
		readLineData();
	}
}

//byte 
//char 
