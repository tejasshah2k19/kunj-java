package basic;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;

//		Student s1 = new Student(); //name 
//		
//		Student s2; 
//		
//		System.out.println(s1);
//		System.out.println(s2);

		Student s[] = new Student[5];
		System.out.println(s);
		System.out.println(s[0]);
		s[0] = new Student();
		System.out.println(s[0]);
	}
}

class Student {
	String name;
}
