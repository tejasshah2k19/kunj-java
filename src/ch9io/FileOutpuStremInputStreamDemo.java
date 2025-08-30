package ch9io;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutpuStremInputStreamDemo {

	void one() throws IOException {
		FileOutputStream fos = new FileOutputStream("c:\\tmp\\demo.txt");
		fos.write('r');// royal
		fos.close();

		FileInputStream fis = new FileInputStream("c:\\tmp\\demo.txt");
		int x = fis.read();
		System.out.println((char) x);
		fis.close();

	}

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("c:\\tmp\\demo.txt");
		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeBytes("royal");
//		dos.write(1213);
		dos.close();

	}
}
