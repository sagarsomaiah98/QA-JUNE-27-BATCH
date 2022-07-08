package com.emonics.overloading;

public class Operations {
	
	//Same method name different arguments/parameters- Method overloading
	
	public void add(int a, int b) {
		
		int c=a+b;
		System.out.println("Addition of numbers "+a+" and "+b+" is "+c);
	}
	
	public void add(int a, int b,int c) {
		
		System.out.println(" calling method 2");
	}

	public void add(String n1, String n2) {
		
		System.out.println("calling string method");
	}
	public void add (int a, double b) {
		
		System.out.println("calling int double");
	}
	public static void main(String[] args) {
   Operations o = new Operations();
   o.add(30,10, 40);
   o.add(10, 4.52);
   o.add("lane", "Dustin");
   o.add(2, 10.5);

	}

}
