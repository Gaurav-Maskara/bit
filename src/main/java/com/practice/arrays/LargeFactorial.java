package com.practice.arrays;

import java.math.BigInteger;

public class LargeFactorial {

	public static void main(String[] args) {

		
		
		
	}

	public String solve(int A) {
	
	  BigInteger largeFactorial = new BigInteger("1");
		
	  for(int i = 1; i<=A; i++) {
		  largeFactorial= largeFactorial.multiply(new BigInteger(Integer.toString(i)));
	  }
	
	  return largeFactorial.toString();
	}

	
}
