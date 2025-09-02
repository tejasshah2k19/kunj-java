package ch8;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) throws ParseException {

		DateFormat f1 = DateFormat.getInstance();
		DateFormat f2 = DateFormat.getDateInstance();
		DateFormat longDf = DateFormat.getDateInstance(DateFormat.LONG);// style
		DateFormat medDf = DateFormat.getDateInstance(DateFormat.MEDIUM);// style
		DateFormat shortDef = DateFormat.getDateInstance(DateFormat.SHORT);// style
		DateFormat fullDef = DateFormat.getDateInstance(DateFormat.FULL);// style

		Date d = new Date();

		System.out.println(d);
		System.out.println(f1.format(d));
		System.out.println(f2.format(d));
		System.out.println(longDf.format(d));
		System.out.println(medDf.format(d));
		System.out.println(shortDef.format(d));
		System.out.println(fullDef.format(d));

		Locale india = new Locale("hi");
		Locale jp = new Locale("ja");
		Locale us = new Locale("en", "US");
		Locale fr = new Locale("fr");
		
		DateFormat fullDefIndia = DateFormat.getDateInstance(DateFormat.FULL, india);// style
		DateFormat fullDefJP = DateFormat.getDateInstance(DateFormat.FULL, jp);// style
		DateFormat fullDefUS = DateFormat.getDateInstance(DateFormat.FULL, us);// style
		DateFormat fullDefFR = DateFormat.getDateInstance(DateFormat.FULL,fr);// style
		
		
		System.out.println(fullDefIndia.format(d));
		System.out.println(fullDefJP.format(d));
		System.out.println(fullDefUS.format(d));
		System.out.println(fullDefFR.format(d));
		
		//1,00,000
		//100,000
		//1.00.000
		
		//date --> String 
		
		//String --> Date 
		
		//11-02-2022 --> Date -> year -> 
		//age
		
		//parse() 
		String date = "01-Sept-2025";
		
		Date x  = f2.parse(date);
		System.out.println(x);
		
	}
}
