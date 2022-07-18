import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public void login() throws InterruptedException {
	//launch chrome browser
		
		System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com");
	WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		
		username.sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		LoginTest l = new LoginTest();
		l.login();
		l.login();
		l.login();
		AddToCartTest a=new AddToCartTest();
		a.cart();
		
		LoginTest l2 = new LoginTest();
		l2.login();
		
		LogOutTest l1= new LogOutTest();
		l1.logout();
		
		OrderTest o = new OrderTest();
		o.order();
		
		Run r = new Run();
		r.method();
		
		
		
		
		

	}

}
