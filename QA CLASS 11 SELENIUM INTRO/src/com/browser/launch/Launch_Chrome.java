package com.browser.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome {

	public static void main(String[] args) {
		
		//https://chromedriver.chromium.org/downloads
		
		System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		
		
	}

}
