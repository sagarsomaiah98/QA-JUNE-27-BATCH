package com.emonics.returnKeyword;

public class Employe_ReturnType {
	
	
	public String info() {
		
		int age=40;
		double salary=2345.67;
		String name="Anderson";
		char grade='S';
		
		return name;
		
		
		
		
	}

	public static void main(String[] args) {
		
		Employe_ReturnType e = new Employe_ReturnType();
		
		String n=e.info();
		System.out.println(n.charAt(2));
		System.out.println(n.substring(6));
		System.out.println(n.substring(1,5));
	}

}
