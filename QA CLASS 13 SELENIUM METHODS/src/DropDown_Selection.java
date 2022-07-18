import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Selection {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
	WebElement dropdown= driver.findElement(By.xpath("//select[@id='first']"));
		
		Select s = new Select(dropdown);
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		s.selectByValue("Google");
		
		Thread.sleep(2000);
		s.selectByVisibleText("Bing");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
