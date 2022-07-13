package com.browser.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
	
	
		// enter /navigate to the url
		
		d.get("https://www.bing.com");
		Thread.sleep(3000);
		d.get("https://www.google.com");
		Thread.sleep(3000);
		d.get("https://www.selenium.dev/");
		
		
	}

}
