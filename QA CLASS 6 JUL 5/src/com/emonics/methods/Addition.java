package com.emonics.methods;

public class Addition {
	
//AccessModifier returntype Method/functionName()	
	
	public void Add()
	{
		
		// to add two numbers
		
				int a=70;
				int b=50;
				
				int c=a+b;
				
				//Addition of two numbers  20 and 30 is 50
				System.out.println("Addition of two numbers  "+a+ " and "+b+" is "+c);
					
	}

	public static void main(String[] args) 
	{
	
	System.out.println("Program started");	
	
	// how to create a object?
	// ClassName objectName = new ClassName();
	
	 Addition obj= new Addition();// create a object
	 obj.Add();// call the function/method
	
	
		
	}

}
