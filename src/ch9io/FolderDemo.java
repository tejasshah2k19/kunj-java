package ch9io;

import java.io.File;

public class FolderDemo {

	public static void main(String[] args) {
		
		
		File f = new File("c://tmp//kunj");
		f.mkdir(); //f.createNewFile() => new file 
		//f.mkdir() => new folder 
		
		File tmp = new File("c://tmp");
		String allContent[] = tmp.list();//
		System.out.println("Content of c://tmp director ==> ");
		
		for(String x:allContent) {
			System.out.println(x);
		}
	}
}
