package com.emonics.privateEx;

public class Private_Modifier_Ex {
	
	private String name="John";
	private int age=30;
	
	private void method1() {
		
		System.out.println("calling method 1");
		
	}

	public static void main(String[] args) {
		
		
		Private_Modifier_Ex e= new Private_Modifier_Ex();
		e.method1();
		System.out.println(e.age);
		System.out.println(e.name);

	}

}
