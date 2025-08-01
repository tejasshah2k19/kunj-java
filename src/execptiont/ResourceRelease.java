package execptiont;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ResourceRelease {

	public static void add() throws IOException {
		throw new IOException();
	}

	void sub() throws IOException{
		add();
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scr.next();
//		scr.close();

//		try with auto resource collection

//		try (Scanner sc = new Scanner(System.in)) {
//
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int c = a / b;
//
//		} // at this point it will auto close sc
//		catch (ArithmeticException e) {
//			e.printStackTrace();
		//
//		} catch (InputMismatchException e) {
//			e.printStackTrace();
//		//
		// }

		try (

				Scanner sc = new Scanner(System.in)) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;

		} // at this point it will auto close sc
		catch (ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		}

	}
}
