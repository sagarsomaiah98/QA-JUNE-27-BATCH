import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/popups");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkbox']")).click();
	}

}
