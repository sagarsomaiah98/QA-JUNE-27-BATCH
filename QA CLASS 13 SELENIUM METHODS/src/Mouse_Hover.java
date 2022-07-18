import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/");
		
	WebElement menu=	driver.findElement(By.xpath("//a[@class='no_border'][contains(text(),'Tester’s Hub')]"));
	
	
	Actions a = new Actions(driver);
	
	  a.moveToElement(menu).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Sample Page Test']")).click();
		
		
	}

}
