package com.janbask.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	FileInputStream f;
	Properties p ;
	public static WebDriver driver;
	
	public void intialization() throws IOException 
	{

		f= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\CONFIG\\config.properties");
		
		p= new Properties();
		
		p.load(f);
		
		
		String bname= p.getProperty("BROWSER");
		String url =p.getProperty("URL");
		String time= p.getProperty("TIMEOUT");
		
		System.out.println(bname);
		System.out.println(url);
		System.out.println(time);
		
		if(bname.equals("CHROME")) {
			
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
}
	

}
