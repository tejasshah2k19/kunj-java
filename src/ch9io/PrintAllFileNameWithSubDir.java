package ch9io;

import java.io.File;

public class PrintAllFileNameWithSubDir {

	static void printFileName(String path) {
//		System.out.println("Printing from => " + path);// => c://tmp
		File master = new File(path);
		String masterContent[] = master.list();// 1folder 4file

		for (String x : masterContent) {// 3 file
			File f = new File(path, x);//
			if (f.isFile()) {
				System.out.println(f.getPath());// data.txt kunj.data data2.txt
			} else {
				printFileName(f.getPath());// c://tmp//kunj
			}
		}
	}

	public static void main(String[] args) {
//		printFileName("c://tmp");
		printFileName("C:\\apache-maven-3.9.9");
	}

	public static void main2(String[] args) {

		String path = "C:\\tmp";
		File master = new File(path);
		String masterContent[] = master.list();

		for (String x : masterContent) {
			// kunj -> folder
			// data.txt
			// kunj.data
			File f = new File(path, x);
			if (f.isFile()) {
				System.out.println(x);
			} else {
				String subContent[] = f.list();
				for (String y : subContent) {
					System.out.println(y);
				}
			}
		}

	}
}
