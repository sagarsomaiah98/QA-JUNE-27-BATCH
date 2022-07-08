package com.emonic.inheritance;

public class A {
	
	String lastname="Waynes";
	double income=24563.21;
	
		public void house() {	
		System.out.println("House belongs to A");
	}
	
	public void factory() {
		
		System.out.println("Factory belongs to A");
	}

	public static void main(String[] args) {
		
		A a = new A();
		a.house();
		a.factory();
		

	}

}
