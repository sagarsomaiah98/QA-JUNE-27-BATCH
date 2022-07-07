package com.emonics.parameter;

public class Reverse_String {
	
	public void reverse(String input)
	{
		//code to reverse the given string
		int a=input.length();
		
	
		
		
	//	System.out.println(input.charAt(a-3+1-1+2));
		
		
		for( int i=a-1;i>=0;i--)
		{
		System.out.print(input.charAt(i));	
			
		}
		
		System.out.println();
		
		/*
		 * System.out.print(input.charAt(6)); System.out.print(input.charAt(5));
		 * System.out.print(input.charAt(4)); System.out.print(input.charAt(3));
		 * System.out.print(input.charAt(2)); System.out.print(input.charAt(1));
		 * System.out.print(input.charAt(0));
		 */
		
	}

	public static void main(String[] args) {
	
		Reverse_String r= new Reverse_String();
		r.reverse("GERMANY");
		r.reverse("AUTOMATION");
		r.reverse("JAVA");
		r.reverse("MAC");
		

	}

}
