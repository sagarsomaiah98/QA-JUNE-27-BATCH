package com.emonic.input;

import java.util.Scanner;

public class Find_Odd_Even_Number {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the integer number ");
		
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
	
		
		
		
		if(input%2==0)
			System.out.println(input +" is Even Number");
		
		else
			
			System.out.println(input+" is Odd Number");
		
		
		
		
		

	}

}
