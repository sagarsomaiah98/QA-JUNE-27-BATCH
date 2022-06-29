package Arrays;

public class Arr_Ex {

	public static void main(String[] args) {
		
		
//  datatype[] arrayname = new datatype[size/length]
		
	String[] stud =new String[5];
	
	stud[0]="Ram";
	stud[1]="bob";
	stud[2]="Jane";
	stud[4]="Kate";
	stud[3]="Dean";
	stud[2]="Lee";
	stud[3]="Julie";
	stud[1]="Bruce";
	stud[2]=stud[1];
	stud[1]=stud[3];
	stud[2]=stud[2];
	stud[4]=stud[1];
	
	
	System.out.println(stud[2]);
	System.out.println(stud[0]);
	System.out.println(stud[3]);
	System.out.println(stud[0]);
	System.out.println(stud[4]);
	System.out.println(stud[1]);
	
		
	}

}
