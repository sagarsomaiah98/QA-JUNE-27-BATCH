import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Ex {
	
	
	@Test
	public void method1() {
		System.out.println("calling method1");
		
	}
	@Test
	public void method2() {
		System.out.println("Calling method2");
		
	}

	@BeforeMethod
	public void method3() {
		
		System.out.println("calling method 3");
	}
	
	@AfterMethod
	public void methoda() {
		
		System.out.println("calling a method");
	}

	@BeforeTest
	public void A() {
		
		System.out.println("calling A");
	}

	
	@AfterTest
	public void S() {
		
		System.out.println("calling S");
	}
}
