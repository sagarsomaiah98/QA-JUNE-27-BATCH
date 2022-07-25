package com.sauce.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static FileInputStream fs;
	public static Properties prop;
	public static WebDriver driver;
	
	public void intialization() throws IOException
	
	{
		
    fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CONFIG\\config.properties");
		
		 prop=new Properties();
		
		prop.load(fs);
		
		String bname=prop.getProperty("BROWSER");
		String url=prop.getProperty("URL");
		System.out.println(bname);
		System.out.println(url);
		
		if(bname.equals("CHROME")) 
		{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
			
		}
		else if(bname.equals("FIREFOX"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}
		else if(bname.equals("EDGE"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		
	}
	
	

}
