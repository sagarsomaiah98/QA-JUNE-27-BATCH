package com.browser.typeClick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(2000);
		try {
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		
		System.out.println("Test Passed");
		}
		catch(Exception e) {
			
		String error=	driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
			
			System.out.println("Test Failed");
			System.out.println(error);
			
		}
	
		
		driver.quit();
		
		
		
		

	}

}
