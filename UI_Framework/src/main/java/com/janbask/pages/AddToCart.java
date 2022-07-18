package com.janbask.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.janbask.testbase.TestBase;

public class AddToCart extends TestBase{
	
	WebElement addtocart= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	WebElement cart= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	
	
	public void addTocart() 
	{
		addtocart.click();
		cart.click();
		
		
	}

}
