package concat;

public class concat_Ex1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		String name="Joe";
		
		System.out.println(a+b+name);//    30Joe    
		
		System.out.println(a+name+b);// 10Joe20   
		
		System.out.println(name+a+b);// Joe1020
		
		System.out.println(name+(a+b));//Joe30 
		

	}

}
