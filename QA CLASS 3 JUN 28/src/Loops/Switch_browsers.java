package Loops;

public class Switch_browsers {

	public static void main(String[] args) {
		
		String browser="FIREFOX";
		
		switch(browser) 
		{
		case "CHROME":
			System.out.println("launching the chrome browser");
			System.out.println("code to launch chrome browser");
			break;
			
		case "FIREFOX":
			System.out.println("launching the firefox browser");
		System.out.println("code to launch firefox browser");
		break;
		case "EDGE":
			System.out.println("launching the edge browser");
		System.out.println("code to launch edge browser");
		break;
		
		default:
			System.out.println("Invalid browser");
			
		
		}
		

	}

}
