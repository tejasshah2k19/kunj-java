package ch9io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	// File class
    
	public static void main(String[] args) throws IOException {
		// only perform operation on the file

		// file create
		// file delete
		// file present ?
		// file size? bytes
		// file read only?
		// file path?
		// file rename

		//re
//		File f = new File("data2.txt");// this will not create the file
//
//		System.out.println(f.exists());// false
//		// checked IOException
//		System.out.println(f.createNewFile()); // this will create new file
//		System.out.println("done");
//
//		f.delete();
				
		File f = new File("c:\\tmp\\data2.txt");
		f.createNewFile();
		
		File f2 = new File("c://tmp","data3.txt");
		f2.createNewFile();
		
		System.out.println(f2);
		System.out.println(f2.toString());
		
		System.out.println(f2.getAbsolutePath());
		System.out.println(f2.getCanonicalPath());
		
		System.out.println(f2.canExecute());
		System.out.println(f2.canRead());
		System.out.println(f2.canWrite());
		
		System.out.println(f2.length());// bytes
		
		
		
		
		
		
	}
}
