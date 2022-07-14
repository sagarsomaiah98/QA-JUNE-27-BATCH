import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {
	
	public void logout() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

	public static void main(String[] args) throws InterruptedException {
		
	LogOutTest l = new LogOutTest();
	l.logout();

	}

}
