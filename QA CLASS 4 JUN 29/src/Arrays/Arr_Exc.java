package Arrays;

public class Arr_Exc {
	

	public static void main(String[] args) {
		
	  String j="Bob";
	  boolean g=false;
	
	  String[] stud_names=new String[5];
	  
	   stud_names[0]="Mark";
	   stud_names[1]="Kevin";
	   stud_names[2]="Julie";
	   stud_names[3]="Peter";
	   stud_names[4]="Jane";
	   
	   int a=stud_names.length;
	   
	 for(int i=0;i<a;i++) 
	 {
     
		 if(stud_names[i]==j) 
		 {
			 System.out.println(j +" found at index "+i);
			g=true;
		 }
		 else
			 g=false;
			 
		 
		 
	 }
	  if(!g)
		  System.out.println(j+ " not found");
	  
		
		

	}

}
