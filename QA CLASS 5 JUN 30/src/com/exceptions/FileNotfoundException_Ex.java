package com.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotfoundException_Ex {

	public static void main(String[] args) throws FileNotFoundException {
		
	FileInputStream fis = new FileInputStream("S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\Sample1.txt");
		
	
	System.out.println("File processing complete");
	System.out.println(" end of the program");	

	}

}
