package com.browser.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge {
	
	
	public static void main(String args[]) {
		
		//https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/

		System.setProperty("webdriver.edge.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\msedgedriver.exe");
		
		WebDriver dr= new EdgeDriver();
		
	
	}

}
