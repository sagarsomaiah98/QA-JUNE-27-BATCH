package com.emonics.stringfunctions;

public class String_Functions_Ex {

	public static void main(String[] args) {
		
		// 30  
	
		String input="Welcome to Emonics QA Training of software testing";
		
		
		int len= input.length();
		
		//System.out.println(len);
		
	char h=	input.charAt(0);// charAt(index) will give the character at specified index
	
	//System.out.println(h);
		
	// System.out.println( input.substring(8));	
	 
	// System.out.println(input.substring(8, 12));
		
	// System.out.println(input.indexOf('m'));
	 
	 System.out.println(input.indexOf('o', 14));
	 
		
		
		

	}

}
