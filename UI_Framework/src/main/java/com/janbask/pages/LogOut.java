package com.janbask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.janbask.testbase.TestBase;

public class LogOut  extends TestBase{
	
	
	WebElement menu= driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	
	WebElement logout=driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	
	public void logout() {
		
		menu.click();
		logout.click();
	}

}
