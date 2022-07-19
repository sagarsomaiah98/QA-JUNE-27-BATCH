

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest_MultipleUsers {
	
	
	
	public void login() throws InterruptedException {
		Xls_Reader xls= new Xls_Reader("S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\Excel_Parameterization1\\src\\TESTDATA\\SAUCE_LOGIN.xlsx");
        int rowCount=xls.getRowCount("SAUCE");
		for(int i=2;i<=rowCount;i++) {
			
			
			String uname= xls.getCellData("SAUCE", "USERNAME", i);
			String pwd= xls.getCellData("SAUCE", "PASSWORD", i);
			
			System.out.println(uname+"  "+pwd);
			
			
			System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			driver.quit();
			
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
	LoginTest_MultipleUsers l = new LoginTest_MultipleUsers();
	l.login();
		
		
		

	}

}
