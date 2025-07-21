package operator;

public class ShortCAndIncDec {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		int c = 5;

		// ++ ==> +1

		// a++
		// ++a

		// & => &&
		// | => ||

		if (a++ < b | a++ < c) {
			System.out.println("hi");
		} else {
			System.out.println("bye");
		}

		System.out.println(a);
	}
}
