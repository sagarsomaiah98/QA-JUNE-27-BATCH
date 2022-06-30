package com.exceptions;

public class Array_Exceptions {

	public static void main(String[] args) {
		
		int[] a= new int[4];
		
		a[2]=34;
		a[3]=56;
		System.out.println(a[2]);
		a[1]=60;
		System.out.println(a[3]);
		a[5]=120;
		System.out.println(a[1]);
		System.out.println(a[3]);
		System.out.println(a[0]);
	}

}
