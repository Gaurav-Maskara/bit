package com.practice.binary.search;

public class ImplementPowerFunction {

	public static void main(String[] args) {

	}

	public int pow(int x, int n, int d) {
		
		double poweredValue = Math.pow(x, n);
		
		int remainder= (int) (poweredValue%d);
		
		if(remainder < 0) {
			remainder = remainder+d;
		}
		
		return remainder;
	}

}
