package Assignments;

public class Switch_Ex {

	public static void main(String[] args)
	{
	
	int mark=80;
	int a=30;
	int b=50;
	int age=30;
	String name="Jane";
	
	switch(age)  // switch(90)
	
	{
	case 90:
		System.out.println("A Grade");
		System.out.println(" Good performance ");
		break;
	
	case 80:
		System.out.println("B Grade");
		
		break;
	case 70:
		System.out.println("C Grade");
		break;
	case 60:
		System.out.println("D Grade");
		break;
	default:
		System.out.println("Invalid ");

	}

}
}
