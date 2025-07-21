package stringpack;

public class StringDemo {

	public static void main(String[] args) {

		char c[] = new char[20];
		char x[] = { 'R', 'o', 'y', 'a', 'l' };
		int a[]= {1,2,3,4,5};
		Person p = new Person();
		
		
		System.out.println(x);//
		System.out.println(a);
		System.out.println(p);

		Integer i1 = 12; 
		Integer i2 = new Integer(12);
	
		System.out.println(i1);
		System.out.println(i2);
		
		
		String s = "royal";
		String s1 = new String("royal");
	
		System.out.println(s);
		System.out.println(s1);
	
		String s2 = s;
		String s3 = s1; 
		
	}
}

class Person{
	
}







