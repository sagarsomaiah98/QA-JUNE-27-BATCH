import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.linkText("Privacy")).click();
		Thread.sleep(3000);
		
		Set<String> Window=driver.getWindowHandles();
		
		Iterator<String> it =Window.iterator();
	
		String parent =it.next();
		String child=it.next();
		
		System.out.println(parent);
		System.out.println(child);
		
		
		System.out.println(Window.size());
		
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//span[normalize-space()='Learn more']")).click();
		Thread.sleep(3000);
		
		
		

	}

}
