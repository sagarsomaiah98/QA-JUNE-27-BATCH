package com.janbask.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.janbask.pages.AddToCart;
import com.janbask.pages.Login;
import com.janbask.testbase.TestBase;
import com.janbask.util.TestUtil;

public class AddTocartTest extends TestBase {
	
	
	@Test
	public void addtocartTest() throws IOException
	
	{
		intialization();
		
		Login l = new Login();
		l.login("standard_user", "secret_sauce");
		
		AddToCart a = new AddToCart();
		a.addTocart();
		TestUtil.Screenshot();
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}

}
