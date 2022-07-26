package StepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition {
	
	WebDriver driver;
	@Given("^I launch the chrome browser and enter the url$")
	public void i_launch_the_chrome_browser_and_enter_the_url() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	  
	}

	@When("^I enter the username and password$")
	public void i_enter_the_username_and_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
	  
	}

	@When("^I click on login$")
	public void i_click_on_login() throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	   
	}

	@Then("^I am logged in successfully$")
	public void i_am_logged_in_successfully() throws Throwable {
		
		String Actual=driver.findElement(By.xpath("//span[@class='title']")).getText();
		
		assertEquals(Actual, "PRODUCTS");
	    
	}
	
	@When("^I add the item to cart$")
	public void i_add_the_item_to_cart() throws Throwable {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	  
	}

	@Then("^item is added to cart successfully$")
	public void item_is_added_to_cart_successfully() throws Throwable {
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	   
	}
	
	
	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	  
		driver.quit();
	}

	
	@Given("^I launch the chrome browser and enter the url \"([^\"]*)\"$")
	public void i_launch_the_chrome_browser_and_enter_the_url(String arg1) throws Throwable {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(arg1);
	    Thread.sleep(2000);
		
	}

	@Given("^I enter the username \"([^\"]*)\"  and password \"([^\"]*)\"$")
	public void i_enter_the_username_and_password(String arg1, String arg2) throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(arg1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg2);
	   
	}
	

}
