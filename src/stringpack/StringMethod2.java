package stringpack;

public class StringMethod2 {

	public static void main(String[] args) {

		String name = "royal";

		System.out.println(name.length());// total num of characters
		System.out.println(name.charAt(0));// 'r' : char
//		System.out.println(name.charAt(9));// 'r' : char

		System.out.println(name.indexOf('r'));// 0
		System.out.println(name.indexOf('z'));// -1

		String x = "jony jony yes papa";
		String y[] = x.split(" ");

		System.out.println(name.concat("edu"));

		name.contains("el");// boolean
		name.startsWith("ro");// boolean
		name.endsWith("ro");// boolean
		name.lastIndexOf('r');// royalroyalroyal;
		name.substring(2);// yal

		name = "royaleducation";

		// edu
		name.substring(5, 8);

		name.trim();// " sfdsfd sf ";

	}
}
