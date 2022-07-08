package com.emonic.inheritance;

public class B  extends A{
	
	public void bike() {
		
		System.out.println("Bike belongs to B");
	}

	public static void main(String[] args) {
		
		B b = new B();
		b.bike();
		b.house();
		b.factory();
		
		System.out.println(b.lastname);
		System.out.println(b.income);

	}

}
