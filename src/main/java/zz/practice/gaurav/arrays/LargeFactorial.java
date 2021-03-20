package zz.practice.gaurav.arrays;

import java.math.BigInteger;

public class LargeFactorial {

	public static void main(String[] args) {

		LargeFactorial lf = new LargeFactorial();

		System.out.println(lf.solve(4));
		System.out.println(lf.factorial(4));

	}

	public String solve(int A) {
		BigInteger fact = BigInteger.ONE;

		for (int i = 2; i <= A; i++) {
			fact = fact.multiply(new BigInteger(String.valueOf(i)));
		}
		return fact.toString();
	}


    public int factorial(int n) {
    	int fact = 1 ;
    	for(int i = 1; i <=n ; i++) {
    		fact = fact*i;
    	}
    	return fact;
    }
    
    
    
}
