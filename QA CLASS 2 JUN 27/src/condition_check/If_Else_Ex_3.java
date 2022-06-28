package condition_check;

public class If_Else_Ex_3 {

	public static void main(String[] args) {
	
		
		int age=60;
		
		
		if(age>65)
			
		{
			System.out.println("Senior citizen");
		    System.out.println("Can avail free insurance");
		    System.out.println(" Eligible for free medi card");
		    System.out.println("Eligible for senior pension scheme");
		}
		else
		{
			System.out.println("Not a Senior citizen");
		    System.out.println("Cannot avail free insurance");
		    System.out.println(" Not Eligible for free medi card");
		    System.out.println("Not Eligible for senior pension scheme");
		}
	}

}
