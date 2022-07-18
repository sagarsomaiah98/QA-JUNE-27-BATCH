package com.janbask.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.janbask.pages.Login;
import com.janbask.testbase.TestBase;
import com.janbask.util.TestUtil;

public class LoginTest extends TestBase {
	
	@Test
	public void logintest() throws IOException {
		
		intialization();
		Login l = new Login();
		l.login("standard_user", "secret_sauce");
		TestUtil.Screenshot();
		
		
	}
	
	@Test
	public void invalidlogintest() throws IOException {
		intialization();
		Login l = new Login();
		l.login("standard_user", "secret_sauce1");
		TestUtil.Screenshot();
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}

}
