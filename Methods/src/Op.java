
public class Op {
	
	public void add(int a, int b) {
		
		int c =a+b;
		
		System.out.println("Addition of two numbers "+a+" and "+b+" is "+c);
	}

	public static void main(String[] args) {
		
		Op o= new Op();
		o.add(20, 30);
		o.add(10, 90);
		o.add(96, 4);
		
	}

}
