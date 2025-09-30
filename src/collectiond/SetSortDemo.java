package collectiond;

import java.util.HashSet;

public class SetSortDemo {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "ram";
		s1.age = 18;

		Student s2 = new Student();
		s2.name = "sita";
		s2.age = 17;

		Student s3 = new Student();
		s3.name = "Ravan";
		s3.age = 22;

		Student s4 = new Student();
		s4.name = "Bharat";
		s4.age = 18;

		Student s5 = s4; 
		
		Student s6 = new Student();
		s6.name = "ram";
		s6.age = 25;
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		HashSet<Student> ts = new HashSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		ts.add(s5);
		ts.add(s6);
		
		System.out.println(ts);

	}
}

class Student implements Comparable<Student> {
	String name;
	Integer age;
	 
	
	// s1 s2
	@Override
	public int compareTo(Student o) {
		System.out.println(this.name + " => " + o.name);
//		return 0;//s1 s2 same 
//		return -1;

		if (this.age > o.age) {
			return 1;
		}
		return -1;
	}

	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student x = (Student)obj;
		System.out.println("eq => " + this.name+" : "+x.name);
//		return super.equals(obj);
		return this.name.equals(x.name);
	}

	@Override
	public String toString() {
		return name + ":" + age;
	}

}
