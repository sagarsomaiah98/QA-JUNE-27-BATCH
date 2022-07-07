package com.emonics.assignment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Ex {

	public static void main(String[] args) {
		 Date date = new Date();
	      SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
	       String str = formatter.format(date);
	      System.out.print("Current date: "+str);
	      
	      //fetch only date and store it in a variable
	      //fetch only month and store it in variable
	      //fetch only year and store it in variable

	}

}
