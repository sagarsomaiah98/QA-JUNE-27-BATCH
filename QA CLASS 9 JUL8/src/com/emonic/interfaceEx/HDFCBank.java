package com.emonic.interfaceEx;

public class HDFCBank implements CentralBank{

	public static void main(String[] args) {
		HDFCBank b= new HDFCBank();
		b.savings();
		b.loan();
		b.creditcard();

	}

	@Override
	public void savings() {
		System.out.println("HDFC bank saving interest rate is 4.5%");
		
	}

	@Override
	public void creditcard() {
		System.out.println("HDFC bank credit card charges is 100$");
		
	}

	@Override
	public void loan() {
	System.out.println("HDFC bank loan interest rated is 3.1%");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
