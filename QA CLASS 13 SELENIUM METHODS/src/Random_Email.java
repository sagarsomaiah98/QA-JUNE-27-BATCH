
public class Random_Email {
	
	
	public static void random_email() 
	{
		
		char[] names= {'P','L','R','1','K','7','I','Q','S','A'};
		
		String email = "";
		
		
		for(int i=0;i<10;i++) 
		{
		int a=(int) (Math.random()*10);
		System.out.println(a);
	
		email=email+names[a];
		
		
		}
		email=email+"@hotmail.com";
		System.out.println(email);
		
	}

	public static void main(String[] args) {
		
		random_email();
	}

}
