import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inner_Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames");
		
		WebElement f1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		
		
		Thread.sleep(3000);
		driver.switchTo().frame(f1);
		Thread.sleep(3000);
		WebElement f2=driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(f2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='a']")).click();

	}

}
