package execptiont;

public class Calc2 {

	public static void main(String[] args) throws NegativeNumberException {

		int a = 10;
		int b = -1;
//try
		if (b == 0) {
			// self throw
//			throw new ArithmeticException();
			ArithmeticException e = new ArithmeticException();
			throw e;
		} else if (b < 0) {
			NegativeNumberException ne = new NegativeNumberException();
			throw ne;
		}

		int c = a / b;
		System.out.println(c);
		// catch
	}
}

//custom 
class NegativeNumberException extends Exception {

	public NegativeNumberException() {
		super("Invalid Number :: Negative Value");
	}
}