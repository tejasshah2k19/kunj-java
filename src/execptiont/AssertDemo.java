package execptiont;

public class AssertDemo {

	public static void main(String[] args) {

		// assertions are disable

		// java -ea AssertDemo

		// eclipse -> run as -> run configuration -> argument -> vm argument
		// -ea

		// -da
//		try (String s ="rr";){
//			
//		}
		
//		int assert; 
//		throw new ArithmeticException();
		int a = 10;
		int b = 20;
		int c = a + b;

		assert (c == 30) : "addition fail";

		System.out.println("addition = " + c);

	}
}
