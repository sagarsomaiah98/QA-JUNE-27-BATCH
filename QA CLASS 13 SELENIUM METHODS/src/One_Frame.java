import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One_Frame {

	public static void main(String[] args) throws InterruptedException {
//		///iframe[@id='frame3']
		
		
		System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames1.html");
		
		WebElement f1=driver.findElement(By.xpath("//iframe[@id='frame3']"));
		
		
		Thread.sleep(3000);
		driver.switchTo().frame(f1);
	
		driver.findElement(By.xpath("//input[@id='a']")).click();

	}

}
