package stringpack;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "royal";
		String s2 = "royal";

		System.out.println(s1.equals(s1));// true

		String s3 = "Royal";
		System.out.println(s1.equals(s3));// false

		// tejas@gmail.com
		// Tejas@GMAIL.com
		// email is not case sensitive
		System.out.println(s1.equalsIgnoreCase(s3));// true

		//ASCII:1 - unicode:2 
		
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));//0 A:65 a:97
		
		System.out.println(s1.compareToIgnoreCase(s3));//0
		
		
		
		
	}
}
