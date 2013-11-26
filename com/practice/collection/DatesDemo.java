package com.practice.collection;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatesDemo {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		
		// Below 0 is January so 12 is also 11 + 1 January
		GregorianCalendar gc = new GregorianCalendar(2012,12,31);
		System.out.println(gc);
		System.out.println(gc.getTime());
		DateFormat df = DateFormat.getDateInstance();
		
		System.out.println(df.format(date));
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df1.format(date));

		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df2.format(date));

		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df3.format(date));

		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.MONTH_FIELD);
		System.out.println(df4.format(date));

		
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df5.format(date));

		DateFormat df6 = new SimpleDateFormat("mm-dd-yyyy");
		df6.parse("08-22-1999");
		System.out.println(df6);

	}

}
