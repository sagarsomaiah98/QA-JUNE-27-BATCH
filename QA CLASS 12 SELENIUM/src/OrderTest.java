import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrderTest {
	
	public void order() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("sam");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("winchester");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("2145");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		String value= driver.findElement(By.xpath("//div[@class='complete-text']")).getText();
		System.out.println(value);
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		Thread.sleep(2000);
		
		driver.quit();

		
	}

	public static void main(String[] args) throws InterruptedException {
		
			OrderTest o = new OrderTest();
			o.order();
	}

}
