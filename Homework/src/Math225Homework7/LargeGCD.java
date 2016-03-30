package Math225Homework7;

import java.math.*;

public class LargeGCD {
	public LargeGCD() {
		super();
	}
	
	public void GCD(BigInteger a, BigInteger b){
		System.out.print(a +" ");
		System.out.print(b +" ");
		if (b.compareTo(new BigInteger("0")) != 0) { //Stops when b = 0
			BigInteger q = a.divide(b); //multiplier in a=b(q)+r
			System.out.print(q +" ");
			BigInteger r = a.subtract(b.multiply(q));//remainder
			System.out.println(r +" ");
			GCD(b,r);//recursion
		}
		else
			System.out.println("\n" + a);
//		BigInteger gcd = a.gcd(b);
//	    System.out.println(gcd.intValue());
	}
	
	public static void main(String args[]){
		LargeGCD l = new LargeGCD();
		BigInteger a = new BigInteger("456494612306467");
		BigInteger b = new BigInteger("646794864114");
		l.GCD(a, b);
	}
}
