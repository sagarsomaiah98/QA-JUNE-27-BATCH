package com.emonics.staticKeyword;

public class Math1 {
	
	// below method is for subtraction
	public void sub() 
	{
		int a=70;
		int b=50;
		
		int c=a-b;
		
		//Subtraction of two numbers  20 and 30 is 50
		System.out.println("Subtraction of two numbers  "+a+ " and "+b+" is "+c);	

		
	}

	public void div()
	{
		int a=70;
		int b=50;
		
		int c=a/b;
		
		//Division of two numbers  20 and 30 is 50
		System.out.println("Division of two numbers  "+a+ " and "+b+" is "+c);
		
	}

	public static void main(String[] args) 
	{
		Math1 m= new Math1();
		m.sub();
		m.div();
		
	}

}
