package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;
import com.sauce.testutil.TestUtil;

public class LoginTest extends TestBase {
	
	@Test
	public void logintest() throws IOException 
	{
		intialization();
		LoginPage l = new LoginPage();
		l.login("standard_user", "secret_sauce");
		TestUtil.Screenshot();
		
		
	}
	
	@Test
	public void invalidlogintest() throws IOException 
	{
		intialization();
		LoginPage l = new LoginPage();
		l.login("user1", "secret_sauce");
		
		TestUtil.Screenshot();
		
		
	}
	
	@AfterMethod
	public void close() {
		
		
		driver.quit();
	}

}
