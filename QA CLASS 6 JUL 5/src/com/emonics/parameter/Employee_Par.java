package com.emonics.parameter;

public class Employee_Par {
	
	public void display(int age, String name) 
	{
		
		System.out.println(name+" age is "+age);
		
	}
	
	public void print(String role,char grade, double salary)
	{
		
		System.out.println("For Role "+ role+ " Grade is "+grade+" has salary "+salary);
		
		
	}

	public static void main(String[] args) {
		
		Employee_Par emp= new Employee_Par();
		emp.display(55, "Jake");
		emp.print("Manager", 'M', 8000.56);
		

	}

}
