import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginParameter {
	
	public void login(String uname, String pwd) throws InterruptedException {
		//launch chrome browser
			
			System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.saucedemo.com");
			
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			
			driver.quit();
			
		}

	public static void main(String[] args) throws InterruptedException {

		LoginParameter l= new LoginParameter();
		l.login("standard_user", "secret_sauce");
		l.login("locked_out_user", "secret_sauce");
		l.login("problem_user", "secret_sauce");
		l.login("performance_glitch_user", "secret_sauce");
		
		

	}

}
