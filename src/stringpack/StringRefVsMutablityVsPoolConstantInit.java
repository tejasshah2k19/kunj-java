package stringpack;

public class StringRefVsMutablityVsPoolConstantInit {

	public static void main(String[] args) {

		String s1 = new String("royal");
		String s2 = new String("royal");

		// == <---- Object
		// value <---- String
		System.out.println(s1.equals(s2));// boolean -> true
		System.out.println(s1 == s2);//

		System.out.println("====================");
		String s3 = "royal";
		String s4 = "royal";
		String s5 = new String("royal");
		System.out.println(s3 == s4);
		System.out.println(s3 == s5);
		System.out.println(s3.equals(s5));

	}
}
