package com.emonics.methods;

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
	public void mult()
	{
		
		int a=70;
		int b=50;
		
		int c=a*b;
		
		//Multiplication of two numbers  20 and 30 is 50
		System.out.println("Multiplication of two numbers  "+a+ " and "+b+" is "+c);
		
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
		Math1 obj=new Math1();
		
		obj.mult();

	}

}
