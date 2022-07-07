package com.emonics.staticKeyword;

public class Operations {
	
	// below method is for subtraction
	//static method
		public static void sub() 
		{
			int a=70;
			int b=50;
			
			int c=a-b;
			
			//Subtraction of two numbers  20 and 30 is 50
			System.out.println("Subtraction of two numbers  "+a+ " and "+b+" is "+c);	

			
		}
     //non static method
		public  void div()
		{
			int a=70;
			int b=50;
			
			int c=a/b;
			
			//Division of two numbers  20 and 30 is 50
			System.out.println("Division of two numbers  "+a+ " and "+b+" is "+c);
			
		}

		public static void main(String[] args) 
		{
			sub();
			Operations p= new Operations();
			p.div();
			
		}

}
