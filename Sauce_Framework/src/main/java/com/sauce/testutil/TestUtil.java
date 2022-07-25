package com.sauce.testutil;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.sauce.testbase.TestBase;

public class TestUtil extends TestBase {
	
	public static int random()
	{
	int a= (int) (Math.random()*10000);
		
		
		return a;
		
	}
	
public static String DateTime() {
		
		LocalDateTime myDateObj = LocalDateTime.now();
	   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    
	    return formattedDate;
	    
	}
	

public  static void Screenshot() throws IOException 
{

	  File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(s, new File(System.getProperty("user.dir")+"\\SCREENSHOTS\\"+DateTime()+".png"));

	
}
	

	public static void main(String[] args) {
		
		System.out.println(DateTime());

	}

}
