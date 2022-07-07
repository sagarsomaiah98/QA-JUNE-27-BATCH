package com.emonics.assignment;

public class FindAge {
	
	
	public void findage(int day, int month, int year) {
	int d=7;
	int m=7;
	int y=2022;
	
	int d1= day-d;
	int m1= month-m;
	int y1= y-year;
	
	System.out.println(y1+" years "+m1+ " months "+ d1+" days");
		
		
		// find out date function to print current date, current month, current year
		
	}

	public static void main(String[] args) {
		
		FindAge f= new FindAge();
		f.findage(20,10,1990);
		//31 years 8 months 17 days

	}

}
