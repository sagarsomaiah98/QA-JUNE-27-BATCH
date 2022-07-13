package com.browser.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox {

	public static void main(String[] args) {
		
		//https://github.com/mozilla/geckodriver/releases

		
		System.setProperty("webdriver.gecko.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();

	}

}
