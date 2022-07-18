import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Filling {
	
	public static int random()
	{
	int a= (int) (Math.random()*10000);
		
		
		return a;
		
	}
	
	public void register() {
	
		String uname="Dustin"+random();
		
     System.setProperty("webdriver.chrome.driver", "S:\\EC\\WORKSPACE\\QA JUNE 27 BATCH\\DRIVERS\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
	
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Dustin");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Wayne");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("21 baker street");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("NSW");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("ANZ");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("1956");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("04123456");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("5145698");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
	}

	public static void main(String[] args) {
		Form_Filling f = new Form_Filling();
		f.register();

		

	}

}
