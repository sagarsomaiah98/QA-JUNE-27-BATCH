package com.emonics.assignment;

public class Find_PrimeNumber {
	
	
	public void findPrime(int value) 
	{
		int a=0;
	
		for(int i=1;i<=value;i++)
		{
		
			
			if(value%i==0)
				a++;
			
	   }
		
		if(a==2)
			System.out.println(value+" is a primenumber");
		else 
			System.out.println(value+" is not a primenumber");
				

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Find_PrimeNumber f= new Find_PrimeNumber();
		f.findPrime(41);
		f.findPrime(341);
		f.findPrime(412);
		f.findPrime(555);
		f.findPrime(612);
		f.findPrime(5645621);
      
	}

}
