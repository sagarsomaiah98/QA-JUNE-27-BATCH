package com.emonic.input;

import java.util.Scanner;

public class StringUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter name :");
	      
	      String value= sc.next();
	      System.out.println("The name you have entered is --> "+value);

	}

}
