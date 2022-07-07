package com.emonics.returnKeyword;

public class Add_Return {
	
	public int add() {
		
		int a=10;
		int b=20;
		int c=a+b;
		
		return b+a+1+c-20+10;
		
	}

	public static void main(String[] args) {
		
		Add_Return a = new Add_Return();
		
		System.out.println(a.add());
		
	}

}
