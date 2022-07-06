package com.emonics.parameter;

public class Add_Three_Numbers {

	
	public void  Add(int k, int m,int j,int s) 
	{
		
		int p=k+m;
		
		System.out.println("Addition of number "+k+" and "+m +" and "+j+" is "+p);
		
		
	}
	
public static void main(String args[]) {
	
	
		
		Add_Three_Numbers AObj= new Add_Three_Numbers();
         AObj.Add(8,3,5,2);
         AObj.Add(3, 10, 14,3);
         AObj.Add(7, 11, 19,6);

	}

}


