package com.practice.strings;

import java.math.BigInteger;

public class Powerof2 {

	public static void main(String[] args) {

		Powerof2 powerof2 = new Powerof2();
		System.out.println(powerof2.power("128"));
		
	}

	public int power(String A) {
		
		BigInteger big = new BigInteger(A);
		boolean flag = true;
		
		
		while(flag) {
			BigInteger[] quotientAndRemainder = big.divideAndRemainder(new BigInteger("2"));
			
			if(!(quotientAndRemainder[1].compareTo(new BigInteger("0")) == 0)) {
				return 0;
			}
			big = quotientAndRemainder[0];
			if(quotientAndRemainder[0].compareTo(new BigInteger("1")) == 0) {
				flag = false;
			}
		}
		return 1;
	}

}
