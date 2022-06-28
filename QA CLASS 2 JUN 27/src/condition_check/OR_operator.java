package condition_check;

public class OR_operator {

	public static void main(String[] args) {
	
		int a=9;
		
		int b=3;
		
		
		if(a>b ||  a%2==0)// true ||   false
			
			System.out.println(a+ "is greater than "+b+" or "+a+" is even number");
		
		else
			
			System.out.println(a+ " is not greater than b"+" or "+a+"is odd number");
		
	}

}
