package com.emonics.staticKeyword;

public class Static_EX {
	static int age=30;
	static String name="Bob";
	
	
	public void display() {
		double height=3.45;
		
		System.out.println(height);
		System.out.println(" calling non static method");
		
	}
	
	public static void print() {
		
		char grad='C';
		
		System.out.println("calling method");
		
		
	}

	public static void main(String[] args) {
		
		Static_EX s= new Static_EX();
		s.display();
		
		print();
		
		System.out.println(age);
		System.out.println(name);
		
		
	}

}
