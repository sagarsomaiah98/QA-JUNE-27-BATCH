package com.emonics.returnKeyword;

public class AgeCalculator {
	
	public void findAge(int year, int month, int day) {
		
		int y= 2022-year;
		
		int m= 7-month;
		
		if(m<0)
			m=m*-1;
		
		int d= 4-day;
		
		if(d<0)
            d=d*-1;
		
		System.out.println("Current age is "+y+" years "+ m+ " month "+ d+" days");
		
		
		
		
	}
	
	public static void main(String args[])
	{
	
		AgeCalculator a= new AgeCalculator();
		
		a.findAge(1988, 02, 19);
		
		
		
	}

}
