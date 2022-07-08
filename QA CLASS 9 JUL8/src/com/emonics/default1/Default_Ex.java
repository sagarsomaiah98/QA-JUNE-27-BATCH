package com.emonics.default1;

  class Default_Ex {
	
	
	String name="Joe";
	double salary=345.67;
	
	
	 void info() {
		
		System.out.println("calling info");
	}

	public static void main(String[] args) {
	
		Default_Ex d = new Default_Ex();
		d.info();
		System.out.println(d.name);
		System.out.println(d.salary);

	}

}
