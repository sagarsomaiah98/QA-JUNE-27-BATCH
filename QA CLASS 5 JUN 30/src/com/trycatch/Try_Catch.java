package com.trycatch;

public class Try_Catch {

	public static void main(String[] args) {
		
		String[] stud= new String[4];
		
		try
		{
		stud[0]="Lee";
		System.out.println(stud[0]);
		stud[3]="Bob";
		System.out.println(stud[3]);
		stud[2]="Kane";
		System.out.println(stud[2]);	
		}
		catch(Exception v)
		{
			
		System.out.println("Failed to store and print values");	
			
			
		}
		
		System.out.println("***********************************");
		System.out.println(stud[0]);
		System.out.println(stud[1]);
		System.out.println(stud[2]);
		System.out.println(stud[3]);		
	}

}
