package com.emonics.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class FindAge {
	
	
	public void findage(int year, int month, int day) throws ParseException {
	
		LocalDate today = LocalDate.now();
		
		LocalDate birthday = LocalDate.of(year,month, day);

		Period period = Period.between(birthday, today);
		
		System.out.println(period);

		//Now access the values as below
		int d1=period.getDays();
		int m1=period.getMonths();
		int y1=period.getYears();	
		
		
		
	
	System.out.println(y1+" years "+m1+ " months "+ d1+" days");
		
		
		// find out date function to print current date, current month, current year
		
	}

	public static void main(String[] args) throws ParseException {
		
		FindAge f= new FindAge();
		f.findage(1990,10,20);
		//31 years 8 months 17 days

	}

}
