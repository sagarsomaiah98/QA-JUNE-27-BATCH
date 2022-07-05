package com.emonics.returnKeyword;

public class SIP_Calculator {
	
	
	
	//M=pX({[1+i]n-1}/i)x(1+i)
	
		//	M is the amount you receive upon maturity
		//	P is the amount you invest at regular intervals
		//	n is the number of payments you have made
		//	i is the periodic rate of interest
	 public void  SIPCalc(int p, double i, int n) 
	 {
			 i=i/12/100; 
	
			int M= (int) (p*((Math.pow(1+i, n)-1)/i)*(1+i)); 
		 
		
		 
		System.out.println(M);
		 
		 
	 }
	

	public static void main(String[] args) {
		SIP_Calculator s = new SIP_Calculator();
		s.SIPCalc(5000, 18.0, 60);

	}

}
