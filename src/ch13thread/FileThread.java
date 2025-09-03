package ch13thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileThread {

	public static void main(String[] args) throws Exception{
		FileStatus f = new FileStatus();
		f.readFile("c:\\tmp\\data3.txt");
	}
}

class FileStatus {

	int countWord(String line) {
		return line.split(" ").length;
	}

	int countCharacter(String line) {
		return line.length();
	}

	void readFile(String fileName) throws Exception {
		int totalLine = 0;
		int totalWord = 0;
		int totalChar = 0;
		File file = new File(fileName);// c://tmp//a.txt

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String line;
		while (true) {
			line = br.readLine();
			if (line == null) {
				break;
			} else {
				totalLine++;
				totalWord = totalWord + countWord(line);
				totalChar += countCharacter(line);

			}
		}
		br.close();
		System.out.println("Total Line  : " + totalLine);
		System.out.println("Total Words : " + totalWord);
		System.out.println("Total Chara : " + totalChar);

	}

}
