package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.sauce.pages.AddToCartPage;
import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;
import com.sauce.testutil.TestUtil;

public class AddTocartTest extends TestBase {
	
	@Test
	public void addtocarttest() throws IOException 
	{
		intialization();	
		
		LoginPage l = new LoginPage();
		l.login("standard_user", "secret_sauce");
		
		AddToCartPage a = new AddToCartPage();
		a.addtocart();
		TestUtil.Screenshot();
		
		
	}
	
	@AfterMethod
	public void close() {
		
		
		driver.quit();
	}

}
