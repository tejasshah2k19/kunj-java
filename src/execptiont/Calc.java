package execptiont;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		try {
			Scanner scr = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int a = scr.nextInt();
			int b = scr.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("please do not enter zero....");
		} catch (InputMismatchException e) {
			System.out.println("Please enter only non fraction digit");
		} catch (Exception e) {
			System.out.println("SMW PTA");
//			e.printStackTrace();
			// sendMailToDev(e);
		}

	}
}
