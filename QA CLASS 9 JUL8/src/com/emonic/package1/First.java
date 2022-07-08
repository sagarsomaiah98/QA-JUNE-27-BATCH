package com.emonic.package1;

public class First {
	
	protected String name="Kevin";
	protected int age=32;
	
	protected void print() {
		
		
		System.out.println("calling print");
	}

	public static void main(String[] args) {
	First f = new First();
	f.print();
	System.out.println(f.name);
	System.out.println(f.age);

	}

}
