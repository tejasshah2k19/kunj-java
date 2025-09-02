package ch8;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		
		Locale in = new Locale("hi","in");
		
		NumberFormat nf = NumberFormat.getInstance();
		NumberFormat nfIn = NumberFormat.getCurrencyInstance(in);
		nfIn.setMaximumFractionDigits(0);
		
		Float f = 123457.6789f;
		
		System.out.println(nf.format(f));
		System.out.println(nfIn.format(f));
		
		
		
	}
}
