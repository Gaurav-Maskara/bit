package com.practice.binary.search;

public class SquareRootOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int sqrt(int A) {
		long low = 1;
		long high = A;
		
		while(low <= high) {
			long mid = (high+low)/2;
			if((mid*mid) == A) {
				return (int) mid;
			}else if((mid*mid) > A) {
				high = mid -1;
			}else {
				low = low+1;
			}
		}
		
		return (int) high;
	}

}
