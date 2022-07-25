import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot_Ex {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(source, new File("S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\QA CLASS 13 SELENIUM METHODS\\src\\SCREENSHOTS\\screenshot.png"));
	
	      driver.quit();
	}

}
