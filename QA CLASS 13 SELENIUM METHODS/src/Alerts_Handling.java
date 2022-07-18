import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Handling {

	public static void main(String[] args) throws InterruptedException {
	//https://chercher.tech/practice/popups

		System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/popups");
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(3000);
		
		Alert a =driver.switchTo().alert(); // switch from browser to popup
		
		String value=a.getText();
		
		System.out.println(value);
		
		//a.accept(); // click OK
		
		a.dismiss(); // click cancel
	}

}
