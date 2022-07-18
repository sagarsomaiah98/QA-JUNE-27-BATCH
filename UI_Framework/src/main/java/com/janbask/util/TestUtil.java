package com.janbask.util;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.janbask.testbase.TestBase;

public class TestUtil extends TestBase{
public static String DateTime() {
		
		LocalDateTime myDateObj = LocalDateTime.now();
	   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    
	    return formattedDate;
	    
	}
	
	public static  void Screenshot() throws IOException {
		
		
		 String name = driver.getTitle()+"_"+DateTime();

			TakesScreenshot scrShot = ((TakesScreenshot) driver);

			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			
			System.out.println(System.getProperty("user.dir") +"\\SCREENSHOTS\\");

			File DestFile = new File(System.getProperty("user.dir") + "\\SCREENSHOTS\\" +  name+".jpeg");

			FileUtils.copyFile(SrcFile, DestFile);
		
		
	}

	public static void main(String[] args) {
		DateTime();
	}

}
