package com.emonics.overriding;

public class B  extends A{
	
	// Modifying the implementation of parent method/function in child class
	
	//for overriding to occur there should two classes and relationship of parent-child
	
	// polymorphism- method overloading and method overriding
	
	public void bike() {
		
		System.out.println("Bike belongs to B");
	}
	
	public void house() {
		
		System.out.println("modifiying the parent house ");
		System.out.println(" building the parent house with new interiors");
		
		
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
