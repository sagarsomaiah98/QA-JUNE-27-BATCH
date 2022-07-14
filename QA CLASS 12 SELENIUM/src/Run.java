import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {
	
	public void method() {
		System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		System.out.println("call run method ");
	}

	public static void main(String[] args) throws InterruptedException {
		
	Run r = new Run();
	r.method();
		
		
	}

}
