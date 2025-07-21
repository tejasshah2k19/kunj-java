package stringpack;

public class StringImmutable {

	public static void main(String[] args) {
		
		String s1 = "royal";
		System.out.println(s1);
		s1  = s1 + "edu"; 
		System.out.println(s1);
		
		System.out.println("--------------------------------");
		
		String name = "royal";
		System.out.println(name.toUpperCase());
		System.out.println(name);

		String name2 = "royal";
		name2 = name2.toUpperCase();
		System.out.println("name2 => "+name2);
	
		
	}
}
