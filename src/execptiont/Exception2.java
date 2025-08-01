package execptiont;

public class Exception2 {

	public static void main(String[] args) {

		try {
			int a = 1;
			int b = 0;
			int c = a / b;
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
