package com.browser.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		
		d.manage().window().maximize();
	//	d.manage().window().minimize();
		
		d.get("https://saucedemo.com");
		
		String title =d.getTitle();
		System.out.println(title);
		String pagesource=d.getPageSource();
		System.out.println(pagesource);
	//	Thread.sleep(2000);
		
	//	d.close();
		d.quit();

	}

}
