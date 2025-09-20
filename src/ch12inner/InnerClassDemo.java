package ch12inner;

public class InnerClassDemo {

	public static void main(String[] args) {

		// type 1:
		Outer o = new Outer();
		Outer.MemberInner oi = new Outer().new MemberInner();
		Outer.MemberInner oi2 = o.new MemberInner();
		oi.seeOuter();

		// type 2:
		o.myInner();

		//type 3:
		Outer.NestedClass oi3 = new Outer.NestedClass();
		oi3.seeOuter();

		//type 4: 
		Runnable r = new Runnable() {
			public void run() {
				
			}
		};
		//
		Outer ox = new Outer() {
			
		};
		
		
		Thread t  = new Thread() {
			public void run() {
				
				System.out.println("hi");
			};
		};
		
		t.start();
		
		o.add(new Outer() {
			//
		});
	}
}

class Outer {

	private String name = "royal";
	private static String name2 = "royal";

	// type 1
	// class -> class -> inner class
	class MemberInner {
		void seeOuter() {
			System.out.println(name);
			System.out.println(name2);
		}
	}

	// type 2
	// class -> method -> method local inner class
	void myInner() {
		class MethodLocalInner {
			void seeOuter() {
				System.out.println(name);
				System.out.println(name2);

			}
		}
		MethodLocalInner mli = new MethodLocalInner();
		mli.seeOuter();
	}

	// type 3
	// nested class
	// static class -> class

	static class NestedClass {
		void seeOuter() {
			System.out.println(name2);
		}
	}


	void add(Outer x) {
		
	}

}
